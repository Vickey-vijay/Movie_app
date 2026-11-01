package c;

import com.vungle.ads.BaseAd;
import com.vungle.ads.RewardedAd;
import com.vungle.ads.RewardedAdListener;
import com.vungle.ads.VungleError;
import com.yk.e.util.AdLog;
import gl.r0;

/* JADX INFO: loaded from: classes10.dex */
public final class q0 implements RewardedAdListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f5590b;

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdImpression(BaseAd baseAd) {
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdLeftApplication(BaseAd baseAd) {
    }

    public q0(q qVar) {
        this.f5590b = qVar;
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdClicked(BaseAd baseAd) {
        this.f5590b.f5588b.onAdClick();
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdEnd(BaseAd baseAd) {
        this.f5590b.f5588b.onAdClose();
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdFailedToLoad(BaseAd baseAd, VungleError vungleError) {
        AdLog.e("LoadAdCallback - onError, Placement Reference ID = " + baseAd.getPlacementId() + ", Error = " + vungleError.getLocalizedMessage());
        this.f5590b.f5589c.v(vungleError.getLocalizedMessage());
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdFailedToPlay(BaseAd baseAd, VungleError vungleError) {
        this.f5590b.f5589c.v("PlayAdCallback - onError, Placement Reference ID = " + baseAd.getPlacementId() + ", Error = " + vungleError.getLocalizedMessage());
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdLoaded(BaseAd baseAd) {
        AdLog.d("LoadAdCallback - onAdLoad\tPlacement Reference ID = " + baseAd.getPlacementId());
        RewardedAd rewardedAd = this.f5590b.f5589c.G;
        if (rewardedAd == null || !rewardedAd.canPlayAd().booleanValue()) {
            this.f5590b.f5589c.v("");
            return;
        }
        d dVar = this.f5590b.f5589c;
        dVar.B = true;
        if (dVar.D) {
            return;
        }
        baseAd.getPlacementId();
        this.f5590b.f5588b.onAdVideoCache();
    }

    @Override // com.vungle.ads.RewardedAdListener
    public final void onAdRewarded(BaseAd baseAd) {
        this.f5590b.f5588b.onReward("");
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdStart(BaseAd baseAd) {
        q qVar = this.f5590b;
        qVar.f5588b.onAdShow(r0.b(null, qVar.f5589c.f61585f));
    }
}
