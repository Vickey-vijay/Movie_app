package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdvg implements zzikg {
    private final zzikp zza;

    private zzdvg(zzdvf zzdvfVar, zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzdvg zza(zzdvf zzdvfVar, zzikp zzikpVar) {
        return new zzdvg(zzdvfVar, zzikpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdje(((zzdve) this.zza).zzb(), zzcei.zzf);
    }
}
