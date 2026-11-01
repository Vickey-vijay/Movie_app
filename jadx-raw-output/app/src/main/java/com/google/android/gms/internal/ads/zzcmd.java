package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzcmd implements zzikg {
    private final zzikp zza;

    private zzcmd(zzcmc zzcmcVar, zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzcmd zzc(zzcmc zzcmcVar, zzikp zzikpVar) {
        return new zzcmd(zzcmcVar, zzikpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.ads.internal.util.zzg zzb() {
        return ((zzcdu) this.zza.zzb()).zzo();
    }
}
