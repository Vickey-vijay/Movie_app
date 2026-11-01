package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
public final class zzhfv {
    public static final /* synthetic */ int zza = 0;
    private static final zzhku zzb = zzhku.zzd(new zzhkt() { // from class: com.google.android.gms.internal.ads.zzhfu
        @Override // com.google.android.gms.internal.ads.zzhkt
        public final /* synthetic */ Object zza(zzhaz zzhazVar) {
            zzhfr zzhfrVar = (zzhfr) zzhazVar;
            int i10 = zzhfv.zza;
            return zzhgw.zzd() ? zzhhr.zzb(zzhfrVar) : zzhyd.zzb(zzhfrVar);
        }
    }, zzhfr.class, zzhas.class);
    private static final zzhba zzc = zzhjl.zze("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", zzhas.class, zzhqb.SYMMETRIC, zzhry.zze());
    private static final zzhjy zzd = new zzhjy() { // from class: com.google.android.gms.internal.ads.zzhfs
    };
    private static final zzhjb zze = new zzhjb() { // from class: com.google.android.gms.internal.ads.zzhft
        @Override // com.google.android.gms.internal.ads.zzhjb
        public final /* synthetic */ zzhaz zza(zzhbp zzhbpVar, Integer num) {
            int i10 = zzhfv.zza;
            return zzhfr.zzd(((zzhfx) zzhbpVar).zzc(), zzhyg.zzb(32), num);
        }
    };

    public static void zza(boolean z10) throws GeneralSecurityException {
        if (!zzhid.zza(1)) {
            throw new GeneralSecurityException("Registering XChaCha20Poly1305 is not supported in FIPS mode");
        }
        int i10 = zzhhw.zza;
        zzhhw.zza(zzhkg.zza());
        zzhkd.zza().zzb(zzb);
        zzhkc zzhkcVarZza = zzhkc.zza();
        HashMap map = new HashMap();
        map.put("XCHACHA20_POLY1305", zzhfx.zzb(zzhfw.zza));
        map.put("XCHACHA20_POLY1305_RAW", zzhfx.zzb(zzhfw.zzc));
        zzhkcVarZza.zzd(Collections.unmodifiableMap(map));
        zzhjx.zza().zzb(zze, zzhfx.class);
        zzhjz.zza().zzb(zzd, zzhfx.class);
        zzhjc.zza().zzb(zzc, true);
    }
}
