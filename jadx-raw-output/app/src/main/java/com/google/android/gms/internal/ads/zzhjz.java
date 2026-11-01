package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhjz {
    private static final zzhjz zzb = new zzhjz();
    private final Map zza = new HashMap();

    public static zzhjz zza() {
        return zzb;
    }

    public final synchronized void zzb(zzhjy zzhjyVar, Class cls) throws GeneralSecurityException {
        Map map = this.zza;
        zzhjy zzhjyVar2 = (zzhjy) map.get(cls);
        if (zzhjyVar2 != null && !zzhjyVar2.equals(zzhjyVar)) {
            throw new GeneralSecurityException("Different key creator for parameters class already inserted");
        }
        map.put(cls, zzhjyVar);
    }
}
