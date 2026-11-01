package yads;

/* JADX INFO: loaded from: classes2.dex */
public abstract class n93 {
    public static long a(int i10, int i11, jb2 jb2Var) {
        jb2Var.e(i10);
        if (jb2Var.f78968c - jb2Var.f78967b < 5) {
            return -9223372036854775807L;
        }
        int iB = jb2Var.b();
        if ((8388608 & iB) != 0 || ((2096896 & iB) >> 8) != i11 || (iB & 32) == 0 || jb2Var.m() < 7 || jb2Var.f78968c - jb2Var.f78967b < 7 || (jb2Var.m() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        jb2Var.a(bArr, 0, 6);
        return ((255 & ((long) bArr[4])) >> 7) | ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[3]) & 255) << 1);
    }
}
