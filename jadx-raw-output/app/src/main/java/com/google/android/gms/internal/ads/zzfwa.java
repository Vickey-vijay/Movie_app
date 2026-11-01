package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzfwa extends zzibr implements zzidd {
    private static final zzfwa zzf;
    private static volatile zzidk zzg;
    private int zza;
    private zzibz zzb = zzibr.zzbC();
    private String zzc = "";
    private String zzd = "";
    private String zze = "";

    static {
        zzfwa zzfwaVar = new zzfwa();
        zzf = zzfwaVar;
        zzibr.zzbu(zzfwa.class, zzfwaVar);
    }

    public static zzfvz zza() {
        return (zzfvz) zzf.zzbn();
    }

    public final /* synthetic */ void zzd(int i10) {
        zzibz zzibzVar = this.zzb;
        if (!zzibzVar.zza()) {
            this.zzb = zzibr.zzbD(zzibzVar);
        }
        this.zzb.zzi(2);
    }

    private zzfwa() {
    }

    public final /* synthetic */ void zzb(String str) {
        str.getClass();
        this.zza |= 1;
        this.zzc = str;
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
                                zzidk zzibmVar = zzg;
                                if (zzibmVar == null) {
                                    synchronized (zzfwa.class) {
                                        zzibmVar = zzg;
                                        if (zzibmVar == null) {
                                            zzibmVar = new zzibm(zzf);
                                            zzg = zzibmVar;
                                        }
                                    }
                                }
                                return zzibmVar;
                            }
                            throw null;
                        }
                        return zzf;
                    }
                    return new zzfvz(bArr);
                }
                return new zzfwa();
            }
            return zzibr.zzbv(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ࠞ\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"zza", "zzb", zzfvy.zza, "zzc", "zzd", "zze"});
        }
        return (byte) 1;
    }
}
