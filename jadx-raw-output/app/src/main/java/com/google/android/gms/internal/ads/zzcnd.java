package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzcnd implements zzikg {
    private final zzikp zza;

    private zzcnd(zzcmc zzcmcVar, zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzcnd zzc(zzcmc zzcmcVar, zzikp zzikpVar) {
        return new zzcnd(zzcmcVar, zzikpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzcdz zzb() {
        return ((zzcdu) this.zza.zzb()).zzr();
    }
}
