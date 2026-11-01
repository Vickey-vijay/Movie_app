package yads;

import com.yandex.mobile.ads.interstitial.InterstitialAdEventListener;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes11.dex */
public final class xs3 extends Lambda implements bk.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zs3 f84683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ lr3 f84684c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xs3(zs3 zs3Var, lr3 lr3Var) {
        super(0);
        this.f84683b = zs3Var;
        this.f84684c = lr3Var;
    }

    @Override // bk.a
    public final Object invoke() {
        InterstitialAdEventListener interstitialAdEventListener = this.f84683b.f85582a;
        if (interstitialAdEventListener != null) {
            interstitialAdEventListener.onAdImpression(this.f84684c);
        }
        return mj.r.f64562a;
    }
}
