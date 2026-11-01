package dp;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeBannerAd;
import com.yk.e.util.AdLog;

/* JADX INFO: loaded from: classes2.dex */
public final class z implements NativeAdListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m0 f52281b;

    @Override // com.facebook.ads.NativeAdListener
    public final void onMediaDownloaded(Ad ad2) {
    }

    public z(m0 m0Var) {
        this.f52281b = m0Var;
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdClicked(Ad ad2) {
        this.f52281b.G.onAdClick();
        m0 m0Var = this.f52281b;
        if (m0Var.D) {
            m0Var.C();
            this.f52281b.G.onAdClose();
        }
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdLoaded(Ad ad2) {
        try {
            m0 m0Var = this.f52281b;
            NativeBannerAd nativeBannerAd = m0Var.H;
            if (nativeBannerAd != null && nativeBannerAd == ad2) {
                if (nativeBannerAd.isAdInvalidated()) {
                    this.f52281b.v("nativeAd is invalidated");
                    return;
                } else {
                    this.f52281b.F.runOnUiThread(new y(this));
                    return;
                }
            }
            m0Var.v("nativeAd is null or nativeAd != ad");
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            this.f52281b.x(e10.getMessage());
        }
    }

    @Override // com.facebook.ads.AdListener
    public final void onError(Ad ad2, AdError adError) {
        this.f52281b.x(adError.getErrorCode() + ", " + adError.getErrorMessage());
    }

    @Override // com.facebook.ads.AdListener
    public final void onLoggingImpression(Ad ad2) {
        m0 m0Var = this.f52281b;
        m0Var.G.onAdShow(gl.r0.b(ad2, m0Var.f61585f));
    }
}
