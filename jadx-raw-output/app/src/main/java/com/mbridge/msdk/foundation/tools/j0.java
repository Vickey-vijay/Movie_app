package com.mbridge.msdk.foundation.tools;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: compiled from: SameBase64Decoder.java */
/* JADX INFO: loaded from: classes5.dex */
public class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f35313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f35314b;

    static {
        char[] charArray = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();
        f35313a = charArray;
        int[] iArr = new int[256];
        f35314b = iArr;
        Arrays.fill(iArr, -1);
        int length = charArray.length;
        for (int i10 = 0; i10 < length; i10++) {
            f35314b[f35313a[i10]] = i10;
        }
        f35314b[61] = 0;
    }

    public static String a(String str) {
        byte[] bArrB = b(str);
        if (bArrB != null && bArrB.length != 0) {
            return new String(bArrB, StandardCharsets.UTF_8);
        }
        return "";
    }

    public static byte[] b(String str) {
        int i10;
        int i11;
        int i12;
        int length = str.length();
        int i13 = 0;
        if (length == 0) {
            return new byte[0];
        }
        int i14 = length - 1;
        int i15 = 0;
        while (i15 < i14 && f35314b[str.charAt(i15) & 255] < 0) {
            i15++;
        }
        while (i14 > 0 && f35314b[str.charAt(i14) & 255] < 0) {
            i14--;
        }
        if (str.charAt(i14) == '=') {
            if (str.charAt(i14 - 1) == '=') {
                i10 = 2;
            } else {
                i10 = 1;
            }
        } else {
            i10 = 0;
        }
        int i16 = (i14 - i15) + 1;
        if (length > 76) {
            if (str.charAt(76) == '\r') {
                i12 = i16 / 78;
            } else {
                i12 = 0;
            }
            i11 = i12 << 1;
        } else {
            i11 = 0;
        }
        int i17 = (((i16 - i11) * 6) >> 3) - i10;
        byte[] bArr = new byte[i17];
        int i18 = (i17 / 3) * 3;
        int i19 = 0;
        int i20 = 0;
        while (i19 < i18) {
            int[] iArr = f35314b;
            int i21 = i15 + 1;
            int i22 = i21 + 1;
            int i23 = (iArr[str.charAt(i15)] << 18) | (iArr[str.charAt(i21)] << 12);
            int i24 = i22 + 1;
            int i25 = i23 | (iArr[str.charAt(i22)] << 6);
            int i26 = i24 + 1;
            int i27 = i25 | iArr[str.charAt(i24)];
            int i28 = i19 + 1;
            bArr[i19] = (byte) (i27 >> 16);
            int i29 = i28 + 1;
            bArr[i28] = (byte) (i27 >> 8);
            i19 = i29 + 1;
            bArr[i29] = (byte) i27;
            if (i11 > 0 && (i20 = i20 + 1) == 19) {
                i15 = i26 + 2;
                i20 = 0;
            } else {
                i15 = i26;
            }
        }
        if (i19 < i17) {
            int i30 = 0;
            while (i15 <= i14 - i10) {
                i13 |= f35314b[str.charAt(i15)] << (18 - (i30 * 6));
                i30++;
                i15++;
            }
            int i31 = 16;
            while (i19 < i17) {
                bArr[i19] = (byte) (i13 >> i31);
                i31 -= 8;
                i19++;
            }
        }
        return bArr;
    }
}
