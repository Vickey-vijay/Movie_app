package com.unity3d.ads.core.data.manager;

import android.content.Context;
import android.webkit.WebView;
import ck.p;
import com.iab.omid.library.unity3d.Omid;
import com.iab.omid.library.unity3d.adsession.AdEvents;
import com.iab.omid.library.unity3d.adsession.AdSession;
import com.iab.omid.library.unity3d.adsession.AdSessionConfiguration;
import com.iab.omid.library.unity3d.adsession.AdSessionContext;
import com.iab.omid.library.unity3d.adsession.CreativeType;
import com.iab.omid.library.unity3d.adsession.ImpressionType;
import com.iab.omid.library.unity3d.adsession.Owner;
import com.iab.omid.library.unity3d.adsession.Partner;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;

/* JADX INFO: compiled from: AndroidOmidManager.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class AndroidOmidManager implements OmidManager {
    @Override // com.unity3d.ads.core.data.manager.OmidManager
    public void activate(Context context) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        Omid.activate(context);
    }

    @Override // com.unity3d.ads.core.data.manager.OmidManager
    public AdEvents createAdEvents(AdSession adSession) {
        p.j(adSession, "adSession");
        AdEvents adEventsCreateAdEvents = AdEvents.createAdEvents(adSession);
        p.i(adEventsCreateAdEvents, "createAdEvents(adSession)");
        return adEventsCreateAdEvents;
    }

    @Override // com.unity3d.ads.core.data.manager.OmidManager
    public AdSession createAdSession(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        p.j(adSessionConfiguration, "adSessionConfiguration");
        p.j(adSessionContext, GAMConfig.KEY_CONTEXT);
        AdSession adSessionCreateAdSession = AdSession.createAdSession(adSessionConfiguration, adSessionContext);
        p.i(adSessionCreateAdSession, "createAdSession(adSessionConfiguration, context)");
        return adSessionCreateAdSession;
    }

    @Override // com.unity3d.ads.core.data.manager.OmidManager
    public AdSessionConfiguration createAdSessionConfiguration(CreativeType creativeType, ImpressionType impressionType, Owner owner, Owner owner2, boolean z10) {
        p.j(creativeType, "creativeType");
        p.j(impressionType, "impressionType");
        p.j(owner, "owner");
        p.j(owner2, "mediaEventsOwner");
        AdSessionConfiguration adSessionConfigurationCreateAdSessionConfiguration = AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, owner2, z10);
        p.i(adSessionConfigurationCreateAdSessionConfiguration, "createAdSessionConfigura…VerificationScripts\n    )");
        return adSessionConfigurationCreateAdSessionConfiguration;
    }

    @Override // com.unity3d.ads.core.data.manager.OmidManager
    public AdSessionContext createHtmlAdSessionContext(Partner partner, WebView webView, String str, String str2) {
        AdSessionContext adSessionContextCreateHtmlAdSessionContext = AdSessionContext.createHtmlAdSessionContext(partner, webView, str, str2);
        p.i(adSessionContextCreateHtmlAdSessionContext, "createHtmlAdSessionConte…customReferenceData\n    )");
        return adSessionContextCreateHtmlAdSessionContext;
    }

    @Override // com.unity3d.ads.core.data.manager.OmidManager
    public AdSessionContext createJavaScriptAdSessionContext(Partner partner, WebView webView, String str, String str2) {
        AdSessionContext adSessionContextCreateJavascriptAdSessionContext = AdSessionContext.createJavascriptAdSessionContext(partner, webView, str, str2);
        p.i(adSessionContextCreateJavascriptAdSessionContext, "createJavascriptAdSessio…customReferenceData\n    )");
        return adSessionContextCreateJavascriptAdSessionContext;
    }

    @Override // com.unity3d.ads.core.data.manager.OmidManager
    public String getVersion() {
        String version = Omid.getVersion();
        p.i(version, "getVersion()");
        return version;
    }

    @Override // com.unity3d.ads.core.data.manager.OmidManager
    public boolean isActive() {
        return Omid.isActive();
    }
}
