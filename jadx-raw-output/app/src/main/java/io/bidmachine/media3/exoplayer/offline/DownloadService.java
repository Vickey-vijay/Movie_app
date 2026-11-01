package io.bidmachine.media3.exoplayer.offline;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.Log;
import io.bidmachine.media3.common.util.NotificationUtil;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.common.util.Util;
import io.bidmachine.media3.exoplayer.scheduler.Requirements;
import io.bidmachine.media3.exoplayer.scheduler.Scheduler;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
@UnstableApi
public abstract class DownloadService extends Service {
    public static final String ACTION_ADD_DOWNLOAD = "io.bidmachine.media3.exoplayer.downloadService.action.ADD_DOWNLOAD";
    public static final String ACTION_INIT = "io.bidmachine.media3.exoplayer.downloadService.action.INIT";
    public static final String ACTION_PAUSE_DOWNLOADS = "io.bidmachine.media3.exoplayer.downloadService.action.PAUSE_DOWNLOADS";
    public static final String ACTION_REMOVE_ALL_DOWNLOADS = "io.bidmachine.media3.exoplayer.downloadService.action.REMOVE_ALL_DOWNLOADS";
    public static final String ACTION_REMOVE_DOWNLOAD = "io.bidmachine.media3.exoplayer.downloadService.action.REMOVE_DOWNLOAD";
    private static final String ACTION_RESTART = "io.bidmachine.media3.exoplayer.downloadService.action.RESTART";
    public static final String ACTION_RESUME_DOWNLOADS = "io.bidmachine.media3.exoplayer.downloadService.action.RESUME_DOWNLOADS";
    public static final String ACTION_SET_REQUIREMENTS = "io.bidmachine.media3.exoplayer.downloadService.action.SET_REQUIREMENTS";
    public static final String ACTION_SET_STOP_REASON = "io.bidmachine.media3.exoplayer.downloadService.action.SET_STOP_REASON";
    public static final long DEFAULT_FOREGROUND_NOTIFICATION_UPDATE_INTERVAL = 1000;
    public static final int FOREGROUND_NOTIFICATION_ID_NONE = 0;
    public static final String KEY_CONTENT_ID = "content_id";
    public static final String KEY_DOWNLOAD_REQUEST = "download_request";
    public static final String KEY_FOREGROUND = "foreground";
    public static final String KEY_REQUIREMENTS = "requirements";
    public static final String KEY_STOP_REASON = "stop_reason";
    private static final String TAG = "DownloadService";
    private static final HashMap<Class<? extends DownloadService>, b> downloadManagerHelpers = new HashMap<>();

    @StringRes
    private final int channelDescriptionResourceId;

    @Nullable
    private final String channelId;

    @StringRes
    private final int channelNameResourceId;
    private b downloadManagerHelper;

    @Nullable
    private final c foregroundNotificationUpdater;
    private boolean isDestroyed;
    private boolean isStopped;
    private int lastStartId;
    private boolean startedInForeground;
    private boolean taskRemoved;

    public static final class b implements DownloadManager.Listener {
        private final Context context;
        private final DownloadManager downloadManager;

        @Nullable
        private DownloadService downloadService;
        private final boolean foregroundAllowed;
        private Requirements scheduledRequirements;

        @Nullable
        private final Scheduler scheduler;
        private final Class<? extends DownloadService> serviceClass;

        @Override // io.bidmachine.media3.exoplayer.offline.DownloadManager.Listener
        public /* bridge */ /* synthetic */ void onDownloadsPausedChanged(DownloadManager downloadManager, boolean z10) {
            super.onDownloadsPausedChanged(downloadManager, z10);
        }

        private b(Context context, DownloadManager downloadManager, boolean z10, @Nullable Scheduler scheduler, Class<? extends DownloadService> cls) {
            this.context = context;
            this.downloadManager = downloadManager;
            this.foregroundAllowed = z10;
            this.scheduler = scheduler;
            this.serviceClass = cls;
            downloadManager.addListener(this);
            updateScheduler();
        }

