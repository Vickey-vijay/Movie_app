package com.ironsource.sdk.utils;

import android.text.TextUtils;
import android.util.Log;
import com.ironsource.C3714t8;

/* JADX INFO: loaded from: classes11.dex */
public class Logger {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f31216a;

    public static void d(String str, String str2) {
        if (f31216a) {
            Log.d(str, str2);
        }
    }

    public static void e(String str, String str2) {
        if (f31216a) {
            Log.e(str, str2);
        }
    }

    public static void i(String str, String str2) {
        if (f31216a) {
            Log.i(str, str2);
        }
    }

    public static void v(String str, String str2) {
        if (f31216a) {
            Log.v(str, str2);
        }
    }

    public static void w(String str, String str2) {
        if (f31216a) {
            Log.w(str, str2);
        }
    }

    public static void enableLogging(int i10) {
        f31216a = C3714t8.d.MODE_0.b() != i10;
    }

    public static void d(String str, String str2, Throwable th2) {
        if (f31216a) {
            Log.d(str, str2, th2);
        }
    }

    public static void e(String str, String str2, Throwable th2) {
        if (f31216a) {
            Log.e(str, str2, th2);
        }
    }

    public static void i(String str, String str2, Throwable th2) {
        if (!f31216a || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.i(str, str2, th2);
    }

    public static void v(String str, String str2, Throwable th2) {
        if (f31216a) {
            Log.v(str, str2, th2);
        }
    }

    public static void w(String str, String str2, Throwable th2) {
        if (f31216a) {
            Log.w(str, str2, th2);
        }
    }
}
