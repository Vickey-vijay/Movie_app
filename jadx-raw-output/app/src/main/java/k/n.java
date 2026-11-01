package k;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.sdk.AppLovinSdk;

/* JADX INFO: loaded from: classes7.dex */
public final class n implements MaxAdListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f62018b;

    public n(y yVar) {
        this.f62018b = yVar;
    }

    @Override // com.applovin.mediation.MaxAdListener
    public final void onAdClicked(MaxAd maxAd) {
        this.f62018b.D.onAdClick();
    }

    @Override // com.applovin.mediation.MaxAdListener
    public final void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        this.f62018b.v(maxError.getCode() + ", " + maxError.getMessage());
    }

    @Override // com.applovin.mediation.MaxAdListener
    public final void onAdDisplayed(MaxAd maxAd) {
        y yVar = this.f62018b;
        yVar.D.onAdShow(gl.r0.b(maxAd, yVar.f61585f));
    }

    @Override // com.applovin.mediation.MaxAdListener
    public final void onAdHidden(MaxAd maxAd) {
        this.f62018b.D.onAdClose();
    }

    @Override // com.applovin.mediation.MaxAdListener
    public final void onAdLoadFailed(String str, MaxError maxError) {
        this.f62018b.v(maxError.getCode() + ", " + maxError.getMessage());
    }

    @Override // com.applovin.mediation.MaxAdListener
    public final void onAdLoaded(MaxAd maxAd) {
        y yVar = this.f62018b;
        if (yVar.G) {
            return;
        }
        yVar.F = true;
        if (yVar.E == null || !AppLovinSdk.getInstance(yVar.C).isInitialized()) {
            return;
        }
        if (!this.f62018b.E.isReady()) {
            this.f62018b.E.loadAd();
            return;
        }
        this.f62018b.r(maxAd);
        this.f62018b.f(maxAd.getRevenue());
        this.f62018b.f61605z = "applovin_" + maxAd.getNetworkName();
        this.f62018b.D.onAdLoaded();
    }
}
