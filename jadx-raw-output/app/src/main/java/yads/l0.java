package yads;

/* JADX INFO: loaded from: classes10.dex */
public abstract class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f79635a = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    public static void a(int i10, jb2 jb2Var) {
        jb2Var.c(7);
        byte[] bArr = jb2Var.f78966a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i10 >> 16) & 255);
        bArr[5] = (byte) ((i10 >> 8) & 255);
        bArr[6] = (byte) (i10 & 255);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x008c  */
    /* JADX WARN: Code duplicated, block: B:46:0x0090  */
    public static k0 a(ib2 ib2Var) {
        int i10;
        int iA = ib2Var.a(16);
        int iA2 = ib2Var.a(16);
        if (iA2 == 65535) {
            iA2 = ib2Var.a(24);
            i10 = 7;
        } else {
            i10 = 4;
        }
        int i11 = iA2 + i10;
        if (iA == 44097) {
            i11 += 2;
        }
        if (ib2Var.a(2) == 3) {
            do {
                ib2Var.a(2);
            } while (ib2Var.e());
        }
        int iA3 = ib2Var.a(10);
        if (ib2Var.e() && ib2Var.a(3) > 0) {
            ib2Var.c(2);
        }
        int i12 = ib2Var.e() ? 48000 : 44100;
        int iA4 = ib2Var.a(4);
        int i13 = 0;
        if (i12 == 44100 && iA4 == 13) {
            i13 = f79635a[iA4];
        } else if (i12 == 48000) {
            int[] iArr = f79635a;
            if (iA4 < 14) {
                i13 = iArr[iA4];
                int i14 = iA3 % 5;
                if (i14 == 1) {
                    if (iA4 != 3 || iA4 == 8) {
                        i13++;
                    }
                } else if (i14 != 2) {
                    if (i14 != 3) {
                        if (i14 == 4 && (iA4 == 3 || iA4 == 8 || iA4 == 11)) {
                            i13++;
                        }
                    } else if (iA4 != 3) {
                        i13++;
                    } else {
                        i13++;
                    }
                } else if (iA4 == 8 || iA4 == 11) {
                    i13++;
                }
            }
        }
        return new k0(i12, i11, i13);
    }
}
