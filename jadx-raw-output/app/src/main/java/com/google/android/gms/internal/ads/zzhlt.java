package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhlt {
    private static final zzhjb zza = new zzhjb() { // from class: com.google.android.gms.internal.ads.zzhls
        @Override // com.google.android.gms.internal.ads.zzhjb
        public final /* synthetic */ zzhaz zza(zzhbp zzhbpVar, Integer num) {
            return zzhlt.zzb((zzhlw) zzhbpVar, num);
        }
    };
    private static final zzhku zzb = zzhku.zzd(new zzhkt() { // from class: com.google.android.gms.internal.ads.zzhlq
        @Override // com.google.android.gms.internal.ads.zzhkt
        public final /* synthetic */ Object zza(zzhaz zzhazVar) {
            return zzhlt.zzc((zzhlp) zzhazVar);
        }
    }, zzhlp.class, zzhlx.class);
    private static final zzhku zzc = zzhku.zzd(new zzhkt() { // from class: com.google.android.gms.internal.ads.zzhlr
        @Override // com.google.android.gms.internal.ads.zzhkt
        public final /* synthetic */ Object zza(zzhaz zzhazVar) {
            return zzhlt.zzd((zzhlp) zzhazVar);
        }
    }, zzhlp.class, zzhbo.class);
    private static final zzhba zzd = zzhjl.zze("type.googleapis.com/google.crypto.tink.AesCmacKey", zzhbo.class, zzhqb.SYMMETRIC, zzhnw.zzg());

    public static void zza(boolean z10) throws GeneralSecurityException {
        if (!zzhid.zza(1)) {
            throw new GeneralSecurityException("Registering AES CMAC is not supported in FIPS mode");
        }
        int i10 = zzhnc.zza;
        zzhnc.zza(zzhkg.zza());
        zzhjx.zza().zzb(zza, zzhlw.class);
        zzhkd.zza().zzb(zzb);
        zzhkd.zza().zzb(zzc);
        zzhkc zzhkcVarZza = zzhkc.zza();
        HashMap map = new HashMap();
        zzhlw zzhlwVar = zzhmx.zzc;
        map.put("AES_CMAC", zzhlwVar);
        map.put("AES256_CMAC", zzhlwVar);
        zzhlu zzhluVar = new zzhlu(null);
        zzhluVar.zza(32);
        zzhluVar.zzb(16);
        zzhluVar.zzc(zzhlv.zzd);
        map.put("AES256_CMAC_RAW", zzhluVar.zzd());
        zzhkcVarZza.zzd(Collections.unmodifiableMap(map));
        zzhjc.zza().zzb(zzd, true);
    }

    public static /* synthetic */ zzhlp zzb(zzhlw zzhlwVar, Integer num) throws GeneralSecurityException {
        zze(zzhlwVar);
        zzhlo zzhloVar = new zzhlo(null);
        zzhloVar.zza(zzhlwVar);
        zzhloVar.zzb(zzhyg.zzb(zzhlwVar.zzc()));
        zzhloVar.zzc(num);
        return zzhloVar.zzd();
    }

    public static /* synthetic */ zzhlx zzc(zzhlp zzhlpVar) throws GeneralSecurityException {
        zze(zzhlpVar.zzf());
        return zzhnf.zza(zzhlpVar);
    }

    public static /* synthetic */ zzhbo zzd(zzhlp zzhlpVar) throws GeneralSecurityException {
        zze(zzhlpVar.zzf());
        return zzhxu.zza(zzhlpVar);
    }

    private static void zze(zzhlw zzhlwVar) throws GeneralSecurityException {
        if (zzhlwVar.zzc() == 32) {
        } else {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }
}
