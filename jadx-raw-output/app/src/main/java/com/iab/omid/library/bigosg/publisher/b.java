package com.iab.omid.library.bigosg.publisher;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.webkit.WebView;
import com.iab.omid.library.bigosg.adsession.AdSessionContext;
import com.iab.omid.library.bigosg.adsession.VerificationScriptResource;
import com.iab.omid.library.bigosg.b.e;
import com.iab.omid.library.bigosg.d.d;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class b extends AdSessionStatePublisher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WebView f21284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Long f21285b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, VerificationScriptResource> f21286c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f21287d;

    public b(Map<String, VerificationScriptResource> map, String str) {
        this.f21286c = map;
        this.f21287d = str;
    }

    @Override // com.iab.omid.library.bigosg.publisher.AdSessionStatePublisher
    public void a() {
        super.a();
        j();
    }

    @Override // com.iab.omid.library.bigosg.publisher.AdSessionStatePublisher
    public void a(com.iab.omid.library.bigosg.adsession.a aVar, AdSessionContext adSessionContext) {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String str : injectedResourcesMap.keySet()) {
            com.iab.omid.library.bigosg.d.b.a(jSONObject, str, injectedResourcesMap.get(str));
        }
        a(aVar, adSessionContext, jSONObject);
    }

    @Override // com.iab.omid.library.bigosg.publisher.AdSessionStatePublisher
    public void b() {
        super.b();
        new Handler().postDelayed(new Runnable() { // from class: com.iab.omid.library.bigosg.publisher.b.1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private WebView f21289b;

            {
                this.f21289b = b.this.f21284a;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f21289b.destroy();
            }
        }, Math.max(4000 - (this.f21285b == null ? 4000L : TimeUnit.MILLISECONDS.convert(d.a() - this.f21285b.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f21284a = null;
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public void j() {
        WebView webView = new WebView(com.iab.omid.library.bigosg.b.d.a().b());
        this.f21284a = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        a(this.f21284a);
        e.a().a(this.f21284a, this.f21287d);
        for (String str : this.f21286c.keySet()) {
            e.a().a(this.f21284a, this.f21286c.get(str).getResourceUrl().toExternalForm(), str);
        }
        this.f21285b = Long.valueOf(d.a());
    }
}
