package com.yk.e.util;

import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;

/* JADX INFO: loaded from: classes7.dex */
public class LogUtil {
    private static String TAG = "chitu_sdk";
    public static boolean debug;

    public static void d(String str, String str2, Throwable th2) {
        if (debug) {
            Log.d(str, str2, th2);
        }
        if (Constant.debugFlag) {
            Log.d(TAG, str2, th2);
        }
    }

    public static void e(String str, String str2) {
        if (debug) {
            Log.e(str, str2);
        }
        if (Constant.debugFlag) {
            Log.e(TAG, str2);
        }
    }

    public static void i(String str, String str2) {
        if (debug) {
            Log.i(str, str2);
        }
        if (Constant.debugFlag) {
            Log.i(TAG, str2);
        }
    }

    public static void w(String str, String str2) {
        if (debug) {
            Log.w(str, str2);
        }
        if (Constant.debugFlag) {
            Log.w(TAG, str2);
        }
    }

    public static void info(String str) {
        if (debug) {
            Log.i("zhazha", str);
        }
        if (Constant.debugFlag) {
            Log.i(TAG, str);
        }
    }

    public static void printException(Throwable th2) {
        StringWriter stringWriter = new StringWriter();
        th2.printStackTrace(new PrintWriter(stringWriter));
        String string = stringWriter.toString();
        if (debug) {
            Log.w("RESULT", string);
        }
        if (Constant.debugFlag) {
            Log.e(TAG, th2.getMessage(), th2);
        }
    }

    public static void d(String str, String str2) {
        if (debug) {
            Log.d(str, str2);
        }
        if (Constant.debugFlag) {
            Log.d(TAG, str2);
        }
    }

    public static void e(String str, String str2, Throwable th2) {
        if (debug) {
            Log.e(str, str2, th2);
        }
        if (Constant.debugFlag) {
            Log.e(TAG, str2, th2);
        }
    }

    public static void i(String str, String str2, Throwable th2) {
        if (debug) {
            Log.i(str, str2, th2);
        }
        if (Constant.debugFlag) {
            Log.i(TAG, str2, th2);
        }
    }

    public static void w(String str, String str2, Throwable th2) {
        if (debug) {
            Log.w(str, str2, th2);
        }
        if (Constant.debugFlag) {
            Log.w(TAG, str2, th2);
        }
    }

    public static void d(String str) {
        if (Constant.debugFlag) {
            Log.d(TAG, str);
        }
    }

    public static void e(String str) {
        if (Constant.debugFlag) {
            Log.e(TAG, str);
        }
    }

    public static void i(String str) {
        if (Constant.debugFlag) {
            Log.i(TAG, str);
        }
    }

    public static void e(String str, Throwable th2) {
        if (Constant.debugFlag) {
            Log.e(TAG, str, th2);
        }
    }
}
