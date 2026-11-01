package yads;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.interstitial.InterstitialAdLoadListener;

/* JADX INFO: loaded from: classes3.dex */
public final class ct3 implements w00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterstitialAdLoadListener f76423a;

    @Override // yads.w00
    public final void a(l4 l4Var) {
        new CallbackStackTraceMarker(new at3(this, new AdRequestError(l4Var.f79697a, l4Var.f79699c, l4Var.f79700d)));
    }

    public ct3(InterstitialAdLoadListener interstitialAdLoadListener) {
        this.f76423a = interstitialAdLoadListener;
    }

    @Override // yads.w00
    public final void a(jd1 jd1Var) {
        new CallbackStackTraceMarker(new bt3(this, new ts3(jd1Var, new xp3(), new lk())));
    }
}
