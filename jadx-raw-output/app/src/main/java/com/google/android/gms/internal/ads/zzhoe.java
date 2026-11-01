package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhoe extends zzibr implements zzidd {
    private static final zzhoe zzd;
    private static volatile zzidk zze;
    private int zza;
    private zzhoi zzb;
    private zzhpx zzc;

    static {
        zzhoe zzhoeVar = new zzhoe();
        zzd = zzhoeVar;
        zzibr.zzbu(zzhoe.class, zzhoeVar);
    }

    public static zzhoe zzc(zzian zzianVar, zzibb zzibbVar) throws zzicg {
        return (zzhoe) zzibr.zzbT(zzd, zzianVar, zzibbVar);
    }

    public static zzhod zzd() {
        return (zzhod) zzd.zzbn();
    }

    public final zzhoi zza() {
        zzhoi zzhoiVar = this.zzb;
        return zzhoiVar == null ? zzhoi.zzd() : zzhoiVar;
    }

    public final zzhpx zzb() {
        zzhpx zzhpxVar = this.zzc;
        return zzhpxVar == null ? zzhpx.zzg() : zzhpxVar;
    }

    private zzhoe() {
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        int iOrdinal = zzibqVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    byte[] bArr = null;
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            if (iOrdinal == 6) {
                                zzidk zzibmVar = zze;
                                if (zzibmVar == null) {
                                    synchronized (zzhoe.class) {
                                        zzibmVar = zze;
                                        if (zzibmVar == null) {
                                            zzibmVar = new zzibm(zzd);
                                            zze = zzibmVar;
                                        }
                                    }
                                }
                                return zzibmVar;
                            }
                            throw null;
                        }
                        return zzd;
                    }
                    return new zzhod(bArr);
                }
                return new zzhoe();
            }
            return zzibr.zzbv(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zza", "zzb", "zzc"});
        }
        return (byte) 1;
    }

    public final /* synthetic */ void zze(zzhoi zzhoiVar) {
        zzhoiVar.getClass();
        this.zzb = zzhoiVar;
        this.zza |= 1;
    }

    public final /* synthetic */ void zzg(zzhpx zzhpxVar) {
        zzhpxVar.getClass();
        this.zzc = zzhpxVar;
        this.zza |= 2;
    }
}
