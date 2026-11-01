package com.inmobi.media;

import com.inmobi.media.Wm;

/* JADX INFO: loaded from: classes7.dex */
public final class Wm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nk.l0 f23767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2900h5 f23768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final In f23769c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final mj.g f23770d;

    public Wm(nk.l0 l0Var, C2900h5 c2900h5, In in2) {
        ck.p.j(l0Var, "coroutineScope");
        ck.p.j(c2900h5, "trackingView");
        ck.p.j(in2, "config");
        this.f23767a = l0Var;
        this.f23768b = c2900h5;
        this.f23769c = in2;
        this.f23770d = kotlin.b.a(new bk.a() { // from class: b7.g5
            @Override // bk.a
            public final Object invoke() {
                return Wm.a(this.f4942b);
            }
        });
    }

    public static final C3284wg a(Wm wm2) {
        In in2 = wm2.f23769c;
        return new C3284wg(wm2.f23767a, new C3334yg(wm2.f23769c.f22876b), new Kn(new Jn(in2.f22875a, in2.f22877c), new C2734aj(wm2.f23768b, nj.s.k())));
    }
}
