package com.unity3d.mediation.banner;

import ck.p;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* JADX INFO: loaded from: classes10.dex */
public interface LevelPlayBannerAdViewListener {
    default void onAdClicked(LevelPlayAdInfo levelPlayAdInfo) {
        p.j(levelPlayAdInfo, "adInfo");
    }

    default void onAdCollapsed(LevelPlayAdInfo levelPlayAdInfo) {
        p.j(levelPlayAdInfo, "adInfo");
    }

    default void onAdDisplayFailed(LevelPlayAdInfo levelPlayAdInfo, LevelPlayAdError levelPlayAdError) {
        p.j(levelPlayAdInfo, "adInfo");
        p.j(levelPlayAdError, "error");
    }

    default void onAdDisplayed(LevelPlayAdInfo levelPlayAdInfo) {
        p.j(levelPlayAdInfo, "adInfo");
    }

    default void onAdExpanded(LevelPlayAdInfo levelPlayAdInfo) {
        p.j(levelPlayAdInfo, "adInfo");
    }

    default void onAdLeftApplication(LevelPlayAdInfo levelPlayAdInfo) {
        p.j(levelPlayAdInfo, "adInfo");
    }

    void onAdLoadFailed(LevelPlayAdError levelPlayAdError);

    void onAdLoaded(LevelPlayAdInfo levelPlayAdInfo);
}
