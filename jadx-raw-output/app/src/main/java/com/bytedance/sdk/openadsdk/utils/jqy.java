package com.bytedance.sdk.openadsdk.utils;

import android.os.Build;
import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
public final class jqy {
    public static boolean ouw() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 33) {
            return i10 >= 32 && ouw("T", Build.VERSION.CODENAME);
        }
        return true;
    }

    private static boolean ouw(String str, String str2) {
        if ("REL".equals(str2)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        return str2.toUpperCase(locale).compareTo(str.toUpperCase(locale)) >= 0;
    }
}
