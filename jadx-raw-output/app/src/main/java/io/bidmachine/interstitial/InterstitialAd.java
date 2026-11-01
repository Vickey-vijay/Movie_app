package io.bidmachine.interstitial;

import android.content.Context;
import androidx.annotation.NonNull;
import io.bidmachine.AdProcessCallback;
import io.bidmachine.AdsType;
import io.bidmachine.ContextProvider;
import io.bidmachine.FullScreenAd;
import io.bidmachine.FullScreenAdObject;
import io.bidmachine.NetworkAdapter;
import io.bidmachine.models.AdObjectParams;
import io.bidmachine.unified.UnifiedFullscreenAd;

/* JADX INFO: loaded from: classes11.dex */
public final class InterstitialAd extends FullScreenAd<InterstitialAd, InterstitialRequest, FullScreenAdObject<InterstitialRequest>, InterstitialListener> {
    public InterstitialAd(@NonNull Context context) {
        super(context, AdsType.Interstitial);
    }

    @Override // io.bidmachine.BidMachineAd
    public FullScreenAdObject<InterstitialRequest> createAdObject(@NonNull ContextProvider contextProvider, @NonNull InterstitialRequest interstitialRequest, @NonNull NetworkAdapter networkAdapter, @NonNull AdObjectParams adObjectParams, @NonNull AdProcessCallback adProcessCallback) {
        UnifiedFullscreenAd unifiedFullscreenAdCreateInterstitial = networkAdapter.createInterstitial();
        if (unifiedFullscreenAdCreateInterstitial == null) {
            return null;
        }
        return new FullScreenAdObject<>(contextProvider, adProcessCallback, interstitialRequest, adObjectParams, unifiedFullscreenAdCreateInterstitial);
    }
}