        private void cancelScheduler() {
            Requirements requirements = new Requirements(0);
            if (schedulerNeedsUpdate(requirements)) {
                this.scheduler.cancel();
                this.scheduledRequirements = requirements;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$attachService$0(DownloadService downloadService) {
            downloadService.notifyDownloads(this.downloadManager.getCurrentDownloads());
        }

        private void restartService() {
            if (this.foregroundAllowed) {
                try {
                    Util.startForegroundService(this.context, DownloadService.getIntent(this.context, this.serviceClass, DownloadService.ACTION_RESTART));
                    return;
                } catch (IllegalStateException unused) {
                    Log.w(DownloadService.TAG, "Failed to restart (foreground launch restriction)");
                    return;
                }
            }
            try {
                this.context.startService(DownloadService.getIntent(this.context, this.serviceClass, DownloadService.ACTION_INIT));
            } catch (IllegalStateException unused2) {
                Log.w(DownloadService.TAG, "Failed to restart (process is idle)");
            }
        }

        private boolean schedulerNeedsUpdate(Requirements requirements) {
            return !Util.areEqual(this.scheduledRequirements, requirements);
        }

        private boolean serviceMayNeedRestart() {
            DownloadService downloadService = this.downloadService;
            return downloadService == null || downloadService.isStopped();
        }

        public void attachService(final DownloadService downloadService) {
            Assertions.checkState(this.downloadService == null);
            this.downloadService = downloadService;
            if (this.downloadManager.isInitialized()) {
                Util.createHandlerForCurrentOrMainLooper().postAtFrontOfQueue(new Runnable() { // from class: mg.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f64529b.lambda$attachService$0(downloadService);
                    }
                });
            }
        }

        public void detachService(DownloadService downloadService) {
            Assertions.checkState(this.downloadService == downloadService);
            this.downloadService = null;
        }

        @Override // io.bidmachine.media3.exoplayer.offline.DownloadManager.Listener
        public void onDownloadChanged(DownloadManager downloadManager, Download download, @Nullable Exception exc) {
            DownloadService downloadService = this.downloadService;
            if (downloadService != null) {
                downloadService.notifyDownloadChanged(download);
            }
            if (serviceMayNeedRestart() && DownloadService.needsStartedService(download.state)) {
                Log.w(DownloadService.TAG, "DownloadService wasn't running. Restarting.");
                restartService();
            }
        }

        @Override // io.bidmachine.media3.exoplayer.offline.DownloadManager.Listener
        public void onDownloadRemoved(DownloadManager downloadManager, Download download) {
            DownloadService downloadService = this.downloadService;
            if (downloadService != null) {
                downloadService.notifyDownloadRemoved();
            }
        }

        @Override // io.bidmachine.media3.exoplayer.offline.DownloadManager.Listener
        public final void onIdle(DownloadManager downloadManager) {
            DownloadService downloadService = this.downloadService;
            if (downloadService != null) {
                downloadService.onIdle();
            }
        }

        @Override // io.bidmachine.media3.exoplayer.offline.DownloadManager.Listener
        public void onInitialized(DownloadManager downloadManager) {
            DownloadService downloadService = this.downloadService;
            if (downloadService != null) {
                downloadService.notifyDownloads(downloadManager.getCurrentDownloads());
            }
        }

        @Override // io.bidmachine.media3.exoplayer.offline.DownloadManager.Listener
        public void onWaitingForRequirementsChanged(DownloadManager downloadManager, boolean z10) {
            if (z10 || downloadManager.getDownloadsPaused() || !serviceMayNeedRestart()) {
                return;
            }
            List<Download> currentDownloads = downloadManager.getCurrentDownloads();
            for (int i10 = 0; i10 < currentDownloads.size(); i10++) {
                if (currentDownloads.get(i10).state == 0) {
                    restartService();
                    return;
                }
            }
        }

        public boolean updateScheduler() {
            boolean zIsWaitingForRequirements = this.downloadManager.isWaitingForRequirements();
            if (this.scheduler == null) {
                return !zIsWaitingForRequirements;
            }
            if (!zIsWaitingForRequirements) {
                cancelScheduler();
                return true;
            }
            Requirements requirements = this.downloadManager.getRequirements();
            if (!this.scheduler.getSupportedRequirements(requirements).equals(requirements)) {
                cancelScheduler();
                return false;
            }
            if (!schedulerNeedsUpdate(requirements)) {
                return true;
            }
            if (this.scheduler.schedule(requirements, this.context.getPackageName(), DownloadService.ACTION_RESTART)) {
                this.scheduledRequirements = requirements;
                return true;
            }
            Log.w(DownloadService.TAG, "Failed to schedule restart");
            cancelScheduler();
            return false;
        }

        @Override // io.bidmachine.media3.exoplayer.offline.DownloadManager.Listener
        public void onRequirementsStateChanged(DownloadManager downloadManager, Requirements requirements, int i10) {
            updateScheduler();
        }
    }

