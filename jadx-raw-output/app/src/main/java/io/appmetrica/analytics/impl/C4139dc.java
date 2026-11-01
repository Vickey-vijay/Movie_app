package io.appmetrica.analytics.impl;

import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.dc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4139dc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rg f56582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC4516s9 f56583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C4437p4 f56584c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Xe f56585d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final O4 f56586e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C4619wc f56587f = new C4619wc();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final mj.g f56588g = kotlin.b.a(new C4113cc(this));

    public final List<G8> a() {
        return this.f56586e.a();
    }

    public final List<G8> b() {
        return nj.b0.y0(nj.r.e(this.f56586e.f55668c), nj.r.e((G8) this.f56588g.getValue()));
    }

    public C4139dc(M6 m10, Rg rg2, InterfaceC4516s9 interfaceC4516s9, C4437p4 c4437p4, Xe xe2) {
        this.f56582a = rg2;
        this.f56583b = interfaceC4516s9;
        this.f56584c = c4437p4;
        this.f56585d = xe2;
        this.f56586e = new O4(m10, rg2);
    }
}
