package io.bidmachine.utils;

import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class SharedPreferenceUtils {
    public static void remove(@NonNull SharedPreferences sharedPreferences, @NonNull String str) {
        sharedPreferences.edit().remove(str).apply();
    }

    public static void putLong(@NonNull SharedPreferences sharedPreferences, @NonNull String str, @Nullable Long l10) {
        if (l10 == null) {
            remove(sharedPreferences, str);
        } else {
            sharedPreferences.edit().putLong(str, l10.longValue()).apply();
        }
    }

    public static void putString(@NonNull SharedPreferences sharedPreferences, @NonNull String str, @Nullable String str2) {
        if (str2 == null) {
            remove(sharedPreferences, str);
        } else {
            sharedPreferences.edit().putString(str, str2).apply();
        }
    }

    public static void clear(@NonNull SharedPreferences sharedPreferences) {
        Iterator<String> it = sharedPreferences.getAll().keySet().iterator();
        while (it.hasNext()) {
            sharedPreferences.edit().remove(it.next()).apply();
        }
    }

    public static int optInt(@NonNull SharedPreferences sharedPreferences, @NonNull String str, int i10) {
        try {
            if (sharedPreferences.contains(str)) {
                return sharedPreferences.getInt(str, i10);
            }
        } catch (Exception unused) {
        }
        return i10;
    }

    public static long optLong(@NonNull SharedPreferences sharedPreferences, @NonNull String str, long j10) {
        try {
            if (sharedPreferences.contains(str)) {
                return sharedPreferences.getLong(str, j10);
            }
        } catch (Exception unused) {
        }
        return j10;
    }

    @Nullable
    public static String optString(@NonNull SharedPreferences sharedPreferences, @NonNull String str, @Nullable String str2) {
        String string;
        try {
            if (sharedPreferences.contains(str) && (string = sharedPreferences.getString(str, str2)) != null) {
                return string;
            }
            return str2;
        } catch (Exception unused) {
        }
    }

    public static void remove(@NonNull SharedPreferences sharedPreferences, @NonNull String... strArr) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        for (String str : strArr) {
            editorEdit.remove(str);
        }
        editorEdit.apply();
    }
}