    public final class c {
        private final Handler handler = new Handler(Looper.getMainLooper());
        private boolean notificationDisplayed;
        private final int notificationId;
        private boolean periodicUpdatesStarted;
        private final long updateInterval;

        public void startPeriodicUpdates() {
            this.periodicUpdatesStarted = true;
            update();
        }

        public void stopPeriodicUpdates() {
            this.periodicUpdatesStarted = false;
            this.handler.removeCallbacksAndMessages(null);
        }

        public c(int i10, long j10) {
            this.notificationId = i10;
            this.updateInterval = j10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @SuppressLint({"InlinedApi"})
        public void update() {
            DownloadManager downloadManager = ((b) Assertions.checkNotNull(DownloadService.this.downloadManagerHelper)).downloadManager;
            Notification foregroundNotification = DownloadService.this.getForegroundNotification(downloadManager.getCurrentDownloads(), downloadManager.getNotMetRequirements());
            if (this.notificationDisplayed) {
                ((NotificationManager) DownloadService.this.getSystemService("notification")).notify(this.notificationId, foregroundNotification);
            } else {
                Util.setForegroundServiceNotification(DownloadService.this, this.notificationId, foregroundNotification, 1, "dataSync");
                this.notificationDisplayed = true;
            }
            if (this.periodicUpdatesStarted) {
                this.handler.removeCallbacksAndMessages(null);
                this.handler.postDelayed(new Runnable() { // from class: mg.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f64531b.update();
                    }
                }, this.updateInterval);
            }
        }

        public void invalidate() {
            if (this.notificationDisplayed) {
                update();
            }
        }

        public void showNotificationIfNotAlready() {
            if (this.notificationDisplayed) {
                return;
            }
            update();
        }
    }

    public DownloadService(int i10) {
        this(i10, 1000L);
    }

    public static Intent buildAddDownloadIntent(Context context, Class<? extends DownloadService> cls, DownloadRequest downloadRequest, boolean z10) {
        return buildAddDownloadIntent(context, cls, downloadRequest, 0, z10);
    }

