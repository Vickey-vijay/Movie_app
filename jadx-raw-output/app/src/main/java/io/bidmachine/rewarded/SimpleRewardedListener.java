package io.bidmachine.rewarded;

import androidx.annotation.NonNull;
import io.bidmachine.utils.BMError;

/* JADX INFO: loaded from: classes10.dex */
public class SimpleRewardedListener implements RewardedListener {
    @Override // io.bidmachine.rewarded.RewardedListener, io.bidmachine.AdListener
    public void onAdClicked(@NonNull RewardedAd rewardedAd) {
    }

    @Override // io.bidmachine.rewarded.RewardedListener, io.bidmachine.AdFullScreenListener
    public void onAdClosed(@NonNull RewardedAd rewardedAd, boolean z10) {
    }

    @Override // io.bidmachine.rewarded.RewardedListener, io.bidmachine.AdListener
    public void onAdExpired(@NonNull RewardedAd rewardedAd) {
    }

    @Override // io.bidmachine.rewarded.RewardedListener, io.bidmachine.AdListener
    public void onAdImpression(@NonNull RewardedAd rewardedAd) {
    }

    @Override // io.bidmachine.rewarded.RewardedListener, io.bidmachine.AdListener
    public void onAdLoadFailed(@NonNull RewardedAd rewardedAd, @NonNull BMError bMError) {
    }

    @Override // io.bidmachine.rewarded.RewardedListener, io.bidmachine.AdListener
    public void onAdLoaded(@NonNull RewardedAd rewardedAd) {
    }

    @Override // io.bidmachine.rewarded.RewardedListener, io.bidmachine.AdRewardedListener
    public void onAdRewarded(@NonNull RewardedAd rewardedAd) {
    }

    @Override // io.bidmachine.rewarded.RewardedListener, io.bidmachine.AdListener
    public void onAdShowFailed(@NonNull RewardedAd rewardedAd, @NonNull BMError bMError) {
    }
}
