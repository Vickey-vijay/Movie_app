package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzhrc extends zzibr implements zzidd {
    private static final zzhrc zze;
    private static volatile zzidk zzf;
    private int zza;
    private zzhre zzb;
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
        zzhrc zzhrcVar = new zzhrc();
        zze = zzhrcVar;
        zzibr.zzbu(zzhrc.class, zzhrcVar);
    }

    public static zzhrc zzd(zzian zzianVar, zzibb zzibbVar) throws zzicg {
        return (zzhrc) zzibr.zzbT(zze, zzianVar, zzibbVar);
    }

    public static zzhrb zze() {
        return (zzhrb) zze.zzbn();
    }

    public final zzhre zza() {
        zzhre zzhreVar = this.zzb;
        return zzhreVar == null ? zzhre.zzc() : zzhreVar;
    }

    private zzhrc() {
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
                                    synchronized (zzhrc.class) {
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
                    return new zzhrb(bArr);
                }
                return new zzhrc();
            }
            return zzibr.zzbv(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\n", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        return (byte) 1;
    }

    public final /* synthetic */ void zzg(zzhre zzhreVar) {
        zzhreVar.getClass();
        this.zzb = zzhreVar;
        this.zza |= 1;
    }
}
