package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.ironsource.C3605n2;
import com.ironsource.mediationsdk.d;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class od {
    public static void ouw(com.bytedance.sdk.openadsdk.core.model.vpp vppVar, Double d10) {
        Map<String, Object> map;
        if (vppVar == null || (map = vppVar.npr) == null) {
            return;
        }
        try {
            Object obj = map.get(TTAdConstant.SDK_BIDDING_TYPE);
            if (obj != null && Integer.parseInt(obj.toString()) == 2) {
                String strReplace = (String) map.get(C3605n2.A);
                if (TextUtils.isEmpty(strReplace)) {
                    return;
                }
                if (d10 != null) {
                    strReplace = strReplace.replace("${AUCTION_BID_TO_WIN}", String.valueOf(d10));
                }
                com.bytedance.sdk.openadsdk.core.zih.lh().ouw(strReplace);
            }
        } catch (Throwable unused) {
            com.bytedance.sdk.component.utils.qbp.yu("report Win error", new Object[0]);
        }
    }

    public static void ouw(com.bytedance.sdk.openadsdk.core.model.vpp vppVar, Double d10, String str, String str2) {
        Map<String, Object> map;
        if (vppVar == null || (map = vppVar.npr) == null) {
            return;
        }
        try {
            Object obj = map.get(TTAdConstant.SDK_BIDDING_TYPE);
            if (obj != null && Integer.parseInt(obj.toString()) == 2) {
                String strReplace = (String) map.get(C3605n2.f30220z);
                if (TextUtils.isEmpty(strReplace)) {
                    return;
                }
                if (d10 != null) {
                    strReplace = strReplace.replace(d.f29602n, String.valueOf(d10));
                }
                if (str != null) {
                    strReplace = strReplace.replace(d.f29600l, str);
                }
                if (str2 != null) {
                    strReplace = strReplace.replace("${AUCTION_WINNER}", str2);
                }
                com.bytedance.sdk.openadsdk.core.zih.lh().ouw(strReplace);
            }
        } catch (Throwable unused) {
            com.bytedance.sdk.component.utils.qbp.yu("report Loss error", new Object[0]);
        }
    }
}
