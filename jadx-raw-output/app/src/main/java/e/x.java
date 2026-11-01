package e;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeBannerAd;
import com.yk.e.util.AdLog;
import gl.r0;

/* JADX INFO: loaded from: classes2.dex */
public final class x implements NativeAdListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f52311b;

    @Override // com.facebook.ads.NativeAdListener
    public final void onMediaDownloaded(Ad ad2) {
    }

    public x(r rVar) {
        this.f52311b = rVar;
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdClicked(Ad ad2) {
        this.f52311b.M.onAdClick();
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdLoaded(Ad ad2) {
        try {
            r rVar = this.f52311b;
            NativeBannerAd nativeBannerAd = rVar.N;
            if (nativeBannerAd != null && nativeBannerAd == ad2) {
                if (nativeBannerAd.isAdInvalidated()) {
                    this.f52311b.v("nativeAd is invalidated");
                    return;
                } else {
                    this.f52311b.L.runOnUiThread(new a0(this));
                    return;
                }
            }
            rVar.v("nativeAd is null or nativeAd != ad");
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            this.f52311b.x(e10.getMessage());
        }
    }

    @Override // com.facebook.ads.AdListener
    public final void onError(Ad ad2, AdError adError) {
        this.f52311b.x(adError.getErrorCode() + ", " + adError.getErrorMessage());
    }

    @Override // com.facebook.ads.AdListener
    public final void onLoggingImpression(Ad ad2) {
        r rVar = this.f52311b;
        rVar.M.onAdShow(r0.b(ad2, rVar.f61585f));
    }
}
