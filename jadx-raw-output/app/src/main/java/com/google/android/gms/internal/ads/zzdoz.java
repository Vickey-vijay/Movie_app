package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdoz implements zzikg {
    private final zzdos zza;

    private zzdoz(zzdos zzdosVar) {
        this.zza = zzdosVar;
    }

    public static zzdoz zzc(zzdos zzdosVar) {
        return new zzdoz(zzdosVar);
    }

    public final zzdoh zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }

    public static zzdoh zzd(zzdos zzdosVar) {
        zzdoh zzdohVarZza = zzdosVar.zza();
        zziko.zzb(zzdohVarZza);
        return zzdohVarZza;
    }
}
