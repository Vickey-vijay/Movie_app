package com.ironsource;

/* JADX INFO: loaded from: classes7.dex */
public final class Hg implements Kg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Dg f26772a;

    @Override // com.ironsource.Kg
    public void a() {
    }

    public Hg(Dg dg2) {
        ck.p.j(dg2, "waterfallOperations");
        this.f26772a = dg2;
    }

    @Override // com.ironsource.Kg
    public void a(A a10) {
        ck.p.j(a10, "it");
        this.f26772a.a(a10);
        this.f26772a.a();
    }

    @Override // com.ironsource.Kg
    public Ed b() {
        return Ed.FEATURE_DISABLED;
    }

    @Override // com.ironsource.Kg
    public A c() {
        return this.f26772a.a(0);
    }
}
