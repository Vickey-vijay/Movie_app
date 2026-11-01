package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
public final class zzhee {
    public static final /* synthetic */ int zza = 0;
    private static final zzhku zzb = zzhku.zzd(new zzhkt() { // from class: com.google.android.gms.internal.ads.zzhed
        @Override // com.google.android.gms.internal.ads.zzhkt
        public final /* synthetic */ Object zza(zzhaz zzhazVar) throws GeneralSecurityException {
            zzhej zzhejVar = (zzhej) zzhazVar;
            int i10 = zzhee.zza;
            zzhbm zzhbmVarZza = zzhbn.zza(zzhejVar.zze().zzc());
            zzhejVar.zze();
            return zzhhj.zzc(zzhbmVarZza.zzb(), zzhejVar.zzc());
        }
    }, zzhej.class, zzhas.class);
    private static final zzhba zzc = zzhjl.zze("type.googleapis.com/google.crypto.tink.KmsAeadKey", zzhas.class, zzhqb.REMOTE, zzhqr.zze());
    private static final zzhjb zzd = new zzhjb() { // from class: com.google.android.gms.internal.ads.zzhec
        @Override // com.google.android.gms.internal.ads.zzhjb
        public final /* synthetic */ zzhaz zza(zzhbp zzhbpVar, Integer num) {
            int i10 = zzhee.zza;
            return zzhej.zzd((zzhel) zzhbpVar, num);
        }
    };

    public static void zza(boolean z10) throws GeneralSecurityException {
        if (!zzhid.zza(1)) {
            throw new GeneralSecurityException("Registering KMS AEAD is not supported in FIPS mode");
        }
        int i10 = zzheq.zza;
        zzheq.zza(zzhkg.zza());
        zzhkd.zza().zzb(zzb);
        zzhjx.zza().zzb(zzd, zzhel.class);
        zzhjc.zza().zzb(zzc, true);
    }
}
