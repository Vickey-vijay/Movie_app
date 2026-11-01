package com.ironsource;

import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlay;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class Lf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Gf f27011a;

    public static final class a implements InterfaceC3505hb {
        @Override // com.ironsource.InterfaceC3505hb
        public void a(AdInfo adInfo) {
            Lf.this.a(Mf.f27051a, LevelPlay.AdFormat.INTERSTITIAL, Pf.f27382a.a(adInfo));
        }

        @Override // com.ironsource.InterfaceC3505hb
        public void b(IronSourceError ironSourceError) {
            Lf.this.a(Mf.f27052b, LevelPlay.AdFormat.INTERSTITIAL, Pf.f27382a.a(ironSourceError != null ? ironSourceError.getErrorMessage() : null));
        }

        public a() {
        }

        @Override // com.ironsource.InterfaceC3505hb
        public void c(AdInfo adInfo) {
            Lf.this.a(Mf.f27053c, LevelPlay.AdFormat.INTERSTITIAL, Pf.f27382a.a(adInfo));
        }

        @Override // com.ironsource.InterfaceC3505hb
        public void d(AdInfo adInfo) {
            Lf.this.a(Mf.f27056f, LevelPlay.AdFormat.INTERSTITIAL, Pf.f27382a.a(adInfo));
        }

        @Override // com.ironsource.InterfaceC3505hb
        public void e(AdInfo adInfo) {
            Lf.this.a(Mf.f27054d, LevelPlay.AdFormat.INTERSTITIAL, Pf.f27382a.a(adInfo));
        }

        @Override // com.ironsource.InterfaceC3505hb
        public void a(IronSourceError ironSourceError, AdInfo adInfo) {
            Lf.this.a(Mf.f27055e, LevelPlay.AdFormat.INTERSTITIAL, Pf.f27382a.a(ironSourceError != null ? ironSourceError.getErrorMessage() : null, adInfo));
        }

        @Override // com.ironsource.InterfaceC3505hb
        public void b(AdInfo adInfo) {
            Lf.this.a(Mf.f27057g, LevelPlay.AdFormat.INTERSTITIAL, Pf.f27382a.a(adInfo));
        }
    }

    public static final class b implements InterfaceC3734ub, InterfaceC3717tb {
        @Override // com.ironsource.InterfaceC3734ub
        public void a(AdInfo adInfo) {
            Lf.this.a(Mf.f27051a, LevelPlay.AdFormat.REWARDED, Pf.f27382a.a(adInfo));
        }

        @Override // com.ironsource.InterfaceC3734ub
        public void b(IronSourceError ironSourceError) {
            Lf.this.a(Mf.f27052b, LevelPlay.AdFormat.REWARDED, Pf.f27382a.a(ironSourceError != null ? ironSourceError.getErrorMessage() : null));
        }

        public b() {
        }

        @Override // com.ironsource.InterfaceC3700sb
        public void c(AdInfo adInfo) {
            Lf.this.a(Mf.f27053c, LevelPlay.AdFormat.REWARDED, Pf.f27382a.a(adInfo));
        }

        @Override // com.ironsource.InterfaceC3717tb
        public void d(AdInfo adInfo) {
            Lf.this.a(Mf.f27058h, LevelPlay.AdFormat.REWARDED, Pf.f27382a.a(adInfo));
        }

        @Override // com.ironsource.InterfaceC3717tb
        public void a() {
            Lf.this.a(Mf.f27064n, LevelPlay.AdFormat.REWARDED, Pf.f27382a.a(new Object[0]));
        }

        @Override // com.ironsource.InterfaceC3700sb
        public void b(C3489gd c3489gd, AdInfo adInfo) {
            Lf.this.a(Mf.f27059i, LevelPlay.AdFormat.REWARDED, Pf.f27382a.a(Kf.f26939a.a(c3489gd), adInfo));
        }

        @Override // com.ironsource.InterfaceC3700sb
        public void a(IronSourceError ironSourceError, AdInfo adInfo) {
            Lf.this.a(Mf.f27055e, LevelPlay.AdFormat.REWARDED, Pf.f27382a.a(ironSourceError != null ? ironSourceError.getErrorMessage() : null, adInfo));
        }

        @Override // com.ironsource.InterfaceC3700sb
        public void a(C3489gd c3489gd, AdInfo adInfo) {
            Lf.this.a(Mf.f27056f, LevelPlay.AdFormat.REWARDED, Pf.f27382a.a(Kf.f26939a.a(c3489gd), adInfo));
        }

        @Override // com.ironsource.InterfaceC3700sb
        public void b(AdInfo adInfo) {
            Lf.this.a(Mf.f27057g, LevelPlay.AdFormat.REWARDED, Pf.f27382a.a(adInfo));
        }
    }

    public static final class c implements Ga {
        public c() {
        }

        @Override // com.ironsource.Ga
        public void b(IronSourceError ironSourceError) {
            Lf.this.a(Mf.f27052b, LevelPlay.AdFormat.BANNER, Pf.f27382a.a(ironSourceError != null ? ironSourceError.getErrorMessage() : null));
        }

        @Override // com.ironsource.Ga
        public void d(AdInfo adInfo) {
            Lf.this.a(Mf.f27056f, LevelPlay.AdFormat.BANNER, Pf.f27382a.a(adInfo));
        }

        @Override // com.ironsource.Ga
        public void e(AdInfo adInfo) {
            Lf.this.a(Mf.f27060j, LevelPlay.AdFormat.BANNER, Pf.f27382a.a(adInfo));
        }

        @Override // com.ironsource.Ga
        public void f(AdInfo adInfo) {
            Lf.this.a(Mf.f27063m, LevelPlay.AdFormat.BANNER, Pf.f27382a.a(adInfo));
        }

        @Override // com.ironsource.Ga
        public void g(AdInfo adInfo) {
            Lf.this.a(Mf.f27061k, LevelPlay.AdFormat.BANNER, Pf.f27382a.a(adInfo));
        }

        @Override // com.ironsource.Ga
        public void h(AdInfo adInfo) {
            Lf.this.a(Mf.f27062l, LevelPlay.AdFormat.BANNER, Pf.f27382a.a(adInfo));
        }
    }

    public Lf(Gf gf2) {
        ck.p.j(gf2, "javaScriptEvaluator");
        this.f27011a = gf2;
    }

    private final void b() {
        Kf kf2 = Kf.f26939a;
        kf2.a((InterfaceC3505hb) null);
        kf2.a((InterfaceC3700sb) null);
        kf2.a((Ga) null);
    }

    private final void c() {
        Kf.f26939a.e();
    }

    public final void a() {
        b();
        c();
    }

    public final void d() {
        Kf kf2 = Kf.f26939a;
        kf2.a(new a());
        kf2.a(new b());
        kf2.a(new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(String str, LevelPlay.AdFormat adFormat, List<? extends Object> list) {
        this.f27011a.a(str, adFormat, list);
    }
}
