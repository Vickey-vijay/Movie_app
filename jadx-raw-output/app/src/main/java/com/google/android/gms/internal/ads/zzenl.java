package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzenl extends zzeng {
    private final zzcma zza;
    private final zzdan zzb;
    private final zzepw zzc;
    private final zzdhf zzd;
    private final zzenr zze;
    private final zzekl zzf;

    public zzenl(zzcma zzcmaVar, zzdan zzdanVar, zzepw zzepwVar, zzdhf zzdhfVar, zzenr zzenrVar, zzekl zzeklVar) {
        this.zza = zzcmaVar;
        this.zzb = zzdanVar;
        this.zzc = zzepwVar;
        this.zzd = zzdhfVar;
        this.zze = zzenrVar;
        this.zzf = zzeklVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeng
    public final q5.i zzc(zzfjk zzfjkVar, Bundle bundle, zzfir zzfirVar, zzfjc zzfjcVar) {
        zzdan zzdanVar = this.zzb;
        zzdanVar.zzb(zzfjkVar);
        zzdanVar.zzc(bundle);
        zzdanVar.zzd(new zzdag(zzfjcVar, zzfirVar, this.zze));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzev)).booleanValue()) {
            zzdanVar.zzg(this.zzf);
        }
        zzdlt zzdltVarZzm = this.zza.zzm();
        zzdltVarZzm.zze(zzdanVar.zze());
        zzdltVarZzm.zzf(this.zzd);
        zzdltVarZzm.zzd(this.zzc);
        zzcxj zzcxjVarZzb = zzdltVarZzm.zzh().zzb();
        return zzcxjVarZzb.zzc(zzcxjVarZzb.zzb());
    }
}
