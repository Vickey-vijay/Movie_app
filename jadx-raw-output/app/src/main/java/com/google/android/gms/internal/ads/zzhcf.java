package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
public final class zzhcf {
    public static final /* synthetic */ int zza = 0;
    private static final zzhix zzb = zzb();

    private static zzhix zzb() {
        try {
            zzhkv zzhkvVarZza = zzhky.zza();
            zzhcl.zzd(zzhkvVarZza);
            zzhkvVarZza.zza(zzhku.zzd(new zzhkt() { // from class: com.google.android.gms.internal.ads.zzhcd
                @Override // com.google.android.gms.internal.ads.zzhkt
                public final /* synthetic */ Object zza(zzhaz zzhazVar) {
                    return zzhwz.zzb((zzhcn) zzhazVar);
                }
            }, zzhcn.class, zzhas.class));
            zzhkvVarZza.zza(zzhku.zzd(new zzhkt() { // from class: com.google.android.gms.internal.ads.zzhcb
                @Override // com.google.android.gms.internal.ads.zzhkt
                public final /* synthetic */ Object zza(zzhaz zzhazVar) {
                    return zzhwn.zzb((zzhdf) zzhazVar);
                }
            }, zzhdf.class, zzhas.class));
            zzhkvVarZza.zza(zzhku.zzd(new zzhkt() { // from class: com.google.android.gms.internal.ads.zzhcc
                @Override // com.google.android.gms.internal.ads.zzhkt
                public final /* synthetic */ Object zza(zzhaz zzhazVar) {
                    return zzhhz.zzb((zzhdo) zzhazVar);
                }
            }, zzhdo.class, zzhas.class));
            zzhkvVarZza.zza(zzhku.zzd(new zzhkt() { // from class: com.google.android.gms.internal.ads.zzhca
                @Override // com.google.android.gms.internal.ads.zzhkt
                public final /* synthetic */ Object zza(zzhaz zzhazVar) {
                    return zzhwm.zzb((zzhcx) zzhazVar);
                }
            }, zzhcx.class, zzhas.class));
            zzhkvVarZza.zza(zzhku.zzd(new zzhkt() { // from class: com.google.android.gms.internal.ads.zzhbz
                @Override // com.google.android.gms.internal.ads.zzhkt
                public final /* synthetic */ Object zza(zzhaz zzhazVar) {
                    zzhdw zzhdwVar = (zzhdw) zzhazVar;
                    int i10 = zzhcf.zza;
                    return zzhgw.zzd() ? zzhgw.zzb(zzhdwVar) : zzhws.zzb(zzhdwVar);
                }
            }, zzhdw.class, zzhas.class));
            zzhkvVarZza.zza(zzhku.zzd(new zzhkt() { // from class: com.google.android.gms.internal.ads.zzhby
                @Override // com.google.android.gms.internal.ads.zzhkt
                public final /* synthetic */ Object zza(zzhaz zzhazVar) {
                    zzhfr zzhfrVar = (zzhfr) zzhazVar;
                    int i10 = zzhcf.zza;
                    return zzhgw.zzd() ? zzhhr.zzb(zzhfrVar) : zzhyd.zzb(zzhfrVar);
                }
            }, zzhfr.class, zzhas.class));
            zzhkvVarZza.zza(zzhku.zzd(new zzhkt() { // from class: com.google.android.gms.internal.ads.zzhce
                @Override // com.google.android.gms.internal.ads.zzhkt
                public final /* synthetic */ Object zza(zzhaz zzhazVar) {
                    return zzhhl.zzb((zzhfl) zzhazVar);
                }
            }, zzhfl.class, zzhas.class));
            return zzhix.zzb(zzhkvVarZza.zzc());
        } catch (GeneralSecurityException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static zzhaw zza() throws GeneralSecurityException {
        if (!zzhie.zza()) {
            return zzb;
        }
        throw new GeneralSecurityException("Cannot use non-FIPS-compliant AeadConfigurationV1 in FIPS mode");
    }
}
