package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes5.dex */
public final class Va implements Ya {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Ta f27806a;

    @Override // com.ironsource.Ya
    public void a(C3706t0 c3706t0) {
        ck.p.j(c3706t0, "adUnitCallback");
        this.f27806a.a("Received load success on a destroyed ad");
    }

    public Va(Ta ta2) {
        ck.p.j(ta2, C3426d4.f.f28486e);
        this.f27806a = ta2;
    }

    @Override // com.ironsource.Ya
    public void a(IronSourceError ironSourceError) {
        this.f27806a.a("Received load failed on a destroyed ad");
    }

    @Override // com.ironsource.Ya
    public void b() {
        this.f27806a.a("Loading a destroyed ad");
    }

    @Override // com.ironsource.Ya
    public void c() {
        this.f27806a.a("Destroying a destroyed ad");
    }
}
