package com.bytedance.sdk.openadsdk.multipro.yu;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.le.ouw.le;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.openadsdk.core.bly;
import com.bytedance.sdk.openadsdk.core.zih;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.HashSet;

/* JADX INFO: loaded from: classes4.dex */
public final class ouw {
    public static HashSet<String> ouw = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.multipro.yu.ouw.1
        {
            add("app_id");
            add("tt_gdpr");
            add("extra_data");
            add("sdk_app_sha1");
            add(CommonUrlParts.UUID);
            add("android_system_ua");
            add("sdk_local_web_ua");
            add("sdk_local_rom_info");
        }
    };

    private static boolean ouw() {
        if (zih.ouw() != null) {
            return true;
        }
        ko.yu("The context of SPHelper is null, please initialize sdk in main process");
        return false;
    }

    private static le vt() {
        try {
            if (ouw()) {
                return com.bytedance.sdk.openadsdk.multipro.ouw.ouw.ouw(zih.ouw());
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static String lh() {
        return com.bytedance.sdk.openadsdk.multipro.yu.vt + "/t_sp/";
    }

    public static synchronized void ouw(String str, String str2, Boolean bool) {
        if (ouw()) {
            try {
                if (!com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
                    vt.ouw(zih.ouw(), str, str2, bool);
                    return;
                }
                le leVarVt = vt();
                if (leVarVt != null) {
                    Uri uri = Uri.parse(lh() + "boolean/" + str2 + vt(str));
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("value", bool);
                    leVarVt.ouw(uri, contentValues, null, null);
                }
            } catch (Throwable unused) {
            }
        }
    }

    private static String vt(String str) {
        return TextUtils.isEmpty(str) ? "" : "?sp_file_name=".concat(String.valueOf(str));
    }

    public static String vt(String str, String str2, String str3) {
        if (!ouw()) {
            return str3;
        }
        try {
            if (!com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
                return ouw(zih.ouw(), str, str2, str3);
            }
            le leVarVt = vt();
            if (leVarVt != null) {
                String strOuw = leVarVt.ouw(Uri.parse(lh() + "string/" + str2 + vt(str)));
                if (strOuw != null && !strOuw.equals("null")) {
                    return strOuw;
                }
            }
            return str3;
        } catch (Throwable unused) {
        }
    }

    public static void vt(String str, String str2) {
        if (ouw()) {
            try {
                if (!com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
                    vt.vt(zih.ouw(), str, str2);
                    return;
                }
                le leVarVt = vt();
                if (leVarVt != null) {
                    leVarVt.ouw(Uri.parse(lh() + "long/" + str2 + vt(str)), null, null);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static synchronized void ouw(String str, String str2, String str3) {
        if (ouw()) {
            try {
                if (!com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
                    vt.ouw(zih.ouw(), str, str2, str3);
                    return;
                }
                le leVarVt = vt();
                if (leVarVt != null) {
                    Uri uri = Uri.parse(lh() + "string/" + str2 + vt(str));
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("value", str3);
                    leVarVt.ouw(uri, contentValues, null, null);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static synchronized void ouw(String str, String str2, Integer num) {
        if (ouw()) {
            try {
                if (!com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
                    vt.ouw(zih.ouw(), str, str2, num);
                    return;
                }
                le leVarVt = vt();
                if (leVarVt != null) {
                    Uri uri = Uri.parse(lh() + "int/" + str2 + vt(str));
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("value", num);
                    leVarVt.ouw(uri, contentValues, null, null);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static synchronized void ouw(String str, String str2, Long l10) {
        if (ouw()) {
            try {
                if (!com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
                    vt.ouw(zih.ouw(), str, str2, l10);
                    return;
                }
                le leVarVt = vt();
                if (leVarVt != null) {
                    Uri uri = Uri.parse(lh() + "long/" + str2 + vt(str));
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("value", l10);
                    leVarVt.ouw(uri, contentValues, null, null);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static String ouw(Context context, String str, String str2, String str3) {
        String strOuw = ouw(str, str2);
        if (bly.fkw(strOuw)) {
            return com.bytedance.sdk.component.vt.ouw(context, strOuw).ouw(str2, str3);
        }
        SharedPreferences sharedPreferencesOuw = vt.ouw(context, strOuw);
        return sharedPreferencesOuw == null ? str3 : sharedPreferencesOuw.getString(str2, str3);
    }

    public static String ouw(String str, String str2) {
        return ouw.contains(str2) ? "pag_sp_bad_par" : str;
    }

    public static int ouw(String str, String str2, int i10) {
        if (!ouw()) {
            return i10;
        }
        try {
            if (!com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
                return ouw(zih.ouw(), str, str2, i10);
            }
            le leVarVt = vt();
            if (leVarVt != null) {
                String strOuw = leVarVt.ouw(Uri.parse(lh() + "int/" + str2 + vt(str)));
                if (strOuw != null && !strOuw.equals("null")) {
                    return Integer.parseInt(strOuw);
                }
            }
            return i10;
        } catch (Throwable unused) {
        }
    }

    public static int ouw(Context context, String str, String str2, int i10) {
        String strOuw = ouw(str, str2);
        if (bly.fkw(strOuw)) {
            return com.bytedance.sdk.component.vt.ouw(context, strOuw).ouw(str2, i10);
        }
        SharedPreferences sharedPreferencesOuw = vt.ouw(context, strOuw);
        return sharedPreferencesOuw == null ? i10 : sharedPreferencesOuw.getInt(str2, i10);
    }

    public static float ouw(Context context, String str, String str2) {
        String strOuw = ouw(str, str2);
        if (bly.fkw(strOuw)) {
            return com.bytedance.sdk.component.vt.ouw(context, strOuw).ouw(str2);
        }
        SharedPreferences sharedPreferencesOuw = vt.ouw(context, strOuw);
        if (sharedPreferencesOuw == null) {
            return 0.0f;
        }
        return sharedPreferencesOuw.getFloat(str2, 0.0f);
    }

    public static boolean ouw(String str, String str2, boolean z10) {
        if (!ouw()) {
            return z10;
        }
        try {
            if (!com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
                return ouw(zih.ouw(), str, str2, z10);
            }
            le leVarVt = vt();
            if (leVarVt != null) {
                String strOuw = leVarVt.ouw(Uri.parse(lh() + "boolean/" + str2 + vt(str)));
                if (strOuw != null && !strOuw.equals("null")) {
                    return Boolean.parseBoolean(strOuw);
                }
            }
            return z10;
        } catch (Throwable unused) {
        }
    }

    public static boolean ouw(Context context, String str, String str2, boolean z10) {
        String strOuw = ouw(str, str2);
        if (bly.fkw(strOuw)) {
            return com.bytedance.sdk.component.vt.ouw(context, strOuw).ouw(str2, z10);
        }
        SharedPreferences sharedPreferencesOuw = vt.ouw(context, strOuw);
        return sharedPreferencesOuw == null ? z10 : sharedPreferencesOuw.getBoolean(str2, z10);
    }

    public static long ouw(String str, String str2, long j10) {
        if (!ouw()) {
            return j10;
        }
        try {
            if (!com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
                return ouw(zih.ouw(), str, str2, j10);
            }
            le leVarVt = vt();
            if (leVarVt != null) {
                String strOuw = leVarVt.ouw(Uri.parse(lh() + "long/" + str2 + vt(str)));
                if (strOuw != null && !strOuw.equals("null")) {
                    return Long.parseLong(strOuw);
                }
            }
            return j10;
        } catch (Throwable unused) {
        }
    }

    public static long ouw(Context context, String str, String str2, long j10) {
        String strOuw = ouw(str, str2);
        if (bly.fkw(strOuw)) {
            return com.bytedance.sdk.component.vt.ouw(context, strOuw).ouw(str2, j10);
        }
        SharedPreferences sharedPreferencesOuw = vt.ouw(context, strOuw);
        return sharedPreferencesOuw == null ? j10 : sharedPreferencesOuw.getLong(str2, j10);
    }

    public static void ouw(String str) {
        if (ouw()) {
            try {
                if (!com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
                    vt.vt(zih.ouw(), str);
                    return;
                }
                le leVarVt = vt();
                if (leVarVt != null) {
                    leVarVt.ouw(Uri.parse(lh() + "clean" + vt(str)), null, null);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
