package com.inmobi.media;

import android.content.Context;

/* JADX INFO: loaded from: classes7.dex */
public abstract class Kf {
    public static final boolean a(Context context, String str) {
        ck.p.j(str, "permission");
        if (context == null) {
            return false;
        }
        try {
            return context.checkCallingOrSelfPermission(str) == 0;
        } catch (Exception unused) {
        }
    }
}
