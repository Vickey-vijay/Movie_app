package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAKeyGenParameterSpec;
import java.util.HashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzhug {
    public static final /* synthetic */ int zza = 0;
    private static final zzhku zzb = zzhku.zzd(new zzhkt() { // from class: com.google.android.gms.internal.ads.zzhud
        @Override // com.google.android.gms.internal.ads.zzhkt
        public final /* synthetic */ Object zza(zzhaz zzhazVar) {
            return zzhvy.zzb((zzhua) zzhazVar);
        }
    }, zzhua.class, zzhbr.class);
    private static final zzhku zzc = zzhku.zzd(new zzhkt() { // from class: com.google.android.gms.internal.ads.zzhuf
        @Override // com.google.android.gms.internal.ads.zzhkt
        public final /* synthetic */ Object zza(zzhaz zzhazVar) {
            return zzhxw.zzb((zzhuc) zzhazVar);
        }
    }, zzhuc.class, zzhbs.class);
    private static final zzhbq zzd = zzhjl.zzf("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey", zzhbr.class, zzhrg.zzl());
    private static final zzhba zze = zzhjl.zze("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey", zzhbs.class, zzhqb.ASYMMETRIC_PUBLIC, zzhri.zzi());
    private static final zzhjb zzf = new zzhjb() { // from class: com.google.android.gms.internal.ads.zzhue
        @Override // com.google.android.gms.internal.ads.zzhjb
        public final /* synthetic */ zzhaz zza(zzhbp zzhbpVar, Integer num) throws GeneralSecurityException {
            zzhty zzhtyVar = (zzhty) zzhbpVar;
            int i10 = zzhug.zza;
            KeyPairGenerator keyPairGenerator = (KeyPairGenerator) zzhxe.zze.zzb("RSA");
            keyPairGenerator.initialize(new RSAKeyGenParameterSpec(zzhtyVar.zzc(), new BigInteger(1, zzhtyVar.zzd().toByteArray())));
            KeyPair keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
            RSAPublicKey rSAPublicKey = (RSAPublicKey) keyPairGenerateKeyPair.getPublic();
            RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) keyPairGenerateKeyPair.getPrivate();
            zzhub zzhubVar = new zzhub(null);
            zzhubVar.zza(zzhtyVar);
            zzhubVar.zzb(rSAPublicKey.getModulus());
            zzhubVar.zzc(num);
            zzhuc zzhucVarZzd = zzhubVar.zzd();
            zzhtz zzhtzVar = new zzhtz(null);
            zzhtzVar.zza(zzhucVarZzd);
            zzhtzVar.zzb(zzhyf.zza(rSAPrivateCrtKey.getPrimeP(), zzhax.zza()), zzhyf.zza(rSAPrivateCrtKey.getPrimeQ(), zzhax.zza()));
            zzhtzVar.zzc(zzhyf.zza(rSAPrivateCrtKey.getPrivateExponent(), zzhax.zza()));
            zzhtzVar.zzd(zzhyf.zza(rSAPrivateCrtKey.getPrimeExponentP(), zzhax.zza()), zzhyf.zza(rSAPrivateCrtKey.getPrimeExponentQ(), zzhax.zza()));
            zzhtzVar.zze(zzhyf.zza(rSAPrivateCrtKey.getCrtCoefficient(), zzhax.zza()));
            return zzhtzVar.zzf();
        }
    };
    private static final int zzg = 2;

    public static void zza(boolean z10) throws GeneralSecurityException {
        int i10 = zzg;
        if (!zzhid.zza(i10)) {
            throw new GeneralSecurityException("Can not use RSA SSA PKCS1 in FIPS-mode, as BoringCrypto module is not available.");
        }
        int i11 = zzhvx.zza;
        zzhvx.zza(zzhkg.zza());
        zzhkc zzhkcVarZza = zzhkc.zza();
        HashMap map = new HashMap();
        map.put("RSA_SSA_PKCS1_3072_SHA256_F4", zzhtm.zzh);
        BigInteger bigInteger = zzhty.zza;
        zzhtv zzhtvVar = new zzhtv(null);
        zzhtvVar.zzd(zzhtw.zza);
        zzhtvVar.zza(3072);
        BigInteger bigInteger2 = zzhty.zza;
        zzhtvVar.zzb(bigInteger2);
        zzhtx zzhtxVar = zzhtx.zzd;
        zzhtvVar.zzc(zzhtxVar);
        map.put("RSA_SSA_PKCS1_3072_SHA256_F4_RAW", zzhtvVar.zze());
        map.put("RSA_SSA_PKCS1_3072_SHA256_F4_WITHOUT_PREFIX", zzhtm.zzi);
        map.put("RSA_SSA_PKCS1_4096_SHA512_F4", zzhtm.zzj);
        zzhtv zzhtvVar2 = new zzhtv(null);
        zzhtvVar2.zzd(zzhtw.zzc);
        zzhtvVar2.zza(4096);
        zzhtvVar2.zzb(bigInteger2);
        zzhtvVar2.zzc(zzhtxVar);
        map.put("RSA_SSA_PKCS1_4096_SHA512_F4_RAW", zzhtvVar2.zze());
        zzhkcVarZza.zzd(map);
        zzhkd.zza().zzb(zzb);
        zzhkd.zza().zzb(zzc);
        zzhjx.zza().zzb(zzf, zzhty.class);
        zzhjc.zza().zzf(zzd, i10, true);
        zzhjc.zza().zzf(zze, i10, false);
    }
}
