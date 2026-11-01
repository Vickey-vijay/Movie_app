package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhso {
    public static final /* synthetic */ int zza = 0;
    private static final zzhku zzb = zzhku.zzd(new zzhkt() { // from class: com.google.android.gms.internal.ads.zzhsl
        @Override // com.google.android.gms.internal.ads.zzhkt
        public final /* synthetic */ Object zza(zzhaz zzhazVar) {
            return zzhve.zzb((zzhsi) zzhazVar);
        }
    }, zzhsi.class, zzhbr.class);
    private static final zzhku zzc = zzhku.zzd(new zzhkt() { // from class: com.google.android.gms.internal.ads.zzhsn
        @Override // com.google.android.gms.internal.ads.zzhkt
        public final /* synthetic */ Object zza(zzhaz zzhazVar) {
            zzhiu zzhiuVar = zzhvf.zza;
            return zzhvf.zzb((zzhsk) zzhazVar, zzhih.zza());
        }
    }, zzhsk.class, zzhbs.class);
    private static final zzhbq zzd = zzhjl.zzf("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey", zzhbr.class, zzhpi.zzg());
    private static final zzhba zze = zzhjl.zze("type.googleapis.com/google.crypto.tink.EcdsaPublicKey", zzhbs.class, zzhqb.ASYMMETRIC_PUBLIC, zzhpk.zzi());
    private static final zzhjb zzf = new zzhjb() { // from class: com.google.android.gms.internal.ads.zzhsm
        @Override // com.google.android.gms.internal.ads.zzhjb
        public final /* synthetic */ zzhaz zza(zzhbp zzhbpVar, Integer num) throws GeneralSecurityException {
            zzhsg zzhsgVar = (zzhsg) zzhbpVar;
            int i10 = zzhso.zza;
            ECParameterSpec eCParameterSpecZza = zzhsgVar.zzd().zza();
            KeyPairGenerator keyPairGenerator = (KeyPairGenerator) zzhxe.zze.zzb("EC");
            keyPairGenerator.initialize(eCParameterSpecZza);
            KeyPair keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
            ECPublicKey eCPublicKey = (ECPublicKey) keyPairGenerateKeyPair.getPublic();
            ECPrivateKey eCPrivateKey = (ECPrivateKey) keyPairGenerateKeyPair.getPrivate();
            zzhsj zzhsjVar = new zzhsj(null);
            zzhsjVar.zza(zzhsgVar);
            zzhsjVar.zzc(num);
            zzhsjVar.zzb(eCPublicKey.getW());
            zzhsk zzhskVarZzd = zzhsjVar.zzd();
            zzhsh zzhshVar = new zzhsh(null);
            zzhshVar.zza(zzhskVarZzd);
            zzhshVar.zzb(zzhyf.zza(eCPrivateKey.getS(), zzhax.zza()));
            return zzhshVar.zzc();
        }
    };
    private static final int zzg = 2;

    public static void zza(boolean z10) throws GeneralSecurityException {
        int i10 = zzg;
        if (!zzhid.zza(i10)) {
            throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto module is not available.");
        }
        int i11 = zzhvd.zza;
        zzhvd.zza(zzhkg.zza());
        zzhkc zzhkcVarZza = zzhkc.zza();
        HashMap map = new HashMap();
        map.put("ECDSA_P256", zzhtm.zza);
        map.put("ECDSA_P256_IEEE_P1363", zzhtm.zzd);
        zzhsb zzhsbVar = new zzhsb(null);
        zzhsbVar.zzc(zzhsd.zza);
        zzhsbVar.zzb(zzhsc.zza);
        zzhsbVar.zza(zzhse.zza);
        zzhsbVar.zzd(zzhsf.zzd);
        map.put("ECDSA_P256_RAW", zzhsbVar.zze());
        map.put("ECDSA_P256_IEEE_P1363_WITHOUT_PREFIX", zzhtm.zzf);
        map.put("ECDSA_P384", zzhtm.zzb);
        map.put("ECDSA_P384_IEEE_P1363", zzhtm.zze);
        zzhsb zzhsbVar2 = new zzhsb(null);
        zzhsbVar2.zzc(zzhsd.zzc);
        zzhsc zzhscVar = zzhsc.zzb;
        zzhsbVar2.zzb(zzhscVar);
        zzhse zzhseVar = zzhse.zzb;
        zzhsbVar2.zza(zzhseVar);
        zzhsf zzhsfVar = zzhsf.zza;
        zzhsbVar2.zzd(zzhsfVar);
        map.put("ECDSA_P384_SHA512", zzhsbVar2.zze());
        zzhsb zzhsbVar3 = new zzhsb(null);
        zzhsbVar3.zzc(zzhsd.zzb);
        zzhsbVar3.zzb(zzhscVar);
        zzhsbVar3.zza(zzhseVar);
        zzhsbVar3.zzd(zzhsfVar);
        map.put("ECDSA_P384_SHA384", zzhsbVar3.zze());
        map.put("ECDSA_P521", zzhtm.zzc);
        map.put("ECDSA_P521_IEEE_P1363", zzhtm.zzg);
        zzhkcVarZza.zzd(Collections.unmodifiableMap(map));
        zzhkd.zza().zzb(zzb);
        zzhkd.zza().zzb(zzc);
        zzhjx.zza().zzb(zzf, zzhsg.class);
        zzhjc.zza().zzf(zzd, i10, true);
        zzhjc.zza().zzf(zze, i10, false);
    }
}
