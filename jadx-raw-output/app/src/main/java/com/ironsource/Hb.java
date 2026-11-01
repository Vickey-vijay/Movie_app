package com.ironsource;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class Hb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f26762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f26763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f26764c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f26765d;

    public Hb(JSONObject jSONObject) {
        ck.p.j(jSONObject, "applicationLogger");
        this.f26762a = jSONObject.optInt("server", 3);
        this.f26763b = jSONObject.optInt("publisher", 3);
        this.f26764c = jSONObject.optInt("console", 3);
        this.f26765d = jSONObject.optBoolean("shouldSendPublisherLogsOnUIThread", false);
    }

    public final int a() {
        return this.f26764c;
    }

    public final int b() {
        return this.f26763b;
    }

    public final int c() {
        return this.f26762a;
    }

    public final boolean d() {
        return this.f26765d;
    }
}
