package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* JADX INFO: loaded from: classes10.dex */
public final class Y implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4712g f58404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f58405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f58406c;

    public Y() {
        this(null, null, null, 7, null);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Q fromModel(W w10) {
        Q q10 = new Q();
        C4710e c4710e = w10.f58398a;
        q10.f58391a = c4710e != null ? this.f58404a.fromModel(c4710e) : null;
        a0 a0Var = w10.f58399b;
        q10.f58392b = a0Var != null ? this.f58405b.fromModel(a0Var) : null;
        C4721p c4721p = w10.f58400c;
        q10.f58393c = c4721p != null ? this.f58406c.fromModel(c4721p) : null;
        return q10;
    }

    public Y(C4712g c4712g, c0 c0Var, r rVar) {
        this.f58404a = c4712g;
        this.f58405b = c0Var;
        this.f58406c = rVar;
    }

    public /* synthetic */ Y(C4712g c4712g, c0 c0Var, r rVar, int i10, ck.i iVar) {
        this((i10 & 1) != 0 ? new C4712g() : c4712g, (i10 & 2) != 0 ? new c0() : c0Var, (i10 & 4) != 0 ? new r() : rVar);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final W toModel(Q q10) {
        C4710e c4710e;
        a0 a0Var;
        N n10 = q10.f58391a;
        if (n10 != null) {
            this.f58404a.getClass();
            c4710e = new C4710e(n10.f58382a);
        } else {
            c4710e = null;
        }
        P p10 = q10.f58392b;
        if (p10 != null) {
            this.f58405b.getClass();
            a0Var = new a0(p10.f58388a, p10.f58389b);
        } else {
            a0Var = null;
        }
        O o10 = q10.f58393c;
        return new W(c4710e, a0Var, o10 != null ? this.f58406c.toModel(o10) : null);
    }
}
