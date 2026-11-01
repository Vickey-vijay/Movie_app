package com.inmobi.media;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes5.dex */
public final class Fd implements InterfaceC3326y8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3326y8 f22640a;

    public Fd(nk.l0 l0Var, Vb vb2, qk.l lVar) {
        InterfaceC3326y8 jd2;
        ck.p.j(l0Var, "scope");
        ck.p.j(vb2, "mrC50Model");
        ck.p.j(lVar, "lifecycleObserver");
        ck.p.j(l0Var, "scope");
        ck.p.j(vb2, "mrC50Model");
        ck.p.j(lVar, "lifecycleObserver");
        if (vb2 instanceof K5) {
            jd2 = new Ed(l0Var, (K5) vb2, lVar);
        } else {
            if (!(vb2 instanceof Nm)) {
                throw new NoWhenBranchMatchedException();
            }
            jd2 = new Jd((Nm) vb2);
        }
        this.f22640a = jd2;
    }

    @Override // com.inmobi.media.InterfaceC3326y8
    public final void a() {
        this.f22640a.a();
    }

    @Override // com.inmobi.media.InterfaceC3326y8
    public final qk.c b() {
        return this.f22640a.b();
    }
}
