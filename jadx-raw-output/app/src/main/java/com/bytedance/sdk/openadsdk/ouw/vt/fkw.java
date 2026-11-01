package com.bytedance.sdk.openadsdk.ouw.vt;

import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.bs;

/* JADX INFO: loaded from: classes8.dex */
public final class fkw implements PAGNativeAdLoadListener {
    private final PAGNativeAdLoadListener ouw;

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    public final /* synthetic */ void onAdLoaded(PAGNativeAd pAGNativeAd) {
        final PAGNativeAd pAGNativeAd2 = pAGNativeAd;
        if (this.ouw != null) {
            bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ouw.vt.fkw.2
                @Override // java.lang.Runnable
                public final void run() {
                    if (fkw.this.ouw != null) {
                        fkw.this.ouw.onAdLoaded(pAGNativeAd2);
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
        bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ouw.vt.fkw.1
            @Override // java.lang.Runnable
            public final void run() {
                if (fkw.this.ouw != null) {
                    fkw.this.ouw.onError(i10, str);
                }
            }
        });
    }

    public fkw(PAGNativeAdLoadListener pAGNativeAdLoadListener) {
        this.ouw = pAGNativeAdLoadListener;
    }
}
