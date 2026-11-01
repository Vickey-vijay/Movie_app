package com.ironsource;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class I3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Boolean f26791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Integer f26792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final N3 f26793c;

    public I3(JSONObject jSONObject) {
        ck.p.j(jSONObject, "features");
        this.f26791a = jSONObject.has("enabled") ? Boolean.valueOf(jSONObject.getBoolean("enabled")) : null;
        this.f26792b = jSONObject.has(Ne.f27150l1) ? Integer.valueOf(jSONObject.getInt(Ne.f27150l1)) : null;
        this.f26793c = jSONObject.has(Ne.f27158n1) ? N3.f27081c.a(jSONObject.optString(Ne.f27158n1)) : null;
    }

    public final Boolean a() {
        return this.f26791a;
    }

    public final Integer b() {
        return this.f26792b;
    }

    public final N3 c() {
        return this.f26793c;
    }
}
