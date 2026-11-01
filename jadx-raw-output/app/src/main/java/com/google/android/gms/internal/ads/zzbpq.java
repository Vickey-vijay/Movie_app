package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.gms.ads.h5.H5AdsRequestHandler;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzbpq extends zzbpd {
    public static final /* synthetic */ int zza = 0;

    @Nullable
    private WebViewClient zzb;
    private final H5AdsRequestHandler zzc;
    private final WebView zzd;

    @Override // com.google.android.gms.internal.ads.zzbpd
    @Nullable
    public final WebViewClient getDelegate() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbpd, android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/internal/ads/zzbpq;->onLoadResource(Landroid/webkit/WebView;Ljava/lang/String;)V");
        CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.g.f44962h, webView, str);
        safedk_zzbpq_onLoadResource_bc3c34bebf5683e7553618f5cf63e4fa(webView, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbpd, android.webkit.WebViewClient
    public void onPageFinished(WebView view, String url) {
        super.onPageFinished(view, url);
        CreativeInfoManager.onWebViewPageFinished(com.safedk.android.utils.g.f44962h, view, url);
    }

    @RequiresApi(api = 24)
    public boolean safedk_zzbpq_shouldOverrideUrlLoading_d13048726e82b8e1b2145930102420b6(WebView p10, WebResourceRequest p11) {
        if (!zzc(this.zzd)) {
            return false;
        }
        if (this.zzc.handleH5AdsRequest(p11.getUrl().toString())) {
            return true;
        }
        return super.shouldOverrideUrlLoading(p10, p11);
    }

    @Override // com.google.android.gms.internal.ads.zzbpd, android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
        return CreativeInfoManager.onWebViewResponseWithHeaders(com.safedk.android.utils.g.f44962h, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
    }

    @Override // com.google.android.gms.internal.ads.zzbpd, android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, String url) {
        return CreativeInfoManager.onWebViewResponse(com.safedk.android.utils.g.f44962h, view, url, super.shouldInterceptRequest(view, url));
    }

    @Override // com.google.android.gms.internal.ads.zzbpd, android.webkit.WebViewClient
    @RequiresApi(api = 24)
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/internal/ads/zzbpq;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z");
        boolean zSafedk_zzbpq_shouldOverrideUrlLoading_d13048726e82b8e1b2145930102420b6 = safedk_zzbpq_shouldOverrideUrlLoading_d13048726e82b8e1b2145930102420b6(webView, webResourceRequest);
        BrandSafetyUtils.onShouldOverrideUrlLoadingWithHeaders(com.safedk.android.utils.g.f44962h, webView, webResourceRequest, zSafedk_zzbpq_shouldOverrideUrlLoading_d13048726e82b8e1b2145930102420b6);
        return zSafedk_zzbpq_shouldOverrideUrlLoading_d13048726e82b8e1b2145930102420b6;
    }

    @Override // com.google.android.gms.internal.ads.zzbpd, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/internal/ads/zzbpq;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
        boolean zSafedk_zzbpq_shouldOverrideUrlLoading_902a111a78cd21242fa7eae56ad2ce55 = safedk_zzbpq_shouldOverrideUrlLoading_902a111a78cd21242fa7eae56ad2ce55(webView, str);
        BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.g.f44962h, webView, str, zSafedk_zzbpq_shouldOverrideUrlLoading_902a111a78cd21242fa7eae56ad2ce55);
        return zSafedk_zzbpq_shouldOverrideUrlLoading_902a111a78cd21242fa7eae56ad2ce55;
    }

    private final boolean zzc(WebView webView) {
        if (this.zzd.equals(webView)) {
            return true;
        }
        com.google.android.gms.ads.internal.util.client.zzo.zzf("H5AdsWebViewClient must be attached to the same WebVew which was passed in the constructor.");
        return false;
    }

    public final void zza() {
        this.zzc.clearAdObjects();
    }

    public final void zzb(@Nullable WebViewClient webViewClient) {
        zzgrc.zzb(webViewClient != this, "Delegate cannot be itself.");
        this.zzb = webViewClient;
    }

    public zzbpq(Context context, final WebView webView) {
        context.getClass();
        webView.getClass();
        zzgrc.zzb(webView.getSettings().getJavaScriptEnabled(), "JavaScript must be enabled on the WebView.");
        this.zzd = webView;
        this.zzc = new H5AdsRequestHandler(context, new OnH5AdsEventListener() { // from class: com.google.android.gms.internal.ads.zzbpp
            @Override // com.google.android.gms.ads.h5.OnH5AdsEventListener
            public final /* synthetic */ void onH5AdsEvent(String str) {
                int i10 = zzbpq.zza;
                webView.evaluateJavascript(str, null);
            }
        });
    }

    public void safedk_zzbpq_onLoadResource_bc3c34bebf5683e7553618f5cf63e4fa(WebView p10, String p11) {
        if (zzc(p10) && !this.zzc.handleH5AdsRequest(p11)) {
            super.onLoadResource(p10, p11);
        }
    }

    public boolean safedk_zzbpq_shouldOverrideUrlLoading_902a111a78cd21242fa7eae56ad2ce55(WebView p10, String p11) {
        if (!zzc(p10)) {
            return false;
        }
        if (this.zzc.handleH5AdsRequest(p11)) {
            return true;
        }
        return super.shouldOverrideUrlLoading(p10, p11);
    }
}
