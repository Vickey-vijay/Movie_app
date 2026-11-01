package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzcqw implements zzcqm {
    private final zzebf zza;

    public zzcqw(zzebf zzebfVar) {
        this.zza = zzebfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcqm
    public final void zza(JSONObject jSONObject) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkG)).booleanValue()) {
            this.zza.zzp(jSONObject);
        }
    }
}
