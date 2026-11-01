package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
final class zzcoq implements zzfil {
    public final zzikp zza;
    public final zzikp zzb;
    public final zzikp zzc;
    public final zzikp zzd;
    public final zzikp zze;
    public final zzikp zzf;
    public final zzikp zzg;
    public final zzikp zzh;
    private final zzcnp zzi;

    @Override // com.google.android.gms.internal.ads.zzfil
    public final zzfio zza() {
        return (zzfio) this.zzf.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzfil
    public final zzfii zzb() {
        return (zzfii) this.zzh.zzb();
    }

    public zzcoq(zzcnp zzcnpVar, Context context, String str) {
        this.zzi = zzcnpVar;
        zzikg zzikgVarZza = zzikh.zza(context);
        this.zza = zzikgVarZza;
        zzikp zzikpVar = zzcnpVar.zzbw;
        zzfgm zzfgmVarZzc = zzfgm.zzc(zzikgVarZza, zzikpVar, zzcnpVar.zzbx);
        this.zzb = zzfgmVarZzc;
        zzikp zzikpVarZza = zzikf.zza(zzfhw.zza(zzikpVar));
        this.zzc = zzikpVarZza;
        zzikp zzikpVarZza2 = zzikf.zza(zzfji.zza());
        this.zzd = zzikpVarZza2;
        zzikp zzikpVarZza3 = zzikf.zza(zzfif.zza(zzikgVarZza, zzcnpVar.zza, zzcnpVar.zzab, zzfgmVarZzc, zzikpVarZza, zzfjm.zza(), zzikpVarZza2));
        this.zze = zzikpVarZza3;
        this.zzf = zzikf.zza(zzfip.zza(zzikpVarZza3, zzikpVarZza, zzikpVarZza2));
        zzikg zzikgVarZzc = zzikh.zzc(str);
        this.zzg = zzikgVarZzc;
        this.zzh = zzikf.zza(zzfij.zza(zzikgVarZzc, zzikpVarZza3, zzikgVarZza, zzikpVarZza, zzikpVarZza2, zzcnpVar.zzi, zzcnpVar.zzae, zzcnpVar.zzl));
    }
}
