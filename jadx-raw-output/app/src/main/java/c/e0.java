package c;

import com.bytedance.sdk.openadsdk.api.reward.PAGRewardItem;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener;
import com.yk.e.util.AdLog;
import gl.r0;

/* JADX INFO: loaded from: classes9.dex */
public final class e0 implements PAGRewardedAdInteractionListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f5569b;

    public e0(t tVar) {
        this.f5569b = tVar;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public final void onAdClicked() {
        this.f5569b.C.onAdClick();
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public final void onAdDismissed() {
        this.f5569b.C.onAdClose();
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public final void onAdShowed() {
        t tVar = this.f5569b;
        tVar.C.onAdShow(r0.b(null, tVar.f61585f));
    }

    @Override // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener
    public final void onUserEarnedReward(PAGRewardItem pAGRewardItem) {
        this.f5569b.C.onReward("");
    }

    @Override // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener
    public final void onUserEarnedRewardFail(int i10, String str) {
        AdLog.e("pangle UserEarnedRewardFail " + i10 + ", " + str);
    }
}
