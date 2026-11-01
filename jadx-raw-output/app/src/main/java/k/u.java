package k;

import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdLoadListener;

/* JADX INFO: loaded from: classes7.dex */
public final class u implements PAGAppOpenAdLoadListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q0 f62035b;

    public u(q0 q0Var) {
        this.f62035b = q0Var;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    public final void onAdLoaded(PAGAppOpenAd pAGAppOpenAd) {
        q0 q0Var = this.f62035b;
        q0Var.F = pAGAppOpenAd;
        q0Var.D.onAdLoaded();
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.ra
    public final void onError(int i10, String str) {
        this.f62035b.x(i10 + ", " + str);
    }
}
