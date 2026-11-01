package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzhqc extends zzibr implements zzidd {
    private static final zzhqc zzd;
    private static volatile zzidk zze;
    private String zza = "";
    private zzian zzb = zzian.zza;
    private int zzc;

    public static zzhqc zze() {
        return zzd;
    }

    public final String zza() {
        return this.zza;
    }

    public final zzian zzb() {
        return this.zzb;
    }

    public final zzhqb zzc() {
        zzhqb zzhqbVar;
        int i10 = this.zzc;
        if (i10 == 0) {
            zzhqbVar = zzhqb.UNKNOWN_KEYMATERIAL;
        } else if (i10 == 1) {
            zzhqbVar = zzhqb.SYMMETRIC;
        } else if (i10 == 2) {
            zzhqbVar = zzhqb.ASYMMETRIC_PRIVATE;
        } else if (i10 != 3) {
            zzhqbVar = i10 != 4 ? null : zzhqb.REMOTE;
        } else {
            zzhqbVar = zzhqb.ASYMMETRIC_PUBLIC;
        }
        return zzhqbVar == null ? zzhqb.UNRECOGNIZED : zzhqbVar;
    }

    static {
        zzhqc zzhqcVar = new zzhqc();
        zzd = zzhqcVar;
        zzibr.zzbu(zzhqc.class, zzhqcVar);
    }

    public static zzhqa zzd() {
        return (zzhqa) zzd.zzbn();
    }

    private zzhqc() {
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
                                    synchronized (zzhqc.class) {
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
                    return new zzhqa(bArr);
                }
                return new zzhqc();
            }
            return zzibr.zzbv(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zza", "zzb", "zzc"});
        }
        return (byte) 1;
    }

    public final /* synthetic */ void zzg(String str) {
        str.getClass();
        this.zza = str;
    }

    public final /* synthetic */ void zzh(zzian zzianVar) {
        zzianVar.getClass();
        this.zzb = zzianVar;
    }

    public final /* synthetic */ void zzi(zzhqb zzhqbVar) {
        this.zzc = zzhqbVar.zza();
    }
}
