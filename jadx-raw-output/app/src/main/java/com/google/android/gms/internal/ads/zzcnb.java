package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzcnb implements zzikg {
    private final zzcmc zza;

    private zzcnb(zzcmc zzcmcVar) {
        this.zza = zzcmcVar;
    }

    public static zzcnb zza(zzcmc zzcmcVar) {
        return new zzcnb(zzcmcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        return Long.valueOf(this.zza.zzi());
    }
}
