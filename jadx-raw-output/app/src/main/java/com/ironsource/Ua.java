package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes5.dex */
public final class Ua implements Ya {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Ta f27751a;

    @Override // com.ironsource.Ya
    public void a(C3706t0 c3706t0) {
        ck.p.j(c3706t0, "adUnitCallback");
        this.f27751a.a("Received load success before load called");
    }

    public Ua(Ta ta2) {
        ck.p.j(ta2, C3426d4.f.f28486e);
        this.f27751a = ta2;
    }

    @Override // com.ironsource.Ya
    public void a(IronSourceError ironSourceError) {
        this.f27751a.a("Received load failed before load called");
    }

    @Override // com.ironsource.Ya
    public void b() {
        L2 l2A = this.f27751a.i().a(true);
        this.f27751a.a(l2A);
        Ta ta2 = this.f27751a;
        ta2.a(new Xa(ta2, l2A));
        l2A.a(this.f27751a.g());
    }

    @Override // com.ironsource.Ya
    public void c() {
        L2 l2K = this.f27751a.k();
        if (l2K != null) {
            l2K.a(false);
        }
        this.f27751a.a((L2) null);
        Ta ta2 = this.f27751a;
        ta2.a(new Va(ta2));
    }
}
