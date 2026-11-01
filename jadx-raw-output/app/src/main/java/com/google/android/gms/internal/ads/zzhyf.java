package com.google.android.gms.internal.ads;

import java.math.BigInteger;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzhyf {
    private final BigInteger zza;

    private zzhyf(BigInteger bigInteger) {
        this.zza = bigInteger;
    }

    public static zzhyf zza(BigInteger bigInteger, zzhbt zzhbtVar) {
        return new zzhyf(bigInteger);
    }

    public final BigInteger zzb(zzhbt zzhbtVar) {
        return this.zza;
    }
}
