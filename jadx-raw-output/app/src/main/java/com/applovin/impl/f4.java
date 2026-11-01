package com.applovin.impl;

import android.view.View;
import android.webkit.WebView;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import com.iab.omid.library.applovin.adsession.AdEvents;
import com.iab.omid.library.applovin.adsession.AdSession;
import com.iab.omid.library.applovin.adsession.AdSessionConfiguration;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.ErrorType;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public abstract class f4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AppLovinAdBase f7474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.applovin.impl.sdk.k f7475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.applovin.impl.sdk.o f7476c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f7477d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f7478e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public AdSession f7479f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public AdEvents f7480g;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(WebView webView) {
        AdSessionContext adSessionContextA;
        if (!this.f7474a.isOpenMeasurementEnabled()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f7476c.d(this.f7477d, "Skip starting session - Open Measurement disabled");
                return;
            }
            return;
        }
        if (this.f7479f != null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f7476c.k(this.f7477d, "Attempting to start session again for ad: " + this.f7474a);
                return;
            }
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f7476c.a(this.f7477d, "Starting session");
        }
        AdSessionConfiguration adSessionConfigurationA = a();
        if (adSessionConfigurationA == null || (adSessionContextA = a(webView)) == null) {
            return;
        }
        try {
            AdSession adSessionCreateAdSession = AdSession.createAdSession(adSessionConfigurationA, adSessionContextA);
            this.f7479f = adSessionCreateAdSession;
            try {
                this.f7480g = AdEvents.createAdEvents(adSessionCreateAdSession);
                a(this.f7479f);
                this.f7479f.start();
                this.f7478e = true;
                if (com.applovin.impl.sdk.o.a()) {
                    this.f7476c.a(this.f7477d, "Session started");
                }
            } catch (Throwable th2) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f7476c.a(this.f7477d, "Failed to create ad events", th2);
                }
            }
        } catch (Throwable th3) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f7476c.a(this.f7477d, "Failed to create session", th3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        this.f7480g.loaded();
    }

    public abstract AdSessionConfiguration a();

    public abstract AdSessionContext a(WebView webView);

    public void a(View view) {
        b(view, Collections.emptyList());
    }

    public void a(AdSession adSession) {
    }

    public void c(final WebView webView) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.na
            @Override // java.lang.Runnable
            public final void run() {
                this.f8546b.b(webView);
            }
        });
    }

    public void e() {
        c(null);
    }

    public void f() {
        b("stop session", new Runnable() { // from class: com.applovin.impl.ma
            @Override // java.lang.Runnable
            public final void run() {
                this.f7989b.b();
            }
        });
    }

    public void g() {
        b("track impression event", new Runnable() { // from class: com.applovin.impl.ja
            @Override // java.lang.Runnable
            public final void run() {
                this.f7771b.c();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view, List list) {
        this.f7479f.registerAdView(view);
        this.f7479f.removeAllFriendlyObstructions();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            h4 h4Var = (h4) it.next();
            if (h4Var.c() != null) {
                try {
                    this.f7479f.addFriendlyObstruction(h4Var.c(), h4Var.b(), h4Var.a());
                } catch (Throwable th2) {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f7476c.a(this.f7477d, "Failed to add friendly obstruction (" + h4Var + ")", th2);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        this.f7480g.impressionOccurred();
    }

    public void h() {
        b("track loaded", new Runnable() { // from class: com.applovin.impl.ka
            @Override // java.lang.Runnable
            public final void run() {
                this.f7821b.d();
            }
        });
    }

    public f4(AppLovinAdBase appLovinAdBase) {
        this.f7474a = appLovinAdBase;
        this.f7475b = appLovinAdBase.getSdk();
        this.f7476c = appLovinAdBase.getSdk().O();
        String str = "AdEventTracker:" + appLovinAdBase.getAdIdNumber();
        if (StringUtils.isValidString(appLovinAdBase.getDspName())) {
            str = str + io.appmetrica.analytics.coreutils.internal.StringUtils.PROCESS_POSTFIX_DELIMITER + appLovinAdBase.getDspName();
        }
        this.f7477d = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str) {
        this.f7479f.error(ErrorType.VIDEO, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, Runnable runnable) {
        try {
            if (this.f7478e) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f7476c.a(this.f7477d, "Running operation: " + str);
                }
                runnable.run();
            }
        } catch (Throwable th2) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f7476c.a(this.f7477d, "Failed to run operation: " + str, th2);
            }
        }
    }

    public void b(final View view, final List list) {
        b("update main view: " + view, new Runnable() { // from class: com.applovin.impl.la
            @Override // java.lang.Runnable
            public final void run() {
                this.f7914b.a(view, list);
            }
        });
    }

    public void b(final String str) {
        b("track error", new Runnable() { // from class: com.applovin.impl.ia
            @Override // java.lang.Runnable
            public final void run() {
                this.f7731b.a(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        this.f7478e = false;
        this.f7479f.finish();
        this.f7479f = null;
        this.f7480g = null;
    }

    public void b(final String str, final Runnable runnable) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.ha
            @Override // java.lang.Runnable
            public final void run() {
                this.f7637b.a(str, runnable);
            }
        });
    }
}
