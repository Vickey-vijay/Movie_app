package com.ironsource;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.ad, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3381ad {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Boolean f28153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Integer f28154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final N3 f28155c;

    public C3381ad(JSONObject jSONObject) {
        ck.p.j(jSONObject, "features");
        this.f28153a = jSONObject.has("enabled") ? Boolean.valueOf(jSONObject.getBoolean("enabled")) : null;
        this.f28154b = jSONObject.has(Ne.f27154m1) ? Integer.valueOf(jSONObject.getInt(Ne.f27154m1)) : null;
        this.f28155c = N3.Second;
    }

    public final Boolean a() {
        return this.f28153a;
    }

    public final Integer b() {
        return this.f28154b;
    }

    public final N3 c() {
        return this.f28155c;
    }
}
