package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
public final class zzhgh {
    public static final /* synthetic */ int zza = 0;
    private static final zzhye zzb;
    private static final zzhkn zzc;
    private static final zzhkk zzd;
    private static final zzhji zze;
    private static final zzhjf zzf;

    static {
        zzhye zzhyeVarZza = zzhln.zza("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zzb = zzhyeVarZza;
        zzc = zzhkn.zzd(new zzhkm() { // from class: com.google.android.gms.internal.ads.zzhgg
            @Override // com.google.android.gms.internal.ads.zzhkm
            public final /* synthetic */ zzhlg zza(zzhbp zzhbpVar) {
                return zzhgh.zzb((zzhdd) zzhbpVar);
            }
        }, zzhdd.class, zzhlc.class);
        zzd = zzhkk.zzd(new zzhkj() { // from class: com.google.android.gms.internal.ads.zzhgd
            @Override // com.google.android.gms.internal.ads.zzhkj
            public final /* synthetic */ zzhbp zza(zzhlg zzhlgVar) {
                return zzhgh.zzc((zzhlc) zzhlgVar);
            }
        }, zzhyeVarZza, zzhlc.class);
        zze = zzhji.zzd(new zzhjh() { // from class: com.google.android.gms.internal.ads.zzhge
            @Override // com.google.android.gms.internal.ads.zzhjh
            public final /* synthetic */ zzhlg zza(zzhaz zzhazVar, zzhbt zzhbtVar) {
                return zzhgh.zzd((zzhcx) zzhazVar, zzhbtVar);
            }
        }, zzhcx.class, zzhlb.class);
        zzf = zzhjf.zzd(new zzhje() { // from class: com.google.android.gms.internal.ads.zzhgf
            @Override // com.google.android.gms.internal.ads.zzhje
            public final /* synthetic */ zzhaz zza(zzhlg zzhlgVar, zzhbt zzhbtVar) {
                return zzhgh.zze((zzhlb) zzhlgVar, zzhbtVar);
            }
        }, zzhyeVarZza, zzhlb.class);
    }

    public static void zza(zzhkg zzhkgVar) throws GeneralSecurityException {
        zzhkgVar.zzd(zzc);
        zzhkgVar.zze(zzd);
        zzhkgVar.zzb(zze);
        zzhkgVar.zzc(zzf);
    }

    private static zzhqy zzf(zzhdc zzhdcVar) throws GeneralSecurityException {
        if (zzhdc.zza.equals(zzhdcVar)) {
            return zzhqy.TINK;
        }
        if (zzhdc.zzb.equals(zzhdcVar)) {
            return zzhqy.CRUNCHY;
        }
        if (zzhdc.zzc.equals(zzhdcVar)) {
            return zzhqy.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzhdcVar)));
    }

    public static /* synthetic */ zzhlc zzb(zzhdd zzhddVar) {
        zzhqe zzhqeVarZze = zzhqf.zze();
        zzhqeVarZze.zza("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zzhon zzhonVarZzd = zzhoo.zzd();
        zzhonVarZzd.zza(zzh(zzhddVar));
        zzhonVarZzd.zzb(zzhddVar.zzc());
        zzhqeVarZze.zzb(((zzhoo) zzhonVarZzd.zzbu()).zzaM());
        zzhqeVarZze.zzc(zzf(zzhddVar.zze()));
        return zzhlc.zza((zzhqf) zzhqeVarZze.zzbu());
    }

    public static /* synthetic */ zzhdd zzc(zzhlc zzhlcVar) throws GeneralSecurityException {
        if (zzhlcVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            try {
                zzhoo zzhooVarZzc = zzhoo.zzc(zzhlcVar.zzc().zzb(), zzibb.zza());
                zzhdb zzhdbVarZzb = zzhdd.zzb();
                zzhdbVarZzb.zza(zzhooVarZzc.zzb());
                zzhdbVarZzb.zzb(zzhooVarZzc.zza().zza());
                zzhdbVarZzb.zzc(16);
                zzhdbVarZzb.zzd(zzg(zzhlcVar.zzc().zzc()));
                return zzhdbVarZzb.zze();
            } catch (zzicg e10) {
                throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseParameters: ".concat(String.valueOf(zzhlcVar.zzc().zza())));
    }

    public static /* synthetic */ zzhlb zzd(zzhcx zzhcxVar, zzhbt zzhbtVar) {
        zzhol zzholVarZze = zzhom.zze();
        zzholVarZze.zza(zzh(zzhcxVar.zzf()));
        byte[] bArrZzc = zzhcxVar.zze().zzc(zzhbtVar);
        zzholVarZze.zzb(zzian.zzs(bArrZzc, 0, bArrZzc.length));
        return zzhlb.zza("type.googleapis.com/google.crypto.tink.AesEaxKey", ((zzhom) zzholVarZze.zzbu()).zzaM(), zzhqb.SYMMETRIC, zzf(zzhcxVar.zzf().zze()), zzhcxVar.zzb());
    }

    public static /* synthetic */ zzhcx zze(zzhlb zzhlbVar, zzhbt zzhbtVar) throws GeneralSecurityException {
        if (zzhlbVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            try {
                zzhom zzhomVarZzd = zzhom.zzd(zzhlbVar.zzb(), zzibb.zza());
                if (zzhomVarZzd.zza() == 0) {
                    zzhdb zzhdbVarZzb = zzhdd.zzb();
                    zzhdbVarZzb.zza(zzhomVarZzd.zzc().zzc());
                    zzhdbVarZzb.zzb(zzhomVarZzd.zzb().zza());
                    zzhdbVarZzb.zzc(16);
                    zzhdbVarZzb.zzd(zzg(zzhlbVar.zzd()));
                    zzhdd zzhddVarZze = zzhdbVarZzb.zze();
                    zzhcw zzhcwVarZzd = zzhcx.zzd();
                    zzhcwVarZzd.zza(zzhddVarZze);
                    zzhcwVarZzd.zzb(zzhyg.zza(zzhomVarZzd.zzc().zzy(), zzhbtVar));
                    zzhcwVarZzd.zzc(zzhlbVar.zze());
                    return zzhcwVarZzd.zzd();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzicg unused) {
                throw new GeneralSecurityException("Parsing AesEaxcKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
    }

    private static zzhdc zzg(zzhqy zzhqyVar) throws GeneralSecurityException {
        int iOrdinal = zzhqyVar.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        int iZza = zzhqyVar.zza();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(iZza).length() + 34);
                        sb2.append("Unable to parse OutputPrefixType: ");
                        sb2.append(iZza);
                        throw new GeneralSecurityException(sb2.toString());
                    }
                } else {
                    return zzhdc.zzc;
                }
            }
            return zzhdc.zzb;
        }
        return zzhdc.zza;
    }

    private static zzhoq zzh(zzhdd zzhddVar) throws GeneralSecurityException {
        zzhop zzhopVarZzb = zzhoq.zzb();
        zzhopVarZzb.zza(zzhddVar.zzd());
        return (zzhoq) zzhopVarZzb.zzbu();
    }
}
