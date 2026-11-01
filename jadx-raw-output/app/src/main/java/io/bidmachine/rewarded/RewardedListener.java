package io.bidmachine.rewarded;

import androidx.annotation.NonNull;
import io.bidmachine.AdFullScreenListener;
import io.bidmachine.AdListener;
import io.bidmachine.AdRewardedListener;
import io.bidmachine.IAd;
import io.bidmachine.utils.BMError;

/* JADX INFO: loaded from: classes7.dex */
public interface RewardedListener extends AdListener<RewardedAd>, AdFullScreenListener<RewardedAd>, AdRewardedListener<RewardedAd> {
    @Override // io.bidmachine.AdListener
    /* synthetic */ void onAdClicked(@NonNull IAd iAd);

    /* synthetic */ void onAdClosed(@NonNull IAd iAd, boolean z10);

    @Override // io.bidmachine.AdListener
    /* synthetic */ void onAdExpired(@NonNull IAd iAd);

    @Override // io.bidmachine.AdListener
    /* synthetic */ void onAdImpression(@NonNull IAd iAd);

    @Override // io.bidmachine.AdListener
    /* synthetic */ void onAdLoadFailed(@NonNull IAd iAd, @NonNull BMError bMError);

    @Override // io.bidmachine.AdListener
    /* synthetic */ void onAdLoaded(@NonNull IAd iAd);

    /* synthetic */ void onAdRewarded(@NonNull IAd iAd);

    @Override // io.bidmachine.AdListener
    /* synthetic */ void onAdShowFailed(@NonNull IAd iAd, @NonNull BMError bMError);
}
