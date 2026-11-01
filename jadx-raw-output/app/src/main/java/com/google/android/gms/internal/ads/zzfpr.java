package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzfpr extends zzibr implements zzidd {
    private static final zzfpr zzb;
    private static volatile zzidk zzc;
    private zzicd zza = zzibr.zzbM();

    static {
        zzfpr zzfprVar = new zzfpr();
        zzb = zzfprVar;
        zzibr.zzbu(zzfpr.class, zzfprVar);
    }

    private zzfpr() {
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
                                zzidk zzibmVar = zzc;
                                if (zzibmVar == null) {
                                    synchronized (zzfpr.class) {
                                        zzibmVar = zzc;
                                        if (zzibmVar == null) {
                                            zzibmVar = new zzibm(zzb);
                                            zzc = zzibmVar;
                                        }
                                    }
                                }
                                return zzibmVar;
                            }
                            throw null;
                        }
                        return zzb;
                    }
                    return new zzfpq(bArr);
                }
                return new zzfpr();
            }
            return zzibr.zzbv(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zza", zzfpp.class});
        }
        return (byte) 1;
    }
}
