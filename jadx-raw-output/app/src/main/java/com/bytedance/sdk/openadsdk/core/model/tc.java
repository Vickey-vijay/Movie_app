package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class tc {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public int f12805lh;
    public int ouw;
    public int vt;
    public String yu = "Next Ad";

    public static tc ouw(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        tc tcVar = new tc();
        try {
            int iMax = Math.max(jSONObject.optInt("endcard_show_time", 0), 0);
            int iOptInt = jSONObject.optInt("is_allow_pause", 0);
            int iOptInt2 = jSONObject.optInt(CampaignEx.JSON_KEY_LANDING_TYPE, 0);
            String strOptString = jSONObject.optString("endcard_next_ad_text", "Next Ad");
            tcVar.ouw = iMax;
            tcVar.vt = iOptInt;
            tcVar.yu = strOptString;
            tcVar.f12805lh = iOptInt2;
        } catch (Throwable unused) {
        }
        return tcVar;
    }

    public final JSONObject ouw() {
        JSONObject jSONObject = new JSONObject();
        try {
            int i10 = this.ouw;
            if (i10 != -1) {
                jSONObject.put("endcard_show_time", i10);
            }
            jSONObject.put("is_allow_pause", this.vt);
            jSONObject.put(CampaignEx.JSON_KEY_LANDING_TYPE, this.f12805lh);
            if (!TextUtils.isEmpty(this.yu)) {
                jSONObject.put("endcard_next_ad_text", this.yu);
            }
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }
}
