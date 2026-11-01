package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.rc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3684rc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EnumC3473ff f30626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f30627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final W7 f30628c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f30629d;

    public final String a() {
        return this.f30629d;
    }

    public C3684rc(EnumC3473ff enumC3473ff, String str, W7 w10, String str2) {
        ck.p.j(enumC3473ff, "recordType");
        ck.p.j(str, "advertiserBundleId");
        ck.p.j(w10, "adProvider");
        ck.p.j(str2, "adInstanceId");
        this.f30626a = enumC3473ff;
        this.f30627b = str;
        this.f30628c = w10;
        this.f30629d = str2;
    }

    public final C3477g1 a(Kb<C3684rc, C3477g1> kb2) {
        ck.p.j(kb2, "mapper");
        return kb2.a(this);
    }

    public final W7 b() {
        return this.f30628c;
    }

    public final String c() {
        return this.f30627b;
    }

    public final EnumC3473ff d() {
        return this.f30626a;
    }
}
