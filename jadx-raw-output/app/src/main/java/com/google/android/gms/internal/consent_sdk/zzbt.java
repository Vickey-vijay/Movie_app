package com.google.android.gms.internal.consent_sdk;

import android.annotation.TargetApi;
import android.util.Log;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@3.2.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzbt extends WebViewClient {
    public final /* synthetic */ zzbv zza;

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/internal/consent_sdk/zzbt;->onLoadResource(Landroid/webkit/WebView;Ljava/lang/String;)V");
        CreativeInfoManager.onResourceLoaded(g.f44962h, webView, str);
        safedk_zzbt_onLoadResource_2660ffb8318e14997e294194bcd8a464(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/internal/consent_sdk/zzbt;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V");
        CreativeInfoManager.onWebViewPageFinished(g.f44962h, webView, str);
        safedk_zzbt_onPageFinished_82070f5eadea1da6912418d728bd8d1f(webView, str);
    }

    @TargetApi(24)
    public boolean safedk_zzbt_shouldOverrideUrlLoading_667720b988ad36c39b06c77707db52b6(WebView p10, WebResourceRequest p11) {
        String string = p11.getUrl().toString();
        zzbv zzbvVar = this.zza;
        if (!zzbv.zzf(zzbvVar, string)) {
            return false;
        }
        zzbvVar.zzb.zze(string);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
        return CreativeInfoManager.onWebViewResponseWithHeaders(g.f44962h, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, String url) {
        return CreativeInfoManager.onWebViewResponse(g.f44962h, view, url, super.shouldInterceptRequest(view, url));
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(24)
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/internal/consent_sdk/zzbt;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z");
        boolean zSafedk_zzbt_shouldOverrideUrlLoading_667720b988ad36c39b06c77707db52b6 = safedk_zzbt_shouldOverrideUrlLoading_667720b988ad36c39b06c77707db52b6(webView, webResourceRequest);
        BrandSafetyUtils.onShouldOverrideUrlLoadingWithHeaders(g.f44962h, webView, webResourceRequest, zSafedk_zzbt_shouldOverrideUrlLoading_667720b988ad36c39b06c77707db52b6);
        return zSafedk_zzbt_shouldOverrideUrlLoading_667720b988ad36c39b06c77707db52b6;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/internal/consent_sdk/zzbt;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
        boolean zSafedk_zzbt_shouldOverrideUrlLoading_446fae08627b6c35cf0bc859c42067ad = safedk_zzbt_shouldOverrideUrlLoading_446fae08627b6c35cf0bc859c42067ad(webView, str);
        BrandSafetyUtils.onShouldOverrideUrlLoading(g.f44962h, webView, str, zSafedk_zzbt_shouldOverrideUrlLoading_446fae08627b6c35cf0bc859c42067ad);
        return zSafedk_zzbt_shouldOverrideUrlLoading_446fae08627b6c35cf0bc859c42067ad;
    }

    public /* synthetic */ zzbt(zzbv zzbvVar, zzbu zzbuVar) {
        this.zza = zzbvVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i10, String str, String str2) {
        this.zza.zzb.zzf(i10, str, str2);
    }

    public void safedk_zzbt_onLoadResource_2660ffb8318e14997e294194bcd8a464(WebView p10, String p11) {
        zzbv zzbvVar = this.zza;
        if (zzbv.zzf(zzbvVar, p11)) {
            zzbvVar.zzb.zze(p11);
        }
    }

    public void safedk_zzbt_onPageFinished_82070f5eadea1da6912418d728bd8d1f(WebView p10, String p11) {
        zzbv zzbvVar = this.zza;
        if (zzbvVar.zzc) {
            return;
        }
        Log.d("UserMessagingPlatform", "Wall html loaded.");
        zzbvVar.zzc = true;
    }

    public boolean safedk_zzbt_shouldOverrideUrlLoading_446fae08627b6c35cf0bc859c42067ad(WebView p10, String p11) {
        zzbv zzbvVar = this.zza;
        if (!zzbv.zzf(zzbvVar, p11)) {
            return false;
        }
        zzbvVar.zzb.zze(p11);
        return true;
    }
}
