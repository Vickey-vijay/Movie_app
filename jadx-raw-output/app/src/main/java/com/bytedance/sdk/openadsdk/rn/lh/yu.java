package com.bytedance.sdk.openadsdk.rn.lh;

import com.ironsource.Q6;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class yu {

    public static class ouw {
        public final String ouw;
        public final JSONObject vt;

        public ouw(String str, JSONObject jSONObject) {
            this.ouw = str;
            this.vt = jSONObject;
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("device_info");
            if (jSONObjectOptJSONObject != null) {
                try {
                    jSONObjectOptJSONObject.put(Q6.V0, com.bytedance.sdk.openadsdk.qbp.ouw.vt.ouw.ouw().vt());
                    jSONObject.put("device_info", jSONObjectOptJSONObject);
                } catch (JSONException unused) {
                }
            }
        }
    }
}
