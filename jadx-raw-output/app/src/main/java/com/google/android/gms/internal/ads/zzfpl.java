package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzfpl extends zzibr implements zzidd {
    private static final zzfpl zzc;
    private static volatile zzidk zzd;
    private zzicd zza = zzibr.zzbM();
    private long zzb;

    public final /* synthetic */ void zzc(long j10) {
        this.zzb = j10;
    }

    static {
        zzfpl zzfplVar = new zzfpl();
        zzc = zzfplVar;
        zzibr.zzbu(zzfpl.class, zzfplVar);
    }

    public static zzfpk zza() {
        return (zzfpk) zzc.zzbn();
    }

    private zzfpl() {
    }

    public final /* synthetic */ void zzb(zzfod zzfodVar) {
        zzfodVar.getClass();
        zzicd zzicdVar = this.zza;
        if (!zzicdVar.zza()) {
            this.zza = zzibr.zzbN(zzicdVar);
        }
        this.zza.add(zzfodVar);
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
                                    synchronized (zzfpl.class) {
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
                    return new zzfpk(bArr);
                }
                return new zzfpl();
            }
            return zzibr.zzbv(zzc, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0002", new Object[]{"zza", zzfod.class, "zzb"});
        }
        return (byte) 1;
    }
}
