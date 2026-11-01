package com.bytedance.adsdk.ouw.vt.fkw;

/* JADX INFO: loaded from: classes8.dex */
public final class ouw {
    public static boolean ouw(char c10) {
        if (c10 < 'A' || c10 > 'Z') {
            return c10 >= 'a' && c10 <= 'z';
        }
        return true;
    }

    public static boolean vt(char c10) {
        return c10 >= '0' && c10 <= '9';
    }
}
