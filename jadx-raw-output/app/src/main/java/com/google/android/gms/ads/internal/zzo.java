package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.ads.zzfkm;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
final class zzo extends WebViewClient {
    public final /* synthetic */ zzs zza;

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView view, String url) {
        super.onLoadResource(view, url);
        CreativeInfoManager.onResourceLoaded(g.f44962h, view, url);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView view, String url) {
        super.onPageFinished(view, url);
        CreativeInfoManager.onWebViewPageFinished(g.f44962h, view, url);
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
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/ads/internal/zzo;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
        boolean zSafedk_zzo_shouldOverrideUrlLoading_d3d4e73010143acf73d406f77cfb80c7 = safedk_zzo_shouldOverrideUrlLoading_d3d4e73010143acf73d406f77cfb80c7(webView, str);
        BrandSafetyUtils.onShouldOverrideUrlLoading(g.f44962h, webView, str, zSafedk_zzo_shouldOverrideUrlLoading_d3d4e73010143acf73d406f77cfb80c7);
        return zSafedk_zzo_shouldOverrideUrlLoading_d3d4e73010143acf73d406f77cfb80c7;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        zzs zzsVar = this.zza;
        if (zzsVar.zzX() != null) {
            try {
                zzsVar.zzX().zzd(zzfkm.zzd(1, null, null));
            } catch (RemoteException e10) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
            }
        }
        zzs zzsVar2 = this.zza;
        if (zzsVar2.zzX() != null) {
            try {
                zzsVar2.zzX().zzc(0);
            } catch (RemoteException e11) {
                int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e11);
            }
        }
    }

    public boolean safedk_zzo_shouldOverrideUrlLoading_d3d4e73010143acf73d406f77cfb80c7(WebView p10, String p11) {
        zzs zzsVar = this.zza;
        if (p11.startsWith(zzsVar.zzO())) {
            return false;
        }
        if (p11.startsWith("gmsg://noAdLoaded")) {
            if (zzsVar.zzX() != null) {
                try {
                    zzsVar.zzX().zzd(zzfkm.zzd(3, null, null));
                } catch (RemoteException e10) {
                    int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
                }
            }
            zzs zzsVar2 = this.zza;
            if (zzsVar2.zzX() != null) {
                try {
                    zzsVar2.zzX().zzc(3);
                } catch (RemoteException e11) {
                    int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e11);
                }
            }
            this.zza.zzM(0);
            return true;
        }
        if (p11.startsWith("gmsg://scriptLoadFailed")) {
            zzs zzsVar3 = this.zza;
            if (zzsVar3.zzX() != null) {
                try {
                    zzsVar3.zzX().zzd(zzfkm.zzd(1, null, null));
                } catch (RemoteException e12) {
                    int i12 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e12);
                }
            }
            zzs zzsVar4 = this.zza;
            if (zzsVar4.zzX() != null) {
                try {
                    zzsVar4.zzX().zzc(0);
                } catch (RemoteException e13) {
                    int i13 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e13);
                }
            }
            this.zza.zzM(0);
            return true;
        }
        if (p11.startsWith("gmsg://adResized")) {
            zzs zzsVar5 = this.zza;
            if (zzsVar5.zzX() != null) {
                try {
                    zzsVar5.zzX().zzf();
                } catch (RemoteException e14) {
                    int i14 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e14);
                }
            }
            zzs zzsVar6 = this.zza;
            zzsVar6.zzM(zzsVar6.zzL(p11));
            return true;
        }
        if (p11.startsWith("gmsg://")) {
            return true;
        }
        zzs zzsVar7 = this.zza;
        if (zzsVar7.zzX() != null) {
            try {
                zzsVar7.zzX().zzh();
                zzsVar7.zzX().zze();
            } catch (RemoteException e15) {
                int i15 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e15);
            }
        }
        this.zza.zzV(p11);
        return true;
    }

    public zzo(zzs zzsVar) {
        Objects.requireNonNull(zzsVar);
        this.zza = zzsVar;
    }
}
