package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhpz extends zzibr implements zzidd {
    private static final zzhpz zzc;
    private static volatile zzidk zzd;
    private int zza;
    private int zzb;

    public static zzhpz zzd() {
        return zzc;
    }

    public final zzhpt zza() {
        zzhpt zzhptVarZzb = zzhpt.zzb(this.zza);
        return zzhptVarZzb == null ? zzhpt.UNRECOGNIZED : zzhptVarZzb;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final /* synthetic */ void zzg(int i10) {
        this.zzb = i10;
    }

    static {
        zzhpz zzhpzVar = new zzhpz();
        zzc = zzhpzVar;
        zzibr.zzbu(zzhpz.class, zzhpzVar);
    }

    public static zzhpy zzc() {
        return (zzhpy) zzc.zzbn();
    }

    private zzhpz() {
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
                                    synchronized (zzhpz.class) {
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
                    return new zzhpy(bArr);
                }
                return new zzhpz();
            }
            return zzibr.zzbv(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zza", "zzb"});
        }
        return (byte) 1;
    }

    public final /* synthetic */ void zze(zzhpt zzhptVar) {
        this.zza = zzhptVar.zza();
    }
}
