package com.applovin.impl;

import android.webkit.WebView;
import com.iab.omid.library.applovin.adsession.AdSessionConfiguration;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.CreativeType;
import com.iab.omid.library.applovin.adsession.ImpressionType;
import com.iab.omid.library.applovin.adsession.Owner;

/* JADX INFO: loaded from: classes7.dex */
public class g4 extends f4 {
    @Override // com.applovin.impl.f4
    public AdSessionContext a(WebView webView) {
        try {
            return this.f7474a.getOpenMeasurementVerificationScriptResources().size() > 0 ? AdSessionContext.createNativeAdSessionContext(this.f7475b.e0().b(), this.f7475b.e0().a(), this.f7474a.getOpenMeasurementVerificationScriptResources(), this.f7474a.getOpenMeasurementContentUrl(), this.f7474a.getOpenMeasurementCustomReferenceData()) : AdSessionContext.createHtmlAdSessionContext(this.f7475b.e0().b(), webView, this.f7474a.getOpenMeasurementContentUrl(), this.f7474a.getOpenMeasurementCustomReferenceData());
        } catch (Throwable th2) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f7476c.a(this.f7477d, "Failed to create ad session context", th2);
            }
            return null;
        }
    }

    public g4(com.applovin.impl.sdk.ad.a aVar) {
        super(aVar);
    }

    @Override // com.applovin.impl.f4
    public AdSessionConfiguration a() {
        try {
            return AdSessionConfiguration.createAdSessionConfiguration(CreativeType.HTML_DISPLAY, ImpressionType.LOADED, Owner.NATIVE, Owner.NONE, false);
        } catch (Throwable th2) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f7476c.a(this.f7477d, "Failed to create ad session configuration", th2);
            }
            return null;
        }
    }
}
