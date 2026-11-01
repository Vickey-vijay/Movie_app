package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzawc extends zzibr implements zzidd {
    private static final zzawc zzi;
    private static volatile zzidk zzj;
    private int zza;
    private long zzb;
    private long zzc;
    private int zzd;
    private long zzg;
    private String zze = "";
    private String zzf = "";
    private String zzh = "";

    public final /* synthetic */ void zzb(long j10) {
        this.zza |= 1;
        this.zzb = j10;
    }

    public final /* synthetic */ void zzc(long j10) {
        this.zza |= 2;
        this.zzc = j10;
    }

    public final /* synthetic */ void zzg(long j10) {
        this.zza |= 32;
        this.zzg = j10;
    }

    public final /* synthetic */ void zzh(String str) {
        this.zza |= 64;
        this.zzh = str;
    }

    public final /* synthetic */ void zzj(int i10) {
        this.zzd = i10 - 1;
        this.zza |= 4;
    }

    static {
        zzawc zzawcVar = new zzawc();
        zzi = zzawcVar;
        zzibr.zzbu(zzawc.class, zzawcVar);
    }

    public static zzawb zza() {
        return (zzawb) zzi.zzbn();
    }

    private zzawc() {
    }

    public final /* synthetic */ void zzd(String str) {
        str.getClass();
        this.zza |= 8;
        this.zze = str;
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
                                zzidk zzibmVar = zzj;
                                if (zzibmVar == null) {
                                    synchronized (zzawc.class) {
                                        zzibmVar = zzj;
                                        if (zzibmVar == null) {
                                            zzibmVar = new zzibm(zzi);
                                            zzj = zzibmVar;
                                        }
                                    }
                                }
                                return zzibmVar;
                            }
                            throw null;
                        }
                        return zzi;
                    }
                    return new zzawb(bArr);
                }
                return new zzawc();
            }
            return zzibr.zzbv(zzi, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003᠌\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဈ\u0006", new Object[]{"zza", "zzb", "zzc", "zzd", zzawd.zza, "zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }

    public final /* synthetic */ void zze(String str) {
        str.getClass();
        this.zza |= 16;
        this.zzf = str;
    }
}
