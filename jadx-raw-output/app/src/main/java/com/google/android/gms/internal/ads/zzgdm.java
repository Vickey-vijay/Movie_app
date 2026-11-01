package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzgdm extends zzibr implements zzidd {
    private static final zzgdm zzd;
    private static volatile zzidk zze;
    private int zza;
    private zzicd zzb = zzibr.zzbM();
    private zzifd zzc;

    static {
        zzgdm zzgdmVar = new zzgdm();
        zzd = zzgdmVar;
        zzibr.zzbu(zzgdm.class, zzgdmVar);
    }

    public static zzgdl zza() {
        return (zzgdl) zzd.zzbn();
    }

    private zzgdm() {
    }

    public final /* synthetic */ void zzb(zzgdk zzgdkVar) {
        zzgdkVar.getClass();
        zzicd zzicdVar = this.zzb;
        if (!zzicdVar.zza()) {
            this.zzb = zzibr.zzbN(zzicdVar);
        }
        this.zzb.add(zzgdkVar);
    }

    public final /* synthetic */ void zzc(zzifd zzifdVar) {
        zzifdVar.getClass();
        this.zzc = zzifdVar;
        this.zza |= 1;
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
                                zzidk zzibmVar = zze;
                                if (zzibmVar == null) {
                                    synchronized (zzgdm.class) {
                                        zzibmVar = zze;
                                        if (zzibmVar == null) {
                                            zzibmVar = new zzibm(zzd);
                                            zze = zzibmVar;
                                        }
                                    }
                                }
                                return zzibmVar;
                            }
                            throw null;
                        }
                        return zzd;
                    }
                    return new zzgdl(bArr);
                }
                return new zzgdm();
            }
            return zzibr.zzbv(zzd, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zza", "zzb", zzgdk.class, "zzc"});
        }
        return (byte) 1;
    }
}
