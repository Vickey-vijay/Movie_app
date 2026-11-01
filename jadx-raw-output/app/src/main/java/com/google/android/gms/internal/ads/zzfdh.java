package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzfdh implements zzikg {
    private final zzfdc zza;

    private zzfdh(zzfdc zzfdcVar) {
        this.zza = zzfdcVar;
    }

    public static zzfdh zzc(zzfdc zzfdcVar) {
        return new zzfdh(zzfdcVar);
    }

    public final String zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }

    public static String zzd(zzfdc zzfdcVar) {
        String strZze = zzfdcVar.zze();
        zziko.zzb(strZze);
        return strZze;
    }
}
