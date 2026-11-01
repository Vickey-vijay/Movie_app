package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhnw extends zzibr implements zzidd {
    private static final zzhnw zze;
    private static volatile zzidk zzf;
    private int zza;
    private int zzb;
    private zzian zzc = zzian.zza;
    private zzhoa zzd;

    public final int zza() {
        return this.zzb;
    }

    public final zzian zzb() {
        return this.zzc;
    }

    public final /* synthetic */ void zzh(zzian zzianVar) {
        this.zzc = zzianVar;
    }

    static {
        zzhnw zzhnwVar = new zzhnw();
        zze = zzhnwVar;
        zzibr.zzbu(zzhnw.class, zzhnwVar);
    }

    public static zzhnw zzd(zzian zzianVar, zzibb zzibbVar) throws zzicg {
        return (zzhnw) zzibr.zzbT(zze, zzianVar, zzibbVar);
    }

    public static zzhnv zze() {
        return (zzhnv) zze.zzbn();
    }

    public static zzidk zzg() {
        return zze.zzbd();
    }

    public final zzhoa zzc() {
        zzhoa zzhoaVar = this.zzd;
        return zzhoaVar == null ? zzhoa.zzc() : zzhoaVar;
    }

    private zzhnw() {
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
                                zzidk zzibmVar = zzf;
                                if (zzibmVar == null) {
                                    synchronized (zzhnw.class) {
                                        zzibmVar = zzf;
                                        if (zzibmVar == null) {
                                            zzibmVar = new zzibm(zze);
                                            zzf = zzibmVar;
                                        }
                                    }
                                }
                                return zzibmVar;
                            }
                            throw null;
                        }
                        return zze;
                    }
                    return new zzhnv(bArr);
                }
                return new zzhnw();
            }
            return zzibr.zzbv(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003ဉ\u0000", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        return (byte) 1;
    }

    public final /* synthetic */ void zzi(zzhoa zzhoaVar) {
        zzhoaVar.getClass();
        this.zzd = zzhoaVar;
        this.zza |= 1;
    }
}
