package sg.bigo.ads.ad.interstitial.k;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.AdCountDownButton;
import sg.bigo.ads.ad.interstitial.c;
import sg.bigo.ads.ad.interstitial.q;
import sg.bigo.ads.ad.interstitial.s;
import sg.bigo.ads.ad.interstitial.t;
import sg.bigo.ads.ad.interstitial.w;
import sg.bigo.ads.api.VideoController;
import sg.bigo.ads.api.a.m;

/* JADX INFO: loaded from: classes7.dex */
public class a extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public w f68613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public m f68614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final sg.bigo.ads.common.e.a.AbstractC0702a f68615c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f68616d;

    public a(@NonNull Activity activity) {
        super(activity);
        this.f68615c = new sg.bigo.ads.common.e.a.AbstractC0702a() { // from class: sg.bigo.ads.ad.interstitial.k.a.1
            @Override // sg.bigo.ads.common.e.a.AbstractC0702a
            public final void a(boolean z10) {
                a aVar = a.this;
                if (z10) {
                    aVar.ac();
                } else {
                    aVar.ae();
                }
            }
        };
        this.f68616d = true;
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public int Y() {
        return R.layout.bigo_ad_activity_interstitial_vpaid;
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public final boolean Z() {
        return true;
    }

    public void a() {
        if (this.A == null) {
            return;
        }
        int i10 = this.f68613a.f69005c;
        if (((s) this.f68586y).f().x() != 4) {
            i10 = 0;
        }
        this.A.a(i10, (AdCountDownButton.b) null);
    }

    @Override // sg.bigo.ads.ad.interstitial.q, sg.bigo.ads.ad.interstitial.i
    public final void g() {
        super.g();
        VideoController videoControllerAk = ak();
        if (videoControllerAk != null && videoControllerAk.isPaused() && this.f68616d) {
            videoControllerAk.play();
            this.f68616d = false;
        }
        AdCountDownButton adCountDownButton = this.A;
        if (adCountDownButton == null || adCountDownButton.f67721c) {
            return;
        }
        adCountDownButton.c();
    }

    @Override // sg.bigo.ads.ad.interstitial.q, sg.bigo.ads.ad.interstitial.i
    public void g(int i10) {
        super.g(i10);
        if (this.D == null) {
            a("can not find ad root view.");
            return;
        }
        if (this.f68586y == 0) {
            a("Illegal InterstitialAd.");
            return;
        }
        AdCountDownButton adCountDownButton = this.A;
        if (adCountDownButton != null) {
            sg.bigo.ads.common.e.a.a(adCountDownButton, this.f68615c);
            this.A.setShowCloseButtonInCountdown(false);
            this.A.setTakeoverTickEvent(false);
            if (this.A.getVisibility() != 0) {
                this.A.setVisibility(0);
                c.b((View) this.A);
            }
            a();
        }
        ViewGroup viewGroup = this.D;
        if (viewGroup != null && this.C != null) {
            TextView textView = (TextView) viewGroup.findViewById(R.id.inter_advertiser);
            TextView textView2 = (TextView) this.D.findViewById(R.id.inter_ad_label);
            String advertiser = this.C.getAdvertiser();
            if (textView != null && textView2 != null) {
                boolean z10 = !TextUtils.isEmpty(advertiser);
                textView.setVisibility(z10 ? 0 : 8);
                if (z10) {
                    textView.setText(advertiser);
                    textView2.setText(R.string.bigo_ad_tag);
                }
            }
        }
        t tVarAj = aj();
        ViewGroup viewGroup2 = this.D;
        tVarAj.a(viewGroup2, viewGroup2, ai(), 12, this.f68613a.f69011i, this.A);
    }

    @Override // sg.bigo.ads.ad.interstitial.q, sg.bigo.ads.ad.interstitial.i
    @CallSuper
    public final void i() {
        VideoController videoControllerAk = ak();
        boolean z10 = videoControllerAk != null && videoControllerAk.isPlaying();
        this.f68616d = z10;
        if (z10) {
            videoControllerAk.pause();
        }
        AdCountDownButton adCountDownButton = this.A;
        if (adCountDownButton != null && !adCountDownButton.f67721c) {
            adCountDownButton.b();
        }
        super.i();
    }

    @Override // sg.bigo.ads.ad.interstitial.q, sg.bigo.ads.ad.interstitial.i
    public void l() {
        super.l();
        this.f68614b = ((s) this.f68586y).f().e();
        w wVar = new w();
        m mVar = this.f68614b;
        if (mVar != null) {
            wVar.f69008f = mVar.c("video_play_page.media_view_clickable_switch");
            wVar.f69009g = this.f68614b.c("video_play_page.other_space_clickable_switch");
            wVar.f69011i = this.f68614b.a("video_play_page.click_type");
            wVar.f69005c = this.f68614b.a("video_play_page.force_staying_time");
        }
        this.f68613a = wVar;
    }

    @Override // sg.bigo.ads.ad.interstitial.q
    public final int n() {
        return 0;
    }
}
