package io.bidmachine.interstitial;

import androidx.annotation.NonNull;
import io.bidmachine.utils.BMError;

/* JADX INFO: loaded from: classes9.dex */
public class SimpleInterstitialListener implements InterstitialListener {
    @Override // io.bidmachine.interstitial.InterstitialListener, io.bidmachine.AdListener
    public void onAdClicked(@NonNull InterstitialAd interstitialAd) {
    }

    @Override // io.bidmachine.interstitial.InterstitialListener, io.bidmachine.AdFullScreenListener
    public void onAdClosed(@NonNull InterstitialAd interstitialAd, boolean z10) {
    }

    @Override // io.bidmachine.interstitial.InterstitialListener, io.bidmachine.AdListener
    public void onAdExpired(@NonNull InterstitialAd interstitialAd) {
    }

    @Override // io.bidmachine.interstitial.InterstitialListener, io.bidmachine.AdListener
    public void onAdImpression(@NonNull InterstitialAd interstitialAd) {
    }

    @Override // io.bidmachine.interstitial.InterstitialListener, io.bidmachine.AdListener
    public void onAdLoadFailed(@NonNull InterstitialAd interstitialAd, @NonNull BMError bMError) {
    }

    @Override // io.bidmachine.interstitial.InterstitialListener, io.bidmachine.AdListener
    public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
    }

    @Override // io.bidmachine.interstitial.InterstitialListener, io.bidmachine.AdListener
    public void onAdShowFailed(@NonNull InterstitialAd interstitialAd, @NonNull BMError bMError) {
    }
}
