package com.yandex.mobile.ads.nativeads;

import androidx.annotation.MainThread;
import com.yandex.mobile.ads.common.AdRequestError;

/* JADX INFO: loaded from: classes7.dex */
@MainThread
public interface NativeAdLoadListener {
    void onAdFailedToLoad(AdRequestError adRequestError);

    void onAdLoaded(NativeAd nativeAd);
}
