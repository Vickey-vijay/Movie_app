package com.ironsource;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.td, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3719td {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f31308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f31309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f31310c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f31311d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f31312e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Boolean f31313f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final JSONObject f31314g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final C3790y f31315h;

    public C3719td() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public final String a() {
        return this.f31308a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3719td)) {
            return false;
        }
        C3719td c3719td = (C3719td) obj;
        return ck.p.e(this.f31308a, c3719td.f31308a) && ck.p.e(this.f31309b, c3719td.f31309b) && ck.p.e(this.f31310c, c3719td.f31310c) && ck.p.e(this.f31311d, c3719td.f31311d) && ck.p.e(this.f31312e, c3719td.f31312e) && ck.p.e(this.f31313f, c3719td.f31313f) && ck.p.e(this.f31314g, c3719td.f31314g) && ck.p.e(this.f31315h, c3719td.f31315h);
    }

    public C3719td(String str, String str2, String str3, String str4, String str5, Boolean bool, JSONObject jSONObject, C3790y c3790y) {
        this.f31308a = str;
        this.f31309b = str2;
        this.f31310c = str3;
        this.f31311d = str4;
        this.f31312e = str5;
        this.f31313f = bool;
        this.f31314g = jSONObject;
        this.f31315h = c3790y;
    }

    public final C3719td a(String str, String str2, String str3, String str4, String str5, Boolean bool, JSONObject jSONObject, C3790y c3790y) {
        return new C3719td(str, str2, str3, str4, str5, bool, jSONObject, c3790y);
    }

    public final String b() {
        return this.f31309b;
    }

    public final String c() {
        return this.f31310c;
    }

    public final String d() {
        return this.f31311d;
    }

    public final String e() {
        return this.f31312e;
    }

    public final Boolean f() {
        return this.f31313f;
    }

    public final JSONObject g() {
        return this.f31314g;
    }

    public final C3790y h() {
        return this.f31315h;
    }

    public int hashCode() {
        String str = this.f31308a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f31309b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f31310c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f31311d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f31312e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.f31313f;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        JSONObject jSONObject = this.f31314g;
        int iHashCode7 = (iHashCode6 + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
        C3790y c3790y = this.f31315h;
        return iHashCode7 + (c3790y != null ? c3790y.hashCode() : 0);
    }

    public final C3790y i() {
        return this.f31315h;
    }

    public final String j() {
        return this.f31308a;
    }

    public final JSONObject k() {
        return this.f31314g;
    }

    public final Boolean l() {
        return this.f31313f;
    }

    public final String m() {
        return this.f31311d;
    }

    public final String n() {
        return this.f31310c;
    }

    public final String o() {
        return this.f31309b;
    }

    public final String p() {
        return this.f31312e;
    }

    public String toString() {
        return "ProviderConfig2(adSourceName=" + this.f31308a + ", providerNetworkKey=" + this.f31309b + ", providerLoadName=" + this.f31310c + ", providerDefaultInstance=" + this.f31311d + ", spId=" + this.f31312e + ", mpis=" + this.f31313f + ", application=" + this.f31314g + ", adFormats=" + this.f31315h + ")";
    }

    public /* synthetic */ C3719td(String str, String str2, String str3, String str4, String str5, Boolean bool, JSONObject jSONObject, C3790y c3790y, int i10, ck.i iVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5, (i10 & 32) != 0 ? null : bool, (i10 & 64) != 0 ? null : jSONObject, (i10 & 128) == 0 ? c3790y : null);
    }
}
