package com.ironsource;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3790y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JSONObject f31612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final JSONObject f31613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final JSONObject f31614c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final JSONObject f31615d;

    public C3790y() {
        this(null, null, null, null, 15, null);
    }

    public final JSONObject a() {
        return this.f31612a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3790y)) {
            return false;
        }
        C3790y c3790y = (C3790y) obj;
        return ck.p.e(this.f31612a, c3790y.f31612a) && ck.p.e(this.f31613b, c3790y.f31613b) && ck.p.e(this.f31614c, c3790y.f31614c) && ck.p.e(this.f31615d, c3790y.f31615d);
    }

    public C3790y(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4) {
        this.f31612a = jSONObject;
        this.f31613b = jSONObject2;
        this.f31614c = jSONObject3;
        this.f31615d = jSONObject4;
    }

    public final C3790y a(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4) {
        return new C3790y(jSONObject, jSONObject2, jSONObject3, jSONObject4);
    }

    public final JSONObject b() {
        return this.f31613b;
    }

    public final JSONObject c() {
        return this.f31614c;
    }

    public final JSONObject d() {
        return this.f31615d;
    }

    public final JSONObject e() {
        return this.f31614c;
    }

    public final JSONObject f() {
        return this.f31613b;
    }

    public final JSONObject g() {
        return this.f31615d;
    }

    public final JSONObject h() {
        return this.f31612a;
    }

    public int hashCode() {
        JSONObject jSONObject = this.f31612a;
        int iHashCode = (jSONObject == null ? 0 : jSONObject.hashCode()) * 31;
        JSONObject jSONObject2 = this.f31613b;
        int iHashCode2 = (iHashCode + (jSONObject2 == null ? 0 : jSONObject2.hashCode())) * 31;
        JSONObject jSONObject3 = this.f31614c;
        int iHashCode3 = (iHashCode2 + (jSONObject3 == null ? 0 : jSONObject3.hashCode())) * 31;
        JSONObject jSONObject4 = this.f31615d;
        return iHashCode3 + (jSONObject4 != null ? jSONObject4.hashCode() : 0);
    }

    public String toString() {
        return "AdFormatsConfig2(rewarded=" + this.f31612a + ", interstitial=" + this.f31613b + ", banner=" + this.f31614c + ", nativeAd=" + this.f31615d + ")";
    }

    public static /* synthetic */ C3790y a(C3790y c3790y, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            jSONObject = c3790y.f31612a;
        }
        if ((i10 & 2) != 0) {
            jSONObject2 = c3790y.f31613b;
        }
        if ((i10 & 4) != 0) {
            jSONObject3 = c3790y.f31614c;
        }
        if ((i10 & 8) != 0) {
            jSONObject4 = c3790y.f31615d;
        }
        return c3790y.a(jSONObject, jSONObject2, jSONObject3, jSONObject4);
    }

    public /* synthetic */ C3790y(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, int i10, ck.i iVar) {
        this((i10 & 1) != 0 ? null : jSONObject, (i10 & 2) != 0 ? null : jSONObject2, (i10 & 4) != 0 ? null : jSONObject3, (i10 & 8) != 0 ? null : jSONObject4);
    }
}
