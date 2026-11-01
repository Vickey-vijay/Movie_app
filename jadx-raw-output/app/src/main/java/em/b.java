package em;

import androidx.exifinterface.media.ExifInterface;
import com.ironsource.G5;

/* JADX INFO: compiled from: Base64.java */
/* JADX INFO: loaded from: classes11.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f52667a = new String("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").toCharArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static char f52668b = G5.T;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f52669c = "==";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f52670d = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, 64, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, ExifInterface.START_CODE, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1};

    public static byte[] b(byte[] bArr) throws Exception {
        int i10 = 0;
        boolean z10 = false;
        int i11 = 0;
        for (byte b10 : bArr) {
            byte b11 = f52670d[b10];
            if (b11 == 64) {
                if (z10) {
                    break;
                }
                z10 = true;
            } else {
                if (z10) {
                    throw new Exception("Cannot found second char!");
                }
                if (b11 != -1) {
                    bArr[i11] = b11;
                    i11++;
                }
            }
        }
        int i12 = i11 >> 2;
        int i13 = i12 * 3;
        int i14 = i11 & 3;
        if (i14 == 1) {
            throw new Exception("Cannot found first char!");
        }
        if (i14 > 0) {
            i13 = (i13 + i14) - 1;
        }
        byte[] bArr2 = new byte[i13];
        int i15 = 0;
        byte b12 = 0;
        while (i12 > 0) {
            int i16 = i10 + 1;
            byte b13 = bArr[i10];
            int i17 = i16 + 1;
            b12 = bArr[i16];
            int i18 = i17 + 1;
            byte b14 = bArr[i17];
            int i19 = i18 + 1;
            byte b15 = bArr[i18];
            int i20 = i15 + 1;
            bArr2[i15] = (byte) ((b13 << 2) | ((b12 >>> 4) & 3));
            int i21 = i20 + 1;
            bArr2[i20] = (byte) (((b12 & 15) << 4) | ((b14 >>> 2) & 15));
            i15 = i21 + 1;
            bArr2[i21] = (byte) (((b14 & 3) << 6) | b15);
            i12--;
            i10 = i19;
        }
        if (i14 >= 2) {
            int i22 = i10 + 1;
            byte b16 = bArr[i10];
            int i23 = i22 + 1;
            byte b17 = bArr[i22];
            bArr2[i15] = (byte) ((b16 << 2) | ((b17 >>> 4) & 3));
            i10 = i23;
            i15++;
            b12 = b17;
        }
        if (i14 >= 3) {
            bArr2[i15] = (byte) (((bArr[i10] >>> 2) & 15) | ((b12 & 15) << 4));
        }
        return bArr2;
    }

    public static byte[] a(String str) throws Exception {
        if (str.length() == 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[str.length()];
        for (int length = str.length() - 1; length >= 0; length--) {
            bArr[length] = (byte) str.charAt(length);
        }
        return b(bArr);
    }
}
