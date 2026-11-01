package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzfox extends zzibr implements zzidd {
    private static final zzfox zzc;
    private static volatile zzidk zzd;
    private int zza;
    private zzfou zzb;

    static {
        zzfox zzfoxVar = new zzfox();
        zzc = zzfoxVar;
        zzibr.zzbu(zzfox.class, zzfoxVar);
    }

    public static zzfow zza() {
        return (zzfow) zzc.zzbn();
    }

    private zzfox() {
    }

    public final /* synthetic */ void zzb(zzfou zzfouVar) {
        zzfouVar.getClass();
        this.zzb = zzfouVar;
        this.zza |= 1;
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
                                zzidk zzibmVar = zzd;
                                if (zzibmVar == null) {
                                    synchronized (zzfox.class) {
                                        zzibmVar = zzd;
                                        if (zzibmVar == null) {
                                            zzibmVar = new zzibm(zzc);
                                            zzd = zzibmVar;
                                        }
                                    }
                                }
                                return zzibmVar;
                            }
                            throw null;
                        }
                        return zzc;
                    }
                    return new zzfow(bArr);
                }
                return new zzfox();
            }
            return zzibr.zzbv(zzc, "\u0004\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0000\u0006ဉ\u0000", new Object[]{"zza", "zzb"});
        }
        return (byte) 1;
    }
}
