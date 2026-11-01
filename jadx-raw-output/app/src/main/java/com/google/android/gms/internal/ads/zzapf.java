package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzapf implements zzapn {
    private zzv zza;
    private zzfg zzb;
    private zzagh zzc;

    @Override // com.google.android.gms.internal.ads.zzapn
    public final void zza(zzfg zzfgVar, zzaex zzaexVar, zzaqb zzaqbVar) {
        this.zzb = zzfgVar;
        zzaqbVar.zza();
        zzagh zzaghVarZzu = zzaexVar.zzu(zzaqbVar.zzb(), 5);
        this.zzc = zzaghVarZzu;
        zzaghVarZzu.zzz(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzapn
    public final void zzb(zzer zzerVar) {
        zzfg zzfgVar = this.zzb;
        zzfgVar.getClass();
        String str = zzfj.zza;
        long jZzb = zzfgVar.zzb();
        long jZzc = this.zzb.zzc();
        if (jZzb == -9223372036854775807L || jZzc == -9223372036854775807L) {
            return;
        }
        zzv zzvVar = this.zza;
        if (jZzc != zzvVar.zzt) {
            zzt zztVarZza = zzvVar.zza();
            zztVarZza.zzr(jZzc);
            zzv zzvVarZzM = zztVarZza.zzM();
            this.zza = zzvVarZzM;
            this.zzc.zzz(zzvVarZzM);
        }
        int iZzd = zzerVar.zzd();
        this.zzc.zzc(zzerVar, iZzd);
        this.zzc.zze(jZzb, 1, iZzd, 0, null);
    }

    public zzapf(String str, String str2) {
        zzt zztVar = new zzt();
        zztVar.zzl("video/mp2t");
        zztVar.zzm(str);
        this.zza = zztVar.zzM();
    }
}
