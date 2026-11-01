package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.interfaces.RSAPrivateCrtKey;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzhxx implements zzhbr {
    @Override // com.google.android.gms.internal.ads.zzhbr
    public final byte[] zza(byte[] bArr) throws GeneralSecurityException {
        throw null;
    }

    public /* synthetic */ zzhxx(RSAPrivateCrtKey rSAPrivateCrtKey, zzhxn zzhxnVar, zzhxn zzhxnVar2, int i10, byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (!zzhie.zza()) {
            zzhyc.zzb(zzhxnVar);
            if (zzhxnVar.equals(zzhxnVar2)) {
                zzhyc.zzc(rSAPrivateCrtKey.getModulus().bitLength());
                zzhyc.zzd(rSAPrivateCrtKey.getPublicExponent());
                return;
            }
            throw new GeneralSecurityException("sigHash and mgf1Hash must be the same");
        }
        throw new GeneralSecurityException("Can not use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
    }
}
