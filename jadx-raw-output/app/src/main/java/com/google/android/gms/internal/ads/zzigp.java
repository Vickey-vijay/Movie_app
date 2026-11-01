package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzigp extends zzibr implements zzidd {
    private static final zzigp zzi;
    private static volatile zzidk zzj;
    private int zza;
    private zzigo zzb;
    private zzian zzd;
    private zzian zze;
    private int zzf;
    private zzian zzg;
    private byte zzh = 2;
    private zzicd zzc = zzibr.zzbM();

    static {
        zzigp zzigpVar = new zzigp();
        zzi = zzigpVar;
        zzibr.zzbu(zzigp.class, zzigpVar);
    }

    private zzigp() {
        zzian zzianVar = zzian.zza;
        this.zzd = zzianVar;
        this.zze = zzianVar;
        this.zzg = zzianVar;
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        byte b10 = 1;
        byte[] bArr = null;
        switch (zzibqVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.zzh);
            case SET_MEMOIZED_IS_INITIALIZED:
                if (obj == null) {
                    b10 = 0;
                }
                this.zzh = b10;
                return null;
            case BUILD_MESSAGE_INFO:
                return zzibr.zzbv(zzi, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003\u0006ည\u0004", new Object[]{"zza", "zzb", "zzc", zzigh.class, "zzd", "zze", "zzf", "zzg"});
            case NEW_MUTABLE_INSTANCE:
                return new zzigp();
            case NEW_BUILDER:
                return new zzigm(bArr);
            case GET_DEFAULT_INSTANCE:
                return zzi;
            case GET_PARSER:
                zzidk zzibmVar = zzj;
                if (zzibmVar == null) {
                    synchronized (zzigp.class) {
                        zzibmVar = zzj;
                        if (zzibmVar == null) {
                            zzibmVar = new zzibm(zzi);
                            zzj = zzibmVar;
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
