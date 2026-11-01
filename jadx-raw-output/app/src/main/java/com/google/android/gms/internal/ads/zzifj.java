package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzifj extends zzibr implements zzidd {
    private static final zzifj zzd;
    private static volatile zzidk zze;
    private int zza;
    private long zzb;
    private long zzc;

    public final /* synthetic */ void zzd(int i10) {
        this.zza = i10;
    }

    public final /* synthetic */ void zze(long j10) {
        this.zzb = j10;
    }

    public final /* synthetic */ void zzg(long j10) {
        this.zzc = j10;
    }

    static {
        zzifj zzifjVar = new zzifj();
        zzd = zzifjVar;
        zzibr.zzbu(zzifj.class, zzifjVar);
    }

    public static zzifi zzc() {
        return (zzifi) zzd.zzbn();
    }

    private zzifj() {
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
                                    synchronized (zzifj.class) {
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
                    return new zzifi(bArr);
                }
                return new zzifj();
            }
            return zzibr.zzbv(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0002\u0003\u0002", new Object[]{"zza", "zzb", "zzc"});
        }
        return (byte) 1;
    }
}
