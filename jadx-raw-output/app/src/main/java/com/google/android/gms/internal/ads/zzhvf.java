package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzhvf implements zzhbs {
    public static final zzhiu zza;
    public static final zzhiu zzb;
    public static final zzhiu zzc;
    public static final /* synthetic */ int zzd = 0;
    private static final byte[] zze = new byte[0];
    private static final byte[] zzf = {0};
    private final ECPublicKey zzg;
    private final String zzh;
    private final zzhwx zzi;
    private final byte[] zzj;
    private final byte[] zzk;
    private final Provider zzl;

    static {
        zzhit zzhitVarZza = zzhiu.zza();
        zzhitVarZza.zza(zzhxn.SHA256, zzhsd.zza);
        zzhitVarZza.zza(zzhxn.SHA384, zzhsd.zzb);
        zzhitVarZza.zza(zzhxn.SHA512, zzhsd.zzc);
        zza = zzhitVarZza.zzb();
        zzhit zzhitVarZza2 = zzhiu.zza();
        zzhitVarZza2.zza(zzhwx.IEEE_P1363, zzhse.zza);
        zzhitVarZza2.zza(zzhwx.DER, zzhse.zzb);
        zzb = zzhitVarZza2.zzb();
        zzhit zzhitVarZza3 = zzhiu.zza();
        zzhitVarZza3.zza(zzhww.NIST_P256, zzhsc.zza);
        zzhitVarZza3.zza(zzhww.NIST_P384, zzhsc.zzb);
        zzhitVarZza3.zza(zzhww.NIST_P521, zzhsc.zzc);
        zzc = zzhitVarZza3.zzb();
    }

    public static zzhbs zzb(zzhsk zzhskVar, Provider provider) throws GeneralSecurityException {
        return new zzhvf((ECPublicKey) (provider != null ? KeyFactory.getInstance("EC", provider) : (KeyFactory) zzhxe.zzf.zzb("EC")).generatePublic(new ECPublicKeySpec(zzhskVar.zzd(), zzhwy.zzb((zzhww) zzc.zzb(zzhskVar.zzf().zzd())))), (zzhxn) zza.zzb(zzhskVar.zzf().zze()), (zzhwx) zzb.zzb(zzhskVar.zzf().zzc()), zzhskVar.zze().zzc(), zzhskVar.zzf().zzf().equals(zzhsf.zzc) ? zzf : zze, provider);
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d1 A[RETURN] */
    private final void zzc(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        byte b10;
        int i15;
        byte b11;
        String str;
        Provider provider;
        Signature signature;
        byte[] bArr3;
        if (this.zzi == zzhwx.IEEE_P1363) {
            EllipticCurve curve = this.zzg.getParams().getCurve();
            int length = bArr.length;
            int iBitLength = (zzhis.zzc(curve).subtract(BigInteger.ONE).bitLength() + 7) / 8;
            if (length != iBitLength + iBitLength) {
                throw new GeneralSecurityException("Invalid signature");
            }
            bArr = zzhwy.zza(bArr);
        }
        int length2 = bArr.length;
        if (length2 >= 8 && bArr[0] == 48) {
            int i16 = bArr[1] & 255;
            if (i16 == 129) {
                i16 = bArr[2] & 255;
                if (i16 >= 128) {
                    i10 = 2;
                    if (i16 == (length2 - 1) - i10 && bArr[i10 + 1] == 2 && (i14 = (i13 = (i12 = i10 + 3) + (i11 = bArr[i10 + 2] & 255)) + 1) < length2 && i11 != 0) {
                        b10 = bArr[i12];
                        if ((b10 & 255) < 128 && ((i11 <= 1 || b10 != 0 || (bArr[i10 + 4] & 255) >= 128) && bArr[i13] == 2)) {
                            i15 = bArr[i14] & 255;
                            if (i13 + 2 + i15 == length2 && i15 != 0) {
                                b11 = bArr[i10 + 5 + i11];
                                if ((b11 & 255) < 128 && (i15 <= 1 || b11 != 0 || (bArr[i10 + 6 + i11] & 255) >= 128)) {
                                    str = this.zzh;
                                    provider = this.zzl;
                                    if (provider != null) {
                                        signature = Signature.getInstance(str, provider);
                                    } else {
                                        signature = (Signature) zzhxe.zzc.zzb(str);
                                    }
                                    signature.initVerify(this.zzg);
                                    signature.update(bArr2);
                                    bArr3 = this.zzk;
                                    if (bArr3.length > 0) {
                                        signature.update(bArr3);
                                    }
                                    try {
                                        if (signature.verify(bArr)) {
                                            return;
                                        }
                                    } catch (RuntimeException unused) {
                                    }
                                    throw new GeneralSecurityException("Invalid signature");
                                }
                            }
                        }
                    }
                }
            } else if (i16 != 128 && i16 <= 129) {
                i10 = 1;
                if (i16 == (length2 - 1) - i10) {
                    b10 = bArr[i12];
                    if ((b10 & 255) < 128) {
                        i15 = bArr[i14] & 255;
                        if (i13 + 2 + i15 == length2) {
                            b11 = bArr[i10 + 5 + i11];
                            if ((b11 & 255) < 128) {
                                str = this.zzh;
                                provider = this.zzl;
                                if (provider != null) {
                                    signature = Signature.getInstance(str, provider);
                                } else {
                                    signature = (Signature) zzhxe.zzc.zzb(str);
                                }
                                signature.initVerify(this.zzg);
                                signature.update(bArr2);
                                bArr3 = this.zzk;
                                if (bArr3.length > 0) {
                                    signature.update(bArr3);
                                }
                                if (signature.verify(bArr)) {
                                    return;
                                }
                                throw new GeneralSecurityException("Invalid signature");
                            }
                        }
                    }
                }
            }
        }
        throw new GeneralSecurityException("Invalid signature");
    }

    @Override // com.google.android.gms.internal.ads.zzhbs
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzj;
        int length = bArr3.length;
        if (length == 0) {
            zzc(bArr, bArr2);
        } else {
            if (!zzhln.zze(bArr3, bArr)) {
                throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
            }
            zzc(Arrays.copyOfRange(bArr, length, bArr.length), bArr2);
        }
    }

    private zzhvf(ECPublicKey eCPublicKey, zzhxn zzhxnVar, zzhwx zzhwxVar, byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (zzhid.zza(2)) {
            this.zzh = zzhyb.zza(zzhxnVar);
            this.zzg = eCPublicKey;
            this.zzi = zzhwxVar;
            this.zzj = bArr;
            this.zzk = bArr2;
            this.zzl = provider;
            return;
        }
        throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto is not available.");
    }
}
