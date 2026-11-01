package com.bytedance.sdk.openadsdk.core.tlj.ouw;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: loaded from: classes8.dex */
public class ouw implements Application.ActivityLifecycleCallbacks {
    private static volatile ouw vt;
    public final vt ouw;

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
    public void onActivityPostResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public static ouw ouw(Application application) {
        if (vt == null) {
            synchronized (ouw.class) {
                if (vt == null) {
                    vt = new ouw(application);
                    application.registerActivityLifecycleCallbacks(vt);
                }
            }
        }
        return vt;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        vt vtVar = this.ouw;
        if (vtVar != null) {
            String localClassName = activity.getLocalClassName();
            if (vtVar.ouw.size() == 0) {
                vtVar.f13091le = localClassName;
                vtVar.yu = System.currentTimeMillis();
                vtVar.fkw = System.currentTimeMillis() - vtVar.f13092lh;
                vtVar.vt.set(false);
            }
            if (!vtVar.ouw.contains(localClassName)) {
                vtVar.ouw.add(localClassName);
            }
            if (localClassName.contains("com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity") || localClassName.contains("com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity")) {
                return;
            }
            vtVar.pno = localClassName;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        vt vtVar = this.ouw;
        if (vtVar != null) {
            String localClassName = activity.getLocalClassName();
            if (vtVar.ouw.contains(localClassName)) {
                vtVar.ouw.remove(localClassName);
            }
            if (vtVar.ouw.size() == 0) {
                vtVar.f13092lh = System.currentTimeMillis();
                vtVar.vt.set(true);
                vtVar.f13093ra = localClassName;
            }
        }
    }

    private ouw(Application application) {
        this.ouw = vt.ouw(application);
    }
}
