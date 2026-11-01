package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdau implements zzikg {
    private final zzdao zza;

    private zzdau(zzdao zzdaoVar) {
        this.zza = zzdaoVar;
    }

    public static zzdau zza(zzdao zzdaoVar) {
        return new zzdau(zzdaoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        return Integer.valueOf(this.zza.zzh());
    }
}
