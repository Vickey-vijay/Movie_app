package yads;

import com.yandex.mobile.ads.rewarded.RewardedAdEventListener;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class bu3 extends Lambda implements bk.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eu3 f75970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ lr3 f75971c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bu3(eu3 eu3Var, lr3 lr3Var) {
        super(0);
        this.f75970b = eu3Var;
        this.f75971c = lr3Var;
    }

    @Override // bk.a
    public final Object invoke() {
        RewardedAdEventListener rewardedAdEventListener = this.f75970b.f77204a;
        if (rewardedAdEventListener != null) {
            rewardedAdEventListener.onAdImpression(this.f75971c);
        }
        return mj.r.f64562a;
    }
}
