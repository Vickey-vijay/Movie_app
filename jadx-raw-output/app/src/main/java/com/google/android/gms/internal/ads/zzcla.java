package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
@TargetApi(26)
public final class zzcla extends zzckz {
    @Override // android.webkit.WebViewClient
    @TargetApi(26)
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return this.zza.zzaA(renderProcessGoneDetail.didCrash(), renderProcessGoneDetail.rendererPriorityAtExit());
    }

    public zzcla(zzcjl zzcjlVar, zzbgd zzbgdVar, boolean z10, @Nullable zzejf zzejfVar) {
        super(zzcjlVar, zzbgdVar, z10, zzejfVar);
    }
}
