package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzhqp extends zzibr implements zzidd {
    private static final zzhqp zzc;
    private static volatile zzidk zzd;
    private int zza;
    private zzicd zzb = zzibr.zzbM();

    public final /* synthetic */ void zzb(int i10) {
        this.zza = i10;
    }

    static {
        zzhqp zzhqpVar = new zzhqp();
        zzc = zzhqpVar;
        zzibr.zzbu(zzhqp.class, zzhqpVar);
    }

    public static zzhqm zza() {
        return (zzhqm) zzc.zzbn();
    }

    private zzhqp() {
    }

    public final /* synthetic */ void zzc(zzhqo zzhqoVar) {
        zzhqoVar.getClass();
        zzicd zzicdVar = this.zzb;
        if (!zzicdVar.zza()) {
            this.zzb = zzibr.zzbN(zzicdVar);
        }
        this.zzb.add(zzhqoVar);
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
                                zzidk zzibmVar = zzd;
                                if (zzibmVar == null) {
                                    synchronized (zzhqp.class) {
                                        zzibmVar = zzd;
                                        if (zzibmVar == null) {
                                            zzibmVar = new zzibm(zzc);
                                            zzd = zzibmVar;
                                        }
                                    }
                                }
                                return zzibmVar;
                            }
                            throw null;
                        }
                        return zzc;
                    }
                    return new zzhqm(bArr);
                }
                return new zzhqp();
            }
            return zzibr.zzbv(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zza", "zzb", zzhqo.class});
        }
        return (byte) 1;
    }
}
