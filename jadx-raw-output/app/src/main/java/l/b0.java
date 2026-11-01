package l;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeBannerAd;
import com.yk.e.util.AdLog;
import gl.r0;

/* JADX INFO: loaded from: classes2.dex */
public final class b0 implements NativeAdListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f63318b;

    @Override // com.facebook.ads.NativeAdListener
    public final void onMediaDownloaded(Ad ad2) {
    }

    public b0(y yVar) {
        this.f63318b = yVar;
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdClicked(Ad ad2) {
        this.f63318b.C.onAdClick();
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdLoaded(Ad ad2) {
        try {
            y yVar = this.f63318b;
            NativeBannerAd nativeBannerAd = yVar.D;
            if (nativeBannerAd != null && nativeBannerAd == ad2) {
                if (nativeBannerAd.isAdInvalidated()) {
                    this.f63318b.v("nativeAd is invalidated");
                    return;
                } else {
                    this.f63318b.B.runOnUiThread(new p(this));
                    return;
                }
            }
            yVar.v("nativeAd is null or nativeAd != ad");
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            this.f63318b.x(e10.getMessage());
        }
    }

    @Override // com.facebook.ads.AdListener
    public final void onError(Ad ad2, AdError adError) {
        this.f63318b.x(adError.getErrorCode() + ", " + adError.getErrorMessage());
    }

    @Override // com.facebook.ads.AdListener
    public final void onLoggingImpression(Ad ad2) {
        y yVar = this.f63318b;
        yVar.C.onAdShow(r0.b(ad2, yVar.f61585f));
    }
}
