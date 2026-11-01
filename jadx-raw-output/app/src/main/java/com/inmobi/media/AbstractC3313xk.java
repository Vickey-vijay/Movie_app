package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.xk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC3313xk {
    public static int a(String str) {
        if (lk.x.R(str, "track_", false, 2, null)) {
            str = str.substring(6);
            ck.p.i(str, "substring(...)");
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }
}
