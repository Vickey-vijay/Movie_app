package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdni implements zzikg {
    private final zzdnd zza;

    private zzdni(zzdnd zzdndVar) {
        this.zza = zzdndVar;
    }

    public static zzdni zzc(zzdnd zzdndVar) {
        return new zzdni(zzdndVar);
    }

    public final zzdtk zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }

    public static zzdtk zzd(zzdnd zzdndVar) {
        zzdtk zzdtkVarZzd = zzdndVar.zzd();
        zziko.zzb(zzdtkVarZzd);
        return zzdtkVarZzd;
    }
}
