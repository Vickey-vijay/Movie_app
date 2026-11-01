package com.ironsource;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.controller.OpenUrlActivity;
import com.ironsource.sdk.utils.Logger;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.p8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C3647p8 implements K8 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f30427g = "loadWithUrl | webView is not null";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f30428h = "p8";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f30429i = "file://";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f30430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f30431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WebView f30432c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private C3611n8 f30433d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private C3520i8 f30434e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Context f30435f;

    /* JADX INFO: renamed from: com.ironsource.p8$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f30436a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ JSONObject f30437b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f30438c;

        public a(String str, JSONObject jSONObject, String str2) {
            this.f30436a = str;
            this.f30437b = jSONObject;
            this.f30438c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C3647p8.this.f30432c != null) {
                A8.a(C3472fe.f28925q, new C3748v8().a(G5.A, C3647p8.f30427g).a());
            }
            try {
                C3647p8.this.b(this.f30436a);
                IronSourceNetworkBridge.webviewLoadUrl(C3647p8.this.f30432c, C3647p8.this.a(this.f30437b.getString("urlForWebView")));
                JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
                jSONObjectJsonObjectInit.put("adViewId", C3647p8.this.f30430a);
                C3647p8.this.f30433d.a(this.f30438c, jSONObjectJsonObjectInit);
            } catch (Exception e10) {
                C3676r4.d().a(e10);
                C3647p8.this.b(this.f30436a, e10.getMessage());
                A8.a(C3472fe.f28925q, new C3748v8().a(G5.A, e10.getMessage()).a());
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.p8$b */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f30440a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f30441b;

        public b(String str, String str2) {
            this.f30440a = str;
            this.f30441b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                WebView webView = C3647p8.this.f30432c;
                if (webView != null) {
                    webView.destroy();
                }
                JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
                jSONObjectJsonObjectInit.put("adViewId", C3647p8.this.f30430a);
                C3611n8 c3611n8 = C3647p8.this.f30433d;
                if (c3611n8 != null) {
                    c3611n8.a(this.f30440a, jSONObjectJsonObjectInit);
                    C3647p8.this.f30433d.b();
                }
                C3647p8 c3647p8 = C3647p8.this;
                c3647p8.f30433d = null;
                c3647p8.f30435f = null;
            } catch (Exception e10) {
                C3676r4.d().a(e10);
                Log.e(C3647p8.f30428h, "performCleanup | could not destroy ISNAdView webView ID: " + C3647p8.this.f30430a);
                A8.a(C3472fe.f28926r, new C3748v8().a(G5.A, e10.getMessage()).a());
                C3647p8.this.b(this.f30441b, e10.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.p8$c */
    public class c implements K8.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f30443a;

        public c(String str) {
            this.f30443a = str;
        }

        @Override // com.ironsource.K8.a
        public void a(String str) {
            Logger.i(C3647p8.f30428h, "ISNAdViewWebPresenter | WebViewClient | reportOnError: " + str);
            C3647p8.this.b(this.f30443a, str);
        }

        @Override // com.ironsource.K8.a
        public void b(String str) {
            Logger.i(C3647p8.f30428h, "ISNAdViewWebPresenter | WebViewClient | onRenderProcessGone: " + str);
            try {
                ((ViewGroup) C3647p8.this.f30432c.getParent()).removeView(C3647p8.this.f30432c);
            } catch (Exception e10) {
                C3676r4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
            C3647p8.this.d();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.p8$d */
    public class d extends WebChromeClient {
        private d() {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onCreateWindow(WebView webView, boolean z10, boolean z11, Message message) {
            WebView webView2 = new WebView(webView.getContext());
            webView2.setWebChromeClient(C3647p8.this.new d());
            webView2.setWebViewClient(new e());
            ((WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            Logger.i("onCreateWindow", "onCreateWindow");
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void d() {
        a("", "");
    }

    public String a() {
        return this.f30430a;
    }

    public C3611n8 b() {
        return this.f30433d;
    }

    public C3520i8 c() {
        return this.f30434e;
    }

    public void e(String str) {
        this.f30431b = str;
    }

    /* JADX INFO: renamed from: com.ironsource.p8$e */
    public class e extends WebViewClient {
        private e() {
        }

        public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p10, Intent p11) {
            com.safedk.android.utils.Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
            if (p11 == null) {
                return;
            }
            BrandSafetyUtils.detectAdClick(p11, com.safedk.android.utils.g.f44960f);
            p10.startActivity(p11);
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView view, String url) {
            super.onLoadResource(view, url);
            CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.g.f44960f, view, url);
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);
            CreativeInfoManager.onWebViewPageFinished(com.safedk.android.utils.g.f44960f, view, url);
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
            return CreativeInfoManager.onWebViewResponseWithHeaders(com.safedk.android.utils.g.f44960f, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView view, String url) {
            return CreativeInfoManager.onWebViewResponse(com.safedk.android.utils.g.f44960f, view, url, super.shouldInterceptRequest(view, url));
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            com.safedk.android.utils.Logger.d("IronSource|SafeDK: Execution> Lcom/ironsource/p8$e;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
            boolean zSafedk_p8$e_shouldOverrideUrlLoading_f598abfa386a60cef21329269a544b1f = safedk_p8$e_shouldOverrideUrlLoading_f598abfa386a60cef21329269a544b1f(webView, str);
            BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.g.f44960f, webView, str, zSafedk_p8$e_shouldOverrideUrlLoading_f598abfa386a60cef21329269a544b1f);
            return zSafedk_p8$e_shouldOverrideUrlLoading_f598abfa386a60cef21329269a544b1f;
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(26)
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Logger.e(C3647p8.f30428h, "Chromium process crashed - detail.didCrash(): " + renderProcessGoneDetail.didCrash());
            return true;
        }

        public boolean safedk_p8$e_shouldOverrideUrlLoading_f598abfa386a60cef21329269a544b1f(WebView p10, String p11) {
            Context context = p10.getContext();
            Intent intentA = new OpenUrlActivity.e(new com.ironsource.sdk.controller.k.c()).a(p11).b(false).a(context);
            intentA.addFlags(268435456);
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intentA);
            return true;
        }
    }

    private String d(String str) {
        String strSubstring = str.substring(str.indexOf("/") + 1);
        return strSubstring.substring(strSubstring.indexOf("/"));
    }

    @Override // com.ironsource.K8
    public void a(JSONObject jSONObject, String str, String str2) {
        try {
            this.f30433d.e(str);
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            Logger.i(f30428h, "sendHandleGetViewVisibility fail with reason: " + e10.getMessage());
        }
    }

    @Override // com.ironsource.K8
    public void b(JSONObject jSONObject, String str, String str2) {
        V7.f27797a.d(new a(str2, jSONObject, str));
    }

    @Override // com.ironsource.K8
    public void c(JSONObject jSONObject, String str, String str2) throws JSONException {
        try {
            this.f30433d.a(jSONObject.getString("params"), str, str2);
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            Logger.i(f30428h, "sendMessageToAd fail message: " + e10.getMessage());
            throw e10;
        }
    }

    @Override // com.ironsource.K8
    public WebView getPresentingView() {
        return this.f30432c;
    }

    @JavascriptInterface
    public void handleMessageFromAd(String str) {
        this.f30433d.c(str);
    }

    public C3647p8(InterfaceC3573l8 interfaceC3573l8, Context context, String str, C3520i8 c3520i8) {
        this.f30435f = context;
        C3611n8 c3611n8 = new C3611n8();
        this.f30433d = c3611n8;
        c3611n8.g(str);
        this.f30430a = str;
        this.f30433d.a(interfaceC3573l8);
        this.f30434e = c3520i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"AddJavascriptInterface"})
    public void b(String str) {
        Logger.i(f30428h, "ISNAdViewWebPresenter | createWebView");
        WebView webView = new WebView(this.f30435f);
        this.f30432c = webView;
        IronSourceNetworkBridge.onAddedJavascriptInterface(webView, new C3591m8(this), C3537j8.f29251e);
        this.f30432c.setWebViewClient(new C3629o8(new c(str)));
        this.f30432c.setWebChromeClient(new d());
        Og.a(this.f30432c);
        this.f30433d.a(this.f30432c);
    }

    @Override // com.ironsource.K8
    public synchronized void a(String str, String str2) {
        if (this.f30435f == null) {
            return;
        }
        Logger.i(f30428h, "performCleanup");
        V7.f27797a.d(new b(str, str2));
    }

    private boolean c(String str) {
        return str.startsWith(".");
    }

    @Override // com.ironsource.K8
    public void a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            b(str3, C3426d4.c.D);
            return;
        }
        Logger.i(f30428h, "trying to perform WebView Action: " + str);
        try {
            if (str.equals(C3426d4.i.f28567t0)) {
                this.f30432c.onPause();
                this.f30433d.f(str2);
            } else if (str.equals(C3426d4.i.f28569u0)) {
                this.f30432c.onResume();
                this.f30433d.f(str2);
            } else {
                b(str3, C3426d4.c.C);
            }
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            b(str3, C3426d4.c.E);
        }
    }

    public void b(String str, String str2) {
        C3611n8 c3611n8 = this.f30433d;
        if (c3611n8 != null) {
            c3611n8.a(str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str) {
        if (!c(str)) {
            return str;
        }
        return "file://" + this.f30431b + d(str);
    }
}
