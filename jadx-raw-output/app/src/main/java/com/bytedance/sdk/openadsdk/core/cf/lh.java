package com.bytedance.sdk.openadsdk.core.cf;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.settings.cf;

/* JADX INFO: loaded from: classes2.dex */
public final class lh {
    public static String ouw(String str) {
        return TextUtils.isEmpty(str) ? str : ouw(cf.vt().tlj(), str);
    }

    public static String ouw(String str, String str2) {
        if (TextUtils.isEmpty(str2) || str2.startsWith("http://") || str2.startsWith("https://")) {
            return str2;
        }
        if (!TextUtils.isEmpty(str) && !str.endsWith("/")) {
            return str + "/static/" + str2;
        }
        return str + "static/" + str2;
    }
}
