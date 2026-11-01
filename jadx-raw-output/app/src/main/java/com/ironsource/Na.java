package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes6.dex */
public final class Na implements Ra {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Ha f27098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final L2 f27099b;

    @Override // com.ironsource.M0
    public void a(C3706t0 c3706t0) {
        ck.p.j(c3706t0, "adUnitCallback");
        this.f27098a.a("Received load success while paused");
    }

    @Override // com.ironsource.Ra
    public void d() {
    }

    public Na(Ha ha2, L2 l10) {
        ck.p.j(ha2, C3426d4.f.f28486e);
        ck.p.j(l10, "currentAdUnit");
        this.f27098a = ha2;
        this.f27099b = l10;
    }

    @Override // com.ironsource.M0
    public void a(IronSourceError ironSourceError) {
        this.f27098a.a("Received load failed while paused");
    }

    @Override // com.ironsource.Ra
    public void b() {
        this.f27098a.a("Loading a loaded ad");
    }

    @Override // com.ironsource.Ra
    public void c() {
        this.f27099b.a(true);
        Ha ha2 = this.f27098a;
        ha2.a((Ra) new Ka(ha2));
    }

    @Override // com.ironsource.Ra
    public void f() {
        this.f27098a.a(this.f27099b, new AbstractC3515i3.a(AbstractC3515i3.b.c.f29121a));
    }
}
