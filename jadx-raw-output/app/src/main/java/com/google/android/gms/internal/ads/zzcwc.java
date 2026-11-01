package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
public final class zzcwc implements zzikg {
    private final zzikp zza;

    private zzcwc(zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzcwc zza(zzikp zzikpVar) {
        return new zzcwc(zzikpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzcwb(((zzcus) this.zza).zzb());
    }
}
