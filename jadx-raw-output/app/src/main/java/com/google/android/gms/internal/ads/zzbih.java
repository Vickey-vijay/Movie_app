package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import java.util.Objects;
import org.json.JSONException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes8.dex */
final class zzbih extends QueryInfoGenerationCallback {
    public final /* synthetic */ String zza;
    public final /* synthetic */ zzbij zzb;

    public zzbih(zzbij zzbijVar, String str) {
        this.zza = str;
        Objects.requireNonNull(zzbijVar);
        this.zzb = zzbijVar;
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onFailure(String str) {
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to generate query info for Custom Tab error: ".concat(String.valueOf(str)));
        try {
            zzbij zzbijVar = this.zzb;
            zzbijVar.zzi().postMessage(zzbijVar.zze(this.zza, str).toString(), null);
        } catch (JSONException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error creating PACT Error Response JSON: ", e10);
        }
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onSuccess(QueryInfo queryInfo) {
        String query = queryInfo.getQuery();
        try {
            zzbij zzbijVar = this.zzb;
            zzbijVar.zzi().postMessage(zzbijVar.zzf(this.zza, query).toString(), null);
        } catch (JSONException e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error creating PACT Signal Response JSON: ", e10);
        }
    }
}
