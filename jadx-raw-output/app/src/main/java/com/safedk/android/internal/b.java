package com.safedk.android.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.ironsource.Z7;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.reporters.CrashReporter;
import com.safedk.android.utils.Logger;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes10.dex */
public class b implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f44760a = "LifecycleManager";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static b f44761b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f44762c = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static boolean f44763h;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final LinkedHashSet<WeakReference<Activity>> f44764d = new LinkedHashSet<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ArrayList<WeakReference<Activity>> f44765e = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f44766f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f44767g = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Set<a> f44768i = Collections.newSetFromMap(new ConcurrentHashMap());

    private b() {
    }

    public ArrayList<WeakReference<Activity>> getAppActivities() {
        return this.f44765e;
    }

    public static synchronized b getInstance() {
        if (f44761b == null) {
            f44761b = new b();
        }
        return f44761b;
    }

    public void AddActivity(Activity activity) {
        this.f44764d.add(new WeakReference<>(activity));
        if (!BrandSafetyUtils.d(activity.getClass())) {
            this.f44765e.add(new WeakReference<>(activity));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.app.Activity] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v17, types: [android.app.Activity, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    public Activity getForegroundActivity() {
        ?? r10;
        Throwable th2;
        ?? r11;
        String str = null;
        try {
            if (this.f44764d.size() > 0) {
                synchronized (this.f44764d) {
                    try {
                        r10 = (Activity) ((WeakReference) this.f44764d.toArray()[this.f44764d.size() - 1]).get();
                        try {
                            if (r10 != 0) {
                                try {
                                    str = f44760a;
                                    Logger.d(f44760a, "getForegroundActivity Foreground activity is " + r10);
                                } catch (Throwable th3) {
                                    th = th3;
                                    r10 = r10;
                                    Logger.e(f44760a, "Exception in getForegroundActivity : " + th.getMessage(), th);
                                    new CrashReporter().caughtException(th);
                                }
                            }
                        } catch (Throwable th4) {
                            th2 = th4;
                            r11 = r10;
                            while (true) {
                                try {
                                    try {
                                        throw th2;
                                    } catch (Throwable th5) {
                                        th = th5;
                                        r10 = r11;
                                        Logger.e(f44760a, "Exception in getForegroundActivity : " + th.getMessage(), th);
                                        new CrashReporter().caughtException(th);
                                        return r10;
                                    }
                                } catch (Throwable th6) {
                                    th2 = th6;
                                }
                            }
                        }
                    } catch (Throwable th7) {
                        th2 = th7;
                        r11 = 0;
                    }
                }
            } else {
                Logger.d(f44760a, "No foreground activity found");
                r10 = 0;
            }
        } catch (Throwable th8) {
            th = th8;
            r10 = str;
        }
        return r10;
    }

    public boolean isInBackground() {
        return this.f44767g;
    }

    public synchronized boolean isInterstitialActivity(Context activity) {
        boolean z10 = false;
        synchronized (this) {
            if (this.f44766f != 0 && this.f44766f == System.identityHashCode(activity)) {
                z10 = true;
            }
        }
        return z10;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (f44763h) {
            Logger.d(f44760a, "onActivityCreated " + activity.toString());
            if (!BrandSafetyUtils.d(activity.getClass())) {
                this.f44765e.add(new WeakReference<>(activity));
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityStarted(Activity activity) {
        try {
            if (f44763h) {
                Logger.d(f44760a, "onActivityStarted " + activity.toString());
                synchronized (this.f44764d) {
                    this.f44764d.add(new WeakReference<>(activity));
                }
                if (this.f44764d.size() == 1) {
                    c();
                }
            }
        } catch (Throwable th2) {
            Logger.e(f44760a, "onActivityStarted failed", th2);
            new CrashReporter().caughtException(th2);
        }
    }

    private String a() {
        StringBuilder sb2 = new StringBuilder("{ ");
        synchronized (this.f44764d) {
            Iterator<WeakReference<Activity>> it = this.f44764d.iterator();
            while (it.hasNext()) {
                sb2.append(it.next().get()).append(Z7.f27998r);
            }
        }
        sb2.append(com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f44172e);
        return sb2.toString();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        try {
            if (f44763h) {
                Logger.d(f44760a, "onActivityResumed " + activity.toString() + ", isActive=" + f44763h + ", foregroundActivities=" + a());
                boolean zA = false;
                if (BrandSafetyUtils.d(activity.getClass())) {
                    this.f44766f = System.identityHashCode(activity);
                    zA = SafeDK.getInstance().a(activity);
                } else {
                    SafeDK.getInstance().d(activity);
                }
                if (!zA || BrandSafetyUtils.c(activity.getClass())) {
                    SafeDK.getInstance().c(activity);
                }
            }
        } catch (Throwable th2) {
            Logger.e(f44760a, "onActivityResumed failed", th2);
            new CrashReporter().caughtException(th2);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        try {
            if (f44763h) {
                Logger.d(f44760a, "onActivityPaused " + activity.toString());
                if (BrandSafetyUtils.d(activity.getClass())) {
                    SafeDK.getInstance().b(activity);
                } else {
                    SafeDK.getInstance().e(activity);
                }
            }
        } catch (Throwable th2) {
            Logger.e(f44760a, "onActivityPaused failed", th2);
            new CrashReporter().caughtException(th2);
        }
    }

    public synchronized void removeActivity(Activity activity, Collection<WeakReference<Activity>> collection) {
        for (WeakReference<Activity> weakReference : collection) {
            if (weakReference.get() == activity) {
                collection.remove(weakReference);
                weakReference.clear();
                break;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        try {
            if (f44763h) {
                Logger.d(f44760a, "onActivityStopped " + activity.toString());
                synchronized (this.f44764d) {
                    removeActivity(activity, this.f44764d);
                }
                Logger.d(f44760a, "onActivityStopped foregroundActivities=" + a());
                if (this.f44764d.size() == 0) {
                    b();
                }
            }
        } catch (Throwable th2) {
            Logger.e(f44760a, "onActivityStopped failed", th2);
            new CrashReporter().caughtException(th2);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        if (f44763h) {
            Logger.d(f44760a, "onActivitySaveInstanceState " + activity.toString());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        if (f44763h) {
            Logger.d(f44760a, "onActivityDestroyed " + activity.toString());
            if (BrandSafetyUtils.d(activity.getClass())) {
                SafeDK.getInstance().a(activity.toString());
            } else {
                removeActivity(activity, this.f44765e);
            }
        }
    }

    private void a(boolean z10) {
        this.f44767g = z10;
    }

    private void b() {
        Logger.d(f44760a, "Identified background");
        a(true);
        for (a aVar : this.f44768i) {
            Logger.d(f44760a, "notifyBackground to " + aVar.getClass().getCanonicalName());
            aVar.g();
        }
    }

    private void c() {
        Logger.d(f44760a, "Identified foreground");
        a(false);
        Iterator<a> it = this.f44768i.iterator();
        while (it.hasNext()) {
            it.next().h();
        }
    }

    public synchronized void registerBackgroundForegroundListener(a listener) {
        try {
            if (f44763h && !this.f44768i.contains(listener) && !a(listener)) {
                Logger.d(f44760a, "Adding " + listener.getClass() + " to listen to BG FG events");
                this.f44768i.add(listener);
                if (isInBackground()) {
                    listener.g();
                } else {
                    listener.h();
                }
            }
        } catch (Throwable th2) {
            Logger.e(f44760a, "Failed to add listener to BG/FG events", th2);
            new CrashReporter().caughtException(th2);
        }
    }

    private boolean a(a aVar) {
        Logger.d(f44760a, "listenersContainsType started, listener is " + aVar.getClass());
        ArrayList arrayList = new ArrayList();
        if (this.f44768i != null) {
            Logger.d(f44760a, "listenersContainsType iteration listener is " + aVar.getClass());
            Iterator<a> it = this.f44768i.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getClass().getCanonicalName());
            }
        }
        return arrayList.contains(aVar.getClass().getCanonicalName());
    }

    public synchronized void clearBackgroundForegroundListeners() {
        Logger.d(f44760a, "Clearing Background Foreground listeners collection");
        this.f44768i = Collections.newSetFromMap(new ConcurrentHashMap());
    }

    public static void setActiveMode(boolean enable) {
        f44763h = enable;
        Logger.d(f44760a, "setting active mode to " + enable);
    }
}
