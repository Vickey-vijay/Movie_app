package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzebl implements zzikg {
    private final zzikp zza;

    private zzebl(zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzebl zza(zzikp zzikpVar) {
        return new zzebl(zzikpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzeci(((zzcmj) this.zza).zza());
    }
}
