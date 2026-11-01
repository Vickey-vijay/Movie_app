package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzigh extends zzibr implements zzidd {
    private static final zzigh zze;
    private static volatile zzidk zzf;
    private int zza;
    private zzian zzb;
    private zzian zzc;
    private byte zzd = 2;

    public final /* synthetic */ void zzd(zzian zzianVar) {
        this.zza |= 1;
        this.zzb = zzianVar;
    }

    public final /* synthetic */ void zze(zzian zzianVar) {
        this.zza |= 2;
        this.zzc = zzianVar;
    }

    static {
        zzigh zzighVar = new zzigh();
        zze = zzighVar;
        zzibr.zzbu(zzigh.class, zzighVar);
    }

    public static zzigg zzc() {
        return (zzigg) zze.zzbn();
    }

    private zzigh() {
        zzian zzianVar = zzian.zza;
        this.zzb = zzianVar;
        this.zzc = zzianVar;
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        byte b10 = 1;
        byte[] bArr = null;
        switch (zzibqVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.zzd);
            case SET_MEMOIZED_IS_INITIALIZED:
                if (obj == null) {
                    b10 = 0;
                }
                this.zzd = b10;
                return null;
            case BUILD_MESSAGE_INFO:
                return zzibr.zzbv(zze, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔊ\u0000\u0002ည\u0001", new Object[]{"zza", "zzb", "zzc"});
            case NEW_MUTABLE_INSTANCE:
                return new zzigh();
            case NEW_BUILDER:
                return new zzigg(bArr);
            case GET_DEFAULT_INSTANCE:
                return zze;
            case GET_PARSER:
                zzidk zzibmVar = zzf;
                if (zzibmVar == null) {
                    synchronized (zzigh.class) {
                        zzibmVar = zzf;
                        if (zzibmVar == null) {
                            zzibmVar = new zzibm(zze);
                            zzf = zzibmVar;
                        }
                        break;
                    }
                }
                return zzibmVar;
            default:
                throw null;
        }
    }
}
