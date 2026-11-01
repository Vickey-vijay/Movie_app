package com.google.android.gms.internal.ads;

import com.vungle.ads.internal.ui.AdActivity;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes7.dex */
final class zzegs implements zzbss {
    @Override // com.google.android.gms.internal.ads.zzbss
    public final /* bridge */ /* synthetic */ JSONObject zzb(Object obj) throws JSONException {
        zzegt zzegtVar = (zzegt) obj;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkJ)).booleanValue()) {
            zzbzw zzbzwVar = zzegtVar.zzc;
            jSONObject2.put("ad_request_url", zzbzwVar.zze());
            jSONObject2.put("ad_request_post_body", zzbzwVar.zzd());
        }
        zzbzw zzbzwVar2 = zzegtVar.zzc;
        jSONObject2.put("base_url", zzbzwVar2.zzc());
        jSONObject2.put("signals", zzegtVar.zzb);
        zzegz zzegzVar = zzegtVar.zza;
        jSONObject3.put("body", zzegzVar.zzc);
        jSONObject3.put("headers", com.google.android.gms.ads.internal.client.zzbb.zza().zzk(zzegzVar.zzb));
        jSONObject3.put(com.safedk.android.analytics.brandsafety.c.f43768g, zzegzVar.zza);
        jSONObject3.put("latency", zzegzVar.zzd);
        jSONObject.put(AdActivity.REQUEST_KEY_EXTRA, jSONObject2);
        jSONObject.put("response", jSONObject3);
        jSONObject.put("flags", zzbzwVar2.zzh());
        return jSONObject;
    }
}
