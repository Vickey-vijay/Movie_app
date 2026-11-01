package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
public final class zzhbc {
    public static final zzhbp zzb(zzhbp zzhbpVar) throws GeneralSecurityException {
        return zzhbpVar != null ? zzhbpVar : zzhbv.zzb(zza(null).zzaN());
    }

    public static final zzhqf zza(zzhbp zzhbpVar) {
        try {
            return ((zzhlc) zzhkg.zza().zzk(null, zzhlc.class)).zzc();
        } catch (GeneralSecurityException e10) {
            throw new zzhlm("Parsing parameters failed in getProto(). You probably want to call some Tink register function for ".concat("null"), e10);
        }
    }
}
