package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzhtq implements zzhla {
    private static final zzhtq zza = new zzhtq();
    private static final zzhku zzb = zzhku.zzd(new zzhkt() { // from class: com.google.android.gms.internal.ads.zzhtn
        @Override // com.google.android.gms.internal.ads.zzhkt
        public final /* synthetic */ Object zza(zzhaz zzhazVar) {
            return zzhvp.zzb((zzhjo) zzhazVar);
        }
    }, zzhjo.class, zzhbr.class);

    @Override // com.google.android.gms.internal.ads.zzhla
    public final Class zza() {
        return zzhbr.class;
    }

    @Override // com.google.android.gms.internal.ads.zzhla
    public final Class zzb() {
        return zzhbr.class;
    }

    public static void zzc() throws GeneralSecurityException {
        zzhkd.zza().zzc(zza);
        zzhkd.zza().zzb(zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzhla
    public final /* bridge */ /* synthetic */ Object zze(zzhjj zzhjjVar, zzhjr zzhjrVar, zzhkz zzhkzVar) throws GeneralSecurityException {
        zzhjs zzhjsVarZza;
        if (!zzhjrVar.zza()) {
            zzhjsVarZza = zzhkb.zza().zzb().zza(zzhjjVar, zzhjrVar, "public_key_sign", "sign");
        } else {
            zzhjsVarZza = zzhjv.zza;
        }
        zzhbk zzhbkVar = (zzhbk) zzhjjVar;
        return new zzhtp(new zzhto((zzhbr) zzhkzVar.zza(zzhbkVar.zzc()), zzhbkVar.zzc().zzc()), zzhjsVarZza);
    }
}
