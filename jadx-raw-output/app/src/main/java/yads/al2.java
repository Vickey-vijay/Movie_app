package yads;

/* JADX INFO: loaded from: classes10.dex */
public final class al2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f75554c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f75555d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f75556e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y63 f75552a = new y63(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f75557f = -9223372036854775807L;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f75558g = -9223372036854775807L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f75559h = -9223372036854775807L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jb2 f75553b = new jb2();

    public static long a(jb2 jb2Var) {
        int i10 = jb2Var.f78967b;
        if (jb2Var.f78968c - i10 < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        jb2Var.a(bArr, 0, 9);
        jb2Var.e(i10);
        byte b10 = bArr[0];
        if ((b10 & 196) == 68) {
            byte b11 = bArr[2];
            if ((b11 & 4) == 4) {
                byte b12 = bArr[4];
                if ((b12 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j10 = b10;
                    long j11 = b11;
                    return ((j11 & 3) << 13) | ((j10 & 3) << 28) | (((56 & j10) >> 3) << 30) | ((((long) bArr[1]) & 255) << 20) | (((j11 & 248) >> 3) << 15) | ((((long) bArr[3]) & 255) << 5) | ((((long) b12) & 248) >> 3);
                }
            }
        }
        return -9223372036854775807L;
    }
}
