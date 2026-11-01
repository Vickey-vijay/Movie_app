package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhou extends zzibr implements zzidd {
    private static final zzhou zzc;
    private static volatile zzidk zzd;
    private int zza;
    private int zzb;

    public final int zza() {
        return this.zza;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final /* synthetic */ void zze(int i10) {
        this.zza = i10;
    }

    static {
        zzhou zzhouVar = new zzhou();
        zzc = zzhouVar;
        zzibr.zzbu(zzhou.class, zzhouVar);
    }

    public static zzhou zzc(zzian zzianVar, zzibb zzibbVar) throws zzicg {
        return (zzhou) zzibr.zzbT(zzc, zzianVar, zzibbVar);
    }

    public static zzhot zzd() {
        return (zzhot) zzc.zzbn();
    }

    private zzhou() {
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
                                    synchronized (zzhou.class) {
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
                    return new zzhot(bArr);
                }
                return new zzhou();
            }
            return zzibr.zzbv(zzc, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zza", "zzb"});
        }
        return (byte) 1;
    }
}
