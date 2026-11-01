package com.bytedance.sdk.openadsdk.core.cf.pno;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class ouw {
    public String fkw;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public String f12650lh;
    public String ouw;
    public String vt;
    public String yu;

    public final JSONObject ouw(ouw ouwVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.ouw);
            jSONObject.put("md5", this.vt);
            jSONObject.put("url", this.f12650lh);
            if (ouwVar != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("id", ouwVar.ouw);
                jSONObject2.put("md5", ouwVar.vt);
                jSONObject2.put("url", ouwVar.f12650lh);
                jSONObject.put("overlay", jSONObject2);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
