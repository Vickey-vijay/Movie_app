package com.applovin.impl.sdk;

import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public class AppLovinBroadcastManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map f9061a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f9062b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ArrayList f9063c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Handler f9064d = new a(Looper.getMainLooper());

    public interface Receiver {
        void onReceive(Intent intent, @Nullable Map<String, Object> map);
    }

    public class a extends Handler {
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 1) {
                AppLovinBroadcastManager.b();
            } else {
                super.handleMessage(message);
            }
        }

        public a(Looper looper) {
            super(looper);
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Intent f9065a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map f9066b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f9067c;

        public b(Intent intent, Map map, List list) {
            this.f9065a = intent;
            this.f9066b = map;
            this.f9067c = list;
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final IntentFilter f9068a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Receiver f9069b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f9070c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f9071d;

        public c(IntentFilter intentFilter, Receiver receiver) {
            this.f9068a = intentFilter;
            this.f9069b = receiver;
        }
    }

    private static List a(Intent intent) {
        synchronized (f9061a) {
            String action = intent.getAction();
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set<String> categories = intent.getCategories();
            List<c> list = (List) f9062b.get(action);
            if (list == null) {
                return null;
            }
            ArrayList arrayList = null;
            for (c cVar : list) {
                if (!cVar.f9070c && cVar.f9068a.match(action, null, scheme, data, categories, "AppLovinBroadcastManager") >= 0) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(cVar);
                    cVar.f9070c = true;
                }
            }
            if (arrayList == null) {
                return null;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((c) it.next()).f9070c = false;
            }
            return arrayList;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b() {
        int size;
        b[] bVarArr;
        while (true) {
            synchronized (f9061a) {
                ArrayList arrayList = f9063c;
                size = arrayList.size();
                if (size <= 0) {
                    return;
                }
                bVarArr = new b[size];
                arrayList.toArray(bVarArr);
                arrayList.clear();
            }
            for (int i10 = 0; i10 < size; i10++) {
                b bVar = bVarArr[i10];
                if (bVar != null) {
                    for (c cVar : bVar.f9067c) {
                        if (cVar != null && !cVar.f9071d) {
                            cVar.f9069b.onReceive(bVar.f9065a, bVar.f9066b);
                        }
                    }
                }
            }
        }
    }

    public static void registerReceiver(Receiver receiver, IntentFilter intentFilter) {
        Map map = f9061a;
        synchronized (map) {
            c cVar = new c(intentFilter, receiver);
            ArrayList arrayList = (ArrayList) map.get(receiver);
            if (arrayList == null) {
                arrayList = new ArrayList(1);
                map.put(receiver, arrayList);
            }
            arrayList.add(cVar);
            Iterator<String> itActionsIterator = intentFilter.actionsIterator();
            while (itActionsIterator.hasNext()) {
                String next = itActionsIterator.next();
                Map map2 = f9062b;
                ArrayList arrayList2 = (ArrayList) map2.get(next);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList(1);
                    map2.put(next, arrayList2);
                }
                arrayList2.add(cVar);
            }
        }
    }

    public static boolean sendBroadcast(Intent intent, @Nullable Map<String, Object> map) {
        synchronized (f9061a) {
            List listA = a(intent);
            if (listA == null) {
                return false;
            }
            f9063c.add(new b(intent, map, listA));
            Handler handler = f9064d;
            if (!handler.hasMessages(1)) {
                handler.sendEmptyMessage(1);
            }
            return true;
        }
    }

    public static boolean sendBroadcastWithAdObject(String str, Object obj) {
        HashMap map = new HashMap(1);
        map.put("ad", obj);
        return sendBroadcast(new Intent(str), map);
    }

    public static void unregisterReceiver(Receiver receiver) {
        Map map = f9061a;
        synchronized (map) {
            List<c> list = (List) map.remove(receiver);
            if (list == null) {
                return;
            }
            for (c cVar : list) {
                cVar.f9071d = true;
                Iterator<String> itActionsIterator = cVar.f9068a.actionsIterator();
                while (itActionsIterator.hasNext()) {
                    String next = itActionsIterator.next();
                    List list2 = (List) f9062b.get(next);
                    if (list2 != null) {
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            if (((c) it.next()).f9069b == receiver) {
                                cVar.f9071d = true;
                                it.remove();
                            }
                        }
                        if (list2.size() <= 0) {
                            f9062b.remove(next);
                        }
                    }
                }
            }
        }
    }

    public static void sendBroadcastSync(Intent intent, @Nullable Map<String, Object> map) {
        List<c> listA = a(intent);
        if (listA == null) {
            return;
        }
        for (c cVar : listA) {
            if (!cVar.f9071d) {
                cVar.f9069b.onReceive(intent, map);
            }
        }
    }

    public static void sendBroadcastSyncWithPendingBroadcasts(Intent intent, @Nullable Map<String, Object> map) {
        if (sendBroadcast(intent, map)) {
            b();
        }
    }
}
