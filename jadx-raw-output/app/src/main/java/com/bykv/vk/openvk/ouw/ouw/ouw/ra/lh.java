package com.bykv.vk.openvk.ouw.ouw.ouw.ra;

import android.text.TextUtils;
import android.util.Log;
import com.ironsource.C3426d4;
import com.ironsource.Z7;

/* JADX INFO: loaded from: classes2.dex */
public final class lh {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private static String f10463lh = "";
    private static boolean ouw = false;
    private static int vt = 4;

    public static boolean lh() {
        return ouw;
    }

    public static void ouw(String str) {
        f10463lh = str;
    }

    public static void vt() {
        ouw = false;
        vt = 7;
    }

    public static void lh(String str, String str2) {
        if (ouw && str2 != null && vt <= 6) {
            Log.e(lh(str), str2);
        }
    }

    public static void ouw() {
        ouw = true;
        vt = 3;
    }

    public static void vt(String str) {
        if (ouw) {
            vt("Logger", str);
        }
    }

    public static void ouw(String str, String str2) {
        if (ouw && str2 != null && vt <= 3) {
            Log.d(lh(str), str2);
        }
    }

    public static void lh(String str, String str2, Throwable th2) {
        if (ouw && vt <= 6) {
            Log.e(lh(str), str2, th2);
        }
    }

    public static void vt(String str, String str2) {
        if (ouw && str2 != null && vt <= 4) {
            Log.i(lh(str), str2);
        }
    }

    public static void ouw(String str, String str2, Throwable th2) {
        if (ouw && vt <= 3) {
            Log.d(lh(str), str2, th2);
        }
    }

    private static String lh(String str) {
        if (TextUtils.isEmpty(f10463lh)) {
            return str;
        }
        return ouw(C3426d4.j.f28586d + f10463lh + "]-[" + str + C3426d4.j.f28588e);
    }

    public static void vt(String str, String str2, Throwable th2) {
        if (ouw && vt <= 4) {
            Log.i(lh(str), str2, th2);
        }
    }

    public static void ouw(String str, Object... objArr) {
        if (ouw && vt <= 3) {
            Log.v(lh(str), ouw(objArr));
        }
    }

    public static void vt(String str, Object... objArr) {
        if (ouw && vt <= 4) {
            Log.v(lh(str), ouw(objArr));
        }
    }

    private static String ouw(Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        for (Object obj : objArr) {
            if (obj != null) {
                sb2.append(obj.toString());
            } else {
                sb2.append(" null ");
            }
            sb2.append(Z7.f27998r);
        }
        return sb2.toString();
    }
}
