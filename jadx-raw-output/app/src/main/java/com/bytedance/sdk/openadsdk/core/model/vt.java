package com.bytedance.sdk.openadsdk.core.model;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class vt {
    public boolean fkw;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public String f12893lh;
    public String ouw;
    public String vt;
    public String yu;

    public final JSONObject ouw() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(CampaignEx.JSON_KEY_PRIVACY_URL, this.f12893lh);
            jSONObject.put("privacy_title", this.yu);
            jSONObject.put("text", this.vt);
            jSONObject.put("icon", this.ouw);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
