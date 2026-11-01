package com.yk.e.util;

/* JADX INFO: loaded from: classes2.dex */
public class Base64Utils {
    private static final int BASELENGTH = 128;
    private static final int EIGHTBIT = 8;
    private static final int FOURBYTE = 4;
    private static final int LOOKUPLENGTH = 64;
    private static final char PAD = '=';
    private static final int SIGN = -128;
    private static final int SIXTEENBIT = 16;
    private static final int TWENTYFOURBITGROUP = 24;
    private static final boolean fDebug = false;
    private static final byte[] base64Alphabet = new byte[128];
    private static final char[] lookUpBase64Alphabet = new char[64];

    public static byte[] decode(String str) {
        if (str == null) {
            return null;
        }
        char[] charArray = str.toCharArray();
        int iRemoveWhiteSpace = removeWhiteSpace(charArray);
        if (iRemoveWhiteSpace % 4 != 0) {
            return null;
        }
        int i10 = iRemoveWhiteSpace / 4;
        if (i10 == 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[i10 * 3];
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i11 < i10 - 1) {
            int i14 = i12 + 1;
            char c10 = charArray[i12];
            if (isData(c10)) {
                int i15 = i14 + 1;
                char c11 = charArray[i14];
                if (isData(c11)) {
                    int i16 = i15 + 1;
                    char c12 = charArray[i15];
                    if (isData(c12)) {
                        int i17 = i16 + 1;
                        char c13 = charArray[i16];
                        if (isData(c13)) {
                            byte[] bArr2 = base64Alphabet;
                            byte b10 = bArr2[c10];
                            byte b11 = bArr2[c11];
                            byte b12 = bArr2[c12];
                            byte b13 = bArr2[c13];
                            int i18 = i13 + 1;
                            bArr[i13] = (byte) ((b10 << 2) | (b11 >> 4));
                            int i19 = i18 + 1;
                            bArr[i18] = (byte) (((b11 & 15) << 4) | ((b12 >> 2) & 15));
                            i13 = i19 + 1;
                            bArr[i19] = (byte) ((b12 << 6) | b13);
                            i11++;
                            i12 = i17;
                        }
                    }
                }
            }
            return null;
        }
        int i20 = i12 + 1;
        char c14 = charArray[i12];
        if (!isData(c14)) {
            return null;
        }
        int i21 = i20 + 1;
        char c15 = charArray[i20];
        if (!isData(c15)) {
            return null;
        }
        byte[] bArr3 = base64Alphabet;
        byte b14 = bArr3[c14];
        byte b15 = bArr3[c15];
        int i22 = i21 + 1;
        char c16 = charArray[i21];
        char c17 = charArray[i22];
        if (isData(c16) && isData(c17)) {
            byte b16 = bArr3[c16];
            byte b17 = bArr3[c17];
            int i23 = i13 + 1;
            bArr[i13] = (byte) ((b14 << 2) | (b15 >> 4));
            bArr[i23] = (byte) (((b15 & 15) << 4) | ((b16 >> 2) & 15));
            bArr[i23 + 1] = (byte) (b17 | (b16 << 6));
            return bArr;
        }
        if (isPad(c16) && isPad(c17)) {
            if ((b15 & 15) != 0) {
                return null;
            }
            int i24 = i11 * 3;
            byte[] bArr4 = new byte[i24 + 1];
            System.arraycopy(bArr, 0, bArr4, 0, i24);
            bArr4[i13] = (byte) ((b14 << 2) | (b15 >> 4));
            return bArr4;
        }
        if (isPad(c16) || !isPad(c17)) {
            return null;
        }
        byte b18 = bArr3[c16];
        if ((b18 & 3) != 0) {
            return null;
        }
        int i25 = i11 * 3;
        byte[] bArr5 = new byte[i25 + 2];
        System.arraycopy(bArr, 0, bArr5, 0, i25);
        bArr5[i13] = (byte) ((b14 << 2) | (b15 >> 4));
        bArr5[i13 + 1] = (byte) (((b18 >> 2) & 15) | ((b15 & 15) << 4));
        return bArr5;
    }

    private static boolean isPad(char c10) {
        return c10 == '=';
    }

    private static boolean isWhiteSpace(char c10) {
        return c10 == ' ' || c10 == '\r' || c10 == '\n' || c10 == '\t';
    }

