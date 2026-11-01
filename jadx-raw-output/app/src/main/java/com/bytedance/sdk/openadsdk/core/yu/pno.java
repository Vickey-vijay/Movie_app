package com.bytedance.sdk.openadsdk.core.yu;

import android.view.View;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener;

/* JADX INFO: loaded from: classes8.dex */
public final class pno implements PAGBannerAdWrapperListener {
    private final PAGBannerAdInteractionListener ouw;

    @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
    public final void onRenderFail(View view, String str, int i10) {
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
    public final void onRenderSuccess(View view, float f10, float f11) {
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public final void onAdClicked() {
        PAGBannerAdInteractionListener pAGBannerAdInteractionListener = this.ouw;
        if (pAGBannerAdInteractionListener != null) {
            pAGBannerAdInteractionListener.onAdClicked();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
    public final void onAdDismissed() {
        PAGBannerAdInteractionListener pAGBannerAdInteractionListener = this.ouw;
        if (pAGBannerAdInteractionListener != null) {
            pAGBannerAdInteractionListener.onAdDismissed();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
    public final void onAdShow(View view, int i10) {
        PAGBannerAdInteractionListener pAGBannerAdInteractionListener = this.ouw;
        if (pAGBannerAdInteractionListener != null) {
            pAGBannerAdInteractionListener.onAdShowed();
        }
    }

    public pno(PAGBannerAdInteractionListener pAGBannerAdInteractionListener) {
        this.ouw = pAGBannerAdInteractionListener;
    }
}
