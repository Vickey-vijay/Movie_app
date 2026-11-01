package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhnc {
    public static final /* synthetic */ int zza = 0;
    private static final zzhye zzb;
    private static final zzhkn zzc;
    private static final zzhkk zzd;
    private static final zzhji zze;
    private static final zzhjf zzf;

    static {
        zzhye zzhyeVarZza = zzhln.zza("type.googleapis.com/google.crypto.tink.AesCmacKey");
        zzb = zzhyeVarZza;
        zzc = zzhkn.zzd(new zzhkm() { // from class: com.google.android.gms.internal.ads.zzhnb
            @Override // com.google.android.gms.internal.ads.zzhkm
            public final /* synthetic */ zzhlg zza(zzhbp zzhbpVar) {
                return zzhnc.zzb((zzhlw) zzhbpVar);
            }
        }, zzhlw.class, zzhlc.class);
        zzd = zzhkk.zzd(new zzhkj() { // from class: com.google.android.gms.internal.ads.zzhmy
            @Override // com.google.android.gms.internal.ads.zzhkj
            public final /* synthetic */ zzhbp zza(zzhlg zzhlgVar) {
                return zzhnc.zzc((zzhlc) zzhlgVar);
            }
        }, zzhyeVarZza, zzhlc.class);
        zze = zzhji.zzd(new zzhjh() { // from class: com.google.android.gms.internal.ads.zzhmz
            @Override // com.google.android.gms.internal.ads.zzhjh
            public final /* synthetic */ zzhlg zza(zzhaz zzhazVar, zzhbt zzhbtVar) {
                return zzhnc.zzd((zzhlp) zzhazVar, zzhbtVar);
            }
        }, zzhlp.class, zzhlb.class);
        zzf = zzhjf.zzd(new zzhje() { // from class: com.google.android.gms.internal.ads.zzhna
            @Override // com.google.android.gms.internal.ads.zzhje
            public final /* synthetic */ zzhaz zza(zzhlg zzhlgVar, zzhbt zzhbtVar) {
                return zzhnc.zze((zzhlb) zzhlgVar, zzhbtVar);
            }
        }, zzhyeVarZza, zzhlb.class);
    }

    public static void zza(zzhkg zzhkgVar) throws GeneralSecurityException {
        zzhkgVar.zzd(zzc);
        zzhkgVar.zze(zzd);
        zzhkgVar.zzb(zze);
        zzhkgVar.zzc(zzf);
    }

    private static zzhqy zzf(zzhlv zzhlvVar) throws GeneralSecurityException {
        if (zzhlv.zza.equals(zzhlvVar)) {
            return zzhqy.TINK;
        }
        if (zzhlv.zzb.equals(zzhlvVar)) {
            return zzhqy.CRUNCHY;
        }
        if (zzhlv.zzd.equals(zzhlvVar)) {
            return zzhqy.RAW;
        }
        if (zzhlv.zzc.equals(zzhlvVar)) {
            return zzhqy.LEGACY;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzhlvVar)));
    }

    public static /* synthetic */ zzhlc zzb(zzhlw zzhlwVar) {
        zzhqe zzhqeVarZze = zzhqf.zze();
        zzhqeVarZze.zza("type.googleapis.com/google.crypto.tink.AesCmacKey");
        zzhnx zzhnxVarZzd = zzhny.zzd();
        zzhnxVarZzd.zzb(zzh(zzhlwVar));
        zzhnxVarZzd.zza(zzhlwVar.zzc());
        zzhqeVarZze.zzb(((zzhny) zzhnxVarZzd.zzbu()).zzaM());
        zzhqeVarZze.zzc(zzf(zzhlwVar.zzf()));
        return zzhlc.zza((zzhqf) zzhqeVarZze.zzbu());
    }

    public static /* synthetic */ zzhlw zzc(zzhlc zzhlcVar) throws GeneralSecurityException {
        if (zzhlcVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            try {
                zzhny zzhnyVarZzc = zzhny.zzc(zzhlcVar.zzc().zzb(), zzibb.zza());
                zzhlu zzhluVarZzb = zzhlw.zzb();
                zzhluVarZzb.zza(zzhnyVarZzc.zza());
                zzhluVarZzb.zzb(zzhnyVarZzc.zzb().zza());
                zzhluVarZzb.zzc(zzg(zzhlcVar.zzc().zzc()));
                return zzhluVarZzb.zzd();
            } catch (zzicg e10) {
                throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: ".concat(String.valueOf(zzhlcVar.zzc().zza())));
    }

    public static /* synthetic */ zzhlb zzd(zzhlp zzhlpVar, zzhbt zzhbtVar) {
        zzhnv zzhnvVarZze = zzhnw.zze();
        zzhnvVarZze.zzb(zzh(zzhlpVar.zzf()));
        byte[] bArrZzc = zzhlpVar.zzd().zzc(zzhbtVar);
        zzhnvVarZze.zza(zzian.zzs(bArrZzc, 0, bArrZzc.length));
        return zzhlb.zza("type.googleapis.com/google.crypto.tink.AesCmacKey", ((zzhnw) zzhnvVarZze.zzbu()).zzaM(), zzhqb.SYMMETRIC, zzf(zzhlpVar.zzf().zzf()), zzhlpVar.zzb());
    }

    public static /* synthetic */ zzhlp zze(zzhlb zzhlbVar, zzhbt zzhbtVar) throws GeneralSecurityException {
        if (zzhlbVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            try {
                zzhnw zzhnwVarZzd = zzhnw.zzd(zzhlbVar.zzb(), zzibb.zza());
                if (zzhnwVarZzd.zza() == 0) {
                    zzhlu zzhluVarZzb = zzhlw.zzb();
                    zzhluVarZzb.zza(zzhnwVarZzd.zzb().zzc());
                    zzhluVarZzb.zzb(zzhnwVarZzd.zzc().zza());
                    zzhluVarZzb.zzc(zzg(zzhlbVar.zzd()));
                    zzhlw zzhlwVarZzd = zzhluVarZzb.zzd();
                    zzhlo zzhloVarZzc = zzhlp.zzc();
                    zzhloVarZzc.zza(zzhlwVarZzd);
                    zzhloVarZzc.zzb(zzhyg.zza(zzhnwVarZzd.zzb().zzy(), zzhbtVar));
                    zzhloVarZzc.zzc(zzhlbVar.zze());
                    return zzhloVarZzc.zzd();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzicg | IllegalArgumentException unused) {
                throw new GeneralSecurityException("Parsing AesCmacKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
    }

    private static zzhlv zzg(zzhqy zzhqyVar) throws GeneralSecurityException {
        int iOrdinal = zzhqyVar.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    if (iOrdinal == 4) {
                        return zzhlv.zzb;
                    }
                    int iZza = zzhqyVar.zza();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(iZza).length() + 34);
                    sb2.append("Unable to parse OutputPrefixType: ");
                    sb2.append(iZza);
                    throw new GeneralSecurityException(sb2.toString());
                }
                return zzhlv.zzd;
            }
            return zzhlv.zzc;
        }
        return zzhlv.zza;
    }

    private static zzhoa zzh(zzhlw zzhlwVar) {
        zzhnz zzhnzVarZzb = zzhoa.zzb();
        zzhnzVarZzb.zza(zzhlwVar.zzd());
        return (zzhoa) zzhnzVarZzb.zzbu();
    }
}
