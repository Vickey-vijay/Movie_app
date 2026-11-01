package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
public final class zzcuj implements zzikg {
    private final zzikp zza;

    private zzcuj(zzcue zzcueVar, zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzcuj zza(zzcue zzcueVar, zzikp zzikpVar) {
        return new zzcuj(zzcueVar, zzikpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        return zzgup.zzi(new zzdje((zzcvu) this.zza.zzb(), zzcei.zzg));
    }
}
