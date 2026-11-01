package com.ironsource;

import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;

/* JADX INFO: loaded from: classes6.dex */
public final class Pb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AdapterNativeAdViewBinder f27340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AdapterNativeAdData f27341b;

    public final void a(AdapterNativeAdViewBinder adapterNativeAdViewBinder) {
        this.f27340a = adapterNativeAdViewBinder;
    }

    public final AdapterNativeAdData a() {
        return this.f27341b;
    }

    public final AdapterNativeAdViewBinder b() {
        return this.f27340a;
    }

    public final void a(AdapterNativeAdData adapterNativeAdData) {
        this.f27341b = adapterNativeAdData;
    }
}
