package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdqr implements zzikg {
    private final zzikp zza;

    private zzdqr(zzdql zzdqlVar, zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzdqr zza(zzdql zzdqlVar, zzikp zzikpVar) {
        return new zzdqr(zzdqlVar, zzikpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        return zzgup.zzi(new zzdje((zzdqj) this.zza.zzb(), zzcei.zzg));
    }
}
