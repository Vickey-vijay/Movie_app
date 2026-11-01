package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzbcp extends zzibr implements zzidd {
    private static final zzbcp zzg;
    private static volatile zzidk zzh;
    private int zza;
    private String zzb = "";
    private String zzc = "";
    private long zzd;
    private long zze;
    private long zzf;

    public static zzbcp zzj() {
        return zzg;
    }

    public final String zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zzc;
    }

    public final long zzc() {
        return this.zzd;
    }

    public final long zzd() {
        return this.zze;
    }

    public final long zze() {
        return this.zzf;
    }

    public final /* synthetic */ void zzm(long j10) {
        this.zza |= 4;
        this.zzd = j10;
    }

    public final /* synthetic */ void zzn(long j10) {
        this.zza |= 8;
        this.zze = j10;
    }

    public final /* synthetic */ void zzo(long j10) {
        this.zza |= 16;
        this.zzf = j10;
    }

    static {
        zzbcp zzbcpVar = new zzbcp();
        zzg = zzbcpVar;
        zzibr.zzbu(zzbcp.class, zzbcpVar);
    }

    public static zzbcp zzg(zzian zzianVar) throws zzicg {
        return (zzbcp) zzibr.zzbS(zzg, zzianVar);
    }

    public static zzbcp zzh(zzian zzianVar, zzibb zzibbVar) throws zzicg {
        return (zzbcp) zzibr.zzbT(zzg, zzianVar, zzibbVar);
    }

    public static zzbco zzi() {
        return (zzbco) zzg.zzbn();
    }

    private zzbcp() {
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
                                zzidk zzibmVar = zzh;
                                if (zzibmVar == null) {
                                    synchronized (zzbcp.class) {
                                        zzibmVar = zzh;
                                        if (zzibmVar == null) {
                                            zzibmVar = new zzibm(zzg);
                                            zzh = zzibmVar;
                                        }
                                    }
                                }
                                return zzibmVar;
                            }
                            throw null;
                        }
                        return zzg;
                    }
                    return new zzbco(bArr);
                }
                return new zzbcp();
            }
            return zzibr.zzbv(zzg, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final /* synthetic */ void zzk(String str) {
        str.getClass();
        this.zza |= 1;
        this.zzb = str;
    }

    public final /* synthetic */ void zzl(String str) {
        str.getClass();
        this.zza |= 2;
        this.zzc = str;
    }
}
