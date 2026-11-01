package yads;

import com.yandex.mobile.ads.rewarded.RewardedAdEventListener;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes7.dex */
public final class zt3 extends Lambda implements bk.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eu3 f85585b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zt3(eu3 eu3Var) {
        super(0);
        this.f85585b = eu3Var;
    }

    @Override // bk.a
    public final Object invoke() {
        RewardedAdEventListener rewardedAdEventListener = this.f85585b.f77204a;
        if (rewardedAdEventListener != null) {
            rewardedAdEventListener.onAdDismissed();
        }
        return mj.r.f64562a;
    }
}
