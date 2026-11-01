package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdzn implements zzikg {
    private final zzikp zza;

    private zzdzn(zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzdzn zzc(zzikp zzikpVar) {
        return new zzdzn(zzikpVar);
    }

    public static zzdzm zzd(zzbph zzbphVar) {
        return new zzdzm(zzbphVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdzm zzb() {
        return new zzdzm((zzbph) this.zza.zzb());
    }
}
