package xa;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: compiled from: AppFrontBackHelper.java */
/* JADX INFO: loaded from: classes7.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f74401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Application.ActivityLifecycleCallbacks f74402b = new C0788a();

    /* JADX INFO: renamed from: xa.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AppFrontBackHelper.java */
    public class C0788a implements Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f74403b = 0;

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public C0788a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            int i10 = this.f74403b + 1;
            this.f74403b = i10;
            if (i10 != 1 || a.this.f74401a == null) {
                return;
            }
            a.this.f74401a.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            int i10 = this.f74403b - 1;
            this.f74403b = i10;
            if (i10 != 0 || a.this.f74401a == null) {
                return;
            }
            a.this.f74401a.b();
        }
    }

    /* JADX INFO: compiled from: AppFrontBackHelper.java */
    public interface b {
        void a();

        void b();
    }

    public void b(Application application, b bVar) {
        this.f74401a = bVar;
        application.registerActivityLifecycleCallbacks(this.f74402b);
    }
}
