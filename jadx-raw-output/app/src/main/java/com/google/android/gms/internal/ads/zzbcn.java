package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzbcn extends zzibr implements zzidd {
    private static final zzbcn zzf;
    private static volatile zzidk zzg;
    private int zza;
    private zzbcr zzb;
    private zzian zzc = zzian.zza;
    private long zzd;
    private long zze;

    public static zzbcn zzd() {
        return zzf;
    }

    public final zzian zzb() {
        return this.zzc;
    }

    public final long zzc() {
        return this.zze;
    }

    static {
        zzbcn zzbcnVar = new zzbcn();
        zzf = zzbcnVar;
        zzibr.zzbu(zzbcn.class, zzbcnVar);
    }

    public final zzbcr zza() {
        zzbcr zzbcrVar = this.zzb;
        return zzbcrVar == null ? zzbcr.zzc() : zzbcrVar;
    }

    private zzbcn() {
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
                                zzidk zzibmVar = zzg;
                                if (zzibmVar == null) {
                                    synchronized (zzbcn.class) {
                                        zzibmVar = zzg;
                                        if (zzibmVar == null) {
                                            zzibmVar = new zzibm(zzf);
                                            zzg = zzibmVar;
                                        }
                                    }
                                }
                                return zzibmVar;
                            }
                            throw null;
                        }
                        return zzf;
                    }
                    return new zzbcm(bArr);
                }
                return new zzbcn();
            }
            return zzibr.zzbv(zzf, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        return (byte) 1;
    }
}
