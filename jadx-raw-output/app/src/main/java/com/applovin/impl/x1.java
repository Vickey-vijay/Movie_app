package com.applovin.impl;

import android.app.Activity;
import android.os.SystemClock;
import android.view.ViewGroup;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import com.safedk.android.internal.special.SpecialsBridge;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes5.dex */
public class x1 extends w1 {
    private final y1 M;
    private g0 N;
    private long O;
    private final AtomicBoolean P;

    private long C() {
        com.applovin.impl.sdk.ad.b bVar = this.f9767a;
        if (!(bVar instanceof com.applovin.impl.sdk.ad.a)) {
            return 0L;
        }
        float fH1 = ((com.applovin.impl.sdk.ad.a) bVar).h1();
        if (fH1 <= 0.0f) {
            fH1 = this.f9767a.r();
        }
        return (long) (n7.c(fH1) * (((double) this.f9767a.y()) / 100.0d));
    }

    private int D() {
        g0 g0Var;
        int iMin = 100;
        if (h()) {
            if (((Boolean) this.f9768b.a(x4.f9938h1)).booleanValue() && !this.f9767a.hasShown()) {
                return 0;
            }
            if (!E() && (g0Var = this.N) != null) {
                iMin = (int) Math.min(100.0d, ((this.O - g0Var.b()) / this.O) * 100.0d);
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.f9769c.a("AppLovinFullscreenActivity", "Ad engaged at " + iMin + "%");
            }
        }
        return iMin;
    }

    public boolean E() {
        if (!(this.J && this.f9767a.a1()) && h()) {
            return this.P.get();
        }
        return true;
    }

    @Override // com.applovin.impl.w1
    public void a(ViewGroup viewGroup) {
        this.M.a(this.f9777k, this.f9776j, b(), viewGroup);
        if (((Boolean) this.f9768b.a(x4.X5)).booleanValue() || !a(false)) {
            com.applovin.impl.adview.k kVar = this.f9776j;
            if (kVar != null) {
                kVar.b();
            }
            SpecialsBridge.appLovinAdViewRenderAd(b(), this.f9767a);
            a("javascript:al_onPoststitialShow();", this.f9767a.x());
            if (h()) {
                long jC = C();
                this.O = jC;
                if (jC > 0) {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f9769c.a("AppLovinFullscreenActivity", "Scheduling timer for ad fully watched in " + this.O + "ms...");
                    }
                    this.N = g0.a(this.O, this.f9768b, new Runnable() { // from class: com.applovin.impl.ag
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f7004b.F();
                        }
                    });
                }
            }
            if (this.f9777k != null) {
                if (this.f9767a.r() >= 0) {
                    a(this.f9777k, this.f9767a.r(), new Runnable() { // from class: com.applovin.impl.bg
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f7099b.G();
                        }
                    });
                } else {
                    this.f9777k.setVisibility(0);
                }
            }
            I();
            this.f9768b.q0().a(new r6(this.f9768b, "updateMainViewOM", new Runnable() { // from class: com.applovin.impl.cg
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7160b.H();
                }
            }), d6.b.OTHER, TimeUnit.SECONDS.toMillis(1L));
            p();
            super.c(n7.e(this.f9768b));
        }
    }

    @Override // com.applovin.impl.w1
    public void b(long j10) {
    }

    @Override // com.applovin.impl.w1
    public void v() {
    }

    @Override // com.applovin.impl.w1
    public void w() {
        a((ViewGroup) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H() {
        ArrayList arrayList = new ArrayList();
        com.applovin.impl.adview.g gVar = this.f9777k;
        if (gVar != null) {
            arrayList.add(new h4(gVar, FriendlyObstructionPurpose.CLOSE_AD, "close button"));
        }
        com.applovin.impl.adview.k kVar = this.f9776j;
        if (kVar != null && kVar.a()) {
            com.applovin.impl.adview.k kVar2 = this.f9776j;
            arrayList.add(new h4(kVar2, FriendlyObstructionPurpose.NOT_VISIBLE, kVar2.getIdentifier()));
        }
        this.f9767a.getAdEventTracker().b(b(), arrayList);
    }

    @Override // com.applovin.impl.w1
    public void A() {
        this.M.a(this.f9778l);
        this.f9783q = SystemClock.elapsedRealtime();
        this.P.set(true);
    }

    public void I() {
        long jP;
        long millis = 0;
        if (this.f9767a.O() >= 0 || this.f9767a.P() >= 0) {
            if (this.f9767a.O() >= 0) {
                jP = this.f9767a.O();
            } else {
                if (this.f9767a.W0()) {
                    int iH1 = (int) ((com.applovin.impl.sdk.ad.a) this.f9767a).h1();
                    if (iH1 > 0) {
                        millis = TimeUnit.SECONDS.toMillis(iH1);
                    } else {
                        int iR = (int) this.f9767a.r();
                        if (iR > 0) {
                            millis = TimeUnit.SECONDS.toMillis(iR);
                        }
                    }
                }
                jP = (long) (millis * (((double) this.f9767a.P()) / 100.0d));
            }
            c(jP);
        }
    }

    public x1(com.applovin.impl.sdk.ad.b bVar, Activity activity, Map map, com.applovin.impl.sdk.k kVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(bVar, activity, map, kVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        this.M = new y1(this.f9767a, this.f9770d, this.f9768b);
        this.P = new AtomicBoolean();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f9769c.a("AppLovinFullscreenActivity", "Marking ad as fully watched");
        }
        this.P.set(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G() {
        this.f9783q = SystemClock.elapsedRealtime();
    }

    @Override // com.applovin.impl.w1
    public void e() {
        super.e();
        A();
    }

    @Override // com.applovin.impl.w1
    public void f() {
        super.f();
        A();
    }

    @Override // com.applovin.impl.w1
    public void m() {
        super.a(D(), false, E(), -2L);
    }

    @Override // com.applovin.impl.w1
    public void x() {
        super.x();
        this.P.set(true);
    }

    @Override // com.applovin.impl.w1
    public void a(String str) {
        if (!((Boolean) this.f9768b.a(x4.P6)).booleanValue()) {
            com.applovin.impl.sdk.ad.b bVar = this.f9767a;
            if (bVar != null) {
                bVar.a(str);
            }
            m();
        }
        g0 g0Var = this.N;
        if (g0Var != null) {
            g0Var.a();
            this.N = null;
        }
        super.a(str);
    }
}
