package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdaw implements zzikg {
    private final zzdao zza;

    private zzdaw(zzdao zzdaoVar) {
        this.zza = zzdaoVar;
    }

    public static zzdaw zzc(zzdao zzdaoVar) {
        return new zzdaw(zzdaoVar);
    }

    public final zzfjk zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }

    public static zzfjk zzd(zzdao zzdaoVar) {
        zzfjk zzfjkVarZzb = zzdaoVar.zzb();
        zziko.zzb(zzfjkVarZzb);
        return zzfjkVarZzb;
    }
}
