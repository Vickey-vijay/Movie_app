package com.mbridge.msdk.click;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.ironsource.G5;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.q0;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.partials.MintegralNetworkBridge;
import com.safedk.android.utils.Logger;
import java.util.HashMap;

/* JADX INFO: compiled from: WebViewSpider.java */
/* JADX INFO: loaded from: classes8.dex */
public class o {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f32857r = "o";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f32858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f32859b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.setting.g f32861d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private f f32862e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f32863f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f32864g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private WebView f32865h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f32866i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f32867j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f32868k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f32870m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f32871n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f32872o;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f32869l = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Runnable f32873p = new d();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Runnable f32874q = new e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Handler f32860c = new Handler(Looper.getMainLooper());

    /* JADX INFO: compiled from: WebViewSpider.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f32875a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f32876b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Context f32877c;

        public a(String str, String str2, Context context) {
            this.f32875a = str;
            this.f32876b = str2;
            this.f32877c = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            o oVar = o.this;
            oVar.a(this.f32875a, this.f32876b, this.f32877c, oVar.f32863f);
        }
    }

    /* JADX INFO: compiled from: WebViewSpider.java */
    public class b extends WebViewClient {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f32879a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f32880b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Context f32881c;

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView view, String url) {
            super.onLoadResource(view, url);
            CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.g.f44969o, view, url);
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            Logger.d("Mintegral|SafeDK: Execution> Lcom/mbridge/msdk/click/o$b;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V");
            CreativeInfoManager.onWebViewPageFinished(com.safedk.android.utils.g.f44969o, webView, str);
            safedk_o$b_onPageFinished_ba2a4c8e168e8a1aae31edc801d13823(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            try {
                synchronized (o.f32857r) {
                    o.this.f32870m = true;
                    o.this.b();
                    o.this.f();
                }
                if (o.this.f32862e != null) {
                    o.this.f32862e.a(-1, webView.getUrl(), "WebView render process crash.", o.this.f32867j);
                }
                if (webView != null) {
                    webView.destroy();
                }
                return true;
            } catch (Throwable th2) {
                q0.b(o.f32857r, th2.getMessage());
                return true;
            }
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
            return CreativeInfoManager.onWebViewResponseWithHeaders(com.safedk.android.utils.g.f44969o, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView view, String url) {
            return CreativeInfoManager.onWebViewResponse(com.safedk.android.utils.g.f44969o, view, url, super.shouldInterceptRequest(view, url));
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Logger.d("Mintegral|SafeDK: Execution> Lcom/mbridge/msdk/click/o$b;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
            boolean zSafedk_o$b_shouldOverrideUrlLoading_888edc82a385a396f150280d164a4fe2 = safedk_o$b_shouldOverrideUrlLoading_888edc82a385a396f150280d164a4fe2(webView, str);
            BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.g.f44969o, webView, str, zSafedk_o$b_shouldOverrideUrlLoading_888edc82a385a396f150280d164a4fe2);
            return zSafedk_o$b_shouldOverrideUrlLoading_888edc82a385a396f150280d164a4fe2;
        }

        public b(String str, String str2, Context context) {
            this.f32879a = str;
            this.f32880b = str2;
            this.f32881c = context;
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            try {
                MintegralNetworkBridge.webviewLoadUrl(webView, "javascript:window.navigator.vibrate([]);");
                if (o.this.f32870m) {
                    o.this.f32868k = 0;
                    o.this.f();
                    return;
                }
                o.this.f32872o = false;
                if (webView.getTag() == null) {
                    webView.setTag("has_first_started");
                } else {
                    o.this.f32871n = true;
                }
                synchronized (o.f32857r) {
                    o.this.f32863f = str;
                    if (o.this.f32862e == null || !o.this.f32862e.a(str)) {
                        o.this.h();
                    } else {
                        o.this.f32870m = true;
                        o.this.f();
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            try {
                if (MBridgeConstans.IS_SP_CBT_CF && sslErrorHandler != null) {
                    sslErrorHandler.cancel();
                }
                if (TextUtils.isEmpty(this.f32879a) || TextUtils.isEmpty(this.f32880b)) {
                    return;
                }
                new com.mbridge.msdk.foundation.same.report.h(this.f32881c).a(this.f32880b, this.f32879a, webView.getUrl());
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            synchronized (o.f32857r) {
                o.this.f32870m = true;
                o.this.b();
                o.this.f();
            }
            if (o.this.f32862e != null) {
                o.this.f32862e.a(i10, webView.getUrl(), str, o.this.f32867j);
            }
        }

        public void safedk_o$b_onPageFinished_ba2a4c8e168e8a1aae31edc801d13823(WebView p10, String p11) {
            super.onPageFinished(p10, p11);
            try {
                MintegralNetworkBridge.webviewLoadUrl(p10, "javascript:window.navigator.vibrate([]);");
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public boolean safedk_o$b_shouldOverrideUrlLoading_888edc82a385a396f150280d164a4fe2(WebView p10, String p11) {
            synchronized (o.f32857r) {
                o oVar = o.this;
                oVar.f32872o = true;
                oVar.c();
                if (!o.this.f32870m) {
                    o.this.f32863f = p11;
                    if (o.this.f32862e != null && o.this.f32862e.c(p11)) {
                        o.this.f32870m = true;
                        o.this.d();
                        o.this.f();
                        return true;
                    }
                    if (!o.this.f32866i) {
                        WebView p12 = o.this.f32865h;
                        MintegralNetworkBridge.webviewLoadUrl(p12, p11);
                    } else {
                        HashMap map = new HashMap();
                        if (o.this.f32865h.getUrl() != null) {
                            map.put("Referer", o.this.f32865h.getUrl());
                        }
                        MintegralNetworkBridge.webviewLoadUrl(o.this.f32865h, p11, map);
                    }
                    return true;
                }
                o.this.d();
                o.this.f();
                return true;
            }
        }
    }

    /* JADX INFO: compiled from: WebViewSpider.java */
    public class c extends WebChromeClient {
        @Override // android.webkit.WebChromeClient
        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            return true;
        }

        public c() {
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i10) {
            if (i10 == 100) {
                try {
                    MintegralNetworkBridge.webviewLoadUrl(webView, "javascript:window.navigator.vibrate([]);");
                    if (!o.this.f32870m) {
                        o oVar = o.this;
                        if (!oVar.f32872o) {
                            oVar.g();
                        }
                    }
                    if (o.this.f32862e != null) {
                        o.this.f32862e.b(webView.getUrl());
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: compiled from: WebViewSpider.java */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            o.this.f32869l = true;
            o.this.f32868k = 1;
            o.this.e();
        }
    }

    /* JADX INFO: compiled from: WebViewSpider.java */
    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            o.this.f32869l = true;
            o.this.f32868k = 2;
            o.this.e();
        }
    }

    /* JADX INFO: compiled from: WebViewSpider.java */
    public interface f {
        void a(int i10, String str, String str2, String str3);

        void a(String str, boolean z10, String str2);

        boolean a(String str);

        boolean b(String str);

        boolean c(String str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        this.f32860c.removeCallbacks(this.f32873p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        this.f32860c.removeCallbacks(this.f32874q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        synchronized (f32857r) {
            try {
                try {
                    b();
                    this.f32865h.destroy();
                    f fVar = this.f32862e;
                    if (fVar != null) {
                        fVar.a(this.f32863f, this.f32869l, this.f32867j);
                    }
                } catch (Throwable th2) {
                    q0.b(f32857r, th2.getMessage());
                }
            } catch (Exception e10) {
                q0.b(f32857r, e10.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        synchronized (f32857r) {
            try {
                b();
                f fVar = this.f32862e;
                if (fVar != null) {
                    fVar.a(this.f32863f, this.f32869l, this.f32867j);
                }
            } catch (Exception e10) {
                q0.b(f32857r, e10.getMessage());
            } catch (Throwable th2) {
                q0.b(f32857r, th2.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        c();
        i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        d();
        j();
    }

    private void i() {
        this.f32860c.postDelayed(this.f32873p, this.f32859b);
    }

    private void j() {
        this.f32860c.postDelayed(this.f32874q, this.f32858a);
    }

    public o() {
        this.f32858a = 15000;
        this.f32859b = 3000;
        com.mbridge.msdk.setting.g gVarD = com.mbridge.msdk.setting.h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
        this.f32861d = gVarD;
        if (gVarD == null) {
            this.f32861d = com.mbridge.msdk.setting.h.b().a();
        }
        this.f32866i = this.f32861d.J0();
        this.f32858a = (int) this.f32861d.p0();
        this.f32859b = (int) this.f32861d.p0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        c();
        d();
    }

    public void a(String str, String str2, Context context, String str3, String str4, f fVar) {
        if (fVar != null) {
            this.f32864g = str4;
            this.f32863f = str3;
            this.f32862e = fVar;
            a(str, str2, context);
            return;
        }
        throw new NullPointerException("OverrideUrlLoadingListener can not be null");
    }

    public void a(String str, String str2, Context context, String str3, f fVar) {
        if (fVar != null) {
            this.f32863f = str3;
            this.f32862e = fVar;
            a(str, str2, context);
            return;
        }
        throw new NullPointerException("OverrideUrlLoadingListener can not be null");
    }

    private void a(String str, String str2, Context context) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            a(str, str2, context, this.f32863f);
        } else {
            this.f32860c.post(new a(str, str2, context));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, Context context, String str3) {
        try {
            a(context, str, str2);
            if (!TextUtils.isEmpty(this.f32864g)) {
                this.f32865h.getSettings().setDefaultTextEncodingName(G5.N);
                this.f32859b = 2000;
                this.f32858a = 2000;
                q0.c(f32857r, this.f32864g);
                MintegralNetworkBridge.webviewLoadDataWithBaseURL(this.f32865h, str3, this.f32864g, "*/*", G5.N, str3);
                return;
            }
            if (this.f32866i) {
                HashMap map = new HashMap();
                if (this.f32865h.getUrl() != null) {
                    map.put("Referer", this.f32865h.getUrl());
                }
                MintegralNetworkBridge.webviewLoadUrl(this.f32865h, str3, map);
                return;
            }
            MintegralNetworkBridge.webviewLoadUrl(this.f32865h, str3);
        } catch (Throwable th2) {
            try {
                f fVar = this.f32862e;
                if (fVar != null) {
                    fVar.a(0, this.f32863f, th2.getMessage(), this.f32867j);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private void a(Context context, String str, String str2) {
        WebView webView = new WebView(context);
        this.f32865h = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f32865h.getSettings().setCacheMode(2);
        this.f32865h.getSettings().setLoadsImagesAutomatically(false);
        this.f32865h.setWebViewClient(new b(str2, str, context));
        this.f32865h.setWebChromeClient(new c());
    }
}
