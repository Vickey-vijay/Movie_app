package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzhtu implements zzhla {
    private static final zzhtu zza = new zzhtu();
    private static final zzhku zzb = zzhku.zzd(new zzhkt() { // from class: com.google.android.gms.internal.ads.zzhtr
        @Override // com.google.android.gms.internal.ads.zzhkt
        public final /* synthetic */ Object zza(zzhaz zzhazVar) {
            return zzhvq.zzb((zzhjo) zzhazVar);
        }
    }, zzhjo.class, zzhbs.class);

    @Override // com.google.android.gms.internal.ads.zzhla
    public final Class zza() {
        return zzhbs.class;
    }

    @Override // com.google.android.gms.internal.ads.zzhla
    public final Class zzb() {
        return zzhbs.class;
    }

    @Override // com.google.android.gms.internal.ads.zzhla
    public final /* bridge */ /* synthetic */ Object zze(zzhjj zzhjjVar, zzhjr zzhjrVar, zzhkz zzhkzVar) throws GeneralSecurityException {
        zzhye zzhyeVarZzd;
        zzhkp zzhkpVar = new zzhkp();
        for (int i10 = 0; i10 < zzhjjVar.zzd(); i10++) {
            zzhbi zzhbiVarZze = ((zzhbk) zzhjjVar).zze(i10);
            if (zzhbiVarZze.zzb().equals(zzhbb.zza)) {
                zzhbs zzhbsVar = (zzhbs) zzhkzVar.zza(zzhbiVarZze);
                zzhaz zzhazVarZza = zzhbiVarZze.zza();
                if (zzhazVarZza instanceof zzhuw) {
                    zzhyeVarZzd = ((zzhuw) zzhazVarZza).zze();
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
                zzhkpVar.zza(zzhyeVarZzd, new zzhts(zzhbsVar, zzhbiVarZze.zzc()));
            }
        }
        return new zzhtt(zzhkpVar.zzb(), !zzhjrVar.zza() ? zzhkb.zza().zzb().zza(zzhjjVar, zzhjrVar, "public_key_verify", "verify") : zzhjv.zza);
    }

    public static void zzc() throws GeneralSecurityException {
        zzhkd.zza().zzc(zza);
        zzhkd.zza().zzb(zzb);
    }
}
