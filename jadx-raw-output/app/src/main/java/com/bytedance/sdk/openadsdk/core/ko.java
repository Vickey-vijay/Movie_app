package com.bytedance.sdk.openadsdk.core;

import android.app.Application;
import android.content.Context;
import com.bytedance.sdk.openadsdk.ApmHelper;

/* JADX INFO: loaded from: classes2.dex */
public final class ko {
    public final com.bytedance.sdk.openadsdk.utils.ouw ouw = new com.bytedance.sdk.openadsdk.utils.ouw();
    public boolean vt;

    public static class ouw {
        private static final ko ouw = new ko();
    }

    public static ko ouw() {
        return ouw.ouw;
    }

    public final void vt() {
        try {
            Context contextOuw = zih.ouw();
            if (contextOuw instanceof Application) {
                ((Application) contextOuw).registerActivityLifecycleCallbacks(this.ouw);
                this.vt = true;
            } else if (contextOuw != null && contextOuw.getApplicationContext() != null) {
                ((Application) contextOuw.getApplicationContext()).registerActivityLifecycleCallbacks(this.ouw);
                this.vt = true;
            }
        } catch (Throwable th2) {
            ApmHelper.reportCustomError("registerActivityLifecycleError", "registerActivityLifecycle", th2);
        }
    }
}
