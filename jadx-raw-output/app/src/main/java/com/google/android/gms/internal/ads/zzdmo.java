package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdmo implements zzikg {
    private final zzdml zza;

    private zzdmo(zzdml zzdmlVar) {
        this.zza = zzdmlVar;
    }

    public static zzdmo zzc(zzdml zzdmlVar) {
        return new zzdmo(zzdmlVar);
    }

    public final zzdor zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }

    public static zzdor zzd(zzdml zzdmlVar) {
        zzdor zzdorVarZza = zzdmlVar.zza();
        zziko.zzb(zzdorVarZza);
        return zzdorVarZza;
    }
}
