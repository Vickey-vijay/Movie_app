package com.ironsource;

/* JADX INFO: loaded from: classes6.dex */
public final class K9 implements InterfaceC3612n9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3405c1 f26934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final H9 f26935b;

    @Override // com.ironsource.InterfaceC3423d1
    public boolean a() {
        return true;
    }

    public K9(C3405c1 c3405c1, H9 h10) {
        ck.p.j(c3405c1, "adapterConfig");
        ck.p.j(h10, "adFormatConfigurations");
        this.f26934a = c3405c1;
        this.f26935b = h10;
    }

    @Override // com.ironsource.InterfaceC3705t
    public long b() {
        return this.f26935b.e();
    }

    @Override // com.ironsource.InterfaceC3423d1
    public String c() {
        String strF = this.f26934a.f();
        ck.p.i(strF, "adapterConfig.providerName");
        return strF;
    }

    @Override // com.ironsource.InterfaceC3423d1
    public boolean d() {
        return !this.f26934a.j();
    }

    @Override // com.ironsource.InterfaceC3423d1
    public String e() {
        String strA = this.f26934a.a();
        ck.p.i(strA, "adapterConfig.adSourceNameForEvents");
        return strA;
    }

    @Override // com.ironsource.InterfaceC3423d1
    public EnumC3648p9 f() {
        return EnumC3648p9.f30447b.a(this.f26934a.d());
    }
}
