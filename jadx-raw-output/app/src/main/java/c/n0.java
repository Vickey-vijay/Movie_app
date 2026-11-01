package c;

import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;

/* JADX INFO: loaded from: classes10.dex */
public final class n0 implements PAGRewardedAdLoadListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f5583b;

    public n0(t tVar) {
        this.f5583b = tVar;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    public final void onAdLoaded(PAGRewardedAd pAGRewardedAd) {
        PAGRewardedAd pAGRewardedAd2 = pAGRewardedAd;
        t tVar = this.f5583b;
        tVar.D = pAGRewardedAd2;
        pAGRewardedAd2.setAdInteractionListener(tVar.H);
        this.f5583b.C.onAdVideoCache();
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.ra
    public final void onError(int i10, String str) {
        this.f5583b.v(i10 + ", " + str);
    }
}
