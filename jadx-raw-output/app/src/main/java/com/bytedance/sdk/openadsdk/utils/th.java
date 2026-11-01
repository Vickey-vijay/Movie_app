package com.bytedance.sdk.openadsdk.utils;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes2.dex */
public final class th {
    public static void ouw(Uri uri, com.bytedance.sdk.openadsdk.core.bs bsVar) {
        if (bsVar == null || !com.bytedance.sdk.openadsdk.core.bs.ouw(uri)) {
            return;
        }
        try {
            bsVar.vt(uri);
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.ko.yu("WebView", "TTAndroidObj handleUri exception: ".concat(String.valueOf(e10)));
        }
    }

    public static String ouw(WebView webView) {
        if (webView == null) {
            return "";
        }
        String userAgentString = webView.getSettings().getUserAgentString();
        if (TextUtils.isEmpty(userAgentString)) {
            return "";
        }
        return userAgentString + " open_news open_news_u_s/7808";
    }
}
