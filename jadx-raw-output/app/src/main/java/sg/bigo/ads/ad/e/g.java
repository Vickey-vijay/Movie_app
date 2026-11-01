package sg.bigo.ads.ad.e;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.ad.interstitial.AdCountDownButton;
import sg.bigo.ads.ad.interstitial.d.m;
import sg.bigo.ads.ad.interstitial.s;
import sg.bigo.ads.ad.interstitial.t;
import sg.bigo.ads.ad.interstitial.w;
import sg.bigo.ads.ad.interstitial.y;
import sg.bigo.ads.api.VideoController;

/* JADX INFO: loaded from: classes9.dex */
public class g extends y {

    @Nullable
    public h I;
    public boolean J;
    private boolean K;
    private boolean O;
    private boolean P;

    public g(@NonNull Activity activity) {
        super(activity);
        this.K = true;
        this.J = false;
        this.O = false;
        this.P = false;
    }

    private void aI() {
        if (this.I != null && !this.J && !Q()) {
            this.J = true;
            this.I.N();
        } else if (this.I == null) {
            sg.bigo.ads.common.t.a.a(2, "", "Failed to claim reward because of null RewardVideoAd.");
        }
    }

    public static /* synthetic */ boolean f(g gVar) {
        gVar.P = true;
        return true;
    }

    @Override // sg.bigo.ads.ad.interstitial.y, sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.ad.interstitial.i, sg.bigo.ads.ad.interstitial.k.b
    public final void E() {
        this.f67746e = true;
        if (I()) {
            H();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.i, sg.bigo.ads.controller.e.b, sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void T() {
        super.T();
        T t10 = this.f68586y;
        if (t10 == 0) {
            return;
        }
        if (t10 instanceof h) {
            this.I = (h) t10;
        }
        if (this.I == null || !al()) {
            a("Illegal video content.");
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.y, sg.bigo.ads.ad.interstitial.b.a.InterfaceC0669a
    public final void a(boolean z10, boolean z11) {
        super.a(z10, z11);
        if (z10 || z11) {
            AdCountDownButton adCountDownButton = this.A;
            if (adCountDownButton != null) {
                adCountDownButton.e();
            }
            aI();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.i, sg.bigo.ads.controller.e.b, sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void ag() {
        if (this.K && e_() == 0) {
            d(true);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.y, sg.bigo.ads.ad.interstitial.q
    public final int ai() {
        int i10 = ((sg.bigo.ads.ad.interstitial.a) this).f67743b.a("interstitial_video_style.video_play_page.icon_strategy") != 2 ? 1 : 2;
        if (this.f67757p.get()) {
            return 3;
        }
        return i10;
    }

    @Override // sg.bigo.ads.ad.interstitial.y, sg.bigo.ads.ad.interstitial.i, sg.bigo.ads.ad.interstitial.k.b
    public final void b(String str) {
        this.O = true;
        super.b(str);
    }

    @Override // sg.bigo.ads.ad.interstitial.y, sg.bigo.ads.ad.interstitial.a
    public final boolean f(boolean z10) {
        if (Q()) {
            return super.f(z10);
        }
        if (this.f67757p.get()) {
            AdCountDownButton adCountDownButton = this.A;
            if (adCountDownButton != null) {
                adCountDownButton.e();
            }
        } else if (!this.J && this.K && e_() == 0 && !this.P) {
            final VideoController videoControllerAk = ak();
            new c(this.L).a(new c.a() { // from class: sg.bigo.ads.ad.e.g.1

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private int f67716c = -1;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private boolean f67717d = false;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private boolean f67718e = false;

                private void e() {
                    if (g.this.e_() == 3) {
                        g.this.f(this.f67716c);
                    }
                }

                @Override // sg.bigo.ads.ad.e.c.a
                public final void a() {
                    this.f67716c = g.this.e_();
                    g.this.f(3);
                    VideoController videoController = videoControllerAk;
                    if (videoController != null && videoController.isPlaying()) {
                        videoControllerAk.pause();
                        this.f67717d = true;
                    }
                    h hVar = g.this.I;
                    if (hVar != null) {
                        sg.bigo.ads.core.d.b.a((sg.bigo.ads.api.core.b) hVar.f(), g.this.e_(), 2);
                    }
                    g.this.aj().c();
                    ((y) g.this).G.b(false);
                }

                @Override // sg.bigo.ads.ad.e.c.a
                public final void b() {
                    VideoController videoController;
                    e();
                    if (!this.f67718e && this.f67717d && (videoController = videoControllerAk) != null && videoController.isPaused()) {
                        videoControllerAk.play();
                    }
                    g.this.aj().b();
                    ((y) g.this).G.a(false);
                }

                @Override // sg.bigo.ads.ad.e.c.a
                public final void c() {
                    this.f67718e = true;
                    g.f(g.this);
                    if (g.this.N() || g.this.O()) {
                        g.this.ab();
                        return;
                    }
                    if (g.this.f67759r != null && g.this.f67759r.f68791y.a()) {
                        e();
                    } else if (!g.this.f67745d && ((sg.bigo.ads.ad.interstitial.a) g.this).f67743b.a("interstitial_video_style.video_play_page.skip_type") != 2) {
                        g.this.ab();
                    } else {
                        e();
                        g.this.m(6);
                    }
                }

                @Override // sg.bigo.ads.ad.e.c.a
                public final void d() {
                    t tVarAj = g.this.aj();
                    if (tVarAj instanceof m) {
                        ((m) tVarAj).A();
                    }
                }
            });
            return false;
        }
        boolean zF = super.f(z10);
        if (zF && (this.f67757p.get() || this.O)) {
            aI();
        }
        return zF;
    }

    @Override // sg.bigo.ads.ad.interstitial.y, sg.bigo.ads.api.VideoController.a
    public final void i(boolean z10) {
        AdCountDownButton adCountDownButton;
        super.i(z10);
        if (z10 || e_() != 0 || this.K || (adCountDownButton = this.A) == null) {
            return;
        }
        adCountDownButton.setTakeoverTickEvent(false);
        this.A.a(15, (AdCountDownButton.b) null);
    }

    @Override // sg.bigo.ads.ad.interstitial.y, sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.ad.interstitial.q, sg.bigo.ads.ad.interstitial.i
    public void l() {
        boolean z10;
        super.l();
        sg.bigo.ads.api.a.m mVar = ((sg.bigo.ads.ad.interstitial.a) this).f67744c;
        if (mVar != null) {
            z10 = this.K & (mVar.a("video_play_page.force_staying_time") != -1);
        } else {
            z10 = this.K & (((sg.bigo.ads.ad.interstitial.a) this).f67743b.a("interstitial_video_style.style") != 2);
        }
        this.K = z10;
        if (this.K) {
            return;
        }
        w wVar = this.f67749h;
        wVar.f69004b = 0;
        wVar.f69005c = -1;
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    public final void s() {
        super.s();
        sg.bigo.ads.core.a.a aVarF = ((s) this.f68586y).f();
        if (!this.f67757p.get() || aVarF.bh() == null || this.K) {
            return;
        }
        w wVar = this.f67749h;
        wVar.f69004b = 0;
        wVar.f69005c = 15;
    }

    @Override // sg.bigo.ads.ad.interstitial.y, sg.bigo.ads.ad.interstitial.a
    public final void z() {
        super.z();
        AdCountDownButton adCountDownButton = this.A;
        if (adCountDownButton != null) {
            adCountDownButton.setShowCloseButtonInCountdown(this.K);
        }
    }
}
