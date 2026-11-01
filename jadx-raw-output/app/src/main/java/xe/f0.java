package xe;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.InterstitialAdListener;
import gl.r0;

/* JADX INFO: loaded from: classes2.dex */
public final class f0 implements InterstitialAdListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0 f74444b;

    @Override // com.facebook.ads.InterstitialAdListener
    public final void onInterstitialDisplayed(Ad ad2) {
    }

    public f0(c0 c0Var) {
        this.f74444b = c0Var;
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdClicked(Ad ad2) {
        this.f74444b.C.onAdClick();
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdLoaded(Ad ad2) {
        this.f74444b.C.onAdLoaded();
    }

    @Override // com.facebook.ads.AdListener
    public final void onError(Ad ad2, AdError adError) {
        this.f74444b.v(adError.getErrorCode() + ", " + adError.getErrorMessage());
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public final void onInterstitialDismissed(Ad ad2) {
        this.f74444b.C.onAdClose();
    }

    @Override // com.facebook.ads.AdListener
    public final void onLoggingImpression(Ad ad2) {
        c0 c0Var = this.f74444b;
        c0Var.C.onAdShow(r0.b(null, c0Var.f61585f));
    }
}
