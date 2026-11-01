package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzeva implements zzikg {
    private final zzikp zza;

    private zzeva(zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzeva zzc(zzikp zzikpVar) {
        return new zzeva(zzikpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzeuy zzb() {
        return new zzeuy(((zzdaw) this.zza).zza());
    }
}
