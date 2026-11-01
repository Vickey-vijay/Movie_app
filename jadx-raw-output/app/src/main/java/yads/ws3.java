package yads;

import com.yandex.mobile.ads.interstitial.InterstitialAdEventListener;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes9.dex */
public final class ws3 extends Lambda implements bk.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zs3 f84305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ wp3 f84306c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ws3(zs3 zs3Var, wp3 wp3Var) {
        super(0);
        this.f84305b = zs3Var;
        this.f84306c = wp3Var;
    }

    @Override // bk.a
    public final Object invoke() {
        InterstitialAdEventListener interstitialAdEventListener = this.f84305b.f85582a;
        if (interstitialAdEventListener != null) {
            interstitialAdEventListener.onAdFailedToShow(this.f84306c);
        }
        return mj.r.f64562a;
    }
}
