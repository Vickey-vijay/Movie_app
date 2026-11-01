package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzhrk extends zzibr implements zzidd {
    private static final zzhrk zze;
    private static volatile zzidk zzf;
    private int zza;
    private zzhrm zzb;
    private int zzc;
    private zzian zzd = zzian.zza;

    public final int zzb() {
        return this.zzc;
    }

    public final zzian zzc() {
        return this.zzd;
    }

    public final /* synthetic */ void zzh(int i10) {
        this.zzc = i10;
    }

    public final /* synthetic */ void zzi(zzian zzianVar) {
        this.zzd = zzianVar;
    }

    static {
        zzhrk zzhrkVar = new zzhrk();
        zze = zzhrkVar;
        zzibr.zzbu(zzhrk.class, zzhrkVar);
    }

    public static zzhrk zzd(zzian zzianVar, zzibb zzibbVar) throws zzicg {
        return (zzhrk) zzibr.zzbT(zze, zzianVar, zzibbVar);
    }

    public static zzhrj zze() {
        return (zzhrj) zze.zzbn();
    }

    public final zzhrm zza() {
        zzhrm zzhrmVar = this.zzb;
        return zzhrmVar == null ? zzhrm.zze() : zzhrmVar;
    }

    private zzhrk() {
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
                                    synchronized (zzhrk.class) {
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
                    return new zzhrj(bArr);
                }
                return new zzhrk();
            }
            return zzibr.zzbv(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\n", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        return (byte) 1;
    }

    public final /* synthetic */ void zzg(zzhrm zzhrmVar) {
        zzhrmVar.getClass();
        this.zzb = zzhrmVar;
        this.zza |= 1;
    }
}
