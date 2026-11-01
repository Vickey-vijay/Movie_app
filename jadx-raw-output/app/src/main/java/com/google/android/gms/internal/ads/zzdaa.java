package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdaa implements zzikg {
    private final zzikp zza;

    private zzdaa(zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzdaa zza(zzikp zzikpVar) {
        return new zzdaa(zzikpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzczz(((zzcwz) this.zza).zza());
    }
}
