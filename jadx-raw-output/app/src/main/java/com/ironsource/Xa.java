package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes5.dex */
public final class Xa implements Ya {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Ta f27872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final L2 f27873b;

    @Override // com.ironsource.Ya
    public void a(C3706t0 c3706t0) {
        ck.p.j(c3706t0, "adUnitCallback");
        this.f27872a.a(c3706t0, this.f27873b);
        Ta ta2 = this.f27872a;
        ta2.a(new Wa(ta2, this.f27873b));
    }

    public Xa(Ta ta2, L2 l10) {
        ck.p.j(ta2, C3426d4.f.f28486e);
        ck.p.j(l10, "adUnit");
        this.f27872a = ta2;
        this.f27873b = l10;
    }

    @Override // com.ironsource.Ya
    public void b() {
        this.f27872a.a("Loading an ad while loading");
    }

    @Override // com.ironsource.Ya
    public void c() {
        this.f27873b.a(true);
        this.f27872a.a((L2) null);
        Ta ta2 = this.f27872a;
        ta2.a(new Va(ta2));
    }

    @Override // com.ironsource.Ya
    public void a(IronSourceError ironSourceError) {
        this.f27872a.a(ironSourceError);
        this.f27873b.a(false);
        this.f27872a.a((L2) null);
        Ta ta2 = this.f27872a;
        ta2.a(new Va(ta2));
    }
}
