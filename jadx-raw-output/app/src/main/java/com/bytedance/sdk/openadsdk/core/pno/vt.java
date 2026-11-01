package com.bytedance.sdk.openadsdk.core.pno;

import com.bytedance.sdk.openadsdk.BuildConfig;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class vt {
    public static JSONObject ouw(String str, long j10) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", "over_freq");
            jSONObject.put("rit", str);
            jSONObject.put("ad_sdk_version", BuildConfig.VERSION_NAME);
            jSONObject.put("timestamp", j10);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
