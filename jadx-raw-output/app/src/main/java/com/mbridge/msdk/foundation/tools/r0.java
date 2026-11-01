package com.mbridge.msdk.foundation.tools;

import com.ironsource.G5;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: SameMVEncoder.java */
/* JADX INFO: loaded from: classes6.dex */
public class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[] f35359a = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f35360b = new byte[128];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Map<Character, Character> f35361c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static char[] f35362d;

    private static int a(char[] cArr, byte[] bArr, int i10) {
        try {
            char c10 = cArr[3];
            char c11 = c10 == '=' ? (char) 2 : (char) 3;
            char c12 = cArr[2];
            if (c12 == '=') {
                c11 = 1;
            }
            byte[] bArr2 = f35360b;
            byte b10 = bArr2[cArr[0]];
            byte b11 = bArr2[cArr[1]];
            byte b12 = bArr2[c12];
            byte b13 = bArr2[c10];
            if (c11 == 1) {
                bArr[i10] = (byte) (((b11 >> 4) & 3) | ((b10 << 2) & 252));
                return 1;
            }
            if (c11 == 2) {
                bArr[i10] = (byte) ((3 & (b11 >> 4)) | ((b10 << 2) & 252));
                bArr[i10 + 1] = (byte) (((b11 << 4) & 240) | ((b12 >> 2) & 15));
                return 2;
            }
            if (c11 != 3) {
                throw new RuntimeException("Internal Error");
            }
            int i11 = i10 + 1;
            bArr[i10] = (byte) (((b10 << 2) & 252) | ((b11 >> 4) & 3));
            bArr[i11] = (byte) (((b11 << 4) & 240) | ((b12 >> 2) & 15));
            bArr[i11 + 1] = (byte) (((b12 << 6) & 192) | (b13 & 63));
            return 3;
        } catch (Exception unused) {
            return 0;
        }
    }

    static {
        HashMap map = new HashMap();
        f35361c = map;
        map.put('A', 'v');
        f35361c.put('B', 'S');
        f35361c.put('C', 'o');
        f35361c.put('D', 'a');
        f35361c.put('E', 'j');
        f35361c.put('F', 'c');
        f35361c.put('G', '7');
        f35361c.put('H', 'd');
        f35361c.put('I', 'R');
        f35361c.put('J', 'z');
        f35361c.put('K', 'p');
        f35361c.put('L', 'W');
        f35361c.put('M', 'i');
        f35361c.put('N', 'f');
        f35361c.put('O', 'G');
        f35361c.put('P', 'y');
        f35361c.put('Q', 'N');
        f35361c.put('R', 'x');
        f35361c.put('S', 'Z');
        f35361c.put('T', 'n');
        f35361c.put('U', 'V');
        f35361c.put('V', '5');
        f35361c.put('W', 'k');
        f35361c.put('X', '+');
        f35361c.put('Y', 'D');
        f35361c.put('Z', 'H');
        f35361c.put('a', 'L');
        f35361c.put('b', 'Y');
        f35361c.put('c', 'h');
        f35361c.put('d', 'J');
        f35361c.put('e', '4');
        f35361c.put('f', '6');
        f35361c.put('g', 'l');
        f35361c.put('h', 't');
        f35361c.put('i', '0');
        f35361c.put('j', 'U');
        f35361c.put('k', '3');
        f35361c.put('l', 'Q');
        f35361c.put('m', 'r');
        f35361c.put('n', 'g');
        f35361c.put('o', 'E');
        f35361c.put('p', 'u');
        f35361c.put('q', 'q');
        f35361c.put('r', '8');
        f35361c.put('s', 's');
        f35361c.put('t', 'w');
        f35361c.put('u', '/');
        f35361c.put('v', 'X');
        f35361c.put('w', 'M');
        f35361c.put('x', 'e');
        f35361c.put('y', 'B');
        f35361c.put('z', 'A');
        f35361c.put('0', 'T');
        f35361c.put('1', '2');
        f35361c.put('2', 'F');
        f35361c.put('3', 'b');
        f35361c.put('4', '9');
        f35361c.put('5', 'P');
        f35361c.put('6', '1');
        f35361c.put('7', 'O');
        f35361c.put('8', 'I');
        f35361c.put('9', 'K');
        f35361c.put('+', 'm');
        f35361c.put('/', 'C');
        f35362d = new char[64];
        int i10 = 0;
        int i11 = 0;
        while (true) {
            char[] cArr = f35359a;
            if (i11 >= cArr.length) {
                break;
            }
            f35362d[i11] = f35361c.get(Character.valueOf(cArr[i11])).charValue();
            i11++;
        }
        int i12 = 0;
        while (true) {
            byte[] bArr = f35360b;
            if (i12 >= bArr.length) {
                break;
            }
            bArr[i12] = 127;
            i12++;
        }
        while (true) {
            char[] cArr2 = f35362d;
            if (i10 >= cArr2.length) {
                return;
            }
            f35360b[cArr2[i10]] = (byte) i10;
            i10++;
        }
    }

    public static String b(String str) {
        byte[] bArrA = a(str);
        if (bArrA != null && bArrA.length > 0) {
            return new String(bArrA);
        }
        return null;
    }

    public static String c(String str) {
        return a(str.getBytes());
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003d A[Catch: Exception -> 0x005b, TryCatch #0 {Exception -> 0x005b, blocks: (B:2:0x0000, B:5:0x0009, B:7:0x0019, B:9:0x001d, B:13:0x002c, B:15:0x0032, B:17:0x0037, B:23:0x004c, B:19:0x003d, B:21:0x0044, B:10:0x0023, B:27:0x0055), top: B:31:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x0044 A[Catch: Exception -> 0x005b, TryCatch #0 {Exception -> 0x005b, blocks: (B:2:0x0000, B:5:0x0009, B:7:0x0019, B:9:0x001d, B:13:0x002c, B:15:0x0032, B:17:0x0037, B:23:0x004c, B:19:0x003d, B:21:0x0044, B:10:0x0023, B:27:0x0055), top: B:31:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x004b  */
    public static byte[] a(String str) {
        int i10;
        int i11;
        try {
            int length = str.length();
            char[] cArr = new char[length < 259 ? length : 259];
            int i12 = ((length >> 2) * 3) + 3;
            byte[] bArr = new byte[i12];
            int i13 = 0;
            int iA = 0;
            int i14 = 0;
            while (i13 < length) {
                int i15 = i13 + 256;
                if (i15 <= length) {
                    str.getChars(i13, i15, cArr, i14);
                    i10 = i14 + 256;
                } else {
                    str.getChars(i13, length, cArr, i14);
                    i10 = (length - i13) + i14;
                }
                int i16 = i14;
                while (i14 < i10) {
                    char c10 = cArr[i14];
                    if (c10 != '=') {
                        byte[] bArr2 = f35360b;
                        if (c10 < bArr2.length && bArr2[c10] != 127) {
                            i11 = i16 + 1;
                            cArr[i16] = c10;
                            if (i11 == 4) {
                                iA += a(cArr, bArr, iA);
                                i16 = 0;
                            } else {
                                i16 = i11;
                            }
                        }
                    } else {
                        i11 = i16 + 1;
                        cArr[i16] = c10;
                        if (i11 == 4) {
                            iA += a(cArr, bArr, iA);
                            i16 = 0;
                        } else {
                            i16 = i11;
                        }
                    }
                    i14++;
                }
                i13 = i15;
                i14 = i16;
            }
            if (iA == i12) {
                return bArr;
            }
            byte[] bArr3 = new byte[iA];
            System.arraycopy(bArr, 0, bArr3, 0, iA);
            return bArr3;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String a(byte[] bArr) {
        return a(bArr, 0, bArr.length);
    }

    public static String a(byte[] bArr, int i10, int i11) {
        if (i11 <= 0) {
            return "";
        }
        try {
            char[] cArr = new char[((i11 / 3) << 2) + 4];
            int i12 = 0;
            while (i11 >= 3) {
                int i13 = ((bArr[i10] & 255) << 16) + ((bArr[i10 + 1] & 255) << 8) + (bArr[i10 + 2] & 255);
                int i14 = i12 + 1;
                char[] cArr2 = f35362d;
                cArr[i12] = cArr2[i13 >> 18];
                int i15 = i14 + 1;
                cArr[i14] = cArr2[(i13 >> 12) & 63];
                int i16 = i15 + 1;
                cArr[i15] = cArr2[(i13 >> 6) & 63];
                i12 = i16 + 1;
                cArr[i16] = cArr2[i13 & 63];
                i10 += 3;
                i11 -= 3;
            }
            if (i11 == 1) {
                int i17 = bArr[i10] & 255;
                int i18 = i12 + 1;
                char[] cArr3 = f35362d;
                cArr[i12] = cArr3[i17 >> 2];
                int i19 = i18 + 1;
                cArr[i18] = cArr3[(i17 << 4) & 63];
                int i20 = i19 + 1;
                cArr[i19] = G5.T;
                i12 = i20 + 1;
                cArr[i20] = G5.T;
            } else if (i11 == 2) {
                int i21 = ((bArr[i10] & 255) << 8) + (bArr[i10 + 1] & 255);
                int i22 = i12 + 1;
                char[] cArr4 = f35362d;
                cArr[i12] = cArr4[i21 >> 10];
                int i23 = i22 + 1;
                cArr[i22] = cArr4[(i21 >> 4) & 63];
                int i24 = i23 + 1;
                cArr[i23] = cArr4[(i21 << 2) & 63];
                i12 = i24 + 1;
                cArr[i24] = G5.T;
            }
            return new String(cArr, 0, i12);
        } catch (Exception unused) {
            return null;
        }
    }
}
