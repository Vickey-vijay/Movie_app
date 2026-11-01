package com.ironsource;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class Ve {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private We f27807a;

    public Ve(JSONObject jSONObject) {
        ck.p.j(jSONObject, "config");
        this.f27807a = We.f27840b.a(jSONObject.optInt(C3426d4.a.f28427t, We.CurrentlyLoadedAds.b()));
    }

    public final We a() {
        return this.f27807a;
    }
}
