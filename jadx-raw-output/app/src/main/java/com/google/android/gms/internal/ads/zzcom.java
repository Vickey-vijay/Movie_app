package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
final class zzcom implements zzefx {
    public final zzikp zza;
    public final zzikp zzb;
    private final zzcnp zzc;
    private final zzcom zzd = this;

    public zzcom(zzcnp zzcnpVar, Context context) {
        this.zzc = zzcnpVar;
        zzehf zzehfVarZzc = zzehf.zzc(zzcnpVar.zzaC);
        this.zza = zzehfVarZzc;
        this.zzb = zzegx.zza(zzcnpVar.zzf, zzfmk.zza(), zzcnj.zza, zzcnpVar.zzaB, zzehfVarZzc, zzcnpVar.zzaD, zzcng.zza, zzcnpVar.zzC);
    }

    @Override // com.google.android.gms.internal.ads.zzefx
    public final zzegd zzb() {
        return new zzcon(this.zzc, this.zzd, null);
    }

    @Override // com.google.android.gms.internal.ads.zzefx
    public final zzegb zza() {
        zzcnp zzcnpVar = this.zzc;
        zzikp zzikpVar = zzcnpVar.zzl;
        zzcmc zzcmcVarZzI = zzcnpVar.zzI();
        return zzegc.zza(zzcmj.zzd(zzcnpVar.zzI()), zzfmq.zzc(), zzfmk.zzc(), zzikf.zzc(this.zzb), zzcna.zzd(zzcmcVarZzI), this, (zzdxz) zzikpVar.zzb());
    }
}
