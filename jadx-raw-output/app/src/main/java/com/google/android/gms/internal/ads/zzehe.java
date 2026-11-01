package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzehe {
    private final zzbzn zza;

    public zzehe(zzbzn zzbznVar) {
        this.zza = zzbznVar;
    }

    public final void zza() {
        q5.i iVarZza = this.zza.zza();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziL)).booleanValue()) {
            zzcel.zzb(iVarZza, "persistFlags");
        } else {
            zzcel.zza(iVarZza, "persistFlags");
        }
    }
}
