package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzaxq extends zzibr implements zzidd {
    private static final zzaxq zzh;
    private static volatile zzidk zzi;
    private int zza;
    private long zzd;
    private long zzf;
    private long zzg;
    private String zzb = "";
    private String zzc = "";
    private String zze = "D";

    public final /* synthetic */ void zzb(String str) {
        this.zza |= 1;
        this.zzb = "0.825731049";
    }

    public final /* synthetic */ void zzd(long j10) {
        this.zza |= 4;
        this.zzd = j10;
    }

    public final /* synthetic */ void zzg(long j10) {
        this.zza |= 16;
        this.zzf = j10;
    }

    public final /* synthetic */ void zzh(long j10) {
        this.zza |= 32;
        this.zzg = j10;
    }

    static {
        zzaxq zzaxqVar = new zzaxq();
        zzh = zzaxqVar;
        zzibr.zzbu(zzaxq.class, zzaxqVar);
    }

    public static zzaxp zza() {
        return (zzaxp) zzh.zzbn();
    }

    private zzaxq() {
    }

    public final /* synthetic */ void zzc(String str) {
        str.getClass();
        this.zza |= 2;
        this.zzc = str;
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
                                    synchronized (zzaxq.class) {
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
                    return new zzaxp(bArr);
                }
                return new zzaxq();
            }
            return zzibr.zzbv(zzh, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဈ\u0003\u0005ဂ\u0004\u0006ဂ\u0005", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final /* synthetic */ void zze(String str) {
        str.getClass();
        this.zza |= 8;
        this.zze = str;
    }
}
