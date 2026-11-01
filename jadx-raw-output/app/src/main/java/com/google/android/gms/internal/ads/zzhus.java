package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAKeyGenParameterSpec;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzhus {
    public static final /* synthetic */ int zza = 0;
    private static final zzhku zzb = zzhku.zzd(new zzhkt() { // from class: com.google.android.gms.internal.ads.zzhup
        @Override // com.google.android.gms.internal.ads.zzhkt
        public final /* synthetic */ Object zza(zzhaz zzhazVar) {
            return zzhxy.zzb((zzhum) zzhazVar);
        }
    }, zzhum.class, zzhbr.class);
    private static final zzhku zzc = zzhku.zzd(new zzhkt() { // from class: com.google.android.gms.internal.ads.zzhur
        @Override // com.google.android.gms.internal.ads.zzhkt
        public final /* synthetic */ Object zza(zzhaz zzhazVar) {
            return zzhya.zzb((zzhuo) zzhazVar);
        }
    }, zzhuo.class, zzhbs.class);
    private static final zzhbq zzd = zzhjl.zzf("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey", zzhbr.class, zzhro.zzl());
    private static final zzhba zze = zzhjl.zze("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey", zzhbs.class, zzhqb.ASYMMETRIC_PUBLIC, zzhrq.zzi());
    private static final zzhjb zzf = new zzhjb() { // from class: com.google.android.gms.internal.ads.zzhuq
        @Override // com.google.android.gms.internal.ads.zzhjb
        public final /* synthetic */ zzhaz zza(zzhbp zzhbpVar, Integer num) throws GeneralSecurityException {
            zzhuk zzhukVar = (zzhuk) zzhbpVar;
            int i10 = zzhus.zza;
            KeyPairGenerator keyPairGenerator = (KeyPairGenerator) zzhxe.zze.zzb("RSA");
            keyPairGenerator.initialize(new RSAKeyGenParameterSpec(zzhukVar.zzc(), new BigInteger(1, zzhukVar.zzd().toByteArray())));
            KeyPair keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
            RSAPublicKey rSAPublicKey = (RSAPublicKey) keyPairGenerateKeyPair.getPublic();
            RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) keyPairGenerateKeyPair.getPrivate();
            zzhun zzhunVar = new zzhun(null);
            zzhunVar.zza(zzhukVar);
            zzhunVar.zzb(rSAPublicKey.getModulus());
            zzhunVar.zzc(num);
            zzhuo zzhuoVarZzd = zzhunVar.zzd();
            zzhul zzhulVar = new zzhul(null);
            zzhulVar.zza(zzhuoVarZzd);
            zzhulVar.zzb(zzhyf.zza(rSAPrivateCrtKey.getPrimeP(), zzhax.zza()), zzhyf.zza(rSAPrivateCrtKey.getPrimeQ(), zzhax.zza()));
            zzhulVar.zzc(zzhyf.zza(rSAPrivateCrtKey.getPrivateExponent(), zzhax.zza()));
            zzhulVar.zzd(zzhyf.zza(rSAPrivateCrtKey.getPrimeExponentP(), zzhax.zza()), zzhyf.zza(rSAPrivateCrtKey.getPrimeExponentQ(), zzhax.zza()));
            zzhulVar.zze(zzhyf.zza(rSAPrivateCrtKey.getCrtCoefficient(), zzhax.zza()));
            return zzhulVar.zzf();
        }
    };
    private static final int zzg = 2;

    public static void zza(boolean z10) throws GeneralSecurityException {
        int i10 = zzg;
        if (!zzhid.zza(i10)) {
            throw new GeneralSecurityException("Can not use RSA SSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        int i11 = zzhwg.zza;
        zzhwg.zza(zzhkg.zza());
        zzhkc zzhkcVarZza = zzhkc.zza();
        HashMap map = new HashMap();
        BigInteger bigInteger = zzhuk.zza;
        zzhuh zzhuhVar = new zzhuh(null);
        zzhui zzhuiVar = zzhui.zza;
        zzhuhVar.zzd(zzhuiVar);
        zzhuhVar.zze(zzhuiVar);
        zzhuhVar.zzf(32);
        zzhuhVar.zza(3072);
        BigInteger bigInteger2 = zzhuk.zza;
        zzhuhVar.zzb(bigInteger2);
        zzhuj zzhujVar = zzhuj.zza;
        zzhuhVar.zzc(zzhujVar);
        map.put("RSA_SSA_PSS_3072_SHA256_F4", zzhuhVar.zzg());
        zzhuh zzhuhVar2 = new zzhuh(null);
        zzhuhVar2.zzd(zzhuiVar);
        zzhuhVar2.zze(zzhuiVar);
        zzhuhVar2.zzf(32);
        zzhuhVar2.zza(3072);
        zzhuhVar2.zzb(bigInteger2);
        zzhuj zzhujVar2 = zzhuj.zzd;
        zzhuhVar2.zzc(zzhujVar2);
        map.put("RSA_SSA_PSS_3072_SHA256_F4_RAW", zzhuhVar2.zzg());
        map.put("RSA_SSA_PSS_3072_SHA256_SHA256_32_F4", zzhtm.zzk);
        zzhuh zzhuhVar3 = new zzhuh(null);
        zzhui zzhuiVar2 = zzhui.zzc;
        zzhuhVar3.zzd(zzhuiVar2);
        zzhuhVar3.zze(zzhuiVar2);
        zzhuhVar3.zzf(64);
        zzhuhVar3.zza(4096);
        zzhuhVar3.zzb(bigInteger2);
        zzhuhVar3.zzc(zzhujVar);
        map.put("RSA_SSA_PSS_4096_SHA512_F4", zzhuhVar3.zzg());
        zzhuh zzhuhVar4 = new zzhuh(null);
        zzhuhVar4.zzd(zzhuiVar2);
        zzhuhVar4.zze(zzhuiVar2);
        zzhuhVar4.zzf(64);
        zzhuhVar4.zza(4096);
        zzhuhVar4.zzb(bigInteger2);
        zzhuhVar4.zzc(zzhujVar2);
        map.put("RSA_SSA_PSS_4096_SHA512_F4_RAW", zzhuhVar4.zzg());
        map.put("RSA_SSA_PSS_4096_SHA512_SHA512_64_F4", zzhtm.zzl);
        zzhkcVarZza.zzd(Collections.unmodifiableMap(map));
        zzhkd.zza().zzb(zzb);
        zzhkd.zza().zzb(zzc);
        zzhjx.zza().zzb(zzf, zzhuk.class);
        zzhjc.zza().zzf(zzd, i10, true);
        zzhjc.zza().zzf(zze, i10, false);
    }
}
