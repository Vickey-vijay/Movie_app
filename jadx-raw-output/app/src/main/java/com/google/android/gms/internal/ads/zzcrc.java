package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzcrc implements zzikg {
    private final zzikp zza;

    private zzcrc(zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzcrc zza(zzikp zzikpVar) {
        return new zzcrc(zzikpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzcrb(((zzcmj) this.zza).zza());
    }
}
