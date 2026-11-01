package me.goldze.mvvmhabit.base;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.multidex.MultiDex;
import androidx.multidex.MultiDexApplication;

/* JADX INFO: loaded from: classes9.dex */
public class BaseApplication extends MultiDexApplication {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Application f64400b;

    public class a implements Application.ActivityLifecycleCallbacks {
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            sl.a.b().a(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            sl.a.b().c(activity);
        }
    }

    public static Application getInstance() {
        Application application = f64400b;
        if (application != null) {
            return application;
        }
        throw new NullPointerException("please inherit BaseApplication or call setApplication.");
    }

    public static synchronized void setApplication(@NonNull Application application) {
        f64400b = application;
        application.registerActivityLifecycleCallbacks(new a());
    }

    @Override // androidx.multidex.MultiDexApplication, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        MultiDex.install(context);
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        setApplication(this);
    }
}
