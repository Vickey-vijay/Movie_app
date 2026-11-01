package xe;

import com.vungle.ads.BaseAd;
import com.vungle.ads.InterstitialAd;
import com.vungle.ads.InterstitialAdListener;
import com.vungle.ads.VungleError;
import com.yk.e.util.AdLog;
import gl.r0;

/* JADX INFO: loaded from: classes2.dex */
public final class y implements InterstitialAdListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p0 f74468b;

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdImpression(BaseAd baseAd) {
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdLeftApplication(BaseAd baseAd) {
    }

    public y(p0 p0Var) {
        this.f74468b = p0Var;
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdClicked(BaseAd baseAd) {
        this.f74468b.f74463b.D.onAdClick();
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdEnd(BaseAd baseAd) {
        this.f74468b.f74463b.D.onAdClose();
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdFailedToLoad(BaseAd baseAd, VungleError vungleError) {
        AdLog.e("LoadAdCallback - onError, Placement Reference ID = " + baseAd.getPlacementId() + ", Error = " + vungleError.getLocalizedMessage());
        this.f74468b.f74463b.v(vungleError.getLocalizedMessage());
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdFailedToPlay(BaseAd baseAd, VungleError vungleError) {
        this.f74468b.f74463b.v("PlayAdCallback - onError, Placement Reference ID = " + baseAd.getPlacementId() + ", Error = " + vungleError.getLocalizedMessage());
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdLoaded(BaseAd baseAd) {
        AdLog.d("LoadAdCallback - onAdLoad\tPlacement Reference ID = " + baseAd.getPlacementId());
        InterstitialAd interstitialAd = this.f74468b.f74463b.G;
        if (interstitialAd == null || !interstitialAd.canPlayAd().booleanValue()) {
            this.f74468b.f74463b.v("");
            return;
        }
        l lVar = this.f74468b.f74463b;
        lVar.E = true;
        if (lVar.F) {
            return;
        }
        baseAd.getPlacementId();
        this.f74468b.f74463b.D.onAdLoaded();
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdStart(BaseAd baseAd) {
        l lVar = this.f74468b.f74463b;
        lVar.D.onAdShow(r0.b(null, lVar.f61585f));
    }
}
