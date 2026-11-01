package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzfpn extends zzibr implements zzidd {
    private static final zzfpn zzg;
    private static volatile zzidk zzh;
    private int zzb;
    private int zzc;
    private boolean zzd;
    private boolean zzf;
    private String zza = "";
    private String zze = "";

    static {
        zzfpn zzfpnVar = new zzfpn();
        zzg = zzfpnVar;
        zzibr.zzbu(zzfpn.class, zzfpnVar);
    }

    private zzfpn() {
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
                                    synchronized (zzfpn.class) {
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
                    return new zzfpm(bArr);
                }
                return new zzfpn();
            }
            return zzibr.zzbv(zzg, "\u0004\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003\u0004\u0004\u0007\u0005Ȉ\u0006\u0007", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
