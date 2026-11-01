package com.unity3d.ads.beta;

/* JADX INFO: compiled from: ShowListener.kt */
/* JADX INFO: loaded from: classes9.dex */
public interface ShowListener<UnityAd> {
    void showClick(UnityAd unityad);

    void showComplete(UnityAd unityad, ShowFinishState showFinishState);

    void showFailed(UnityAd unityad, UnityAdsError unityAdsError);

    void showImpression(UnityAd unityad);

    void showStart(UnityAd unityad);
}
