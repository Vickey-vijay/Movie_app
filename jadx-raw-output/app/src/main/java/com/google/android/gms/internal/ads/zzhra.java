package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class zzhra extends zzibr implements zzidd {
    public static final /* synthetic */ int zza = 0;
    private static final zzhra zzd;
    private static volatile zzidk zze;
    private String zzb = "";
    private zzicd zzc = zzibr.zzbM();

    static {
        zzhra zzhraVar = new zzhra();
        zzd = zzhraVar;
        zzibr.zzbu(zzhra.class, zzhraVar);
    }

    private zzhra() {
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
                                    synchronized (zzhra.class) {
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
                    return new zzhqz(bArr);
                }
                return new zzhra();
            }
            return zzibr.zzbv(zzd, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zzb", "zzc", zzhqh.class});
        }
        return (byte) 1;
    }
}
