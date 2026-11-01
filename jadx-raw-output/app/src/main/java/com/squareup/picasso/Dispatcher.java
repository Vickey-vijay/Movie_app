package com.squareup.picasso;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes7.dex */
class Dispatcher {
    public static final int AIRPLANE_MODE_CHANGE = 10;
    private static final int AIRPLANE_MODE_OFF = 0;
    private static final int AIRPLANE_MODE_ON = 1;
    private static final int BATCH_DELAY = 200;
    private static final String DISPATCHER_THREAD_NAME = "Dispatcher";
    public static final int HUNTER_BATCH_COMPLETE = 8;
    public static final int HUNTER_COMPLETE = 4;
    public static final int HUNTER_DECODE_FAILED = 6;
    public static final int HUNTER_DELAY_NEXT_BATCH = 7;
    public static final int HUNTER_RETRY = 5;
    public static final int NETWORK_STATE_CHANGE = 9;
    public static final int REQUEST_BATCH_RESUME = 13;
    public static final int REQUEST_CANCEL = 2;
    public static final int REQUEST_GCED = 3;
    public static final int REQUEST_SUBMIT = 1;
    private static final int RETRY_DELAY = 500;
    public static final int TAG_PAUSE = 11;
    public static final int TAG_RESUME = 12;
    public boolean airplaneMode;
    public final List<BitmapHunter> batch;
    public final Cache cache;
    public final Context context;
    public final DispatcherThread dispatcherThread;
    public final Downloader downloader;
    public final Map<Object, Action> failedActions;
    public final Handler handler;
    public final Map<String, BitmapHunter> hunterMap;
    public final Handler mainThreadHandler;
    public final Map<Object, Action> pausedActions;
    public final Set<Object> pausedTags;
    public final NetworkBroadcastReceiver receiver;
    public final boolean scansNetworkChanges;
    public final ExecutorService service;
    public final Stats stats;

    public static class DispatcherHandler extends Handler {
        private final Dispatcher dispatcher;

        @Override // android.os.Handler
        public void handleMessage(final Message message) {
            switch (message.what) {
                case 1:
                    this.dispatcher.performSubmit((Action) message.obj);
                    break;
                case 2:
                    this.dispatcher.performCancel((Action) message.obj);
                    break;
                case 3:
                case 8:
                default:
                    Picasso.HANDLER.post(new Runnable() { // from class: com.squareup.picasso.Dispatcher.DispatcherHandler.1
                        @Override // java.lang.Runnable
                        public void run() {
                            throw new AssertionError("Unknown handler message received: " + message.what);
                        }
                    });
                    break;
                case 4:
                    this.dispatcher.performComplete((BitmapHunter) message.obj);
                    break;
                case 5:
                    this.dispatcher.performRetry((BitmapHunter) message.obj);
                    break;
                case 6:
                    this.dispatcher.performError((BitmapHunter) message.obj, false);
                    break;
                case 7:
                    this.dispatcher.performBatchComplete();
                    break;
                case 9:
                    this.dispatcher.performNetworkStateChange((NetworkInfo) message.obj);
                    break;
                case 10:
                    this.dispatcher.performAirplaneModeChange(message.arg1 == 1);
                    break;
                case 11:
                    this.dispatcher.performPauseTag(message.obj);
                    break;
                case 12:
                    this.dispatcher.performResumeTag(message.obj);
                    break;
            }
        }

        public DispatcherHandler(Looper looper, Dispatcher dispatcher) {
            super(looper);
            this.dispatcher = dispatcher;
        }
    }

    public static class DispatcherThread extends HandlerThread {
        public DispatcherThread() {
            super("Picasso-Dispatcher", 10);
        }
    }

    public static class NetworkBroadcastReceiver extends BroadcastReceiver {
        public static final String EXTRA_AIRPLANE_STATE = "state";
        private final Dispatcher dispatcher;

