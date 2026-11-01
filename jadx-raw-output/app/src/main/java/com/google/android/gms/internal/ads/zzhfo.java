package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
public final class zzhfo {
    private static final zzhjb zza = new zzhjb() { // from class: com.google.android.gms.internal.ads.zzhfn
        @Override // com.google.android.gms.internal.ads.zzhjb
        public final /* synthetic */ zzhaz zza(zzhbp zzhbpVar, Integer num) {
            return zzhfl.zzd((zzhfq) zzhbpVar, zzhyg.zzb(32), num);
        }
    };
    private static final zzhku zzb = zzhku.zzd(new zzhkt() { // from class: com.google.android.gms.internal.ads.zzhfm
        @Override // com.google.android.gms.internal.ads.zzhkt
        public final /* synthetic */ Object zza(zzhaz zzhazVar) {
            return zzhhl.zzb((zzhfl) zzhazVar);
        }
    }, zzhfl.class, zzhas.class);

    public static void zza(boolean z10) throws GeneralSecurityException {
        int i10 = zzhhq.zza;
        zzhhq.zza(zzhkg.zza());
        zzhkc zzhkcVarZza = zzhkc.zza();
        HashMap map = new HashMap();
        map.put("XAES_256_GCM_192_BIT_NONCE", zzhfk.zzg);
        map.put("XAES_256_GCM_192_BIT_NONCE_NO_PREFIX", zzhfk.zzh);
        map.put("XAES_256_GCM_160_BIT_NONCE_NO_PREFIX", zzhfk.zzi);
        map.put("X_AES_GCM_8_BYTE_SALT_NO_PREFIX", zzhfk.zzj);
        zzhkcVarZza.zzd(Collections.unmodifiableMap(map));
        zzhkd.zza().zzb(zzb);
        zzhjx.zza().zzb(zza, zzhfq.class);
    }
}
