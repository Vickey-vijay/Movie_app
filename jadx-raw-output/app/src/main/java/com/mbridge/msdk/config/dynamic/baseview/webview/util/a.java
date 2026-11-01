package com.mbridge.msdk.config.dynamic.baseview.webview.util;

import android.net.Uri;
import android.text.TextUtils;
import com.safedk.android.internal.SafeDKWebAppInterface;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* JADX INFO: compiled from: MBHybridUtil.java */
/* JADX INFO: loaded from: classes2.dex */
public class a {
    public static String a(String str) {
        String queryParameter;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Uri uri = Uri.parse(str);
        String scheme = uri.getScheme();
        Object[] array = uri.getQueryParameterNames().toArray();
        if (!TextUtils.isEmpty(scheme) && scheme.equals("js")) {
            return SafeDKWebAppInterface.f44738f + uri.getQueryParameter(String.valueOf(array[0]));
        }
        if (!TextUtils.isEmpty(scheme) && scheme.equals("mv")) {
            String queryParameter2 = uri.getQueryParameter(String.valueOf(array[0]));
            if (array.length > 1) {
                queryParameter = uri.getQueryParameter(String.valueOf(array[1]));
            } else {
                queryParameter = "";
            }
            return "javascript:window.WindVane." + uri.getHost() + "(" + queryParameter2 + StringUtils.COMMA + queryParameter + ");";
        }
        return str;
    }
}
