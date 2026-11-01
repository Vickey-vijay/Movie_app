package com.inmobi.ads;

import ck.p;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class AdMetaInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONObject f22273b;

    public AdMetaInfo(String str, JSONObject jSONObject) {
        p.j(str, "creativeID");
        this.f22272a = str;
        this.f22273b = jSONObject;
    }

    public final double getBid() {
        JSONObject jSONObject = this.f22273b;
        if (jSONObject != null) {
            return jSONObject.optDouble("buyerPrice");
        }
        return 0.0d;
    }

    public final JSONObject getBidInfo() {
        JSONObject jSONObject = this.f22273b;
        return jSONObject == null ? new JSONObject() : jSONObject;
    }

    public final String getBidKeyword() {
        JSONObject jSONObject = this.f22273b;
        if (jSONObject != null) {
            return jSONObject.optString("bidKeyword");
        }
        return null;
    }

    public final String getCreativeID() {
        return this.f22272a;
    }
}
