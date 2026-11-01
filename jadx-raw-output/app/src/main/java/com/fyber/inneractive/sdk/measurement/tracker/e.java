package com.fyber.inneractive.sdk.measurement.tracker;

import android.webkit.WebView;
import com.fyber.inneractive.sdk.web.m;
import com.iab.omid.library.fyber.adsession.AdEvents;
import com.iab.omid.library.fyber.adsession.AdSession;
import com.iab.omid.library.fyber.adsession.AdSessionConfiguration;
import com.iab.omid.library.fyber.adsession.AdSessionContext;
import com.iab.omid.library.fyber.adsession.Partner;

/* JADX INFO: loaded from: classes11.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AdSession f15831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AdEvents f15832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f15833c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Partner f15834d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public WebView f15835e;

    public abstract void a();

    public abstract AdSessionConfiguration b();

    public abstract void c();

    public void a(m mVar) {
        AdSessionContext adSessionContextCreateHtmlAdSessionContext;
        try {
            AdSessionConfiguration adSessionConfigurationB = b();
            try {
                adSessionContextCreateHtmlAdSessionContext = AdSessionContext.createHtmlAdSessionContext(this.f15834d, mVar, "", "");
            } catch (Throwable unused) {
                adSessionContextCreateHtmlAdSessionContext = null;
            }
            AdSession adSessionCreateAdSession = AdSession.createAdSession(adSessionConfigurationB, adSessionContextCreateHtmlAdSessionContext);
            this.f15831a = adSessionCreateAdSession;
            adSessionCreateAdSession.registerAdView(mVar);
            this.f15831a.start();
        } catch (Throwable unused2) {
        }
    }

    public e(Partner partner, m mVar) {
        this.f15834d = partner;
        this.f15835e = mVar;
    }
}
