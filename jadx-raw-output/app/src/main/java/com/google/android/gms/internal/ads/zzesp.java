package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzesp implements zzikg {
    private final zzikp zza;

    private zzesp(zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzesp zzc(zzikp zzikpVar) {
        return new zzesp(zzikpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzesn zzb() {
        return new zzesn(((zzcmj) this.zza).zza());
    }
}
