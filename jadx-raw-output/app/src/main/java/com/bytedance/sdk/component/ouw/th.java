package com.bytedance.sdk.component.ouw;

import android.text.TextUtils;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.h;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* JADX INFO: loaded from: classes7.dex */
final class th {
    public static boolean ouw;

    public static String ouw(Throwable th2) {
        StringBuilder sb2 = new StringBuilder("{\"code\":");
        sb2.append(th2 instanceof rn ? ((rn) th2).ouw : 0);
        sb2.append(h.f44172e);
        return sb2.toString();
    }

    public static String ouw(String str, boolean z10) {
        if (TextUtils.isEmpty(str)) {
            return "{\"code\":1}";
        }
        String strSubstring = (!ouw || z10) ? "" : str.substring(1, str.length() - 1);
        String strConcat = "{\"code\":1,\"__data\":".concat(String.valueOf(str));
        if (strSubstring.isEmpty()) {
            return strConcat + h.f44172e;
        }
        return strConcat + StringUtils.COMMA + strSubstring + h.f44172e;
    }
}
