package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzawf extends zzibr implements zzidd {
    private static final zzawf zzg;
    private static volatile zzidk zzh;
    private int zza;
    private boolean zzc;
    private boolean zzd;
    private long zzb = 100;
    private long zze = 300;
    private long zzf = 1000;

    public static zzawf zza() {
        return zzg;
    }

    static {
        zzawf zzawfVar = new zzawf();
        zzg = zzawfVar;
        zzibr.zzbu(zzawf.class, zzawfVar);
    }

    private zzawf() {
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
                                zzidk zzibmVar = zzh;
                                if (zzibmVar == null) {
                                    synchronized (zzawf.class) {
                                        zzibmVar = zzh;
                                        if (zzibmVar == null) {
                                            zzibmVar = new zzibm(zzg);
                                            zzh = zzibmVar;
                                        }
                                    }
                                }
                                return zzibmVar;
                            }
                            throw null;
                        }
                        return zzg;
                    }
                    return new zzawe(bArr);
                }
                return new zzawf();
            }
            return zzibr.zzbv(zzg, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဂ\u0003\u0005ဂ\u0004", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
