package com.applovin.impl.adview;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.applovin.impl.f2;
import com.applovin.impl.j0;
import com.applovin.impl.n7;
import com.applovin.impl.o0;
import com.applovin.impl.o7;
import com.applovin.impl.o8;
import com.applovin.impl.r7;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t4;
import com.applovin.impl.w7;
import com.applovin.impl.x4;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.partials.AppLovinNetworkBridge;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes5.dex */
public class b extends j0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Set f6930j = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Object f6931k = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f6932c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f6933d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.applovin.impl.sdk.ad.b f6934e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f6935f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f6936g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f6937h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Object f6938i;

    public class a extends t4 {
        @Override // com.applovin.impl.t4, android.webkit.WebViewClient
        public void onLoadResource(WebView view, String url) {
            super.onLoadResource(view, url);
            CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.g.f44955a, view, url);
        }

        @Override // com.applovin.impl.t4, android.webkit.WebViewClient
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);
            CreativeInfoManager.onWebViewPageFinished(com.safedk.android.utils.g.f44955a, view, url);
        }

        @Override // com.applovin.impl.t4, android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
            return CreativeInfoManager.onWebViewResponseWithHeaders(com.safedk.android.utils.g.f44955a, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
        }

        @Override // com.applovin.impl.t4, android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView view, String url) {
            return CreativeInfoManager.onWebViewResponse(com.safedk.android.utils.g.f44955a, view, url, super.shouldInterceptRequest(view, url));
        }

        public a() {
        }

        @Override // com.applovin.impl.t4
        public Map a() {
            return CollectionUtils.hashMap("name", "AdWebView");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean a(View view, MotionEvent motionEvent) {
        if (view.hasFocus()) {
            return false;
        }
        view.requestFocus();
        return false;
    }

    private void b() {
        synchronized (this.f6938i) {
            Iterator it = this.f6937h.iterator();
            while (it.hasNext()) {
                o8.a(this, (String) it.next(), "AdWebView", this.f6933d);
            }
            this.f6937h.clear();
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public void computeScroll() {
    }

    @Override // android.webkit.WebView
    public void destroy() {
        this.f6935f = true;
        this.f6936g = false;
        super.destroy();
    }

    @Override // com.applovin.impl.j0, com.applovin.impl.adview.AppLovinWebViewBase, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.f44955a, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // com.applovin.impl.j0, com.applovin.impl.adview.AppLovinWebViewBase, android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public void onScrollChanged(int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.View
    public void scrollTo(int i10, int i11) {
    }

    public com.applovin.impl.sdk.ad.b getCurrentAd() {
        return this.f6934e;
    }

    public void setAdHtmlLoaded(boolean z10) {
        this.f6936g = z10;
        if (z10 && ((Boolean) this.f6933d.a(x4.f10084y6)).booleanValue()) {
            b();
        }
    }

    public b(c cVar, com.applovin.impl.sdk.k kVar, Context context) {
        WebViewClient aVar;
        com.applovin.impl.adview.a aVarD;
        super(context);
        this.f6937h = new ArrayList();
        this.f6938i = new Object();
        if (kVar != null) {
            this.f6933d = kVar;
            this.f6932c = kVar.O();
            Integer num = (Integer) kVar.a(x4.G6);
            if (num.intValue() > 0) {
                synchronized (f6931k) {
                    Set set = f6930j;
                    set.add(this);
                    n7.a("AdWebView", set.size(), num.intValue(), kVar.D());
                }
            }
            setBackgroundColor(0);
            WebSettings settings = getSettings();
            settings.setSupportMultipleWindows(false);
            settings.setJavaScriptEnabled(true);
            if (cVar != null) {
                aVar = cVar;
            } else {
                aVar = new a();
            }
            setWebViewClient(aVar);
            if (cVar != null) {
                aVarD = cVar.d();
            } else {
                aVarD = null;
            }
            setWebChromeClient(new com.applovin.impl.t(aVarD, kVar));
            setVerticalScrollBarEnabled(false);
            setHorizontalScrollBarEnabled(false);
            setScrollBarStyle(33554432);
            if (o0.i() && ((Boolean) kVar.a(x4.Z5)).booleanValue()) {
                setWebViewRenderProcessClient(new d(kVar).a());
            }
            setOnTouchListener(new View.OnTouchListener() { // from class: com.applovin.impl.adview.b0
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return b.a(view, motionEvent);
                }
            });
            setOnLongClickListener(new View.OnLongClickListener() { // from class: com.applovin.impl.adview.c0
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    return this.f6943b.a(view);
                }
            });
            return;
        }
        throw new IllegalArgumentException("No sdk specified.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean a(View view) {
        if (!com.applovin.impl.sdk.o.a()) {
            return true;
        }
        this.f6932c.a("AdWebView", "Received a LongClick event.");
        return true;
    }

    public void a(com.applovin.impl.sdk.ad.b bVar) {
        if (!this.f6935f) {
            this.f6934e = bVar;
            try {
                applySettings(bVar);
                if (n7.a(bVar.getSize())) {
                    setVisibility(0);
                }
                bVar.a(SystemClock.elapsedRealtime());
                if (bVar instanceof com.applovin.impl.sdk.ad.a) {
                    AppLovinNetworkBridge.webviewLoadDataWithBaseURL(this, bVar.k(), ((com.applovin.impl.sdk.ad.a) bVar).g1(), "text/html", null, "");
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f6932c.a("AdWebView", "AppLovinAd rendered");
                        return;
                    }
                    return;
                }
                if (bVar instanceof o7) {
                    o7 o7Var = (o7) bVar;
                    r7 r7VarG1 = o7Var.g1();
                    if (r7VarG1 != null) {
                        w7 w7VarE = r7VarG1.e();
                        Uri uriC = w7VarE.c();
                        String string = uriC != null ? uriC.toString() : "";
                        String strB = w7VarE.b();
                        String strI1 = o7Var.i1();
                        if (!StringUtils.isValidString(string) && !StringUtils.isValidString(strB)) {
                            if (com.applovin.impl.sdk.o.a()) {
                                this.f6932c.b("AdWebView", "Unable to load companion ad. No resources provided.");
                                return;
                            }
                            return;
                        }
                        if (w7VarE.d() == w7.a.STATIC) {
                            if (com.applovin.impl.sdk.o.a()) {
                                this.f6932c.a("AdWebView", "Rendering WebView for static VAST ad");
                            }
                            String strA = a((String) this.f6933d.a(x4.N4), string);
                            if (o7Var.x1() && o7Var.isOpenMeasurementEnabled() && o7Var.y1()) {
                                strA = this.f6933d.e0().a(strA, f2.a((AppLovinAdImpl) bVar));
                            }
                            AppLovinNetworkBridge.webviewLoadDataWithBaseURL(this, bVar.k(), strA, "text/html", null, "");
                            return;
                        }
                        if (w7VarE.d() == w7.a.HTML) {
                            if (StringUtils.isValidString(strB)) {
                                String strA2 = a(strI1, strB);
                                String str = StringUtils.isValidString(strA2) ? strA2 : strB;
                                if (com.applovin.impl.sdk.o.a()) {
                                    this.f6932c.a("AdWebView", "Rendering WebView for HTML VAST ad with resourceContents: " + str);
                                }
                                AppLovinNetworkBridge.webviewLoadDataWithBaseURL(this, bVar.k(), str, "text/html", null, "");
                                return;
                            }
                            if (StringUtils.isValidString(string)) {
                                if (com.applovin.impl.sdk.o.a()) {
                                    this.f6932c.a("AdWebView", "Preparing to load HTML VAST ad resourceUri");
                                }
                                a(string, bVar.k(), strI1, this.f6933d, o7Var);
                                return;
                            }
                            return;
                        }
                        if (w7VarE.d() == w7.a.IFRAME) {
                            if (StringUtils.isValidString(string)) {
                                if (com.applovin.impl.sdk.o.a()) {
                                    this.f6932c.a("AdWebView", "Preparing to load iFrame VAST ad resourceUri");
                                }
                                a(string, bVar.k(), strI1, this.f6933d, o7Var);
                                return;
                            } else {
                                if (StringUtils.isValidString(strB)) {
                                    String strA3 = a(strI1, strB);
                                    String str2 = StringUtils.isValidString(strA3) ? strA3 : strB;
                                    if (com.applovin.impl.sdk.o.a()) {
                                        this.f6932c.a("AdWebView", "Rendering WebView for iFrame VAST ad with resourceContents: " + str2);
                                    }
                                    AppLovinNetworkBridge.webviewLoadDataWithBaseURL(this, bVar.k(), str2, "text/html", null, "");
                                    return;
                                }
                                return;
                            }
                        }
                        if (com.applovin.impl.sdk.o.a()) {
                            this.f6932c.b("AdWebView", "Failed to render VAST companion ad of invalid type");
                            return;
                        }
                        return;
                    }
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f6932c.a("AdWebView", "No companion ad provided.");
                        return;
                    }
                    return;
                }
                return;
            } catch (Throwable th2) {
                throw new RuntimeException("Unable to render AppLovin ad (" + (bVar != null ? String.valueOf(bVar.getAdIdNumber()) : "null") + ") - " + th2);
            }
        }
        com.applovin.impl.sdk.o.h("AdWebView", "Ad can not be loaded in a destroyed webview");
    }

    public void a(String str) {
        if (((Boolean) this.f6933d.a(x4.f10084y6)).booleanValue()) {
            if (this.f6936g) {
                o8.a(this, str, "AdWebView", this.f6933d);
                return;
            }
            synchronized (this.f6937h) {
                this.f6937h.add(str);
            }
            return;
        }
        o8.a(this, str, "AdWebView", this.f6933d);
    }

    private void a(String str, String str2, String str3, com.applovin.impl.sdk.k kVar, o7 o7Var) {
        String strA = a(str3, str);
        if (StringUtils.isValidString(strA)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f6932c.a("AdWebView", "Rendering webview for VAST ad with resourceContents : " + strA);
            }
            AppLovinNetworkBridge.webviewLoadDataWithBaseURL(this, str2, strA, "text/html", null, "");
            return;
        }
        String strA2 = a((String) kVar.a(x4.O4), str);
        if (StringUtils.isValidString(strA2)) {
            if (o7Var.x1() && o7Var.isOpenMeasurementEnabled()) {
                strA2 = kVar.e0().a(strA2, f2.a((AppLovinAdImpl) o7Var));
            }
            String str4 = strA2;
            if (com.applovin.impl.sdk.o.a()) {
                this.f6932c.a("AdWebView", "Rendering webview for VAST ad with resourceContents : " + str4);
            }
            AppLovinNetworkBridge.webviewLoadDataWithBaseURL(this, str2, str4, "text/html", null, "");
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f6932c.a("AdWebView", "Rendering webview for VAST ad with resourceURL : " + str);
        }
        AppLovinNetworkBridge.webviewLoadUrl(this, str);
    }

    private String a(String str, String str2) {
        if (StringUtils.isValidString(str)) {
            return str.replace("{SOURCE}", str2);
        }
        return null;
    }
}
