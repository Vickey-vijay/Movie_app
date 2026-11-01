package com.unity3d.mediation.interstitial;

import ck.p;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* JADX INFO: loaded from: classes10.dex */
public interface LevelPlayInterstitialAdListener {
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
}
