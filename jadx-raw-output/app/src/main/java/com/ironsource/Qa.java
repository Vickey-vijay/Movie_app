package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes6.dex */
public final class Qa implements Ra {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Ha f27495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final L2 f27496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final L2 f27497c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f27498d;

    @Override // com.ironsource.M0
    public void a(C3706t0 c3706t0) {
        ck.p.j(c3706t0, "adUnitCallback");
        this.f27495a.a(c3706t0, this.f27497c, this.f27496b, (AbstractC3515i3) new AbstractC3515i3.c(this.f27495a.p().a() - this.f27498d, AbstractC3515i3.d.C0270d.f29127a), false, Long.valueOf(this.f27498d));
    }

    @Override // com.ironsource.Ra
    public void f() {
    }

    public Qa(Ha ha2, L2 l10, L2 l11, long j10) {
        ck.p.j(ha2, C3426d4.f.f28486e);
        ck.p.j(l10, "currentAdUnit");
        ck.p.j(l11, "reloadingAdUnit");
        this.f27495a = ha2;
        this.f27496b = l10;
        this.f27497c = l11;
        this.f27498d = j10;
    }

    @Override // com.ironsource.Ra
    public void b() {
        this.f27495a.a("Loading an ad while reloading after timer finished");
    }

    @Override // com.ironsource.Ra
    public void c() {
        this.f27496b.a(true);
        this.f27497c.a(true);
        Ha ha2 = this.f27495a;
        ha2.a((Ra) new Ka(ha2));
    }

    @Override // com.ironsource.Ra
    public void d() {
        Ha ha2 = this.f27495a;
        ha2.a((Ra) new Na(ha2, this.f27496b));
    }

    @Override // com.ironsource.M0
    public void a(IronSourceError ironSourceError) {
        this.f27495a.a(ironSourceError, this.f27496b, (AbstractC3515i3) new AbstractC3515i3.c(this.f27495a.p().a() - this.f27498d, AbstractC3515i3.d.c.f29126a), true, false, Long.valueOf(this.f27498d));
    }
}
