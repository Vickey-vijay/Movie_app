package yads;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.rewarded.RewardedAdLoadListener;

/* JADX INFO: loaded from: classes2.dex */
public final class hu3 implements q10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RewardedAdLoadListener f78385a;

    @Override // yads.q10
    public final void a(l4 l4Var) {
        new CallbackStackTraceMarker(new fu3(this, new AdRequestError(l4Var.f79697a, l4Var.f79699c, l4Var.f79700d)));
    }

    public hu3(RewardedAdLoadListener rewardedAdLoadListener) {
        this.f78385a = rewardedAdLoadListener;
    }

    @Override // yads.q10
    public final void a(dr2 dr2Var) {
        new CallbackStackTraceMarker(new gu3(this, new xt3(dr2Var, new xp3(), new lk())));
    }
}
