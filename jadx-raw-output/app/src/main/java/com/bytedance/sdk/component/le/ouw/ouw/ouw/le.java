package com.bytedance.sdk.component.le.ouw.ouw.ouw;

import android.text.TextUtils;
import android.util.Base64;

/* JADX INFO: loaded from: classes8.dex */
public final class le {
    public static String ouw(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return Base64.encodeToString(str.getBytes(), 10);
    }

    public static String vt(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return new String(Base64.decode(str, 10));
    }
}
