package com.inmobi.media;

import com.inmobi.media.Ed;

/* JADX INFO: loaded from: classes5.dex */
public final class Ed extends AbstractC3170s2 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Gd f22590h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final mj.g f22591i;

    /* JADX WARN: Illegal instructions before constructor call */
    public Ed(nk.l0 l0Var, K5 k10, qk.l lVar) {
        ck.p.j(l0Var, "coroutineScope");
        ck.p.j(k10, "displayMRC50Model");
        ck.p.j(lVar, "windowObserver");
        C3241un c3241un = k10.f23002a;
        C3316xn c3316xn = k10.f23003b;
        super(l0Var, c3241un, c3316xn, lVar);
        this.f22590h = new Gd(new Jn(c3316xn.f25744b, c3316xn.f25745c), this.f25295g.f22594c);
        this.f22591i = kotlin.b.a(new bk.a() { // from class: b7.z
            @Override // bk.a
            public final Object invoke() {
                return Ed.a(this.f5272b);
            }
        });
    }

    public static final Bn a(Ed ed2) {
        Gd gd2 = ed2.f22590h;
        ck.p.j(gd2, "viewabilityTrackerView");
        return new Bn(new C3284wg(ed2.f25289a, new C3334yg(ed2.f25290b.f25743a), gd2), new Dn(ed2.f25289a, ed2.f25290b.f25746d));
    }

    @Override // com.inmobi.media.AbstractC3170s2
    public final Bn c() {
        return (Bn) this.f22591i.getValue();
    }
}
