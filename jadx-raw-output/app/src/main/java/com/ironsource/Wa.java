package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes5.dex */
public final class Wa implements Ya {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Ta f27834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final L2 f27835b;

    @Override // com.ironsource.Ya
    public void a(C3706t0 c3706t0) {
        ck.p.j(c3706t0, "adUnitCallback");
        this.f27834a.a("Ad unit is already loaded");
    }

    public Wa(Ta ta2, L2 l10) {
        ck.p.j(ta2, C3426d4.f.f28486e);
        ck.p.j(l10, "adUnit");
        this.f27834a = ta2;
        this.f27835b = l10;
    }

    @Override // com.ironsource.Ya
    public void a(IronSourceError ironSourceError) {
        this.f27834a.a("Ad unit is already loaded");
    }

    @Override // com.ironsource.Ya
    public void b() {
        this.f27834a.a("Loading a loaded ad");
    }

    @Override // com.ironsource.Ya
    public void c() {
        this.f27835b.a(true);
        this.f27834a.a((L2) null);
        Ta ta2 = this.f27834a;
        ta2.a(new Va(ta2));
    }
}
