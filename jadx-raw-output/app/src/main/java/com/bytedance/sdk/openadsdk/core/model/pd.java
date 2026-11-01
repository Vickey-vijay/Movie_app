package com.bytedance.sdk.openadsdk.core.model;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class pd {
    public JSONObject fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public ouw f12796le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public String f12797lh;
    public String ouw;
    public String vt;
    public String yu;

    public static pd ouw(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        pd pdVar = new pd();
        pdVar.ouw = jSONObject.optString("id");
        pdVar.yu = jSONObject.optString("data");
        pdVar.f12797lh = jSONObject.optString("url");
        pdVar.vt = jSONObject.optString("md5");
        pdVar.fkw = jSONObject.optJSONObject("custom_components");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("preload");
        if (jSONObjectOptJSONObject != null) {
            pdVar.f12796le = ouw.ouw(jSONObjectOptJSONObject);
        }
        return pdVar;
    }

    public static class ouw {

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public JSONArray f12798lh;
        public JSONArray ouw;
        public JSONArray vt;

        public static ouw ouw(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("image");
            ouw ouwVar = new ouw();
            ouwVar.ouw = jSONArrayOptJSONArray;
            ouwVar.vt = jSONObject.optJSONArray("fetch");
            ouwVar.f12798lh = jSONObject.optJSONArray("script");
            return ouwVar;
        }

        public final JSONObject ouw() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("image", this.ouw);
                jSONObject.put("fetch", this.vt);
                jSONObject.put("script", this.f12798lh);
            } catch (JSONException e10) {
                com.bytedance.sdk.component.utils.ko.fkw("PreloadModel", e10.getMessage());
            }
            return jSONObject;
        }
    }

    public final JSONObject ouw() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.ouw);
            jSONObject.put("md5", this.vt);
            jSONObject.put("url", this.f12797lh);
            jSONObject.put("data", this.yu);
            jSONObject.put("custom_components", this.fkw);
            ouw ouwVar = this.f12796le;
            if (ouwVar != null) {
                jSONObject.put("preload", ouwVar.ouw());
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
