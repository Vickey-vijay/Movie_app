package com.bytedance.sdk.component.ouw;

import android.util.Log;

/* JADX INFO: loaded from: classes8.dex */
final class pno {
    public static boolean ouw;

    public static void ouw(String str) {
        if (ouw) {
            Log.i("JsBridge2", str);
        }
    }

    public static void vt(String str) {
        if (ouw) {
            Log.w("JsBridge2", str);
        }
    }

    public static void ouw(String str, Throwable th2) {
        if (ouw) {
            Log.w("JsBridge2", str, th2);
            Log.w("JsBridge2", "Stacktrace: " + Log.getStackTraceString(th2));
        }
    }

    public static void vt(String str, Throwable th2) {
        if (ouw) {
            Log.e("JsBridge2", str, th2);
            Log.e("JsBridge2", "Stacktrace: " + Log.getStackTraceString(th2));
        }
    }

    public static void ouw(RuntimeException runtimeException) {
        if (ouw) {
            throw runtimeException;
        }
    }
}
