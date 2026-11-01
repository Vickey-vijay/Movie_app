package com.ironsource;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class K1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JSONObject f26903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f26904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f26905c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f26906d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f26907e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f26908f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f26909g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f26910h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f26911i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f26912j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f26913k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final JSONObject f26914l;

    private final JSONObject a() {
        return this.f26903a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof K1) && ck.p.e(this.f26903a, ((K1) obj).f26903a);
    }

    public K1(JSONObject jSONObject) {
        ck.p.j(jSONObject, "config");
        this.f26903a = jSONObject;
        this.f26904b = jSONObject.optBoolean("isExternalArmEventsEnabled", true);
        String strOptString = jSONObject.optString("externalArmEventsUrl", T5.f27679j);
        ck.p.i(strOptString, "config.optString(EXTERNA…AL_EVENTS_IMPRESSION_URL)");
        this.f26905c = strOptString;
        this.f26906d = jSONObject.optBoolean("sid", true);
        this.f26907e = jSONObject.optBoolean("radvid", false);
        this.f26908f = jSONObject.optInt("uaeh", 0);
        this.f26909g = jSONObject.optBoolean("sharedThreadPool", false);
        this.f26910h = jSONObject.optBoolean("sharedThreadPoolADP", true);
        this.f26911i = jSONObject.optInt(Q6.T0, -1);
        this.f26912j = jSONObject.optBoolean("axal", false);
        this.f26913k = jSONObject.optBoolean("psrt", false);
        this.f26914l = jSONObject.optJSONObject(C3426d4.a.f28410c);
    }

    public final K1 a(JSONObject jSONObject) {
        ck.p.j(jSONObject, "config");
        return new K1(jSONObject);
    }

    public final int b() {
        return this.f26911i;
    }

    public final JSONObject c() {
        return this.f26914l;
    }

    public final String d() {
        return this.f26905c;
    }

    public final boolean e() {
        return this.f26913k;
    }

    public final boolean f() {
        return this.f26907e;
    }

    public final boolean g() {
        return this.f26906d;
    }

    public final boolean h() {
        return this.f26909g;
    }

    public int hashCode() {
        return this.f26903a.hashCode();
    }

    public final boolean i() {
        return this.f26910h;
    }

    public final int j() {
        return this.f26908f;
    }

    public final boolean k() {
        return this.f26912j;
    }

    public final boolean l() {
        return this.f26904b;
    }

    public String toString() {
        return "ApplicationGeneralSettings(config=" + this.f26903a + ")";
    }

    public static /* synthetic */ K1 a(K1 k10, JSONObject jSONObject, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            jSONObject = k10.f26903a;
        }
        return k10.a(jSONObject);
    }
}
