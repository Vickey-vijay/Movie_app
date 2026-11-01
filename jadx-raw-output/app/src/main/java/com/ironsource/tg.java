package com.ironsource;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class tg implements F, Dg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final W0 f31320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AbstractC3757w0 f31321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Bg f31322c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Kg f31323d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final wg f31324e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private G f31325f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Eg f31326g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List<A> f31327h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private A f31328i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f31329j;

    public static final class a implements xg {
        @Override // com.ironsource.xg
        public void a(yg ygVar) {
            ck.p.j(ygVar, "waterfallInstances");
            if (tg.this.f31329j) {
                return;
            }
            tg.this.a(ygVar);
        }

        public a() {
        }

        @Override // com.ironsource.xg
        public void a(int i10, String str) {
            ck.p.j(str, "errorReason");
            if (tg.this.f31329j) {
                return;
            }
            tg.this.f31322c.a(i10, str);
        }
    }

    public final void c() {
        this.f31323d.a();
    }

    public final void d() {
        this.f31329j = true;
        A a10 = this.f31328i;
        if (a10 != null) {
            a10.b();
        }
    }

    public tg(W0 w10, AbstractC3757w0 abstractC3757w0, boolean z10, Bg bg2) {
        ck.p.j(w10, "adTools");
        ck.p.j(abstractC3757w0, "adUnitData");
        ck.p.j(bg2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f31320a = w10;
        this.f31321b = abstractC3757w0;
        this.f31322c = bg2;
        this.f31323d = Kg.a.f26940a.a(z10, this);
        this.f31324e = wg.f31555d.a(w10, abstractC3757w0);
        this.f31327h = new ArrayList();
    }

    private final List<A> f() {
        G.c cVarC;
        List<A> listD;
        G g10 = this.f31325f;
        return (g10 == null || (cVarC = g10.c()) == null || (listD = cVarC.d()) == null) ? nj.s.k() : listD;
    }

    private final boolean i() {
        return this.f31328i != null;
    }

    private final void j() {
        G g10 = this.f31325f;
        G.b bVarD = g10 != null ? g10.d() : null;
        if (bVarD == null || bVarD.e()) {
            this.f31322c.a(509, "Mediation No fill");
            return;
        }
        if (!bVarD.f()) {
            Iterator<A> it = bVarD.a().iterator();
            while (it.hasNext()) {
                it.next().a(this);
            }
        } else {
            Eg eg2 = this.f31326g;
            if (eg2 != null) {
                eg2.a();
            }
        }
    }

    @Override // com.ironsource.F
    public void b(A a10) {
        ck.p.j(a10, C3605n2.f30210p);
        if (this.f31329j || i()) {
            a10.c();
            return;
        }
        Eg eg2 = this.f31326g;
        if (eg2 != null) {
            eg2.a(a10);
        }
        this.f31327h.add(a10);
        if (this.f31327h.size() == 1) {
            Eg eg3 = this.f31326g;
            if (eg3 != null) {
                eg3.b(a10);
            }
            this.f31322c.b(a10);
            return;
        }
        G g10 = this.f31325f;
        if (g10 == null || !g10.a(a10)) {
            return;
        }
        this.f31322c.a(a10);
    }

    public final void c(A a10) {
        ck.p.j(a10, C3605n2.f30210p);
        Eg eg2 = this.f31326g;
        if (eg2 != null) {
            eg2.a(a10, this.f31321b.l(), this.f31321b.o());
        }
    }

    public final A e() {
        G.c cVarC;
        G g10 = this.f31325f;
        if (g10 == null || (cVarC = g10.c()) == null) {
            return null;
        }
        return cVarC.c();
    }

    public final Ed g() {
        return this.f31323d.b();
    }

    public final boolean h() {
        Iterator<A> it = this.f31327h.iterator();
        while (it.hasNext()) {
            if (it.next().z()) {
                return true;
            }
        }
        return false;
    }

    public final void a(D d10) {
        ck.p.j(d10, "adInstanceFactory");
        this.f31324e.a(d10, new a());
    }

    public final void a(J j10, boolean z10) {
        Eg eg2;
        ck.p.j(j10, "adInstancePresenter");
        A aC = this.f31323d.c();
        if (aC != null) {
            this.f31323d.a(aC);
            if (!z10 && (eg2 = this.f31326g) != null) {
                eg2.a(aC, f());
            }
            aC.a(j10);
        }
    }

    @Override // com.ironsource.F
    public void a(IronSourceError ironSourceError, A a10) {
        ck.p.j(ironSourceError, "error");
        ck.p.j(a10, C3605n2.f30210p);
        if (this.f31329j) {
            return;
        }
        j();
    }

    @Override // com.ironsource.Dg
    public boolean b() {
        return !this.f31327h.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(yg ygVar) {
        G gA = G.f26543c.a(this.f31321b, ygVar);
        this.f31325f = gA;
        this.f31326g = Eg.f26483c.a(this.f31320a, this.f31321b, this.f31324e.a(), ygVar, gA);
        j();
    }

    @Override // com.ironsource.Dg
    public void a(A a10) {
        ck.p.j(a10, C3605n2.f30210p);
        this.f31328i = a10;
        this.f31327h.remove(a10);
    }

    @Override // com.ironsource.Dg
    public void a() {
        IronLog.INTERNAL.verbose(C3621o0.a(this.f31320a, "destroyReadyToShowInstances", (String) null, 2, (Object) null));
        if (this.f31327h.isEmpty()) {
            return;
        }
        Iterator<T> it = this.f31327h.iterator();
        while (it.hasNext()) {
            ((A) it.next()).c();
        }
        this.f31327h.clear();
        this.f31320a.e().h().a();
    }

    @Override // com.ironsource.Dg
    public A a(int i10) {
        List<A> listF = f();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listF) {
            if (((A) obj).w()) {
                arrayList.add(obj);
            }
        }
        return (A) nj.b0.i0(arrayList, i10);
    }
}
