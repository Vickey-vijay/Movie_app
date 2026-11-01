package com.inmobi.media;

import android.net.Uri;

/* JADX INFO: loaded from: classes5.dex */
public abstract class G3 {
    public static final boolean a(String str) {
        if (str == null || lk.a0.n0(str)) {
            return false;
        }
        String scheme = Uri.parse(str).getScheme();
        return !(scheme == null || scheme.length() == 0);
    }
}
