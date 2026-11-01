package io.bidmachine;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.core.Logger;
import io.bidmachine.core.Utils;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: BidMachineActivityManager.java */
/* JADX INFO: loaded from: classes9.dex */
public class n1 {

    @NonNull
    private static final AtomicBoolean isInitialized = new AtomicBoolean(false);

    @Nullable
    private static WeakReference<Activity> weakTopActivity;

    /* JADX INFO: compiled from: BidMachineActivityManager.java */
    public static class b implements Application.ActivityLifecycleCallbacks {
        private b() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@NonNull Activity activity, @Nullable Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(@NonNull Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@NonNull Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@NonNull Activity activity) {
            try {
                Utils.onBackgroundThread(new Runnable() { // from class: io.bidmachine.o1
                    @Override // java.lang.Runnable
                    public final void run() {
                        n1.b.lambda$onActivityPaused$1();
                    }
                });
            } catch (Throwable unused) {
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onActivityPaused$1() {
            try {
                SessionManager.get().pause();
            } catch (Throwable unused) {
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onActivityResumed$0() {
            try {
                SessionManager.get().resume();
            } catch (Throwable unused) {
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(@NonNull Activity activity) {
            try {
                n1.setTopActivity(activity);
                Utils.onBackgroundThread(new Runnable() { // from class: io.bidmachine.p1
                    @Override // java.lang.Runnable
                    public final void run() {
                        n1.b.lambda$onActivityResumed$0();
                    }
                });
            } catch (Throwable unused) {
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(@NonNull Activity activity) {
            try {
                n1.setTopActivity(activity);
            } catch (Throwable unused) {
            }
        }
    }

    @Nullable
    public static Activity getTopActivity() {
        WeakReference<Activity> weakReference = weakTopActivity;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public static void initialize(@NonNull Context context) {
        if (isInitialized.compareAndSet(false, true)) {
            try {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext instanceof Application) {
                    ((Application) applicationContext).registerActivityLifecycleCallbacks(new b());
                }
            } catch (Throwable th2) {
                Logger.w(th2);
            }
        }
    }

    public static void setTopActivity(@NonNull Activity activity) {
        weakTopActivity = new WeakReference<>(activity);
    }
}
