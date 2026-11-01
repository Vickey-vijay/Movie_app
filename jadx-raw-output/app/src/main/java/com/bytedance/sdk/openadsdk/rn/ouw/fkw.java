package com.bytedance.sdk.openadsdk.rn.ouw;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class fkw {
    public static void ouw(final String str, final String str2, final int i10, final String str3) {
        com.bytedance.sdk.openadsdk.rn.lh.ouw(str, false, 10, new com.bytedance.sdk.openadsdk.rn.vt() { // from class: com.bytedance.sdk.openadsdk.rn.ouw.fkw.1
            @Override // com.bytedance.sdk.openadsdk.rn.vt
            public final lh ouw() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("url", str2);
                jSONObject.put("error_code", i10);
                jSONObject.put("error_msg", str3);
                yu yuVar = new yu();
                yuVar.ouw = str;
                yuVar.bly = jSONObject.toString();
                return yuVar;
            }
        });
    }
}
