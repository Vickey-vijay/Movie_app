package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzgdu extends zzibr implements zzidd {
    private static final zzgdu zze;
    private static volatile zzidk zzf;
    private int zza;
    private int zzb = 0;
    private Object zzc;
    private int zzd;

    public static zzgdu zzg() {
        return zze;
    }

    public final zzbch zzc() {
        zzbch zzbchVarZzb = zzbch.zzb(this.zzd);
        return zzbchVarZzb == null ? zzbch.UNSUPPORTED : zzbchVarZzb;
    }

    static {
        zzgdu zzgduVar = new zzgdu();
        zze = zzgduVar;
        zzibr.zzbu(zzgdu.class, zzgduVar);
    }

    public static zzgdu zzd(zzian zzianVar) throws zzicg {
        return (zzgdu) zzibr.zzbS(zze, zzianVar);
    }

    public static zzgdt zze() {
        return (zzgdt) zze.zzbn();
    }

    public final zzbcp zza() {
        return this.zzb == 1 ? (zzbcp) this.zzc : zzbcp.zzj();
    }

    public final zzbcn zzb() {
        return this.zzb == 2 ? (zzbcn) this.zzc : zzbcn.zzd();
    }

    private zzgdu() {
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
                                    synchronized (zzgdu.class) {
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
                    return new zzgdt(bArr);
                }
                return new zzgdu();
            }
            return zzibr.zzbv(zze, "\u0004\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003᠌\u0000", new Object[]{"zzc", "zzb", "zza", zzbcp.class, zzbcn.class, "zzd", zzbch.zzc()});
        }
        return (byte) 1;
    }

    public final /* synthetic */ void zzh(zzbcp zzbcpVar) {
        zzbcpVar.getClass();
        this.zzc = zzbcpVar;
        this.zzb = 1;
    }

    public final /* synthetic */ void zzi(zzbcn zzbcnVar) {
        zzbcnVar.getClass();
        this.zzc = zzbcnVar;
        this.zzb = 2;
    }

    public final /* synthetic */ void zzj(zzbch zzbchVar) {
        this.zzd = zzbchVar.zza();
        this.zza |= 1;
    }
}
