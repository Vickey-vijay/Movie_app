package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
public final class zzhei {
    public static final /* synthetic */ int zza = 0;
    private static final zzhba zzb = zzhjl.zze("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", zzhas.class, zzhqb.SYMMETRIC, zzhqv.zze());
    private static final zzhjb zzc = new zzhjb() { // from class: com.google.android.gms.internal.ads.zzheh
        @Override // com.google.android.gms.internal.ads.zzhjb
        public final /* synthetic */ zzhaz zza(zzhbp zzhbpVar, Integer num) {
            int i10 = zzhei.zza;
            return zzher.zzd((zzhev) zzhbpVar, num);
        }
    };
    private static final zzhku zzd = zzhku.zzd(new zzhkt() { // from class: com.google.android.gms.internal.ads.zzheg
        @Override // com.google.android.gms.internal.ads.zzhkt
        public final /* synthetic */ Object zza(zzhaz zzhazVar) throws GeneralSecurityException {
            zzher zzherVar = (zzher) zzhazVar;
            int i10 = zzhei.zza;
            String strZzb = zzherVar.zze().zzb();
            zzhch zzhchVarZzd = zzherVar.zze().zzd();
            zzhas zzhasVarZzb = zzhbn.zza(strZzb).zzb();
            int i11 = zzhef.zza;
            try {
                return zzhhj.zzc(new zzhef(zzhqf.zzd(zzhbv.zza(zzhchVarZzd), zzibb.zza()), zzhasVarZzb), zzherVar.zzc());
            } catch (zzicg e10) {
                throw new GeneralSecurityException(e10);
            }
        }
    }, zzher.class, zzhas.class);

    public static void zza(boolean z10) throws GeneralSecurityException {
        if (!zzhid.zza(1)) {
            throw new GeneralSecurityException("Registering KMS Envelope AEAD is not supported in FIPS mode");
        }
        int i10 = zzhfa.zza;
        zzhfa.zza(zzhkg.zza());
        zzhjx.zza().zzb(zzc, zzhev.class);
        zzhkd.zza().zzb(zzd);
        zzhjc.zza().zzb(zzb, true);
    }
}
