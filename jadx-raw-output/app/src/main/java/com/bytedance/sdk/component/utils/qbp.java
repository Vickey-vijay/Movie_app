package com.bytedance.sdk.component.utils;

import android.text.TextUtils;
import android.util.Log;
import com.ironsource.C3426d4;
import com.ironsource.Z7;

/* JADX INFO: loaded from: classes10.dex */
public final class qbp {
    private static boolean ouw = false;
    private static String vt = "";

    public static void lh(String str, Object... objArr) {
        if (ouw) {
            Log.w(vt(str), ouw(objArr));
        }
    }

    public static void ouw() {
        ouw = true;
    }

    public static void vt() {
        ouw = false;
    }

    public static void ouw(String str, String str2) {
        if (ouw && str2 != null) {
            Log.d(vt(str), str2);
        }
    }

    public static void vt(String str, String str2) {
        if (ouw && str2 != null) {
            Log.i(vt(str), str2);
        }
    }

    public static void yu(String str, Object... objArr) {
        if (ouw) {
            Log.e(vt(str), ouw(objArr));
        }
    }

    public static void lh(String str, String str2) {
        if (ouw && str2 != null) {
            Log.e(vt(str), str2);
        }
    }

    public static void ouw(String str, Object... objArr) {
        if (ouw) {
            Log.d(vt(str), ouw(objArr));
        }
    }

    public static void vt(String str, Object... objArr) {
        if (ouw) {
            Log.i(vt(str), ouw(objArr));
        }
    }

    public static void ouw(String str, String str2, Throwable th2) {
        if (ouw) {
            Log.e(vt(str), str2, th2);
        }
    }

    private static String vt(String str) {
        if (TextUtils.isEmpty(vt)) {
            return str;
        }
        return ouw(C3426d4.j.f28586d + vt + "]-[" + str + C3426d4.j.f28588e);
    }

    public static void ouw(String str) {
        vt = str;
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
