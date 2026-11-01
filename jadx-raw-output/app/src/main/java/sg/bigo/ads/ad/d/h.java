package sg.bigo.ads.ad.d;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.CallSuper;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.AdCountDownButton;
import sg.bigo.ads.ad.interstitial.c.x;
import sg.bigo.ads.ad.interstitial.d.w;
import sg.bigo.ads.ad.interstitial.p;
import sg.bigo.ads.ad.interstitial.r;
import sg.bigo.ads.ad.interstitial.s;
import sg.bigo.ads.ad.interstitial.y;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.api.VideoController;
import sg.bigo.ads.api.a.m;
import sg.bigo.ads.common.utils.n;
import sg.bigo.ads.controller.landing.LandingPageStyleConfig;

/* JADX INFO: loaded from: classes7.dex */
public class h extends y implements f.a {
    private w I;
    private x J;

    public h(@NonNull Activity activity) {
        super(activity);
        activity.overridePendingTransition(0, 0);
    }

    private boolean aI() {
        sg.bigo.ads.core.a.a aVarF = ((s) this.f68586y).f();
        sg.bigo.ads.ad.interstitial.a.b bVar = ((s) this.f68586y).C;
        return (aVarF.bh() == null) && (bVar == null || !bVar.b());
    }

    private w aJ() {
        if (this.I == null) {
            this.I = sg.bigo.ads.ad.interstitial.d.a.a(this.C, ((sg.bigo.ads.ad.interstitial.a) this).f67744c, n());
        }
        return this.I;
    }

