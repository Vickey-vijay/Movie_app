package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
public final class zzhds {
    public static final /* synthetic */ int zza = 0;
    private static final zzhku zzb = zzhku.zzd(new zzhkt() { // from class: com.google.android.gms.internal.ads.zzhdp
        @Override // com.google.android.gms.internal.ads.zzhkt
        public final /* synthetic */ Object zza(zzhaz zzhazVar) {
            return zzhhz.zzb((zzhdo) zzhazVar);
        }
    }, zzhdo.class, zzhas.class);
    private static final zzhjb zzc = new zzhjb() { // from class: com.google.android.gms.internal.ads.zzhdr
        @Override // com.google.android.gms.internal.ads.zzhjb
        public final /* synthetic */ zzhaz zza(zzhbp zzhbpVar, Integer num) {
            zzhdv zzhdvVar = (zzhdv) zzhbpVar;
            int i10 = zzhds.zza;
            zzhdn zzhdnVar = new zzhdn(null);
            zzhdnVar.zza(zzhdvVar);
            zzhdnVar.zzc(num);
            zzhdnVar.zzb(zzhyg.zzb(zzhdvVar.zzc()));
            return zzhdnVar.zzd();
        }
    };
    private static final zzhjy zzd = new zzhjy() { // from class: com.google.android.gms.internal.ads.zzhdq
    };
    private static final zzhba zze = zzhjl.zze("type.googleapis.com/google.crypto.tink.AesGcmSivKey", zzhas.class, zzhqb.SYMMETRIC, zzhow.zze());

    public static void zza(boolean z10) throws GeneralSecurityException {
        if (!zzhid.zza(1)) {
            throw new GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
        }
        int i10 = zzhgv.zza;
        zzhgv.zza(zzhkg.zza());
        zzhkc zzhkcVarZza = zzhkc.zza();
        HashMap map = new HashMap();
        zzhdt zzhdtVar = new zzhdt(null);
        zzhdtVar.zza(16);
        zzhdu zzhduVar = zzhdu.zza;
        zzhdtVar.zzb(zzhduVar);
        map.put("AES128_GCM_SIV", zzhdtVar.zzc());
        zzhdt zzhdtVar2 = new zzhdt(null);
        zzhdtVar2.zza(16);
        zzhdu zzhduVar2 = zzhdu.zzc;
        zzhdtVar2.zzb(zzhduVar2);
        map.put("AES128_GCM_SIV_RAW", zzhdtVar2.zzc());
        zzhdt zzhdtVar3 = new zzhdt(null);
        zzhdtVar3.zza(32);
        zzhdtVar3.zzb(zzhduVar);
        map.put("AES256_GCM_SIV", zzhdtVar3.zzc());
        zzhdt zzhdtVar4 = new zzhdt(null);
        zzhdtVar4.zza(32);
        zzhdtVar4.zzb(zzhduVar2);
        map.put("AES256_GCM_SIV_RAW", zzhdtVar4.zzc());
        zzhkcVarZza.zzd(Collections.unmodifiableMap(map));
        zzhjz.zza().zzb(zzd, zzhdv.class);
        zzhjx.zza().zzb(zzc, zzhdv.class);
        zzhkd.zza().zzb(zzb);
        zzhjc.zza().zzb(zze, true);
    }
}
