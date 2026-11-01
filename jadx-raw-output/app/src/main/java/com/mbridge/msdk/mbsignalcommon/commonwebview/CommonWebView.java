package com.mbridge.msdk.mbsignalcommon.commonwebview;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.foundation.webview.ProgressBar;
import com.mbridge.msdk.mbsignalcommon.base.BaseWebView;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.partials.MintegralNetworkBridge;
import com.safedk.android.utils.Logger;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class CommonWebView extends LinearLayout {
    public static int DEFAULT_JUMP_TIMEOUT = 10000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f36025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f36026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ToolBar f36027c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ToolBar f36028d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ProgressBar f36029e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private RelativeLayout f36030f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private View.OnClickListener f36031g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.mbsignalcommon.commonwebview.b f36032h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.mbridge.msdk.mbsignalcommon.commonwebview.a f36033i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public BaseWebView f36034j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private View.OnClickListener f36035k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private View.OnClickListener f36036l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private View.OnClickListener f36037m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private View.OnClickListener f36038n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Handler f36039o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f36040p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private WebViewClient f36041q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f36042r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private i f36043s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f36044t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Runnable f36045u;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            q0.b("CommonWebView", "webview js!！超时上限：" + CommonWebView.this.f36040p + "ms");
            if (CommonWebView.this.f36043s != null) {
                CommonWebView.this.f36044t = false;
                CommonWebView.this.f36043s.a(CommonWebView.this.f36042r);
            }
        }
    }

    public class b extends WebViewClient {
        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView view, String url) {
            super.onLoadResource(view, url);
            CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.g.f44969o, view, url);
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);
            CreativeInfoManager.onWebViewPageFinished(com.safedk.android.utils.g.f44969o, view, url);
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            if (webView != null) {
                try {
                    ViewGroup viewGroup = (ViewGroup) webView.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(webView);
                    }
                    if (webView instanceof WindVaneWebView) {
                        ((WindVaneWebView) webView).release();
                    } else {
                        webView.destroy();
                    }
                } catch (Throwable th2) {
                    q0.b("CommonWebView", th2.getMessage());
                }
            }
            return true;
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
            return CreativeInfoManager.onWebViewResponseWithHeaders(com.safedk.android.utils.g.f44969o, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView view, String url) {
            return CreativeInfoManager.onWebViewResponse(com.safedk.android.utils.g.f44969o, view, url, super.shouldInterceptRequest(view, url));
        }

        public b() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            q0.c("CommonWebView", "newProgress! 开始! = " + str);
            CommonWebView.this.f36029e.setVisible(true);
            CommonWebView.this.f36029e.setProgressState(5);
        }
    }

    public class c extends WebChromeClient {

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                CommonWebView.this.f36029e.setVisible(false);
            }
        }

        public c() {
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i10) {
            q0.c("CommonWebView", "newProgress! = " + i10);
            if (i10 == 100) {
                CommonWebView.this.f36029e.setProgressState(7);
                new Handler().postDelayed(new a(), 200L);
            }
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BaseWebView baseWebView = CommonWebView.this.f36034j;
            if (baseWebView != null) {
                baseWebView.stopLoading();
                String str = (String) view.getTag();
                if (TextUtils.equals(str, ToolBar.BACKWARD)) {
                    CommonWebView.this.f36028d.getItem(ToolBar.FORWARD).setEnabled(true);
                    if (CommonWebView.this.f36034j.canGoBack()) {
                        CommonWebView.this.f36034j.goBack();
                    }
                    CommonWebView.this.f36028d.getItem(ToolBar.BACKWARD).setEnabled(CommonWebView.this.f36034j.canGoBack());
                    if (CommonWebView.this.f36035k != null) {
                        CommonWebView.this.f36035k.onClick(view);
                        return;
                    }
                    return;
                }
                if (TextUtils.equals(str, ToolBar.FORWARD)) {
                    CommonWebView.this.f36028d.getItem(ToolBar.BACKWARD).setEnabled(true);
                    if (CommonWebView.this.f36034j.canGoForward()) {
                        CommonWebView.this.f36034j.goForward();
                    }
                    CommonWebView.this.f36028d.getItem(ToolBar.FORWARD).setEnabled(CommonWebView.this.f36034j.canGoForward());
                    if (CommonWebView.this.f36036l != null) {
                        CommonWebView.this.f36036l.onClick(view);
                        return;
                    }
                    return;
                }
                if (TextUtils.equals(str, ToolBar.REFRESH)) {
                    CommonWebView.this.f36028d.getItem(ToolBar.BACKWARD).setEnabled(CommonWebView.this.f36034j.canGoBack());
                    CommonWebView.this.f36028d.getItem(ToolBar.FORWARD).setEnabled(CommonWebView.this.f36034j.canGoForward());
                    CommonWebView.this.f36034j.reload();
                    if (CommonWebView.this.f36037m != null) {
                        CommonWebView.this.f36037m.onClick(view);
                        return;
                    }
                    return;
                }
                if (TextUtils.equals(str, ToolBar.EXITS)) {
                    if (CommonWebView.this.f36031g != null) {
                        CommonWebView.this.f36031g.onClick(view);
                    }
                } else if (TextUtils.equals(str, ToolBar.OPEN_BY_BROWSER)) {
                    if (CommonWebView.this.f36038n != null) {
                        CommonWebView.this.f36038n.onClick(view);
                    }
                    com.mbridge.msdk.click.c.c(CommonWebView.this.getContext(), CommonWebView.this.f36034j.getUrl());
                }
            }
        }
    }

    public class e extends WebViewClient {
        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView view, String url) {
            super.onLoadResource(view, url);
            CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.g.f44969o, view, url);
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);
            CreativeInfoManager.onWebViewPageFinished(com.safedk.android.utils.g.f44969o, view, url);
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
            Logger.d("Mintegral|SafeDK: Execution> Lcom/mbridge/msdk/mbsignalcommon/commonwebview/CommonWebView$e;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
            boolean zSafedk_CommonWebView$e_shouldOverrideUrlLoading_c8af97742a2adb21698558eb32e0e266 = safedk_CommonWebView$e_shouldOverrideUrlLoading_c8af97742a2adb21698558eb32e0e266(webView, str);
            BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.g.f44969o, webView, str, zSafedk_CommonWebView$e_shouldOverrideUrlLoading_c8af97742a2adb21698558eb32e0e266);
            return zSafedk_CommonWebView$e_shouldOverrideUrlLoading_c8af97742a2adb21698558eb32e0e266;
        }

        public e() {
        }

        public boolean safedk_CommonWebView$e_shouldOverrideUrlLoading_c8af97742a2adb21698558eb32e0e266(WebView p10, String p11) {
            CommonWebView.this.f36028d.getItem(ToolBar.BACKWARD).setEnabled(true);
            CommonWebView.this.f36028d.getItem(ToolBar.FORWARD).setEnabled(false);
            return false;
        }
    }

    public class f extends WebViewClient {
        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView view, String url) {
            super.onLoadResource(view, url);
            CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.g.f44969o, view, url);
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);
            CreativeInfoManager.onWebViewPageFinished(com.safedk.android.utils.g.f44969o, view, url);
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
            Logger.d("Mintegral|SafeDK: Execution> Lcom/mbridge/msdk/mbsignalcommon/commonwebview/CommonWebView$f;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
            boolean zSafedk_CommonWebView$f_shouldOverrideUrlLoading_e22e3dde4870eea386a2fe1c3e296548 = safedk_CommonWebView$f_shouldOverrideUrlLoading_e22e3dde4870eea386a2fe1c3e296548(webView, str);
            BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.g.f44969o, webView, str, zSafedk_CommonWebView$f_shouldOverrideUrlLoading_e22e3dde4870eea386a2fe1c3e296548);
            return zSafedk_CommonWebView$f_shouldOverrideUrlLoading_e22e3dde4870eea386a2fe1c3e296548;
        }

        public f() {
        }

        public boolean safedk_CommonWebView$f_shouldOverrideUrlLoading_e22e3dde4870eea386a2fe1c3e296548(WebView p10, String p11) {
            if (u0.a.b(p11)) {
                u0.a.a(CommonWebView.this.getContext(), p11, null);
            }
            return CommonWebView.this.a(p10, p11);
        }
    }

    public class g extends WebViewClient {
        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView view, String url) {
            super.onLoadResource(view, url);
            CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.g.f44969o, view, url);
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            Logger.d("Mintegral|SafeDK: Execution> Lcom/mbridge/msdk/mbsignalcommon/commonwebview/CommonWebView$g;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V");
            CreativeInfoManager.onWebViewPageFinished(com.safedk.android.utils.g.f44969o, webView, str);
            safedk_CommonWebView$g_onPageFinished_5e1dde7865f8c88d4c576c22f58d79e4(webView, str);
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
            Logger.d("Mintegral|SafeDK: Execution> Lcom/mbridge/msdk/mbsignalcommon/commonwebview/CommonWebView$g;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
            boolean zSafedk_CommonWebView$g_shouldOverrideUrlLoading_9914e364f799338377518c1a04af695c = safedk_CommonWebView$g_shouldOverrideUrlLoading_9914e364f799338377518c1a04af695c(webView, str);
            BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.g.f44969o, webView, str, zSafedk_CommonWebView$g_shouldOverrideUrlLoading_9914e364f799338377518c1a04af695c);
            return zSafedk_CommonWebView$g_shouldOverrideUrlLoading_9914e364f799338377518c1a04af695c;
        }

        public g() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            CommonWebView.this.f36042r = str;
            if (CommonWebView.this.f36044t) {
                return;
            }
            CommonWebView.this.f36044t = true;
            CommonWebView.this.c();
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            CommonWebView.this.f36044t = false;
            CommonWebView.this.a();
        }

        public void safedk_CommonWebView$g_onPageFinished_5e1dde7865f8c88d4c576c22f58d79e4(WebView p10, String p11) {
            CommonWebView.this.f36044t = false;
            CommonWebView.this.a();
        }

        public boolean safedk_CommonWebView$g_shouldOverrideUrlLoading_9914e364f799338377518c1a04af695c(WebView p10, String p11) {
            CommonWebView.this.f36042r = p11;
            if (CommonWebView.this.f36044t) {
                CommonWebView.this.a();
            }
            CommonWebView.this.f36044t = true;
            CommonWebView.this.c();
            return false;
        }
    }

    public interface h {
        void a();
    }

    public interface i {
        void a(String str);
    }

    public CommonWebView(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f36045u = new a();
        init();
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p10, Intent p11) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p11 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p11, com.safedk.android.utils.g.f44969o);
        p10.startActivity(p11);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.f44969o, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    public void init() {
        setOrientation(1);
        setGravity(17);
        this.f36030f = new RelativeLayout(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.weight = 1.0f;
        addView(this.f36030f, layoutParams);
        this.f36025a = v0.a(getContext(), 40.0f);
        this.f36026b = v0.a(getContext(), 40.0f);
        this.f36032h = new com.mbridge.msdk.mbsignalcommon.commonwebview.b();
        this.f36033i = new com.mbridge.msdk.mbsignalcommon.commonwebview.a();
        initWebview();
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public void setToolBarTitle(String str, int i10) {
        this.f36027c.setTitle(str, i10);
    }

    public void useCustomizedToolBar(ArrayList<ToolBar.b> arrayList, boolean z10) {
        a(arrayList, z10);
    }

    private void b() {
        if (this.f36028d != null) {
            return;
        }
        this.f36028d = new ToolBar(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, this.f36026b);
        layoutParams.bottomMargin = 0;
        this.f36028d.setLayoutParams(layoutParams);
        this.f36028d.setBackgroundColor(-1);
        this.f36028d.setOnItemClickListener(new d());
        addWebViewClient(new e());
        addView(this.f36028d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        this.f36039o.postDelayed(this.f36045u, this.f36040p);
    }

    public void addWebChromeClient(WebChromeClient webChromeClient) {
        this.f36033i.a(webChromeClient);
    }

    public void addWebViewClient(WebViewClient webViewClient) {
        this.f36032h.a(webViewClient);
    }

    public View findToolBarButton(String str) {
        ToolBar toolBar;
        ToolBar toolBar2 = this.f36027c;
        View item = toolBar2 != null ? toolBar2.getItem(str) : null;
        return (item != null || (toolBar = this.f36028d) == null) ? item : toolBar.getItem(str);
    }

    public String getUrl() {
        BaseWebView baseWebView = this.f36034j;
        return baseWebView == null ? "" : baseWebView.getUrl();
    }

    public WebView getWebView() {
        return this.f36034j;
    }

    public void hideCustomizedToolBar() {
        ToolBar toolBar = this.f36027c;
        if (toolBar != null) {
            toolBar.setVisibility(8);
        }
    }

    public void hideDefaultToolBar() {
        ToolBar toolBar = this.f36028d;
        if (toolBar != null) {
            toolBar.setVisibility(8);
        }
    }

    public void hideToolBarTitle() {
        this.f36027c.hideTitle();
    }

    public void initWebview() {
        try {
            if (this.f36034j == null) {
                this.f36034j = new BaseWebView(getContext());
            }
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(10);
            this.f36034j.setLayoutParams(layoutParams);
            BaseWebView baseWebView = this.f36034j;
            com.mbridge.msdk.mbsignalcommon.base.b bVar = baseWebView.mWebViewClient;
            baseWebView.setWebViewClient(this.f36032h);
            this.f36034j.setWebChromeClient(this.f36033i);
            addWebViewClient(bVar);
        } catch (Throwable th2) {
            q0.b("CommonWebView", "webview is error", th2);
        }
        this.f36030f.addView(this.f36034j);
    }

    public void loadUrl(String str) {
        MintegralNetworkBridge.webviewLoadUrl(this.f36034j, str);
        if (this.f36041q != null) {
            c();
        }
    }

    public void onBackwardClicked(View.OnClickListener onClickListener) {
        this.f36035k = onClickListener;
    }

    public void onForwardClicked(View.OnClickListener onClickListener) {
        this.f36036l = onClickListener;
    }

    public void onOpenByBrowserClicked(View.OnClickListener onClickListener) {
        this.f36038n = onClickListener;
    }

    public void onRefreshClicked(View.OnClickListener onClickListener) {
        this.f36037m = onClickListener;
    }

    public void removeWebChromeClient(WebChromeClient webChromeClient) {
        this.f36033i.b(webChromeClient);
    }

    public void removeWebViewClient(WebViewClient webViewClient) {
        this.f36032h.b(webViewClient);
    }

    public void setCustomizedToolBarFloating() {
        ((ViewGroup) this.f36027c.getParent()).removeView(this.f36027c);
        this.f36030f.addView(this.f36027c);
    }

    public void setCustomizedToolBarUnfloating() {
        ((ViewGroup) this.f36027c.getParent()).removeView(this.f36027c);
        addView(this.f36027c, 0);
    }

    public void setExitsClickListener(View.OnClickListener onClickListener) {
        this.f36031g = onClickListener;
    }

    public void setPageLoadTimtout(int i10) {
        this.f36040p = i10;
        if (this.f36039o == null) {
            this.f36039o = new Handler(Looper.getMainLooper());
        }
        if (this.f36041q == null) {
            g gVar = new g();
            this.f36041q = gVar;
            addWebViewClient(gVar);
        }
    }

    public void setPageLoadTimtoutListener(i iVar) {
        this.f36043s = iVar;
    }

    public void setToolBarTitle(String str) {
        this.f36027c.setTitle(str);
    }

    public void showCustomizedToolBar() {
        ToolBar toolBar = this.f36027c;
        if (toolBar != null) {
            toolBar.setVisibility(0);
        }
    }

    public void showDefaultToolBar() {
        ToolBar toolBar = this.f36028d;
        if (toolBar != null) {
            toolBar.setVisibility(0);
        }
    }

    public void showToolBarTitle() {
        this.f36027c.showTitle();
    }

    public void useCustomizedToolBar(ArrayList<ToolBar.b> arrayList) {
        a(arrayList, false);
    }

    public void useDeeplink() {
        addWebViewClient(new f());
    }

    public void useProgressBar() {
        ProgressBar progressBar = new ProgressBar(getContext());
        this.f36029e = progressBar;
        progressBar.setLayoutParams(new LinearLayout.LayoutParams(-1, 4));
        addWebViewClient(new b());
        addWebChromeClient(new c());
        addView(this.f36029e);
        this.f36029e.initResource(true);
    }

    public void hideToolBarButton(String str) {
        View viewFindToolBarButton = findToolBarButton(str);
        if (viewFindToolBarButton != null) {
            viewFindToolBarButton.setVisibility(8);
        }
    }

    public void setWebChromeClient(WebChromeClient webChromeClient) {
        addWebChromeClient(webChromeClient);
    }

    public void setWebViewClient(WebViewClient webViewClient) {
        addWebViewClient(webViewClient);
    }

    public void showToolBarButton(String str) {
        View viewFindToolBarButton = findToolBarButton(str);
        if (viewFindToolBarButton != null) {
            viewFindToolBarButton.setVisibility(0);
        }
    }

    public void useDefaultToolBar() {
        b();
    }

    public CommonWebView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36045u = new a();
        init();
    }

    private void a(ArrayList<ToolBar.b> arrayList, boolean z10) {
        if (this.f36027c != null) {
            return;
        }
        ToolBar.a aVar = new ToolBar.a();
        aVar.a(40);
        aVar.b(80);
        ToolBar toolBar = new ToolBar(getContext(), aVar, arrayList);
        this.f36027c = toolBar;
        toolBar.setBackgroundColor(Color.argb(153, 255, 255, 255));
        if (z10) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.f36025a);
            layoutParams.addRule(10);
            this.f36027c.setLayoutParams(layoutParams);
            this.f36030f.addView(this.f36027c);
            return;
        }
        this.f36027c.setLayoutParams(new LinearLayout.LayoutParams(-1, this.f36025a));
        addView(this.f36027c, 0);
    }

    public CommonWebView(Context context) {
        super(context);
        this.f36045u = new a();
        init();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(WebView webView, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            Uri uri = Uri.parse(str);
            if (uri.getScheme().equals("http") || uri.getScheme().equals("https")) {
                return false;
            }
            if (uri.getScheme().equals("intent")) {
                Intent uri2 = Intent.parseUri(str, 1);
                try {
                    String str2 = uri2.getPackage();
                    if (!TextUtils.isEmpty(str2) && getContext().getPackageManager().getLaunchIntentForPackage(str2) != null) {
                        uri2.setComponent(null);
                        uri2.setSelector(null);
                        uri2.setFlags(268435456);
                        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(getContext(), uri2);
                        return true;
                    }
                    try {
                        String stringExtra = uri2.getStringExtra("browser_fallback_url");
                        if (!TextUtils.isEmpty(stringExtra)) {
                            Uri uri3 = Uri.parse(str);
                            if (uri3.getScheme().equals("http") || uri3.getScheme().equals("https")) {
                                MintegralNetworkBridge.webviewLoadUrl(webView, stringExtra);
                                return false;
                            }
                            str = stringExtra;
                        }
                    } catch (Throwable th2) {
                        q0.b("CommonWebView", th2.getMessage());
                    }
                } catch (Throwable th3) {
                    q0.b("CommonWebView", th3.getMessage());
                }
                q0.b("CommonWebView", th.getMessage());
                return false;
            }
            if (com.mbridge.msdk.click.c.d(getContext(), str)) {
                q0.b("CommonWebView", "openDeepLink");
                return true;
            }
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            return !(str.startsWith("http") || str.startsWith("https"));
        } catch (Throwable th4) {
            q0.b("CommonWebView", th4.getMessage());
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        this.f36039o.removeCallbacks(this.f36045u);
    }
}
