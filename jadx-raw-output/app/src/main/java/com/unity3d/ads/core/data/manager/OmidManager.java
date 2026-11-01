package com.unity3d.ads.core.data.manager;

import android.content.Context;
import android.webkit.WebView;
import com.iab.omid.library.unity3d.adsession.AdEvents;
import com.iab.omid.library.unity3d.adsession.AdSession;
import com.iab.omid.library.unity3d.adsession.AdSessionConfiguration;
import com.iab.omid.library.unity3d.adsession.AdSessionContext;
import com.iab.omid.library.unity3d.adsession.CreativeType;
import com.iab.omid.library.unity3d.adsession.ImpressionType;
import com.iab.omid.library.unity3d.adsession.Owner;
import com.iab.omid.library.unity3d.adsession.Partner;

/* JADX INFO: compiled from: OmidManager.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface OmidManager {
    void activate(Context context);

    AdEvents createAdEvents(AdSession adSession);

    AdSession createAdSession(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext);

    AdSessionConfiguration createAdSessionConfiguration(CreativeType creativeType, ImpressionType impressionType, Owner owner, Owner owner2, boolean z10);

    AdSessionContext createHtmlAdSessionContext(Partner partner, WebView webView, String str, String str2);

    AdSessionContext createJavaScriptAdSessionContext(Partner partner, WebView webView, String str, String str2);

    String getVersion();

    boolean isActive();
}
