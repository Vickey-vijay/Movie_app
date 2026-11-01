package com.iab.omid.library.appodeal.publisher;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.iab.omid.library.appodeal.adsession.AdSessionContext;
import com.iab.omid.library.appodeal.adsession.VerificationScriptResource;
import com.iab.omid.library.appodeal.internal.g;
import com.iab.omid.library.appodeal.internal.h;
import com.iab.omid.library.appodeal.utils.c;
import com.iab.omid.library.appodeal.utils.f;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class b extends AdSessionStatePublisher {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private WebView f21150g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Long f21151h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map<String, VerificationScriptResource> f21152i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f21153j;

    public class a extends WebViewClient {
        public a() {
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView view, String url) {
            super.onLoadResource(view, url);
            CreativeInfoManager.onResourceLoaded("com.iab.omid.library", view, url);
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);
            CreativeInfoManager.onWebViewPageFinished("com.iab.omid.library", view, url);
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Log.w("NativeBridge", "WebView renderer gone: " + renderProcessGoneDetail.toString() + "for WebView: " + webView);
            if (b.this.getWebView() == webView) {
                Log.w("NativeBridge", "Deallocating the Native bridge as it is unusable. No further events will be generated for this session.");
                b.this.a((WebView) null);
            }
            webView.destroy();
            return true;
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
            return CreativeInfoManager.onWebViewResponseWithHeaders("com.iab.omid.library", view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView view, String url) {
            return CreativeInfoManager.onWebViewResponse("com.iab.omid.library", view, url, super.shouldInterceptRequest(view, url));
        }
    }

    /* JADX INFO: renamed from: com.iab.omid.library.appodeal.publisher.b$b, reason: collision with other inner class name */
    public class RunnableC0211b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WebView f21155a;

        public RunnableC0211b() {
            this.f21155a = b.this.f21150g;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f21155a.destroy();
        }
    }

    public b(String str, Map<String, VerificationScriptResource> map, String str2) {
        super(str);
        this.f21151h = null;
        this.f21152i = map;
        this.f21153j = str2;
    }

    @Override // com.iab.omid.library.appodeal.publisher.AdSessionStatePublisher
    public void a(com.iab.omid.library.appodeal.adsession.a aVar, AdSessionContext adSessionContext) {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String str : injectedResourcesMap.keySet()) {
            c.a(jSONObject, str, injectedResourcesMap.get(str).toJsonObject());
        }
        a(aVar, adSessionContext, jSONObject);
    }

    @Override // com.iab.omid.library.appodeal.publisher.AdSessionStatePublisher
    public void b() {
        super.b();
        new Handler().postDelayed(new RunnableC0211b(), Math.max(4000 - (this.f21151h == null ? 4000L : TimeUnit.MILLISECONDS.convert(f.b() - this.f21151h.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f21150g = null;
    }

    @Override // com.iab.omid.library.appodeal.publisher.AdSessionStatePublisher
    public void i() {
        super.i();
        j();
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public void j() {
        WebView webView = new WebView(g.b().a());
        this.f21150g = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f21150g.getSettings().setAllowContentAccess(false);
        this.f21150g.getSettings().setAllowFileAccess(false);
        this.f21150g.setWebViewClient(new a());
        a(this.f21150g);
        h.a().c(this.f21150g, this.f21153j);
        for (String str : this.f21152i.keySet()) {
            h.a().d(this.f21150g, this.f21152i.get(str).getResourceUrl().toExternalForm(), str);
        }
        this.f21151h = Long.valueOf(f.b());
    }
}
