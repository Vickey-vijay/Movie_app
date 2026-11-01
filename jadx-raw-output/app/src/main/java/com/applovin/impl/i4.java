package com.applovin.impl;

import android.webkit.WebView;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.iab.omid.library.applovin.adsession.AdSessionConfiguration;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.CreativeType;
import com.iab.omid.library.applovin.adsession.ImpressionType;
import com.iab.omid.library.applovin.adsession.Owner;

/* JADX INFO: loaded from: classes5.dex */
public class i4 extends f4 {
    @Override // com.applovin.impl.f4
    public AdSessionContext a(WebView webView) {
        try {
            return AdSessionContext.createNativeAdSessionContext(this.f7475b.e0().b(), this.f7475b.e0().a(), this.f7474a.getOpenMeasurementVerificationScriptResources(), this.f7474a.getOpenMeasurementContentUrl(), this.f7474a.getOpenMeasurementCustomReferenceData());
        } catch (Throwable th2) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f7476c.a(this.f7477d, "Failed to create ad session context", th2);
            }
            return null;
        }
    }

    public i4(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        super(appLovinNativeAdImpl);
    }

    @Override // com.applovin.impl.f4
    public AdSessionConfiguration a() {
        try {
            return AdSessionConfiguration.createAdSessionConfiguration(CreativeType.NATIVE_DISPLAY, ImpressionType.BEGIN_TO_RENDER, Owner.NATIVE, Owner.NONE, false);
        } catch (Throwable th2) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f7476c.a(this.f7477d, "Failed to create ad session configuration", th2);
            }
            return null;
        }
    }
}
