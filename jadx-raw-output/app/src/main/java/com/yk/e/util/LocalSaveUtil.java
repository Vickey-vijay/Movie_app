package com.yk.e.util;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class LocalSaveUtil {
    public static final String FILE_NAME = "local_data";

    public static class SharedPreferencesCompat {
        private static final Method sApplyMethod = findApplyMethod();

        public static void apply(SharedPreferences.Editor editor) {
            try {
                Method method = sApplyMethod;
                if (method != null) {
                    method.invoke(editor, new Object[0]);
                    return;
                }
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
            }
            editor.commit();
        }

        private static Method findApplyMethod() {
            try {
                return SharedPreferences.Editor.class.getMethod("apply", new Class[0]);
            } catch (NoSuchMethodException unused) {
                return null;
            }
        }

        private SharedPreferencesCompat() {
        }
    }

    public static int getInt(Context context, String str, int i10) {
        return context.getSharedPreferences(FILE_NAME, 0).getInt(str, i10);
    }

    public static Set<String> getSetStr(Context context, String str) {
        return context.getSharedPreferences(FILE_NAME, 0).getStringSet(str, new HashSet());
    }

    public static String getString(Context context, String str, String str2) {
        return context.getSharedPreferences(FILE_NAME, 0).getString(str, str2);
    }

    public static void put(Context context, String str, Object obj) {
        if (obj != null) {
            try {
                SharedPreferences.Editor editorEdit = context.getSharedPreferences(FILE_NAME, 0).edit();
                if (obj instanceof String) {
                    editorEdit.putString(str, (String) obj);
                } else if (obj instanceof Integer) {
                    editorEdit.putInt(str, ((Integer) obj).intValue());
                } else if (obj instanceof Boolean) {
                    editorEdit.putBoolean(str, ((Boolean) obj).booleanValue());
                } else if (obj instanceof Float) {
                    editorEdit.putFloat(str, ((Float) obj).floatValue());
                } else if (obj instanceof Long) {
                    editorEdit.putLong(str, ((Long) obj).longValue());
                } else if (obj instanceof Set) {
                    editorEdit.putStringSet(str, (Set) obj);
                } else {
                    editorEdit.putString(str, obj.toString());
                }
                SharedPreferencesCompat.apply(editorEdit);
            } catch (Exception e10) {
                AdLog.e("LocalSaveUtil error, msg = " + e10.getMessage(), e10);
            }
        }
    }
}
