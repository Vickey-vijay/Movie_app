package com.bytedance.sdk.openadsdk.core.model;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class jg {
    public final int ouw;
    public final int vt;

    public final JSONObject ouw() {
        try {
            JSONObject jSONObject = new JSONObject();
            int i10 = this.ouw;
            if (i10 == 1) {
                jSONObject.put("auto_click", i10);
            }
            if (this.vt == 1) {
                jSONObject.put("hidden_bar", 1);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public jg(JSONObject jSONObject) {
        this.ouw = jSONObject.optInt("auto_click", 0);
        this.vt = jSONObject.optInt("hidden_bar", 0);
    }
}
