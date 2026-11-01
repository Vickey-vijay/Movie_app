package com.applovin.shadow.okio.internal;

import ck.p;
import java.util.Arrays;

/* JADX INFO: compiled from: -Utf8.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class _Utf8Kt {
    public static final byte[] commonAsUtf8ToByteArray(String str) {
        int i10;
        int i11;
        p.j(str, "<this>");
        byte[] bArr = new byte[str.length() * 4];
        int length = str.length();
        int i12 = 0;
        while (i12 < length) {
            char cCharAt = str.charAt(i12);
            if (p.l(cCharAt, 128) >= 0) {
                int length2 = str.length();
                int i13 = i12;
                while (i12 < length2) {
                    char cCharAt2 = str.charAt(i12);
                    if (p.l(cCharAt2, 128) < 0) {
                        int i14 = i13 + 1;
                        bArr[i13] = (byte) cCharAt2;
                        i12++;
                        while (true) {
                            i13 = i14;
                            if (i12 >= length2 || p.l(str.charAt(i12), 128) >= 0) {
                                break;
                            }
                            i14 = i13 + 1;
                            bArr[i13] = (byte) str.charAt(i12);
                            i12++;
                        }
                    } else {
                        if (p.l(cCharAt2, 2048) < 0) {
                            int i15 = i13 + 1;
                            bArr[i13] = (byte) ((cCharAt2 >> 6) | 192);
                            byte b10 = (byte) ((cCharAt2 & '?') | 128);
                            i10 = i15 + 1;
                            bArr[i15] = b10;
                        } else {
                            if (55296 <= cCharAt2 && cCharAt2 < 57344) {
                                if (p.l(cCharAt2, 56319) <= 0 && length2 > (i11 = i12 + 1)) {
                                    char cCharAt3 = str.charAt(i11);
                                    if (56320 <= cCharAt3 && cCharAt3 < 57344) {
                                        int iCharAt = ((cCharAt2 << '\n') + str.charAt(i11)) - 56613888;
                                        int i16 = i13 + 1;
                                        bArr[i13] = (byte) ((iCharAt >> 18) | 240);
                                        int i17 = i16 + 1;
                                        bArr[i16] = (byte) (((iCharAt >> 12) & 63) | 128);
                                        int i18 = i17 + 1;
                                        bArr[i17] = (byte) (((iCharAt >> 6) & 63) | 128);
                                        byte b11 = (byte) ((iCharAt & 63) | 128);
                                        i10 = i18 + 1;
                                        bArr[i18] = b11;
                                        i12 += 2;
                                    }
                                    i13 = i10;
                                }
                                i10 = i13 + 1;
                                bArr[i13] = 63;
                            } else {
                                int i19 = i13 + 1;
                                bArr[i13] = (byte) ((cCharAt2 >> '\f') | 224);
                                int i20 = i19 + 1;
                                bArr[i19] = (byte) (((cCharAt2 >> 6) & 63) | 128);
                                byte b12 = (byte) ((cCharAt2 & '?') | 128);
                                i10 = i20 + 1;
                                bArr[i20] = b12;
                            }
                        }
                        i12++;
                        i13 = i10;
                    }
                }
                byte[] bArrCopyOf = Arrays.copyOf(bArr, i13);
                p.i(bArrCopyOf, "copyOf(this, newSize)");
                return bArrCopyOf;
            }
            bArr[i12] = (byte) cCharAt;
            i12++;
        }
        byte[] bArrCopyOf2 = Arrays.copyOf(bArr, str.length());
        p.i(bArrCopyOf2, "copyOf(this, newSize)");
        return bArrCopyOf2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0098, code lost:
    
        if (((r16[r5] & 192) == 128) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x011c, code lost:
    
        if (((r16[r5] & 192) == 128) == false) goto L97;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String commonToUtf8String(byte[] r16, int r17, int r18) {
        /*
            Method dump skipped, instruction units count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.shadow.okio.internal._Utf8Kt.commonToUtf8String(byte[], int, int):java.lang.String");
    }

    public static /* synthetic */ String commonToUtf8String$default(byte[] bArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = bArr.length;
        }
        return commonToUtf8String(bArr, i10, i11);
    }
}
