package com.bytedance.sdk.openadsdk.ouw.lh;

import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.bs;

/* JADX INFO: loaded from: classes5.dex */
public final class ouw implements PAGInterstitialAdLoadListener {
    private final PAGInterstitialAdLoadListener ouw;

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    public final /* synthetic */ void onAdLoaded(PAGInterstitialAd pAGInterstitialAd) {
        final PAGInterstitialAd pAGInterstitialAd2 = pAGInterstitialAd;
        if (this.ouw != null) {
            bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ouw.lh.ouw.2
                @Override // java.lang.Runnable
                public final void run() {
                    if (ouw.this.ouw != null) {
                        ouw.this.ouw.onAdLoaded(pAGInterstitialAd2);
                    }
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.ra
    public final void onError(final int i10, final String str) {
        if (this.ouw == null) {
            return;
        }
        if (str == null) {
            str = "Unknown exception.";
        }
        bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ouw.lh.ouw.1
            @Override // java.lang.Runnable
            public final void run() {
                if (ouw.this.ouw != null) {
                    ouw.this.ouw.onError(i10, str);
                }
            }
        });
    }

    public ouw(PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
        this.ouw = pAGInterstitialAdLoadListener;
    }
}
