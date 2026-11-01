package com.ironsource.environment;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes7.dex */
public class ContextProvider {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static volatile ContextProvider f28810d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Activity f28811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f28812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ConcurrentHashMap<String, a> f28813c = new ConcurrentHashMap<>();

    public interface a {
        void onPause(Activity activity);

        void onResume(Activity activity);
    }

    public static ContextProvider getInstance() {
        if (f28810d == null) {
            synchronized (ContextProvider.class) {
                if (f28810d == null) {
                    f28810d = new ContextProvider();
                }
            }
        }
        return f28810d;
    }

    public Context getActiveContext() {
        Activity activity = this.f28811a;
        return activity != null ? activity : this.f28812b;
    }

    public Context getApplicationContext() {
        Activity activity;
        Context context = this.f28812b;
        return (context != null || (activity = this.f28811a) == null) ? context : activity.getApplicationContext();
    }

    public Activity getCurrentActiveActivity() {
        return this.f28811a;
    }

    public void onPause(Activity activity) {
        if (activity != null) {
            Iterator<a> it = this.f28813c.values().iterator();
            while (it.hasNext()) {
                it.next().onPause(activity);
            }
        }
    }

    public void onResume(Activity activity) {
        if (activity != null) {
            this.f28811a = activity;
            Iterator<a> it = this.f28813c.values().iterator();
            while (it.hasNext()) {
                it.next().onResume(this.f28811a);
            }
        }
    }

    public void registerLifeCycleListener(a aVar) {
        this.f28813c.put(aVar.getClass().getSimpleName(), aVar);
    }

    public void updateActivity(Activity activity) {
        if (activity != null) {
            this.f28811a = activity;
        }
    }

    public void updateAppContext(Context context) {
        if (context != null) {
            this.f28812b = context;
        }
    }

    private ContextProvider() {
    }
}
