package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzifd extends zzibr implements zzidd {
    private static final zzifd zzd;
    private static volatile zzidk zze;
    private int zza;
    private String zzb = "";
    private zzibz zzc = zzibr.zzbC();

    public final /* synthetic */ void zze(int i10) {
        this.zza = 15;
    }

    static {
        zzifd zzifdVar = new zzifd();
        zzd = zzifdVar;
        zzibr.zzbu(zzifd.class, zzifdVar);
    }

    public static zzifc zzc() {
        return (zzifc) zzd.zzbn();
    }

    private zzifd() {
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
                                    synchronized (zzifd.class) {
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
                    return new zzifc(bArr);
                }
                return new zzifd();
            }
            return zzibr.zzbv(zzd, "\u0004\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\f\u0002Ȉ\u0003'", new Object[]{"zza", "zzb", "zzc"});
        }
        return (byte) 1;
    }
}
