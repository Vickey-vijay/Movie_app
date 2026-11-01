package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhoo extends zzibr implements zzidd {
    private static final zzhoo zzd;
    private static volatile zzidk zze;
    private int zza;
    private zzhoq zzb;
    private int zzc;

    public final int zzb() {
        return this.zzc;
    }

    public final /* synthetic */ void zzg(int i10) {
        this.zzc = i10;
    }

    static {
        zzhoo zzhooVar = new zzhoo();
        zzd = zzhooVar;
        zzibr.zzbu(zzhoo.class, zzhooVar);
    }

    public static zzhoo zzc(zzian zzianVar, zzibb zzibbVar) throws zzicg {
        return (zzhoo) zzibr.zzbT(zzd, zzianVar, zzibbVar);
    }

    public static zzhon zzd() {
        return (zzhon) zzd.zzbn();
    }

    public final zzhoq zza() {
        zzhoq zzhoqVar = this.zzb;
        return zzhoqVar == null ? zzhoq.zzc() : zzhoqVar;
    }

    private zzhoo() {
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
                                    synchronized (zzhoo.class) {
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
                    return new zzhon(bArr);
                }
                return new zzhoo();
            }
            return zzibr.zzbv(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zza", "zzb", "zzc"});
        }
        return (byte) 1;
    }

    public final /* synthetic */ void zze(zzhoq zzhoqVar) {
        zzhoqVar.getClass();
        this.zzb = zzhoqVar;
        this.zza |= 1;
    }
}
