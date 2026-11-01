package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzfod extends zzibr implements zzidd {
    private static final zzfod zzc;
    private static volatile zzidk zzd;
    private int zza;
    private long zzb;

    public final /* synthetic */ void zzb(long j10) {
        this.zzb = j10;
    }

    public final /* synthetic */ void zzd(int i10) {
        this.zza = i10 - 2;
    }

    static {
        zzfod zzfodVar = new zzfod();
        zzc = zzfodVar;
        zzibr.zzbu(zzfod.class, zzfodVar);
    }

    public static zzfoc zza() {
        return (zzfoc) zzc.zzbn();
    }

    private zzfod() {
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
                                    synchronized (zzfod.class) {
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
                    return new zzfoc(bArr);
                }
                return new zzfod();
            }
            return zzibr.zzbv(zzc, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0002", new Object[]{"zza", "zzb"});
        }
        return (byte) 1;
    }
}
