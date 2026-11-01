package com.ironsource;

import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes4.dex */
public final class Yb extends L0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InternalNativeAdListener f27940a;

    @Override // com.ironsource.L0
    public void a(AdapterNativeAdData adapterNativeAdData, AdapterNativeAdViewBinder adapterNativeAdViewBinder, AdInfo adInfo) {
        ck.p.j(adapterNativeAdData, "adapterNativeAdData");
        ck.p.j(adapterNativeAdViewBinder, "nativeAdViewBinder");
        this.f27940a.onNativeAdLoaded(adInfo, adapterNativeAdData, adapterNativeAdViewBinder);
    }

    public Yb(InternalNativeAdListener internalNativeAdListener) {
        ck.p.j(internalNativeAdListener, "mNativeAdListener");
        this.f27940a = internalNativeAdListener;
    }

    @Override // com.ironsource.L0
    public void a(IronSourceError ironSourceError) {
        this.f27940a.onNativeAdLoadFailed(ironSourceError);
    }

    @Override // com.ironsource.L0
    public void d(AdInfo adInfo) {
        this.f27940a.onNativeAdImpression(adInfo);
    }

    @Override // com.ironsource.L0
    public void a(C3489gd c3489gd, AdInfo adInfo) {
        ck.p.j(c3489gd, "placement");
        this.f27940a.onNativeAdClicked(adInfo);
    }
}
