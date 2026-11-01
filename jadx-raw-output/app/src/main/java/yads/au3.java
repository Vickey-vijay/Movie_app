package yads;

import com.yandex.mobile.ads.rewarded.RewardedAdEventListener;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes9.dex */
public final class au3 extends Lambda implements bk.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eu3 f75632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ wp3 f75633c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public au3(eu3 eu3Var, wp3 wp3Var) {
        super(0);
        this.f75632b = eu3Var;
        this.f75633c = wp3Var;
    }

    @Override // bk.a
    public final Object invoke() {
        RewardedAdEventListener rewardedAdEventListener = this.f75632b.f77204a;
        if (rewardedAdEventListener != null) {
            rewardedAdEventListener.onAdFailedToShow(this.f75633c);
        }
        return mj.r.f64562a;
    }
}
