package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3722u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EnumC3473ff f31339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f31340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f31341c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f31342d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final W7 f31343e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f31344f;

    public final String a() {
        return this.f31344f;
    }

    public C3722u(EnumC3473ff enumC3473ff, String str, String str2, String str3, W7 w10, String str4) {
        ck.p.j(enumC3473ff, "recordType");
        ck.p.j(str, "advertiserBundleId");
        ck.p.j(str2, "networkInstanceId");
        ck.p.j(str3, "adUnitId");
        ck.p.j(w10, "adProvider");
        ck.p.j(str4, "adInstanceId");
        this.f31339a = enumC3473ff;
        this.f31340b = str;
        this.f31341c = str2;
        this.f31342d = str3;
        this.f31343e = w10;
        this.f31344f = str4;
    }

    public final F0 a(Kb<C3722u, F0> kb2) {
        ck.p.j(kb2, "mapper");
        return kb2.a(this);
    }

    public final W7 b() {
        return this.f31343e;
    }

    public final String c() {
        return this.f31342d;
    }

    public final String d() {
        return this.f31340b;
    }

    public final String e() {
        return this.f31341c;
    }

    public final EnumC3473ff f() {
        return this.f31339a;
    }
}
