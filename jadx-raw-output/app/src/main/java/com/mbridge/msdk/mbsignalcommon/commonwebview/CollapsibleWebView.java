package com.mbridge.msdk.mbsignalcommon.commonwebview;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.mbridge.msdk.foundation.tools.q0;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import io.bidmachine.unified.UnifiedMediationParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes8.dex */
public class CollapsibleWebView extends CommonWebView {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private CopyOnWriteArrayList<CommonWebView.h> f36014v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private CopyOnWriteArrayList<CommonWebView.h> f36015w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private CopyOnWriteArrayList<e> f36016x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private String f36017y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private String f36018z;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CollapsibleWebView.this.hideToolBarButton("doCollapse");
            CollapsibleWebView.this.showToolBarButton("doSpand");
            CollapsibleWebView.this.d();
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CollapsibleWebView.this.hideToolBarButton("doSpand");
            CollapsibleWebView.this.showToolBarButton("doCollapse");
            CollapsibleWebView.this.e();
        }
    }

    public class c implements CommonWebView.i {
        public c() {
        }

        @Override // com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView.i
        public void a(String str) {
            CollapsibleWebView collapsibleWebView = CollapsibleWebView.this;
            collapsibleWebView.b(collapsibleWebView.f36034j, str);
        }
    }

    public class d extends WebViewClient {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Boolean f36022a = Boolean.FALSE;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f36023b = "";

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView view, String url) {
            super.onLoadResource(view, url);
            CreativeInfoManager.onResourceLoaded(g.f44969o, view, url);
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            Logger.d("Mintegral|SafeDK: Execution> Lcom/mbridge/msdk/mbsignalcommon/commonwebview/CollapsibleWebView$d;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V");
            CreativeInfoManager.onWebViewPageFinished(g.f44969o, webView, str);
            safedk_CollapsibleWebView$d_onPageFinished_842a2dc0942cc93ddbf87fc74c1abde4(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
            return CreativeInfoManager.onWebViewResponseWithHeaders(g.f44969o, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView view, String url) {
            return CreativeInfoManager.onWebViewResponse(g.f44969o, view, url, super.shouldInterceptRequest(view, url));
        }

        public d() {
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            HashMap map = new HashMap();
            map.put("type", "error");
            map.put("url", str2);
            map.put(UnifiedMediationParams.KEY_DESCRIPTION, str);
            if (!this.f36022a.booleanValue() && this.f36023b.equals(str2)) {
                this.f36022a = Boolean.TRUE;
                CollapsibleWebView.this.b(webView, map);
            }
            CollapsibleWebView.this.a(webView, map);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            HashMap map = new HashMap();
            map.put("type", "http");
            String str = webResourceRequest.getUrl() + "";
            map.put("url", str);
            map.put("statusCode", webResourceResponse.getStatusCode() + "");
            map.put(UnifiedMediationParams.KEY_DESCRIPTION, "http error");
            if (!this.f36022a.booleanValue() && (this.f36023b.equals(str) || TextUtils.isEmpty(this.f36023b))) {
                this.f36022a = Boolean.TRUE;
                CollapsibleWebView.this.b(webView, map);
            }
            CollapsibleWebView.this.a(webView, map);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            HashMap map = new HashMap();
            map.put("type", "ssl");
            map.put("url", sslError.getUrl());
            map.put(UnifiedMediationParams.KEY_DESCRIPTION, "ssl error");
            if (!this.f36022a.booleanValue()) {
                if (this.f36023b.equals(sslError.getUrl() + "")) {
                    this.f36022a = Boolean.TRUE;
                    CollapsibleWebView.this.b(webView, map);
                }
            }
            CollapsibleWebView.this.a(webView, map);
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            q0.b("CollapsibleWebView", "WebView called onRenderProcessGone");
            return true;
        }

        public void safedk_CollapsibleWebView$d_onPageFinished_842a2dc0942cc93ddbf87fc74c1abde4(WebView p10, String p11) {
            if (this.f36022a.booleanValue()) {
                return;
            }
            CollapsibleWebView.this.a((View) p10, p11);
            this.f36022a = Boolean.FALSE;
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            if (!TextUtils.isEmpty(str)) {
                this.f36023b = str;
            }
        }
    }

    public interface e {
        void a(View view, String str);

        void a(View view, Map<String, String> map);

        void b(View view, String str);

        void b(View view, Map<String, String> map);
    }

    public CollapsibleWebView(Context context) {
        super(context);
    }

    @Override // com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44969o, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView, android.widget.LinearLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public CollapsibleWebView(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        Iterator<CommonWebView.h> it = this.f36014v.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        Iterator<CommonWebView.h> it = this.f36015w.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    private ToolBar.b getCollapseButton() {
        return new ToolBar.b("doCollapse").a(false).a("mbridge_arrow_down_white_blackbg").a(new a());
    }

    private ToolBar.b getExpandButton() {
        return new ToolBar.b("doSpand").a("mbridge_arrow_up_black").a(new b());
    }

    public String getCollapseIconName() {
        return this.f36017y;
    }

    public String getExpandIconName() {
        return this.f36018z;
    }

    public void initWebViewListener() {
        setPageLoadTimtoutListener(new c());
        setPageLoadTimtout(CommonWebView.DEFAULT_JUMP_TIMEOUT);
        addWebViewClient(new d());
    }

    public void setCollapseIconName(String str) {
        this.f36017y = str;
    }

    public void setCollapseListener(CommonWebView.h hVar) {
        this.f36014v.add(hVar);
    }

    public void setCustomizedToolBarMarginWidthPixel(int i10, int i11, int i12, int i13) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f36027c.getLayoutParams();
        layoutParams.setMargins(i10, i11, i12, i13);
        this.f36027c.setLayoutParams(layoutParams);
    }

    public void setExpandIconName(String str) {
        this.f36018z = str;
    }

    public void setExpandListener(CommonWebView.h hVar) {
        this.f36015w.add(hVar);
    }

    public void setPageLoadListener(e eVar) {
        this.f36016x.add(eVar);
    }

    public CollapsibleWebView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView
    public void init() {
        super.init();
        this.f36014v = new CopyOnWriteArrayList<>();
        this.f36015w = new CopyOnWriteArrayList<>();
        this.f36016x = new CopyOnWriteArrayList<>();
        this.f36017y = "mbridge_arrow_down_white_blackbg";
        this.f36018z = "mbridge_arrow_up_white";
        useDeeplink();
        initWebViewListener();
        useProgressBar();
        ArrayList<ToolBar.b> arrayList = new ArrayList<>();
        arrayList.add(getCollapseButton());
        arrayList.add(getExpandButton());
        useDefaultToolBar();
        useCustomizedToolBar(arrayList, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(View view, String str) {
        Iterator<e> it = this.f36016x.iterator();
        while (it.hasNext()) {
            it.next().a(view, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(View view, Map<String, String> map) {
        Iterator<e> it = this.f36016x.iterator();
        while (it.hasNext()) {
            it.next().b(view, map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(View view, Map<String, String> map) {
        Iterator<e> it = this.f36016x.iterator();
        while (it.hasNext()) {
            it.next().a(view, map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(View view, String str) {
        Iterator<e> it = this.f36016x.iterator();
        while (it.hasNext()) {
            it.next().b(view, str);
        }
    }
}
