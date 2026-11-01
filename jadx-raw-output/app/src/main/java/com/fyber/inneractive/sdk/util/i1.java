package com.fyber.inneractive.sdk.util;

/* JADX INFO: loaded from: classes4.dex */
public abstract class i1 {
    public static String a(String str, int i10) {
        if (i10 <= 0 || str.length() <= i10) {
            return str;
        }
        return str.substring(0, i10 - 3) + "...";
    }
}
