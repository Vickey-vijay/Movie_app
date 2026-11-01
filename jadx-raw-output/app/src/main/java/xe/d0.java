package xe;

import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.model.PAGErrorModel;
import gl.r0;

/* JADX INFO: loaded from: classes2.dex */
public final class d0 extends PAGInterstitialAdInteractionCallback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f74440b;

    public d0(z zVar) {
        this.f74440b = zVar;
    }

    @Override // com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionCallback, com.bytedance.sdk.openadsdk.api.PAGAdListener
    public final void onAdClicked() {
        super.onAdClicked();
        this.f74440b.D.onAdClick();
    }

    @Override // com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionCallback, com.bytedance.sdk.openadsdk.api.PAGAdListener
    public final void onAdDismissed() {
        super.onAdDismissed();
        this.f74440b.D.onAdClose();
    }

    @Override // com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionCallback
    public final void onAdShowFailed(PAGErrorModel pAGErrorModel) {
        super.onAdShowFailed(pAGErrorModel);
        this.f74440b.v(pAGErrorModel.getErrorCode() + ", " + pAGErrorModel.getErrorMessage());
    }

    @Override // com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionCallback, com.bytedance.sdk.openadsdk.api.PAGAdListener
    public final void onAdShowed() {
        super.onAdShowed();
        z zVar = this.f74440b;
        zVar.D.onAdShow(r0.b(null, zVar.f61585f));
    }
}
