package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzdli implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzdli(zzdkr zzdkrVar, zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
    }

    public static zzdli zzc(zzdkr zzdkrVar, zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzdli(zzdkrVar, zzikpVar, zzikpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzccn zzb() {
        return new zzccn(((zzcmj) this.zza).zza(), ((zzdaw) this.zzb).zza().zzg);
    }
}
