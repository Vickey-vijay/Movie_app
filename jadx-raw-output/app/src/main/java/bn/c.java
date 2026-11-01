package bn;

import androidx.exifinterface.media.ExifInterface;
import java.lang.reflect.Array;

/* JADX INFO: compiled from: UnixCrypt.java */
/* JADX INFO: loaded from: classes8.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f5505a = {58, 50, ExifInterface.START_CODE, 34, 26, 18, 10, 2, 60, 52, 44, 36, 28, 20, 12, 4, 62, 54, 46, 38, 30, 22, 14, 6, 64, 56, 48, 40, 32, 24, 16, 8, 57, 49, 41, 33, 25, 17, 9, 1, 59, 51, 43, 35, 27, 19, 11, 3, 61, 53, 45, 37, 29, 21, 13, 5, 63, 55, 47, 39, 31, 23, 15, 7};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f5506b = {32, 1, 2, 3, 4, 5, 4, 5, 6, 7, 8, 9, 8, 9, 10, 11, 12, 13, 12, 13, 14, 15, 16, 17, 16, 17, 18, 19, 20, 21, 20, 21, 22, 23, 24, 25, 24, 25, 26, 27, 28, 29, 28, 29, 30, 31, 32, 1};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f5507c = {57, 49, 41, 33, 25, 17, 9, 1, 58, 50, ExifInterface.START_CODE, 34, 26, 18, 10, 2, 59, 51, 43, 35, 27, 19, 11, 3, 60, 52, 44, 36, 63, 55, 47, 39, 31, 23, 15, 7, 62, 54, 46, 38, 30, 22, 14, 6, 61, 53, 45, 37, 29, 21, 13, 5, 28, 20, 12, 4};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f5508d = {1, 1, 2, 2, 2, 2, 2, 2, 1, 2, 2, 2, 2, 2, 2, 1};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f5509e = {9, 18, 14, 17, 11, 24, 1, 5, 22, 25, 3, 28, 15, 6, 21, 10, 35, 38, 23, 19, 12, 4, 26, 8, 43, 54, 16, 7, 27, 20, 13, 2, 0, 0, 41, 52, 31, 37, 47, 55, 0, 0, 30, 40, 51, 45, 33, 48, 0, 0, 44, 49, 39, 56, 34, 53, 0, 0, 46, ExifInterface.START_CODE, 50, 36, 29, 32};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[][] f5510f = {new byte[]{14, 4, 13, 1, 2, 15, 11, 8, 3, 10, 6, 12, 5, 9, 0, 7, 0, 15, 7, 4, 14, 2, 13, 1, 10, 6, 12, 11, 9, 5, 3, 8, 4, 1, 14, 8, 13, 6, 2, 11, 15, 12, 9, 7, 3, 10, 5, 0, 15, 12, 8, 2, 4, 9, 1, 7, 5, 11, 3, 14, 10, 0, 6, 13}, new byte[]{15, 1, 8, 14, 6, 11, 3, 4, 9, 7, 2, 13, 12, 0, 5, 10, 3, 13, 4, 7, 15, 2, 8, 14, 12, 0, 1, 10, 6, 9, 11, 5, 0, 14, 7, 11, 10, 4, 13, 1, 5, 8, 12, 6, 9, 3, 2, 15, 13, 8, 10, 1, 3, 15, 4, 2, 11, 6, 7, 12, 0, 5, 14, 9}, new byte[]{10, 0, 9, 14, 6, 3, 15, 5, 1, 13, 12, 7, 11, 4, 2, 8, 13, 7, 0, 9, 3, 4, 6, 10, 2, 8, 5, 14, 12, 11, 15, 1, 13, 6, 4, 9, 8, 15, 3, 0, 11, 1, 2, 12, 5, 10, 14, 7, 1, 10, 13, 0, 6, 9, 8, 7, 4, 15, 14, 3, 11, 5, 2, 12}, new byte[]{7, 13, 14, 3, 0, 6, 9, 10, 1, 2, 8, 5, 11, 12, 4, 15, 13, 8, 11, 5, 6, 15, 0, 3, 4, 7, 2, 12, 1, 10, 14, 9, 10, 6, 9, 0, 12, 11, 7, 13, 15, 1, 3, 14, 5, 2, 8, 4, 3, 15, 0, 6, 10, 1, 13, 8, 9, 4, 5, 11, 12, 7, 2, 14}, new byte[]{2, 12, 4, 1, 7, 10, 11, 6, 8, 5, 3, 15, 13, 0, 14, 9, 14, 11, 2, 12, 4, 7, 13, 1, 5, 0, 15, 10, 3, 9, 8, 6, 4, 2, 1, 11, 10, 13, 7, 8, 15, 9, 12, 5, 6, 3, 0, 14, 11, 8, 12, 7, 1, 14, 2, 13, 6, 15, 0, 9, 10, 4, 5, 3}, new byte[]{12, 1, 10, 15, 9, 2, 6, 8, 0, 13, 3, 4, 14, 7, 5, 11, 10, 15, 4, 2, 7, 12, 9, 5, 6, 1, 13, 14, 0, 11, 3, 8, 9, 14, 15, 5, 2, 8, 12, 3, 7, 0, 4, 10, 1, 13, 11, 6, 4, 3, 2, 12, 9, 5, 15, 10, 11, 14, 1, 7, 6, 0, 8, 13}, new byte[]{4, 11, 2, 14, 15, 0, 8, 13, 3, 12, 9, 7, 5, 10, 6, 1, 13, 0, 11, 7, 4, 9, 1, 10, 14, 3, 5, 12, 2, 15, 8, 6, 1, 4, 11, 13, 12, 3, 7, 14, 10, 15, 6, 8, 0, 5, 9, 2, 6, 11, 13, 8, 1, 4, 10, 7, 9, 5, 0, 15, 14, 2, 3, 12}, new byte[]{13, 2, 8, 4, 6, 15, 11, 1, 10, 9, 3, 14, 5, 0, 12, 7, 1, 15, 13, 8, 10, 3, 7, 4, 12, 5, 6, 11, 0, 14, 9, 2, 7, 11, 4, 1, 9, 12, 14, 2, 0, 6, 10, 13, 15, 3, 5, 8, 2, 1, 14, 7, 4, 10, 8, 13, 15, 12, 9, 0, 3, 5, 6, 11}};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte[] f5511g = {16, 7, 20, 21, 29, 12, 28, 17, 1, 15, 23, 26, 5, 18, 31, 10, 2, 8, 24, 14, 32, 27, 3, 9, 19, 13, 30, 6, 22, 11, 4, 25};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f5512h = {1, 2, 3, 4, 17, 18, 19, 20, 5, 6, 7, 8, 21, 22, 23, 24, 9, 10, 11, 12, 25, 26, 27, 28, 13, 14, 15, 16, 29, 30, 31, 32, 33, 34, 35, 36, 49, 50, 51, 52, 37, 38, 39, 40, 53, 54, 55, 56, 41, ExifInterface.START_CODE, 43, 44, 57, 58, 59, 60, 45, 46, 47, 48, 61, 62, 63, 64};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final byte[] f5513i = {46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final byte[] f5514j = new byte[128];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final long[][] f5515k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final long[][][] f5516l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final long[][] f5517m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final long[][] f5518n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final long[][] f5519o;

    public static void d(long[][] jArr, byte[] bArr, int i10) {
        for (int i11 = 0; i11 < i10 * 8; i11++) {
            int i12 = bArr[i11] - 1;
            if (i12 >= 0) {
                int i13 = i12 >> 2;
                int i14 = 1 << (i12 & 3);
                for (int i15 = 0; i15 < 16; i15++) {
                    int i16 = (i11 & 7) + ((7 - (i11 >> 3)) << 3);
                    if ((i15 & i14) != 0) {
                        long[] jArr2 = jArr[i13];
                        jArr2[i15] = jArr2[i15] | (1 << i16);
                    }
                }
            }
        }
    }

    public static long e(int i10, long[][] jArr) {
        long j10 = 0;
        int i11 = 4;
        while (true) {
            i11--;
            if (i11 < 0) {
                return j10;
            }
            int i12 = i10 & 255;
            i10 >>= 8;
            int i13 = i11 << 1;
            j10 = j10 | jArr[i13][i12 & 15] | jArr[i13 + 1][i12 >> 4];
        }
    }

    public static int g(int i10) {
        return ((i10 >> 16) & 252) | ((i10 << 26) & (-67108864)) | ((i10 << 12) & 16515072) | ((i10 >> 2) & 64512);
    }

    public static long h(long j10) {
        return ((j10 >> 16) & 1082331758844L) | ((j10 << 26) & (-288230371923853312L)) | ((j10 << 12) & 70931694147600384L) | ((j10 >> 2) & 277076930264064L);
    }

    static {
        int i10 = 64;
        int i11 = 8;
        int i12 = 2;
        int i13 = 3;
        int i14 = 32;
        Class cls = Long.TYPE;
        f5515k = (long[][]) Array.newInstance((Class<?>) cls, 16, 16);
        f5516l = (long[][][]) Array.newInstance((Class<?>) cls, 2, 16, 16);
        f5517m = (long[][]) Array.newInstance((Class<?>) cls, 8, 16);
        f5518n = (long[][]) Array.newInstance((Class<?>) cls, 8, 64);
        f5519o = (long[][]) Array.newInstance((Class<?>) cls, 16, 16);
        byte[] bArr = new byte[64];
        byte[] bArr2 = new byte[64];
        for (int i15 = 0; i15 < 64; i15++) {
            f5514j[f5513i[i15]] = (byte) i15;
        }
        for (int i16 = 0; i16 < 64; i16++) {
            bArr[i16] = 0;
        }
        for (int i17 = 0; i17 < 64; i17++) {
            byte b10 = f5509e[i17];
            if (b10 != 0) {
                byte b11 = f5508d[0];
                int i18 = b10 + (b11 - 1);
                if (i18 % 28 < b11) {
                    i18 -= 28;
                }
                int i19 = f5507c[i18];
                if (i19 > 0) {
                    int i20 = i19 - 1;
                    i19 = ((i20 | 7) - (i20 & 7)) + 1;
                }
                bArr[i17] = (byte) i19;
            }
        }
        d(f5515k, bArr, 8);
        for (int i21 = 0; i21 < 2; i21++) {
            for (int i22 = 0; i22 < 64; i22++) {
                bArr2[i22] = 0;
                bArr[i22] = 0;
            }
            for (int i23 = 0; i23 < 64; i23++) {
                byte b12 = f5509e[i23];
                if (b12 != 0) {
                    bArr2[b12 - 1] = (byte) (i23 + 1);
                }
            }
            for (int i24 = 0; i24 < 64; i24++) {
                byte b13 = f5509e[i24];
                if (b13 != 0) {
                    int i25 = b13 + i21;
                    if (i25 % 28 <= i21) {
                        i25 -= 28;
                    }
                    bArr[i24] = bArr2[i25];
                }
            }
            d(f5516l[i21], bArr, 8);
        }
        for (int i26 = 0; i26 < 8; i26++) {
            int i27 = 0;
            while (i27 < 8) {
                int i28 = i27 < 2 ? 0 : f5505a[f5506b[((i26 * 6) + i27) - 2] - 1];
                if (i28 > 32) {
                    i28 -= 32;
                } else if (i28 > 0) {
                    i28--;
                }
                if (i28 > 0) {
                    int i29 = i28 - 1;
                    i28 = ((i29 | 7) - (i29 & 7)) + 1;
                }
                bArr[(i26 * 8) + i27] = (byte) i28;
                i27++;
            }
        }
        d(f5517m, bArr, 8);
        int i30 = 0;
        while (i30 < 64) {
            int i31 = f5505a[f5512h[i30] - 1];
            if (i31 > 0) {
                int i32 = i31 - 1;
                i31 = ((i32 | 7) - (i32 & 7)) + 1;
            }
            i30++;
            bArr[i31 - 1] = (byte) i30;
        }
        d(f5519o, bArr, 8);
        for (int i33 = 0; i33 < 48; i33++) {
            bArr[i33] = f5511g[f5506b[i33] - 1];
        }
        int i34 = 0;
        while (i34 < i11) {
            int i35 = 0;
            while (i35 < i10) {
                byte b14 = f5510f[i34][(((i35 >> 0) & 1) << 5) | (((i35 >> 1) & 1) << i13) | (((i35 >> 2) & 1) << i12) | (((i35 >> 3) & 1) << 1) | (((i35 >> 4) & 1) << 0) | (((i35 >> 5) & 1) << 4)];
                int i36 = (((b14 >> 0) & 1) << i13) | (((b14 >> 3) & 1) << 0) | (((b14 >> 2) & 1) << 1) | (((b14 >> 1) & 1) << i12);
                for (int i37 = 0; i37 < i14; i37++) {
                    bArr2[i37] = 0;
                }
                for (int i38 = 0; i38 < 4; i38++) {
                    bArr2[(i34 * 4) + i38] = (byte) ((i36 >> i38) & 1);
                }
                long j10 = 0;
                int i39 = 24;
                while (true) {
                    i39--;
                    if (i39 >= 0) {
                        j10 = (((long) bArr2[bArr[i39] - 1]) << i14) | (j10 << 1) | ((long) bArr2[bArr[i39 + 24] - 1]);
                        i14 = 32;
                    }
                }
                f5518n[i34][i35] = h(j10);
                i35++;
                i10 = 64;
                i14 = 32;
                i12 = 2;
                i13 = 3;
            }
            i34++;
            i10 = 64;
            i11 = 8;
            i14 = 32;
            i12 = 2;
            i13 = 3;
        }
    }

    public static String a(String str, String str2) {
        byte[] bArr = new byte[13];
        if (str == null || str2 == null) {
            return "*";
        }
        int length = str.length();
        long jCharAt = 0;
        int i10 = 0;
        while (i10 < 8) {
            jCharAt = (jCharAt << 8) | ((long) (i10 < length ? str.charAt(i10) * 2 : 0));
            i10++;
        }
        long[] jArrC = c(jCharAt);
        int i11 = 0;
        int i12 = 2;
        while (true) {
            i12--;
            if (i12 < 0) {
                break;
            }
            char cCharAt = i12 < str2.length() ? str2.charAt(i12) : '.';
            bArr[i12] = (byte) cCharAt;
            i11 = (i11 << 6) | (f5514j[cCharAt] & 255);
        }
        long jB = b(0L, i11, 25, jArrC);
        int i13 = 12;
        bArr[12] = f5513i[(((int) jB) << 2) & 63];
        char c10 = 4;
        while (true) {
            jB >>= c10;
            i13--;
            if (i13 < 2) {
                return new String(bArr, 0, 13);
            }
            bArr[i13] = f5513i[((int) jB) & 63];
            c10 = 6;
        }
    }

    public static long[] c(long j10) {
        long jF = f(j10, f5515k);
        long[] jArr = new long[16];
        jArr[0] = jF & (-217020518463700993L);
        for (int i10 = 1; i10 < 16; i10++) {
            jArr[i10] = jF;
            jF = f(jF, f5516l[f5508d[i10] - 1]);
            jArr[i10] = jF & (-217020518463700993L);
        }
        return jArr;
    }

    public static long f(long j10, long[][] jArr) {
        long j11 = 0;
        int i10 = 8;
        while (true) {
            i10--;
            if (i10 < 0) {
                return j11;
            }
            int i11 = (int) (255 & j10);
            j10 >>= 8;
            int i12 = i10 << 1;
            j11 = j11 | jArr[i12][i11 & 15] | jArr[i12 + 1][i11 >> 4];
        }
    }

    public static long b(long j10, int i10, int i11, long[] jArr) {
        int iG = g(i10);
        long j11 = j10 & 6148914691236517205L;
        char c10 = 1;
        long j12 = (j10 & (-6148914694099828736L)) | ((j10 >> 1) & 1431655765);
        char c11 = ' ';
        long j13 = 4294967295L;
        long[][] jArr2 = f5517m;
        long jE = e((int) (((((j11 << 32) | (j11 << 1)) & (-4294967296L)) | ((j12 | (j12 >> 32)) & 4294967295L)) >> 32), jArr2);
        long j14 = jE;
        long jE2 = e((int) (jE & (-1)), jArr2);
        int i12 = i11;
        while (true) {
            i12--;
            if (i12 >= 0) {
                char c12 = 0;
                int i13 = 0;
                while (i13 < 8) {
                    int i14 = i13 << 1;
                    long j15 = iG;
                    long j16 = ((jE2 >> c11) ^ jE2) & j15 & j13;
                    long j17 = ((j16 | (j16 << c11)) ^ jE2) ^ jArr[i14];
                    long[][] jArr3 = f5518n;
                    long[] jArr4 = jArr3[c12];
                    long j18 = jArr4[(int) ((j17 >> 58) & 63)];
                    long[] jArr5 = jArr3[c10];
                    long j19 = j18 ^ jArr5[(int) ((j17 >> 50) & 63)];
                    long[] jArr6 = jArr3[2];
                    long j20 = jArr6[(int) ((j17 >> 42) & 63)] ^ j19;
                    long[] jArr7 = jArr3[3];
                    long j21 = j14;
                    long j22 = j20 ^ jArr7[(int) ((j17 >> 34) & 63)];
                    long[] jArr8 = jArr3[4];
                    int i15 = i13;
                    long j23 = j22 ^ jArr8[(int) ((j17 >> 26) & 63)];
                    long[] jArr9 = jArr3[5];
                    long j24 = j23 ^ jArr9[(int) ((j17 >> 18) & 63)];
                    long[] jArr10 = jArr3[6];
                    long j25 = j24 ^ jArr10[(int) ((j17 >> 10) & 63)];
                    long[] jArr11 = jArr3[7];
                    long j26 = j21 ^ (j25 ^ jArr11[(int) ((j17 >> 2) & 63)]);
                    long j27 = ((j26 >> 32) ^ j26) & j15 & 4294967295L;
                    long j28 = ((j27 | (j27 << 32)) ^ j26) ^ jArr[i14 + 1];
                    jE2 ^= ((((((jArr5[(int) ((j28 >> 50) & 63)] ^ jArr4[(int) ((j28 >> 58) & 63)]) ^ jArr6[(int) ((j28 >> 42) & 63)]) ^ jArr7[(int) ((j28 >> 34) & 63)]) ^ jArr8[(int) ((j28 >> 26) & 63)]) ^ jArr9[(int) ((j28 >> 18) & 63)]) ^ jArr10[(int) ((j28 >> 10) & 63)]) ^ jArr11[(int) ((j28 >> 2) & 63)];
                    i13 = i15 + 1;
                    j14 = j26;
                    j13 = 4294967295L;
                    c12 = 0;
                    c10 = 1;
                    c11 = ' ';
                }
                long j29 = j14 ^ jE2;
                jE2 ^= j29;
                j14 = j29 ^ jE2;
                c10 = 1;
                c11 = ' ';
            } else {
                return f((((jE2 & (-1)) << 1) & 4042322160L) | (252645135 & (jE2 >> 35)) | ((((j14 >> 35) & 252645135) | (((j14 & (-1)) << 1) & 4042322160L)) << 32), f5519o);
            }
        }
    }
}
