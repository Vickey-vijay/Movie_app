package com.inmobi.media;

import com.inmobi.media.C2857fd;

/* JADX INFO: renamed from: com.inmobi.media.fd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C2857fd extends AbstractC3170s2 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C2883gd f24367h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final mj.g f24368i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2857fd(nk.l0 l0Var, C3241un c3241un, C3316xn c3316xn, qk.l lVar) {
        super(l0Var, c3241un, c3316xn, lVar);
        ck.p.j(l0Var, "coroutineScope");
        ck.p.j(c3241un, "viewabilityModel");
        ck.p.j(c3316xn, "viewabilityCriteria");
        ck.p.j(lVar, "windowObserver");
        this.f24367h = new C2883gd(new Jn(c3316xn.f25744b, c3316xn.f25745c), this.f25295g.f22594c);
        this.f24368i = kotlin.b.a(new bk.a() { // from class: b7.u6
            @Override // bk.a
            public final Object invoke() {
                return C2857fd.a(this.f5202b);
            }
        });
    }

    public static final Bn a(C2857fd c2857fd) {
        C2883gd c2883gd = c2857fd.f24367h;
        ck.p.j(c2883gd, "viewabilityTrackerView");
        return new Bn(new C3284wg(c2857fd.f25289a, new C3334yg(c2857fd.f25290b.f25743a), c2883gd), new Dn(c2857fd.f25289a, c2857fd.f25290b.f25746d));
    }

    @Override // com.inmobi.media.AbstractC3170s2
    public final Bn c() {
        return (Bn) this.f24368i.getValue();
    }
}
