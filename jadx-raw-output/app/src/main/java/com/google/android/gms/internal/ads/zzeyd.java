package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzeyd implements zzikg {
    private final zzikp zza;

    private zzeyd(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar2;
    }

    public static zzeyd zzc(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzeyd(zzikpVar, zzikpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzeyb zzb() {
        return new zzeyb(zzfmk.zzc(), ((zzdaw) this.zza).zza());
    }
}
