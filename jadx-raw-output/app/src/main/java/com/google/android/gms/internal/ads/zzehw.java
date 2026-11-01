package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzehw implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzehw(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
    }

    public static zzehw zzc(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzehw(zzikpVar, zzikpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzehv zzb() {
        return new zzehv(((zzeho) this.zza).zzb(), ((zzcmd) this.zzb).zzb());
    }
}
