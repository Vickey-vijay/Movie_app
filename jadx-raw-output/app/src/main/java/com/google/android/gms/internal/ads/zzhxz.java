package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.interfaces.RSAPublicKey;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzhxz implements zzhbs {
    private final RSAPublicKey zza;
    private final zzhxn zzb;
    private final zzhxn zzc;
    private final int zzd;
    private final byte[] zze;
    private final byte[] zzf;

    private final void zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        RSAPublicKey rSAPublicKey = this.zza;
        BigInteger publicExponent = rSAPublicKey.getPublicExponent();
        BigInteger modulus = rSAPublicKey.getModulus();
        int iBitLength = modulus.bitLength() + 7;
        int iBitLength2 = modulus.bitLength() + 6;
        if (iBitLength / 8 != bArr.length) {
            throw new GeneralSecurityException("invalid signature's length");
        }
        BigInteger bigInteger = new BigInteger(1, bArr);
        if (bigInteger.compareTo(modulus) >= 0) {
            throw new GeneralSecurityException("signature out of range");
        }
        byte[] bArrZzb = zzhig.zzb(bigInteger.modPow(publicExponent, modulus), iBitLength2 / 8);
        int iBitLength3 = modulus.bitLength() - 1;
        zzhxn zzhxnVar = this.zzb;
        zzhyc.zzb(zzhxnVar);
        zzhxe zzhxeVar = zzhxe.zzd;
        MessageDigest messageDigest = (MessageDigest) zzhxeVar.zzb(zzhyb.zzb(zzhxnVar));
        messageDigest.update(bArr2);
        byte[] bArr3 = this.zzf;
        if (bArr3.length != 0) {
            messageDigest.update(bArr3);
        }
        byte[] bArrDigest = messageDigest.digest();
        int digestLength = messageDigest.getDigestLength();
        int length = bArrZzb.length;
        int i10 = this.zzd;
        if (length < digestLength + i10 + 2) {
            throw new GeneralSecurityException("inconsistent");
        }
        if (bArrZzb[length - 1] != -68) {
            throw new GeneralSecurityException("inconsistent");
        }
        int i11 = length - digestLength;
        int i12 = i11 - 1;
        byte[] bArrCopyOf = Arrays.copyOf(bArrZzb, i12);
        int length2 = bArrCopyOf.length;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrZzb, length2, length2 + digestLength);
        int i13 = 0;
        while (true) {
            int i14 = digestLength;
            int i15 = length;
            int i16 = iBitLength3;
            MessageDigest messageDigest2 = messageDigest;
            long j10 = (((long) length) * 8) - ((long) iBitLength3);
            if (i13 < j10) {
                if (((bArrCopyOf[i13 / 8] >> (7 - (i13 % 8))) & 1) != 0) {
                    throw new GeneralSecurityException("inconsistent");
                }
                i13++;
                digestLength = i14;
                length = i15;
                iBitLength3 = i16;
                messageDigest = messageDigest2;
            } else {
                MessageDigest messageDigest3 = (MessageDigest) zzhxeVar.zzb(zzhyb.zzb(this.zzc));
                byte[] bArr4 = new byte[i12];
                int i17 = 0;
                int i18 = 0;
                for (int digestLength2 = messageDigest3.getDigestLength(); i17 <= (i12 - 1) / digestLength2; digestLength2 = digestLength2) {
                    messageDigest3.reset();
                    messageDigest3.update(bArrCopyOfRange);
                    byte[] bArr5 = bArrCopyOfRange;
                    messageDigest3.update(zzhig.zzb(BigInteger.valueOf(i17), 4));
                    byte[] bArrDigest2 = messageDigest3.digest();
                    int length3 = bArrDigest2.length;
                    System.arraycopy(bArrDigest2, 0, bArr4, i18, Math.min(length3, i12 - i18));
                    i18 += length3;
                    i17++;
                    bArrCopyOfRange = bArr5;
                    messageDigest3 = messageDigest3;
                }
                byte[] bArr6 = bArrCopyOfRange;
                byte[] bArr7 = new byte[i12];
                for (int i19 = 0; i19 < i12; i19++) {
                    bArr7[i19] = (byte) (bArr4[i19] ^ bArrCopyOf[i19]);
                }
                for (int i20 = 0; i20 <= j10; i20++) {
                    int i21 = i20 / 8;
                    bArr7[i21] = (byte) ((~(1 << (7 - (i20 % 8)))) & bArr7[i21]);
                }
                int i22 = 0;
                while (true) {
                    int i23 = (i11 - i10) - 2;
                    if (i22 >= i23) {
                        if (bArr7[i23] != 1) {
                            throw new GeneralSecurityException("inconsistent");
                        }
                        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr7, i12 - i10, i12);
                        int i24 = i14 + 8;
                        byte[] bArr8 = new byte[i10 + i24];
                        System.arraycopy(bArrDigest, 0, bArr8, 8, bArrDigest.length);
                        System.arraycopy(bArrCopyOfRange2, 0, bArr8, i24, bArrCopyOfRange2.length);
                        if (!MessageDigest.isEqual(messageDigest2.digest(bArr8), bArr6)) {
                            throw new GeneralSecurityException("inconsistent");
                        }
                        return;
                    }
                    if (bArr7[i22] != 0) {
                        throw new GeneralSecurityException("inconsistent");
                    }
                    i22++;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbs
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zze;
        int length = bArr3.length;
        if (length == 0) {
            zzb(bArr, bArr2);
        } else {
            if (!zzhln.zze(bArr3, bArr)) {
                throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
            }
            zzb(Arrays.copyOfRange(bArr, length, bArr.length), bArr2);
        }
    }

    public /* synthetic */ zzhxz(RSAPublicKey rSAPublicKey, zzhxn zzhxnVar, zzhxn zzhxnVar2, int i10, byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (!zzhie.zza()) {
            zzhyc.zzb(zzhxnVar);
            if (zzhxnVar.equals(zzhxnVar2)) {
                zzhyc.zzc(rSAPublicKey.getModulus().bitLength());
                zzhyc.zzd(rSAPublicKey.getPublicExponent());
                this.zza = rSAPublicKey;
                this.zzb = zzhxnVar;
                this.zzc = zzhxnVar2;
                this.zzd = i10;
                this.zze = bArr;
                this.zzf = bArr2;
                return;
            }
            throw new GeneralSecurityException("sigHash and mgf1Hash must be the same");
        }
        throw new GeneralSecurityException("Can not use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
    }
}
