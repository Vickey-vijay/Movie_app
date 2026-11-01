package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzcmu implements zzikg {
    private final zzikp zza;

    private zzcmu(zzcmc zzcmcVar, zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzcmu zza(zzcmc zzcmcVar, zzikp zzikpVar) {
        return new zzcmu(zzcmcVar, zzikpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzeml((zzdvp) this.zza.zzb());
    }
}