    private x aK() {
        if (this.J == null) {
            this.J = sg.bigo.ads.ad.interstitial.d.a.b(this.C, ((sg.bigo.ads.ad.interstitial.a) this).f67744c, n());
        }
        return this.J;
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    public final void K() {
        MediaView mediaView;
        ViewGroup viewGroup = this.D;
        if (viewGroup == null || (mediaView = (MediaView) viewGroup.findViewById(R.id.inter_media)) == null) {
            return;
        }
        aJ().a((ViewGroup) mediaView);
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public final boolean U() {
        return true;
    }

    @Override // sg.bigo.ads.ad.interstitial.y, sg.bigo.ads.ad.interstitial.i
    public final int Y() {
        int iN = n();
        if (iN == 2) {
            return R.layout.bigo_ad_activity_pop_up_style_2;
        }
        if (iN == 3) {
            return R.layout.bigo_ad_activity_pop_up_style_3;
        }
        if (iN == 4) {
            return R.layout.bigo_ad_activity_pop_up_style_4;
        }
        if (iN != 5) {
            return iN != 6 ? R.layout.bigo_ad_activity_pop_up_style_1 : R.layout.bigo_ad_activity_pop_up_style_6;
        }
        return R.layout.bigo_ad_activity_pop_up_style_5;
    }

    @Override // sg.bigo.ads.ad.d.f.a
    public final void a() {
        e(true);
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    public final void a(@NonNull ViewGroup viewGroup) {
        aJ().c(viewGroup);
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    public final void a(boolean z10) {
    }

    @Override // sg.bigo.ads.ad.interstitial.y, sg.bigo.ads.ad.interstitial.b.a.InterfaceC0669a
    public final void a(boolean z10, boolean z11) {
        AdCountDownButton adCountDownButton = this.A;
        if (adCountDownButton != null) {
            adCountDownButton.e();
        }
        if (z11 && e_() == 0) {
            a(((y) this).G, new Runnable() { // from class: sg.bigo.ads.ad.d.h.1
                @Override // java.lang.Runnable
                public final void run() {
                    h.this.av();
                    if (h.this.L()) {
                        h.this.m(1);
                        return;
                    }
                    VideoController videoControllerAk = h.this.ak();
                    if (videoControllerAk != null) {
                        videoControllerAk.play();
                    }
                }
            });
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.y
    public final LandingPageStyleConfig aD() {
        int iN = aK().n();
        int iO = aK().o();
        ViewGroup viewGroup = this.D;
        return new LandingPageStyleConfig(sg.bigo.ads.ad.interstitial.f.e.class, 1, iN, iO, viewGroup != null ? viewGroup.getMeasuredHeight() : 0, r.a(this.C, 0), 0.8f);
    }

    @Override // sg.bigo.ads.ad.interstitial.i, sg.bigo.ads.controller.e.b, sg.bigo.ads.api.core.BaseAdActivityImpl
    @CallSuper
    public final void ah() {
        super.ah();
        this.L.overridePendingTransition(0, 0);
    }

    @Override // sg.bigo.ads.ad.interstitial.y
    public final boolean ao() {
        aK().i();
        return false;
    }

    @Override // sg.bigo.ads.ad.interstitial.y
    public final boolean az() {
        return !this.f67757p.get();
    }

    @Override // sg.bigo.ads.ad.interstitial.y, sg.bigo.ads.ad.interstitial.a
    @NonNull
    public final sg.bigo.ads.ad.interstitial.w b() {
        sg.bigo.ads.ad.interstitial.w wVar = new sg.bigo.ads.ad.interstitial.w();
        m mVar = ((sg.bigo.ads.ad.interstitial.a) this).f67744c;
        if (mVar != null) {
            wVar.f69008f = mVar.c("video_play_page.media_view_clickable_switch");
            wVar.f69010h = ((sg.bigo.ads.ad.interstitial.a) this).f67744c.c("video_play_page.ad_component_clickable_switch");
            wVar.f69009g = ((sg.bigo.ads.ad.interstitial.a) this).f67744c.c("video_play_page.other_space_clickable_switch");
            wVar.f69011i = ((sg.bigo.ads.ad.interstitial.a) this).f67744c.a("video_play_page.click_type");
            wVar.f69014l = ((sg.bigo.ads.ad.interstitial.a) this).f67744c.c("layer.other_space_clickable_switch");
            wVar.f69015m = ((sg.bigo.ads.ad.interstitial.a) this).f67744c.a("layer.click_type");
            wVar.f69005c = ((sg.bigo.ads.ad.interstitial.a) this).f67744c.a("video_play_page.force_staying_time");
            wVar.f69007e = ((sg.bigo.ads.ad.interstitial.a) this).f67744c.a("layer.force_staying_time");
            wVar.f69012j = ((sg.bigo.ads.ad.interstitial.a) this).f67744c.a("video_play_page.auto_click");
            wVar.f69016n = ((sg.bigo.ads.ad.interstitial.a) this).f67744c.a("video_play_page.time_for_auto_click", -1);
            wVar.f69017o = ((sg.bigo.ads.ad.interstitial.a) this).f67744c.a("video_play_page.time_for_show_backup", -1);
            this.f67745d = true;
            wVar.f69003a = false;
            wVar.f69004b = 0;
            wVar.f69006d = false;
        }
        return wVar;
    }

    @Override // sg.bigo.ads.ad.interstitial.y, sg.bigo.ads.ad.interstitial.a
    public final boolean f(boolean z10) {
        int iE_ = e_();
        if (!L() || iE_ != 0) {
            return z10;
        }
        b(true);
        m(3);
        return e_() == 0;
    }

    @Override // sg.bigo.ads.ad.interstitial.y, sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.ad.interstitial.q, sg.bigo.ads.ad.interstitial.i
    public final void g() {
        super.g();
        if (this.A == null) {
            aJ().q();
            aK().q();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.y, sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.ad.interstitial.q, sg.bigo.ads.ad.interstitial.i
    public final void g(@LayoutRes int i10) {
        super.g(i10);
        if (this.D == null) {
            return;
        }
        p pVar = this.f67759r;
        if (pVar != null) {
            pVar.b();
        }
        aJ().g(this.D);
        aJ().h(this.D);
        aJ().d(this.D);
        aJ().a(p(R.id.inter_container), this.D.findViewById(R.id.media_layout));
    }

    @Override // sg.bigo.ads.ad.interstitial.y, sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.ad.interstitial.q, sg.bigo.ads.ad.interstitial.i
    public final void i() {
        super.i();
        if (this.A == null) {
            aJ().p();
            aK().p();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.y, sg.bigo.ads.api.VideoController.a
    public final void i(boolean z10) {
        super.i(z10);
        ap();
    }

    @Override // sg.bigo.ads.ad.interstitial.y
    public final void l(int i10) {
        aJ();
        w.a(this.D, this.f67753l);
        n nVarE = aJ().e(this.D);
        this.f67762u = nVarE;
        if (nVarE == null) {
            aJ().f(this.D);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.y
    public final void m(int i10) {
        int iA;
        if (this.D == null) {
            return;
        }
        if (e_() != 0) {
            sg.bigo.ads.common.t.a.a(0, "PopupVideoActivityImpl", "end page can be shown but current page is not main");
            return;
        }
        if (this.f67757p.get() && aI()) {
            return;
        }
        View viewFindViewById = this.D.findViewById(R.id.inter_btn_cta);
        if (viewFindViewById != null) {
            viewFindViewById.setBackgroundColor(this.f67755n);
        }
        View viewFindViewById2 = this.D.findViewById(R.id.inter_btn_mute);
        if (viewFindViewById2 != null) {
            viewFindViewById2.setVisibility(4);
        }
        MediaView mediaView = (MediaView) this.D.findViewById(R.id.inter_media);
        if (mediaView == null || (iA = aK().a(mediaView, (s) this.f68586y, this.f67757p.get())) == 0) {
            return;
        }
        aK().g(this.D);
        aK().c(this.D);
        aK().f(this.D);
        aK().a(this.A, this.D, this);
        aK().d(this.D);
        f(iA);
        sg.bigo.ads.core.d.b.a((sg.bigo.ads.api.core.b) ((s) this.f68586y).f(), e_(), i10);
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    public final void q() {
        aJ().a(this.A, this.D, this);
    }

    @Override // sg.bigo.ads.ad.interstitial.y, sg.bigo.ads.ad.interstitial.a
    public final void u() {
        e(true);
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    public final void w() {
    }

    @Override // sg.bigo.ads.ad.interstitial.y, sg.bigo.ads.ad.interstitial.a
    public final void z() {
        super.z();
        AdCountDownButton adCountDownButton = this.A;
        if (adCountDownButton != null) {
            adCountDownButton.setShowCloseButtonInCountdown(false);
            this.A.setTakeoverTickEvent(false);
        }
    }
}
