package xm;

import com.ironsource.G5;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;

/* JADX INFO: compiled from: B64Code.java */
/* JADX INFO: loaded from: classes10.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f74979a = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f74980b = new byte[256];

    static {
        for (int i10 = 0; i10 < 256; i10++) {
            f74980b[i10] = -1;
        }
        for (byte b10 = 0; b10 < 64; b10 = (byte) (b10 + 1)) {
            f74980b[(byte) f74979a[b10]] = b10;
        }
        f74980b[61] = 0;
    }

    public static void b(String str, ByteArrayOutputStream byteArrayOutputStream) {
        if (str == null) {
            return;
        }
        if (byteArrayOutputStream == null) {
            throw new IllegalArgumentException("No outputstream for decoded bytes");
        }
        byte[] bArr = new byte[4];
        int i10 = 0;
        int i11 = 0;
        while (i10 < str.length()) {
            int i12 = i10 + 1;
            char cCharAt = str.charAt(i10);
            if (cCharAt == '=') {
                return;
            }
            if (!Character.isWhitespace(cCharAt)) {
                byte b10 = f74980b[cCharAt];
                if (b10 < 0) {
                    throw new IllegalArgumentException("Not B64 encoded");
                }
                int i13 = i11 + 1;
                bArr[i11] = b10;
                if (i13 == 2) {
                    byteArrayOutputStream.write((bArr[1] >>> 4) | (bArr[0] << 2));
                } else if (i13 == 3) {
                    byteArrayOutputStream.write((bArr[1] << 4) | (bArr[2] >>> 2));
                } else if (i13 == 4) {
                    byteArrayOutputStream.write((bArr[2] << 6) | bArr[3]);
                    i11 = 0;
                }
                i11 = i13;
            }
            i10 = i12;
        }
    }

    public static byte[] c(String str) {
        if (str == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((str.length() * 4) / 3);
        b(str, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static String d(String str, String str2) throws UnsupportedEncodingException {
        return new String(e(str2 == null ? str.getBytes("ISO-8859-1") : str.getBytes(str2)));
    }

    public static char[] e(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        int length = bArr.length;
        char[] cArr = new char[((length + 2) / 3) * 4];
        int i10 = (length / 3) * 3;
        int i11 = 0;
        int i12 = 0;
        while (i11 < i10) {
            int i13 = i11 + 1;
            byte b10 = bArr[i11];
            int i14 = i13 + 1;
            byte b11 = bArr[i13];
            int i15 = i14 + 1;
            byte b12 = bArr[i14];
            int i16 = i12 + 1;
            char[] cArr2 = f74979a;
            cArr[i12] = cArr2[(b10 >>> 2) & 63];
            int i17 = i16 + 1;
            cArr[i16] = cArr2[((b10 << 4) & 63) | ((b11 >>> 4) & 15)];
            int i18 = i17 + 1;
            cArr[i17] = cArr2[((b11 << 2) & 63) | ((b12 >>> 6) & 3)];
            i12 = i18 + 1;
            cArr[i18] = cArr2[b12 & 63];
            i11 = i15;
        }
        if (length != i11) {
            int i19 = length % 3;
            if (i19 == 1) {
                byte b13 = bArr[i11];
                int i20 = i12 + 1;
                char[] cArr3 = f74979a;
                cArr[i12] = cArr3[(b13 >>> 2) & 63];
                int i21 = i20 + 1;
                cArr[i20] = cArr3[(b13 << 4) & 63];
                cArr[i21] = G5.T;
                cArr[i21 + 1] = G5.T;
            } else if (i19 == 2) {
                int i22 = i11 + 1;
                byte b14 = bArr[i11];
                byte b15 = bArr[i22];
                int i23 = i12 + 1;
                char[] cArr4 = f74979a;
                cArr[i12] = cArr4[(b14 >>> 2) & 63];
                int i24 = i23 + 1;
                cArr[i23] = cArr4[((b14 << 4) & 63) | ((b15 >>> 4) & 15)];
                cArr[i24] = cArr4[(b15 << 2) & 63];
                cArr[i24 + 1] = G5.T;
            }
        }
        return cArr;
    }

    public static String a(String str, String str2) throws UnsupportedEncodingException {
        byte[] bArrC = c(str);
        if (str2 == null) {
            return new String(bArrC);
        }
        return new String(bArrC, str2);
    }
}
