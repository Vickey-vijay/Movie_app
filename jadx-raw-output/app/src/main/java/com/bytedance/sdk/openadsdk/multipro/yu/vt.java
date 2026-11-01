package com.bytedance.sdk.openadsdk.multipro.yu;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.core.bly;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes7.dex */
final class vt {
    private static SoftReference<ConcurrentHashMap<String, Map<String, Object>>> ouw;

    @Nullable
    public static SharedPreferences ouw(Context context, String str) {
        if (context == null) {
            return null;
        }
        try {
            return context.getSharedPreferences(ouw(str), 0);
        } catch (Throwable th2) {
            qbp.yu("SPMultiHelperImpl", "getSharedPreferences error ", th2.getMessage());
            return null;
        }
    }

    private static void vt(String str) {
        Map<String, Object> map;
        SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = ouw;
        if (softReference == null || softReference.get() == null || (map = ouw.get().get(ouw(str))) == null) {
            return;
        }
        map.clear();
    }

    private static String ouw(String str) {
        return TextUtils.isEmpty(str) ? "sphelper_ttopenadsdk" : str;
    }

    private static Object ouw(String str, String str2) {
        ConcurrentHashMap<String, Map<String, Object>> concurrentHashMap;
        Map<String, Object> map;
        SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = ouw;
        if (softReference == null || (concurrentHashMap = softReference.get()) == null || (map = concurrentHashMap.get(ouw(str))) == null) {
            return null;
        }
        return map.get(str2);
    }

    public static void vt(Context context, String str, String str2) {
        try {
            String strOuw = ouw.ouw(str, str2);
            if (bly.fkw(strOuw)) {
                com.bytedance.sdk.component.vt.ouw(context, strOuw).vt().remove(str2).apply();
                return;
            }
            SharedPreferences sharedPreferencesOuw = ouw(context, strOuw);
            if (sharedPreferencesOuw == null) {
                return;
            }
            SharedPreferences.Editor editorEdit = sharedPreferencesOuw.edit();
            editorEdit.remove(str2);
            editorEdit.apply();
            SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = ouw;
            if (softReference == null || softReference.get() == null) {
                return;
            }
            Map<String, Object> map = ouw.get().get(ouw(strOuw));
            if (map != null && map.size() != 0) {
                map.remove(str2);
            }
        } catch (Throwable unused) {
        }
    }

    private static void ouw(String str, String str2, Object obj) {
        SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = ouw;
        if (softReference == null || softReference.get() == null) {
            ouw = new SoftReference<>(new ConcurrentHashMap());
        }
        String strOuw = ouw(str);
        ConcurrentHashMap<String, Map<String, Object>> concurrentHashMap = ouw.get();
        if (concurrentHashMap.get(strOuw) == null) {
            concurrentHashMap.put(strOuw, new HashMap());
        }
        concurrentHashMap.get(strOuw).put(str2, obj);
    }

    public static synchronized <T> void ouw(Context context, String str, String str2, T t10) {
        String strOuw = ouw.ouw(str, str2);
        if (bly.fkw(strOuw)) {
            com.bytedance.sdk.component.vt vtVarOuw = com.bytedance.sdk.component.vt.ouw(context, strOuw);
            if (t10.equals(ouw(strOuw, str2))) {
                return;
            }
            com.bytedance.sdk.component.vt.lh lhVarVt = vtVarOuw.vt();
            ouw(lhVarVt, str2, (Object) t10);
            lhVarVt.apply();
            ouw(strOuw, str2, t10);
            return;
        }
        SharedPreferences sharedPreferencesOuw = ouw(context, strOuw);
        if (sharedPreferencesOuw == null) {
            return;
        }
        if (t10.equals(ouw(strOuw, str2))) {
            return;
        }
        SharedPreferences.Editor editorEdit = sharedPreferencesOuw.edit();
        ouw(editorEdit, str2, t10);
        editorEdit.apply();
        ouw(strOuw, str2, t10);
    }

    public static void vt(Context context, String str) {
        if (bly.fkw(str)) {
            com.bytedance.sdk.component.vt.ouw(context, str).vt().clear().apply();
            vt(str);
            return;
        }
        SharedPreferences sharedPreferencesOuw = ouw(context, str);
        if (sharedPreferencesOuw == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = sharedPreferencesOuw.edit();
        editorEdit.clear();
        editorEdit.apply();
        vt(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void ouw(SharedPreferences.Editor editor, String str, T t10) {
        if (t10 instanceof Integer) {
            editor.putInt(str, ((Integer) t10).intValue());
        }
        if (t10 instanceof Long) {
            editor.putLong(str, ((Long) t10).longValue());
        }
        if (t10 instanceof Float) {
            editor.putFloat(str, ((Float) t10).floatValue());
        }
        if (t10 instanceof Boolean) {
            editor.putBoolean(str, ((Boolean) t10).booleanValue());
        }
        if (t10 instanceof String) {
            editor.putString(str, (String) t10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void ouw(com.bytedance.sdk.component.vt.lh lhVar, String str, T t10) {
        if (t10 instanceof Integer) {
            lhVar.putInt(str, ((Integer) t10).intValue());
        }
        if (t10 instanceof Long) {
            lhVar.putLong(str, ((Long) t10).longValue());
        }
        if (t10 instanceof Float) {
            lhVar.putFloat(str, ((Float) t10).floatValue());
        }
        if (t10 instanceof Boolean) {
            lhVar.putBoolean(str, ((Boolean) t10).booleanValue());
        }
        if (t10 instanceof String) {
            lhVar.putString(str, (String) t10);
        }
    }

    public static String ouw(Context context, String str, String str2, String str3) {
        Object objOuw = ouw(str, str2);
        if (objOuw != null) {
            return String.valueOf(objOuw);
        }
        String strOuw = ouw(str);
        Object objOuw2 = null;
        if (ouw(context, strOuw, str2)) {
            if (str3.equalsIgnoreCase(TypedValues.Custom.S_STRING)) {
                objOuw2 = ouw.ouw(context, strOuw, str2, (String) null);
            } else if (str3.equalsIgnoreCase(TypedValues.Custom.S_BOOLEAN)) {
                objOuw2 = Boolean.valueOf(ouw.ouw(context, strOuw, str2, false));
            } else if (str3.equalsIgnoreCase(ImpressionLog.f43647w)) {
                objOuw2 = Integer.valueOf(ouw.ouw(context, strOuw, str2, 0));
            } else if (str3.equalsIgnoreCase("long")) {
                objOuw2 = Long.valueOf(ouw.ouw(context, strOuw, str2, 0L));
            } else if (str3.equalsIgnoreCase(TypedValues.Custom.S_FLOAT)) {
                objOuw2 = Float.valueOf(ouw.ouw(context, strOuw, str2));
            } else if (str3.equalsIgnoreCase("string_set")) {
                objOuw2 = ouw.ouw(context, strOuw, str2, (String) null);
            }
        }
        ouw(str, str2, objOuw2);
        return String.valueOf(objOuw2);
    }

    public static boolean ouw(Context context, String str, String str2) {
        String strOuw = ouw.ouw(str, str2);
        if (bly.fkw(strOuw)) {
            return com.bytedance.sdk.component.vt.ouw(context, strOuw).vt(str2);
        }
        SharedPreferences sharedPreferencesOuw = ouw(context, strOuw);
        return sharedPreferencesOuw != null && sharedPreferencesOuw.contains(str2);
    }
}
