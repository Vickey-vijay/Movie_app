package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdox implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzdox(zzdos zzdosVar, zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
    }

    public static zzdox zzc(zzdos zzdosVar, zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzdox(zzdosVar, zzikpVar, zzikpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzccn zzb() {
        return new zzccn(((zzcmj) this.zza).zza(), ((zzdaw) this.zzb).zza().zzg);
    }
}
