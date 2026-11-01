package com.unity3d.mediation.rewarded;

import ck.p;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* JADX INFO: loaded from: classes4.dex */
public interface LevelPlayRewardedAdListener {
    default void onAdClicked(LevelPlayAdInfo levelPlayAdInfo) {
        p.j(levelPlayAdInfo, "adInfo");
    }

    default void onAdClosed(LevelPlayAdInfo levelPlayAdInfo) {
        p.j(levelPlayAdInfo, "adInfo");
    }

    default void onAdDisplayFailed(LevelPlayAdError levelPlayAdError, LevelPlayAdInfo levelPlayAdInfo) {
        p.j(levelPlayAdError, "error");
        p.j(levelPlayAdInfo, "adInfo");
    }

    void onAdDisplayed(LevelPlayAdInfo levelPlayAdInfo);

    default void onAdInfoChanged(LevelPlayAdInfo levelPlayAdInfo) {
        p.j(levelPlayAdInfo, "adInfo");
    }

    void onAdLoadFailed(LevelPlayAdError levelPlayAdError);

    void onAdLoaded(LevelPlayAdInfo levelPlayAdInfo);

    void onAdRewarded(LevelPlayReward levelPlayReward, LevelPlayAdInfo levelPlayAdInfo);
}
