package com.yandex.mobile.ads.interstitial;

import androidx.annotation.MainThread;
import com.yandex.mobile.ads.common.AdRequestError;

/* JADX INFO: loaded from: classes5.dex */
@MainThread
public interface InterstitialAdLoadListener {
    void onAdFailedToLoad(AdRequestError adRequestError);

    void onAdLoaded(InterstitialAd interstitialAd);
}
