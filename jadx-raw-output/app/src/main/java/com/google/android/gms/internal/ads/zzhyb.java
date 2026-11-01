package com.google.android.gms.internal.ads;

import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzhyb {
    public static String zza(zzhxn zzhxnVar) throws GeneralSecurityException {
        zzhyc.zzb(zzhxnVar);
        return zzhxnVar.toString().concat("withECDSA");
    }

    public static String zzb(zzhxn zzhxnVar) throws GeneralSecurityException {
        int iOrdinal = zzhxnVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        if (iOrdinal == 4) {
                            return "SHA-512";
                        }
                        throw new GeneralSecurityException("Unsupported hash ".concat(zzhxnVar.toString()));
                    }
                    return "SHA-384";
                }
                return "SHA-256";
            }
            return "SHA-224";
        }
        return AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1;
    }
}
