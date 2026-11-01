package com.google.android.gms.internal.ads;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
public class zzckz extends zzcky {
    @Override // com.google.android.gms.internal.ads.zzcjw, android.webkit.WebViewClient
    @Nullable
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
            return null;
        }
        return zzac(webView, webResourceRequest.getUrl().toString(), webResourceRequest.getRequestHeaders());
    }

    public zzckz(zzcjl zzcjlVar, zzbgd zzbgdVar, boolean z10, @Nullable zzejf zzejfVar) {
        super(zzcjlVar, zzbgdVar, z10, zzejfVar);
    }
}
