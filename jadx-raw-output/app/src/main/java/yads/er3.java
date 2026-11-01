package yads;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.banner.ClosableBannerAdEventListener;
import com.yandex.mobile.ads.common.AdRequestError;

/* JADX INFO: loaded from: classes.dex */
public final class er3 implements h00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClosableBannerAdEventListener f77189a;

    @Override // yads.h00
    public final void a(j5 j5Var) {
        new CallbackStackTraceMarker(new br3(this, j5Var != null ? new lr3(j5Var) : null));
    }

    @Override // yads.h00
    public final void closeBannerAd() {
        new CallbackStackTraceMarker(new xq3(this));
    }

    @Override // yads.h00
    public final void onAdClicked() {
        new CallbackStackTraceMarker(new yq3(this));
    }

    @Override // yads.h00
    public final void onAdLoaded() {
        new CallbackStackTraceMarker(new ar3(this));
    }

    @Override // yads.h00
    public final void onLeftApplication() {
        new CallbackStackTraceMarker(new cr3(this));
    }

    @Override // yads.h00
    public final void onReturnedToApplication() {
        new CallbackStackTraceMarker(new dr3(this));
    }

    public er3(ClosableBannerAdEventListener closableBannerAdEventListener) {
        this.f77189a = closableBannerAdEventListener;
    }

    @Override // yads.h00
    public final void a(l4 l4Var) {
        new CallbackStackTraceMarker(new zq3(this, new AdRequestError(l4Var.f79697a, l4Var.f79699c, l4Var.f79700d)));
    }
}
