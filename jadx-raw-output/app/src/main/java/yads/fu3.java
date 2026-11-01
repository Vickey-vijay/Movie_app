package yads;

import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.rewarded.RewardedAdLoadListener;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes8.dex */
public final class fu3 extends Lambda implements bk.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hu3 f77500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdRequestError f77501c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fu3(hu3 hu3Var, AdRequestError adRequestError) {
        super(0);
        this.f77500b = hu3Var;
        this.f77501c = adRequestError;
    }

    @Override // bk.a
    public final Object invoke() {
        RewardedAdLoadListener rewardedAdLoadListener = this.f77500b.f78385a;
        if (rewardedAdLoadListener != null) {
            rewardedAdLoadListener.onAdFailedToLoad(this.f77501c);
        }
        return mj.r.f64562a;
    }
}
