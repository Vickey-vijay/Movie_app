package com.google.android.gms.internal.ads;

import java.math.BigInteger;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzhir {
    public static final zzhir zzd;
    public final BigInteger zza;
    public final BigInteger zzb;
    public final BigInteger zzc;

    static {
        BigInteger bigInteger = BigInteger.ONE;
        zzd = new zzhir(bigInteger, bigInteger, BigInteger.ZERO);
    }

    public zzhir(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.zza = bigInteger;
        this.zzb = bigInteger2;
        this.zzc = bigInteger3;
    }

    public final boolean zza() {
        return this.zzc.equals(BigInteger.ZERO);
    }
}
