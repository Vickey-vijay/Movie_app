package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzavi extends zzibr implements zzidd {
    private static final zzavi zzj;
    private static volatile zzidk zzk;
    private int zza;
    private int zzb;
    private boolean zze;
    private zzavz zzg;
    private zzawf zzh;
    private boolean zzi;
    private boolean zzc = true;
    private String zzd = "unknown_host";
    private boolean zzf = true;

    public final String zza() {
        return this.zzd;
    }

    @Deprecated
    public final boolean zzb() {
        return this.zze;
    }

    public final /* synthetic */ void zzh(boolean z10) {
        this.zza |= 8;
        this.zze = z10;
    }

    static {
        zzavi zzaviVar = new zzavi();
        zzj = zzaviVar;
        zzibr.zzbu(zzavi.class, zzaviVar);
    }

    public static zzavh zze() {
        return (zzavh) zzj.zzbn();
    }

    public final zzavz zzc() {
        zzavz zzavzVar = this.zzg;
        return zzavzVar == null ? zzavz.zzg() : zzavzVar;
    }

    public final zzawf zzd() {
        zzawf zzawfVar = this.zzh;
        return zzawfVar == null ? zzawf.zza() : zzawfVar;
    }

    private zzavi() {
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
                                    synchronized (zzavi.class) {
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
                    return new zzavh(bArr);
                }
                return new zzavi();
            }
            return zzibr.zzbv(zzj, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဇ\u0007", new Object[]{"zza", "zzb", zzavl.zza, "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }

    public final /* synthetic */ void zzg(String str) {
        str.getClass();
        this.zza |= 4;
        this.zzd = str;
    }
}
