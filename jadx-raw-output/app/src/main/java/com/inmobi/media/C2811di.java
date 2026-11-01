package com.inmobi.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.os.SystemClock;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.mbridge.msdk.MBridgeConstans;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.events.RedirectEvent;
import com.safedk.android.utils.Logger;
import com.vungle.ads.internal.ui.AdActivity;
import io.bidmachine.unified.UnifiedMediationParams;
import java.util.Map;

/* JADX INFO: renamed from: com.inmobi.media.di, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2811di extends AbstractC3345z2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C3037mi f24246f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final bk.l f24247g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f24248h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f24249i;

    public final boolean a(WebView webView, String str) {
        InterfaceC3028m9 interfaceC3028m9 = this.f25822a;
        if (interfaceC3028m9 != null) {
            ((C3053n9) interfaceC3028m9).a("RenderViewClient", "onShouldOverrideUrlLoading  - url - " + str);
        }
        boolean z10 = true;
        if (webView instanceof GestureDetectorOnGestureListenerC2785ci) {
            GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci = (GestureDetectorOnGestureListenerC2785ci) webView;
            gestureDetectorOnGestureListenerC2785ci.getClass();
            if (!gestureDetectorOnGestureListenerC2785ci.a()) {
                gestureDetectorOnGestureListenerC2785ci.a(this.f24249i);
                return true;
            }
            InterfaceC3028m9 interfaceC3028m10 = this.f25822a;
            if (interfaceC3028m10 != null) {
                ((C3053n9) interfaceC3028m10).a("RenderViewClient", "Placement type:  " + ((int) gestureDetectorOnGestureListenerC2785ci.getPlacementType()) + "  url:" + str);
            }
            a(gestureDetectorOnGestureListenerC2785ci, str);
        } else {
            z10 = false;
        }
        InterfaceC3028m9 interfaceC3028m11 = this.f25822a;
        if (interfaceC3028m11 != null) {
            ((C3053n9) interfaceC3028m11).a("RenderViewClient", "Override URL loading :" + str + " returned " + z10);
        }
        return z10;
    }

    @Override // com.inmobi.media.AbstractC3345z2, android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        Logger.d("InMobi|SafeDK: Execution> Lcom/inmobi/media/di;->onLoadResource(Landroid/webkit/WebView;Ljava/lang/String;)V");
        CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.g.f44963i, webView, str);
        safedk_di_onLoadResource_6eb002a202a2385eb37ae127257c5f96(webView, str);
    }

    @Override // com.inmobi.media.AbstractC3345z2, android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        Logger.d("InMobi|SafeDK: Execution> Lcom/inmobi/media/di;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V");
        CreativeInfoManager.onWebViewPageFinished(com.safedk.android.utils.g.f44963i, webView, str);
        safedk_di_onPageFinished_055c058bf5b4e7d5a56f3a3313042702(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i10, String str, String str2) {
        ck.p.j(webView, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        ck.p.j(str, UnifiedMediationParams.KEY_DESCRIPTION);
        ck.p.j(str2, "failingUrl");
        InterfaceC3028m9 interfaceC3028m9 = this.f25822a;
        if (interfaceC3028m9 != null) {
            ((C3053n9) interfaceC3028m9).b("RenderViewClient", "OnReceivedError - errorCode - " + i10 + ", description - " + str + ", url - " + str2);
        }
        super.onReceivedError(webView, i10, str, str2);
    }

    public WebResourceResponse safedk_di_shouldInterceptRequest_f3f288ea22ebec6fd3215c44ea448800(WebView p10, WebResourceRequest p11) {
        ck.p.j(p10, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        ck.p.j(p11, AdActivity.REQUEST_KEY_EXTRA);
        WebResourceResponse webResourceResponseA = AbstractC2842eo.a(p11, this.f25822a);
        return webResourceResponseA == null ? super.shouldInterceptRequest(p10, p11) : webResourceResponseA;
    }

    public boolean safedk_di_shouldOverrideUrlLoading_f653bca25349885d719a0687703e3498(WebView p10, WebResourceRequest p11) {
        ck.p.j(p10, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        ck.p.j(p11, AdActivity.REQUEST_KEY_EXTRA);
        InterfaceC3028m9 interfaceC3028m9 = this.f25822a;
        if (interfaceC3028m9 != null) {
            ((C3053n9) interfaceC3028m9).a("RenderViewClient", "shouldOverrideUrlLoading Called");
        }
        C3298x5.f25687a.getClass();
        if (!C3298x5.v()) {
            return false;
        }
        String string = p11.getUrl().toString();
        ck.p.i(string, "toString(...)");
        return a(p10, string);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // com.inmobi.media.AbstractC3345z2, android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Logger.d("InMobi|SafeDK: Execution> Lcom/inmobi/media/di;->shouldInterceptRequest(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;");
        return CreativeInfoManager.onWebViewResponseWithHeaders(com.safedk.android.utils.g.f44963i, webView, webResourceRequest, safedk_di_shouldInterceptRequest_f3f288ea22ebec6fd3215c44ea448800(webView, webResourceRequest));
    }

    @Override // com.inmobi.media.AbstractC3345z2, android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        Logger.d("InMobi|SafeDK: Execution> Lcom/inmobi/media/di;->shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;");
        return CreativeInfoManager.onWebViewResponse(com.safedk.android.utils.g.f44963i, webView, str, safedk_di_shouldInterceptRequest_0387cbdc895e93529137ca9c7eaf963f(webView, str));
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Logger.d("InMobi|SafeDK: Execution> Lcom/inmobi/media/di;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z");
        boolean zSafedk_di_shouldOverrideUrlLoading_f653bca25349885d719a0687703e3498 = safedk_di_shouldOverrideUrlLoading_f653bca25349885d719a0687703e3498(webView, webResourceRequest);
        BrandSafetyUtils.onShouldOverrideUrlLoadingWithHeaders(com.safedk.android.utils.g.f44963i, webView, webResourceRequest, zSafedk_di_shouldOverrideUrlLoading_f653bca25349885d719a0687703e3498);
        return zSafedk_di_shouldOverrideUrlLoading_f653bca25349885d719a0687703e3498;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Logger.d("InMobi|SafeDK: Execution> Lcom/inmobi/media/di;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
        boolean zSafedk_di_shouldOverrideUrlLoading_31568257f88a9cbecd0bdd3c9964e9f9 = safedk_di_shouldOverrideUrlLoading_31568257f88a9cbecd0bdd3c9964e9f9(webView, str);
        BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.g.f44963i, webView, str, zSafedk_di_shouldOverrideUrlLoading_31568257f88a9cbecd0bdd3c9964e9f9);
        return zSafedk_di_shouldOverrideUrlLoading_31568257f88a9cbecd0bdd3c9964e9f9;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2811di(C3037mi c3037mi, InterfaceC3028m9 interfaceC3028m9, bk.l lVar) {
        super(interfaceC3028m9);
        ck.p.j(lVar, "onRenderViewProcessGone");
        this.f24246f = c3037mi;
        this.f24247g = lVar;
        this.f24249i = RedirectEvent.f44645b;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        Gh gh2;
        C3037mi c3037mi = this.f24246f;
        if (c3037mi != null) {
            Map mapA = c3037mi.a();
            long j10 = c3037mi.f24837c;
            nk.l0 l0Var = AbstractC2940il.f24565a;
            mapA.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j10));
            String strA = c3037mi.a("PageStarted");
            Wj wj2 = Wj.f23753a;
            Wj.b(strA, mapA, EnumC2735ak.SDK);
        }
        InterfaceC3028m9 interfaceC3028m9 = this.f25822a;
        if (interfaceC3028m9 != null) {
            ((C3053n9) interfaceC3028m9).a("RenderViewClient", "Page load started:" + str);
        }
        if (webView instanceof GestureDetectorOnGestureListenerC2785ci) {
            InterfaceC3028m9 interfaceC3028m10 = this.f25822a;
            if (interfaceC3028m10 != null) {
                ((C3053n9) interfaceC3028m10).a("RenderViewClient", "Page load started renderview: " + ((GestureDetectorOnGestureListenerC2785ci) webView).getMarkupType());
            }
            GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci = (GestureDetectorOnGestureListenerC2785ci) webView;
            a(gestureDetectorOnGestureListenerC2785ci);
            gestureDetectorOnGestureListenerC2785ci.setAndUpdateViewState("Loading");
        }
        InterfaceC3028m9 interfaceC3028m11 = this.f25822a;
        if (interfaceC3028m11 != null) {
            ((C3053n9) interfaceC3028m11).a("RenderViewClient", "==== CHECKPOINT REACHED - PAGE STARTED ====");
        }
        InterfaceC3028m9 interfaceC3028m12 = this.f25822a;
        if (interfaceC3028m12 == null || (gh2 = ((C3053n9) interfaceC3028m12).f24879a) == null) {
            return;
        }
        gh2.a();
    }

    @Override // com.inmobi.media.AbstractC3345z2, android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        ck.p.j(webView, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        ck.p.j(renderProcessGoneDetail, "detail");
        if (Build.VERSION.SDK_INT >= 26) {
            InterfaceC3028m9 interfaceC3028m9 = this.f25822a;
            if (interfaceC3028m9 != null) {
                ((C3053n9) interfaceC3028m9).c("RenderViewClient", "onRenderProcessGone detail did crash- " + renderProcessGoneDetail.didCrash() + " priority - " + renderProcessGoneDetail.rendererPriorityAtExit());
            }
            this.f24247g.invoke(Boolean.valueOf(renderProcessGoneDetail.didCrash()));
        } else {
            InterfaceC3028m9 interfaceC3028m10 = this.f25822a;
            if (interfaceC3028m10 != null) {
                ((C3053n9) interfaceC3028m10).c("RenderViewClient", "onRenderProcessGone");
            }
        }
        return super.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    public void safedk_di_onLoadResource_6eb002a202a2385eb37ae127257c5f96(WebView p10, String p11) {
        InterfaceC3028m9 interfaceC3028m9 = this.f25822a;
        if (interfaceC3028m9 != null) {
            ((C3053n9) interfaceC3028m9).a("RenderViewClient", "Resource loading:" + p11);
        }
        if (p10 instanceof GestureDetectorOnGestureListenerC2785ci) {
            GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci = (GestureDetectorOnGestureListenerC2785ci) p10;
            String url = gestureDetectorOnGestureListenerC2785ci.getUrl();
            if (p11 == null || url == null || lk.x.R(url, "file:", false, 2, null)) {
                return;
            }
            a(gestureDetectorOnGestureListenerC2785ci);
        }
    }

    public void safedk_di_onPageFinished_055c058bf5b4e7d5a56f3a3313042702(WebView p10, String p11) {
        Gh gh2;
        C3037mi c3037mi = this.f24246f;
        if (c3037mi != null) {
            Map mapA = c3037mi.a();
            long j10 = c3037mi.f24837c;
            nk.l0 l0Var = AbstractC2940il.f24565a;
            mapA.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j10));
            String strA = c3037mi.a("WebViewLoadFinished");
            Wj wj2 = Wj.f23753a;
            Wj.b(strA, mapA, EnumC2735ak.SDK);
        }
        InterfaceC3028m9 interfaceC3028m9 = this.f25822a;
        if (interfaceC3028m9 != null) {
            ((C3053n9) interfaceC3028m9).a("RenderViewClient", "Page load finished:" + p11);
        }
        if (p10 instanceof GestureDetectorOnGestureListenerC2785ci) {
            GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci = (GestureDetectorOnGestureListenerC2785ci) p10;
            a(gestureDetectorOnGestureListenerC2785ci);
            String p12 = gestureDetectorOnGestureListenerC2785ci.f24196z;
            if (ck.p.e("Loading", p12)) {
                gestureDetectorOnGestureListenerC2785ci.g("window.imaiview.broadcastEvent('ready');");
                gestureDetectorOnGestureListenerC2785ci.g("window.mraidview.broadcastEvent('ready');");
                nk.j.d(A9.f22351c, null, null, new Zh(gestureDetectorOnGestureListenerC2785ci, null), 3, null);
            }
        }
        InterfaceC3028m9 interfaceC3028m10 = this.f25822a;
        if (interfaceC3028m10 != null) {
            ((C3053n9) interfaceC3028m10).a("RenderViewClient", "==== CHECKPOINT REACHED - PAGE FINISHED ====");
        }
        InterfaceC3028m9 interfaceC3028m11 = this.f25822a;
        if (interfaceC3028m11 == null || (gh2 = ((C3053n9) interfaceC3028m11).f24879a) == null) {
            return;
        }
        gh2.a();
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        String reasonPhrase;
        Integer numValueOf;
        Uri url;
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        InterfaceC3028m9 interfaceC3028m9 = this.f25822a;
        if (interfaceC3028m9 != null) {
            Boolean boolValueOf = null;
            if (webResourceResponse != null) {
                reasonPhrase = webResourceResponse.getReasonPhrase();
            } else {
                reasonPhrase = null;
            }
            if (webResourceResponse != null) {
                numValueOf = Integer.valueOf(webResourceResponse.getStatusCode());
            } else {
                numValueOf = null;
            }
            if (webResourceRequest != null) {
                url = webResourceRequest.getUrl();
            } else {
                url = null;
            }
            if (webResourceRequest != null) {
                boolValueOf = Boolean.valueOf(webResourceRequest.isForMainFrame());
            }
            ((C3053n9) interfaceC3028m9).b("RenderViewClient", "ReceivedHttpError - error - " + reasonPhrase + ", statusCode - " + numValueOf + " url - " + url + " isMainFrame - " + boolValueOf);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        Integer numValueOf;
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        InterfaceC3028m9 interfaceC3028m9 = this.f25822a;
        if (interfaceC3028m9 != null) {
            String url = null;
            if (sslError != null) {
                numValueOf = Integer.valueOf(sslError.getPrimaryError());
            } else {
                numValueOf = null;
            }
            if (sslError != null) {
                url = sslError.getUrl();
            }
            ((C3053n9) interfaceC3028m9).b("RenderViewClient", "onReceivedSSLError - error - " + numValueOf + " - url - " + url);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        ck.p.j(webView, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        ck.p.j(webResourceRequest, AdActivity.REQUEST_KEY_EXTRA);
        ck.p.j(webResourceError, "error");
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        C3298x5.f25687a.getClass();
        if (C3298x5.x()) {
            InterfaceC3028m9 interfaceC3028m9 = this.f25822a;
            if (interfaceC3028m9 != null) {
                int errorCode = webResourceError.getErrorCode();
                CharSequence description = webResourceError.getDescription();
                ((C3053n9) interfaceC3028m9).b("RenderViewClient", "OnReceivedError - errorCode - " + errorCode + ", description - " + ((Object) description) + ", url - " + webResourceRequest.getUrl() + ", method - " + webResourceRequest.getMethod() + ", isMainFrame - " + webResourceRequest.isForMainFrame());
                return;
            }
            return;
        }
        InterfaceC3028m9 interfaceC3028m10 = this.f25822a;
        if (interfaceC3028m10 != null) {
            ((C3053n9) interfaceC3028m10).b("RenderViewClient", "OnReceivedError ");
        }
    }

    public WebResourceResponse safedk_di_shouldInterceptRequest_0387cbdc895e93529137ca9c7eaf963f(WebView p10, String p11) {
        ck.p.j(p10, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        ck.p.j(p11, "url");
        WebResourceResponse webResourceResponseA = AbstractC2842eo.a(p11, this.f25822a);
        return webResourceResponseA == null ? super.shouldInterceptRequest(p10, p11) : webResourceResponseA;
    }

    public boolean safedk_di_shouldOverrideUrlLoading_31568257f88a9cbecd0bdd3c9964e9f9(WebView p10, String p11) {
        ck.p.j(p10, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        ck.p.j(p11, "url");
        InterfaceC3028m9 interfaceC3028m9 = this.f25822a;
        if (interfaceC3028m9 != null) {
            ((C3053n9) interfaceC3028m9).a("RenderViewClient", "shouldOverrideUrlLoading Called " + p11);
        }
        return a(p10, p11);
    }

    public final void a(GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci, String str) {
        InterfaceC3028m9 interfaceC3028m9 = this.f25822a;
        if (interfaceC3028m9 != null) {
            ((C3053n9) interfaceC3028m9).a("RenderViewClient", "Override URL loading :" + str);
        }
        gestureDetectorOnGestureListenerC2785ci.s();
        Ta taA = Ua.a(gestureDetectorOnGestureListenerC2785ci.getLandingPageHandler(), this.f24249i, (String) null, str, (Ya) null, 24);
        InterfaceC3028m9 interfaceC3028m10 = this.f25822a;
        if (interfaceC3028m10 != null) {
            ((C3053n9) interfaceC3028m10).a("RenderViewClient", "Current Index :" + gestureDetectorOnGestureListenerC2785ci.copyBackForwardList().getCurrentIndex() + " Original Url :" + gestureDetectorOnGestureListenerC2785ci.getOriginalUrl() + " URL: " + str);
        }
        InterfaceC3028m9 interfaceC3028m11 = this.f25822a;
        if (interfaceC3028m11 != null) {
            ((C3053n9) interfaceC3028m11).c("RenderViewClient", "landingPage process result - " + taA.f23554a);
        }
    }

    public final void a(GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci) {
        if (this.f24248h || gestureDetectorOnGestureListenerC2785ci.f24154e) {
            return;
        }
        this.f24248h = true;
        InterfaceC3028m9 interfaceC3028m9 = this.f25822a;
        if (interfaceC3028m9 != null) {
            ((C3053n9) interfaceC3028m9).a("RenderViewClient", "Injecting MRAID javascript for two piece creatives.");
        }
        gestureDetectorOnGestureListenerC2785ci.g(gestureDetectorOnGestureListenerC2785ci.getMraidJsString());
    }
}
