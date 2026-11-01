package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.ra, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C3682ra {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f30621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private JSONObject f30622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f30623c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f30624d;

    public String a() {
        return this.f30624d;
    }

    public String b() {
        return this.f30621a;
    }

    public JSONObject c() {
        return this.f30622b;
    }

    public String d() {
        return this.f30623c;
    }

    public C3682ra(JSONObject jSONObject) {
        this.f30621a = jSONObject.optString(C3426d4.g.f28493b);
        this.f30622b = jSONObject.optJSONObject(C3426d4.g.f28494c);
        this.f30623c = jSONObject.optString("success");
        this.f30624d = jSONObject.optString(C3426d4.g.f28496e);
    }

    public JSONObject e() {
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        try {
            jSONObjectJsonObjectInit.put(C3426d4.g.f28493b, this.f30621a);
            jSONObjectJsonObjectInit.put(C3426d4.g.f28494c, this.f30622b);
            jSONObjectJsonObjectInit.put("success", this.f30623c);
            jSONObjectJsonObjectInit.put(C3426d4.g.f28496e, this.f30624d);
        } catch (JSONException e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
        return jSONObjectJsonObjectInit;
    }
}
