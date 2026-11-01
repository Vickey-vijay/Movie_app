package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes8.dex */
public final class ryl {
    public static String ouw(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return com.bytedance.sdk.openadsdk.multipro.yu.yu.vt(null, str, str2);
        } catch (Throwable unused) {
            return str2;
        }
    }
}
