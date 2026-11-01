package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzbcd extends zzibr implements zzidd {
    private static final zzbcd zzh;
    private static volatile zzidk zzi;
    private int zza;
    private long zzc;
    private long zzf;
    private zzian zzb = zzian.zza;
    private String zzd = "";
    private String zze = "";
    private String zzg = "";

    public final /* synthetic */ void zzb(zzian zzianVar) {
        this.zza |= 1;
        this.zzb = zzianVar;
    }

    public final /* synthetic */ void zzc(long j10) {
        this.zza |= 2;
        this.zzc = j10;
    }

    public final /* synthetic */ void zzg(long j10) {
        this.zza |= 16;
        this.zzf = j10;
    }

    static {
        zzbcd zzbcdVar = new zzbcd();
        zzh = zzbcdVar;
        zzibr.zzbu(zzbcd.class, zzbcdVar);
    }

    public static zzbcc zza() {
        return (zzbcc) zzh.zzbn();
    }

    private zzbcd() {
    }

    public final /* synthetic */ void zzd(String str) {
        str.getClass();
        this.zza |= 4;
        this.zzd = str;
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
                                zzidk zzibmVar = zzi;
                                if (zzibmVar == null) {
                                    synchronized (zzbcd.class) {
                                        zzibmVar = zzi;
                                        if (zzibmVar == null) {
                                            zzibmVar = new zzibm(zzh);
                                            zzi = zzibmVar;
                                        }
                                    }
                                }
                                return zzibmVar;
                            }
                            throw null;
                        }
                        return zzh;
                    }
                    return new zzbcc(bArr);
                }
                return new zzbcd();
            }
            return zzibr.zzbv(zzh, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ည\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဂ\u0004\u0006ဈ\u0005", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final /* synthetic */ void zze(String str) {
        str.getClass();
        this.zza |= 8;
        this.zze = str;
    }

    public final /* synthetic */ void zzh(String str) {
        str.getClass();
        this.zza |= 32;
        this.zzg = str;
    }
}
