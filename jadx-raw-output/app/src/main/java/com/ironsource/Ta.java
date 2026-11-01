package com.ironsource;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* JADX INFO: loaded from: classes5.dex */
public final class Ta implements Da {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3621o0 f27684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final W2 f27685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final N2 f27686c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Ea f27687d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Ya f27688e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private L2 f27689f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final M0 f27690g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final InterfaceC3791y0 f27691h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final O2 f27692i;

    public static final class a implements O2 {
        public a() {
        }

        public void a() {
            Ea eaM = Ta.this.m();
            if (eaM != null) {
                eaM.onAdLeftApplication();
            }
        }

        public void b() {
            Ea eaM = Ta.this.m();
            if (eaM != null) {
                eaM.k();
            }
        }

        public void c() {
            Ea eaM = Ta.this.m();
            if (eaM != null) {
                eaM.i();
            }
        }

        @Override // com.ironsource.K0
        public void e() {
            Ea eaM = Ta.this.m();
            if (eaM != null) {
                eaM.onAdClicked();
            }
        }

        @Override // com.ironsource.O2
        public /* bridge */ /* synthetic */ mj.r g() {
            a();
            return mj.r.f64562a;
        }

        @Override // com.ironsource.O2
        public /* bridge */ /* synthetic */ mj.r h() {
            c();
            return mj.r.f64562a;
        }

        @Override // com.ironsource.O2
        public /* bridge */ /* synthetic */ mj.r j() {
            b();
            return mj.r.f64562a;
        }
    }

    public static final class b implements M0 {
        @Override // com.ironsource.M0
        public void a(C3706t0 c3706t0) {
            ck.p.j(c3706t0, "adUnitCallback");
            Ta.this.l().a(c3706t0);
        }

        public b() {
        }

        @Override // com.ironsource.M0
        public void a(IronSourceError ironSourceError) {
            Ta.this.l().a(ironSourceError);
        }
    }

    public static final class c implements InterfaceC3791y0 {
        public c() {
        }

        @Override // com.ironsource.InterfaceC3791y0
        public void a(LevelPlayAdInfo levelPlayAdInfo) {
            ck.p.j(levelPlayAdInfo, "adInfo");
            Ea eaM = Ta.this.m();
            if (eaM != null) {
                eaM.onAdDisplayed(levelPlayAdInfo);
            }
        }

        @Override // com.ironsource.InterfaceC3791y0
        public void c(IronSourceError ironSourceError) {
            Ea eaM = Ta.this.m();
            if (eaM != null) {
                eaM.d(ironSourceError);
            }
        }
    }

    public final C3621o0 a() {
        return this.f27684a;
    }

    public final void b(Ea ea2) {
        this.f27687d = ea2;
    }

    @Override // com.ironsource.Da
    public void d() {
    }

    @Override // com.ironsource.Da
    public void f() {
    }

    public Ta(C3621o0 c3621o0, W2 w10, N2 n10) {
        ck.p.j(c3621o0, "adTools");
        ck.p.j(w10, "bannerContainer");
        ck.p.j(n10, "bannerAdUnitFactory");
        this.f27684a = c3621o0;
        this.f27685b = w10;
        this.f27686c = n10;
        this.f27688e = new Ua(this);
        this.f27690g = new b();
        this.f27691h = new c();
        this.f27692i = new a();
    }

    public final void a(Ya ya2) {
        ck.p.j(ya2, "<set-?>");
        this.f27688e = ya2;
    }

    @Override // com.ironsource.Da
    public void b() {
        this.f27688e.b();
    }

    @Override // com.ironsource.Da
    public void c() {
        this.f27688e.c();
    }

    public final O2 e() {
        return this.f27692i;
    }

    public final M0 g() {
        return this.f27690g;
    }

    public final InterfaceC3791y0 h() {
        return this.f27691h;
    }

    public final N2 i() {
        return this.f27686c;
    }

    public final W2 j() {
        return this.f27685b;
    }

    public final L2 k() {
        return this.f27689f;
    }

    public final Ya l() {
        return this.f27688e;
    }

    public final Ea m() {
        return this.f27687d;
    }

    public final void a(L2 l10) {
        this.f27689f = l10;
    }

    public final void a(String str) {
        ck.p.j(str, "message");
        this.f27684a.e().h().f("Banner Single Ad Unit Strategy - " + str);
    }

    public final void a(C3706t0 c3706t0, L2 l10) {
        Ea ea2;
        ck.p.j(c3706t0, "adUnitCallback");
        ck.p.j(l10, "adUnit");
        l10.a(this.f27685b.getViewBinder(), this.f27691h);
        LevelPlayAdInfo levelPlayAdInfoC = c3706t0.c();
        if (levelPlayAdInfoC == null || (ea2 = this.f27687d) == null) {
            return;
        }
        ea2.onAdLoaded(levelPlayAdInfoC);
    }

    public final void a(IronSourceError ironSourceError) {
        Ea ea2 = this.f27687d;
        if (ea2 != null) {
            ea2.b(ironSourceError);
        }
    }

    @Override // com.ironsource.Da
    public void a(Ea ea2) {
        ck.p.j(ea2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f27687d = ea2;
    }
}
