package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzhqk extends zzibr implements zzidd {
    private static final zzhqk zzf;
    private static volatile zzidk zzg;
    private int zza;
    private zzhqc zzb;
    private int zzc;
    private int zzd;
    private int zze;

    public final boolean zza() {
        return (this.zza & 1) != 0;
    }

    public final int zzc() {
        return this.zzd;
    }

    public final zzhqy zzd() {
        zzhqy zzhqyVarZzb = zzhqy.zzb(this.zze);
        return zzhqyVarZzb == null ? zzhqy.UNRECOGNIZED : zzhqyVarZzb;
    }

    public final /* synthetic */ void zzh(int i10) {
        this.zzd = i10;
    }

    public final int zzk() {
        int i10 = this.zzc;
        int i11 = 3;
        if (i10 == 0) {
            i11 = 2;
        } else if (i10 != 1) {
            if (i10 != 2) {
                i11 = i10 != 3 ? 0 : 5;
            } else {
                i11 = 4;
            }
        }
        if (i11 == 0) {
            return 1;
        }
        return i11;
    }

    static {
        zzhqk zzhqkVar = new zzhqk();
        zzf = zzhqkVar;
        zzibr.zzbu(zzhqk.class, zzhqkVar);
    }

    public static zzhqj zze() {
        return (zzhqj) zzf.zzbn();
    }

    public final zzhqc zzb() {
        zzhqc zzhqcVar = this.zzb;
        return zzhqcVar == null ? zzhqc.zze() : zzhqcVar;
    }

    private zzhqk() {
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
                                    synchronized (zzhqk.class) {
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
                    return new zzhqj(bArr);
                }
                return new zzhqk();
            }
            return zzibr.zzbv(zzf, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        return (byte) 1;
    }

    public final /* synthetic */ void zzg(zzhqc zzhqcVar) {
        zzhqcVar.getClass();
        this.zzb = zzhqcVar;
        this.zza |= 1;
    }

    public final /* synthetic */ void zzi(zzhqy zzhqyVar) {
        this.zze = zzhqyVar.zza();
    }

    public final /* synthetic */ void zzl(int i10) {
        this.zzc = zzhqd.zza(i10);
    }
}
