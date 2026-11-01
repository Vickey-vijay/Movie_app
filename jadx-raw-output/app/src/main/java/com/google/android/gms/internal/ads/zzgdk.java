package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzgdk extends zzibr implements zzidd {
    private static final zzgdk zzc;
    private static volatile zzidk zzd;
    private int zza;
    private zzavk zzb;

    static {
        zzgdk zzgdkVar = new zzgdk();
        zzc = zzgdkVar;
        zzibr.zzbu(zzgdk.class, zzgdkVar);
    }

    public static zzgdj zza() {
        return (zzgdj) zzc.zzbn();
    }

    private zzgdk() {
    }

    public final /* synthetic */ void zzb(zzavk zzavkVar) {
        zzavkVar.getClass();
        this.zzb = zzavkVar;
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
                                    synchronized (zzgdk.class) {
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
                    return new zzgdj(bArr);
                }
                return new zzgdk();
            }
            return zzibr.zzbv(zzc, "\u0004\u0001\u0000\u0001\u0012\u0012\u0001\u0000\u0000\u0000\u0012ဉ\u0000", new Object[]{"zza", "zzb"});
        }
        return (byte) 1;
    }
}
