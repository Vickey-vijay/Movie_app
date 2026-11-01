package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
public final class zzhgj {
    private static final ThreadLocal zza = new zzhgi();

    public static SecretKey zzb(byte[] bArr) throws GeneralSecurityException {
        zzhyc.zza(bArr.length);
        return new SecretKeySpec(bArr, "AES");
    }

    public static Cipher zza() {
        return (Cipher) zza.get();
    }

    public static AlgorithmParameterSpec zzc(byte[] bArr, int i10, int i11) {
        Integer numZzd = zzhln.zzd();
        if (numZzd != null) {
            numZzd.intValue();
        }
        return new GCMParameterSpec(128, bArr, i10, 12);
    }
}
