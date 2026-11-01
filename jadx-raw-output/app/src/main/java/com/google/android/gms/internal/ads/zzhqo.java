package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzhqo extends zzibr implements zzidd {
    private static final zzhqo zze;
    private static volatile zzidk zzf;
    private String zza = "";
    private int zzb;
    private int zzc;
    private int zzd;

    public final /* synthetic */ void zzc(int i10) {
        this.zzc = i10;
    }

    static {
        zzhqo zzhqoVar = new zzhqo();
        zze = zzhqoVar;
        zzibr.zzbu(zzhqo.class, zzhqoVar);
    }

    public static zzhqn zza() {
        return (zzhqn) zze.zzbn();
    }

    private zzhqo() {
    }

    public final /* synthetic */ void zzb(String str) {
        str.getClass();
        this.zza = str;
    }

    public final /* synthetic */ void zzd(zzhqy zzhqyVar) {
        this.zzd = zzhqyVar.zza();
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
                                    synchronized (zzhqo.class) {
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
                    return new zzhqn(bArr);
                }
                return new zzhqo();
            }
            return zzibr.zzbv(zze, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        return (byte) 1;
    }

    public final /* synthetic */ void zzg(int i10) {
        this.zzb = zzhqd.zza(i10);
    }
}
