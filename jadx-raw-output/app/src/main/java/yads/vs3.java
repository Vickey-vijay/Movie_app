package yads;

import com.yandex.mobile.ads.interstitial.InterstitialAdEventListener;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes6.dex */
public final class vs3 extends Lambda implements bk.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zs3 f84003b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vs3(zs3 zs3Var) {
        super(0);
        this.f84003b = zs3Var;
    }

    @Override // bk.a
    public final Object invoke() {
        InterstitialAdEventListener interstitialAdEventListener = this.f84003b.f85582a;
        if (interstitialAdEventListener != null) {
            interstitialAdEventListener.onAdDismissed();
        }
        return mj.r.f64562a;
    }
}
