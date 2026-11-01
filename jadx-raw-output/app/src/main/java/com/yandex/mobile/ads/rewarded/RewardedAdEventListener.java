package com.yandex.mobile.ads.rewarded;

import androidx.annotation.MainThread;
import com.yandex.mobile.ads.common.AdError;
import com.yandex.mobile.ads.common.ImpressionData;

/* JADX INFO: loaded from: classes7.dex */
@MainThread
public interface RewardedAdEventListener {
    void onAdClicked();

    void onAdDismissed();

    void onAdFailedToShow(AdError adError);

    void onAdImpression(ImpressionData impressionData);

    void onAdShown();

    void onRewarded(Reward reward);
}
