package com.facebook.ads.redexgen.core;

import androidx.exifinterface.media.ExifInterface;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.ads.androidx.media3.common.DrmInitData;
import com.vungle.ads.internal.protos.Sdk;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class GF {
    public static byte[] A00;
    public static String[] A01 = {"Jtf4c9GAOgAJpDK2mVqEjBHHHDeO7jol", "kDsThcfbWymyo7SA47OqEnjsA64Naf4x", "cJoAWc4I2qPJ3tdp2oEUxn8HL8nWEytb", "qFOfekTrSk46i", "58lsU6cH4CrpheTwcdx0E4dGrWTfnMIv", "Xoqjc4jVEqoArq5wHw2izr92BVYhns54", "K2bZ7AvhLOnhV8b3rnKBJIfNWJInr7Ql", "H1rRYQzsJBGjD"};
    public static final int[] A02;
    public static final int[] A03;
    public static final int[] A04;
    public static final int[] A05;
    public static final int[] A06;
    public static final int[] A07;

    public static String A0A(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 1);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0B() {
        A00 = new byte[]{100, 112, 97, 108, 106, ExifInterface.START_CODE, 100, 102, 54, 107, 127, 110, 99, 101, 37, 111, 107, 105, 57, 39, 51, 34, 47, 41, 105, 35, 39, 37, 117, 107, 44, 41, 37};
    }

    static {
        A0B();
        A03 = new int[]{1, 2, 3, 6};
        A05 = new int[]{48000, 44100, 32000};
        A06 = new int[]{24000, 22050, 16000};
        A04 = new int[]{2, 1, 2, 3, 3, 4, 4, 5};
        A02 = new int[]{32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 384, 448, 512, 576, 640};
        A07 = new int[]{69, 87, 104, 121, 139, 174, 208, 243, 278, 348, TTAdConstant.DOWNLOAD_URL_AND_PACKAGE_NAME, 487, 557, 696, 835, 975, 1114, 1253, 1393};
    }

    public static int A00(int i10, int i11) {
        int sampleRate = i11 / 2;
        if (i10 < 0) {
            return -1;
        }
        int halfFrmsizecod = A05.length;
        if (i10 >= halfFrmsizecod || i11 < 0) {
            return -1;
        }
        int halfFrmsizecod2 = A07.length;
        if (sampleRate >= halfFrmsizecod2) {
            return -1;
        }
        int i12 = A05[i10];
        if (i12 == 44100) {
            int halfFrmsizecod3 = i11 % 2;
            return (A07[sampleRate] + halfFrmsizecod3) * 2;
        }
        int i13 = A02[sampleRate];
        String[] strArr = A01;
        String str = strArr[5];
        String str2 = strArr[0];
        int sampleRate2 = str.charAt(4);
        int halfFrmsizecod4 = str2.charAt(4);
        if (sampleRate2 != halfFrmsizecod4) {
            throw new RuntimeException();
        }
        A01[2] = "CpIhzBdts1JRjCy6aRe02MLhvkoBTutu";
        if (i12 == 32000) {
            int halfFrmsizecod5 = i13 * 6;
            return halfFrmsizecod5;
        }
        int halfFrmsizecod6 = i13 * 4;
        return halfFrmsizecod6;
    }

    public static int A01(int i10, int i11, int i12) {
        return (i10 * i11) / (i12 * 32);
    }

    public static int A02(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int startIndex = byteBuffer.limit();
        int i10 = startIndex - 10;
        for (int i11 = iPosition; i11 <= i10; i11++) {
            int startIndex2 = i11 + 4;
            int endIndex = AbstractC09664a.A0F(byteBuffer, startIndex2) & (-2);
            if (endIndex == -126718022) {
                return i11 - iPosition;
            }
        }
        return -1;
    }

    public static int A03(ByteBuffer byteBuffer) {
        boolean isEac3 = ((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10;
        if (isEac3) {
            int numblkscod = ((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3;
            return A03[numblkscod] * 256;
        }
        return 1536;
    }

    public static int A04(ByteBuffer byteBuffer, int i10) {
        boolean z10 = (byteBuffer.get((byteBuffer.position() + i10) + 7) & 255) == 187;
        int iPosition = byteBuffer.position() + i10;
        if (A01[2].charAt(30) != 't') {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[7] = "2LNqrJlwnzIqb";
        strArr[3] = "f1x5AMhp2hTyk";
        return 40 << ((byteBuffer.get(iPosition + (z10 ? 9 : 8)) >> 4) & 7);
    }

    public static int A05(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        boolean isEac3 = ((bArr[5] & 248) >> 3) > 10;
        if (isEac3) {
            return (((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1) * 2;
        }
        int fscod = (bArr[4] & 192) >> 6;
        return A00(fscod, bArr[4] & 63);
    }

    public static int A06(byte[] bArr) {
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
            return 40 << ((bArr[(bArr[7] & 255) == 187 ? '\t' : '\b'] >> 4) & 7);
        }
        return 0;
    }

    public static C2654or A07(C4J c4j, String str, String str2, DrmInitData drmInitData) {
        C4I c4i = new C4I();
        c4i.A0C(c4j);
        int fscod = c4i.A04(2);
        int constantBitrate = A05[fscod];
        c4i.A09(8);
        int i10 = A04[c4i.A04(3)];
        if (c4i.A04(1) != 0) {
            i10++;
        }
        int fscod2 = c4i.A04(5);
        int halfFrmsizecod = A02[fscod2] * 1000;
        c4i.A06();
        c4j.A0f(c4i.A02());
        return new C2D().A0y(str).A11(A0A(0, 9, 4)).A0b(i10).A0m(constantBitrate).A0u(drmInitData).A10(str2).A0a(halfFrmsizecod).A0j(halfFrmsizecod).A14();
    }

    public static C2654or A08(C4J c4j, String str, String str2, DrmInitData drmInitData) {
        C4I c4i = new C4I();
        c4i.A0C(c4j);
        int fscod = c4i.A04(13) * 1000;
        c4i.A09(3);
        int peakBitrate = c4i.A04(2);
        int sampleRate = A05[peakBitrate];
        c4i.A09(10);
        int channelCount = A04[c4i.A04(3)];
        if (c4i.A04(1) != 0) {
            channelCount++;
        }
        c4i.A09(3);
        int iA04 = c4i.A04(4);
        c4i.A09(1);
        String[] strArr = A01;
        String str3 = strArr[5];
        String str4 = strArr[0];
        int peakBitrate2 = str3.charAt(4);
        if (peakBitrate2 != str4.charAt(4)) {
            throw new RuntimeException();
        }
        A01[6] = "mDbBoGQY4vpPxfXnFDb06caCJn7GdJsS";
        if (iA04 > 0) {
            c4i.A0A(6);
            if (c4i.A04(1) != 0) {
                channelCount += 2;
            }
            c4i.A09(1);
        }
        String strA0A = A0A(9, 10, 11);
        int peakBitrate3 = c4i.A01();
        if (peakBitrate3 > 7) {
            c4i.A09(7);
            if (c4i.A04(1) != 0) {
                strA0A = A0A(19, 14, 71);
            }
        }
        c4i.A06();
        c4j.A0f(c4i.A02());
        return new C2D().A0y(str).A11(strA0A).A0b(channelCount).A0m(sampleRate).A0u(drmInitData).A10(str2).A0j(fscod).A14();
    }

    /* JADX WARN: Code duplicated, block: B:111:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:63:0x011b  */
    /* JADX WARN: Code duplicated, block: B:65:0x0123  */
    public static GE A09(C4I c4i) {
        String strA0A;
        int iA01;
        int iA00;
        int i10;
        int i11;
        int i12;
        int i13;
        int iA04;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int iA03 = c4i.A03();
        c4i.A09(40);
        boolean z10 = c4i.A04(5) > 10;
        c4i.A08(iA03);
        int i21 = -1;
        if (z10) {
            c4i.A09(16);
            switch (c4i.A04(2)) {
                case 0:
                    i21 = 0;
                    break;
                case 1:
                    i21 = 1;
                    break;
                case 2:
                    i21 = 2;
                    break;
                default:
                    i21 = -1;
                    break;
            }
            c4i.A09(3);
            iA00 = (c4i.A04(11) + 1) * 2;
            int iA05 = c4i.A04(2);
            if (iA05 == 3) {
                iA04 = 3;
                i11 = A06[c4i.A04(2)];
                i14 = 6;
            } else {
                iA04 = c4i.A04(2);
                i14 = A03[iA04];
                i11 = A05[iA05];
            }
            i12 = i14 * 256;
            iA01 = A01(iA00, i11, i14);
            int iA06 = c4i.A04(3);
            boolean zA0H = c4i.A0H();
            i13 = A04[iA06] + (zA0H ? 1 : 0);
            c4i.A09(10);
            if (c4i.A0H()) {
                c4i.A09(8);
            }
            if (iA06 == 0) {
                c4i.A09(5);
                if (c4i.A0H()) {
                    c4i.A09(8);
                }
            }
            if (i21 == 1 && c4i.A0H()) {
                if (A01[6].charAt(2) == 'b') {
                    A01[2] = "EFtXQuggqvCecn8xtkL0dgnIAj4EDltD";
                    c4i.A09(16);
                }
                throw new RuntimeException();
            }
            if (c4i.A0H()) {
                if (iA06 > 2) {
                    c4i.A09(2);
                }
                if ((iA06 & 1) != 0 && iA06 > 2) {
                    i18 = 6;
                    c4i.A09(6);
                } else {
                    i18 = 6;
                }
                int i22 = iA06 & 4;
                if (A01[6].charAt(2) == 'b') {
                    A01[2] = "n86rU7cJyKu1PGdXCxu3oQra88IC0cti";
                    if (i22 != 0) {
                        c4i.A09(i18);
                    }
                } else if (i22 != 0) {
                    c4i.A09(i18);
                }
                if (zA0H && c4i.A0H()) {
                    c4i.A09(5);
                }
                if (i21 == 0) {
                    if (c4i.A0H()) {
                        i19 = 6;
                        c4i.A09(6);
                    } else {
                        i19 = 6;
                    }
                    if (iA06 == 0 && c4i.A0H()) {
                        c4i.A09(i19);
                    }
                    if (c4i.A0H()) {
                        c4i.A09(i19);
                    }
                    int iA07 = c4i.A04(2);
                    if (iA07 == 1) {
                        c4i.A09(5);
                    } else if (iA07 == 2) {
                        c4i.A09(12);
                    } else if (iA07 == 3) {
                        int iA08 = c4i.A04(5);
                        if (c4i.A0H()) {
                            c4i.A09(5);
                            if (c4i.A0H()) {
                                i20 = 4;
                                c4i.A09(4);
                            } else {
                                i20 = 4;
                            }
                            boolean zA0H2 = c4i.A0H();
                            if (A01[1].charAt(12) != 'o') {
                                A01[4] = "PWQ2PfTArLXSbAuYPJT5x4iA7pnZIJ5J";
                                if (zA0H2) {
                                    c4i.A09(i20);
                                }
                            } else {
                                String[] strArr = A01;
                                strArr[7] = "3piylhlPW6ECi";
                                strArr[3] = "2ld3o4GemUbvA";
                                if (zA0H2) {
                                    c4i.A09(i20);
                                }
                            }
                            if (c4i.A0H()) {
                                c4i.A09(i20);
                            }
                            if (c4i.A0H()) {
                                c4i.A09(i20);
                            }
                            if (c4i.A0H()) {
                                c4i.A09(i20);
                            }
                            if (c4i.A0H()) {
                                c4i.A09(i20);
                            }
                            if (c4i.A0H()) {
                                c4i.A09(i20);
                            }
                            if (c4i.A0H()) {
                                if (c4i.A0H()) {
                                    c4i.A09(i20);
                                }
                                if (c4i.A0H()) {
                                    c4i.A09(i20);
                                }
                            }
                        }
                        if (c4i.A0H()) {
                            c4i.A09(5);
                            if (c4i.A0H()) {
                                c4i.A09(7);
                                boolean zA0H3 = c4i.A0H();
                                if (A01[1].charAt(12) != 'o') {
                                    throw new RuntimeException();
                                }
                                A01[6] = "rSblh4R2S5jwen1kap7KA3ClbKLn4xCa";
                                if (zA0H3) {
                                    c4i.A09(8);
                                }
                            }
                        }
                        c4i.A09((iA08 + 2) * 8);
                        c4i.A06();
                    }
                    if (A01[4].length() != 32) {
                        String[] strArr2 = A01;
                        strArr2[5] = "CT6fc8NDwAee95wvc4i3U0G4PwptFgbR";
                        strArr2[0] = "cOprcaH4V9QUBwGl6SpW2PXD2gkWJWIT";
                        if (iA06 < 2) {
                            if (c4i.A0H()) {
                                c4i.A09(14);
                            }
                            if (iA06 == 0 && c4i.A0H()) {
                                c4i.A09(14);
                            }
                        }
                    } else {
                        A01[2] = "TfLNzHkYjjGfwBXQwG7FQ44lMKhqfIt5";
                        if (iA06 < 2) {
                            if (c4i.A0H()) {
                                c4i.A09(14);
                            }
                            if (iA06 == 0) {
                                c4i.A09(14);
                            }
                        }
                    }
                    if (c4i.A0H()) {
                        if (iA04 == 0) {
                            c4i.A09(5);
                        } else {
                            for (int i23 = 0; i23 < i14; i23++) {
                                if (c4i.A0H()) {
                                    c4i.A09(5);
                                }
                            }
                        }
                    }
                }
            }
            if (c4i.A0H()) {
                c4i.A09(5);
                if (iA06 == 2) {
                    c4i.A09(4);
                }
                if (iA06 >= 6) {
                    c4i.A09(2);
                }
                if (c4i.A0H()) {
                    i17 = 8;
                    c4i.A09(8);
                } else {
                    i17 = 8;
                }
                if (iA06 == 0) {
                    boolean zA0H4 = c4i.A0H();
                    String[] strArr3 = A01;
                    if (strArr3[7].length() == strArr3[3].length()) {
                        String[] strArr4 = A01;
                        strArr4[5] = "YsaJcRTRbu2uSs1yKbmR882rDeXrY1Vp";
                        strArr4[0] = "pJsPcDksUtPyGih90nhVsOa0zw9Rh9Kw";
                        if (zA0H4) {
                            c4i.A09(i17);
                        }
                    }
                    throw new RuntimeException();
                }
                i15 = 3;
                if (iA05 < 3) {
                    c4i.A07();
                }
            } else {
                i15 = 3;
            }
            if (i21 == 0 && iA04 != i15) {
                c4i.A07();
            }
            if (i21 == 2) {
                if (iA04 == i15 || c4i.A0H()) {
                    i16 = 6;
                    c4i.A09(6);
                } else {
                    i16 = 6;
                }
            } else {
                i16 = 6;
            }
            strA0A = A0A(9, 10, 11);
            if (c4i.A0H() && c4i.A04(i16) == 1 && c4i.A04(8) == 1) {
                strA0A = A0A(19, 14, 71);
            }
        } else {
            strA0A = A0A(0, 9, 4);
            c4i.A09(32);
            int iA09 = c4i.A04(2);
            if (iA09 == 3) {
                strA0A = null;
            }
            int iA010 = c4i.A04(6);
            iA01 = A02[iA010 / 2] * 1000;
            iA00 = A00(iA09, iA010);
            c4i.A09(8);
            int iA011 = c4i.A04(3);
            if ((iA011 & 1) != 0 && iA011 != 1) {
                i10 = 2;
                c4i.A09(2);
            } else {
                i10 = 2;
            }
            if ((iA011 & 4) != 0) {
                c4i.A09(i10);
            }
            if (iA011 == i10) {
                c4i.A09(i10);
            }
            i11 = iA09 < A05.length ? A05[iA09] : -1;
            i12 = 1536;
            i13 = A04[iA011] + (c4i.A0H() ? 1 : 0);
        }
        return new GE(strA0A, i21, i13, i11, iA00, i12, iA01);
    }
}
