package yads;

import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.interstitial.InterstitialAdLoadListener;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes9.dex */
public final class at3 extends Lambda implements bk.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ct3 f75626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdRequestError f75627c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public at3(ct3 ct3Var, AdRequestError adRequestError) {
        super(0);
        this.f75626b = ct3Var;
        this.f75627c = adRequestError;
    }

    @Override // bk.a
    public final Object invoke() {
        InterstitialAdLoadListener interstitialAdLoadListener = this.f75626b.f76423a;
        if (interstitialAdLoadListener != null) {
            interstitialAdLoadListener.onAdFailedToLoad(this.f75627c);
        }
        return mj.r.f64562a;
    }
}
