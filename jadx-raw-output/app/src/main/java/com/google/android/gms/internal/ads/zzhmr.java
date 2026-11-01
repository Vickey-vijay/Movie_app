package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhmr implements zzhla {
    private static final zzhmr zza = new zzhmr();
    private static final zzhku zzb = zzhku.zzd(new zzhkt() { // from class: com.google.android.gms.internal.ads.zzhmo
        @Override // com.google.android.gms.internal.ads.zzhkt
        public final /* synthetic */ Object zza(zzhaz zzhazVar) {
            return zzhnm.zza((zzhjo) zzhazVar);
        }
    }, zzhjo.class, zzhbo.class);

    @Override // com.google.android.gms.internal.ads.zzhla
    public final Class zza() {
        return zzhbo.class;
    }

    @Override // com.google.android.gms.internal.ads.zzhla
    public final Class zzb() {
        return zzhbo.class;
    }

    @Override // com.google.android.gms.internal.ads.zzhla
    public final /* bridge */ /* synthetic */ Object zze(zzhjj zzhjjVar, zzhjr zzhjrVar, zzhkz zzhkzVar) throws GeneralSecurityException {
        zzhjs zzhjsVar;
        zzhjs zzhjsVarZza;
        zzhye zzhyeVarZzd;
        zzhkp zzhkpVar = new zzhkp();
        for (int i10 = 0; i10 < zzhjjVar.zzd(); i10++) {
            zzhbi zzhbiVarZze = ((zzhbk) zzhjjVar).zze(i10);
            if (zzhbiVarZze.zzb().equals(zzhbb.zza)) {
                zzhbo zzhboVar = (zzhbo) zzhkzVar.zza(zzhbiVarZze);
                zzhaz zzhazVarZza = zzhbiVarZze.zza();
                if (zzhazVarZza instanceof zzhmm) {
                    zzhyeVarZzd = ((zzhmm) zzhazVarZza).zze();
                } else {
                    if (!(zzhazVarZza instanceof zzhjo)) {
                        String name = zzhazVarZza.getClass().getName();
                        String strValueOf = String.valueOf(zzhazVarZza.zza());
                        StringBuilder sb2 = new StringBuilder(name.length() + 59 + strValueOf.length());
                        sb2.append("Cannot get output prefix for key of class ");
                        sb2.append(name);
                        sb2.append(" with parameters ");
                        sb2.append(strValueOf);
                        throw new GeneralSecurityException(sb2.toString());
                    }
                    zzhyeVarZzd = ((zzhjo) zzhazVarZza).zzd();
                }
                zzhkpVar.zza(zzhyeVarZzd, new zzhmp(zzhboVar, zzhbiVarZze.zzc()));
            }
        }
        if (zzhjrVar.zza()) {
            zzhjsVar = zzhjv.zza;
            zzhjsVarZza = zzhjsVar;
        } else {
            zzhjt zzhjtVarZzb = zzhkb.zza().zzb();
            zzhjs zzhjsVarZza2 = zzhjtVarZzb.zza(zzhjjVar, zzhjrVar, "mac", "compute");
            zzhjsVarZza = zzhjtVarZzb.zza(zzhjjVar, zzhjrVar, "mac", "verify");
            zzhjsVar = zzhjsVarZza2;
        }
        zzhbk zzhbkVar = (zzhbk) zzhjjVar;
        return new zzhmq(new zzhmp((zzhbo) zzhkzVar.zza(zzhbkVar.zzc()), zzhbkVar.zzc().zzc()), zzhkpVar.zzb(), zzhjsVar, zzhjsVarZza, null);
    }

    public static void zzc() throws GeneralSecurityException {
        zzhkd.zza().zzc(zza);
        zzhkd.zza().zzb(zzb);
    }
}
