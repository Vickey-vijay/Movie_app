package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes6.dex */
public final class Ka implements Ra {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Ha f26936a;

    @Override // com.ironsource.M0
    public void a(C3706t0 c3706t0) {
        ck.p.j(c3706t0, "adUnitCallback");
        this.f26936a.a("Received load success on a destroyed ad");
    }

    public Ka(Ha ha2) {
        ck.p.j(ha2, C3426d4.f.f28486e);
        this.f26936a = ha2;
    }

    @Override // com.ironsource.M0
    public void a(IronSourceError ironSourceError) {
        this.f26936a.a("Received load failed on a destroyed ad");
    }

    @Override // com.ironsource.Ra
    public void b() {
        this.f26936a.a("Loading a destroyed ad");
    }

    @Override // com.ironsource.Ra
    public void c() {
        this.f26936a.a("Destroying a destroyed ad");
    }

    @Override // com.ironsource.Ra
    public void d() {
        this.f26936a.a("Pausing auto refresh on a destroyed ad");
    }

    @Override // com.ironsource.Ra
    public void f() {
        this.f26936a.a("Resuming auto refresh on a destroyed ad");
    }
}
