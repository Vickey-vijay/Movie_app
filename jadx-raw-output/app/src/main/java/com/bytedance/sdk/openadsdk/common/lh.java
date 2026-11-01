package com.bytedance.sdk.openadsdk.common;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.ksc;
import com.ironsource.Z3;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* JADX INFO: loaded from: classes2.dex */
public final class lh {
    private static String ouw;

    public static String ouw() {
        int iOuw = ksc.ouw(com.bytedance.sdk.openadsdk.core.zih.ouw(), 60000L);
        if (iOuw == 2) {
            return "2g";
        }
        if (iOuw == 3) {
            return Z3.f27966a;
        }
        if (iOuw == 4) {
            return "wifi";
        }
        if (iOuw != 5) {
            return iOuw != 6 ? "mobile" : "5g";
        }
        return "4g";
    }

    public static String vt() {
        try {
            if (!TextUtils.isEmpty(ouw)) {
                return ouw;
            }
            String strOuw = com.bytedance.sdk.openadsdk.core.bly.ouw("sdk_app_sha1", 259200000L);
            ouw = strOuw;
            if (ouw(strOuw)) {
                return ouw;
            }
            String strOuw2 = com.bytedance.sdk.component.utils.lh.ouw(com.bytedance.sdk.openadsdk.core.zih.ouw());
            ouw = strOuw2;
            if (ouw(strOuw2)) {
                String upperCase = ouw.toUpperCase();
                ouw = upperCase;
                com.bytedance.sdk.openadsdk.core.bly.ouw("sdk_app_sha1", upperCase);
                return ouw;
            }
            return "";
        } catch (Exception unused) {
        }
    }

    private static boolean ouw(String str) {
        String[] strArrSplit;
        if (TextUtils.isEmpty(str) || (strArrSplit = str.split(StringUtils.PROCESS_POSTFIX_DELIMITER)) == null || strArrSplit.length < 20) {
            return false;
        }
        for (String str2 : strArrSplit) {
            if (!"00".equals(str2)) {
                return true;
            }
        }
        return false;
    }
}
