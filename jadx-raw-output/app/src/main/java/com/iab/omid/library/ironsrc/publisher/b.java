package com.iab.omid.library.ironsrc.publisher;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.iab.omid.library.ironsrc.adsession.AdSessionContext;
import com.iab.omid.library.ironsrc.adsession.VerificationScriptResource;
import com.iab.omid.library.ironsrc.internal.g;
import com.iab.omid.library.ironsrc.internal.h;
import com.iab.omid.library.ironsrc.utils.c;
import com.iab.omid.library.ironsrc.utils.f;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class b extends AdSessionStatePublisher {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private WebView f21812g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Long f21813h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map<String, VerificationScriptResource> f21814i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f21815j;

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

    /* JADX INFO: renamed from: com.iab.omid.library.ironsrc.publisher.b$b, reason: collision with other inner class name */
    public class RunnableC0231b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WebView f21817a;

        public RunnableC0231b() {
            this.f21817a = b.this.f21812g;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f21817a.destroy();
        }
    }

    public b(String str, Map<String, VerificationScriptResource> map, String str2) {
        super(str);
        this.f21813h = null;
        this.f21814i = map;
        this.f21815j = str2;
    }

    @Override // com.iab.omid.library.ironsrc.publisher.AdSessionStatePublisher
    public void a(com.iab.omid.library.ironsrc.adsession.a aVar, AdSessionContext adSessionContext) {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String str : injectedResourcesMap.keySet()) {
            c.a(jSONObject, str, injectedResourcesMap.get(str).toJsonObject());
        }
        a(aVar, adSessionContext, jSONObject);
    }

    @Override // com.iab.omid.library.ironsrc.publisher.AdSessionStatePublisher
    public void b() {
        super.b();
        new Handler().postDelayed(new RunnableC0231b(), Math.max(4000 - (this.f21813h == null ? 4000L : TimeUnit.MILLISECONDS.convert(f.b() - this.f21813h.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f21812g = null;
    }

    @Override // com.iab.omid.library.ironsrc.publisher.AdSessionStatePublisher
    public void i() {
        super.i();
        j();
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public void j() {
        WebView webView = new WebView(g.b().a());
        this.f21812g = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f21812g.getSettings().setAllowContentAccess(false);
        this.f21812g.getSettings().setAllowFileAccess(false);
        this.f21812g.setWebViewClient(new a());
        a(this.f21812g);
        h.a().c(this.f21812g, this.f21815j);
        for (String str : this.f21814i.keySet()) {
            h.a().d(this.f21812g, this.f21814i.get(str).getResourceUrl().toExternalForm(), str);
        }
        this.f21813h = Long.valueOf(f.b());
    }
}
