package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzihm extends zzibr implements zzidd {
    private static final zzihm zzj;
    private static volatile zzidk zzk;
    private int zza;
    private long zzc;
    private boolean zzd;
    private int zze;
    private boolean zzh;
    private boolean zzi;
    private String zzb = "";
    private String zzf = "";
    private String zzg = "";

    public final /* synthetic */ void zzd(String str) {
        this.zza |= 1;
        this.zzb = str;
    }

    public final /* synthetic */ void zze(long j10) {
        this.zza |= 2;
        this.zzc = j10;
    }

    public final /* synthetic */ void zzg(boolean z10) {
        this.zza |= 4;
        this.zzd = z10;
    }

    static {
        zzihm zzihmVar = new zzihm();
        zzj = zzihmVar;
        zzibr.zzbu(zzihm.class, zzihmVar);
    }

    public static zzihl zzc() {
        return (zzihl) zzj.zzbn();
    }

    private zzihm() {
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
                                zzidk zzibmVar = zzk;
                                if (zzibmVar == null) {
                                    synchronized (zzihm.class) {
                                        zzibmVar = zzk;
                                        if (zzibmVar == null) {
                                            zzibmVar = new zzibm(zzj);
                                            zzk = zzibmVar;
                                        }
                                    }
                                }
                                return zzibmVar;
                            }
                            throw null;
                        }
                        return zzj;
                    }
                    return new zzihl(bArr);
                }
                return new zzihm();
            }
            return zzibr.zzbv(zzj, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဇ\u0002\u0004᠌\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဇ\u0006\bဇ\u0007", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", zzihn.zza, "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }
}
