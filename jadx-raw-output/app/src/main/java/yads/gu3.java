package yads;

import com.yandex.mobile.ads.rewarded.RewardedAdLoadListener;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
public final class gu3 extends Lambda implements bk.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hu3 f77942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xt3 f77943c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gu3(hu3 hu3Var, xt3 xt3Var) {
        super(0);
        this.f77942b = hu3Var;
        this.f77943c = xt3Var;
    }

    @Override // bk.a
    public final Object invoke() {
        RewardedAdLoadListener rewardedAdLoadListener = this.f77942b.f78385a;
        if (rewardedAdLoadListener != null) {
            rewardedAdLoadListener.onAdLoaded(this.f77943c);
        }
        return mj.r.f64562a;
    }
}
