package com.bytedance.sdk.component.adexpress.yu;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public final class fkw {
    public static boolean ouw(String str) {
        if (com.bytedance.sdk.component.adexpress.yu.vt()) {
            if (TextUtils.equals(str, "embeded_ad") || TextUtils.equals(str, "banner_ad")) {
                return true;
            }
            return false;
        }
        return false;
    }
}
