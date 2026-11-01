package sa;

/* JADX INFO: compiled from: Base64Util.java */
/* JADX INFO: loaded from: classes11.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static char[] f67140a = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=".toCharArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static byte[] f67141b = new byte[256];

    public static char[] b(byte[] bArr) {
        boolean z10;
        char[] cArr = new char[((bArr.length + 2) / 3) * 4];
        int i10 = 0;
        int i11 = 0;
        while (i10 < bArr.length) {
            int i12 = (bArr[i10] & 255) << 8;
            int i13 = i10 + 1;
            boolean z11 = true;
            if (i13 < bArr.length) {
                i12 |= bArr[i13] & 255;
                z10 = true;
            } else {
                z10 = false;
            }
            int i14 = i12 << 8;
            int i15 = i10 + 2;
            if (i15 < bArr.length) {
                i14 |= bArr[i15] & 255;
            } else {
                z11 = false;
            }
            int i16 = i11 + 3;
            char[] cArr2 = f67140a;
            int i17 = 64;
            cArr[i16] = cArr2[z11 ? i14 & 63 : 64];
            int i18 = i14 >> 6;
            int i19 = i11 + 2;
            if (z10) {
                i17 = i18 & 63;
            }
            cArr[i19] = cArr2[i17];
            int i20 = i18 >> 6;
            cArr[i11 + 1] = cArr2[i20 & 63];
            cArr[i11 + 0] = cArr2[(i20 >> 6) & 63];
            i10 += 3;
            i11 += 4;
        }
        return cArr;
    }

    static {
        for (int i10 = 0; i10 < 256; i10++) {
            f67141b[i10] = -1;
        }
        for (int i11 = 65; i11 <= 90; i11++) {
            f67141b[i11] = (byte) (i11 - 65);
        }
        for (int i12 = 97; i12 <= 122; i12++) {
            f67141b[i12] = (byte) ((i12 + 26) - 97);
        }
        for (int i13 = 48; i13 <= 57; i13++) {
            f67141b[i13] = (byte) ((i13 + 52) - 48);
        }
        byte[] bArr = f67141b;
        bArr[43] = 62;
        bArr[47] = 63;
    }

    public static String a(String str) {
        return new String(b(str.getBytes()));
    }
}
