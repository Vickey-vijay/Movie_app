package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzifl extends zzibr implements zzidd {
    private static final zzifl zzb;
    private static volatile zzidk zzc;
    private zzicd zza = zzibr.zzbM();

    static {
        zzifl zziflVar = new zzifl();
        zzb = zziflVar;
        zzibr.zzbu(zzifl.class, zziflVar);
    }

    public static zzifk zzc() {
        return (zzifk) zzb.zzbn();
    }

    private zzifl() {
    }

    public final /* synthetic */ void zzd(zzifj zzifjVar) {
        zzifjVar.getClass();
        zzicd zzicdVar = this.zza;
        if (!zzicdVar.zza()) {
            this.zza = zzibr.zzbN(zzicdVar);
        }
        this.zza.add(zzifjVar);
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
                                    synchronized (zzifl.class) {
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
                    return new zzifk(bArr);
                }
                return new zzifl();
            }
            return zzibr.zzbv(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zza", zzifj.class});
        }
        return (byte) 1;
    }
}
