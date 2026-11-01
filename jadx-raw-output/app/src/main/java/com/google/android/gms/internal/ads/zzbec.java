package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
final class zzbec implements Runnable {
    public final ValueCallback zza;
    public final /* synthetic */ zzbdu zzb;
    public final /* synthetic */ WebView zzc;
    public final /* synthetic */ boolean zzd;
    public final /* synthetic */ zzbee zze;

    public zzbec(zzbee zzbeeVar, final zzbdu zzbduVar, final WebView webView, final boolean z10) {
        this.zzb = zzbduVar;
        this.zzc = webView;
        this.zzd = z10;
        Objects.requireNonNull(zzbeeVar);
        this.zze = zzbeeVar;
        this.zza = new ValueCallback() { // from class: com.google.android.gms.internal.ads.zzbeb
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(Object obj) {
                this.zza.zze.zzd(zzbduVar, webView, (String) obj, z10);
            }
        };
    }

    @Override // java.lang.Runnable
    public final void run() {
        WebView webView = this.zzc;
        if (webView.getSettings().getJavaScriptEnabled()) {
            try {
                webView.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.zza);
            } catch (Throwable unused) {
                this.zza.onReceiveValue("");
            }
        }
    }
}
