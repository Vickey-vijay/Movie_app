package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhhz implements zzhas {
    private static final ThreadLocal zza = new zzhhx();

    @Override // com.google.android.gms.internal.ads.zzhas
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        throw null;
    }

    public static zzhas zzb(zzhdo zzhdoVar) throws GeneralSecurityException {
        return zzhgq.zzc(zzhdoVar, new zzhgp() { // from class: com.google.android.gms.internal.ads.zzhhy
            @Override // com.google.android.gms.internal.ads.zzhgp
            public final /* synthetic */ Object zza() {
                return zzhhz.zzc();
            }
        });
    }

    public static /* synthetic */ Cipher zzc() throws GeneralSecurityException {
        try {
            Cipher cipher = (Cipher) zza.get();
            if (cipher != null) {
                return cipher;
            }
            throw new GeneralSecurityException("AES GCM SIV cipher is invalid.");
        } catch (IllegalStateException e10) {
            throw new GeneralSecurityException("AES GCM SIV cipher is not available or is invalid.", e10);
        }
    }
}
