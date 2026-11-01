package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes6.dex */
public final class Ma implements Ra {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Ha f27046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final L2 f27047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f27048c;

    @Override // com.ironsource.M0
    public void a(C3706t0 c3706t0) {
        ck.p.j(c3706t0, "adUnitCallback");
        this.f27046a.a(c3706t0, this.f27047b, (L2) null, new AbstractC3515i3.a(AbstractC3515i3.b.C0269b.f29120a), this.f27048c, (Long) null);
    }

    @Override // com.ironsource.Ra
    public void d() {
        this.f27048c = true;
    }

    @Override // com.ironsource.Ra
    public void f() {
        this.f27048c = false;
    }

    public Ma(Ha ha2, L2 l10, boolean z10) {
        ck.p.j(ha2, C3426d4.f.f28486e);
        ck.p.j(l10, "currentAdUnit");
        this.f27046a = ha2;
        this.f27047b = l10;
        this.f27048c = z10;
    }

    @Override // com.ironsource.Ra
    public void b() {
        this.f27046a.a("Loading an ad while loading");
    }

    @Override // com.ironsource.Ra
    public void c() {
        this.f27047b.a(true);
        Ha ha2 = this.f27046a;
        ha2.a((Ra) new Ka(ha2));
    }

    @Override // com.ironsource.M0
    public void a(IronSourceError ironSourceError) {
        this.f27046a.a(ironSourceError, this.f27047b, (AbstractC3515i3) new AbstractC3515i3.a(AbstractC3515i3.b.a.f29119a), false, this.f27048c, (Long) null);
    }
}
