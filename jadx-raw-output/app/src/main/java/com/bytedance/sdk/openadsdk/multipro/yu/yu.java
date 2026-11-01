package com.bytedance.sdk.openadsdk.multipro.yu;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.bly;
import com.bytedance.sdk.openadsdk.core.zih;

/* JADX INFO: loaded from: classes7.dex */
public final class yu {
    private static boolean ouw() {
        return zih.ouw() == null;
    }

    private static String vt(String str) {
        return TextUtils.isEmpty(str) ? "tt_sp" : str;
    }

    public static void ouw(String str, String str2, Boolean bool) {
        if (ouw()) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
            ouw.ouw(vt(str), str2, bool);
        } else {
            ouw(vt(str), str2, bool);
        }
    }

    public static String vt(String str, String str2, String str3) {
        if (ouw()) {
            return str3;
        }
        return com.bytedance.sdk.openadsdk.multipro.vt.lh() ? ouw.vt(vt(str), str2, str3) : ouw.ouw(zih.ouw(), vt(str), str2, str3);
    }

    public static void ouw(String str, String str2, Long l10) {
        if (ouw()) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
            ouw.ouw(vt(str), str2, l10);
        } else {
            ouw(vt(str), str2, l10);
        }
    }

    public static void vt(String str, String str2) {
        if (ouw()) {
            return;
        }
        try {
            if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
                ouw.vt(vt(str), str2);
            } else {
                vt.vt(zih.ouw(), vt(str), str2);
            }
        } catch (Throwable unused) {
        }
    }

    public static void ouw(String str, String str2, String str3) {
        if (ouw()) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
            ouw.ouw(vt(str), str2, str3);
        } else {
            ouw(vt(str), str2, str3);
        }
    }

    public static void ouw(String str, String str2, Integer num) {
        if (ouw()) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
            ouw.ouw(vt(str), str2, num);
        } else {
            ouw(vt(str), str2, num);
        }
    }

    public static int ouw(String str, String str2, int i10) {
        if (ouw()) {
            return i10;
        }
        if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
            return ouw.ouw(vt(str), str2, i10);
        }
        return ouw.ouw(zih.ouw(), vt(str), str2, i10);
    }

    public static boolean ouw(String str, String str2) {
        if (ouw()) {
            return true;
        }
        if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
            return ouw.ouw(vt(str), str2, true);
        }
        return ouw.ouw(zih.ouw(), vt(str), str2, true);
    }

    public static long ouw(String str, String str2, long j10) {
        if (ouw()) {
            return j10;
        }
        if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
            return ouw.ouw(vt(str), str2, j10);
        }
        return ouw.ouw(zih.ouw(), vt(str), str2, j10);
    }

    public static void ouw(String str) {
        if (ouw()) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
            ouw.ouw(vt(str));
        } else {
            vt.vt(zih.ouw(), vt(str));
        }
    }

    private static <T> void ouw(String str, String str2, T t10) {
        String strOuw = ouw.ouw(str, str2);
        if (bly.fkw(strOuw)) {
            com.bytedance.sdk.component.vt.lh lhVarVt = com.bytedance.sdk.component.vt.ouw(zih.ouw(), vt(strOuw)).vt();
            vt.ouw(lhVarVt, str2, (Object) t10);
            lhVarVt.apply();
        } else {
            SharedPreferences sharedPreferencesOuw = vt.ouw(zih.ouw(), vt(strOuw));
            if (sharedPreferencesOuw == null) {
                return;
            }
            SharedPreferences.Editor editorEdit = sharedPreferencesOuw.edit();
            vt.ouw(editorEdit, str2, t10);
            editorEdit.apply();
        }
    }
}
