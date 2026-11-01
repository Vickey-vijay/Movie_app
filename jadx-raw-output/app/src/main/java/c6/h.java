package c6;

import com.google.zxing.NotFoundException;

/* JADX INFO: compiled from: GridSampler.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static h f5678a = new e();

    public abstract b c(b bVar, int i10, int i11, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, float f21, float f22, float f23, float f24, float f25) throws NotFoundException;

    public abstract b d(b bVar, int i10, int i11, j jVar) throws NotFoundException;

    public static h b() {
        return f5678a;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0035  */
    /* JADX WARN: Code duplicated, block: B:20:0x0039 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x003b  */
    /* JADX WARN: Code duplicated, block: B:40:0x0072  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    /* JADX WARN: Code duplicated, block: B:55:0x0041 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x007e A[SYNTHETIC] */
    public static void a(b bVar, float[] fArr) throws NotFoundException {
        int iJ = bVar.j();
        int iG = bVar.g();
        int length = fArr.length - 1;
        boolean z10 = true;
        for (int i10 = 0; i10 < length && z10; i10 += 2) {
            int i11 = (int) fArr[i10];
            int i12 = i10 + 1;
            int i13 = (int) fArr[i12];
            if (i11 >= -1 && i11 <= iJ && i13 >= -1 && i13 <= iG) {
                if (i11 == -1) {
                    fArr[i10] = 0.0f;
                } else {
                    if (i11 == iJ) {
                        fArr[i10] = iJ - 1;
                    } else {
                        z10 = false;
                    }
                    if (i13 == -1) {
                        fArr[i12] = 0.0f;
                    } else {
                        if (i13 == iG) {
                            fArr[i12] = iG - 1;
                        }
                    }
                    z10 = true;
                }
                z10 = true;
                if (i13 == -1) {
                    fArr[i12] = 0.0f;
                } else {
                    if (i13 == iG) {
                        fArr[i12] = iG - 1;
                    }
                }
                z10 = true;
            } else {
                throw NotFoundException.getNotFoundInstance();
            }
        }
        boolean z11 = true;
        for (int length2 = fArr.length - 2; length2 >= 0 && z11; length2 -= 2) {
            int i14 = (int) fArr[length2];
            int i15 = length2 + 1;
            int i16 = (int) fArr[i15];
            if (i14 >= -1 && i14 <= iJ && i16 >= -1 && i16 <= iG) {
                if (i14 == -1) {
                    fArr[length2] = 0.0f;
                } else {
                    if (i14 == iJ) {
                        fArr[length2] = iJ - 1;
                    } else {
                        z11 = false;
                    }
                    if (i16 == -1) {
                        fArr[i15] = 0.0f;
                    } else {
                        if (i16 == iG) {
                            fArr[i15] = iG - 1;
                        }
                    }
                    z11 = true;
                }
                z11 = true;
                if (i16 == -1) {
                    fArr[i15] = 0.0f;
                } else {
                    if (i16 == iG) {
                        fArr[i15] = iG - 1;
                    }
                }
                z11 = true;
            } else {
                throw NotFoundException.getNotFoundInstance();
            }
        }
    }
}
