package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzhrq extends zzibr implements zzidd {
    private static final zzhrq zzf;
    private static volatile zzidk zzg;
    private int zza;
    private int zzb;
    private zzhrm zzc;
    private zzian zzd;
    private zzian zze;

    public static zzhrq zzh() {
        return zzf;
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzian zzc() {
        return this.zzd;
    }

    public final zzian zzd() {
        return this.zze;
    }

    public final /* synthetic */ void zzj(int i10) {
        this.zzb = 0;
    }

    public final /* synthetic */ void zzl(zzian zzianVar) {
        this.zzd = zzianVar;
    }

    public final /* synthetic */ void zzm(zzian zzianVar) {
        this.zze = zzianVar;
    }

    static {
        zzhrq zzhrqVar = new zzhrq();
        zzf = zzhrqVar;
        zzibr.zzbu(zzhrq.class, zzhrqVar);
    }

    public static zzhrq zze(zzian zzianVar, zzibb zzibbVar) throws zzicg {
        return (zzhrq) zzibr.zzbT(zzf, zzianVar, zzibbVar);
    }

    public static zzhrp zzg() {
        return (zzhrp) zzf.zzbn();
    }

    public static zzidk zzi() {
        return zzf.zzbd();
    }

    public final zzhrm zzb() {
        zzhrm zzhrmVar = this.zzc;
        return zzhrmVar == null ? zzhrm.zze() : zzhrmVar;
    }

    private zzhrq() {
        zzian zzianVar = zzian.zza;
        this.zzd = zzianVar;
        this.zze = zzianVar;
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
                                    synchronized (zzhrq.class) {
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
                    return new zzhrp(bArr);
                }
                return new zzhrq();
            }
            return zzibr.zzbv(zzf, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        return (byte) 1;
    }

    public final /* synthetic */ void zzk(zzhrm zzhrmVar) {
        zzhrmVar.getClass();
        this.zzc = zzhrmVar;
        this.zza |= 1;
    }
}
