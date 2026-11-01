package yads;

import com.yandex.mobile.ads.interstitial.InterstitialAdEventListener;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class ys3 extends Lambda implements bk.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zs3 f85108b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ys3(zs3 zs3Var) {
        super(0);
        this.f85108b = zs3Var;
    }

    @Override // bk.a
    public final Object invoke() {
        InterstitialAdEventListener interstitialAdEventListener = this.f85108b.f85582a;
        if (interstitialAdEventListener != null) {
            interstitialAdEventListener.onAdShown();
        }
        return mj.r.f64562a;
    }
}
