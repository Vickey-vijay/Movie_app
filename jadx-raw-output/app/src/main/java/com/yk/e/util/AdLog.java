package com.yk.e.util;

import android.util.Log;
import com.ironsource.C3426d4;
import y0.e;

/* JADX INFO: loaded from: classes2.dex */
public class AdLog {
    public static final int LV_DEBUG = 1;
    public static final int LV_ERROR = 4;
    public static final int LV_INFO = 2;
    public static final int LV_NOLOG = 0;
    public static final int LV_WARN = 3;
    private static String TAG_COM = "chitu_sdk";
    private static String TAG_AD = Constant.TAG;
    private static String TAG_SUB_AD = "OKT_SUB_SDK";

    public static void d(String str) {
        try {
            if (checkLogLevel(1)) {
                Log.d(TAG_COM, str);
            }
            e.b(str);
        } catch (Exception e10) {
            Log.e(TAG_COM, e10.getMessage(), e10);
        }
    }

    public static void e(String str) {
        try {
            if (checkLogLevel(4)) {
                Log.e(TAG_COM, str);
            }
            e.c(str);
        } catch (Exception e10) {
            Log.e(TAG_COM, e10.getMessage(), e10);
        }
    }

    public static void i(String str) {
        try {
            if (checkLogLevel(2)) {
                Log.i(TAG_COM, str);
            }
            e.f(str);
        } catch (Exception e10) {
            Log.e(TAG_COM, e10.getMessage(), e10);
        }
    }

    public static void printStackTrace() {
        try {
            if (checkLogLevel(4)) {
                Log.e(TAG_COM, Log.getStackTraceString(new Throwable()));
            }
            e.e(TAG_COM, Log.getStackTraceString(new Throwable()));
        } catch (Exception e10) {
            Log.e(TAG_COM, e10.getMessage(), e10);
        }
    }

    public static void subAd(String str) {
        try {
            if (checkLogLevel(1)) {
                Log.i(TAG_SUB_AD, str);
            }
            e.b(str);
        } catch (Exception e10) {
            Log.e(TAG_COM, e10.getMessage(), e10);
        }
    }

    public static void w(String str) {
        try {
            if (checkLogLevel(3)) {
                Log.w(TAG_COM, str);
            }
            e.h(str);
        } catch (Exception e10) {
            Log.e(TAG_COM, e10.getMessage(), e10);
        }
    }

    public static void ad(String str) {
        Log.e(TAG_AD, str);
        try {
            e.b(str);
        } catch (Exception e10) {
            Log.e(TAG_COM, e10.getMessage(), e10);
        }
    }

    private static boolean checkLogLevel(int i10) {
        return Constant.debugFlag;
    }

    public static void xi(String str, String str2) {
        try {
            e.f(C3426d4.j.f28586d + str + "] @@ " + str2);
        } catch (Exception e10) {
            Log.e(str, e10.getMessage(), e10);
        }
    }

    public static void xe(String str, Throwable th2) {
        try {
            e.d(str, th2);
        } catch (Exception e10) {
            Log.e(TAG_COM, e10.getMessage(), e10);
        }
    }

    public static void d(String str, String str2) {
        try {
            if (checkLogLevel(1)) {
                Log.d(str, str2);
            }
            e.b(str + " @@ " + str2);
        } catch (Exception e10) {
            Log.e(str, e10.getMessage(), e10);
        }
    }

    public static void e(String str, String str2) {
        try {
            if (checkLogLevel(4)) {
                Log.e(str, str2);
            }
            e.c(C3426d4.j.f28586d + str + "] @@ " + str2);
        } catch (Exception e10) {
            Log.e(str, e10.getMessage(), e10);
        }
    }

    public static void i(String str, String str2) {
        try {
            if (checkLogLevel(2)) {
                Log.i(str, str2);
            }
            e.f(C3426d4.j.f28586d + str + "] @@ " + str2);
        } catch (Exception e10) {
            Log.e(str, e10.getMessage(), e10);
        }
    }

    public static void w(String str, String str2) {
        try {
            if (checkLogLevel(2)) {
                Log.w(str, str2);
            }
            e.h(C3426d4.j.f28586d + str + "] @@ " + str2);
        } catch (Exception e10) {
            Log.e(str, e10.getMessage(), e10);
        }
    }

    public static void e(String str, Throwable th2) {
        try {
            if (checkLogLevel(4)) {
                Log.e(TAG_COM, str, th2);
            }
            e.d(str, th2);
        } catch (Exception e10) {
            Log.e(TAG_COM, e10.getMessage(), e10);
        }
    }

    public static void e(String str, String str2, Throwable th2) {
        try {
            if (checkLogLevel(4)) {
                Log.e(str, str2, th2);
            }
            e.d(C3426d4.j.f28586d + str + "] @@ " + str2, th2);
        } catch (Exception e10) {
            Log.e(str, e10.getMessage(), e10);
        }
    }
}
