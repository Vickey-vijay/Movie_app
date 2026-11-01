package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzfdf implements zzikg {
    private final zzfdc zza;

    private zzfdf(zzfdc zzfdcVar) {
        this.zza = zzfdcVar;
    }

    public static zzfdf zzc(zzfdc zzfdcVar) {
        return new zzfdf(zzfdcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final Boolean zzb() {
        return Boolean.valueOf(this.zza.zzh());
    }

    public static boolean zzd(zzfdc zzfdcVar) {
        return zzfdcVar.zzh();
    }
}
