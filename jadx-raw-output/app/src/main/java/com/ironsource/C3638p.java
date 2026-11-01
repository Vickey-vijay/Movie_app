package com.ironsource;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3638p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Boolean f30378a;

    public C3638p(JSONObject jSONObject) {
        ck.p.j(jSONObject, "adFormatAuctionSettings");
        this.f30378a = jSONObject.has("isLoadWhileShow") ? Boolean.valueOf(jSONObject.optBoolean("isLoadWhileShow")) : null;
    }

    public final Boolean a() {
        return this.f30378a;
    }
}
