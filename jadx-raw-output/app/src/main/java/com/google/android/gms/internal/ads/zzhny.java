package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhny extends zzibr implements zzidd {
    private static final zzhny zzd;
    private static volatile zzidk zze;
    private int zza;
    private int zzb;
    private zzhoa zzc;

    public final int zza() {
        return this.zzb;
    }

    public final /* synthetic */ void zze(int i10) {
        this.zzb = i10;
    }

    static {
        zzhny zzhnyVar = new zzhny();
        zzd = zzhnyVar;
        zzibr.zzbu(zzhny.class, zzhnyVar);
    }

    public static zzhny zzc(zzian zzianVar, zzibb zzibbVar) throws zzicg {
        return (zzhny) zzibr.zzbT(zzd, zzianVar, zzibbVar);
    }

    public static zzhnx zzd() {
        return (zzhnx) zzd.zzbn();
    }

    public final zzhoa zzb() {
        zzhoa zzhoaVar = this.zzc;
        return zzhoaVar == null ? zzhoa.zzc() : zzhoaVar;
    }

    private zzhny() {
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
                                    synchronized (zzhny.class) {
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
                    return new zzhnx(bArr);
                }
                return new zzhny();
            }
            return zzibr.zzbv(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zza", "zzb", "zzc"});
        }
        return (byte) 1;
    }

    public final /* synthetic */ void zzg(zzhoa zzhoaVar) {
        zzhoaVar.getClass();
        this.zzc = zzhoaVar;
        this.zza |= 1;
    }
}
