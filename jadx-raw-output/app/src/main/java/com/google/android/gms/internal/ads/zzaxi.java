package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzaxi extends zzibr implements zzidd {
    private static final zzaxi zzl;
    private static volatile zzidk zzm;
    private int zza;
    private long zzb;
    private int zzc;
    private boolean zzd;
    private long zzf;
    private boolean zzg;
    private long zzi;
    private long zzj;
    private long zzk;
    private zzibz zze = zzibr.zzbC();
    private zzicd zzh = zzibr.zzbM();

    static {
        zzaxi zzaxiVar = new zzaxi();
        zzl = zzaxiVar;
        zzibr.zzbu(zzaxi.class, zzaxiVar);
    }

    private zzaxi() {
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
                                zzidk zzibmVar = zzm;
                                if (zzibmVar == null) {
                                    synchronized (zzaxi.class) {
                                        zzibmVar = zzm;
                                        if (zzibmVar == null) {
                                            zzibmVar = new zzibm(zzl);
                                            zzm = zzibmVar;
                                        }
                                    }
                                }
                                return zzibmVar;
                            }
                            throw null;
                        }
                        return zzl;
                    }
                    return new zzaxh(bArr);
                }
                return new zzaxi();
            }
            return zzibr.zzbv(zzl, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0002\u0000\u0001ဂ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004\u0016\u0005ဃ\u0003\u0006ဇ\u0004\u0007\u001b\bဂ\u0005\tဂ\u0006\nဂ\u0007", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", zzaxm.class, "zzi", "zzj", "zzk"});
        }
        return (byte) 1;
    }
}