    private static int removeWhiteSpace(char[] cArr) {
        if (cArr == null) {
            return 0;
        }
        int length = cArr.length;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            if (!isWhiteSpace(cArr[i11])) {
                cArr[i10] = cArr[i11];
                i10++;
            }
        }
        return i10;
    }

    static {
        int i10;
        int i11;
        int i12 = 0;
        for (int i13 = 0; i13 < 128; i13++) {
            base64Alphabet[i13] = -1;
        }
        for (int i14 = 90; i14 >= 65; i14--) {
            base64Alphabet[i14] = (byte) (i14 - 65);
        }
        int i15 = 122;
        while (true) {
            i10 = 26;
            if (i15 < 97) {
                break;
            }
            base64Alphabet[i15] = (byte) ((i15 - 97) + 26);
            i15--;
        }
        int i16 = 57;
        while (true) {
            i11 = 52;
            if (i16 < 48) {
                break;
            }
            base64Alphabet[i16] = (byte) ((i16 - 48) + 52);
            i16--;
        }
        byte[] bArr = base64Alphabet;
        bArr[43] = 62;
        bArr[47] = 63;
        for (int i17 = 0; i17 <= 25; i17++) {
            lookUpBase64Alphabet[i17] = (char) (i17 + 65);
        }
        int i18 = 0;
        while (i10 <= 51) {
            lookUpBase64Alphabet[i10] = (char) (i18 + 97);
            i10++;
            i18++;
        }
        while (i11 <= 61) {
            lookUpBase64Alphabet[i11] = (char) (i12 + 48);
            i11++;
            i12++;
        }
        char[] cArr = lookUpBase64Alphabet;
        cArr[62] = '+';
        cArr[63] = '/';
    }

    public static String encode(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        int length = bArr.length * 8;
        if (length == 0) {
            return "";
        }
        int i10 = length % 24;
        int i11 = length / 24;
        char[] cArr = new char[(i10 != 0 ? i11 + 1 : i11) * 4];
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i12 < i11) {
            int i15 = i13 + 1;
            byte b10 = bArr[i13];
            int i16 = i15 + 1;
            byte b11 = bArr[i15];
            int i17 = i16 + 1;
            byte b12 = bArr[i16];
            byte b13 = (byte) (b11 & 15);
            byte b14 = (byte) (b10 & 3);
            int i18 = b10 & (-128);
            int i19 = b10 >> 2;
            if (i18 != 0) {
                i19 ^= 192;
            }
            byte b15 = (byte) i19;
            int i20 = b11 & (-128);
            int i21 = b11 >> 4;
            if (i20 != 0) {
                i21 ^= 240;
            }
            byte b16 = (byte) i21;
            int i22 = (b12 & (-128)) == 0 ? b12 >> 6 : (b12 >> 6) ^ 252;
            int i23 = i14 + 1;
            char[] cArr2 = lookUpBase64Alphabet;
            cArr[i14] = cArr2[b15];
            int i24 = i23 + 1;
            cArr[i23] = cArr2[(b14 << 4) | b16];
            int i25 = i24 + 1;
            cArr[i24] = cArr2[(b13 << 2) | ((byte) i22)];
            cArr[i25] = cArr2[b12 & 63];
            i12++;
            i14 = i25 + 1;
            i13 = i17;
        }
        if (i10 == 8) {
            byte b17 = bArr[i13];
            byte b18 = (byte) (b17 & 3);
            int i26 = b17 & (-128);
            int i27 = b17 >> 2;
            if (i26 != 0) {
                i27 ^= 192;
            }
            int i28 = i14 + 1;
            char[] cArr3 = lookUpBase64Alphabet;
            cArr[i14] = cArr3[(byte) i27];
            int i29 = i28 + 1;
            cArr[i28] = cArr3[b18 << 4];
            cArr[i29] = '=';
            cArr[i29 + 1] = '=';
        } else if (i10 == 16) {
            byte b19 = bArr[i13];
            byte b20 = bArr[i13 + 1];
            byte b21 = (byte) (b20 & 15);
            byte b22 = (byte) (b19 & 3);
            int i30 = b19 & (-128);
            int i31 = b19 >> 2;
            if (i30 != 0) {
                i31 ^= 192;
            }
            byte b23 = (byte) i31;
            int i32 = b20 & (-128);
            int i33 = b20 >> 4;
            if (i32 != 0) {
                i33 ^= 240;
            }
            int i34 = i14 + 1;
            char[] cArr4 = lookUpBase64Alphabet;
            cArr[i14] = cArr4[b23];
            int i35 = i34 + 1;
            cArr[i34] = cArr4[((byte) i33) | (b22 << 4)];
            cArr[i35] = cArr4[b21 << 2];
            cArr[i35 + 1] = '=';
        }
        return new String(cArr);
    }

    private static boolean isData(char c10) {
        return c10 < 128 && base64Alphabet[c10] != -1;
    }
}
