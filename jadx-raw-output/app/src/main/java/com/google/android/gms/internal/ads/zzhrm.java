package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzhrm extends zzibr implements zzidd {
    private static final zzhrm zzd;
    private static volatile zzidk zze;
    private int zza;
    private int zzb;
    private int zzc;

    public static zzhrm zze() {
        return zzd;
    }

    public final zzhpt zza() {
        zzhpt zzhptVarZzb = zzhpt.zzb(this.zza);
        return zzhptVarZzb == null ? zzhpt.UNRECOGNIZED : zzhptVarZzb;
    }

    public final zzhpt zzb() {
        zzhpt zzhptVarZzb = zzhpt.zzb(this.zzb);
        return zzhptVarZzb == null ? zzhpt.UNRECOGNIZED : zzhptVarZzb;
    }

    public final int zzc() {
        return this.zzc;
    }

    public final /* synthetic */ void zzi(int i10) {
        this.zzc = i10;
    }

    static {
        zzhrm zzhrmVar = new zzhrm();
        zzd = zzhrmVar;
        zzibr.zzbu(zzhrm.class, zzhrmVar);
    }

    public static zzhrl zzd() {
        return (zzhrl) zzd.zzbn();
    }

    private zzhrm() {
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
                                    synchronized (zzhrm.class) {
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
                    return new zzhrl(bArr);
                }
                return new zzhrm();
            }
            return zzibr.zzbv(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\u0004", new Object[]{"zza", "zzb", "zzc"});
        }
        return (byte) 1;
    }

    public final /* synthetic */ void zzg(zzhpt zzhptVar) {
        this.zza = zzhptVar.zza();
    }

    public final /* synthetic */ void zzh(zzhpt zzhptVar) {
        this.zzb = zzhptVar.zza();
    }
}
