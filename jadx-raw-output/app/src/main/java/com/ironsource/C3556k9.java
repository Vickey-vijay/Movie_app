package com.ironsource;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.k9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3556k9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f29348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f29349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final EnumC3592m9 f29350c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final JSONObject f29351d;

    public C3556k9(String str, String str2, EnumC3592m9 enumC3592m9, JSONObject jSONObject) {
        ck.p.j(str, "url");
        ck.p.j(str2, C3426d4.f.f28484c);
        ck.p.j(enumC3592m9, C3426d4.f.f28486e);
        this.f29348a = str;
        this.f29349b = str2;
        this.f29350c = enumC3592m9;
        this.f29351d = jSONObject;
    }

    public final String a() {
        return this.f29348a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3556k9)) {
            return false;
        }
        C3556k9 c3556k9 = (C3556k9) obj;
        return ck.p.e(this.f29348a, c3556k9.f29348a) && ck.p.e(this.f29349b, c3556k9.f29349b) && this.f29350c == c3556k9.f29350c && ck.p.e(this.f29351d, c3556k9.f29351d);
    }

    public final C3556k9 a(String str, String str2, EnumC3592m9 enumC3592m9, JSONObject jSONObject) {
        ck.p.j(str, "url");
        ck.p.j(str2, C3426d4.f.f28484c);
        ck.p.j(enumC3592m9, C3426d4.f.f28486e);
        return new C3556k9(str, str2, enumC3592m9, jSONObject);
    }

    public final String b() {
        return this.f29349b;
    }

    public final EnumC3592m9 c() {
        return this.f29350c;
    }

    public final JSONObject d() {
        return this.f29351d;
    }

    public final JSONObject e() {
        return this.f29351d;
    }

    public final String f() {
        return this.f29349b;
    }

    public final EnumC3592m9 g() {
        return this.f29350c;
    }

    public final String h() {
        return this.f29348a;
    }

    public int hashCode() {
        int iHashCode = ((((this.f29348a.hashCode() * 31) + this.f29349b.hashCode()) * 31) + this.f29350c.hashCode()) * 31;
        JSONObject jSONObject = this.f29351d;
        return iHashCode + (jSONObject == null ? 0 : jSONObject.hashCode());
    }

    public String toString() {
        return "InlineStoreRequest(url=" + this.f29348a + ", storePackage=" + this.f29349b + ", strategy=" + this.f29350c + ", extras=" + this.f29351d + ")";
    }

    public static /* synthetic */ C3556k9 a(C3556k9 c3556k9, String str, String str2, EnumC3592m9 enumC3592m9, JSONObject jSONObject, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = c3556k9.f29348a;
        }
        if ((i10 & 2) != 0) {
            str2 = c3556k9.f29349b;
        }
        if ((i10 & 4) != 0) {
            enumC3592m9 = c3556k9.f29350c;
        }
        if ((i10 & 8) != 0) {
            jSONObject = c3556k9.f29351d;
        }
        return c3556k9.a(str, str2, enumC3592m9, jSONObject);
    }

    public /* synthetic */ C3556k9(String str, String str2, EnumC3592m9 enumC3592m9, JSONObject jSONObject, int i10, ck.i iVar) {
        this(str, str2, (i10 & 4) != 0 ? EnumC3592m9.APP_ACTIVITY : enumC3592m9, (i10 & 8) != 0 ? null : jSONObject);
    }
}
