package k;

import com.bytedance.sdk.openadsdk.api.model.PAGErrorModel;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdInteractionCallback;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends PAGAppOpenAdInteractionCallback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q0 f62003b;

    public e(q0 q0Var) {
        this.f62003b = q0Var;
    }

    @Override // com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdInteractionCallback, com.bytedance.sdk.openadsdk.api.PAGAdListener
    public final void onAdClicked() {
        super.onAdClicked();
        this.f62003b.D.onAdClick();
    }

    @Override // com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdInteractionCallback, com.bytedance.sdk.openadsdk.api.PAGAdListener
    public final void onAdDismissed() {
        super.onAdDismissed();
        this.f62003b.D.onAdClose();
    }

    @Override // com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdInteractionCallback
    public final void onAdShowFailed(PAGErrorModel pAGErrorModel) {
        super.onAdShowFailed(pAGErrorModel);
        this.f62003b.v(pAGErrorModel.getErrorCode() + ", " + pAGErrorModel.getErrorMessage());
    }

    @Override // com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdInteractionCallback, com.bytedance.sdk.openadsdk.api.PAGAdListener
    public final void onAdShowed() {
        super.onAdShowed();
        q0 q0Var = this.f62003b;
        q0Var.D.onAdShow(gl.r0.b(null, q0Var.f61585f));
    }
}
