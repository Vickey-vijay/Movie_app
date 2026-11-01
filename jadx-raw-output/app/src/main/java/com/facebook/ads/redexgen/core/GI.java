package com.facebook.ads.redexgen.core;

import com.facebook.ads.androidx.media3.common.DrmInitData;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class GI {
    public static byte[] A00;
    public static String[] A01 = {"xbfghvjfzJvhku5N8OELiq204nVuVPFf", "QHdNkhaNqF6P8ZoHbM5E7ac9pSEOFT0I", "gTrjGkh7SJSYjcOCOWWCub6Uckq9Yltj", "B1r", "bt5fTN19iCcMkB3LBJCDNqZ6iO4ZjItL", "3vLSrbB7SQdOWYeFWsx", "mXdQOoT87saNovPMynKxKkWZ", "FMZbalTyTizDclIiFtsmYNu0onhdvCq9"};
    public static final int[] A02;

    /* JADX WARN: Code duplicated, block: B:20:0x0072  */
    /* JADX WARN: Code duplicated, block: B:22:0x007e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0099 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x009b  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:39:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:42:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:43:0x00be  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:45:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c5  */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static GH A04(C4I c4i) {
        int iA04;
        boolean zA0H;
        int i10;
        int iA05;
        int i11;
        int iA06 = c4i.A04(16);
        int iA07 = c4i.A04(16);
        int i12 = 0 + 2 + 2;
        if (iA07 == 65535) {
            iA07 = c4i.A04(24);
            i12 += 3;
        }
        int i13 = iA07 + i12;
        if (iA06 == 44097) {
            i13 += 2;
        }
        int iA08 = c4i.A04(2);
        if (iA08 == 3) {
            iA08 += A00(c4i, 2);
            String[] strArr = A01;
            if (strArr[1].charAt(27) != strArr[4].charAt(27)) {
                A01[3] = "JeV";
                iA04 = c4i.A04(10);
                if (c4i.A0H() && c4i.A04(3) > 0) {
                    c4i.A09(2);
                }
                zA0H = c4i.A0H();
                if (A01[5].length() != 0) {
                    A01[7] = "lwIINFZkQEgov7IcPWK4ANnqSDhXt22f";
                    if (zA0H) {
                        i10 = 48000;
                    } else {
                        i10 = 44100;
                    }
                    iA05 = c4i.A04(4);
                    i11 = 0;
                    if (i10 == 44100 || iA05 != 13) {
                        if (i10 == 48000 && iA05 < A02.length) {
                            i11 = A02[iA05];
                            switch (iA04 % 5) {
                                case 1:
                                case 3:
                                    if (iA05 != 3 || iA05 == 8) {
                                        i11++;
                                    }
                                    break;
                                case 2:
                                    if (iA05 != 8 || iA05 == 11) {
                                        i11++;
                                    }
                                    break;
                                case 4:
                                    if (iA05 != 3 || iA05 == 8 || iA05 == 11) {
                                        i11++;
                                    }
                                    break;
                            }
                        }
                    } else {
                        i11 = A02[iA05];
                    }
                    return new GH(iA08, 2, i10, i13, i11);
                }
            }
        } else {
            iA04 = c4i.A04(10);
            if (c4i.A0H()) {
                c4i.A09(2);
            }
            zA0H = c4i.A0H();
            if (A01[5].length() != 0) {
                A01[7] = "lwIINFZkQEgov7IcPWK4ANnqSDhXt22f";
                if (zA0H) {
                    i10 = 48000;
                } else {
                    i10 = 44100;
                }
                iA05 = c4i.A04(4);
                i11 = 0;
                if (i10 == 44100) {
                    if (i10 == 48000) {
                        i11 = A02[iA05];
                        switch (iA04 % 5) {
                            case 1:
                            case 3:
                                if (iA05 != 3) {
                                    i11++;
                                } else {
                                    i11++;
                                }
                                break;
                            case 2:
                                if (iA05 != 8) {
                                    i11++;
                                } else {
                                    i11++;
                                }
                                break;
                            case 4:
                                if (iA05 != 3) {
                                    i11++;
                                } else {
                                    i11++;
                                }
                                break;
                        }
                    }
                } else if (i10 == 48000) {
                    i11 = A02[iA05];
                    switch (iA04 % 5) {
                        case 1:
                        case 3:
                            if (iA05 != 3) {
                                i11++;
                            } else {
                                i11++;
                            }
                            break;
                        case 2:
                            if (iA05 != 8) {
                                i11++;
                            } else {
                                i11++;
                            }
                            break;
                        case 4:
                            if (iA05 != 3) {
                                i11++;
                            } else {
                                i11++;
                            }
                            break;
                    }
                }
                return new GH(iA08, 2, i10, i13, i11);
            }
        }
        throw new RuntimeException();
    }

    public static String A05(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            byte b10 = bArrCopyOfRange[i13];
            if (A01[7].charAt(26) == 'U') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[2] = "ZZS15YLfqnGzRKQmbGGBAS62S7daT6Pr";
            strArr[0] = "wbQ3s0ZhLtikxP7PtpYOpvXFjSSpaatC";
            bArrCopyOfRange[i13] = (byte) ((b10 - i12) - 7);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A00 = new byte[]{-121, -101, -118, -113, -107, 85, -121, -119, 90};
    }

    static {
        A06();
        A02 = new int[]{2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};
    }

    public static int A00(C4I c4i, int i10) {
        int i11 = 0;
        while (true) {
            int value = c4i.A04(i10);
            int i12 = i11 + value;
            if (!c4i.A0H()) {
                return i12;
            }
            i11 = (i12 + 1) << i10;
        }
    }

    public static int A01(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[16];
        int iPosition = byteBuffer.position();
        byteBuffer.get(bArr);
        byteBuffer.position(iPosition);
        return A04(new C4I(bArr)).A03;
    }

    public static int A02(byte[] bArr, int i10) {
        if (bArr.length < 7) {
            return -1;
        }
        int headerSize = bArr[2];
        int i11 = (headerSize & 255) << 8;
        int headerSize2 = bArr[3];
        int i12 = i11 | (headerSize2 & 255);
        int frameSize = 2 + 2;
        if (i12 == 65535) {
            int headerSize3 = bArr[4];
            int i13 = (headerSize3 & 255) << 16;
            int headerSize4 = bArr[5];
            int i14 = i13 | ((headerSize4 & 255) << 8);
            int headerSize5 = bArr[6];
            i12 = i14 | (headerSize5 & 255);
            frameSize += 3;
        }
        if (i10 == 44097) {
            frameSize += 2;
        }
        int i15 = i12 + frameSize;
        String[] strArr = A01;
        String str = strArr[1];
        String str2 = strArr[4];
        int iCharAt = str.charAt(27);
        int headerSize6 = str2.charAt(27);
        if (iCharAt == headerSize6) {
            throw new RuntimeException();
        }
        A01[7] = "5dLepgbvmcODZNjBgadRz1gh8sb0vEN9";
        return i15;
    }

    public static C2654or A03(C4J c4j, String str, String str2, DrmInitData drmInitData) {
        c4j.A0g(1);
        return new C2D().A0y(str).A11(A05(0, 9, 31)).A0b(2).A0m(((c4j.A0I() & 32) >> 5) == 1 ? 48000 : 44100).A0u(drmInitData).A10(str2).A14();
    }

    public static void A07(int i10, C4J c4j) {
        c4j.A0d(7);
        byte[] bArrA0l = c4j.A0l();
        bArrA0l[0] = -84;
        bArrA0l[1] = 64;
        bArrA0l[2] = -1;
        bArrA0l[3] = -1;
        bArrA0l[4] = (byte) ((i10 >> 16) & 255);
        bArrA0l[5] = (byte) ((i10 >> 8) & 255);
        bArrA0l[6] = (byte) (i10 & 255);
    }
}
