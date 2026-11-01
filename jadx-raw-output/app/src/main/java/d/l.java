package d;

import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdInteractionCallback;

/* JADX INFO: loaded from: classes11.dex */
public final class l extends PAGNativeAdInteractionCallback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f51774b;

    public l(q qVar) {
        this.f51774b = qVar;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdInteractionCallback, com.bytedance.sdk.openadsdk.api.PAGAdListener
    public final void onAdClicked() {
        super.onAdClicked();
        k kVar = this.f51774b.f51780b;
        if (kVar != null) {
            kVar.onAdClick();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdInteractionCallback, com.bytedance.sdk.openadsdk.api.PAGAdListener
    public final void onAdDismissed() {
        super.onAdDismissed();
        k kVar = this.f51774b.f51780b;
        if (kVar != null) {
            kVar.onAdClose();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdInteractionCallback, com.bytedance.sdk.openadsdk.api.PAGAdListener
    public final void onAdShowed() {
        super.onAdShowed();
        k kVar = this.f51774b.f51780b;
        if (kVar != null) {
            kVar.a();
        }
    }
}
