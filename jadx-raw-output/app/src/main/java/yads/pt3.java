package yads;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.nativeads.NativeAdLoadListener;

/* JADX INFO: loaded from: classes10.dex */
public final class pt3 implements c10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NativeAdLoadListener f81591a;

    public final void a(w02 w02Var) {
        new CallbackStackTraceMarker(new ot3(this, new com.yandex.mobile.ads.nativeads.d(w02Var)));
    }

    public pt3(NativeAdLoadListener nativeAdLoadListener) {
        this.f81591a = nativeAdLoadListener;
    }

    public final void a(l4 l4Var) {
        new CallbackStackTraceMarker(new nt3(this, new AdRequestError(l4Var.f79697a, l4Var.f79699c, l4Var.f79700d)));
    }
}