    private static Intent getIntent(Context context, Class<? extends DownloadService> cls, String str, boolean z10) {
        return getIntent(context, cls, str).putExtra("foreground", z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean needsStartedService(int i10) {
        return i10 == 2 || i10 == 5 || i10 == 7;
    }

    public static void sendAddDownload(Context context, Class<? extends DownloadService> cls, DownloadRequest downloadRequest, boolean z10) {
        startService(context, buildAddDownloadIntent(context, cls, downloadRequest, z10), z10);
    }

    public abstract DownloadManager getDownloadManager();

    public abstract Notification getForegroundNotification(List<Download> list, int i10);

    @Nullable
    public abstract Scheduler getScheduler();

    @Override // android.app.Service
    public void onDestroy() {
        this.isDestroyed = true;
        ((b) Assertions.checkNotNull(this.downloadManagerHelper)).detachService(this);
        c cVar = this.foregroundNotificationUpdater;
        if (cVar != null) {
            cVar.stopPeriodicUpdates();
        }
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent intent) {
        this.taskRemoved = true;
    }

    public DownloadService(int i10, long j10) {
        this(i10, j10, null, 0, 0);
    }

    public static Intent buildAddDownloadIntent(Context context, Class<? extends DownloadService> cls, DownloadRequest downloadRequest, int i10, boolean z10) {
        return getIntent(context, cls, ACTION_ADD_DOWNLOAD, z10).putExtra("download_request", downloadRequest).putExtra("stop_reason", i10);
    }

    public static Intent buildPauseDownloadsIntent(Context context, Class<? extends DownloadService> cls, boolean z10) {
        return getIntent(context, cls, ACTION_PAUSE_DOWNLOADS, z10);
    }

    public static Intent buildRemoveAllDownloadsIntent(Context context, Class<? extends DownloadService> cls, boolean z10) {
        return getIntent(context, cls, ACTION_REMOVE_ALL_DOWNLOADS, z10);
    }

    public static Intent buildRemoveDownloadIntent(Context context, Class<? extends DownloadService> cls, String str, boolean z10) {
        return getIntent(context, cls, ACTION_REMOVE_DOWNLOAD, z10).putExtra("content_id", str);
    }

    public static Intent buildResumeDownloadsIntent(Context context, Class<? extends DownloadService> cls, boolean z10) {
        return getIntent(context, cls, ACTION_RESUME_DOWNLOADS, z10);
    }

    public static Intent buildSetRequirementsIntent(Context context, Class<? extends DownloadService> cls, Requirements requirements, boolean z10) {
        return getIntent(context, cls, ACTION_SET_REQUIREMENTS, z10).putExtra("requirements", requirements);
    }

    public static Intent buildSetStopReasonIntent(Context context, Class<? extends DownloadService> cls, @Nullable String str, int i10, boolean z10) {
        return getIntent(context, cls, ACTION_SET_STOP_REASON, z10).putExtra("content_id", str).putExtra("stop_reason", i10);
    }

    public static void clearDownloadManagerHelpers() {
        downloadManagerHelpers.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Intent getIntent(Context context, Class<? extends DownloadService> cls, String str) {
        return new Intent(context, cls).setAction(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isStopped() {
        return this.isStopped;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyDownloadChanged(Download download) {
        if (this.foregroundNotificationUpdater != null) {
            if (needsStartedService(download.state)) {
                this.foregroundNotificationUpdater.startPeriodicUpdates();
            } else {
                this.foregroundNotificationUpdater.invalidate();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyDownloadRemoved() {
        c cVar = this.foregroundNotificationUpdater;
        if (cVar != null) {
            cVar.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyDownloads(List<Download> list) {
        if (this.foregroundNotificationUpdater != null) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                if (needsStartedService(list.get(i10).state)) {
                    this.foregroundNotificationUpdater.startPeriodicUpdates();
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onIdle() {
        c cVar = this.foregroundNotificationUpdater;
        if (cVar != null) {
            cVar.stopPeriodicUpdates();
        }
        if (((b) Assertions.checkNotNull(this.downloadManagerHelper)).updateScheduler()) {
            if (Util.SDK_INT >= 28 || !this.taskRemoved) {
                this.isStopped |= stopSelfResult(this.lastStartId);
            } else {
                stopSelf();
                this.isStopped = true;
            }
        }
    }

    public static void start(Context context, Class<? extends DownloadService> cls) {
        context.startService(getIntent(context, cls, ACTION_INIT));
    }

    public static void startForeground(Context context, Class<? extends DownloadService> cls) {
        Util.startForegroundService(context, getIntent(context, cls, ACTION_INIT, true));
    }

    private static void startService(Context context, Intent intent, boolean z10) {
        if (z10) {
            Util.startForegroundService(context, intent);
        } else {
            context.startService(intent);
        }
    }

    public final void invalidateForegroundNotification() {
        c cVar = this.foregroundNotificationUpdater;
        if (cVar == null || this.isDestroyed) {
            return;
        }
        cVar.invalidate();
    }

    @Override // android.app.Service
    @Nullable
    public final IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException();
    }

    @Override // android.app.Service
    public void onCreate() {
        String str = this.channelId;
        if (str != null) {
            NotificationUtil.createNotificationChannel(this, str, this.channelNameResourceId, this.channelDescriptionResourceId, 2);
        }
        Class<?> cls = getClass();
        HashMap<Class<? extends DownloadService>, b> map = downloadManagerHelpers;
        b bVar = map.get(cls);
        if (bVar == null) {
            boolean z10 = this.foregroundNotificationUpdater != null;
            Scheduler scheduler = (z10 && (Util.SDK_INT < 31)) ? getScheduler() : null;
            DownloadManager downloadManager = getDownloadManager();
            downloadManager.resumeDownloads();
            bVar = new b(getApplicationContext(), downloadManager, z10, scheduler, cls);
            map.put((Class<? extends DownloadService>) cls, bVar);
        }
        this.downloadManagerHelper = bVar;
        bVar.attachService(this);
    }

    @Override // android.app.Service
    public int onStartCommand(@Nullable Intent intent, int i10, int i11) {
        String stringExtra;
        c cVar;
        this.lastStartId = i11;
        this.taskRemoved = false;
        String action = null;
        if (intent != null) {
            action = intent.getAction();
            stringExtra = intent.getStringExtra("content_id");
            this.startedInForeground |= intent.getBooleanExtra("foreground", false) || ACTION_RESTART.equals(action);
        } else {
            stringExtra = null;
        }
        if (action == null) {
            action = ACTION_INIT;
        }
        DownloadManager downloadManager = ((b) Assertions.checkNotNull(this.downloadManagerHelper)).downloadManager;
        switch (action) {
            case "io.bidmachine.media3.exoplayer.downloadService.action.ADD_DOWNLOAD":
                DownloadRequest downloadRequest = (DownloadRequest) ((Intent) Assertions.checkNotNull(intent)).getParcelableExtra("download_request");
                if (downloadRequest != null) {
                    downloadManager.addDownload(downloadRequest, intent.getIntExtra("stop_reason", 0));
                    break;
                } else {
                    Log.e(TAG, "Ignored ADD_DOWNLOAD: Missing download_request extra");
                    break;
                }
                break;
            case "io.bidmachine.media3.exoplayer.downloadService.action.PAUSE_DOWNLOADS":
                downloadManager.pauseDownloads();
                break;
            case "io.bidmachine.media3.exoplayer.downloadService.action.RESUME_DOWNLOADS":
                downloadManager.resumeDownloads();
                break;
            case "io.bidmachine.media3.exoplayer.downloadService.action.SET_STOP_REASON":
                if (!((Intent) Assertions.checkNotNull(intent)).hasExtra("stop_reason")) {
                    Log.e(TAG, "Ignored SET_STOP_REASON: Missing stop_reason extra");
                    break;
                } else {
                    downloadManager.setStopReason(stringExtra, intent.getIntExtra("stop_reason", 0));
                    break;
                }
                break;
            case "io.bidmachine.media3.exoplayer.downloadService.action.REMOVE_ALL_DOWNLOADS":
                downloadManager.removeAllDownloads();
                break;
            case "io.bidmachine.media3.exoplayer.downloadService.action.RESTART":
            case "io.bidmachine.media3.exoplayer.downloadService.action.INIT":
                break;
            case "io.bidmachine.media3.exoplayer.downloadService.action.SET_REQUIREMENTS":
                Requirements requirements = (Requirements) ((Intent) Assertions.checkNotNull(intent)).getParcelableExtra("requirements");
                if (requirements != null) {
                    downloadManager.setRequirements(requirements);
                    break;
                } else {
                    Log.e(TAG, "Ignored SET_REQUIREMENTS: Missing requirements extra");
                    break;
                }
                break;
            case "io.bidmachine.media3.exoplayer.downloadService.action.REMOVE_DOWNLOAD":
                if (stringExtra != null) {
                    downloadManager.removeDownload(stringExtra);
                    break;
                } else {
                    Log.e(TAG, "Ignored REMOVE_DOWNLOAD: Missing content_id extra");
                    break;
                }
                break;
            default:
                Log.e(TAG, "Ignored unrecognized action: " + action);
                break;
        }
        if (Util.SDK_INT >= 26 && this.startedInForeground && (cVar = this.foregroundNotificationUpdater) != null) {
            cVar.showNotificationIfNotAlready();
        }
        this.isStopped = false;
        if (downloadManager.isIdle()) {
            onIdle();
        }
        return 1;
    }

    public DownloadService(int i10, long j10, @Nullable String str, @StringRes int i11, @StringRes int i12) {
        if (i10 == 0) {
            this.foregroundNotificationUpdater = null;
            this.channelId = null;
            this.channelNameResourceId = 0;
            this.channelDescriptionResourceId = 0;
            return;
        }
        this.foregroundNotificationUpdater = new c(i10, j10);
        this.channelId = str;
        this.channelNameResourceId = i11;
        this.channelDescriptionResourceId = i12;
    }

    public static void sendAddDownload(Context context, Class<? extends DownloadService> cls, DownloadRequest downloadRequest, int i10, boolean z10) {
        startService(context, buildAddDownloadIntent(context, cls, downloadRequest, i10, z10), z10);
    }

    public static void sendPauseDownloads(Context context, Class<? extends DownloadService> cls, boolean z10) {
        startService(context, buildPauseDownloadsIntent(context, cls, z10), z10);
    }

    public static void sendRemoveAllDownloads(Context context, Class<? extends DownloadService> cls, boolean z10) {
        startService(context, buildRemoveAllDownloadsIntent(context, cls, z10), z10);
    }

    public static void sendRemoveDownload(Context context, Class<? extends DownloadService> cls, String str, boolean z10) {
        startService(context, buildRemoveDownloadIntent(context, cls, str, z10), z10);
    }

    public static void sendResumeDownloads(Context context, Class<? extends DownloadService> cls, boolean z10) {
        startService(context, buildResumeDownloadsIntent(context, cls, z10), z10);
    }

    public static void sendSetRequirements(Context context, Class<? extends DownloadService> cls, Requirements requirements, boolean z10) {
        startService(context, buildSetRequirementsIntent(context, cls, requirements, z10), z10);
    }

    public static void sendSetStopReason(Context context, Class<? extends DownloadService> cls, @Nullable String str, int i10, boolean z10) {
        startService(context, buildSetStopReasonIntent(context, cls, str, i10, z10), z10);
    }
}
