package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzeex implements zzikg {
    private final zzikp zza;

    private zzeex(zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzeex zzc(zzikp zzikpVar) {
        return new zzeex(zzikpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzeew zzb() {
        return new zzeew(((zzcmj) this.zza).zza());
    }
}
