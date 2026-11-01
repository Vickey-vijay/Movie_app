package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.ironsource.C3426d4;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JSONObject f9862a;

    public enum a {
        NEUTRAL,
        POSITIVE,
        NEGATIVE
    }

    public static x0 a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        String string = JsonUtils.getString(JsonUtils.getJSONObject(jSONObject, "title", (JSONObject) null), C3426d4.i.W, null);
        if ("TOS".equalsIgnoreCase(string) && kVar.x().h() == null) {
            return null;
        }
        if ("PP".equalsIgnoreCase(string) && kVar.x().f() == null) {
            return null;
        }
        return new x0(jSONObject);
    }

    public String b() {
        return JsonUtils.getString(this.f9862a, "event", null);
    }

    public a c() {
        String string = JsonUtils.getString(this.f9862a, "style", null);
        if ("default".equalsIgnoreCase(string)) {
            return a.POSITIVE;
        }
        return ("destructive".equalsIgnoreCase(string) || "cancel".equalsIgnoreCase(string)) ? a.NEGATIVE : a.NEUTRAL;
    }

    public String d() {
        JSONObject jSONObject = JsonUtils.getJSONObject(this.f9862a, "title", (JSONObject) null);
        return com.applovin.impl.sdk.k.a(JsonUtils.getString(jSONObject, C3426d4.i.W, ""), JsonUtils.optList(JsonUtils.getJSONArray(jSONObject, "replacements", null), null));
    }

    public String toString() {
        return "ConsentFlowStateAlertAction{title=" + d() + ", destinationStateId=" + a() + ", event=" + b() + com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f44172e;
    }

    private x0(JSONObject jSONObject) {
        this.f9862a = jSONObject;
    }

    public int a() {
        return JsonUtils.getInt(this.f9862a, "destination_state_id", -1);
    }
}
