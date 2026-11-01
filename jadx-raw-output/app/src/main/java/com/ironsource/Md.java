package com.ironsource;

/* JADX INFO: loaded from: classes6.dex */
public final class Md implements InterfaceC3612n9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3405c1 f27049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Zd f27050b;

    @Override // com.ironsource.InterfaceC3423d1
    public boolean a() {
        return true;
    }

    public Md(C3405c1 c3405c1, Zd zd2) {
        ck.p.j(c3405c1, "adapterConfig");
        ck.p.j(zd2, "adFormatConfigurations");
        this.f27049a = c3405c1;
        this.f27050b = zd2;
    }

    @Override // com.ironsource.InterfaceC3705t
    public long b() {
        return this.f27050b.i();
    }

    @Override // com.ironsource.InterfaceC3423d1
    public String c() {
        String strF = this.f27049a.f();
        ck.p.i(strF, "adapterConfig.providerName");
        return strF;
    }

    @Override // com.ironsource.InterfaceC3423d1
    public boolean d() {
        return !this.f27049a.j();
    }

    @Override // com.ironsource.InterfaceC3423d1
    public String e() {
        String strA = this.f27049a.a();
        ck.p.i(strA, "adapterConfig.adSourceNameForEvents");
        return strA;
    }

    @Override // com.ironsource.InterfaceC3423d1
    public EnumC3648p9 f() {
        return EnumC3648p9.f30447b.a(this.f27049a.d());
    }
}