        @Override // android.content.BroadcastReceiver
        @SuppressLint({"MissingPermission"})
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            String action = intent.getAction();
            if ("android.intent.action.AIRPLANE_MODE".equals(action)) {
                if (intent.hasExtra("state")) {
                    this.dispatcher.dispatchAirplaneModeChange(intent.getBooleanExtra("state", false));
                }
            } else if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
                this.dispatcher.dispatchNetworkStateChange(((ConnectivityManager) Utils.getService(context, "connectivity")).getActiveNetworkInfo());
            }
        }

        public void register() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.AIRPLANE_MODE");
            if (this.dispatcher.scansNetworkChanges) {
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            }
            this.dispatcher.context.registerReceiver(this, intentFilter);
        }

        public void unregister() {
            this.dispatcher.context.unregisterReceiver(this);
        }

        public NetworkBroadcastReceiver(Dispatcher dispatcher) {
            this.dispatcher = dispatcher;
        }
    }

    private void markForReplay(BitmapHunter bitmapHunter) {
        Action action = bitmapHunter.getAction();
        if (action != null) {
            markForReplay(action);
        }
        List<Action> actions = bitmapHunter.getActions();
        if (actions != null) {
            int size = actions.size();
            for (int i10 = 0; i10 < size; i10++) {
                markForReplay(actions.get(i10));
            }
        }
    }

    public void performSubmit(Action action) {
        performSubmit(action, true);
    }

    private void flushFailedActions() {
        if (this.failedActions.isEmpty()) {
            return;
        }
        Iterator<Action> it = this.failedActions.values().iterator();
        while (it.hasNext()) {
            Action next = it.next();
            it.remove();
            if (next.getPicasso().loggingEnabled) {
                Utils.log("Dispatcher", Utils.VERB_REPLAYING, next.getRequest().logId());
            }
            performSubmit(next, false);
        }
    }

    private void logBatch(List<BitmapHunter> list) {
        if (list == null || list.isEmpty() || !list.get(0).getPicasso().loggingEnabled) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        for (BitmapHunter bitmapHunter : list) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            sb2.append(Utils.getLogIdsForHunter(bitmapHunter));
        }
        Utils.log("Dispatcher", Utils.VERB_DELIVERED, sb2.toString());
    }

    public void dispatchAirplaneModeChange(boolean z10) {
        Handler handler = this.handler;
        handler.sendMessage(handler.obtainMessage(10, z10 ? 1 : 0, 0));
    }

    public void dispatchCancel(Action action) {
        Handler handler = this.handler;
        handler.sendMessage(handler.obtainMessage(2, action));
    }

    public void dispatchComplete(BitmapHunter bitmapHunter) {
        Handler handler = this.handler;
        handler.sendMessage(handler.obtainMessage(4, bitmapHunter));
    }

    public void dispatchFailed(BitmapHunter bitmapHunter) {
        Handler handler = this.handler;
        handler.sendMessage(handler.obtainMessage(6, bitmapHunter));
    }

    public void dispatchNetworkStateChange(NetworkInfo networkInfo) {
        Handler handler = this.handler;
        handler.sendMessage(handler.obtainMessage(9, networkInfo));
    }

    public void dispatchPauseTag(Object obj) {
        Handler handler = this.handler;
        handler.sendMessage(handler.obtainMessage(11, obj));
    }

    public void dispatchResumeTag(Object obj) {
        Handler handler = this.handler;
        handler.sendMessage(handler.obtainMessage(12, obj));
    }

    public void dispatchRetry(BitmapHunter bitmapHunter) {
        Handler handler = this.handler;
        handler.sendMessageDelayed(handler.obtainMessage(5, bitmapHunter), 500L);
    }

    public void dispatchSubmit(Action action) {
        Handler handler = this.handler;
        handler.sendMessage(handler.obtainMessage(1, action));
    }

    public void performAirplaneModeChange(boolean z10) {
        this.airplaneMode = z10;
    }

    public void performBatchComplete() {
        ArrayList arrayList = new ArrayList(this.batch);
        this.batch.clear();
        Handler handler = this.mainThreadHandler;
        handler.sendMessage(handler.obtainMessage(8, arrayList));
        logBatch(arrayList);
    }

    public void performNetworkStateChange(NetworkInfo networkInfo) {
        ExecutorService executorService = this.service;
        if (executorService instanceof PicassoExecutorService) {
            ((PicassoExecutorService) executorService).adjustThreadCount(networkInfo);
        }
        if (networkInfo == null || !networkInfo.isConnected()) {
            return;
        }
        flushFailedActions();
    }

    public void performPauseTag(Object obj) {
        if (this.pausedTags.add(obj)) {
            Iterator<BitmapHunter> it = this.hunterMap.values().iterator();
            while (it.hasNext()) {
                BitmapHunter next = it.next();
                boolean z10 = next.getPicasso().loggingEnabled;
                Action action = next.getAction();
                List<Action> actions = next.getActions();
                boolean z11 = (actions == null || actions.isEmpty()) ? false : true;
                if (action != null || z11) {
                    if (action != null && action.getTag().equals(obj)) {
                        next.detach(action);
                        this.pausedActions.put(action.getTarget(), action);
                        if (z10) {
                            Utils.log("Dispatcher", "paused", action.request.logId(), "because tag '" + obj + "' was paused");
                        }
                    }
                    if (z11) {
                        for (int size = actions.size() - 1; size >= 0; size--) {
                            Action action2 = actions.get(size);
                            if (action2.getTag().equals(obj)) {
                                next.detach(action2);
                                this.pausedActions.put(action2.getTarget(), action2);
                                if (z10) {
                                    Utils.log("Dispatcher", "paused", action2.request.logId(), "because tag '" + obj + "' was paused");
                                }
                            }
                        }
                    }
                    if (next.cancel()) {
                        it.remove();
                        if (z10) {
                            Utils.log("Dispatcher", Utils.VERB_CANCELED, Utils.getLogIdsForHunter(next), "all actions paused");
                        }
                    }
                }
            }
        }
    }

    public void performResumeTag(Object obj) {
        if (this.pausedTags.remove(obj)) {
            ArrayList arrayList = null;
            Iterator<Action> it = this.pausedActions.values().iterator();
            while (it.hasNext()) {
                Action next = it.next();
                if (next.getTag().equals(obj)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(next);
                    it.remove();
                }
            }
            if (arrayList != null) {
                Handler handler = this.mainThreadHandler;
                handler.sendMessage(handler.obtainMessage(13, arrayList));
            }
        }
    }

    public void performSubmit(Action action, boolean z10) {
        if (this.pausedTags.contains(action.getTag())) {
            this.pausedActions.put(action.getTarget(), action);
            if (action.getPicasso().loggingEnabled) {
                Utils.log("Dispatcher", "paused", action.request.logId(), "because tag '" + action.getTag() + "' is paused");
                return;
            }
            return;
        }
        BitmapHunter bitmapHunter = this.hunterMap.get(action.getKey());
        if (bitmapHunter != null) {
            bitmapHunter.attach(action);
            return;
        }
        if (this.service.isShutdown()) {
            if (action.getPicasso().loggingEnabled) {
                Utils.log("Dispatcher", Utils.VERB_IGNORED, action.request.logId(), "because shut down");
                return;
            }
            return;
        }
        BitmapHunter bitmapHunterForRequest = BitmapHunter.forRequest(action.getPicasso(), this, this.cache, this.stats, action);
        bitmapHunterForRequest.future = this.service.submit(bitmapHunterForRequest);
        this.hunterMap.put(action.getKey(), bitmapHunterForRequest);
        if (z10) {
            this.failedActions.remove(action.getTarget());
        }
        if (action.getPicasso().loggingEnabled) {
            Utils.log("Dispatcher", Utils.VERB_ENQUEUED, action.request.logId());
        }
    }

    public void shutdown() {
        ExecutorService executorService = this.service;
        if (executorService instanceof PicassoExecutorService) {
            executorService.shutdown();
        }
        this.downloader.shutdown();
        this.dispatcherThread.quit();
        Picasso.HANDLER.post(new Runnable() { // from class: com.squareup.picasso.Dispatcher.1
            @Override // java.lang.Runnable
            public void run() {
                Dispatcher.this.receiver.unregister();
            }
        });
    }

    public Dispatcher(Context context, ExecutorService executorService, Handler handler, Downloader downloader, Cache cache, Stats stats) {
        DispatcherThread dispatcherThread = new DispatcherThread();
        this.dispatcherThread = dispatcherThread;
        dispatcherThread.start();
        Utils.flushStackLocalLeaks(dispatcherThread.getLooper());
        this.context = context;
        this.service = executorService;
        this.hunterMap = new LinkedHashMap();
        this.failedActions = new WeakHashMap();
        this.pausedActions = new WeakHashMap();
        this.pausedTags = new LinkedHashSet();
        this.handler = new DispatcherHandler(dispatcherThread.getLooper(), this);
        this.downloader = downloader;
        this.mainThreadHandler = handler;
        this.cache = cache;
        this.stats = stats;
        this.batch = new ArrayList(4);
        this.airplaneMode = Utils.isAirplaneModeOn(context);
        this.scansNetworkChanges = Utils.hasPermission(context, "android.permission.ACCESS_NETWORK_STATE");
        NetworkBroadcastReceiver networkBroadcastReceiver = new NetworkBroadcastReceiver(this);
        this.receiver = networkBroadcastReceiver;
        networkBroadcastReceiver.register();
    }

    private void batch(BitmapHunter bitmapHunter) {
        if (bitmapHunter.isCancelled()) {
            return;
        }
        Bitmap bitmap = bitmapHunter.result;
        if (bitmap != null) {
            bitmap.prepareToDraw();
        }
        this.batch.add(bitmapHunter);
        if (!this.handler.hasMessages(7)) {
            this.handler.sendEmptyMessageDelayed(7, 200L);
        }
    }

    public void performCancel(Action action) {
        String key = action.getKey();
        BitmapHunter bitmapHunter = this.hunterMap.get(key);
        if (bitmapHunter != null) {
            bitmapHunter.detach(action);
            if (bitmapHunter.cancel()) {
                this.hunterMap.remove(key);
                if (action.getPicasso().loggingEnabled) {
                    Utils.log("Dispatcher", Utils.VERB_CANCELED, action.getRequest().logId());
                }
            }
        }
        if (this.pausedTags.contains(action.getTag())) {
            this.pausedActions.remove(action.getTarget());
            if (action.getPicasso().loggingEnabled) {
                Utils.log("Dispatcher", Utils.VERB_CANCELED, action.getRequest().logId(), "because paused request got canceled");
            }
        }
        Action actionRemove = this.failedActions.remove(action.getTarget());
        if (actionRemove != null && actionRemove.getPicasso().loggingEnabled) {
            Utils.log("Dispatcher", Utils.VERB_CANCELED, actionRemove.getRequest().logId(), "from replaying");
        }
    }

    public void performComplete(BitmapHunter bitmapHunter) {
        if (MemoryPolicy.shouldWriteToMemoryCache(bitmapHunter.getMemoryPolicy())) {
            this.cache.set(bitmapHunter.getKey(), bitmapHunter.getResult());
        }
        this.hunterMap.remove(bitmapHunter.getKey());
        batch(bitmapHunter);
        if (bitmapHunter.getPicasso().loggingEnabled) {
            Utils.log("Dispatcher", Utils.VERB_BATCHED, Utils.getLogIdsForHunter(bitmapHunter), "for completion");
        }
    }

    public void performError(BitmapHunter bitmapHunter, boolean z10) {
        String str;
        if (bitmapHunter.getPicasso().loggingEnabled) {
            String logIdsForHunter = Utils.getLogIdsForHunter(bitmapHunter);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("for error");
            if (z10) {
                str = " (will replay)";
            } else {
                str = "";
            }
            sb2.append(str);
            Utils.log("Dispatcher", Utils.VERB_BATCHED, logIdsForHunter, sb2.toString());
        }
        this.hunterMap.remove(bitmapHunter.getKey());
        batch(bitmapHunter);
    }

    @SuppressLint({"MissingPermission"})
    public void performRetry(BitmapHunter bitmapHunter) {
        if (bitmapHunter.isCancelled()) {
            return;
        }
        boolean z10 = false;
        if (this.service.isShutdown()) {
            performError(bitmapHunter, false);
            return;
        }
        NetworkInfo activeNetworkInfo = null;
        if (this.scansNetworkChanges) {
            activeNetworkInfo = ((ConnectivityManager) Utils.getService(this.context, "connectivity")).getActiveNetworkInfo();
        }
        if (bitmapHunter.shouldRetry(this.airplaneMode, activeNetworkInfo)) {
            if (bitmapHunter.getPicasso().loggingEnabled) {
                Utils.log("Dispatcher", Utils.VERB_RETRYING, Utils.getLogIdsForHunter(bitmapHunter));
            }
            if (bitmapHunter.getException() instanceof NetworkRequestHandler.ContentLengthException) {
                bitmapHunter.networkPolicy |= NetworkPolicy.NO_CACHE.index;
            }
            bitmapHunter.future = this.service.submit(bitmapHunter);
            return;
        }
        if (this.scansNetworkChanges && bitmapHunter.supportsReplay()) {
            z10 = true;
        }
        performError(bitmapHunter, z10);
        if (z10) {
            markForReplay(bitmapHunter);
        }
    }

    private void markForReplay(Action action) {
        Object target = action.getTarget();
        if (target != null) {
            action.willReplay = true;
            this.failedActions.put(target, action);
        }
    }
}
