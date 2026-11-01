package c;

import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.AdLoadListener;
import sg.bigo.ads.api.RewardAdInteractionListener;
import sg.bigo.ads.api.RewardVideoAd;

/* JADX INFO: loaded from: classes9.dex */
public final class s implements AdLoadListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b0 f5593a;

    public s(b0 b0Var) {
        this.f5593a = b0Var;
    }

    @Override // sg.bigo.ads.api.AdLoadListener
    public final void onAdLoaded(Ad ad2) {
        RewardVideoAd rewardVideoAd = (RewardVideoAd) ad2;
        p pVar = this.f5593a.f5562a;
        pVar.C = rewardVideoAd;
        rewardVideoAd.setAdInteractionListener((RewardAdInteractionListener) pVar.E);
        this.f5593a.f5562a.B.onAdVideoCache();
    }

    @Override // sg.bigo.ads.api.AdLoadListener
    public final void onError(AdError adError) {
        this.f5593a.f5562a.v(adError.getCode() + ", " + adError.getMessage());
    }
}
