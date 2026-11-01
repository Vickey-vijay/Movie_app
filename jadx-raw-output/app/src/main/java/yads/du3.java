package yads;

import com.yandex.mobile.ads.rewarded.RewardedAdEventListener;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes7.dex */
public final class du3 extends Lambda implements bk.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eu3 f76805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ wt3 f76806c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public du3(eu3 eu3Var, wt3 wt3Var) {
        super(0);
        this.f76805b = eu3Var;
        this.f76806c = wt3Var;
    }

    @Override // bk.a
    public final Object invoke() {
        RewardedAdEventListener rewardedAdEventListener = this.f76805b.f77204a;
        if (rewardedAdEventListener != null) {
            rewardedAdEventListener.onRewarded(this.f76806c);
        }
        return mj.r.f64562a;
    }
}
