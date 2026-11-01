package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdnq implements zzikg {
    private final zzikp zza;

    private zzdnq(zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzdnq zzc(zzikp zzikpVar) {
        return new zzdnq(zzikpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdnp zzb() {
        return new zzdnp(((zzdoz) this.zza).zza());
    }
}
