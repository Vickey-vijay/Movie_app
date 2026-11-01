package com.ironsource;

/* JADX INFO: loaded from: classes7.dex */
public final class Ig implements Kg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Dg f26849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f26850b;

    @Override // com.ironsource.Kg
    public void a(A a10) {
        ck.p.j(a10, "it");
        this.f26850b++;
        this.f26849a.a(a10);
    }

    public Ig(Dg dg2) {
        ck.p.j(dg2, "waterfallOperations");
        this.f26849a = dg2;
    }

    @Override // com.ironsource.Kg
    public Ed b() {
        if (this.f26850b >= 2) {
            return Ed.MAX_ATTEMPTS_REACHED;
        }
        return !this.f26849a.b() ? Ed.NO_LOADED_ADS : Ed.CAN_RECOVER;
    }

    @Override // com.ironsource.Kg
    public A c() {
        return this.f26849a.a(this.f26850b);
    }

    @Override // com.ironsource.Kg
    public void a() {
        this.f26849a.a();
    }
}
