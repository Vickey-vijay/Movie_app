package com.bytedance.sdk.component.bly;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.DownloadListener;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import com.bytedance.sdk.component.utils.ex;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.od;
import com.ironsource.C3426d4;
import com.ironsource.Q6;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.b;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import com.vungle.ads.internal.model.AdPayload;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class le extends FrameLayout {
    private static yu jvy;
    public int bly;
    private AttributeSet bs;

    /* JADX INFO: renamed from: cd, reason: collision with root package name */
    private float f11628cd;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private String f11629cf;
    private boolean ex;
    private AtomicBoolean ey;
    private Context fak;
    public boolean fkw;
    private long fqk;
    private ex fvf;
    private long hun;
    private float jae;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    private float f11630jg;
    private com.bytedance.sdk.component.bly.yu jqy;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    private float f11631ko;
    private lh ksc;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public boolean f11632le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public boolean f11633lh;
    private boolean mwh;

    /* JADX INFO: renamed from: od, reason: collision with root package name */
    private float f11634od;
    private AtomicBoolean osn;
    public volatile WebView ouw;

    /* JADX INFO: renamed from: pd, reason: collision with root package name */
    private vt f11635pd;
    public int pno;
    private com.bytedance.sdk.component.bly.ouw.InterfaceC0087ouw qbp;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public int f11636ra;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    private long f11637rn;
    private fkw rrs;
    private JSONObject ryl;

    /* JADX INFO: renamed from: tc, reason: collision with root package name */
    private WebViewClient f11638tc;

    /* JADX INFO: renamed from: th, reason: collision with root package name */
    private boolean f11639th;
    private com.bytedance.sdk.component.bly.vt.ouw tlj;
    private AtomicBoolean uoy;
    private int uq;

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    private long f11640vm;
    private List<String> vpp;
    public View vt;
    public boolean yu;
    private long zih;
    private com.bytedance.sdk.component.bly.ouw zin;

    public interface fkw {
    }

    public static class ouw extends WebViewClient {
        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView view, String url) {
            super.onLoadResource(view, url);
            CreativeInfoManager.onResourceLoaded(g.f44975u, view, url);
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);
            CreativeInfoManager.onWebViewPageFinished(g.f44975u, view, url);
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
            return CreativeInfoManager.onWebViewResponseWithHeaders(g.f44975u, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView view, String url) {
            return CreativeInfoManager.onWebViewResponse(g.f44975u, view, url, super.shouldInterceptRequest(view, url));
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(final WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            if (Build.VERSION.SDK_INT < 26) {
                return super.onRenderProcessGone(webView, renderProcessGoneDetail);
            }
            if (webView == null) {
                return true;
            }
            webView.post(new Runnable() { // from class: com.bytedance.sdk.component.bly.le.ouw.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        ViewGroup viewGroup = (ViewGroup) webView.getParent();
                        if (viewGroup != null) {
                            viewGroup.removeView(webView);
                        }
                        webView.destroy();
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                }
            });
            return true;
        }
    }

    public interface vt {
    }

    public interface yu {
        WebView ouw(Context context, AttributeSet attributeSet, lh lhVar);
    }

    public le(Context context, lh lhVar) {
        this(ouw(context), false, lhVar);
    }

    private static void lh(Context context) {
    }

    private static Context ouw(Context context) {
        return context;
    }

    private void vt(Context context) {
        lh(context);
        mwh();
        ryl();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/component/bly/le;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z");
        DetectTouchUtils.viewOnTouch(g.f44975u, this, motionEvent);
        return safedk_le_dispatchTouchEvent_8b707b71cab64fb370cc2cd79fb2a819(motionEvent);
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    public final boolean lh() {
        if (this.ouw == null) {
            return false;
        }
        try {
            return this.ouw.canGoBack();
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void ouw(int i10, int i11, List<Integer> list, int i12, List<String> list2) {
        if (this.ouw == null || !(this.ouw instanceof com.bytedance.sdk.component.bly.fkw)) {
            return;
        }
        this.zin = new com.bytedance.sdk.component.bly.ouw(this.fak, i10, i11, list, i12);
        this.vpp = list2;
        if (!TextUtils.isEmpty(this.f11629cf)) {
            this.zin.vt = this.f11629cf;
        }
        ((com.bytedance.sdk.component.bly.fkw) this.ouw).setTouchListenerProxy(this.zin);
        this.qbp = this.zin.ouw;
    }

    public void setJavaScriptEnabled(boolean z10) {
        try {
            this.ouw.getSettings().setJavaScriptEnabled(z10);
        } catch (Throwable unused) {
        }
    }

    public enum lh {
        ADS(b.JSON_KEY_ADS),
        ADS_V3("ads_v3"),
        ENDCARD(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD),
        USER_AGENT(Q6.f27422d0),
        PLAYABLE("playable"),
        DSP("dsp"),
        PRIVACY("privacy"),
        VAST_ENDCARD("vast_endcard"),
        EASY_PLAYABLE("easy_playable"),
        LANDING_PAGE("landing_page"),
        LANDING_PAGE_LOADING("lp_loading"),
        LANDING_PAGE_PRE_RENDER("lp_pre_render");

        public final String mwh;

        lh(String str) {
            this.mwh = str;
        }
    }

    public le(Context context, boolean z10, lh lhVar) {
        super(ouw(context));
        this.f11630jg = 0.0f;
        this.f11631ko = 0.0f;
        this.f11637rn = 0L;
        this.zih = 0L;
        this.f11640vm = 0L;
        this.f11639th = false;
        this.jae = 20.0f;
        this.f11628cd = 50.0f;
        this.uoy = new AtomicBoolean();
        this.osn = new AtomicBoolean();
        this.ey = new AtomicBoolean();
        this.fak = context;
        this.ksc = lhVar;
        if (z10) {
            return;
        }
        try {
            this.ouw = ouw((AttributeSet) null);
            cf();
        } catch (Throwable unused) {
        }
        vt(ouw(context));
    }

    private void cf() {
        if (this.ouw != null) {
            removeAllViews();
            setBackground(null);
            try {
                this.ouw.setId(520093704);
            } catch (Throwable unused) {
            }
            addView(this.ouw, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    private void mwh() {
        try {
            WebSettings settings = this.ouw.getSettings();
            if (settings != null) {
                settings.setSavePassword(false);
            }
        } catch (Throwable unused) {
        }
    }

    private void ryl() {
        if (this.ouw == null) {
            return;
        }
        try {
            this.ouw.removeJavascriptInterface("searchBoxJavaBridge_");
            this.ouw.removeJavascriptInterface("accessibility");
            this.ouw.removeJavascriptInterface("accessibilityTraversal");
        } catch (Throwable unused) {
        }
    }

    public static void setDataDirectorySuffix(String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            WebView.setDataDirectorySuffix(str);
        }
    }

    private void setJavaScriptEnabled(String str) {
        WebSettings settings;
        try {
            if (TextUtils.isEmpty(str) || (settings = this.ouw.getSettings()) == null) {
                return;
            }
            if (Uri.parse(str).getScheme().equalsIgnoreCase(C3426d4.i.f28530b)) {
                settings.setJavaScriptEnabled(false);
            } else {
                settings.setJavaScriptEnabled(true);
            }
        } catch (Throwable unused) {
        }
    }

    public static void setWebViewProvider(yu yuVar) {
        jvy = yuVar;
    }

    public final void b_(String str) {
        try {
            this.ouw.removeJavascriptInterface(str);
        } catch (Throwable unused) {
        }
    }

    public void bly() {
        if (this.ouw == null) {
            return;
        }
        lh lhVar = this.ksc;
        if (lhVar != lh.ADS && lhVar != lh.ADS_V3) {
            od.ouw(this);
        } else {
            try {
                this.ouw.destroy();
            } catch (Throwable unused) {
            }
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.ouw == null) {
            return;
        }
        try {
            this.ouw.computeScroll();
        } catch (Throwable unused) {
        }
    }

    public final boolean fkw() {
        if (this.ouw == null) {
            return false;
        }
        try {
            return this.ouw.canGoForward();
        } catch (Throwable unused) {
            return false;
        }
    }

    public View getArbitrageLoadingView() {
        return this.vt;
    }

    public int getContentHeight() {
        if (this.ouw == null) {
            return 0;
        }
        try {
            return this.ouw.getContentHeight();
        } catch (Throwable unused) {
            return 1;
        }
    }

    public long getLandingPageClickBegin() {
        return this.fqk;
    }

    public long getLandingPageClickEnd() {
        return this.hun;
    }

    public com.bytedance.sdk.component.bly.vt.ouw getMaterialMeta() {
        return this.tlj;
    }

    public String getOriginalUrl() {
        String url;
        if (this.ouw == null) {
            return null;
        }
        try {
            String originalUrl = this.ouw.getOriginalUrl();
            return (originalUrl == null || !originalUrl.startsWith("data:text/html") || (url = this.ouw.getUrl()) == null || !url.startsWith(AdPayload.FILE_SCHEME)) ? originalUrl : url;
        } catch (Throwable unused) {
            return null;
        }
    }

    public int getProgress() {
        if (this.ouw == null) {
            return 0;
        }
        try {
            return this.ouw.getProgress();
        } catch (Throwable unused) {
            return 100;
        }
    }

    public lh getScene() {
        return this.ksc;
    }

    @Override // android.view.View
    public String getTag() {
        return this.f11629cf;
    }

    public String getUrl() {
        if (this.ouw == null) {
            return null;
        }
        try {
            return this.ouw.getUrl();
        } catch (Throwable unused) {
            return null;
        }
    }

    public String getUserAgentString() {
        if (this.ouw == null) {
            return "";
        }
        try {
            return this.ouw.getSettings().getUserAgentString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public WebView getWebView() {
        return this.ouw;
    }

    public WebViewClient getWebViewClient() {
        return this.f11638tc;
    }

    public final void le() {
        if (this.ouw != null) {
            this.ouw.onResume();
        }
    }

    public final void o_() {
        try {
            if (this.ouw == null) {
                this.ouw = ouw(this.bs);
            }
            cf();
            vt(ouw(this.fak));
        } catch (Throwable th2) {
            ko.fkw("SSWebView.TAG", "initWebview: " + th2.getMessage());
        }
    }

    @Override // android.view.ViewGroup
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ViewParent viewParentOuw;
        try {
            if (this.mwh && this.tlj != null && ((this.f11629cf != null || this.ryl != null) && motionEvent != null)) {
                try {
                    int action = motionEvent.getAction();
                    if (action == 0) {
                        this.f11630jg = motionEvent.getRawX();
                        this.f11631ko = motionEvent.getRawY();
                        this.f11637rn = System.currentTimeMillis();
                        this.ryl = new JSONObject();
                        if (this.ouw != null) {
                            this.fqk = this.f11637rn;
                        }
                    } else if (action == 1 || action == 3) {
                        this.ryl.put("start_x", String.valueOf(this.f11630jg));
                        this.ryl.put("start_y", String.valueOf(this.f11631ko));
                        this.ryl.put("offset_x", String.valueOf(motionEvent.getRawX() - this.f11630jg));
                        this.ryl.put("offset_y", String.valueOf(motionEvent.getRawY() - this.f11631ko));
                        this.ryl.put("url", String.valueOf(getUrl()));
                        this.ryl.put("tag", "");
                        this.zih = System.currentTimeMillis();
                        if (this.ouw != null) {
                            this.hun = this.zih;
                        }
                        this.ryl.put("down_time", this.f11637rn);
                        this.ryl.put("up_time", this.zih);
                        if (com.bytedance.sdk.component.bly.ouw.ouw.ouw().ouw != null) {
                            long j10 = this.f11640vm;
                            long j11 = this.f11637rn;
                            if (j10 != j11) {
                                this.f11640vm = j11;
                                com.bytedance.sdk.component.bly.ouw.ouw.ouw().ouw.ouw(this.tlj, this.f11629cf, "in_web_click", this.ryl, this.zih - this.f11637rn);
                            }
                        }
                    }
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
            }
            boolean zOnInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
            if ((motionEvent.getActionMasked() == 2 || motionEvent.getActionMasked() == 0) && this.f11639th && (viewParentOuw = ouw(this)) != null) {
                viewParentOuw.requestDisallowInterceptTouchEvent(true);
            }
            return zOnInterceptTouchEvent;
        } catch (Throwable unused) {
            return super.onInterceptTouchEvent(motionEvent);
        }
    }

    public final void pno() {
        if (this.ouw == null) {
            return;
        }
        try {
            this.ouw.onPause();
        } catch (Throwable unused) {
        }
    }

    public final void ra() {
        try {
            this.ouw.clearHistory();
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.ViewGroup
    public void removeAllViews() {
        try {
            this.ouw.removeAllViews();
        } catch (Throwable unused) {
        }
    }

    public void setAllowFileAccess(boolean z10) {
        try {
            this.ouw.getSettings().setAllowFileAccess(z10);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        try {
            this.ouw.setBackgroundColor(i10);
        } catch (Throwable unused) {
        }
    }

    public void setBuiltInZoomControls(boolean z10) {
        try {
            this.ouw.getSettings().setBuiltInZoomControls(z10);
        } catch (Throwable unused) {
        }
    }

    public void setCacheMode(int i10) {
        try {
            this.ouw.getSettings().setCacheMode(i10);
        } catch (Throwable unused) {
        }
    }

    public void setCalculationMethod(int i10) {
        this.uq = i10;
    }

    public void setDatabaseEnabled(boolean z10) {
        try {
            this.ouw.getSettings().setDatabaseEnabled(z10);
        } catch (Throwable unused) {
        }
    }

    public void setDeepShakeValue(float f10) {
        this.f11634od = f10;
    }

    public void setDefaultFontSize(int i10) {
        try {
            this.ouw.getSettings().setDefaultFontSize(i10);
        } catch (Throwable unused) {
        }
    }

    public void setDefaultTextEncodingName(String str) {
        try {
            this.ouw.getSettings().setDefaultTextEncodingName(str);
        } catch (Throwable unused) {
        }
    }

    public void setDisplayZoomControls(boolean z10) {
        try {
            this.ouw.getSettings().setDisplayZoomControls(z10);
        } catch (Throwable unused) {
        }
    }

    public void setDomStorageEnabled(boolean z10) {
        try {
            this.ouw.getSettings().setDomStorageEnabled(z10);
        } catch (Throwable unused) {
        }
    }

    public void setDownloadListener(DownloadListener downloadListener) {
        try {
            this.ouw.setDownloadListener(downloadListener);
        } catch (Throwable unused) {
        }
    }

    public void setIsPreventTouchEvent(boolean z10) {
        this.f11639th = z10;
    }

    public void setJavaScriptCanOpenWindowsAutomatically(boolean z10) {
        try {
            this.ouw.getSettings().setJavaScriptCanOpenWindowsAutomatically(z10);
        } catch (Throwable unused) {
        }
    }

    public void setLandingPage(boolean z10) {
        this.mwh = z10;
    }

    public void setLandingPageClickBegin(long j10) {
        this.fqk = j10;
    }

    public void setLandingPageClickEnd(long j10) {
        this.hun = j10;
    }

    @Override // android.view.View
    public void setLayerType(int i10, Paint paint) {
        try {
            this.ouw.setLayerType(i10, paint);
        } catch (Throwable unused) {
        }
    }

    public void setLayoutAlgorithm(WebSettings.LayoutAlgorithm layoutAlgorithm) {
        try {
            this.ouw.getSettings().setLayoutAlgorithm(layoutAlgorithm);
        } catch (Throwable unused) {
        }
    }

    public void setLoadWithOverviewMode(boolean z10) {
        try {
            this.ouw.getSettings().setLoadWithOverviewMode(z10);
        } catch (Throwable unused) {
        }
    }

    public void setLpPreRender(boolean z10) {
        this.f11633lh = z10;
    }

    public void setMaterialMeta(com.bytedance.sdk.component.bly.vt.ouw ouwVar) {
        this.tlj = ouwVar;
    }

    public void setMixedContentMode(int i10) {
        try {
            this.ouw.getSettings().setMixedContentMode(i10);
        } catch (Throwable unused) {
        }
    }

    public void setNetworkAvailable(boolean z10) {
        try {
            this.ouw.setNetworkAvailable(z10);
        } catch (Throwable unused) {
        }
    }

    public void setOnShakeListener(vt vtVar) {
        this.f11635pd = vtVar;
    }

    @Override // android.view.View
    public void setOverScrollMode(int i10) {
        try {
            this.ouw.setOverScrollMode(i10);
            super.setOverScrollMode(i10);
        } catch (Throwable unused) {
        }
    }

    public void setPreError(boolean z10) {
        this.ex = z10;
    }

    public void setPreFinish(boolean z10) {
        this.fkw = z10;
    }

    public void setPreProgressHundred(boolean z10) {
        this.f11632le = z10;
    }

    public void setPreStart(boolean z10) {
        this.yu = z10;
    }

    public void setRecycler(boolean z10) {
        if (this.ouw == null || !(this.ouw instanceof com.bytedance.sdk.component.bly.fkw)) {
            return;
        }
        ((com.bytedance.sdk.component.bly.fkw) this.ouw).setRecycler(z10);
    }

    public void setShakeValue(float f10) {
        this.jae = f10;
    }

    public void setSupportZoom(boolean z10) {
        try {
            this.ouw.getSettings().setSupportZoom(z10);
        } catch (Throwable unused) {
        }
    }

    public void setTag(String str) {
        this.f11629cf = str;
        com.bytedance.sdk.component.bly.ouw ouwVar = this.zin;
        if (ouwVar != null) {
            ouwVar.vt = str;
        }
        com.bytedance.sdk.component.bly.yu yuVar = this.jqy;
        if (yuVar != null) {
            yuVar.ouw = str;
        }
    }

    public void setTouchStateListener(fkw fkwVar) {
        this.rrs = fkwVar;
    }

    public void setUseWideViewPort(boolean z10) {
        try {
            this.ouw.getSettings().setUseWideViewPort(z10);
        } catch (Throwable unused) {
        }
    }

    public void setUserAgentString(String str) {
        try {
            this.ouw.getSettings().setUserAgentString(str);
        } catch (Throwable unused) {
        }
    }

    public void setWebChromeClient(WebChromeClient webChromeClient) {
        try {
            this.ouw.setWebChromeClient(webChromeClient);
        } catch (Throwable unused) {
        }
    }

    public void setWebView(WebView webView) {
        this.ouw = webView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setWebViewClient(WebViewClient webViewClient) {
        try {
            if (webViewClient instanceof fkw) {
                setTouchStateListener((fkw) webViewClient);
            } else {
                setTouchStateListener(null);
            }
            if (webViewClient == 0) {
                webViewClient = new ouw();
            }
            this.f11638tc = webViewClient;
            this.ouw.setWebViewClient(new ra(this.qbp, webViewClient, this.vpp));
        } catch (Throwable unused) {
        }
    }

    public void setWriggleValue(float f10) {
        this.f11628cd = f10;
    }

    public final void tlj() {
        try {
            this.ouw.clearView();
        } catch (Throwable unused) {
        }
    }

    public final void yu() {
        try {
            this.ouw.goBack();
        } catch (Throwable unused) {
        }
    }

    private static boolean lh(View view) {
        try {
            Class<?> clsLoadClass = view.getClass().getClassLoader().loadClass("android.support.v4.view.ScrollingView");
            if (clsLoadClass != null && clsLoadClass.isInstance(view)) {
                return true;
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        try {
            Class<?> clsLoadClass2 = view.getClass().getClassLoader().loadClass("androidx.core.view.ScrollingView");
            return clsLoadClass2 != null && clsLoadClass2.isInstance(view);
        } catch (Throwable th3) {
            th3.printStackTrace();
            return false;
        }
    }

    public final void a_(String str) {
        try {
            setJavaScriptEnabled(str);
            PangleNetworkBridge.webviewLoadUrl(this.ouw, str);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.uoy.set(true);
        if (this.osn.get() && !this.ey.get()) {
            if (this.fvf == null) {
                this.ey.set(false);
                getContext();
                this.fvf = new ex((byte) 0);
            }
            new Object() { // from class: com.bytedance.sdk.component.bly.le.1
            };
            this.ey.set(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.uoy.set(false);
    }

    public boolean safedk_le_dispatchTouchEvent_8b707b71cab64fb370cc2cd79fb2a819(MotionEvent p10) {
        return super.dispatchTouchEvent(p10);
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        try {
            super.setAlpha(f10);
            this.ouw.setAlpha(f10);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        try {
            super.setVisibility(i10);
            this.ouw.setVisibility(i10);
        } catch (Throwable unused) {
        }
    }

    public final void vt() {
        try {
            this.ouw.stopLoading();
        } catch (Throwable unused) {
        }
    }

    private static boolean vt(View view) {
        try {
            Class<?> clsLoadClass = view.getClass().getClassLoader().loadClass("android.support.v4.view.ViewPager");
            if (clsLoadClass != null && clsLoadClass.isInstance(view)) {
                return true;
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        try {
            Class<?> clsLoadClass2 = view.getClass().getClassLoader().loadClass("androidx.viewpager.widget.ViewPager");
            return clsLoadClass2 != null && clsLoadClass2.isInstance(view);
        } catch (Throwable th3) {
            th3.printStackTrace();
            return false;
        }
    }

    public final void ouw(int i10, long j10) {
        if (this.ouw == null || !(this.ouw instanceof com.bytedance.sdk.component.bly.fkw)) {
            return;
        }
        this.jqy = new com.bytedance.sdk.component.bly.yu(this.fak, this.zin, i10, j10, this);
        if (!TextUtils.isEmpty(this.f11629cf)) {
            this.jqy.ouw = this.f11629cf;
        }
        ((com.bytedance.sdk.component.bly.fkw) this.ouw).setTouchListenerProxy(this.jqy);
    }

    private WebView ouw(AttributeSet attributeSet) {
        yu yuVar = jvy;
        if (yuVar != null) {
            return yuVar.ouw(getContext(), attributeSet, this.ksc);
        }
        if (attributeSet == null) {
            return new WebView(ouw(this.fak));
        }
        return new WebView(ouw(this.fak), attributeSet);
    }

    @TargetApi(19)
    public final void ouw(String str, Map<String, String> map) {
        try {
            setJavaScriptEnabled(str);
            PangleNetworkBridge.webviewLoadUrl(this.ouw, str, map);
        } catch (Throwable unused) {
        }
    }

    public final void ouw(String str, String str2, String str3, String str4, String str5) {
        try {
            setJavaScriptEnabled(str);
            PangleNetworkBridge.webviewLoadDataWithBaseURL(this.ouw, str, str2, str3, str4, str5);
        } catch (Throwable unused) {
        }
    }

    public final void ouw(boolean z10) {
        try {
            this.ouw.clearCache(z10);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static ViewParent ouw(View view) {
        ViewParent parent;
        while (true) {
            parent = view.getParent();
            if ((parent instanceof AbsListView) || (parent instanceof ScrollView) || (parent instanceof HorizontalScrollView) || !(parent instanceof View)) {
                break;
            }
            View view2 = (View) parent;
            if (vt(view2) || lh(view2)) {
                break;
            }
            view = view2;
        }
        return parent;
    }
}
