package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
public final class zzhcr {
    public static final /* synthetic */ int zza = 0;
    private static final zzhku zzb = zzhku.zzd(new zzhkt() { // from class: com.google.android.gms.internal.ads.zzhcq
        @Override // com.google.android.gms.internal.ads.zzhkt
        public final /* synthetic */ Object zza(zzhaz zzhazVar) {
            return zzhwz.zzb((zzhcn) zzhazVar);
        }
    }, zzhcn.class, zzhas.class);
    private static final zzhba zzc = zzhjl.zze("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", zzhas.class, zzhqb.SYMMETRIC, zzhoc.zzg());
    private static final zzhjy zzd = new zzhjy() { // from class: com.google.android.gms.internal.ads.zzhcp
    };
    private static final zzhjb zze = new zzhjb() { // from class: com.google.android.gms.internal.ads.zzhco
        @Override // com.google.android.gms.internal.ads.zzhjb
        public final /* synthetic */ zzhaz zza(zzhbp zzhbpVar, Integer num) throws GeneralSecurityException {
            zzhcv zzhcvVar = (zzhcv) zzhbpVar;
            int i10 = zzhcr.zza;
            if (zzhcvVar.zzc() != 16 && zzhcvVar.zzc() != 32) {
                throw new GeneralSecurityException("AES key size must be 16 or 32 bytes");
            }
            zzhcm zzhcmVar = new zzhcm(null);
            zzhcmVar.zza(zzhcvVar);
            zzhcmVar.zzd(num);
            zzhcmVar.zzb(zzhyg.zzb(zzhcvVar.zzc()));
            zzhcmVar.zzc(zzhyg.zzb(zzhcvVar.zzd()));
            return zzhcmVar.zze();
        }
    };
    private static final int zzf = 2;

    public static void zza(boolean z10) throws GeneralSecurityException {
        int i10 = zzf;
        if (!zzhid.zza(i10)) {
            throw new GeneralSecurityException("Can not use AES-CTR-HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        int i11 = zzhgc.zza;
        zzhgc.zza(zzhkg.zza());
        zzhkd.zza().zzb(zzb);
        zzhkc zzhkcVarZza = zzhkc.zza();
        HashMap map = new HashMap();
        map.put("AES128_CTR_HMAC_SHA256", zzhfk.zze);
        zzhcs zzhcsVar = new zzhcs(null);
        zzhcsVar.zza(16);
        zzhcsVar.zzb(32);
        zzhcsVar.zzd(16);
        zzhcsVar.zzc(16);
        zzhct zzhctVar = zzhct.zzc;
        zzhcsVar.zzf(zzhctVar);
        zzhcu zzhcuVar = zzhcu.zzc;
        zzhcsVar.zze(zzhcuVar);
        map.put("AES128_CTR_HMAC_SHA256_RAW", zzhcsVar.zzg());
        map.put("AES256_CTR_HMAC_SHA256", zzhfk.zzf);
        zzhcs zzhcsVar2 = new zzhcs(null);
        zzhcsVar2.zza(32);
        zzhcsVar2.zzb(32);
        zzhcsVar2.zzd(32);
        zzhcsVar2.zzc(16);
        zzhcsVar2.zzf(zzhctVar);
        zzhcsVar2.zze(zzhcuVar);
        map.put("AES256_CTR_HMAC_SHA256_RAW", zzhcsVar2.zzg());
        zzhkcVarZza.zzd(Collections.unmodifiableMap(map));
        zzhjz.zza().zzb(zzd, zzhcv.class);
        zzhjx.zza().zzb(zze, zzhcv.class);
        zzhjc.zza().zzf(zzc, i10, true);
    }
}
