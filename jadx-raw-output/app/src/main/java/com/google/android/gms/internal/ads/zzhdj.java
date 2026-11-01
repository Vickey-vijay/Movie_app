package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
public final class zzhdj {
    public static final /* synthetic */ int zza = 0;
    private static final zzhku zzb = zzhku.zzd(new zzhkt() { // from class: com.google.android.gms.internal.ads.zzhdg
        @Override // com.google.android.gms.internal.ads.zzhkt
        public final /* synthetic */ Object zza(zzhaz zzhazVar) {
            return zzhwn.zzb((zzhdf) zzhazVar);
        }
    }, zzhdf.class, zzhas.class);
    private static final zzhba zzc = zzhjl.zze("type.googleapis.com/google.crypto.tink.AesGcmKey", zzhas.class, zzhqb.SYMMETRIC, zzhos.zze());
    private static final zzhjy zzd = new zzhjy() { // from class: com.google.android.gms.internal.ads.zzhdi
    };
    private static final zzhjb zze = new zzhjb() { // from class: com.google.android.gms.internal.ads.zzhdh
        @Override // com.google.android.gms.internal.ads.zzhjb
        public final /* synthetic */ zzhaz zza(zzhbp zzhbpVar, Integer num) throws GeneralSecurityException {
            zzhdm zzhdmVar = (zzhdm) zzhbpVar;
            int i10 = zzhdj.zza;
            if (zzhdmVar.zzc() == 24) {
                throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
            }
            zzhde zzhdeVar = new zzhde(null);
            zzhdeVar.zza(zzhdmVar);
            zzhdeVar.zzc(num);
            zzhdeVar.zzb(zzhyg.zzb(zzhdmVar.zzc()));
            return zzhdeVar.zzd();
        }
    };
    private static final int zzf = 2;

    public static void zza(boolean z10) throws GeneralSecurityException {
        int i10 = zzf;
        if (!zzhid.zza(i10)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        int i11 = zzhgo.zza;
        zzhgo.zza(zzhkg.zza());
        zzhkd.zza().zzb(zzb);
        zzhkc zzhkcVarZza = zzhkc.zza();
        HashMap map = new HashMap();
        map.put("AES128_GCM", zzhfk.zza);
        zzhdk zzhdkVar = new zzhdk(null);
        zzhdkVar.zzb(12);
        zzhdkVar.zza(16);
        zzhdkVar.zzc(16);
        zzhdl zzhdlVar = zzhdl.zzc;
        zzhdkVar.zzd(zzhdlVar);
        map.put("AES128_GCM_RAW", zzhdkVar.zze());
        map.put("AES256_GCM", zzhfk.zzb);
        zzhdk zzhdkVar2 = new zzhdk(null);
        zzhdkVar2.zzb(12);
        zzhdkVar2.zza(32);
        zzhdkVar2.zzc(16);
        zzhdkVar2.zzd(zzhdlVar);
        map.put("AES256_GCM_RAW", zzhdkVar2.zze());
        zzhkcVarZza.zzd(Collections.unmodifiableMap(map));
        zzhjz.zza().zzb(zzd, zzhdm.class);
        zzhjx.zza().zzb(zze, zzhdm.class);
        zzhjc.zza().zzf(zzc, i10, true);
    }
}
