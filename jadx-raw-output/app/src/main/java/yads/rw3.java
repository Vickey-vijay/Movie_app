package yads;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;

/* JADX INFO: loaded from: classes4.dex */
public class rw3 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f82447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f82448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public pw3 f82449c;

    public void a(boolean z10) {
    }

    public boolean a() {
        return false;
    }

    public final void b() {
        boolean z10 = true;
        this.f82447a = true;
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        if (runningAppProcessInfo.importance != 100 && !a()) {
            z10 = false;
        }
        this.f82448b = z10;
        a(z10);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void a(Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (!this.f82448b) {
            this.f82448b = true;
            if (this.f82447a) {
                a(true);
                pw3 pw3Var = this.f82449c;
                if (pw3Var != null) {
                    pw3Var.a(true);
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        boolean z10 = runningAppProcessInfo.importance == 100 || a();
        if (this.f82448b != z10) {
            this.f82448b = z10;
            if (this.f82447a) {
                a(z10);
                pw3 pw3Var = this.f82449c;
                if (pw3Var != null) {
                    pw3Var.a(z10);
                }
            }
        }
    }
}
