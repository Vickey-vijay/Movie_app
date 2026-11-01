package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
public final class zzczn implements zzikg {
    private final zzikp zza;

    private zzczn(zzczm zzczmVar, zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzczn zza(zzczm zzczmVar, zzikp zzikpVar) {
        return new zzczn(zzczmVar, zzikpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdje((zzcyq) this.zza.zzb(), zzcei.zzg);
    }
}
