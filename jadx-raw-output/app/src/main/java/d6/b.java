package d6;

import com.google.zxing.NotFoundException;
import y5.j;

/* JADX INFO: compiled from: WhiteRectangleDetector.java */
/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c6.b f51891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f51892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f51893c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f51894d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f51895e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f51896f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f51897g;

    public b(c6.b bVar) throws NotFoundException {
        this(bVar, 10, bVar.j() / 2, bVar.g() / 2);
    }

    public final boolean b(int i10, int i11, int i12, boolean z10) {
        if (z10) {
            while (i10 <= i11) {
                if (this.f51891a.d(i10, i12)) {
                    return true;
                }
                i10++;
            }
            return false;
        }
        while (i10 <= i11) {
            if (this.f51891a.d(i12, i10)) {
                return true;
            }
            i10++;
        }
        return false;
    }

    public b(c6.b bVar, int i10, int i11, int i12) throws NotFoundException {
        this.f51891a = bVar;
        int iG = bVar.g();
        this.f51892b = iG;
        int iJ = bVar.j();
        this.f51893c = iJ;
        int i13 = i10 / 2;
        int i14 = i11 - i13;
        this.f51894d = i14;
        int i15 = i11 + i13;
        this.f51895e = i15;
        int i16 = i12 - i13;
        this.f51897g = i16;
        int i17 = i12 + i13;
        this.f51896f = i17;
        if (i16 < 0 || i14 < 0 || i17 >= iG || i15 >= iJ) {
            throw NotFoundException.getNotFoundInstance();
        }
    }

    public j[] c() throws NotFoundException {
        int i10 = this.f51894d;
        int i11 = this.f51895e;
        int i12 = this.f51897g;
        int i13 = this.f51896f;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = true;
        while (z15) {
            boolean z16 = false;
            boolean zB = true;
            while (true) {
                if ((!zB && z11) || i11 >= this.f51893c) {
                    break;
                }
                zB = b(i12, i13, i11, false);
                if (zB) {
                    i11++;
                    z11 = true;
                    z16 = true;
                } else if (!z11) {
                    i11++;
                }
            }
            if (i11 < this.f51893c) {
                boolean zB2 = true;
                while (true) {
                    if ((!zB2 && z12) || i13 >= this.f51892b) {
                        break;
                    }
                    zB2 = b(i10, i11, i13, true);
                    if (zB2) {
                        i13++;
                        z12 = true;
                        z16 = true;
                    } else if (!z12) {
                        i13++;
                    }
                }
                if (i13 < this.f51892b) {
                    boolean zB3 = true;
                    while (true) {
                        if ((!zB3 && z13) || i10 < 0) {
                            break;
                        }
                        zB3 = b(i12, i13, i10, false);
                        if (zB3) {
                            i10--;
                            z13 = true;
                            z16 = true;
                        } else if (!z13) {
                            i10--;
                        }
                    }
                    if (i10 >= 0) {
                        z15 = z16;
                        boolean zB4 = true;
                        while (true) {
                            if ((!zB4 && z14) || i12 < 0) {
                                break;
                            }
                            zB4 = b(i10, i11, i12, true);
                            if (zB4) {
                                i12--;
                                z15 = true;
                                z14 = true;
                            } else if (!z14) {
                                i12--;
                            }
                        }
                        if (i12 < 0) {
                        }
                    }
                }
            }
            z10 = true;
            break;
        }
        if (z10) {
            throw NotFoundException.getNotFoundInstance();
        }
        int i14 = i11 - i10;
        j jVarD = null;
        j jVarD2 = null;
        for (int i15 = 1; jVarD2 == null && i15 < i14; i15++) {
            jVarD2 = d(i10, i13 - i15, i10 + i15, i13);
        }
        if (jVarD2 == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        j jVarD3 = null;
        for (int i16 = 1; jVarD3 == null && i16 < i14; i16++) {
            jVarD3 = d(i10, i12 + i16, i10 + i16, i12);
        }
        if (jVarD3 == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        j jVarD4 = null;
        for (int i17 = 1; jVarD4 == null && i17 < i14; i17++) {
            jVarD4 = d(i11, i12 + i17, i11 - i17, i12);
        }
        if (jVarD4 == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        for (int i18 = 1; jVarD == null && i18 < i14; i18++) {
            jVarD = d(i11, i13 - i18, i11 - i18, i13);
        }
        if (jVarD != null) {
            return a(jVarD, jVarD2, jVarD4, jVarD3);
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public final j[] a(j jVar, j jVar2, j jVar3, j jVar4) {
        float fC = jVar.c();
        float fD = jVar.d();
        float fC2 = jVar2.c();
        float fD2 = jVar2.d();
        float fC3 = jVar3.c();
        float fD3 = jVar3.d();
        float fC4 = jVar4.c();
        float fD4 = jVar4.d();
        if (fC < this.f51893c / 2.0f) {
            return new j[]{new j(fC4 - 1.0f, fD4 + 1.0f), new j(fC2 + 1.0f, fD2 + 1.0f), new j(fC3 - 1.0f, fD3 - 1.0f), new j(fC + 1.0f, fD - 1.0f)};
        }
        return new j[]{new j(fC4 + 1.0f, fD4 + 1.0f), new j(fC2 + 1.0f, fD2 - 1.0f), new j(fC3 - 1.0f, fD3 + 1.0f), new j(fC - 1.0f, fD - 1.0f)};
    }

    public final j d(float f10, float f11, float f12, float f13) {
        int iC = a.c(a.a(f10, f11, f12, f13));
        float f14 = iC;
        float f15 = (f12 - f10) / f14;
        float f16 = (f13 - f11) / f14;
        for (int i10 = 0; i10 < iC; i10++) {
            float f17 = i10;
            int iC2 = a.c((f17 * f15) + f10);
            int iC3 = a.c((f17 * f16) + f11);
            if (this.f51891a.d(iC2, iC3)) {
                return new j(iC2, iC3);
            }
        }
        return null;
    }
}
