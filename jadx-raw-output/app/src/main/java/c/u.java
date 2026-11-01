package c;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.yk.e.util.AdLog;
import gl.r0;
import gl.v0;

/* JADX INFO: loaded from: classes9.dex */
public final class u implements MaxRewardedAdListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k0 f5594b;

    public u(k0 k0Var) {
        this.f5594b = k0Var;
    }

    @Override // com.applovin.mediation.MaxAdListener
    public final void onAdClicked(MaxAd maxAd) {
        this.f5594b.B.onAdClick();
    }

    @Override // com.applovin.mediation.MaxAdListener
    public final void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        this.f5594b.v(maxError.getCode() + ", " + maxError.getMessage());
    }

    @Override // com.applovin.mediation.MaxAdListener
    public final void onAdDisplayed(MaxAd maxAd) {
        k0 k0Var = this.f5594b;
        k0Var.B.onAdShow(r0.b(maxAd, k0Var.f61585f));
    }

    @Override // com.applovin.mediation.MaxAdListener
    public final void onAdHidden(MaxAd maxAd) {
        AdLog.i("applovin load the next ad");
        this.f5594b.C.loadAd();
        this.f5594b.B.onAdClose();
    }

    @Override // com.applovin.mediation.MaxAdListener
    public final void onAdLoadFailed(String str, MaxError maxError) {
        this.f5594b.v(maxError.getCode() + ", " + maxError.getMessage());
    }

    @Override // com.applovin.mediation.MaxAdListener
    public final void onAdLoaded(MaxAd maxAd) {
        k0 k0Var = this.f5594b;
        if (k0Var.E) {
            return;
        }
        k0Var.r(maxAd);
        this.f5594b.f(maxAd.getRevenue());
        this.f5594b.f61605z = "applovin_" + maxAd.getNetworkName();
        v0.a().b(this.f5594b.F, maxAd);
        k0 k0Var2 = this.f5594b;
        k0Var2.D = true;
        k0Var2.B.onAdVideoCache();
    }

    @Override // com.applovin.mediation.MaxRewardedAdListener
    public final void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
        this.f5594b.B.onReward("");
    }
}
