package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdnm implements zzikg {
    private final zzikp zza;

    private zzdnm(zzdnd zzdndVar, zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzdnm zza(zzdnd zzdndVar, zzikp zzikpVar) {
        return new zzdnm(zzdndVar, zzikpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdje((zzdqh) this.zza.zzb(), zzcei.zza);
    }
}
