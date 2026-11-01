package com.ironsource;

/* JADX INFO: loaded from: classes4.dex */
public final class Z2 implements InterfaceC3612n9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3405c1 f27964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final U2 f27965b;

    @Override // com.ironsource.InterfaceC3423d1
    public boolean a() {
        return true;
    }

    public Z2(C3405c1 c3405c1, U2 u10) {
        ck.p.j(c3405c1, "adapterConfig");
        ck.p.j(u10, "adFormatConfigurations");
        this.f27964a = c3405c1;
        this.f27965b = u10;
    }

    @Override // com.ironsource.InterfaceC3705t
    public long b() {
        return this.f27965b.b();
    }

    @Override // com.ironsource.InterfaceC3423d1
    public String c() {
        String strF = this.f27964a.f();
        ck.p.i(strF, "adapterConfig.providerName");
        return strF;
    }

    @Override // com.ironsource.InterfaceC3423d1
    public boolean d() {
        return !this.f27964a.j();
    }

    @Override // com.ironsource.InterfaceC3423d1
    public String e() {
        String strA = this.f27964a.a();
        ck.p.i(strA, "adapterConfig.adSourceNameForEvents");
        return strA;
    }

    @Override // com.ironsource.InterfaceC3423d1
    public EnumC3648p9 f() {
        return EnumC3648p9.f30447b.a(this.f27964a.d());
    }
}
