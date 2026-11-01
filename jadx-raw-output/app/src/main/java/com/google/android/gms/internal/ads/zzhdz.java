package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
public final class zzhdz {
    public static final /* synthetic */ int zza = 0;
    private static final zzhku zzb = zzhku.zzd(new zzhkt() { // from class: com.google.android.gms.internal.ads.zzhdy
        @Override // com.google.android.gms.internal.ads.zzhkt
        public final /* synthetic */ Object zza(zzhaz zzhazVar) {
            zzhdw zzhdwVar = (zzhdw) zzhazVar;
            int i10 = zzhdz.zza;
            return zzhgw.zzd() ? zzhgw.zzb(zzhdwVar) : zzhws.zzb(zzhdwVar);
        }
    }, zzhdw.class, zzhas.class);
    private static final zzhjb zzc = new zzhjb() { // from class: com.google.android.gms.internal.ads.zzhdx
        @Override // com.google.android.gms.internal.ads.zzhjb
        public final /* synthetic */ zzhaz zza(zzhbp zzhbpVar, Integer num) {
            int i10 = zzhdz.zza;
            return zzhdw.zzd(((zzheb) zzhbpVar).zzc(), zzhyg.zzb(32), num);
        }
    };
    private static final zzhba zzd = zzhjl.zze("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", zzhas.class, zzhqb.SYMMETRIC, zzhpa.zze());

    public static void zza(boolean z10) throws GeneralSecurityException {
        if (!zzhid.zza(1)) {
            throw new GeneralSecurityException("Registering ChaCha20Poly1305 is not supported in FIPS mode");
        }
        int i10 = zzhhb.zza;
        zzhhb.zza(zzhkg.zza());
        zzhkd.zza().zzb(zzb);
        zzhjx.zza().zzb(zzc, zzheb.class);
        zzhkc zzhkcVarZza = zzhkc.zza();
        HashMap map = new HashMap();
        map.put("CHACHA20_POLY1305", zzheb.zzb(zzhea.zza));
        map.put("CHACHA20_POLY1305_RAW", zzheb.zzb(zzhea.zzc));
        zzhkcVarZza.zzd(Collections.unmodifiableMap(map));
        zzhjc.zza().zzb(zzd, true);
    }
}
