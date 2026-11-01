package com.yandex.mobile.ads.interstitial;

import androidx.annotation.MainThread;
import com.yandex.mobile.ads.common.AdError;
import com.yandex.mobile.ads.common.ImpressionData;

/* JADX INFO: loaded from: classes3.dex */
@MainThread
public interface InterstitialAdEventListener {
    void onAdClicked();

    void onAdDismissed();

    void onAdFailedToShow(AdError adError);

    void onAdImpression(ImpressionData impressionData);

    void onAdShown();
}
