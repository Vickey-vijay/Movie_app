package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
public final class zzczi implements zzikg {
    private final zzikp zza;

    private zzczi(zzcys zzcysVar, zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzczi zza(zzcys zzcysVar, zzikp zzikpVar) {
        return new zzczi(zzcysVar, zzikpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdje((zzdab) this.zza.zzb(), zzcei.zzg);
    }
}
