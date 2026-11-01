package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
public final class zzhda {
    public static final /* synthetic */ int zza = 0;
    private static final zzhku zzb = zzhku.zzd(new zzhkt() { // from class: com.google.android.gms.internal.ads.zzhcy
        @Override // com.google.android.gms.internal.ads.zzhkt
        public final /* synthetic */ Object zza(zzhaz zzhazVar) {
            return zzhwm.zzb((zzhcx) zzhazVar);
        }
    }, zzhcx.class, zzhas.class);
    private static final zzhba zzc = zzhjl.zze("type.googleapis.com/google.crypto.tink.AesEaxKey", zzhas.class, zzhqb.SYMMETRIC, zzhom.zzg());
    private static final zzhjb zzd = new zzhjb() { // from class: com.google.android.gms.internal.ads.zzhcz
        @Override // com.google.android.gms.internal.ads.zzhjb
        public final /* synthetic */ zzhaz zza(zzhbp zzhbpVar, Integer num) throws GeneralSecurityException {
            zzhdd zzhddVar = (zzhdd) zzhbpVar;
            int i10 = zzhda.zza;
            if (zzhddVar.zzc() == 24) {
                throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
            }
            zzhcw zzhcwVar = new zzhcw(null);
            zzhcwVar.zza(zzhddVar);
            zzhcwVar.zzc(num);
            zzhcwVar.zzb(zzhyg.zzb(zzhddVar.zzc()));
            return zzhcwVar.zzd();
        }
    };

    public static void zza(boolean z10) throws GeneralSecurityException {
        if (!zzhid.zza(1)) {
            throw new GeneralSecurityException("Registering AES EAX is not supported in FIPS mode");
        }
        int i10 = zzhgh.zza;
        zzhgh.zza(zzhkg.zza());
        zzhkd.zza().zzb(zzb);
        zzhkc zzhkcVarZza = zzhkc.zza();
        HashMap map = new HashMap();
        map.put("AES128_EAX", zzhfk.zzc);
        zzhdb zzhdbVar = new zzhdb(null);
        zzhdbVar.zzb(16);
        zzhdbVar.zza(16);
        zzhdbVar.zzc(16);
        zzhdc zzhdcVar = zzhdc.zzc;
        zzhdbVar.zzd(zzhdcVar);
        map.put("AES128_EAX_RAW", zzhdbVar.zze());
        map.put("AES256_EAX", zzhfk.zzd);
        zzhdb zzhdbVar2 = new zzhdb(null);
        zzhdbVar2.zzb(16);
        zzhdbVar2.zza(32);
        zzhdbVar2.zzc(16);
        zzhdbVar2.zzd(zzhdcVar);
        map.put("AES256_EAX_RAW", zzhdbVar2.zze());
        zzhkcVarZza.zzd(Collections.unmodifiableMap(map));
        zzhjx.zza().zzb(zzd, zzhdd.class);
        zzhjc.zza().zzb(zzc, true);
    }
}
