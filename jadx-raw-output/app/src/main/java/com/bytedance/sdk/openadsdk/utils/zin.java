package com.bytedance.sdk.openadsdk.utils;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.ironsource.C3426d4;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class zin {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public static final String[] f13456lh = {"api16-access-ttp.tiktokpangle.us", "api16-access-ttp-b.tiktokpangle.us", "api16-access-ttp.tiktokpangle-b.us", "api16-access-ttp-b.tiktokpangle-b.us"};
    public static int ouw = Integer.MIN_VALUE;
    public static int vt = Integer.MIN_VALUE;

    public static String ouw() {
        if (ouw == Integer.MIN_VALUE) {
            ouw = com.bytedance.sdk.openadsdk.core.bly.fkw();
        }
        if (ouw < 0) {
            ouw = 0;
        }
        String[] strArr = f13456lh;
        try {
            return strArr[ouw % strArr.length];
        } catch (Throwable unused) {
            com.bytedance.sdk.component.utils.ko.lh("NetUtils", "index out of bounds");
            return strArr[0];
        }
    }

    public static synchronized void vt() {
        if (vt == 0) {
            return;
        }
        vt = 0;
        com.bytedance.sdk.openadsdk.core.bly.vt(0);
    }

    public static synchronized void ouw(String str) {
        if (str == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            try {
                String[] strArr = f13456lh;
                if (i10 >= strArr.length) {
                    break;
                }
                if (str.contains(strArr[i10])) {
                    int i11 = ouw + 1;
                    ouw = i11;
                    com.bytedance.sdk.openadsdk.core.bly.ouw(i11);
                    break;
                }
                i10++;
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.ko.fkw("NetUtils", th2.getMessage());
            }
        }
        if (str.contains("/api/ad/union/sdk/settings/") || str.contains("/api/ad/union/sdk/strategies/adn")) {
            if (vt == Integer.MIN_VALUE) {
                vt = com.bytedance.sdk.openadsdk.core.bly.le();
            }
            int i12 = vt + 1;
            vt = i12;
            if (i12 >= 3) {
                final String strVm = com.bytedance.sdk.openadsdk.core.settings.cf.vt().vm();
                final int i13 = vt;
                com.bytedance.sdk.openadsdk.core.settings.fkw.ouw ouwVarOuw = com.bytedance.sdk.openadsdk.core.settings.cf.vt().pno.ouw();
                ouwVarOuw.ouw("settings_url", "");
                ouwVarOuw.ouw();
                com.bytedance.sdk.openadsdk.core.settings.cf.vpp("");
                vt = 0;
                com.bytedance.sdk.openadsdk.rn.lh.ouw();
                com.bytedance.sdk.openadsdk.rn.lh.ouw("clear_domain", false, new com.bytedance.sdk.openadsdk.rn.vt() { // from class: com.bytedance.sdk.openadsdk.utils.zin.1
                    @Override // com.bytedance.sdk.openadsdk.rn.vt
                    public final com.bytedance.sdk.openadsdk.rn.ouw.lh ouw() throws Exception {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put(C3426d4.j.D, strVm);
                            jSONObject.put("times", i13);
                        } catch (Exception e10) {
                            com.bytedance.sdk.component.utils.ko.lh("NetUtils", "run: ", e10);
                        }
                        com.bytedance.sdk.openadsdk.rn.ouw.yu yuVar = new com.bytedance.sdk.openadsdk.rn.ouw.yu();
                        yuVar.ouw = "clear_domain";
                        yuVar.bly = jSONObject.toString();
                        return yuVar;
                    }
                });
            }
            com.bytedance.sdk.openadsdk.core.bly.vt(vt);
        }
    }

    public static void ouw(com.bytedance.sdk.component.bly.le leVar, String str) {
        HashMap map = new HashMap();
        map.put("Referer", TTAdConstant.REQUEST_HEAD_REFERER);
        leVar.ouw(str, map);
    }
}
