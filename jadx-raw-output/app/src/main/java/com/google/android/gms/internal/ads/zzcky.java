package com.google.android.gms.internal.ads;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import java.io.File;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
public class zzcky extends zzcjw {
    public zzcky(zzcjl zzcjlVar, zzbgd zzbgdVar, boolean z10, @Nullable zzejf zzejfVar) {
        super(zzcjlVar, zzbgdVar, z10, new zzbww(zzcjlVar, zzcjlVar.zzK(), new zzbgl(zzcjlVar.getContext())), null, zzejfVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final WebResourceResponse zzac(WebView webView, String str, @Nullable Map map) {
        String str2;
        if (!(webView instanceof zzcjl)) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        zzcjl zzcjlVar = (zzcjl) webView;
        zzcce zzcceVar = this.zzb;
        if (zzcceVar != null) {
            zzcceVar.zze(str, map, 1);
        }
        zzfxl.zza();
        zzfxq zzfxqVar = zzfxq.zza;
        if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
            if (map == null) {
                map = Collections.emptyMap();
            }
            return super.zzL(str, map);
        }
        if (zzcjlVar.zzP() != null) {
            zzcjlVar.zzP().zzN();
        }
        if (zzcjlVar.zzN().zzg()) {
            str2 = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzax);
        } else if (zzcjlVar.zzW()) {
            str2 = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzaw);
        } else {
            str2 = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzav);
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        return com.google.android.gms.ads.internal.util.zzs.zzB(zzcjlVar.getContext(), zzcjlVar.zzs().afmaVersion, str2);
    }
}
