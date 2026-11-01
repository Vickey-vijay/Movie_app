package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhjp extends zzhbp {
    private final zzhlc zza;

    public zzhjp(zzhlc zzhlcVar) {
        this.zza = zzhlcVar;
    }

    public final int hashCode() {
        zzhlc zzhlcVar = this.zza;
        return Objects.hash(zzhlcVar.zzc(), zzhlcVar.zzf());
    }

    public final String toString() {
        String str;
        Object[] objArr = new Object[2];
        zzhlc zzhlcVar = this.zza;
        objArr[0] = zzhlcVar.zzc().zza();
        int iOrdinal = zzhlcVar.zzc().zzc().ordinal();
        if (iOrdinal == 1) {
            str = "TINK";
        } else if (iOrdinal == 2) {
            str = "LEGACY";
        } else if (iOrdinal != 3) {
            str = iOrdinal != 4 ? "UNKNOWN" : "CRUNCHY";
        } else {
            str = "RAW";
        }
        objArr[1] = str;
        return String.format("(typeUrl=%s, outputPrefixType=%s)", objArr);
    }

    public final zzhlc zzb() {
        return this.zza;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhjp)) {
            return false;
        }
        zzhlc zzhlcVar = ((zzhjp) obj).zza;
        zzhlc zzhlcVar2 = this.zza;
        return zzhlcVar2.zzc().zzc().equals(zzhlcVar.zzc().zzc()) && zzhlcVar2.zzc().zza().equals(zzhlcVar.zzc().zza()) && zzhlcVar2.zzc().zzb().equals(zzhlcVar.zzc().zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final boolean zza() {
        return this.zza.zzc().zzc() != zzhqy.RAW;
    }
}
