package com.inmobi.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.view.ViewParent;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.mbridge.msdk.MBridgeConstans;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.vungle.ads.internal.ui.AdActivity;
import io.bidmachine.unified.UnifiedMediationParams;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class U5 extends AbstractC3345z2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f23615f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final bk.a f23616g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final bk.l f23617h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final bk.p f23618i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Ya f23619j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Wa f23620k;

    public final boolean a(WebView webView, String str) {
        Integer num;
        int i10;
        T5 t10;
        InterfaceC2736al userLeftApplicationListener;
        if (this.f25826e.get()) {
            return true;
        }
        InterfaceC3028m9 interfaceC3028m9 = this.f25822a;
        if (interfaceC3028m9 != null) {
            ((C3053n9) interfaceC3028m9).a("EmbeddedBrowserViewClient", "onShouldOverrideUrlLoading: " + str);
        }
        if (webView instanceof AbstractC3320y2) {
            Ta taA = Ua.a(((AbstractC3320y2) webView).getLandingPageHandler(), this.f23615f, (String) null, str, this.f23619j, 16);
            num = taA.f23555b;
            i10 = taA.f23554a;
        } else {
            num = null;
            i10 = 0;
        }
        if (i10 != 1) {
            if (i10 != 2 && i10 != 3) {
                return false;
            }
            Integer numValueOf = Integer.valueOf(num != null ? num.intValue() : 10);
            Wa wa2 = this.f23620k;
            if (wa2 != null) {
                wa2.a(3, false, str, numValueOf);
            }
            return true;
        }
        boolean z10 = webView instanceof V5;
        if (z10) {
            ViewParent parent = ((V5) webView).getParent();
            if ((parent instanceof Q5) && (userLeftApplicationListener = ((Q5) parent).getUserLeftApplicationListener()) != null) {
                userLeftApplicationListener.a();
            }
        }
        bk.l lVar = this.f23617h;
        Mh mh2 = GestureDetectorOnGestureListenerC2785ci.f24139e1;
        String str2 = this.f23615f;
        mh2.getClass();
        lVar.invoke(Mh.a(str2, "onNavigatingAway"));
        a(webView);
        ck.p.j(str, "url");
        Uri uri = Uri.parse(str);
        ck.p.i(uri, "Uri.parse(this)");
        if (!AbstractC3296x3.a(uri) || ck.p.e("play.google.com", uri.getHost()) || ck.p.e("market.android.com", uri.getHost()) || ck.p.e("market", uri.getScheme())) {
            if (webView.canGoBack()) {
                webView.goBack();
            } else if (z10) {
                ViewParent parent2 = ((V5) webView).getParent();
                if ((parent2 instanceof Q5) && (t10 = ((Q5) parent2).f23370d) != null) {
                    M8.a(((L8) t10).f23064a);
                }
            }
        }
        a(this, 2, false, str, 8);
        return true;
    }

    @Override // com.inmobi.media.AbstractC3345z2, android.webkit.WebViewClient
    public void onLoadResource(WebView view, String url) {
        super.onLoadResource(view, url);
        CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.g.f44963i, view, url);
    }

    @Override // com.inmobi.media.AbstractC3345z2, android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        Logger.d("InMobi|SafeDK: Execution> Lcom/inmobi/media/U5;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V");
        CreativeInfoManager.onWebViewPageFinished(com.safedk.android.utils.g.f44963i, webView, str);
        safedk_U5_onPageFinished_63244d0aed3d57c9a100e13fbb2f58cf(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i10, String str, String str2) {
        ck.p.j(webView, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        ck.p.j(str, UnifiedMediationParams.KEY_DESCRIPTION);
        ck.p.j(str2, "failingUrl");
        Integer numValueOf = Integer.valueOf(i10);
        Wa wa2 = this.f23620k;
        if (wa2 != null) {
            wa2.a(3, false, str2, numValueOf);
        }
        InterfaceC3028m9 interfaceC3028m9 = this.f25822a;
        if (interfaceC3028m9 != null) {
            ((C3053n9) interfaceC3028m9).a("EmbeddedBrowserViewClient", "onReceivedError: " + str2);
        }
    }

    public boolean safedk_U5_shouldOverrideUrlLoading_a2bdbe055f8465838f26cd5ed7a94dbe(WebView p10, WebResourceRequest p11) {
        String string;
        Uri url;
        InterfaceC3028m9 interfaceC3028m9 = this.f25822a;
        if (interfaceC3028m9 != null) {
            ((C3053n9) interfaceC3028m9).a("EmbeddedBrowserViewClient", "shouldOverrideUrlLoading Called");
        }
        C3298x5.f25687a.getClass();
        if (!C3298x5.v()) {
            return false;
        }
        if (p11 == null || (url = p11.getUrl()) == null || (string = url.toString()) == null) {
            string = "";
        }
        if (p10 == null || string.length() <= 0) {
            return false;
        }
        return a(p10, string);
    }

    @Override // com.inmobi.media.AbstractC3345z2, android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
        return CreativeInfoManager.onWebViewResponseWithHeaders(com.safedk.android.utils.g.f44963i, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
    }

    @Override // com.inmobi.media.AbstractC3345z2, android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, String url) {
        return CreativeInfoManager.onWebViewResponse(com.safedk.android.utils.g.f44963i, view, url, super.shouldInterceptRequest(view, url));
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Logger.d("InMobi|SafeDK: Execution> Lcom/inmobi/media/U5;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z");
        boolean zSafedk_U5_shouldOverrideUrlLoading_a2bdbe055f8465838f26cd5ed7a94dbe = safedk_U5_shouldOverrideUrlLoading_a2bdbe055f8465838f26cd5ed7a94dbe(webView, webResourceRequest);
        BrandSafetyUtils.onShouldOverrideUrlLoadingWithHeaders(com.safedk.android.utils.g.f44963i, webView, webResourceRequest, zSafedk_U5_shouldOverrideUrlLoading_a2bdbe055f8465838f26cd5ed7a94dbe);
        return zSafedk_U5_shouldOverrideUrlLoading_a2bdbe055f8465838f26cd5ed7a94dbe;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Logger.d("InMobi|SafeDK: Execution> Lcom/inmobi/media/U5;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
        boolean zSafedk_U5_shouldOverrideUrlLoading_ec10909dd8025dc294ba7b7aeb0524cd = safedk_U5_shouldOverrideUrlLoading_ec10909dd8025dc294ba7b7aeb0524cd(webView, str);
        BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.g.f44963i, webView, str, zSafedk_U5_shouldOverrideUrlLoading_ec10909dd8025dc294ba7b7aeb0524cd);
        return zSafedk_U5_shouldOverrideUrlLoading_ec10909dd8025dc294ba7b7aeb0524cd;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U5(String str, bk.a aVar, bk.l lVar, bk.p pVar, InterfaceC3028m9 interfaceC3028m9) {
        super(interfaceC3028m9);
        ck.p.j(str, "api");
        ck.p.j(aVar, "onUserLandingCompleted");
        ck.p.j(lVar, "onLpLifecycleEvent");
        ck.p.j(pVar, "fireLandingPageTracker");
        this.f23615f = str;
        this.f23616g = aVar;
        this.f23617h = lVar;
        this.f23618i = pVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageCommitVisible(WebView webView, String str) {
        InterfaceC3028m9 interfaceC3028m9 = this.f25822a;
        if (interfaceC3028m9 != null) {
            ((C3053n9) interfaceC3028m9).a("EmbeddedBrowserViewClient", "onPageCommitVisible: " + str);
        }
        a(this, 4, true, str, 8);
    }

    @Override // com.inmobi.media.AbstractC3345z2, android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        ck.p.j(webView, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        ck.p.j(renderProcessGoneDetail, "detail");
        boolean zOnRenderProcessGone = super.onRenderProcessGone(webView, renderProcessGoneDetail);
        if (Build.VERSION.SDK_INT >= 26) {
            Wa wa2 = this.f23620k;
            if (wa2 != null) {
                wa2.a(3, true, null, 8007);
            }
            Map mapO = kotlin.collections.a.o(mj.h.a("source", "embedded_browser"), mj.h.a("isCrashed", Boolean.valueOf(renderProcessGoneDetail.didCrash())));
            Wj wj2 = Wj.f23753a;
            Wj.b("WebViewRenderProcessGoneEvent", mapO, EnumC2735ak.SDK);
        }
        return zOnRenderProcessGone;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        InterfaceC3028m9 interfaceC3028m9 = this.f25822a;
        if (interfaceC3028m9 != null) {
            ((C3053n9) interfaceC3028m9).a("EmbeddedBrowserViewClient", "onPageStarted: " + str);
        }
        bk.l lVar = this.f23617h;
        Mh mh2 = GestureDetectorOnGestureListenerC2785ci.f24139e1;
        String str2 = this.f23615f;
        mh2.getClass();
        lVar.invoke(Mh.a(str2, "onPageStart"));
        a(this, 1, true, str, 8);
    }

    public void safedk_U5_onPageFinished_63244d0aed3d57c9a100e13fbb2f58cf(WebView p10, String p11) {
        super.onPageFinished(p10, p11);
        InterfaceC3028m9 interfaceC3028m9 = this.f25822a;
        if (interfaceC3028m9 != null) {
            ((C3053n9) interfaceC3028m9).a("EmbeddedBrowserViewClient", "onPageFinished: " + p11);
        }
        a(this, 2, true, p11, 8);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        ck.p.j(webView, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        ck.p.j(webResourceRequest, AdActivity.REQUEST_KEY_EXTRA);
        ck.p.j(webResourceError, "error");
        InterfaceC3028m9 interfaceC3028m9 = this.f25822a;
        if (interfaceC3028m9 != null) {
            ((C3053n9) interfaceC3028m9).a("EmbeddedBrowserViewClient", "onReceivedError: " + webResourceRequest.getUrl());
        }
        if (webResourceRequest.isForMainFrame()) {
            Integer numValueOf = Integer.valueOf(webResourceError.getErrorCode());
            String string = webResourceRequest.getUrl().toString();
            Wa wa2 = this.f23620k;
            if (wa2 != null) {
                wa2.a(3, true, string, numValueOf);
            }
        }
    }

    public boolean safedk_U5_shouldOverrideUrlLoading_ec10909dd8025dc294ba7b7aeb0524cd(WebView p10, String p11) {
        InterfaceC3028m9 interfaceC3028m9 = this.f25822a;
        if (interfaceC3028m9 != null) {
            ((C3053n9) interfaceC3028m9).a("EmbeddedBrowserViewClient", "shouldOverrideUrlLoading Called");
        }
        if (p10 == null || p11 == null) {
            return false;
        }
        return a(p10, p11);
    }

    public static void a(U5 u10, int i10, boolean z10, String str, int i11) {
        if ((i11 & 4) != 0) {
            str = null;
        }
        Wa wa2 = u10.f23620k;
        if (wa2 != null) {
            wa2.a(i10, z10, str, null);
        }
    }
}
