package com.ironsource.mediationsdk.ads.nativead.interfaces;

import com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAd;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;

/* JADX INFO: loaded from: classes2.dex */
public interface NativeAdInteractionListener {
    void onAdClicked(LevelPlayNativeAd levelPlayNativeAd, AdInfo adInfo);

    void onAdImpression(LevelPlayNativeAd levelPlayNativeAd, AdInfo adInfo);
}
