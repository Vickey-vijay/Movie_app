package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgtn {
    public static Object zza(int i10) {
        if (i10 >= 2 && i10 <= 1073741824 && Integer.highestOneBit(i10) == i10) {
            if (i10 <= 256) {
                return new byte[i10];
            }
            return i10 <= 65536 ? new short[i10] : new int[i10];
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 41);
        sb2.append("must be power of 2 between 2^1 and 2^30: ");
        sb2.append(i10);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static int zzd(int i10) {
        return (i10 < 32 ? 4 : 2) * (i10 + 1);
    }

    public static int zzb(Object obj, int i10) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i10] & 255;
        }
        return obj instanceof short[] ? (char) ((short[]) obj)[i10] : ((int[]) obj)[i10];
    }

    public static void zzc(Object obj, int i10, int i11) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i10] = (byte) i11;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i10] = (short) i11;
        } else {
            ((int[]) obj)[i10] = i11;
        }
    }

    public static int zze(Object obj, Object obj2, int i10, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int iZzb = zzgty.zzb(obj);
        int i11 = iZzb & i10;
        int iZzb2 = zzb(obj3, i11);
        if (iZzb2 != 0) {
            int i12 = ~i10;
            int i13 = iZzb & i12;
            int i14 = -1;
            while (true) {
                int i15 = iZzb2 - 1;
                int i16 = iArr[i15];
                int i17 = i16 & i10;
                if ((i16 & i12) == i13 && Objects.equals(obj, objArr[i15]) && (objArr2 == null || Objects.equals(obj2, objArr2[i15]))) {
                    if (i14 == -1) {
                        zzc(obj3, i11, i17);
                    } else {
                        iArr[i14] = (iArr[i14] & i12) | (i17 & i10);
                    }
                    return i15;
                }
                if (i17 == 0) {
                    break;
                }
                i14 = i15;
                iZzb2 = i17;
            }
        }
        return -1;
    }
}
