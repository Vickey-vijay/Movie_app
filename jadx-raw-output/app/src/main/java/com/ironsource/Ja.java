package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes6.dex */
public final class Ja implements Ra {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Ha f26879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f26880b;

    public Ja(Ha ha2, boolean z10) {
        ck.p.j(ha2, C3426d4.f.f28486e);
        this.f26879a = ha2;
        this.f26880b = z10;
    }

    @Override // com.ironsource.M0
    public void a(C3706t0 c3706t0) {
        ck.p.j(c3706t0, "adUnitCallback");
        this.f26879a.a("Received load success before load");
    }

    @Override // com.ironsource.Ra
    public void d() {
        this.f26880b = true;
    }

    @Override // com.ironsource.Ra
    public void f() {
        this.f26880b = false;
    }

    @Override // com.ironsource.M0
    public void a(IronSourceError ironSourceError) {
        this.f26879a.a("Received load failed before load");
    }

    @Override // com.ironsource.Ra
    public void b() {
        L2 l2A = this.f26879a.j().a(true);
        this.f26879a.a((Ra) new Ma(this.f26879a, l2A, this.f26880b));
        l2A.a(this.f26879a.g());
    }

    @Override // com.ironsource.Ra
    public void c() {
        Ha ha2 = this.f26879a;
        ha2.a((Ra) new Ka(ha2));
    }

    public /* synthetic */ Ja(Ha ha2, boolean z10, int i10, ck.i iVar) {
        this(ha2, (i10 & 2) != 0 ? false : z10);
    }
}
