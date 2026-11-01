package com.bytedance.sdk.openadsdk.core.bly;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.pd;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class cf {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static void ouw(String str, int i10, String str2, String str3, String str4, com.bytedance.sdk.openadsdk.core.model.vpp vppVar) {
        String strUx;
        if (TextUtils.isEmpty(str2)) {
            str2 = com.bytedance.sdk.openadsdk.core.pno.ouw(i10);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("render_source", str);
            com.bytedance.sdk.openadsdk.core.model.vpp.ouw ouwVar = vppVar.f12886xn;
            if (ouwVar != null) {
                jSONObject.put("tpl_id", ouwVar.ouw);
                if ("Web".equals(str)) {
                    if (ouwVar.ouw()) {
                        jSONObject.put("engine_version", "v3");
                    } else {
                        jSONObject.put("engine_version", "v1");
                    }
                }
            } else {
                pd pdVar = vppVar.lht;
                if (pdVar != null) {
                    jSONObject.put("tpl_id", pdVar.ouw);
                    if ("Web".equals(str)) {
                        jSONObject.put("engine_version", "v3");
                    }
                }
            }
        } catch (Exception unused) {
        }
        com.bytedance.sdk.openadsdk.rn.ouw.yu yuVar = new com.bytedance.sdk.openadsdk.rn.ouw.yu();
        str3.hashCode();
        byte b10 = -1;
        int i11 = 3;
        switch (str3.hashCode()) {
            case -1695837674:
                if (str3.equals("banner_ad")) {
                    b10 = 0;
                }
                break;
            case -1364000502:
                if (str3.equals("rewarded_video")) {
                    b10 = 1;
                }
                break;
            case -1263194568:
                if (str3.equals("open_ad")) {
                    b10 = 2;
                }
                break;
            case -764631662:
                if (str3.equals("fullscreen_interstitial_ad")) {
                    b10 = 3;
                }
                break;
            case -712491894:
                if (str3.equals("embeded_ad")) {
                    b10 = 4;
                }
                break;
            case 1844104722:
                if (str3.equals("interaction")) {
                    b10 = 5;
                }
                break;
        }
        switch (b10) {
            case 0:
                i11 = 1;
                break;
            case 1:
                i11 = 7;
                break;
            case 2:
                break;
            case 3:
                i11 = 8;
                break;
            case 4:
            default:
                i11 = 5;
                break;
            case 5:
                i11 = 2;
                break;
        }
        yuVar.yu = i11;
        yuVar.vt = str4;
        if (vppVar != null) {
            strUx = vppVar.ux();
        } else {
            strUx = "";
        }
        yuVar.fkw = strUx;
        yuVar.f13321le = i10;
        yuVar.bly = jSONObject.toString();
        yuVar.f13323ra = str2;
        com.bytedance.sdk.openadsdk.rn.lh.ouw().ouw(yuVar);
    }
}
