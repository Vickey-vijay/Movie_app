package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzijl extends zzibr implements zzidd {
    private static final zzijl zzd;
    private static volatile zzidk zze;
    private int zza;
    private String zzb = "";
    private zzicd zzc = zzibr.zzbM();

    static {
        zzijl zzijlVar = new zzijl();
        zzd = zzijlVar;
        zzibr.zzbu(zzijl.class, zzijlVar);
    }

    private zzijl() {
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
                                    synchronized (zzijl.class) {
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
                    return new zzijk(bArr);
                }
                return new zzijl();
            }
            return zzibr.zzbv(zzd, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zza", "zzb", "zzc", zzijj.class});
        }
        return (byte) 1;
    }
}
