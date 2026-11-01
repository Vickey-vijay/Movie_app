package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzeqe implements zzikg {
    private final zzikp zza;

    private zzeqe(zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzeqe zzc(zzikp zzikpVar) {
        return new zzeqe(zzikpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzeqd zzb() {
        return new zzeqd((zzdlu) this.zza.zzb());
    }
}
