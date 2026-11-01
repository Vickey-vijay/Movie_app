package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhiv {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {0, 3, 6, 9, 12, 16, 19, 22, 25, 28};
    private static final int[] zzc = {0, 2, 3, 5, 6, 0, 1, 3, 4, 6};
    private static final int[] zzd = {67108863, 33554431};
    private static final int[] zze = {26, 25};

    public static void zza(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i10 = 0; i10 < 10; i10++) {
            jArr[i10] = jArr2[i10] + jArr3[i10];
        }
    }

    public static void zzb(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i10 = 0; i10 < 10; i10++) {
            jArr[i10] = jArr2[i10] - jArr3[i10];
        }
    }

    public static void zzc(long[] jArr, long[] jArr2) {
        int length = jArr.length;
        if (length != 19) {
            long[] jArr3 = new long[19];
            System.arraycopy(jArr, 0, jArr3, 0, length);
            jArr = jArr3;
        }
        long j10 = jArr[8];
        long j11 = jArr[18];
        long j12 = j10 + (j11 << 4);
        jArr[8] = j12;
        long j13 = j12 + j11 + j11;
        jArr[8] = j13;
        jArr[8] = j13 + j11;
        long j14 = jArr[7];
        long j15 = jArr[17];
        long j16 = j14 + (j15 << 4);
        jArr[7] = j16;
        long j17 = j16 + j15 + j15;
        jArr[7] = j17;
        jArr[7] = j17 + j15;
        long j18 = jArr[6];
        long j19 = jArr[16];
        long j20 = j18 + (j19 << 4);
        jArr[6] = j20;
        long j21 = j20 + j19 + j19;
        jArr[6] = j21;
        jArr[6] = j21 + j19;
        long j22 = jArr[5];
        long j23 = jArr[15];
        long j24 = j22 + (j23 << 4);
        jArr[5] = j24;
        long j25 = j24 + j23 + j23;
        jArr[5] = j25;
        jArr[5] = j25 + j23;
        long j26 = jArr[4];
        long j27 = jArr[14];
        long j28 = j26 + (j27 << 4);
        jArr[4] = j28;
        long j29 = j28 + j27 + j27;
        jArr[4] = j29;
        jArr[4] = j29 + j27;
        long j30 = jArr[3];
        long j31 = jArr[13];
        long j32 = j30 + (j31 << 4);
        jArr[3] = j32;
        long j33 = j32 + j31 + j31;
        jArr[3] = j33;
        jArr[3] = j33 + j31;
        long j34 = jArr[2];
        long j35 = jArr[12];
        long j36 = j34 + (j35 << 4);
        jArr[2] = j36;
        long j37 = j36 + j35 + j35;
        jArr[2] = j37;
        jArr[2] = j37 + j35;
        long j38 = jArr[1];
        long j39 = jArr[11];
        long j40 = j38 + (j39 << 4);
        jArr[1] = j40;
        long j41 = j40 + j39 + j39;
        jArr[1] = j41;
        jArr[1] = j41 + j39;
        long j42 = jArr[0];
        long j43 = jArr[10];
        long j44 = j42 + (j43 << 4);
        jArr[0] = j44;
        long j45 = j44 + j43 + j43;
        jArr[0] = j45;
        jArr[0] = j45 + j43;
        zzd(jArr);
        System.arraycopy(jArr, 0, jArr2, 0, 10);
    }

    public static void zzd(long[] jArr) {
        jArr[10] = 0;
        int i10 = 0;
        while (i10 < 10) {
            long j10 = jArr[i10];
            long j11 = j10 / 67108864;
            jArr[i10] = j10 - (j11 << 26);
            int i11 = i10 + 1;
            long j12 = jArr[i11] + j11;
            jArr[i11] = j12;
            long j13 = j12 / 33554432;
            jArr[i11] = j12 - (j13 << 25);
            i10 += 2;
            jArr[i10] = jArr[i10] + j13;
        }
        long j14 = jArr[0];
        long j15 = jArr[10];
        long j16 = j14 + (j15 << 4);
        jArr[0] = j16;
        long j17 = j16 + j15 + j15;
        jArr[0] = j17;
        long j18 = j17 + j15;
        jArr[0] = j18;
        jArr[10] = 0;
        long j19 = j18 / 67108864;
        jArr[0] = j18 - (j19 << 26);
        jArr[1] = jArr[1] + j19;
    }

    public static void zze(long[] jArr, long[] jArr2, long[] jArr3) {
        long j10 = jArr2[0];
        long j11 = jArr3[1] * j10;
        long j12 = jArr2[1];
        long j13 = jArr3[0];
        long j14 = jArr2[1];
        long j15 = jArr3[1];
        long j16 = ((j14 + j14) * j15) + (jArr3[2] * j10);
        long j17 = jArr3[2];
        long j18 = jArr2[2];
        long j19 = (j14 * j17) + (j18 * j15) + (jArr3[3] * j10);
        long j20 = jArr3[3];
        long j21 = jArr2[3];
        long j22 = (j14 * j20) + (j21 * j15);
        long j23 = (j18 * j17) + j22 + j22 + (jArr3[4] * j10);
        long j24 = jArr3[4];
        long j25 = jArr2[4];
        long j26 = (j18 * j20) + (j21 * j17) + (j14 * j24) + (j25 * j15) + (jArr3[5] * j10);
        long j27 = jArr3[5];
        long j28 = jArr2[5];
        long j29 = (j21 * j20) + (j14 * j27) + (j28 * j15);
        long j30 = j29 + j29 + (j18 * j24) + (j25 * j17) + (jArr3[6] * j10);
        long j31 = jArr3[6];
        long j32 = jArr2[6];
        long j33 = (j21 * j24) + (j25 * j20) + (j18 * j27) + (j28 * j17) + (j14 * j31) + (j32 * j15) + (jArr3[7] * j10);
        long j34 = jArr3[7];
        long j35 = jArr2[7];
        long j36 = (j21 * j27) + (j28 * j20) + (j14 * j34) + (j35 * j15);
        long j37 = (j25 * j24) + j36 + j36 + (j18 * j31) + (j32 * j17) + (jArr3[8] * j10);
        long j38 = jArr3[8];
        long j39 = jArr2[8];
        long j40 = (j25 * j27) + (j28 * j24) + (j21 * j31) + (j32 * j20) + (j18 * j34) + (j35 * j17) + (j14 * j38) + (j39 * j15) + (j10 * jArr3[9]);
        long j41 = jArr3[9];
        long j42 = jArr2[9];
        long j43 = (j28 * j27) + (j21 * j34) + (j35 * j20) + (j14 * j41) + (j15 * j42);
        long j44 = (j28 * j34) + (j35 * j27) + (j21 * j41) + (j20 * j42);
        long j45 = (j32 * j34) + (j35 * j31) + (j28 * j38) + (j39 * j27) + (j25 * j41);
        long j46 = (j35 * j34) + (j28 * j41) + (j27 * j42);
        long j47 = j46 + j46 + (j32 * j38);
        long j48 = (j35 * j38) + (j39 * j34) + (j32 * j41);
        long j49 = (j35 * j41) + (j34 * j42);
        zzc(new long[]{jArr2[0] * jArr3[0], j11 + (j12 * j13), j16 + (jArr2[2] * j13), j19 + (jArr2[3] * j13), j23 + (jArr2[4] * j13), j26 + (jArr2[5] * j13), j30 + (jArr2[6] * j13), j33 + (jArr2[7] * j13), j37 + (jArr2[8] * j13), j40 + (jArr2[9] * j13), j43 + j43 + (j25 * j31) + (j32 * j24) + (j18 * j38) + (j39 * j17), (j28 * j31) + (j32 * j27) + (j25 * j34) + (j35 * j24) + (j21 * j38) + (j39 * j20) + (j18 * j41) + (j17 * j42), (j32 * j31) + j44 + j44 + (j25 * j38) + (j39 * j24), j45 + (j24 * j42), j47 + (j39 * j31), j48 + (j31 * j42), (j39 * j38) + j49 + j49, (j39 * j41) + (j38 * j42), (j42 + j42) * j41}, jArr);
    }

    public static void zzf(long[] jArr, long[] jArr2) {
        long j10 = jArr2[0];
        long j11 = jArr2[0];
        long j12 = jArr2[1];
        long j13 = (j12 * j12) + (jArr2[2] * j11);
        long j14 = jArr2[2];
        long j15 = (j12 * j14) + (jArr2[3] * j11);
        long j16 = jArr2[3];
        long j17 = (j14 * j14) + (j12 * 4 * j16);
        long j18 = jArr2[4];
        long j19 = (j14 * j16) + (j12 * j18) + (jArr2[5] * j11);
        long j20 = jArr2[6] * j11;
        long j21 = jArr2[5];
        long j22 = (j16 * j16) + (j14 * j18) + j20 + ((j12 + j12) * j21);
        long j23 = jArr2[6];
        long j24 = (j16 * j18) + (j14 * j21) + (j12 * j23) + (jArr2[7] * j11);
        long j25 = jArr2[8] * j11;
        long j26 = jArr2[7];
        long j27 = (j12 * j26) + (j16 * j21);
        long j28 = (j14 * j23) + j25 + j27 + j27;
        long j29 = jArr2[8];
        long j30 = (j18 * j21) + (j16 * j23) + (j14 * j26) + (j12 * j29) + (j11 * jArr2[9]);
        long j31 = jArr2[9];
        long j32 = (j16 * j26) + (j12 * j31);
        long j33 = (j21 * j21) + (j18 * j23) + (j14 * j29) + j32 + j32;
        long j34 = (j21 * j23) + (j18 * j26) + (j16 * j29) + (j14 * j31);
        long j35 = (j21 * j26) + (j16 * j31);
        long j36 = (j18 * j29) + j35 + j35;
        long j37 = (j23 * j26) + (j21 * j29) + (j18 * j31);
        long j38 = (j26 * j26) + (j23 * j29) + ((j21 + j21) * j31);
        long j39 = (j26 * j29) + (j23 * j31);
        zzc(new long[]{j10 * j10, (j11 + j11) * jArr2[1], j13 + j13, j15 + j15, j17 + ((j11 + j11) * jArr2[4]), j19 + j19, j22 + j22, j24 + j24, (j18 * j18) + j28 + j28, j30 + j30, j33 + j33, j34 + j34, (j23 * j23) + j36 + j36, j37 + j37, j38 + j38, j39 + j39, (j29 * j29) + (j26 * 4 * j31), (j29 + j29) * j31, (j31 + j31) * j31}, jArr);
    }

    public static long[] zzg(byte[] bArr) {
        long[] jArr = new long[10];
        for (int i10 = 0; i10 < 10; i10++) {
            int i11 = zzb[i10];
            int i12 = bArr[i11] & 255;
            int i13 = bArr[i11 + 1] & 255;
            long j10 = ((long) i12) | (((long) i13) << 8);
            jArr[i10] = (((j10 | (((long) (bArr[i11 + 2] & 255)) << 16)) | (((long) (bArr[i11 + 3] & 255)) << 24)) >> zzc[i10]) & ((long) zzd[i10 & 1]);
        }
        return jArr;
    }

    public static byte[] zzh(long[] jArr) {
        int i10;
        long[] jArrCopyOf = Arrays.copyOf(jArr, 10);
        int i11 = 0;
        while (true) {
            if (i11 >= 2) {
                break;
            }
            int i12 = 0;
            while (i12 < 9) {
                long j10 = jArrCopyOf[i12];
                int i13 = zze[i12 & 1];
                int i14 = -((int) (((j10 >> 31) & j10) >> i13));
                jArrCopyOf[i12] = j10 + ((long) (i14 << i13));
                i12++;
                jArrCopyOf[i12] = jArrCopyOf[i12] - ((long) i14);
            }
            long j11 = jArrCopyOf[9];
            int i15 = -((int) (((j11 >> 31) & j11) >> 25));
            jArrCopyOf[9] = j11 + ((long) (i15 << 25));
            jArrCopyOf[0] = jArrCopyOf[0] - (((long) i15) * 19);
            i11++;
        }
        long j12 = jArrCopyOf[0];
        int i16 = -((int) (((j12 >> 31) & j12) >> 26));
        jArrCopyOf[0] = j12 + ((long) (i16 << 26));
        jArrCopyOf[1] = jArrCopyOf[1] - ((long) i16);
        int i17 = 0;
        for (i10 = 2; i17 < i10; i10 = 2) {
            int i18 = 0;
            while (i18 < 9) {
                long j13 = jArrCopyOf[i18];
                int i19 = i18 & 1;
                long j14 = j13 >> zze[i19];
                jArrCopyOf[i18] = j13 & ((long) zzd[i19]);
                i18++;
                jArrCopyOf[i18] = jArrCopyOf[i18] + ((long) ((int) j14));
            }
            i17++;
        }
        long j15 = jArrCopyOf[9];
        jArrCopyOf[9] = j15 & 33554431;
        long j16 = jArrCopyOf[0] + (((long) ((int) (j15 >> 25))) * 19);
        jArrCopyOf[0] = j16;
        int i20 = ~((((int) j16) - 67108845) >> 31);
        for (int i21 = 1; i21 < 10; i21++) {
            int i22 = ~(((int) jArrCopyOf[i21]) ^ zzd[i21 & 1]);
            int i23 = i22 & (i22 << 16);
            int i24 = i23 & (i23 << 8);
            int i25 = i24 & (i24 << 4);
            int i26 = i25 & (i25 << 2);
            i20 &= (i26 & (i26 + i26)) >> 31;
        }
        jArrCopyOf[0] = jArrCopyOf[0] - ((long) (67108845 & i20));
        long j17 = 33554431 & i20;
        jArrCopyOf[1] = jArrCopyOf[1] - j17;
        for (int i27 = 2; i27 < 10; i27 += 2) {
            jArrCopyOf[i27] = jArrCopyOf[i27] - ((long) (67108863 & i20));
            int i28 = i27 + 1;
            jArrCopyOf[i28] = jArrCopyOf[i28] - j17;
        }
        for (int i29 = 0; i29 < 10; i29++) {
            jArrCopyOf[i29] = jArrCopyOf[i29] << zzc[i29];
        }
        byte[] bArr = new byte[32];
        for (int i30 = 0; i30 < 10; i30++) {
            int i31 = zzb[i30];
            long j18 = bArr[i31];
            long j19 = jArrCopyOf[i30];
            bArr[i31] = (byte) (j18 | (j19 & 255));
            int i32 = i31 + 1;
            bArr[i32] = (byte) (((long) bArr[i32]) | ((j19 >> 8) & 255));
            int i33 = i31 + 2;
            bArr[i33] = (byte) (((long) bArr[i33]) | ((j19 >> 16) & 255));
            int i34 = i31 + 3;
            bArr[i34] = (byte) (((long) bArr[i34]) | ((j19 >> 24) & 255));
        }
        return bArr;
    }
}
