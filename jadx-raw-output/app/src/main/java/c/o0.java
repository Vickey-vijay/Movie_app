package c;

import com.bytedance.sdk.openadsdk.api.init.PAGSdk;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedRequest;

/* JADX INFO: loaded from: classes10.dex */
public final class o0 implements PAGSdk.PAGInitCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f5585a;

    public o0(t tVar) {
        this.f5585a = tVar;
    }

    @Override // com.bytedance.sdk.openadsdk.api.init.PAGSdk.PAGInitCallback
    public final void fail(int i10, String str) {
        this.f5585a.x(i10 + ", " + str);
    }

    @Override // com.bytedance.sdk.openadsdk.api.init.PAGSdk.PAGInitCallback
    public final void success() {
        PAGRewardedRequest pAGRewardedRequest = new PAGRewardedRequest();
        t tVar = this.f5585a;
        PAGRewardedAd.loadAd(tVar.F, pAGRewardedRequest, tVar.G);
    }
}
