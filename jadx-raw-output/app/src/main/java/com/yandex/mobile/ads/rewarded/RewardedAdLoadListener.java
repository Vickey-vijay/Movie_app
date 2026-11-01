package com.yandex.mobile.ads.rewarded;

import androidx.annotation.MainThread;
import com.yandex.mobile.ads.common.AdRequestError;

/* JADX INFO: loaded from: classes11.dex */
@MainThread
public interface RewardedAdLoadListener {
    void onAdFailedToLoad(AdRequestError adRequestError);

    void onAdLoaded(RewardedAd rewardedAd);
}
