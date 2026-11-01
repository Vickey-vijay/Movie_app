package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzeet implements zzikg {
    private final zzikp zza;

    private zzeet(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
    }

    public static zzeet zzc(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzeet(zzikpVar, zzikpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzees zzb() {
        return new zzees(((zzcmj) this.zza).zza(), zzfmk.zzc());
    }
}
