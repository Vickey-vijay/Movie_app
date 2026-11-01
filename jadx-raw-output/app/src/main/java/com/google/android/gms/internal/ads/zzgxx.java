package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzgxx implements Serializable {
    private static final zzgxx zza = new zzgxx(new int[0], 0, 0);
    private final int[] zzb;
    private final int zzc;

    private zzgxx(int[] iArr, int i10, int i11) {
        this.zzb = iArr;
        this.zzc = i11;
    }

    public static zzgxx zza() {
        return zza;
    }

    public static zzgxx zzb(int[] iArr) {
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        return new zzgxx(iArrCopyOf, 0, iArrCopyOf.length);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgxx)) {
            return false;
        }
        zzgxx zzgxxVar = (zzgxx) obj;
        int i10 = this.zzc;
        if (i10 != zzgxxVar.zzc) {
            return false;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (zzd(i11) != zzgxxVar.zzd(i11)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = 1;
        for (int i10 = 0; i10 < this.zzc; i10++) {
            iHashCode = (iHashCode * 31) + Integer.hashCode(this.zzb[i10]);
        }
        return iHashCode;
    }

    public final int zzc() {
        return this.zzc;
    }

    public final String toString() {
        int i10 = this.zzc;
        if (i10 == 0) {
            return "[]";
        }
        StringBuilder sb2 = new StringBuilder(i10 * 5);
        sb2.append('[');
        int[] iArr = this.zzb;
        sb2.append(iArr[0]);
        for (int i11 = 1; i11 < i10; i11++) {
            sb2.append(", ");
            sb2.append(iArr[i11]);
        }
        sb2.append(']');
        return sb2.toString();
    }

    public final int zzd(int i10) {
        zzgrc.zzm(i10, this.zzc, "index");
        return this.zzb[i10];
    }
}
