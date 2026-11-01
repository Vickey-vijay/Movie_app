package com.ironsource;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class Hd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f26766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Integer f26767b;

    public Hd(JSONObject jSONObject, String str, String str2) {
        ck.p.j(jSONObject, "features");
        ck.p.j(str, "nameKey");
        ck.p.j(str2, "amountKey");
        this.f26766a = jSONObject.has(str) ? jSONObject.getString(str) : null;
        this.f26767b = jSONObject.has(str2) ? Integer.valueOf(jSONObject.getInt(str2)) : null;
    }

    public final Integer a() {
        return this.f26767b;
    }

    public final String b() {
        return this.f26766a;
    }
}
