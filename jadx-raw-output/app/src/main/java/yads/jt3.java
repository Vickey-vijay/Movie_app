package yads;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.nativeads.NativeAdEventListener;

/* JADX INFO: loaded from: classes10.dex */
public final class jt3 implements z00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NativeAdEventListener f79180a;

    @Override // yads.z00
    public final void closeNativeAd() {
    }

    @Override // yads.z00
    public final void a(j5 j5Var) {
        new CallbackStackTraceMarker(new gt3(this, j5Var != null ? new lr3(j5Var) : null));
    }

    @Override // yads.z00
    public final void onAdClicked() {
        new CallbackStackTraceMarker(new ft3(this));
    }

    @Override // yads.z00
    public final void onLeftApplication() {
        new CallbackStackTraceMarker(new ht3(this));
    }

    @Override // yads.z00
    public final void onReturnedToApplication() {
        new CallbackStackTraceMarker(new it3(this));
    }

    public jt3(NativeAdEventListener nativeAdEventListener) {
        this.f79180a = nativeAdEventListener;
    }
}
