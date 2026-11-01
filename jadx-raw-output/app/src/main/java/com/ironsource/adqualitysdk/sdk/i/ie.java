package com.ironsource.adqualitysdk.sdk.i;

import androidx.exifinterface.media.ExifInterface;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes9.dex */
public class ie {

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f2454 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f2455;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static /* synthetic */ boolean f2456;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2457;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static final byte[] f2458;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static final byte[] f2459;

    /* JADX WARN: Code duplicated, block: B:14:0x001d  */
    /* JADX WARN: Code duplicated, block: B:15:0x0024  */
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static byte[] m2463(byte[] bArr, int i10, int i11, byte[] bArr2, int i12, byte[] bArr3) {
        int i13;
        int i14;
        int i15 = f2457 + 107;
        int i16 = i15 % 128;
        f2454 = i16;
        int i17 = 0;
        if (i15 % 2 == 0) {
            int i18 = 75 / 0;
            if (i11 > 0) {
                i13 = (bArr[i10] << 24) >>> 8;
            } else {
                i13 = 0;
            }
        } else {
            if (i11 > 0) {
                i13 = (bArr[i10] << 24) >>> 8;
            } else {
                i13 = 0;
            }
        }
        if ((i11 > 1 ? ']' : (char) 17) != ']') {
            i14 = 0;
        } else {
            int i19 = i16 + 23;
            f2457 = i19 % 128;
            int i20 = i19 % 2;
            i14 = (bArr[i10 + 1] << 24) >>> 16;
        }
        int i21 = i13 | i14;
        if (!(i11 <= 2)) {
            int i22 = f2457 + 51;
            f2454 = i22 % 128;
            int i23 = i22 % 2;
            i17 = (bArr[i10 + 2] << 24) >>> 24;
        }
        int i24 = i21 | i17;
        if (i11 == 1) {
            bArr2[i12] = bArr3[i24 >>> 18];
            bArr2[i12 + 1] = bArr3[(i24 >>> 12) & 63];
            bArr2[i12 + 2] = 61;
            bArr2[i12 + 3] = 61;
            int i25 = f2457 + 107;
            f2454 = i25 % 128;
            int i26 = i25 % 2;
            return bArr2;
        }
        if (i11 == 2) {
            bArr2[i12] = bArr3[i24 >>> 18];
            bArr2[i12 + 1] = bArr3[(i24 >>> 12) & 63];
            bArr2[i12 + 2] = bArr3[(i24 >>> 6) & 63];
            bArr2[i12 + 3] = 61;
            return bArr2;
        }
        if (i11 != 3) {
            return bArr2;
        }
        bArr2[i12] = bArr3[i24 >>> 18];
        bArr2[i12 + 1] = bArr3[(i24 >>> 12) & 63];
        bArr2[i12 + 2] = bArr3[(i24 >>> 6) & 63];
        bArr2[i12 + 3] = bArr3[i24 & 63];
        return bArr2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static void m2465() {
        f2455 = new char[]{16, 'J', 'l', 'l', 'l', 'f', 'j', 'G', 'B', 'l', 'v', 'm', 'A', 'J', 'j', '@', '#', '2', '2', '#', 'B', 'l', 'v', 'm', 'A', 'C', 'j', 'k', 'f', 'd', 'b', 'h', 'H', 'B', 'f', 'j', 'f', 'k', 'r', 'k', '2', 'B', '#', '2', '2', '#', 'C', 'c', 'f', 'o', 'l', 'h', 'r', 'L', 'I', 'n', 'h', 'j', 'g', 'f', 'o', 'I', 'B', 'i', 'i', 'B', 'G', 'j', 'C', 'B', 'i', 'h', 'i', 'i', 'd', 'd', 'B', 'K', 'k', 'f', 'p', 'm', 'B', '@', 'j', 'J', 'G', 'j', 'f', 'l', 'l', 'l', 'J', 'H', 'h', 'b', 'd', 'f', 'k', 'j', 'C', 'A', 'm', 'v', 144, 288, 288, 254, 263, 295, 290, 300, 297, 254, 256, 288, 294, 261, 256, 295, 302, 295, 290, 294, 290, 254, 262, 303, 293, 289, 294, 294, 295, 294, 255, 253, 297, 306, 296, 289, 293, 292, 293, 'N', 146, 172, 211, 215, 218, 220, 178, 169, 205, 204, 209, 209, 202, 211, 212, 211, 177, 168, 210, 178, 153, 185, 202, 170, 153, 185, 210, 212, 181, 26, 'A', 20, 'J', 'f', 'g', 'k', 'f', 'd', 'd', 'F', '9', 'n', 'k', 'j', 'i', 'h', 'B', 'J', 's', 'i', 'e', 'j', 'j', 'k', 'j', 'C', 'A', 'e', 'd', 'i', 'i', 'b', 'k', 'l', 'k', 'I', '@', 'j', 'J', 'G', 'j', 'f', 'l', 'l', 'l', 'J'};
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00ae  */
    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static byte[] m2467(byte[] bArr, int i10, int i11, byte[] bArr2) {
        int i12 = ((i11 + 2) / 3) << 2;
        int i13 = i12 + (i12 / Integer.MAX_VALUE);
        byte[] bArr3 = new byte[i13];
        int i14 = i11 - 2;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (i15 < i14) {
            int i18 = ((bArr[i15] << 24) >>> 8) | ((bArr[i15 + 1] << 24) >>> 16) | ((bArr[i15 + 2] << 24) >>> 24);
            bArr3[i16] = bArr2[i18 >>> 18];
            int i19 = i16 + 1;
            bArr3[i19] = bArr2[(i18 >>> 12) & 63];
            bArr3[i16 + 2] = bArr2[(i18 >>> 6) & 63];
            bArr3[i16 + 3] = bArr2[i18 & 63];
            i17 += 4;
            if ((i17 == Integer.MAX_VALUE ? ',' : (char) 27) != 27) {
                bArr3[i16 + 4] = 10;
                int i20 = f2457 + 1;
                f2454 = i20 % 128;
                int i21 = i20 % 2;
                i17 = 0;
                i16 = i19;
            }
            i15 += 3;
            i16 += 4;
        }
        if (i15 < i11) {
            int i22 = f2454 + 113;
            f2457 = i22 % 128;
            if ((i22 % 2 != 0 ? 'V' : '`') != 'V') {
                m2463(bArr, i15, i11 - i15, bArr3, i16, bArr2);
                if (i17 + 4 == Integer.MAX_VALUE) {
                    bArr3[i16 + 4] = 10;
                    i16++;
                }
            } else {
                m2463(bArr, i15, i11 * i15, bArr3, i16, bArr2);
                if (i17 + 8 == Integer.MAX_VALUE) {
                    bArr3[i16 + 4] = 10;
                    i16++;
                }
            }
            i16 += 4;
        }
        if ((!f2456 ? '\\' : '%') == '\\' && i16 != i13) {
            throw new AssertionError();
        }
        return bArr3;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static String m2468(byte[] bArr) {
        int i10 = f2457 + 119;
        f2454 = i10 % 128;
        if (i10 % 2 == 0) {
            m2469(bArr, bArr.length, f2459);
            throw null;
        }
        String strM2469 = m2469(bArr, bArr.length, f2459);
        int i11 = f2457 + 117;
        f2454 = i11 % 128;
        int i12 = i11 % 2;
        return strM2469;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static byte[] m2464(byte[] bArr, int i10) throws ic {
        int i11 = f2454 + 21;
        f2457 = i11 % 128;
        int i12 = i11 % 2;
        byte[] bArrM2462 = m2462(bArr, 0, i10, f2458);
        int i13 = f2454 + 101;
        f2457 = i13 % 128;
        int i14 = i13 % 2;
        return bArrM2462;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2469(byte[] bArr, int i10, byte[] bArr2) {
        byte[] bArrM2467 = m2467(bArr, 0, i10, bArr2);
        String str = new String(bArrM2467, 0, bArrM2467.length);
        int i11 = f2457 + 81;
        f2454 = i11 % 128;
        int i12 = i11 % 2;
        return str;
    }

    static {
        m2465();
        int i10 = f2454 + 1;
        f2457 = i10 % 128;
        int i11 = i10 % 2;
        f2456 = true;
        f2459 = new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
        f2458 = new byte[]{-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, -9, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, -9, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, ExifInterface.START_CODE, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9};
    }

    private ie() {
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static byte[] m2471(String str) throws ic {
        byte[] bArrM2464;
        int i10 = f2454 + 91;
        f2457 = i10 % 128;
        if ((i10 % 2 != 0 ? 'O' : 'T') != 'T') {
            byte[] bytes = str.getBytes();
            bArrM2464 = m2464(bytes, bytes.length);
            int i11 = 47 / 0;
        } else {
            byte[] bytes2 = str.getBytes();
            bArrM2464 = m2464(bytes2, bytes2.length);
        }
        int i12 = f2457 + 17;
        f2454 = i12 % 128;
        if (i12 % 2 != 0) {
            return bArrM2464;
        }
        int i13 = 54 / 0;
        return bArrM2464;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2470(int[] iArr, String str, boolean z10) throws UnsupportedEncodingException {
        String str2;
        Object bytes = str;
        if (str != null) {
            bytes = str.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        synchronized (i.f2448) {
            int i10 = iArr[0];
            int i11 = iArr[1];
            int i12 = iArr[2];
            int i13 = iArr[3];
            char[] cArr = new char[i11];
            System.arraycopy(f2455, i10, cArr, 0, i11);
            if (bArr != null) {
                char[] cArr2 = new char[i11];
                i.f2447 = 0;
                char c10 = 0;
                while (true) {
                    int i14 = i.f2447;
                    if (i14 >= i11) {
                        break;
                    }
                    if (bArr[i14] == 1) {
                        cArr2[i14] = (char) (((cArr[i14] << 1) + 1) - c10);
                    } else {
                        cArr2[i14] = (char) ((cArr[i14] << 1) - c10);
                    }
                    c10 = cArr2[i14];
                    i.f2447 = i14 + 1;
                }
                cArr = cArr2;
            }
            if (i13 > 0) {
                char[] cArr3 = new char[i11];
                System.arraycopy(cArr, 0, cArr3, 0, i11);
                int i15 = i11 - i13;
                System.arraycopy(cArr3, 0, cArr, i15, i13);
                System.arraycopy(cArr3, i13, cArr, 0, i15);
            }
            if (z10) {
                char[] cArr4 = new char[i11];
                i.f2447 = 0;
                while (true) {
                    int i16 = i.f2447;
                    if (i16 >= i11) {
                        break;
                    }
                    cArr4[i16] = cArr[(i11 - i16) - 1];
                    i.f2447 = i16 + 1;
                }
                cArr = cArr4;
            }
            if (i12 > 0) {
                i.f2447 = 0;
                while (true) {
                    int i17 = i.f2447;
                    if (i17 >= i11) {
                        break;
                    }
                    cArr[i17] = (char) (cArr[i17] - iArr[2]);
                    i.f2447 = i17 + 1;
                }
            }
            str2 = new String(cArr);
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int m2466(byte[] bArr, byte[] bArr2, int i10, byte[] bArr3) {
        int i11 = f2457 + 31;
        int i12 = i11 % 128;
        f2454 = i12;
        int i13 = i11 % 2;
        byte b10 = bArr[2];
        if (b10 == 61) {
            bArr2[i10] = (byte) ((((bArr3[bArr[1]] << 24) >>> 12) | ((bArr3[bArr[0]] << 24) >>> 6)) >>> 16);
            return 1;
        }
        byte b11 = bArr[3];
        if (b11 == 61) {
            int i14 = ((bArr3[bArr[1]] << 24) >>> 12) | ((bArr3[bArr[0]] << 24) >>> 6) | ((bArr3[b10] << 24) >>> 18);
            bArr2[i10] = (byte) (i14 >>> 16);
            bArr2[i10 + 1] = (byte) (i14 >>> 8);
            int i15 = i12 + 63;
            f2457 = i15 % 128;
            if (i15 % 2 == 0) {
                return 2;
            }
            throw null;
        }
        int i16 = ((bArr3[bArr[1]] << 24) >>> 12) | ((bArr3[bArr[0]] << 24) >>> 6) | ((bArr3[b10] << 24) >>> 18) | ((bArr3[b11] << 24) >>> 24);
        bArr2[i10] = (byte) (i16 >> 16);
        bArr2[i10 + 1] = (byte) (i16 >> 8);
        bArr2[i10 + 2] = (byte) i16;
        return 3;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0044 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0085  */
    /* JADX WARN: Code duplicated, block: B:57:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:59:0x0102  */
    /* JADX WARN: Code duplicated, block: B:60:0x0112  */
    /* JADX WARN: Code duplicated, block: B:75:0x0046 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static byte[] m2462(byte[] bArr, int i10, int i11, byte[] bArr2) throws ic {
        int i12;
        int i13;
        byte[] bArr3 = new byte[((i11 * 3) / 4) + 2];
        byte[] bArr4 = new byte[4];
        int iM2466 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = f2454 + 75;
            int i17 = i16 % 128;
            f2457 = i17;
            int i18 = i16 % 2;
            byte b10 = (byte) (bArr[i15] & 127);
            byte b11 = bArr2[b10];
            if (b11 >= -5) {
                int i19 = i17 + 93;
                f2454 = i19 % 128;
                if (i19 % 2 == 0) {
                    int i20 = 12 / 0;
                    if ((b11 >= -1 ? (char) 0 : (char) 2) == 2) {
                        continue;
                    } else {
                        if (b10 == 61) {
                            int i21 = i17 + 11;
                            f2454 = i21 % 128;
                            int i22 = i21 % 2;
                            int i23 = i11 - i15;
                            byte b12 = (byte) (bArr[i11 - 1] & 127);
                            if (i14 == 0 && i14 != 1) {
                                if ((i14 == 3 ? '\n' : '\\') != '\\') {
                                    int i24 = i17 + 1;
                                    f2454 = i24 % 128;
                                    if ((i24 % 2 == 0 ? 'F' : ')') != ')') {
                                        if ((i23 <= 4 ? 'b' : 'D') != 'b') {
                                            i12 = 4;
                                        }
                                        StringBuilder sb2 = new StringBuilder();
                                        int[] iArr = new int[i12];
                                        // fill-array-data instruction
                                        iArr[0] = 40;
                                        iArr[1] = 64;
                                        iArr[2] = 0;
                                        iArr[3] = 53;
                                        sb2.append(m2470(iArr, "\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001", false).intern());
                                        sb2.append(i15);
                                        throw new ic(sb2.toString());
                                    }
                                    if (i23 > 2) {
                                        i12 = 4;
                                    }
                                    StringBuilder sb3 = new StringBuilder();
                                    int[] iArr2 = new int[i12];
                                    // fill-array-data instruction
                                    iArr2[0] = 40;
                                    iArr2[1] = 64;
                                    iArr2[2] = 0;
                                    iArr2[3] = 53;
                                    sb3.append(m2470(iArr2, "\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001", false).intern());
                                    sb3.append(i15);
                                    throw new ic(sb3.toString());
                                }
                                i12 = 4;
                                if (i14 != 4 || i23 <= 1) {
                                    if (b12 == 61) {
                                        break;
                                    }
                                    int i25 = i17 + 95;
                                    f2454 = i25 % 128;
                                    int i26 = i25 % 2;
                                    if (b12 == 10) {
                                        break;
                                    }
                                    throw new ic(m2470(new int[]{104, 39, 188, 35}, "\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000", false).intern());
                                }
                                StringBuilder sb4 = new StringBuilder();
                                int[] iArr3 = new int[i12];
                                // fill-array-data instruction
                                iArr3[0] = 40;
                                iArr3[1] = 64;
                                iArr3[2] = 0;
                                iArr3[3] = 53;
                                sb4.append(m2470(iArr3, "\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001", false).intern());
                                sb4.append(i15);
                                throw new ic(sb4.toString());
                            }
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append(m2470(new int[]{0, 40, 0, 0}, "\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001", true).intern());
                            sb5.append(i15);
                            throw new ic(sb5.toString());
                        }
                        i13 = i14 + 1;
                        bArr4[i14] = b10;
                        if (i13 == 4) {
                            iM2466 += m2466(bArr4, bArr3, iM2466, bArr2);
                            int i27 = f2454 + 123;
                            f2457 = i27 % 128;
                            int i28 = i27 % 2;
                            i14 = 0;
                        } else {
                            i14 = i13;
                        }
                    }
                } else if (b11 < -1) {
                    continue;
                } else {
                    if (b10 == 61) {
                        int i29 = i17 + 11;
                        f2454 = i29 % 128;
                        int i210 = i29 % 2;
                        int i211 = i11 - i15;
                        byte b13 = (byte) (bArr[i11 - 1] & 127);
                        if (i14 == 0) {
                        }
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append(m2470(new int[]{0, 40, 0, 0}, "\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001", true).intern());
                        sb6.append(i15);
                        throw new ic(sb6.toString());
                    }
                    i13 = i14 + 1;
                    bArr4[i14] = b10;
                    if (i13 == 4) {
                        iM2466 += m2466(bArr4, bArr3, iM2466, bArr2);
                        int i212 = f2454 + 123;
                        f2457 = i212 % 128;
                        int i213 = i212 % 2;
                        i14 = 0;
                    } else {
                        i14 = i13;
                    }
                }
            } else {
                StringBuilder sb7 = new StringBuilder();
                sb7.append(m2470(new int[]{143, 30, 104, 21}, "\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001", false).intern());
                sb7.append(i15);
                sb7.append(m2470(new int[]{TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173, 2, 20, 0}, "\u0000\u0000", true).intern());
                sb7.append((int) bArr[i15]);
                sb7.append(m2470(new int[]{HideBottomViewOnScrollBehavior.EXIT_ANIMATION_DURATION, 9, 0, 0}, "\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0000", true).intern());
                throw new ic(sb7.toString());
            }
        }
        if (i14 != 0) {
            if (i14 != 1) {
                bArr4[i14] = 61;
                iM2466 += m2466(bArr4, bArr3, iM2466, bArr2);
            } else {
                StringBuilder sb8 = new StringBuilder();
                sb8.append(m2470(new int[]{184, 36, 0, 0}, "\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000", false).intern());
                sb8.append(i11 - 1);
                throw new ic(sb8.toString());
            }
        }
        byte[] bArr5 = new byte[iM2466];
        System.arraycopy(bArr3, 0, bArr5, 0, iM2466);
        return bArr5;
    }
}
