package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzfdi implements zzikg {
    private final zzfdc zza;

    private zzfdi(zzfdc zzfdcVar) {
        this.zza = zzfdcVar;
    }

    public static zzfdi zzc(zzfdc zzfdcVar) {
        return new zzfdi(zzfdcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final Integer zzb() {
        return Integer.valueOf(this.zza.zzi());
    }

    public static int zzd(zzfdc zzfdcVar) {
        return zzfdcVar.zzi();
    }
}
