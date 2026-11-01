package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzdlk implements zzikg {
    private final zzikp zza;

    private zzdlk(zzdkr zzdkrVar, zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
    }

    public static zzdlk zza(zzdkr zzdkrVar, zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzdlk(zzdkrVar, zzikpVar, zzikpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdje((zzdmh) this.zza.zzb(), zzfmk.zzc());
    }
}
