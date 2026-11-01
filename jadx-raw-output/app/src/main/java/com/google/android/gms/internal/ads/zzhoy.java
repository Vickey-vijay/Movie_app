package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhoy extends zzibr implements zzidd {
    private static final zzhoy zzc;
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
        zzhoy zzhoyVar = new zzhoy();
        zzc = zzhoyVar;
        zzibr.zzbu(zzhoy.class, zzhoyVar);
    }

    public static zzhoy zzc(zzian zzianVar, zzibb zzibbVar) throws zzicg {
        return (zzhoy) zzibr.zzbT(zzc, zzianVar, zzibbVar);
    }

    public static zzhox zzd() {
        return (zzhox) zzc.zzbn();
    }

    private zzhoy() {
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
                                    synchronized (zzhoy.class) {
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
                    return new zzhox(bArr);
                }
                return new zzhoy();
            }
            return zzibr.zzbv(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zzb", "zza"});
        }
        return (byte) 1;
    }
}
