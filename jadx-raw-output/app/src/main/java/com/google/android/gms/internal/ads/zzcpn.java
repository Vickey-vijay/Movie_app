package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzcpn implements zzikg {
    private final zzikp zza;

    private zzcpn(zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzcpn zza(zzikp zzikpVar) {
        return new zzcpn(zzikpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzfvr(((zzcmj) this.zza).zza(), com.google.android.gms.ads.internal.zzt.zzs().zza());
    }
}
