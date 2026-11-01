package com.ironsource;

/* JADX INFO: loaded from: classes7.dex */
public final class F0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EnumC3473ff f26486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f26487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f26488c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final W7 f26489d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f26490e;

    public final String a() {
        return this.f26490e;
    }

    public F0(EnumC3473ff enumC3473ff, String str, String str2, W7 w10, String str3) {
        ck.p.j(enumC3473ff, "recordType");
        ck.p.j(str, "advertiserBundleId");
        ck.p.j(str2, "networkInstanceId");
        ck.p.j(w10, "adProvider");
        ck.p.j(str3, "adInstanceId");
        this.f26486a = enumC3473ff;
        this.f26487b = str;
        this.f26488c = str2;
        this.f26489d = w10;
        this.f26490e = str3;
    }

    public final C3684rc a(Kb<F0, C3684rc> kb2) {
        ck.p.j(kb2, "mapper");
        return kb2.a(this);
    }

    public final W7 b() {
        return this.f26489d;
    }

    public final String c() {
        return this.f26487b;
    }

    public final String d() {
        return this.f26488c;
    }

    public final EnumC3473ff e() {
        return this.f26486a;
    }
}
