package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.d6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3428d6 implements InterfaceC3593ma {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Qe f28653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f28654b;

    @Override // com.ironsource.InterfaceC3593ma
    public void c() {
    }

    @Override // com.ironsource.InterfaceC3593ma
    public void d() {
    }

    public C3428d6(InterfaceC3628o7 interfaceC3628o7, Qe qe2) {
        ck.p.j(interfaceC3628o7, "applicationLifecycleService");
        ck.p.j(qe2, "task");
        this.f28653a = qe2;
        interfaceC3628o7.a(this);
        f();
    }

    @Override // com.ironsource.InterfaceC3593ma
    public void a() {
        this.f28653a.a(Long.valueOf(e()));
        this.f28653a.run();
    }

    private final long e() {
        return System.currentTimeMillis() - this.f28654b;
    }

    private final void f() {
        this.f28654b = System.currentTimeMillis();
    }

    @Override // com.ironsource.InterfaceC3593ma
    public void b() {
        f();
    }
}
