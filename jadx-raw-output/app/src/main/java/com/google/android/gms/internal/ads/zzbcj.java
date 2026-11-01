package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzbcj extends zzibr implements zzidd {
    private static final zzbcj zze;
    private static volatile zzidk zzf;
    private int zza;
    private zzbcp zzb;
    private zzian zzc;
    private zzian zzd;

    public final zzian zzb() {
        return this.zzc;
    }

    public final zzian zzc() {
        return this.zzd;
    }

    static {
        zzbcj zzbcjVar = new zzbcj();
        zze = zzbcjVar;
        zzibr.zzbu(zzbcj.class, zzbcjVar);
    }

    public static zzbcj zzd(zzian zzianVar, zzibb zzibbVar) throws zzicg {
        return (zzbcj) zzibr.zzbT(zze, zzianVar, zzibbVar);
    }

    public static zzbcj zze(byte[] bArr, zzibb zzibbVar) throws zzicg {
        return (zzbcj) zzibr.zzbV(zze, bArr, zzibbVar);
    }

    public final zzbcp zza() {
        zzbcp zzbcpVar = this.zzb;
        return zzbcpVar == null ? zzbcp.zzj() : zzbcpVar;
    }

    private zzbcj() {
        zzian zzianVar = zzian.zza;
        this.zzc = zzianVar;
        this.zzd = zzianVar;
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
                                zzidk zzibmVar = zzf;
                                if (zzibmVar == null) {
                                    synchronized (zzbcj.class) {
                                        zzibmVar = zzf;
                                        if (zzibmVar == null) {
                                            zzibmVar = new zzibm(zze);
                                            zzf = zzibmVar;
                                        }
                                    }
                                }
                                return zzibmVar;
                            }
                            throw null;
                        }
                        return zze;
                    }
                    return new zzbci(bArr);
                }
                return new zzbcj();
            }
            return zzibr.zzbv(zze, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        return (byte) 1;
    }
}
