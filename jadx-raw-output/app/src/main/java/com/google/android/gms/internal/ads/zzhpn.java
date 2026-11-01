package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhpn extends zzibr implements zzidd {
    private static final zzhpn zzb;
    private static volatile zzidk zzc;
    private int zza;

    public static zzhpn zzc() {
        return zzb;
    }

    public final int zza() {
        return this.zza;
    }

    static {
        zzhpn zzhpnVar = new zzhpn();
        zzb = zzhpnVar;
        zzibr.zzbu(zzhpn.class, zzhpnVar);
    }

    public static zzhpn zzb(zzian zzianVar, zzibb zzibbVar) throws zzicg {
        return (zzhpn) zzibr.zzbT(zzb, zzianVar, zzibbVar);
    }

    private zzhpn() {
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
                                zzidk zzibmVar = zzc;
                                if (zzibmVar == null) {
                                    synchronized (zzhpn.class) {
                                        zzibmVar = zzc;
                                        if (zzibmVar == null) {
                                            zzibmVar = new zzibm(zzb);
                                            zzc = zzibmVar;
                                        }
                                    }
                                }
                                return zzibmVar;
                            }
                            throw null;
                        }
                        return zzb;
                    }
                    return new zzhpm(bArr);
                }
                return new zzhpn();
            }
            return zzibr.zzbv(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zza"});
        }
        return (byte) 1;
    }
}
