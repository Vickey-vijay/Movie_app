package com.bytedance.sdk.component.adexpress.yu;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class le {
    private static boolean vt(String str) {
        return TextUtils.equals(str, "fullscreen_interstitial_ad") || TextUtils.equals(str, "rewarded_video");
    }

    public static boolean ouw(String str) {
        if (com.bytedance.sdk.component.adexpress.yu.vt() && vt(str)) {
            return true;
        }
        return false;
    }
}
