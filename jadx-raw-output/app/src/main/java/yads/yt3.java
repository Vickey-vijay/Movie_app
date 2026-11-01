package yads;

import com.yandex.mobile.ads.rewarded.RewardedAdEventListener;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class yt3 extends Lambda implements bk.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eu3 f85112b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yt3(eu3 eu3Var) {
        super(0);
        this.f85112b = eu3Var;
    }

    @Override // bk.a
    public final Object invoke() {
        RewardedAdEventListener rewardedAdEventListener = this.f85112b.f77204a;
        if (rewardedAdEventListener != null) {
            rewardedAdEventListener.onAdClicked();
        }
        return mj.r.f64562a;
    }
}
