package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
final class zzcoo implements zzege {
    private final zzeek zza;
    private final zzcnp zzb;

    public zzcoo(zzcnp zzcnpVar, zzcom zzcomVar, zzeek zzeekVar) {
        this.zzb = zzcnpVar;
        this.zza = zzeekVar;
    }

    @Override // com.google.android.gms.internal.ads.zzege
    public final zzeel zza() {
        zzcnp zzcnpVar = this.zzb;
        return zzeem.zza(zzcmj.zzd(zzcnpVar.zzI()), zzcna.zzd(zzcnpVar.zzI()), this.zza, zzbyy.zza());
    }
}
