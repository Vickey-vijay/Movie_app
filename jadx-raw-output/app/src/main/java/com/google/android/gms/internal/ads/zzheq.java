package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
final class zzheq {
    public static final /* synthetic */ int zza = 0;
    private static final zzhye zzb;
    private static final zzhkn zzc;
    private static final zzhkk zzd;
    private static final zzhji zze;
    private static final zzhjf zzf;

    static {
        zzhye zzhyeVarZza = zzhln.zza("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        zzb = zzhyeVarZza;
        zzc = zzhkn.zzd(new zzhkm() { // from class: com.google.android.gms.internal.ads.zzhep
            @Override // com.google.android.gms.internal.ads.zzhkm
            public final /* synthetic */ zzhlg zza(zzhbp zzhbpVar) {
                return zzheq.zzb((zzhel) zzhbpVar);
            }
        }, zzhel.class, zzhlc.class);
        zzd = zzhkk.zzd(new zzhkj() { // from class: com.google.android.gms.internal.ads.zzhem
            @Override // com.google.android.gms.internal.ads.zzhkj
            public final /* synthetic */ zzhbp zza(zzhlg zzhlgVar) {
                return zzheq.zzc((zzhlc) zzhlgVar);
            }
        }, zzhyeVarZza, zzhlc.class);
        zze = zzhji.zzd(new zzhjh() { // from class: com.google.android.gms.internal.ads.zzhen
            @Override // com.google.android.gms.internal.ads.zzhjh
            public final /* synthetic */ zzhlg zza(zzhaz zzhazVar, zzhbt zzhbtVar) {
                return zzheq.zzd((zzhej) zzhazVar, zzhbtVar);
            }
        }, zzhej.class, zzhlb.class);
        zzf = zzhjf.zzd(new zzhje() { // from class: com.google.android.gms.internal.ads.zzheo
            @Override // com.google.android.gms.internal.ads.zzhje
            public final /* synthetic */ zzhaz zza(zzhlg zzhlgVar, zzhbt zzhbtVar) {
                return zzheq.zze((zzhlb) zzhlgVar, zzhbtVar);
            }
        }, zzhyeVarZza, zzhlb.class);
    }

    public static void zza(zzhkg zzhkgVar) throws GeneralSecurityException {
        zzhkgVar.zzd(zzc);
        zzhkgVar.zze(zzd);
        zzhkgVar.zzb(zze);
        zzhkgVar.zzc(zzf);
    }

    private static zzhqy zzf(zzhek zzhekVar) throws GeneralSecurityException {
        if (zzhek.zza.equals(zzhekVar)) {
            return zzhqy.TINK;
        }
        if (zzhek.zzb.equals(zzhekVar)) {
            return zzhqy.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzhekVar.toString()));
    }

    public static /* synthetic */ zzhlc zzb(zzhel zzhelVar) {
        zzhqe zzhqeVarZze = zzhqf.zze();
        zzhqeVarZze.zza("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        zzhqs zzhqsVarZzc = zzhqt.zzc();
        zzhqsVarZzc.zza(zzhelVar.zzc());
        zzhqeVarZze.zzb(((zzhqt) zzhqsVarZzc.zzbu()).zzaM());
        zzhqeVarZze.zzc(zzf(zzhelVar.zzd()));
        return zzhlc.zza((zzhqf) zzhqeVarZze.zzbu());
    }

    public static /* synthetic */ zzhel zzc(zzhlc zzhlcVar) throws GeneralSecurityException {
        if (zzhlcVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            try {
                return zzhel.zzb(zzhqt.zzb(zzhlcVar.zzc().zzb(), zzibb.zza()).zza(), zzg(zzhlcVar.zzc().zzc()));
            } catch (zzicg e10) {
                throw new GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: ".concat(String.valueOf(zzhlcVar.zzc().zza())));
    }

    public static /* synthetic */ zzhlb zzd(zzhej zzhejVar, zzhbt zzhbtVar) {
        zzhqq zzhqqVarZzd = zzhqr.zzd();
        zzhqs zzhqsVarZzc = zzhqt.zzc();
        zzhqsVarZzc.zza(zzhejVar.zze().zzc());
        zzhqqVarZzd.zza((zzhqt) zzhqsVarZzc.zzbu());
        return zzhlb.zza("type.googleapis.com/google.crypto.tink.KmsAeadKey", ((zzhqr) zzhqqVarZzd.zzbu()).zzaM(), zzhqb.REMOTE, zzf(zzhejVar.zze().zzd()), zzhejVar.zzb());
    }

    public static /* synthetic */ zzhej zze(zzhlb zzhlbVar, zzhbt zzhbtVar) throws GeneralSecurityException {
        if (zzhlbVar.zzg().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            try {
                zzhqr zzhqrVarZzc = zzhqr.zzc(zzhlbVar.zzb(), zzibb.zza());
                if (zzhqrVarZzc.zza() == 0) {
                    return zzhej.zzd(zzhel.zzb(zzhqrVarZzc.zzb().zza(), zzg(zzhlbVar.zzd())), zzhlbVar.zze());
                }
                String strValueOf = String.valueOf(zzhqrVarZzc);
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 49);
                sb2.append("KmsAeadKey are only accepted with version 0, got ");
                sb2.append(strValueOf);
                throw new GeneralSecurityException(sb2.toString());
            } catch (zzicg e10) {
                throw new GeneralSecurityException("Parsing KmsAeadKey failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
    }

    private static zzhek zzg(zzhqy zzhqyVar) throws GeneralSecurityException {
        int iOrdinal = zzhqyVar.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal == 3) {
                return zzhek.zzb;
            }
            int iZza = zzhqyVar.zza();
            StringBuilder sb2 = new StringBuilder(String.valueOf(iZza).length() + 34);
            sb2.append("Unable to parse OutputPrefixType: ");
            sb2.append(iZza);
            throw new GeneralSecurityException(sb2.toString());
        }
        return zzhek.zza;
    }
}
