package com.bytedance.sdk.openadsdk.ouw.fkw;

import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.bs;

/* JADX INFO: loaded from: classes5.dex */
public final class vt implements PAGRewardedAdLoadListener {
    private final PAGRewardedAdLoadListener ouw;

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    public final /* synthetic */ void onAdLoaded(PAGRewardedAd pAGRewardedAd) {
        final PAGRewardedAd pAGRewardedAd2 = pAGRewardedAd;
        if (this.ouw != null) {
            bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ouw.fkw.vt.2
                @Override // java.lang.Runnable
                public final void run() {
                    if (vt.this.ouw != null) {
                        vt.this.ouw.onAdLoaded(pAGRewardedAd2);
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
        bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ouw.fkw.vt.1
            @Override // java.lang.Runnable
            public final void run() {
                if (vt.this.ouw != null) {
                    vt.this.ouw.onError(i10, str);
                }
            }
        });
    }

    public vt(PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
        this.ouw = pAGRewardedAdLoadListener;
    }
}
