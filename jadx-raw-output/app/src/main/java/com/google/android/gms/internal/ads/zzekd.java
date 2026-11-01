package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzekd implements zzikg {
    private final zzikp zza;

    private zzekd(zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzekd zza(zzikp zzikpVar) {
        return new zzekd(zzikpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzekc(((zzcmj) this.zza).zza());
    }
}
