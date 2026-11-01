package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzexr implements zzikg {
    private final zzikp zza;

    private zzexr(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
    }

    public static zzexr zzc(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzexr(zzikpVar, zzikpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzexq zzb() {
        return new zzexq(((zzcmj) this.zza).zza(), zzfmk.zzc());
    }
}
