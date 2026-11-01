package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes8.dex */
final class zzbnc implements zzboh {
    @Override // com.google.android.gms.internal.ads.zzboh
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        JSONObject jSONObjectZzc;
        zzcjl zzcjlVar = (zzcjl) obj;
        zzbkf zzbkfVarZzar = zzcjlVar.zzar();
        if (zzbkfVarZzar == null || (jSONObjectZzc = zzbkfVarZzar.zzc()) == null) {
            zzcjlVar.zzd("nativeAdViewSignalsReady", new JSONObject());
        } else {
            zzcjlVar.zzd("nativeAdViewSignalsReady", jSONObjectZzc);
        }
    }
}
