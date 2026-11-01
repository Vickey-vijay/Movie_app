package com.mbridge.msdk.foundation.tools;

import android.text.TextUtils;
import android.util.Log;
import com.mbridge.msdk.MBridgeConstans;

/* JADX INFO: compiled from: SameLogTool.java */
/* JADX INFO: loaded from: classes6.dex */
public class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f35347a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f35348b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f35349c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f35350d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f35351e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f35352f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static boolean f35353g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static boolean f35354h = true;

    public static void a(String str, String str2) {
        if (!f35347a || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.d(a(str), str2);
    }

    public static void b(String str, String str2) {
        if (!f35348b || str2 == null) {
            return;
        }
        Log.e(a(str), str2);
    }

    public static void c(String str, String str2) {
        if (!f35349c || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.i(a(str), str2);
    }

    static {
        if (MBridgeConstans.DEBUG) {
            return;
        }
        f35353g = false;
        f35347a = false;
        f35349c = false;
        f35354h = false;
        f35348b = false;
        f35352f = false;
        f35351e = false;
        f35350d = false;
    }

    public static void d(String str, String str2) {
        if (!f35354h || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.w(a(str), str2);
    }

    public static void b(String str, String str2, Throwable th2) {
        if (!f35348b || str2 == null || th2 == null) {
            return;
        }
        Log.e(a(str), str2, th2);
    }

    private static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        return "MBRIDGE_" + str;
    }

    public static void c(String str, String str2, Throwable th2) {
        if (!f35354h || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.w(a(str), str2, th2);
    }

    public static void a(String str, String str2, Throwable th2) {
        if (!f35347a || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.d(a(str), str2, th2);
    }

    public static void a(String str, Throwable th2) {
        if (!f35354h || th2 == null) {
            return;
        }
        Log.w(a(str), th2);
    }
}
