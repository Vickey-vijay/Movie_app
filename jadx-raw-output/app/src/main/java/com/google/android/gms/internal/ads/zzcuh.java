package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
public final class zzcuh implements zzikg {
    private final zzcue zza;

    private zzcuh(zzcue zzcueVar) {
        this.zza = zzcueVar;
    }

    public static zzcuh zzc(zzcue zzcueVar) {
        return new zzcuh(zzcueVar);
    }

    public final zzfis zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }

    public static zzfis zzd(zzcue zzcueVar) {
        zzfis zzfisVarZzd = zzcueVar.zzd();
        zziko.zzb(zzfisVarZzd);
        return zzfisVarZzd;
    }
}
