package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhpg extends zzibr implements zzidd {
    private static final zzhpg zzd;
    private static volatile zzidk zze;
    private int zza;
    private int zzb;
    private int zzc;

    public static zzhpg zzc() {
        return zzd;
    }

    public final zzhpt zza() {
        zzhpt zzhptVarZzb = zzhpt.zzb(this.zza);
        return zzhptVarZzb == null ? zzhpt.UNRECOGNIZED : zzhptVarZzb;
    }

    public final int zzg() {
        int i10 = this.zzb;
        int i11 = 5;
        if (i10 == 0) {
            i11 = 2;
        } else if (i10 == 2) {
            i11 = 4;
        } else if (i10 != 3) {
            if (i10 != 4) {
                i11 = i10 != 5 ? 0 : 7;
            } else {
                i11 = 6;
            }
        }
        if (i11 == 0) {
            return 1;
        }
        return i11;
    }

    public final int zzh() {
        int i10 = this.zzc;
        int i11 = 2;
        if (i10 != 0) {
            if (i10 != 1) {
                i11 = i10 != 2 ? 0 : 4;
            } else {
                i11 = 3;
            }
        }
        if (i11 == 0) {
            return 1;
        }
        return i11;
    }

    static {
        zzhpg zzhpgVar = new zzhpg();
        zzd = zzhpgVar;
        zzibr.zzbu(zzhpg.class, zzhpgVar);
    }

    public static zzhpf zzb() {
        return (zzhpf) zzd.zzbn();
    }

    private zzhpg() {
    }

    public final /* synthetic */ void zzd(zzhpt zzhptVar) {
        this.zza = zzhptVar.zza();
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
                                    synchronized (zzhpg.class) {
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
                    return new zzhpf(bArr);
                }
                return new zzhpg();
            }
            return zzibr.zzbv(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"zza", "zzb", "zzc"});
        }
        return (byte) 1;
    }

    public final /* synthetic */ void zzi(int i10) {
        this.zzb = zzhps.zza(i10);
    }

    public final /* synthetic */ void zzj(int i10) {
        this.zzc = zzhpl.zza(i10);
    }
}
