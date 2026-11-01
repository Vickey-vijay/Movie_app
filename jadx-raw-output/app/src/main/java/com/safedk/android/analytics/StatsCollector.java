package com.safedk.android.analytics;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.t;
import com.safedk.android.analytics.events.RedirectEvent;
import com.safedk.android.analytics.events.base.StatsEvent;
import com.safedk.android.analytics.reporters.CrashReporter;
import com.safedk.android.internal.d;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.PersistentConcurrentHashMap;
import com.safedk.android.utils.k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes4.dex */
public class StatsCollector implements com.safedk.android.internal.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile int f43449a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f43450c = "StatsCollector";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f43451d = "SafeDKEvents.";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static StatsCollector f43452e;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static boolean f43453m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static boolean f43454o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static boolean f43455p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final Object f43456q = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private SharedPreferences f43460h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile AtomicBoolean f43461i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private StatsReporter f43463k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f43465n;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private PersistentConcurrentHashMap<String, StatsEvent> f43458f = new PersistentConcurrentHashMap<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Map<String, t> f43459g = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AtomicLong f43457b = new AtomicLong(0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private AtomicBoolean f43462j = new AtomicBoolean(false);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ExecutorService f43464l = Executors.newSingleThreadExecutor();

    public enum EventType {
        Network,
        Launch,
        Thread,
        Location,
        CaughtException,
        UserDataAccess,
        ActiveUser,
        BrandSafety,
        AdIntelligenceFill,
        ANR,
        UserSession,
        crash,
        redirect
    }

    public static boolean a() {
        return f43454o;
    }

    public static void a(boolean z10) {
        f43454o = z10;
    }

    public static boolean b() {
        return f43455p;
    }

    public static void b(boolean z10) {
        synchronized (f43456q) {
            Logger.d(f43450c, "setActiveMode to " + z10);
            f43453m = z10;
            f43452e = null;
        }
    }

    public static StatsCollector c() {
        StatsCollector statsCollector = null;
        if (!f43454o && !SafeDK.b()) {
            Logger.d(f43450c, "Reporter thread has not been initialized yet");
        } else {
            synchronized (f43456q) {
                if (f43452e == null) {
                    f43452e = new StatsCollector(d.f44769a, com.safedk.android.internal.b.getInstance().isInBackground(), 5000, null, k.a(SafeDK.getInstance().l()));
                }
                statsCollector = f43452e;
            }
        }
        return statsCollector;
    }

    private StatsCollector(int interval, boolean isBackground, int maximumEventsSize, StatsReporter statsReporter, String processName) {
        this.f43465n = null;
        if (f43453m) {
            Logger.d(f43450c, "Initializing Stats collector");
            a(interval, isBackground, statsReporter);
            this.f43465n = f43451d + processName;
            com.safedk.android.internal.b.getInstance().registerBackgroundForegroundListener(this);
        }
    }

    public void d() {
        this.f43464l.execute(new Runnable() { // from class: com.safedk.android.analytics.StatsCollector.1
            @Override // java.lang.Runnable
            public void run() {
                PersistentConcurrentHashMap persistentConcurrentHashMap;
                try {
                    Logger.d(StatsCollector.f43450c, "Attempting to load Stats events from storage.");
                    try {
                        persistentConcurrentHashMap = new PersistentConcurrentHashMap(StatsCollector.this.f43465n);
                    } catch (Throwable th2) {
                        Logger.d(StatsCollector.f43450c, "Error loading events from storage file " + StatsCollector.this.f43465n + " : " + th2.getMessage(), th2);
                        persistentConcurrentHashMap = new PersistentConcurrentHashMap();
                    }
                    ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                    if (StatsCollector.this.f43458f != null && StatsCollector.this.f43458f.size() > 0) {
                        concurrentHashMap.putAll(StatsCollector.this.f43458f);
                        Logger.d(StatsCollector.f43450c, "Stats repository contains " + concurrentHashMap.size() + " items. they will be added to the stored ones.");
                    } else {
                        Logger.d(StatsCollector.f43450c, "Stats repository does not contain previously accumulated events.");
                    }
                    synchronized (StatsCollector.f43456q) {
                        StatsCollector.this.f43458f = persistentConcurrentHashMap;
                    }
                    Logger.d(StatsCollector.f43450c, StatsCollector.this.f43458f.size() + " events loaded from storage");
                    for (V v10 : StatsCollector.this.f43458f.values()) {
                        String strC = null;
                        if (v10.c() != null) {
                            strC = v10.c();
                        }
                        Logger.d(StatsCollector.f43450c, "Setting event maturity, next_session, first_session (" + SafeDK.getInstance().e() + ") for stored event. key " + strC);
                        v10.b(true);
                        v10.c(true);
                        v10.a(SafeDK.getInstance().e());
                        if (!TextUtils.isEmpty(StatsCollector.this.f43458f.a())) {
                            Logger.d(StatsCollector.f43450c, "sdk_null_check sc added value" + StatsCollector.this.f43458f.a());
                        }
                    }
                    if (concurrentHashMap != null && concurrentHashMap.size() > 0) {
                        StatsCollector.this.f43458f.a(false);
                        for (StatsEvent statsEvent : concurrentHashMap.values()) {
                            Logger.d(StatsCollector.f43450c, "adding previously accumulated event to the stats repository : " + statsEvent.toString());
                            StatsCollector.this.b(statsEvent);
                        }
                        StatsCollector.this.f43458f.a(true);
                    }
                    Logger.d(StatsCollector.f43450c, "Completed Loading events from storage. " + StatsCollector.this.f43458f.size() + " items loaded");
                    boolean unused = StatsCollector.f43455p = true;
                    if (StatsCollector.this.f43458f.size() > 0) {
                        Logger.d(StatsCollector.f43450c, StatsCollector.this.f43458f.size() + " event(s) will be reported");
                        StatsCollector.this.d(true);
                    }
                    SafeDK.getInstance().j();
                } catch (Throwable th3) {
                    Logger.d(StatsCollector.f43450c, "Error loading events from storage : " + th3.getMessage(), th3);
                }
            }
        });
    }

    public PersistentConcurrentHashMap<String, StatsEvent> e() {
        return this.f43458f;
    }

    public ConcurrentHashMap<String, StatsEvent> a(EventType eventType) {
        ConcurrentHashMap<String, StatsEvent> concurrentHashMap = new ConcurrentHashMap<>();
        for (String str : this.f43458f.keySet()) {
            StatsEvent statsEvent = this.f43458f.get(str);
            if (statsEvent != null && statsEvent.b().equals(eventType)) {
                Logger.d(f43450c, "Get events by type adding event with key " + str);
                concurrentHashMap.put(statsEvent.c(), statsEvent);
            }
        }
        return concurrentHashMap;
    }

    public Map<String, t> f() {
        return this.f43459g;
    }

    public boolean a(String str, String str2) {
        return this.f43459g != null && this.f43459g.containsKey(str) && this.f43459g.get(str).c().equals(str2);
    }

    private void a(Context context, String str) {
        this.f43460h = context.getSharedPreferences(str, 0);
        this.f43460h.edit().clear().commit();
        Logger.d(f43450c, "Old StatsRepository data cleared");
    }

    public void a(int i10, boolean z10, int i11, StatsReporter statsReporter) {
        a(i10, z10, statsReporter);
        this.f43462j.set(true);
    }

    private void a(int i10, boolean z10, StatsReporter statsReporter) {
        f43449a = i10;
        this.f43457b.set(k.b(System.currentTimeMillis()));
        this.f43461i = new AtomicBoolean(z10);
        this.f43463k = statsReporter;
    }

    public void a(StatsEvent statsEvent) {
        b(Collections.singletonList(statsEvent));
    }

    public void a(List<StatsEvent> list) {
        b(list);
    }

    private void b(final List<StatsEvent> list) {
        if (f43453m) {
            this.f43464l.execute(new Runnable() { // from class: com.safedk.android.analytics.StatsCollector.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        k.b(StatsCollector.f43450c, "received stats safety event " + list + ", isOnUiThread = " + k.c());
                        if (!StatsCollector.this.f43461i.get()) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                StatsCollector.this.b((StatsEvent) it.next());
                            }
                            StatsCollector.this.d(false);
                            return;
                        }
                        for (StatsEvent statsEvent : list) {
                            if (statsEvent.a_() && !statsEvent.i().equals(SafeDK.f43369a)) {
                                StatsCollector.this.b(statsEvent);
                                StatsCollector.this.d(true);
                            } else {
                                Logger.d(StatsCollector.f43450c, "Saving bundle to disk : " + statsEvent.toString());
                                StatsCollector.this.b(statsEvent);
                            }
                        }
                    } catch (Throwable th2) {
                        Logger.e(StatsCollector.f43450c, th2.getMessage(), th2);
                        new CrashReporter().caughtException(th2);
                    }
                }
            });
        }
    }

    synchronized void b(StatsEvent statsEvent) {
        String strC = statsEvent.c();
        k();
        if (strC != null) {
            if (this.f43458f.containsKey(strC)) {
                StatsEvent statsEvent2 = this.f43458f.get(strC);
                statsEvent2.b(statsEvent);
                this.f43458f.put(strC, statsEvent2);
                Logger.d(f43450c, "Event " + strC + " found. Aggregating. event = " + statsEvent2.e().toString() + ", isOnUiThread = " + k.c());
            } else {
                this.f43458f.put(strC, statsEvent);
                Logger.d(f43450c, "Event " + strC + " found. Adding. event = " + statsEvent.e().toString() + ", isOnUiThread = " + k.c());
            }
        } else {
            Logger.d(f43450c, "Event key is null, cannot add to events repository.");
        }
    }

    public synchronized void a(String str) {
        k();
        if (str != null) {
            if (this.f43458f.remove(str) != null) {
                Logger.d(f43450c, "Event successfully removed from events repository, key=" + str);
            } else {
                Logger.d(f43450c, "Event to remove wasn't found in events repository, key=" + str);
            }
        } else {
            Logger.d(f43450c, "Event key is null, cannot remove from events repository.");
        }
    }

    @Override // com.safedk.android.internal.a
    public synchronized void g() {
        if (f43453m) {
            Logger.d(f43450c, "onBackground started");
            this.f43461i.set(true);
            this.f43464l.execute(new Runnable() { // from class: com.safedk.android.analytics.StatsCollector.3
                @Override // java.lang.Runnable
                public void run() {
                    StatsCollector.this.d(true);
                }
            });
        }
    }

    @Override // com.safedk.android.internal.a
    public synchronized void h() {
        if (f43453m) {
            Logger.d(f43450c, "onForeground started");
            this.f43461i.set(false);
            this.f43464l.execute(new Runnable() { // from class: com.safedk.android.analytics.StatsCollector.4
                @Override // java.lang.Runnable
                public void run() {
                    StatsCollector.this.d(true);
                }
            });
        }
    }

    public boolean i() {
        return com.safedk.android.internal.b.getInstance().getForegroundActivity() == null || this.f43461i.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(boolean z10) {
        try {
            Logger.d(f43450c, "sendEvents started, persistImmatureEvents=" + z10 + ", isOnUiThread = " + k.c());
            synchronized (f43456q) {
                if (this.f43458f == null || this.f43458f.size() == 0) {
                    Logger.d(f43450c, "sendEvents no events to report, skipping");
                } else {
                    HashSet<StatsEvent> hashSet = new HashSet(this.f43458f.values());
                    HashSet hashSet2 = new HashSet();
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        StatsEvent statsEvent = (StatsEvent) it.next();
                        k.b(f43450c, "event " + statsEvent.c() + ", mature=" + statsEvent.a_() + ", event details " + statsEvent.toString());
                        if (!statsEvent.a_()) {
                            hashSet2.add(statsEvent);
                            it.remove();
                        }
                    }
                    Logger.d(f43450c, "sendEvents " + (hashSet != null ? hashSet.toString() : ""));
                    k();
                    boolean zIsInBackground = com.safedk.android.internal.b.getInstance().isInBackground();
                    boolean zI = i();
                    Logger.d(f43450c, "foregroundActivity is null? " + zIsInBackground + ", is background? " + this.f43461i.get());
                    ArrayList<Bundle> arrayListA = this.f43463k.a(hashSet);
                    if (arrayListA.size() > 0 && !zI) {
                        Logger.d(f43450c, "sendEvents sending the following events (" + arrayListA.size() + ") : " + arrayListA.toString());
                        synchronized (arrayListA) {
                            this.f43463k.a(arrayListA);
                            for (Bundle bundle : arrayListA) {
                                if (SafeDK.getInstance().z() != null && SafeDK.getInstance().z().e() != null) {
                                    Logger.d(f43450c, "eventIds removed " + bundle.getString("event_id") + " found = " + SafeDK.getInstance().z().e().remove(bundle.getString("event_id")));
                                }
                                if (bundle.containsKey(StatsEvent.f44666z) && bundle.getString(StatsEvent.f44666z).equals("impression")) {
                                    Logger.d(f43450c, "sendEvents removing brand safety event  " + bundle.getString("impression_id"));
                                    this.f43458f.remove(bundle.getString("impression_id"));
                                } else if (bundle.containsKey(StatsEvent.f44666z) && bundle.getString(StatsEvent.f44666z).equals(RedirectEvent.f44645b)) {
                                    Logger.d(f43450c, "sendEvents removing redirect event for key  " + RedirectEvent.a(bundle) + ", exists ? " + this.f43458f.containsKey(RedirectEvent.a(bundle)));
                                    this.f43458f.remove(RedirectEvent.a(bundle));
                                } else {
                                    Logger.d(f43450c, "sendEvents Cannot remove event from stats repository " + bundle.toString());
                                }
                            }
                            if (SafeDK.getInstance().z() != null) {
                                Logger.d(f43450c, "eventIds remaining : " + SafeDK.getInstance().z().e());
                            }
                        }
                        CreativeInfoManager.h();
                    } else if (zI) {
                        Logger.d(f43450c, "sendEvents will not report because the app is in the background");
                    }
                    if (z10) {
                        Logger.d(f43450c, "sendEvents persisting immature events");
                        if (hashSet2.size() > 0) {
                            Logger.d(f43450c, hashSet2.size() + " sendEvents events to save");
                            Iterator it2 = hashSet2.iterator();
                            while (it2.hasNext()) {
                                b((StatsEvent) it2.next());
                            }
                        }
                    } else if (this.f43458f != null && hashSet != null && this.f43458f.size() > 0 && hashSet.size() > 0) {
                        Logger.d(f43450c, "Before removing stats. repository size = " + this.f43458f.size() + " repository keys = " + this.f43458f.keySet().toString() + ", events (" + hashSet.size() + ") :" + hashSet.toString());
                        for (StatsEvent statsEvent2 : hashSet) {
                            Logger.d(f43450c, "event key is " + statsEvent2.c());
                            this.f43458f.remove(statsEvent2.c(), statsEvent2);
                        }
                        Logger.d(f43450c, "After removing stats events (" + this.f43458f.size() + ") :" + this.f43458f);
                    } else {
                        Logger.d(f43450c, "No events to remove from events repository");
                    }
                }
            }
        } catch (Exception e10) {
            Logger.d(f43450c, e10.getMessage(), e10);
            new CrashReporter().caughtException(e10);
        }
    }

    private void k() {
        if (this.f43463k == null) {
            Logger.d(f43450c, "statsReporter is null, initializing");
            StatsReporter.a();
            this.f43463k = StatsReporter.b();
        }
    }
}
