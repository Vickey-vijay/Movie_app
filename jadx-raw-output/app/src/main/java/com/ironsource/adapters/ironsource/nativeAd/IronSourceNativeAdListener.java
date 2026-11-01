package com.ironsource.adapters.ironsource.nativeAd;

import ck.p;
import com.ironsource.G8;
import com.ironsource.I8;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes11.dex */
public final class IronSourceNativeAdListener implements I8.a {
    private final IronSourceNativeAdViewBinder binder;
    private final NativeAdSmashListener smashListener;

    public IronSourceNativeAdListener(IronSourceNativeAdViewBinder ironSourceNativeAdViewBinder, NativeAdSmashListener nativeAdSmashListener) {
        p.j(ironSourceNativeAdViewBinder, "binder");
        p.j(nativeAdSmashListener, "smashListener");
        this.binder = ironSourceNativeAdViewBinder;
        this.smashListener = nativeAdSmashListener;
    }

    @Override // com.ironsource.I8.a
    public void onNativeAdClicked() {
        this.smashListener.onNativeAdClicked();
    }

    @Override // com.ironsource.I8.a
    public void onNativeAdLoadFailed(String str) {
        p.j(str, "reason");
        this.smashListener.onNativeAdLoadFailed(new IronSourceError(510, "Load failed - " + str));
    }

    @Override // com.ironsource.I8.a
    public void onNativeAdLoadSuccess(G8 g10) {
        p.j(g10, "adData");
        this.smashListener.onNativeAdLoaded(new IronSourceNativeAdData(g10), this.binder);
    }

    @Override // com.ironsource.I8.a
    public void onNativeAdShown() {
        this.smashListener.onNativeAdShown();
    }
}
