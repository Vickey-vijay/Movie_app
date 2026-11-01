package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzhsa extends zzibr implements zzidd {
    private static final zzhsa zzb;
    private static volatile zzidk zzc;
    private int zza;

    public static zzhsa zzc() {
        return zzb;
    }

    public final int zza() {
        return this.zza;
    }

    static {
        zzhsa zzhsaVar = new zzhsa();
        zzb = zzhsaVar;
        zzibr.zzbu(zzhsa.class, zzhsaVar);
    }

    public static zzhsa zzb(zzian zzianVar, zzibb zzibbVar) throws zzicg {
        return (zzhsa) zzibr.zzbT(zzb, zzianVar, zzibbVar);
    }

    private zzhsa() {
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
                                zzidk zzibmVar = zzc;
                                if (zzibmVar == null) {
                                    synchronized (zzhsa.class) {
                                        zzibmVar = zzc;
                                        if (zzibmVar == null) {
                                            zzibmVar = new zzibm(zzb);
                                            zzc = zzibmVar;
                                        }
                                    }
                                }
                                return zzibmVar;
                            }
                            throw null;
                        }
                        return zzb;
                    }
                    return new zzhrz(bArr);
                }
                return new zzhsa();
            }
            return zzibr.zzbv(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zza"});
        }
        return (byte) 1;
    }
}
