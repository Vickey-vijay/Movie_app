package com.bytedance.sdk.component.utils;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes8.dex */
public final class zin {
    private static String ouw;

    private static String lh() {
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread", false, Application.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(null, new Object[0]);
            if (objInvoke instanceof String) {
                return (String) objInvoke;
            }
            return null;
        } catch (Throwable th2) {
            th2.printStackTrace();
            return null;
        }
    }

    public static boolean ouw(Context context) {
        if (context == null || context.getApplicationContext() == null) {
            return false;
        }
        return TextUtils.equals(context.getApplicationContext().getPackageName(), ouw());
    }

    private static String vt() {
        if (Build.VERSION.SDK_INT < 28) {
            return null;
        }
        try {
            return Application.getProcessName();
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static String ouw() {
        if (!TextUtils.isEmpty(ouw)) {
            return ouw;
        }
        String strVt = vt();
        ouw = strVt;
        if (!TextUtils.isEmpty(strVt)) {
            return ouw;
        }
        String strLh = lh();
        ouw = strLh;
        if (!TextUtils.isEmpty(strLh)) {
            return ouw;
        }
        return ouw;
    }
}
