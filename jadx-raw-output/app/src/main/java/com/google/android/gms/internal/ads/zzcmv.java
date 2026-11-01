package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzcmv implements zzikg {
    private final zzikp zza;

    private zzcmv(zzcmc zzcmcVar, zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzcmv zza(zzcmc zzcmcVar, zzikp zzikpVar) {
        return new zzcmv(zzcmcVar, zzikpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzeol((zzdvp) this.zza.zzb());
    }
}
