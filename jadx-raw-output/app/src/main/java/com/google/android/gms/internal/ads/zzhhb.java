package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
public final class zzhhb {
    public static final /* synthetic */ int zza = 0;
    private static final zzhye zzb;
    private static final zzhkn zzc;
    private static final zzhkk zzd;
    private static final zzhji zze;
    private static final zzhjf zzf;

    static {
        zzhye zzhyeVarZza = zzhln.zza("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        zzb = zzhyeVarZza;
        zzc = zzhkn.zzd(new zzhkm() { // from class: com.google.android.gms.internal.ads.zzhha
            @Override // com.google.android.gms.internal.ads.zzhkm
            public final /* synthetic */ zzhlg zza(zzhbp zzhbpVar) {
                return zzhhb.zzb((zzheb) zzhbpVar);
            }
        }, zzheb.class, zzhlc.class);
        zzd = zzhkk.zzd(new zzhkj() { // from class: com.google.android.gms.internal.ads.zzhgx
            @Override // com.google.android.gms.internal.ads.zzhkj
            public final /* synthetic */ zzhbp zza(zzhlg zzhlgVar) {
                return zzhhb.zzc((zzhlc) zzhlgVar);
            }
        }, zzhyeVarZza, zzhlc.class);
        zze = zzhji.zzd(new zzhjh() { // from class: com.google.android.gms.internal.ads.zzhgy
            @Override // com.google.android.gms.internal.ads.zzhjh
            public final /* synthetic */ zzhlg zza(zzhaz zzhazVar, zzhbt zzhbtVar) {
                return zzhhb.zzd((zzhdw) zzhazVar, zzhbtVar);
            }
        }, zzhdw.class, zzhlb.class);
        zzf = zzhjf.zzd(new zzhje() { // from class: com.google.android.gms.internal.ads.zzhgz
            @Override // com.google.android.gms.internal.ads.zzhje
            public final /* synthetic */ zzhaz zza(zzhlg zzhlgVar, zzhbt zzhbtVar) {
                return zzhhb.zze((zzhlb) zzhlgVar, zzhbtVar);
            }
        }, zzhyeVarZza, zzhlb.class);
    }

    public static void zza(zzhkg zzhkgVar) throws GeneralSecurityException {
        zzhkgVar.zzd(zzc);
        zzhkgVar.zze(zzd);
        zzhkgVar.zzb(zze);
        zzhkgVar.zzc(zzf);
    }

    private static zzhqy zzf(zzhea zzheaVar) throws GeneralSecurityException {
        if (zzhea.zza.equals(zzheaVar)) {
            return zzhqy.TINK;
        }
        if (zzhea.zzb.equals(zzheaVar)) {
            return zzhqy.CRUNCHY;
        }
        if (zzhea.zzc.equals(zzheaVar)) {
            return zzhqy.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzheaVar.toString()));
    }

    public static /* synthetic */ zzhlc zzb(zzheb zzhebVar) {
        zzhqe zzhqeVarZze = zzhqf.zze();
        zzhqeVarZze.zza("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        zzhqeVarZze.zzb(zzhpc.zzb().zzaM());
        zzhqeVarZze.zzc(zzf(zzhebVar.zzc()));
        return zzhlc.zza((zzhqf) zzhqeVarZze.zzbu());
    }

    public static /* synthetic */ zzheb zzc(zzhlc zzhlcVar) throws GeneralSecurityException {
        if (zzhlcVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            try {
                zzhpc.zza(zzhlcVar.zzc().zzb(), zzibb.zza());
                return zzheb.zzb(zzg(zzhlcVar.zzc().zzc()));
            } catch (zzicg e10) {
                throw new GeneralSecurityException("Parsing ChaCha20Poly1305Parameters failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(zzhlcVar.zzc().zza())));
    }

    public static /* synthetic */ zzhlb zzd(zzhdw zzhdwVar, zzhbt zzhbtVar) {
        zzhoz zzhozVarZzd = zzhpa.zzd();
        byte[] bArrZzc = zzhdwVar.zze().zzc(zzhbtVar);
        zzhozVarZzd.zza(zzian.zzs(bArrZzc, 0, bArrZzc.length));
        return zzhlb.zza("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", ((zzhpa) zzhozVarZzd.zzbu()).zzaM(), zzhqb.SYMMETRIC, zzf(zzhdwVar.zzf().zzc()), zzhdwVar.zzb());
    }

    public static /* synthetic */ zzhdw zze(zzhlb zzhlbVar, zzhbt zzhbtVar) throws GeneralSecurityException {
        if (zzhlbVar.zzg().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            try {
                zzhpa zzhpaVarZzc = zzhpa.zzc(zzhlbVar.zzb(), zzibb.zza());
                if (zzhpaVarZzc.zza() == 0) {
                    return zzhdw.zzd(zzg(zzhlbVar.zzd()), zzhyg.zza(zzhpaVarZzc.zzb().zzy(), zzhbtVar), zzhlbVar.zze());
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzicg unused) {
                throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseKey");
    }

    private static zzhea zzg(zzhqy zzhqyVar) throws GeneralSecurityException {
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
                    return zzhea.zzc;
                }
            }
            return zzhea.zzb;
        }
        return zzhea.zza;
    }
}
