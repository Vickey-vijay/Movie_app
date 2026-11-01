package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdqm implements zzikg {
    private final zzikp zza;

    private zzdqm(zzdql zzdqlVar, zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzdqm zza(zzdql zzdqlVar, zzikp zzikpVar) {
        return new zzdqm(zzdqlVar, zzikpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzdqj zzdqjVar = (zzdqj) this.zza.zzb();
        zziko.zzb(zzdqjVar);
        return zzdqjVar;
    }
}
