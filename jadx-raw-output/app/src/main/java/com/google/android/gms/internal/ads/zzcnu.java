package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
final class zzcnu implements zzfdv {
    public final zzikp zza;
    public final zzikp zzb;
    public final zzikp zzc;
    public final zzikp zzd;
    public final zzikp zze;
    public final zzikp zzf;
    private final zzcnp zzg;

    @Override // com.google.android.gms.internal.ads.zzfdv
    public final zzfez zza() {
        return (zzfez) this.zzf.zzb();
    }

    public zzcnu(zzcnp zzcnpVar, Context context, String str) {
        this.zzg = zzcnpVar;
        zzikg zzikgVarZza = zzikh.zza(context);
        this.zza = zzikgVarZza;
        zzikg zzikgVarZza2 = zzikh.zza(str);
        this.zzb = zzikgVarZza2;
        zzikp zzikpVar = zzcnpVar.zzbw;
        zzfgl zzfglVarZzc = zzfgl.zzc(zzikgVarZza, zzikpVar, zzcnpVar.zzbx);
        this.zzc = zzfglVarZzc;
        zzikp zzikpVarZza = zzikf.zza(zzfes.zza(zzikpVar));
        this.zzd = zzikpVarZza;
        zzikp zzikpVar2 = zzcnpVar.zza;
        zzikp zzikpVar3 = zzcnpVar.zzab;
        zzfjm zzfjmVarZza = zzfjm.zza();
        zzikp zzikpVar4 = zzcnpVar.zzi;
        zzikp zzikpVarZza2 = zzikf.zza(zzfeu.zza(zzikgVarZza, zzikpVar2, zzikpVar3, zzfglVarZzc, zzikpVarZza, zzfjmVarZza, zzikpVar4));
        this.zze = zzikpVarZza2;
        this.zzf = zzikf.zza(zzffa.zza(zzikpVar3, zzikgVarZza, zzikgVarZza2, zzikpVarZza2, zzikpVarZza, zzikpVar4, zzcnpVar.zzl));
    }
}
