package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzhxt implements zzhnp {
    private final ThreadLocal zza;
    private final String zzb;
    private final Key zzc;
    private final int zzd;

    public final /* synthetic */ String zzb() {
        return this.zzb;
    }

    public final /* synthetic */ Key zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzhnp
    public final byte[] zza(byte[] bArr, int i10) throws GeneralSecurityException {
        if (i10 > this.zzd) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        ThreadLocal threadLocal = this.zza;
        ((Mac) threadLocal.get()).update(bArr);
        return Arrays.copyOf(((Mac) threadLocal.get()).doFinal(), i10);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:24:0x005b  */
    public zzhxt(String str, Key key) throws GeneralSecurityException {
        byte b10;
        int i10;
        zzhxs zzhxsVar = new zzhxs(this);
        this.zza = zzhxsVar;
        if (zzhid.zza(2)) {
            this.zzb = str;
            this.zzc = key;
            if (key.getEncoded().length >= 16) {
                switch (str) {
                    case "HMACSHA1":
                        b10 = 0;
                        break;
                    case "HMACSHA224":
                        b10 = 1;
                        break;
                    case "HMACSHA256":
                        b10 = 2;
                        break;
                    case "HMACSHA384":
                        b10 = 3;
                        break;
                    case "HMACSHA512":
                        b10 = 4;
                        break;
                    default:
                        b10 = -1;
                        break;
                }
                if (b10 != 0) {
                    if (b10 != 1) {
                        if (b10 != 2) {
                            if (b10 != 3) {
                                if (b10 == 4) {
                                    i10 = 64;
                                } else {
                                    throw new NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(str));
                                }
                            } else {
                                i10 = 48;
                            }
                        } else {
                            i10 = 32;
                        }
                    } else {
                        i10 = 28;
                    }
                } else {
                    i10 = 20;
                }
                this.zzd = i10;
                zzhxsVar.get();
                return;
            }
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
    }
}
