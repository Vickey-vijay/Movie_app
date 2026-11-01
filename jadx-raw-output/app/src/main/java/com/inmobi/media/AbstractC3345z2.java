package com.inmobi.media;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.inmobi.media.AbstractC3345z2;
import com.mbridge.msdk.MBridgeConstans;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.vungle.ads.internal.ui.AdActivity;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.inmobi.media.z2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC3345z2 extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3028m9 f25822a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f25824c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f25825d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f25823b = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f25826e = new AtomicBoolean(false);

    public final void a(WebView webView) {
        ck.p.j(webView, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        this.f25826e.set(true);
        webView.postDelayed(new Runnable() { // from class: b7.qc
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC3345z2.a(this.f5149b);
            }
        }, 1000L);
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView view, String url) {
        super.onLoadResource(view, url);
        CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.g.f44963i, view, url);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        Logger.d("InMobi|SafeDK: Execution> Lcom/inmobi/media/z2;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V");
        CreativeInfoManager.onWebViewPageFinished(com.safedk.android.utils.g.f44963i, webView, str);
        safedk_z2_onPageFinished_b80083544f4e6f4c73a5d5ac39866754(webView, str);
    }

    public WebResourceResponse safedk_z2_shouldInterceptRequest_7b59d05f2b719a6fa627186c89be0e2b(WebView p10, String p11) {
        int i10;
        ck.p.j(p10, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        ck.p.j(p11, "url");
        C3298x5.f25687a.getClass();
        if (!C3298x5.v() && -1 != (i10 = this.f25823b)) {
            if (i10 > 0) {
                this.f25823b = i10 - 1;
            } else if (!this.f25824c) {
                new Handler(Looper.getMainLooper()).post(new Ge(p10));
                this.f25824c = true;
                if (p10 instanceof GestureDetectorOnGestureListenerC2785ci) {
                    ((GestureDetectorOnGestureListenerC2785ci) p10).G();
                }
            }
        }
        WebResourceResponse webResourceResponseA = AbstractC2842eo.a(p11, this.f25822a);
        return webResourceResponseA == null ? super.shouldInterceptRequest(p10, p11) : webResourceResponseA;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Logger.d("InMobi|SafeDK: Execution> Lcom/inmobi/media/z2;->shouldInterceptRequest(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;");
        return CreativeInfoManager.onWebViewResponseWithHeaders(com.safedk.android.utils.g.f44963i, webView, webResourceRequest, safedk_z2_shouldInterceptRequest_a6d334ec7ca7b668b092e0d258a7d5b3(webView, webResourceRequest));
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        Logger.d("InMobi|SafeDK: Execution> Lcom/inmobi/media/z2;->shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;");
        return CreativeInfoManager.onWebViewResponse(com.safedk.android.utils.g.f44963i, webView, str, safedk_z2_shouldInterceptRequest_7b59d05f2b719a6fa627186c89be0e2b(webView, str));
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        ck.p.j(webView, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        ck.p.j(renderProcessGoneDetail, "detail");
        if (Build.VERSION.SDK_INT < 26) {
            return false;
        }
        Kb.a((byte) 1, "BaseWebViewClient", "WebView crash detected, destroying ad");
        InterfaceC3028m9 interfaceC3028m9 = this.f25822a;
        if (interfaceC3028m9 != null) {
            ((C3053n9) interfaceC3028m9).b("BaseWebViewClient", "onRenderProcessGone - WebView crash detected, destroying ad ");
        }
        webView.destroy();
        return true;
    }

    public void safedk_z2_onPageFinished_b80083544f4e6f4c73a5d5ac39866754(WebView p10, String p11) {
        if (this.f25825d) {
            this.f25825d = false;
            if (p10 != null) {
                p10.clearHistory();
            }
        }
        super.onPageFinished(p10, p11);
    }

    public AbstractC3345z2(InterfaceC3028m9 interfaceC3028m9) {
        this.f25822a = interfaceC3028m9;
    }

    public static final void a(AbstractC3345z2 abstractC3345z2) {
        abstractC3345z2.f25826e.set(false);
    }

    public WebResourceResponse safedk_z2_shouldInterceptRequest_a6d334ec7ca7b668b092e0d258a7d5b3(WebView p10, WebResourceRequest p11) {
        ck.p.j(p10, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        ck.p.j(p11, AdActivity.REQUEST_KEY_EXTRA);
        InterfaceC3028m9 interfaceC3028m9 = this.f25822a;
        if (interfaceC3028m9 != null) {
            ((C3053n9) interfaceC3028m9).c("BaseWebViewClient", "shouldInterceptRequest - url - " + p11.getUrl() + ", method - " + p11.getMethod() + ", isMainFrame - " + p11.isForMainFrame());
        }
        int i10 = this.f25823b;
        if (-1 != i10) {
            if (i10 > 0) {
                this.f25823b = i10 - 1;
            } else if (!this.f25824c) {
                new Handler(Looper.getMainLooper()).post(new Ge(p10));
                this.f25824c = true;
                if (p10 instanceof GestureDetectorOnGestureListenerC2785ci) {
                    ((GestureDetectorOnGestureListenerC2785ci) p10).G();
                }
            }
        }
        WebResourceResponse webResourceResponseA = AbstractC2842eo.a(p11, this.f25822a);
        return webResourceResponseA == null ? super.shouldInterceptRequest(p10, p11) : webResourceResponseA;
    }
}
