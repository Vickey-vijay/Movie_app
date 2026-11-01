package c;

import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;

/* JADX INFO: loaded from: classes9.dex */
public final class a0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f5561b;

    public a0(t tVar) {
        this.f5561b = tVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        t tVar = this.f5561b;
        PAGRewardedAd pAGRewardedAd = tVar.D;
        if (pAGRewardedAd != null) {
            pAGRewardedAd.show(tVar.B);
        }
    }
}
