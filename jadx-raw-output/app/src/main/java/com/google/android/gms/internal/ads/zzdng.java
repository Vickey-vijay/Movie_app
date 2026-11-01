package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdng implements zzikg {
    private final zzikp zza;

    private zzdng(zzdnd zzdndVar, zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzdng zzc(zzdnd zzdndVar, zzikp zzikpVar) {
        return new zzdng(zzdndVar, zzikpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdom zzb() {
        zzdol zzdolVar = (zzdol) this.zza.zzb();
        zziko.zzb(zzdolVar);
        return zzdolVar;
    }
}
