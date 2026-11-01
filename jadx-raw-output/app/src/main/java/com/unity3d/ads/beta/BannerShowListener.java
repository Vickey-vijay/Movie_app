package com.unity3d.ads.beta;

/* JADX INFO: compiled from: BannerShowListener.kt */
/* JADX INFO: loaded from: classes.dex */
public interface BannerShowListener {
    void unityAdsBannerDidClick(BannerAd bannerAd);

    void unityAdsBannerDidFailShow(BannerAd bannerAd, UnityAdsError unityAdsError);

    void unityAdsBannerImpression(BannerAd bannerAd);
}
