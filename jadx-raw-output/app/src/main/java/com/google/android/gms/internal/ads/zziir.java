package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zziir extends zzibr implements zzidd {
    private static final zziir zzn;
    private static volatile zzidk zzo;
    private int zza;
    private int zzd;
    private boolean zzf;
    private boolean zzh;
    private int zzi;
    private int zzj;
    private zziiw zzk;
    private zziiq zzm;
    private String zzb = "";
    private String zzc = "";
    private int zze = 1;
    private String zzg = "";
    private String zzl = "";

    static {
        zziir zziirVar = new zziir();
        zzn = zziirVar;
        zzibr.zzbu(zziir.class, zziirVar);
    }

    private zziir() {
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
                                zzidk zzibmVar = zzo;
                                if (zzibmVar == null) {
                                    synchronized (zziir.class) {
                                        zzibmVar = zzo;
                                        if (zzibmVar == null) {
                                            zzibmVar = new zzibm(zzn);
                                            zzo = zzibmVar;
                                        }
                                    }
                                }
                                return zzibmVar;
                            }
                            throw null;
                        }
                        return zzn;
                    }
                    return new zziio(bArr);
                }
                return new zziir();
            }
            return zzibr.zzbv(zzn, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005ဇ\u0004\u0006ဈ\u0005\u0007ဇ\u0006\bင\u0007\t᠌\b\nဉ\t\u000bဈ\n\fဉ\u000b", new Object[]{"zza", "zzb", "zzc", "zzd", zzija.zza, "zze", zziiz.zza, "zzf", "zzg", "zzh", "zzi", "zzj", zziis.zza, "zzk", "zzl", "zzm"});
        }
        return (byte) 1;
    }
}
