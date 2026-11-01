package io.appmetrica.analytics.impl;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class O4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4662y5 f55666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Fc f55667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Fc f55668c;

    public final List<G8> a() {
        return nj.s.n(this.f55666a, this.f55667b);
    }

    public final List<G8> b() {
        return nj.r.e(this.f55668c);
    }

    public O4(M6 m10, Rg rg2) {
        C4571ue c4571ue = new C4571ue(m10);
        this.f55666a = new C4662y5(m10);
        this.f55667b = new Fc(c4571ue, new N4(rg2));
        this.f55668c = new Fc(c4571ue, M4.f55546a);
    }
}
