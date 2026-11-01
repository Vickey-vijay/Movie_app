package com.bytedance.sdk.openadsdk.core;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.view.ViewConfiguration;
import androidx.annotation.Nullable;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public class zih {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private static int f13203lh = -1;

    @SuppressLint({"StaticFieldLeak"})
    private static volatile Context ouw;
    private static volatile vpp<com.bytedance.sdk.openadsdk.yu.ouw> vt;

    public static class ouw {

        @SuppressLint({"StaticFieldLeak"})
        private static volatile Application ouw;

        private static Object vt() {
            try {
                Method method = Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", new Class[0]);
                method.setAccessible(true);
                return method.invoke(null, new Object[0]);
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.qbp.ouw("MyApplication", "ActivityThread get error, maybe api level <= 4.2.2", th2);
                return null;
            }
        }

        static {
            try {
                Object objVt = vt();
                ouw = (Application) objVt.getClass().getMethod("getApplication", new Class[0]).invoke(objVt, new Object[0]);
                com.bytedance.sdk.component.utils.ko.fkw("MyApplication", "application get success");
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.qbp.ouw("MyApplication", "application get failed", th2);
            }
        }

        @Nullable
        public static Application ouw() {
            return ouw;
        }
    }

    public static Context ouw() {
        if (ouw == null) {
            vt(null);
        }
        return ouw;
    }

    public static void vt(Context context) {
        if (ouw == null) {
            synchronized (zih.class) {
                if (ouw == null) {
                    if (context != null) {
                        ouw = context;
                        Context applicationContext = context.getApplicationContext();
                        if (applicationContext != null) {
                            ouw = applicationContext;
                        }
                        return;
                    }
                    try {
                        Application applicationOuw = ouw.ouw();
                        if (applicationOuw != null) {
                            ouw = applicationOuw;
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }

    public static vpp<com.bytedance.sdk.openadsdk.yu.ouw> lh() {
        if (vt == null) {
            synchronized (zih.class) {
                if (vt == null) {
                    vt = new jqy(ouw);
                }
            }
        }
        return vt;
    }

    public static com.bytedance.sdk.openadsdk.rn.lh.lh fkw() {
        if (!com.bytedance.sdk.openadsdk.core.settings.ra.ouw()) {
            return com.bytedance.sdk.openadsdk.rn.lh.fkw.ouw();
        }
        return com.bytedance.sdk.openadsdk.yu.ouw.vt.ouw();
    }

    public static com.bytedance.sdk.openadsdk.core.settings.cf yu() {
        return com.bytedance.sdk.openadsdk.core.settings.cf.vt();
    }

    public static Context ouw(Context context) {
        if (context == null) {
            context = ouw();
        }
        if (context instanceof Application) {
            return context;
        }
        if (context != null) {
            return context.getApplicationContext();
        }
        return null;
    }

    public static int vt() {
        Context contextOuw;
        if (f13203lh < 0 && (contextOuw = ouw()) != null) {
            f13203lh = ViewConfiguration.get(contextOuw).getScaledTouchSlop();
        }
        return f13203lh;
    }
}
