package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzfpc extends zzibr implements zzidd {
    private static final zzfpc zzi;
    private static volatile zzidk zzj;
    private long zzb;
    private long zzc;
    private boolean zzd;
    private long zze;
    private long zzf;
    private int zzh;
    private String zza = "";
    private String zzg = "";

    public final /* synthetic */ void zzc(long j10) {
        this.zzb = j10;
    }

    public final /* synthetic */ void zzd(long j10) {
        this.zzc = j10;
    }

    public final /* synthetic */ void zze(boolean z10) {
        this.zzd = z10;
    }

    public final /* synthetic */ void zzg(long j10) {
        this.zze = j10;
    }

    public final /* synthetic */ void zzh(long j10) {
        this.zzf = j10;
    }

    public final /* synthetic */ void zzk(int i10) {
        this.zzh = i10 - 2;
    }

    static {
        zzfpc zzfpcVar = new zzfpc();
        zzi = zzfpcVar;
        zzibr.zzbu(zzfpc.class, zzfpcVar);
    }

    public static zzfpb zza() {
        return (zzfpb) zzi.zzbn();
    }

    private zzfpc() {
    }

    public final /* synthetic */ void zzb(String str) {
        str.getClass();
        this.zza = str;
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
                                    synchronized (zzfpc.class) {
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
                    return new zzfpb(bArr);
                }
                return new zzfpc();
            }
            return zzibr.zzbv(zzi, "\u0004\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003\u0002\u0004\u0007\u0005\u0002\u0006\u0002\u0007Ȉ\b\f", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }

    public final /* synthetic */ void zzi(String str) {
        str.getClass();
        this.zzg = str;
    }
}
