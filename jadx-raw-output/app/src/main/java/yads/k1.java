package yads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes11.dex */
public final class k1 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o1 f79276a;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    public final Activity a() {
        Activity activity;
        o1 o1Var = this.f79276a;
        synchronized (o1Var) {
            nj.x.I(o1Var.f80887a, m1.f80025b);
            WeakReference weakReference = (WeakReference) nj.b0.h0(o1Var.f80887a);
            activity = weakReference != null ? (Activity) weakReference.get() : null;
        }
        return activity;
    }

    public final Activity b() {
        Activity activity;
        o1 o1Var = this.f79276a;
        synchronized (o1Var) {
            nj.x.I(o1Var.f80887a, n1.f80506b);
            WeakReference weakReference = (WeakReference) nj.b0.s0(o1Var.f80887a);
            activity = weakReference != null ? (Activity) weakReference.get() : null;
        }
        return activity;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.f79276a.a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.f79276a.b(activity);
    }

    public k1(o1 o1Var) {
        this.f79276a = o1Var;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (activity.isFinishing()) {
            this.f79276a.b(activity);
        }
    }
}
