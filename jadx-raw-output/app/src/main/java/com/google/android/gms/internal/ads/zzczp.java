package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
public final class zzczp implements zzikg {
    private final zzikp zza;

    private zzczp(zzczm zzczmVar, zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzczp zza(zzczm zzczmVar, zzikp zzikpVar) {
        return new zzczp(zzczmVar, zzikpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdje((zzczk) this.zza.zzb(), zzcei.zzg);
    }
}
