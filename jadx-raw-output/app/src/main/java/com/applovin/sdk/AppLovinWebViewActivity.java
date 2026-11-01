package com.applovin.sdk;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.applovin.impl.e8;
import com.applovin.impl.n7;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t4;
import com.applovin.impl.x4;
import com.google.ads.mediation.applovin.AppLovinMediationAdapter;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.partials.AppLovinNetworkBridge;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public class AppLovinWebViewActivity extends Activity {
    public static final String EVENT_DISMISSED_VIA_BACK_BUTTON = "dismissed_via_back_button";
    public static final String INTENT_EXTRA_KEY_IMMERSIVE_MODE_ON = "immersive_mode_on";
    public static final String INTENT_EXTRA_KEY_LOAD_URL = "load_url";
    public static final String INTENT_EXTRA_KEY_SDK_KEY = "sdk_key";
    public static final String URI_PATH_WEBVIEW_EVENT = "webview_event";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f10419a = new AtomicBoolean();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f10420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WebView f10421c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private EventListener f10422d;

    public interface EventListener {
        void onReceivedEvent(String str);
    }

    public class a extends t4 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k f10423a;

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(k kVar) {
            if (!((Boolean) kVar.a(x4.S5)).booleanValue() || !AppLovinWebViewActivity.this.f10419a.compareAndSet(false, true)) {
                AppLovinWebViewActivity.this.finish();
                return;
            }
            AppLovinWebViewActivity.this.a(kVar);
            if (StringUtils.isValidString(AppLovinWebViewActivity.this.f10420b)) {
                AppLovinNetworkBridge.webviewLoadUrl(AppLovinWebViewActivity.this.f10421c, AppLovinWebViewActivity.this.f10420b);
            }
        }

        @Override // com.applovin.impl.t4, android.webkit.WebViewClient
        public void onLoadResource(WebView view, String url) {
            super.onLoadResource(view, url);
            CreativeInfoManager.onResourceLoaded(g.f44955a, view, url);
        }

        @Override // com.applovin.impl.t4, android.webkit.WebViewClient
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);
            CreativeInfoManager.onWebViewPageFinished(g.f44955a, view, url);
        }

        @Override // com.applovin.impl.t4, android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
            return CreativeInfoManager.onWebViewResponseWithHeaders(g.f44955a, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
        }

        @Override // com.applovin.impl.t4, android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView view, String url) {
            return CreativeInfoManager.onWebViewResponse(g.f44955a, view, url, super.shouldInterceptRequest(view, url));
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/sdk/AppLovinWebViewActivity$a;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
            boolean zSafedk_AppLovinWebViewActivity$a_shouldOverrideUrlLoading_3b7a72572afa404b133fbd6043a20e05 = safedk_AppLovinWebViewActivity$a_shouldOverrideUrlLoading_3b7a72572afa404b133fbd6043a20e05(webView, str);
            BrandSafetyUtils.onShouldOverrideUrlLoading(g.f44955a, webView, str, zSafedk_AppLovinWebViewActivity$a_shouldOverrideUrlLoading_3b7a72572afa404b133fbd6043a20e05);
            return zSafedk_AppLovinWebViewActivity$a_shouldOverrideUrlLoading_3b7a72572afa404b133fbd6043a20e05;
        }

        public a(k kVar) {
            this.f10423a = kVar;
        }

        @Override // com.applovin.impl.t4, android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            if (AppLovinWebViewActivity.this.f10421c == webView) {
                AppLovinWebViewActivity.this.f10421c.destroy();
                AppLovinWebViewActivity.this.f10421c = null;
                AppLovinWebViewActivity appLovinWebViewActivity = AppLovinWebViewActivity.this;
                final k kVar = this.f10423a;
                appLovinWebViewActivity.runOnUiThread(new Runnable() { // from class: com.applovin.sdk.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f10425b.a(kVar);
                    }
                });
            }
            return super.onRenderProcessGone(webView, renderProcessGoneDetail);
        }

        public boolean safedk_AppLovinWebViewActivity$a_shouldOverrideUrlLoading_3b7a72572afa404b133fbd6043a20e05(WebView p10, String p11) {
            String str;
            Uri uri = Uri.parse(p11);
            String scheme = uri.getScheme();
            String host = uri.getHost();
            String path = uri.getPath();
            this.f10423a.O();
            if (o.a()) {
                this.f10423a.O().a("AppLovinWebViewActivity", "Handling url load: " + p11);
            }
            if ("applovin".equalsIgnoreCase(scheme) && AppLovinMediationAdapter.APPLOVIN_SDK_ERROR_DOMAIN.equalsIgnoreCase(host) && AppLovinWebViewActivity.this.f10422d != null) {
                if (path.endsWith(AppLovinWebViewActivity.URI_PATH_WEBVIEW_EVENT)) {
                    Set<String> queryParameterNames = uri.getQueryParameterNames();
                    if (queryParameterNames.isEmpty()) {
                        str = "";
                    } else {
                        str = (String) queryParameterNames.toArray()[0];
                    }
                    if (StringUtils.isValidString(str)) {
                        String p12 = uri.getQueryParameter(str);
                        this.f10423a.O();
                        if (o.a()) {
                            this.f10423a.O().a("AppLovinWebViewActivity", "Parsed WebView event parameter name: " + str + " and value: " + p12);
                        }
                        AppLovinWebViewActivity.this.f10422d.onReceivedEvent(p12);
                        return true;
                    }
                    this.f10423a.O();
                    if (o.a()) {
                        this.f10423a.O().b("AppLovinWebViewActivity", "Failed to parse WebView event parameter");
                        return true;
                    }
                    return true;
                }
                return true;
            }
            return super.shouldOverrideUrlLoading(p10, p11);
        }

        @Override // com.applovin.impl.t4
        public Map a() {
            return CollectionUtils.hashMap("name", "AppLovinWebViewActivity");
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.activityOnTouch(g.f44955a, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (TextUtils.isEmpty(getIntent().getStringExtra("sdk_key"))) {
            o.h("AppLovinWebViewActivity", "No SDK key specified");
            finish();
            return;
        }
        k kVarA = AppLovinSdk.getInstance(getApplicationContext()).a();
        e8.a(findViewById(android.R.id.content), kVarA);
        a(kVarA);
        if (getIntent().getBooleanExtra(INTENT_EXTRA_KEY_IMMERSIVE_MODE_ON, false)) {
            getWindow().getDecorView().setSystemUiVisibility(5894);
        }
        String stringExtra = getIntent().getStringExtra(INTENT_EXTRA_KEY_LOAD_URL);
        if (StringUtils.isValidString(stringExtra)) {
            this.f10420b = stringExtra;
        }
        if (StringUtils.isValidString(this.f10420b)) {
            this.f10421c.loadUrl(this.f10420b);
        }
    }

    public void loadUrl(String str, EventListener eventListener) {
        this.f10422d = eventListener;
        this.f10420b = str;
        this.f10419a.set(false);
        WebView webView = this.f10421c;
        if (webView != null) {
            AppLovinNetworkBridge.webviewLoadUrl(webView, str);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        EventListener eventListener = this.f10422d;
        if (eventListener != null) {
            eventListener.onReceivedEvent(EVENT_DISMISSED_VIA_BACK_BUTTON);
        }
        super.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(k kVar) {
        WebView webViewB = n7.b(this, "WebView Activity");
        this.f10421c = webViewB;
        if (webViewB == null) {
            finish();
            return;
        }
        setContentView(webViewB);
        WebSettings settings = this.f10421c.getSettings();
        settings.setSupportMultipleWindows(false);
        settings.setJavaScriptEnabled(true);
        this.f10421c.setVerticalScrollBarEnabled(true);
        this.f10421c.setHorizontalScrollBarEnabled(true);
        this.f10421c.setScrollBarStyle(33554432);
        this.f10421c.setWebViewClient(new a(kVar));
    }
}
