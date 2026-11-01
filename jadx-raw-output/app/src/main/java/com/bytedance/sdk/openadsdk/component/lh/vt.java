package com.bytedance.sdk.openadsdk.component.lh;

import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.bs;

/* JADX INFO: loaded from: classes7.dex */
public final class vt implements PAGInterstitialAdLoadListener {
    public final PAGInterstitialAdLoadListener ouw;

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    public final /* synthetic */ void onAdLoaded(PAGInterstitialAd pAGInterstitialAd) {
        final PAGInterstitialAd pAGInterstitialAd2 = pAGInterstitialAd;
        if (this.ouw != null) {
            bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.lh.vt.2
                @Override // java.lang.Runnable
                public final void run() {
                    PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener = vt.this.ouw;
                    if (pAGInterstitialAdLoadListener != null) {
                        pAGInterstitialAdLoadListener.onAdLoaded(pAGInterstitialAd2);
                    }
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.ra
    public final void onError(final int i10, final String str) {
        if (this.ouw != null) {
            bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.lh.vt.1
                @Override // java.lang.Runnable
                public final void run() {
                    PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener = vt.this.ouw;
                    if (pAGInterstitialAdLoadListener != null) {
                        pAGInterstitialAdLoadListener.onError(i10, str);
                    }
                }
            });
        }
    }

    public vt(PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
        this.ouw = pAGInterstitialAdLoadListener;
    }
}
