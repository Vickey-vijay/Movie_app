package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzifx extends zzibr implements zzidd {
    private static final zzifx zzc;
    private static volatile zzidk zzd;
    private int zza;
    private String zzb = "";

    public final /* synthetic */ void zzd(String str) {
        this.zza |= 1;
        this.zzb = str;
    }

    static {
        zzifx zzifxVar = new zzifx();
        zzc = zzifxVar;
        zzibr.zzbu(zzifx.class, zzifxVar);
    }

    public static zzifw zzc() {
        return (zzifw) zzc.zzbn();
    }

    private zzifx() {
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
                                    synchronized (zzifx.class) {
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
                    return new zzifw(bArr);
                }
                return new zzifx();
            }
            return zzibr.zzbv(zzc, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zza", "zzb"});
        }
        return (byte) 1;
    }
}
