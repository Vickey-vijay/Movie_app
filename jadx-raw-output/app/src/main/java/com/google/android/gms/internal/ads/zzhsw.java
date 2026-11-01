package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhsw {
    public static final /* synthetic */ int zza = 0;
    private static final zzhku zzb = zzhku.zzd(new zzhkt() { // from class: com.google.android.gms.internal.ads.zzhsu
        @Override // com.google.android.gms.internal.ads.zzhkt
        public final /* synthetic */ Object zza(zzhaz zzhazVar) {
            return zzhwu.zzb((zzhsr) zzhazVar);
        }
    }, zzhsr.class, zzhbr.class);
    private static final zzhku zzc = zzhku.zzd(new zzhkt() { // from class: com.google.android.gms.internal.ads.zzhsv
        @Override // com.google.android.gms.internal.ads.zzhkt
        public final /* synthetic */ Object zza(zzhaz zzhazVar) {
            return zzhwv.zzb((zzhsx) zzhazVar);
        }
    }, zzhsx.class, zzhbs.class);
    private static final zzhbq zzd = zzhjl.zzf("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey", zzhbr.class, zzhpp.zzg());
    private static final zzhba zze = zzhjl.zze("type.googleapis.com/google.crypto.tink.Ed25519PublicKey", zzhbs.class, zzhqb.ASYMMETRIC_PUBLIC, zzhpr.zzg());
    private static final zzhjy zzf = new zzhjy() { // from class: com.google.android.gms.internal.ads.zzhst
    };
    private static final zzhjb zzg = new zzhjb() { // from class: com.google.android.gms.internal.ads.zzhss
        @Override // com.google.android.gms.internal.ads.zzhjb
        public final /* synthetic */ zzhaz zza(zzhbp zzhbpVar, Integer num) throws GeneralSecurityException {
            int i10 = zzhsw.zza;
            zzhwt zzhwtVarZzc = zzhwt.zzc();
            return zzhsr.zzc(zzhsx.zzc(((zzhsq) zzhbpVar).zzc(), zzhye.zza(zzhwtVarZzc.zza()), num), zzhyg.zza(zzhwtVarZzc.zzb(), zzhax.zza()));
        }
    };

    public static void zza(boolean z10) throws GeneralSecurityException {
        if (!zzhid.zza(1)) {
            throw new GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
        }
        int i10 = zzhvm.zza;
        zzhvm.zza(zzhkg.zza());
        zzhkc zzhkcVarZza = zzhkc.zza();
        HashMap map = new HashMap();
        map.put("ED25519", zzhsq.zzb(zzhsp.zza));
        zzhsp zzhspVar = zzhsp.zzd;
        map.put("ED25519_RAW", zzhsq.zzb(zzhspVar));
        map.put("ED25519WithRawOutput", zzhsq.zzb(zzhspVar));
        zzhkcVarZza.zzd(Collections.unmodifiableMap(map));
        zzhjx.zza().zzb(zzg, zzhsq.class);
        zzhjz.zza().zzb(zzf, zzhsq.class);
        zzhkd.zza().zzb(zzb);
        zzhkd.zza().zzb(zzc);
        zzhjc.zza().zzb(zzd, true);
        zzhjc.zza().zzb(zze, false);
    }
}
