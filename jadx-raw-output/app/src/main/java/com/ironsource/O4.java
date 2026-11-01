package com.ironsource;

/* JADX INFO: loaded from: classes6.dex */
public final class O4 extends Eg {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Vc f27240d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final yg f27241e;

    @Override // com.ironsource.Eg
    public void a() {
    }

    @Override // com.ironsource.Eg
    public void c(A a10) {
        ck.p.j(a10, "instanceToShow");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O4(W0 w10, Vc vc2, yg ygVar) {
        super(w10, vc2);
        ck.p.j(w10, "adTools");
        ck.p.j(vc2, "outcomeReporter");
        ck.p.j(ygVar, "waterfallInstances");
        this.f27240d = vc2;
        this.f27241e = ygVar;
    }

    @Override // com.ironsource.Eg
    public void a(A a10) {
        ck.p.j(a10, C3605n2.f30210p);
    }

    @Override // com.ironsource.Eg
    public void b(A a10) {
        ck.p.j(a10, C3605n2.f30210p);
        this.f27240d.a(this.f27241e.b(), a10);
    }
}
