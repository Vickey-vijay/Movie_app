package com.bytedance.adsdk.ouw.vt.lh.ouw;

import java.util.Deque;

/* JADX INFO: loaded from: classes2.dex */
public abstract class le {
    public abstract int ouw(String str, int i10, Deque<com.bytedance.adsdk.ouw.vt.vt.ouw> deque, com.bytedance.adsdk.ouw.vt.lh.ouw ouwVar);

    public static char ouw(int i10, String str) {
        if (i10 >= str.length()) {
            return (char) 26;
        }
        return str.charAt(i10);
    }

    public static int vt(int i10, String str) {
        boolean z10;
        while (true) {
            if (ouw(i10, str) == ' ') {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                i10++;
            } else {
                return i10;
            }
        }
    }
}
