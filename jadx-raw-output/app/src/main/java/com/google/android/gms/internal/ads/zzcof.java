package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
final class zzcof implements zzdzr {
    public final zzikp zza;
    public final zzikp zzb;
    public final zzikp zzc;
    public final zzikp zzd;
    private final Context zze;
    private final zzbph zzf;
    private final zzcnp zzg;
    private final zzcof zzh = this;

    public final zzdzm zza() {
        return zzdzn.zzd(this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzdzr
    public final zzdzj zzc() {
        return new zzcoc(this.zzg, this.zzh, null);
    }

    public final /* synthetic */ Context zzd() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzdzr
    public final zzdzo zzb() {
        return (zzdzo) this.zzd.zzb();
    }

    public zzcof(zzcnp zzcnpVar, Context context, zzbph zzbphVar) {
        this.zzg = zzcnpVar;
        this.zze = context;
        this.zzf = zzbphVar;
        zzikg zzikgVarZza = zzikh.zza(this);
        this.zza = zzikgVarZza;
        zzikg zzikgVarZza2 = zzikh.zza(zzbphVar);
        this.zzb = zzikgVarZza2;
        zzdzn zzdznVarZzc = zzdzn.zzc(zzikgVarZza2);
        this.zzc = zzdznVarZzc;
        this.zzd = zzikf.zza(zzdzp.zza(zzikgVarZza, zzdznVarZzc));
    }
}
