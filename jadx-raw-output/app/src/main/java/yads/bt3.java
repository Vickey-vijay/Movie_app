package yads;

import com.yandex.mobile.ads.interstitial.InterstitialAdLoadListener;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class bt3 extends Lambda implements bk.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ct3 f75960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ts3 f75961c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bt3(ct3 ct3Var, ts3 ts3Var) {
        super(0);
        this.f75960b = ct3Var;
        this.f75961c = ts3Var;
    }

    @Override // bk.a
    public final Object invoke() {
        InterstitialAdLoadListener interstitialAdLoadListener = this.f75960b.f76423a;
        if (interstitialAdLoadListener != null) {
            interstitialAdLoadListener.onAdLoaded(this.f75961c);
        }
        return mj.r.f64562a;
    }
}
