package okio;

import ck.p;
import java.util.Arrays;

/* JADX INFO: renamed from: okio.-Base64, reason: invalid class name */
/* JADX INFO: compiled from: Base64.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class Base64 {
    private static final byte[] BASE64;
    private static final byte[] BASE64_URL_SAFE;

    public static /* synthetic */ void getBASE64$annotations() {
    }

    public static /* synthetic */ void getBASE64_URL_SAFE$annotations() {
    }

    static {
        ByteString.Companion companion = ByteString.Companion;
        BASE64 = companion.encodeUtf8("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").getData$okio();
        BASE64_URL_SAFE = companion.encodeUtf8("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_").getData$okio();
    }

    public static final byte[] decodeBase64ToArray(String str) {
        int i10;
        char cCharAt;
        p.j(str, "<this>");
        int length = str.length();
        while (length > 0 && ((cCharAt = str.charAt(length - 1)) == '=' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == ' ' || cCharAt == '\t')) {
            length--;
        }
        int i11 = (int) ((((long) length) * 6) / 8);
        byte[] bArr = new byte[i11];
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            if (i12 >= length) {
                int i16 = i13 % 4;
                if (i16 == 1) {
                    return null;
                }
                if (i16 == 2) {
                    bArr[i15] = (byte) ((i14 << 12) >> 16);
                    i15++;
                } else if (i16 == 3) {
                    int i17 = i14 << 6;
                    int i18 = i15 + 1;
                    bArr[i15] = (byte) (i17 >> 16);
                    i15 = i18 + 1;
                    bArr[i18] = (byte) (i17 >> 8);
                }
                if (i15 == i11) {
                    return bArr;
                }
                byte[] bArrCopyOf = Arrays.copyOf(bArr, i15);
                p.i(bArrCopyOf, "copyOf(...)");
                return bArrCopyOf;
            }
            char cCharAt2 = str.charAt(i12);
            if ('A' <= cCharAt2 && cCharAt2 < '[') {
                i10 = cCharAt2 - 'A';
            } else {
                if ('a' <= cCharAt2 && cCharAt2 < '{') {
                    i10 = cCharAt2 - 'G';
                } else {
                    if ('0' <= cCharAt2 && cCharAt2 < ':') {
                        i10 = cCharAt2 + 4;
                    } else if (cCharAt2 == '+' || cCharAt2 == '-') {
                        i10 = 62;
                    } else {
                        if (cCharAt2 == '/' || cCharAt2 == '_') {
                            i10 = 63;
                        } else if (cCharAt2 != '\n' && cCharAt2 != '\r' && cCharAt2 != ' ' && cCharAt2 != '\t') {
                            return null;
                        }
                        i12++;
                    }
                }
            }
            i14 = (i14 << 6) | i10;
            i13++;
            if (i13 % 4 == 0) {
                int i19 = i15 + 1;
                bArr[i15] = (byte) (i14 >> 16);
                int i20 = i19 + 1;
                bArr[i19] = (byte) (i14 >> 8);
                bArr[i20] = (byte) i14;
                i15 = i20 + 1;
            }
            i12++;
        }
    }

    public static final String encodeBase64(byte[] bArr, byte[] bArr2) {
        p.j(bArr, "<this>");
        p.j(bArr2, "map");
        byte[] bArr3 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = i10 + 1;
            byte b10 = bArr[i10];
            int i13 = i12 + 1;
            byte b11 = bArr[i12];
            int i14 = i13 + 1;
            byte b12 = bArr[i13];
            int i15 = i11 + 1;
            bArr3[i11] = bArr2[(b10 & 255) >> 2];
            int i16 = i15 + 1;
            bArr3[i15] = bArr2[((b10 & 3) << 4) | ((b11 & 255) >> 4)];
            int i17 = i16 + 1;
            bArr3[i16] = bArr2[((b11 & 15) << 2) | ((b12 & 255) >> 6)];
            i11 = i17 + 1;
            bArr3[i17] = bArr2[b12 & 63];
            i10 = i14;
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b13 = bArr[i10];
            int i18 = i11 + 1;
            bArr3[i11] = bArr2[(b13 & 255) >> 2];
            int i19 = i18 + 1;
            bArr3[i18] = bArr2[(b13 & 3) << 4];
            bArr3[i19] = 61;
            bArr3[i19 + 1] = 61;
        } else if (length2 == 2) {
            int i20 = i10 + 1;
            byte b14 = bArr[i10];
            byte b15 = bArr[i20];
            int i21 = i11 + 1;
            bArr3[i11] = bArr2[(b14 & 255) >> 2];
            int i22 = i21 + 1;
            bArr3[i21] = bArr2[((b14 & 3) << 4) | ((b15 & 255) >> 4)];
            bArr3[i22] = bArr2[(b15 & 15) << 2];
            bArr3[i22 + 1] = 61;
        }
        return _JvmPlatformKt.toUtf8String(bArr3);
    }

    public static /* synthetic */ String encodeBase64$default(byte[] bArr, byte[] bArr2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bArr2 = BASE64;
        }
        return encodeBase64(bArr, bArr2);
    }

    public static final byte[] getBASE64() {
        return BASE64;
    }

    public static final byte[] getBASE64_URL_SAFE() {
        return BASE64_URL_SAFE;
    }
}
