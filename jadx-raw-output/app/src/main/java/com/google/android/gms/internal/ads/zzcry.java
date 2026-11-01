package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
public final class zzcry implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzcry(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
    }

    public static zzcry zza(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzcry(zzikpVar, zzikpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzcrx(((zzcww) this.zza).zza(), ((zzcnd) this.zzb).zzb());
    }
}
