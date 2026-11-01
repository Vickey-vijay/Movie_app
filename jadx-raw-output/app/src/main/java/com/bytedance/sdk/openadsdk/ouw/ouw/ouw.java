package com.bytedance.sdk.openadsdk.ouw.ouw;

import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.bs;

/* JADX INFO: loaded from: classes10.dex */
public final class ouw implements PAGBannerAdLoadListener {
    private final PAGBannerAdLoadListener ouw;

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    public final /* synthetic */ void onAdLoaded(PAGBannerAd pAGBannerAd) {
        final PAGBannerAd pAGBannerAd2 = pAGBannerAd;
        if (this.ouw != null) {
            bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ouw.ouw.ouw.2
                @Override // java.lang.Runnable
                public final void run() {
                    ouw.this.ouw.onAdLoaded(pAGBannerAd2);
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
        bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ouw.ouw.ouw.1
            @Override // java.lang.Runnable
            public final void run() {
                ouw.this.ouw.onError(i10, str);
            }
        });
    }

    public ouw(PAGBannerAdLoadListener pAGBannerAdLoadListener) {
        this.ouw = pAGBannerAdLoadListener;
    }
}
