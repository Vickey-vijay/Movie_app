package to;

/* JADX INFO: compiled from: HexBin.java */
/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static byte[] f72494a = new byte[255];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static byte[] f72495b = new byte[16];

    public static byte[] c(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        int length = bArr.length;
        if (length % 2 != 0) {
            return null;
        }
        int i10 = length / 2;
        byte[] bArr2 = new byte[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = i11 * 2;
            if (e(bArr[i12])) {
                int i13 = i12 + 1;
                if (e(bArr[i13])) {
                    byte[] bArr3 = f72494a;
                    bArr2[i11] = (byte) ((bArr3[bArr[i12]] << 4) | bArr3[bArr[i13]]);
                }
            }
            return null;
        }
        return bArr2;
    }

    static {
        for (int i10 = 0; i10 < 255; i10++) {
            f72494a[i10] = -1;
        }
        for (int i11 = 57; i11 >= 48; i11--) {
            f72494a[i11] = (byte) (i11 - 48);
        }
        for (int i12 = 70; i12 >= 65; i12--) {
            f72494a[i12] = (byte) ((i12 - 65) + 10);
        }
        for (int i13 = 102; i13 >= 97; i13--) {
            f72494a[i13] = (byte) ((i13 - 97) + 10);
        }
        for (int i14 = 0; i14 < 10; i14++) {
            f72495b[i14] = (byte) (i14 + 48);
        }
        for (int i15 = 10; i15 <= 15; i15++) {
            f72495b[i15] = (byte) ((i15 + 65) - 10);
        }
    }

    public static String a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return new String(d(bArr));
    }

    public static String b(byte[] bArr, String str) {
        if (bArr == null) {
            return null;
        }
        String str2 = new String(d(bArr));
        StringBuilder sb2 = new StringBuilder();
        int i10 = 1;
        for (char c10 : str2.toCharArray()) {
            sb2.append(c10);
            if (i10 == 2) {
                sb2.append(str);
                i10 = 1;
            } else {
                i10++;
            }
        }
        sb2.deleteCharAt(sb2.length() - 1);
        return sb2.toString();
    }

    public static byte[] d(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        int length = bArr.length;
        byte[] bArr2 = new byte[length * 2];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = i10 * 2;
            byte[] bArr3 = f72495b;
            bArr2[i11] = bArr3[(bArr[i10] >> 4) & 15];
            bArr2[i11 + 1] = bArr3[bArr[i10] & 15];
        }
        return bArr2;
    }

    public static boolean e(byte b10) {
        return f72494a[b10] != -1;
    }

    public static byte[] g(String str, String str2) {
        return c(str.replaceAll(str2, "").getBytes());
    }

    public static byte[] f(String str) {
        return c(str.getBytes());
    }
}
