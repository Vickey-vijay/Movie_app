package com.ironsource;

import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener;

/* JADX INFO: loaded from: classes6.dex */
public final class Nf implements LevelPlayRewardedAdListener {
    @Override // com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener
    public void onAdClicked(LevelPlayAdInfo levelPlayAdInfo) {
        ck.p.j(levelPlayAdInfo, "adInfo");
        Dd.a().a(new C3489gd(0, levelPlayAdInfo.getPlacementName(), false, "", 0, null), Pf.f27382a.a(levelPlayAdInfo));
    }

    @Override // com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener
    public void onAdClosed(LevelPlayAdInfo levelPlayAdInfo) {
        ck.p.j(levelPlayAdInfo, "adInfo");
        Dd.a().b(Pf.f27382a.a(levelPlayAdInfo));
    }

    @Override // com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener
    public void onAdDisplayFailed(LevelPlayAdError levelPlayAdError, LevelPlayAdInfo levelPlayAdInfo) {
        ck.p.j(levelPlayAdError, "error");
        ck.p.j(levelPlayAdInfo, "adInfo");
        Dd ddA = Dd.a();
        Pf pf2 = Pf.f27382a;
        ddA.a(pf2.a(levelPlayAdError), pf2.a(levelPlayAdInfo));
    }

    @Override // com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener
    public void onAdDisplayed(LevelPlayAdInfo levelPlayAdInfo) {
        ck.p.j(levelPlayAdInfo, "adInfo");
        Dd.a().c(Pf.f27382a.a(levelPlayAdInfo));
    }

    @Override // com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener
    public void onAdLoadFailed(LevelPlayAdError levelPlayAdError) {
        ck.p.j(levelPlayAdError, "error");
        Dd.a().a(Pf.f27382a.a(levelPlayAdError));
    }

    @Override // com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener
    public void onAdLoaded(LevelPlayAdInfo levelPlayAdInfo) {
        ck.p.j(levelPlayAdInfo, "adInfo");
        Dd.a().d(Pf.f27382a.a(levelPlayAdInfo));
    }

    @Override // com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener
    public void onAdRewarded(LevelPlayReward levelPlayReward, LevelPlayAdInfo levelPlayAdInfo) {
        ck.p.j(levelPlayReward, "reward");
        ck.p.j(levelPlayAdInfo, "adInfo");
        Dd.a().b(new C3489gd(0, levelPlayAdInfo.getPlacementName(), false, levelPlayReward.getName(), levelPlayReward.getAmount(), null), Pf.f27382a.a(levelPlayAdInfo));
    }
}
