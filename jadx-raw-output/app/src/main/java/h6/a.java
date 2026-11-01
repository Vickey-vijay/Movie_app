package h6;

import c6.b;
import c6.f;
import c6.h;
import com.google.zxing.NotFoundException;
import y5.j;

/* JADX INFO: compiled from: Detector.java */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f53792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d6.b f53793b;

    public final j a(j[] jVarArr) {
        j jVar = jVarArr[0];
        j jVar2 = jVarArr[1];
        j jVar3 = jVarArr[2];
        j jVar4 = jVarArr[3];
        int iJ = j(jVar, jVar4);
        j jVarH = h(jVar, jVar2, (j(jVar2, jVar4) + 1) << 2);
        j jVarH2 = h(jVar3, jVar2, (iJ + 1) << 2);
        int iJ2 = j(jVarH, jVar4);
        int iJ3 = j(jVarH2, jVar4);
        float f10 = iJ2 + 1;
        j jVar5 = new j(jVar4.c() + ((jVar3.c() - jVar2.c()) / f10), jVar4.d() + ((jVar3.d() - jVar2.d()) / f10));
        float f11 = iJ3 + 1;
        j jVar6 = new j(jVar4.c() + ((jVar.c() - jVar2.c()) / f11), jVar4.d() + ((jVar.d() - jVar2.d()) / f11));
        if (e(jVar5)) {
            return (e(jVar6) && j(jVarH, jVar5) + j(jVarH2, jVar5) <= j(jVarH, jVar6) + j(jVarH2, jVar6)) ? jVar6 : jVar5;
        }
        if (e(jVar6)) {
            return jVar6;
        }
        return null;
    }

    public final j[] c(j[] jVarArr) {
        j jVar = jVarArr[0];
        j jVar2 = jVarArr[1];
        j jVar3 = jVarArr[3];
        j jVar4 = jVarArr[2];
        int iJ = j(jVar, jVar2);
        int iJ2 = j(jVar2, jVar3);
        int iJ3 = j(jVar3, jVar4);
        int iJ4 = j(jVar4, jVar);
        j[] jVarArr2 = {jVar4, jVar, jVar2, jVar3};
        if (iJ > iJ2) {
            jVarArr2[0] = jVar;
            jVarArr2[1] = jVar2;
            jVarArr2[2] = jVar3;
            jVarArr2[3] = jVar4;
            iJ = iJ2;
        }
        if (iJ > iJ3) {
            jVarArr2[0] = jVar2;
            jVarArr2[1] = jVar3;
            jVarArr2[2] = jVar4;
            jVarArr2[3] = jVar;
        } else {
            iJ3 = iJ;
        }
        if (iJ3 > iJ4) {
            jVarArr2[0] = jVar3;
            jVarArr2[1] = jVar4;
            jVarArr2[2] = jVar;
            jVarArr2[3] = jVar2;
        }
        return jVarArr2;
    }

    public final j[] d(j[] jVarArr) {
        j jVar = jVarArr[0];
        j jVar2 = jVarArr[1];
        j jVar3 = jVarArr[2];
        j jVar4 = jVarArr[3];
        int iJ = (j(jVar, jVar4) + 1) << 2;
        if (j(h(jVar2, jVar3, iJ), jVar) < j(h(jVar3, jVar2, iJ), jVar4)) {
            jVarArr[0] = jVar;
            jVarArr[1] = jVar2;
            jVarArr[2] = jVar3;
            jVarArr[3] = jVar4;
        } else {
            jVarArr[0] = jVar2;
            jVarArr[1] = jVar3;
            jVarArr[2] = jVar4;
            jVarArr[3] = jVar;
        }
        return jVarArr;
    }

    public final j[] i(j[] jVarArr) {
        j jVar = jVarArr[0];
        j jVar2 = jVarArr[1];
        j jVar3 = jVarArr[2];
        j jVar4 = jVarArr[3];
        int iJ = j(jVar, jVar4) + 1;
        j jVarH = h(jVar, jVar2, (j(jVar3, jVar4) + 1) << 2);
        j jVarH2 = h(jVar3, jVar2, iJ << 2);
        int iJ2 = j(jVarH, jVar4) + 1;
        int iJ3 = j(jVarH2, jVar4) + 1;
        if ((iJ2 & 1) == 1) {
            iJ2++;
        }
        if ((iJ3 & 1) == 1) {
            iJ3++;
        }
        float fC = (((jVar.c() + jVar2.c()) + jVar3.c()) + jVar4.c()) / 4.0f;
        float fD = (((jVar.d() + jVar2.d()) + jVar3.d()) + jVar4.d()) / 4.0f;
        j jVarF = f(jVar, fC, fD);
        j jVarF2 = f(jVar2, fC, fD);
        j jVarF3 = f(jVar3, fC, fD);
        j jVarF4 = f(jVar4, fC, fD);
        int i10 = iJ3 << 2;
        int i11 = iJ2 << 2;
        return new j[]{h(h(jVarF, jVarF2, i10), jVarF4, i11), h(h(jVarF2, jVarF, i10), jVarF3, i11), h(h(jVarF3, jVarF4, i10), jVarF2, i11), h(h(jVarF4, jVarF3, i10), jVarF, i11)};
    }

    public static b g(b bVar, j jVar, j jVar2, j jVar3, j jVar4, int i10, int i11) throws NotFoundException {
        float f10 = i10 - 0.5f;
        float f11 = i11 - 0.5f;
        return h.b().c(bVar, i10, i11, 0.5f, 0.5f, f10, 0.5f, f10, f11, 0.5f, f11, jVar.c(), jVar.d(), jVar4.c(), jVar4.d(), jVar3.c(), jVar3.d(), jVar2.c(), jVar2.d());
    }

    public f b() throws NotFoundException {
        int iMax;
        int i10;
        j[] jVarArrD = d(c(this.f53793b.c()));
        j jVarA = a(jVarArrD);
        jVarArrD[3] = jVarA;
        if (jVarA == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        j[] jVarArrI = i(jVarArrD);
        j jVar = jVarArrI[0];
        j jVar2 = jVarArrI[1];
        j jVar3 = jVarArrI[2];
        j jVar4 = jVarArrI[3];
        int iJ = j(jVar, jVar4) + 1;
        int iJ2 = j(jVar3, jVar4) + 1;
        if ((iJ & 1) == 1) {
            iJ++;
        }
        if ((iJ2 & 1) == 1) {
            iJ2++;
        }
        if (iJ * 4 >= iJ2 * 7 || iJ2 * 4 >= iJ * 7) {
            iMax = iJ;
            i10 = iJ2;
        } else {
            iMax = Math.max(iJ, iJ2);
            i10 = iMax;
        }
        return new f(g(this.f53792a, jVar, jVar2, jVar3, jVar4, iMax, i10), new j[]{jVar, jVar2, jVar3, jVar4});
    }

    public final int j(j jVar, j jVar2) {
        int iC = (int) jVar.c();
        int iD = (int) jVar.d();
        int iC2 = (int) jVar2.c();
        int iD2 = (int) jVar2.d();
        int i10 = 0;
        boolean z10 = Math.abs(iD2 - iD) > Math.abs(iC2 - iC);
        if (z10) {
            iD = iC;
            iC = iD;
            iD2 = iC2;
            iC2 = iD2;
        }
        int iAbs = Math.abs(iC2 - iC);
        int iAbs2 = Math.abs(iD2 - iD);
        int i11 = (-iAbs) / 2;
        int i12 = iD < iD2 ? 1 : -1;
        int i13 = iC >= iC2 ? -1 : 1;
        boolean zD = this.f53792a.d(z10 ? iD : iC, z10 ? iC : iD);
        while (iC != iC2) {
            boolean zD2 = this.f53792a.d(z10 ? iD : iC, z10 ? iC : iD);
            if (zD2 != zD) {
                i10++;
                zD = zD2;
            }
            i11 += iAbs2;
            if (i11 > 0) {
                if (iD == iD2) {
                    break;
                }
                iD += i12;
                i11 -= iAbs;
            }
            iC += i13;
        }
        return i10;
    }

    public a(b bVar) throws NotFoundException {
        this.f53792a = bVar;
        this.f53793b = new d6.b(bVar);
    }

    public static j f(j jVar, float f10, float f11) {
        float f12;
        float f13;
        float fC = jVar.c();
        float fD = jVar.d();
        if (fC < f10) {
            f12 = fC - 1.0f;
        } else {
            f12 = fC + 1.0f;
        }
        if (fD < f11) {
            f13 = fD - 1.0f;
        } else {
            f13 = fD + 1.0f;
        }
        return new j(f12, f13);
    }

    public static j h(j jVar, j jVar2, int i10) {
        float f10 = i10 + 1;
        return new j(jVar.c() + ((jVar2.c() - jVar.c()) / f10), jVar.d() + ((jVar2.d() - jVar.d()) / f10));
    }

    public final boolean e(j jVar) {
        if (jVar.c() >= 0.0f && jVar.c() < this.f53792a.j() && jVar.d() > 0.0f && jVar.d() < this.f53792a.g()) {
            return true;
        }
        return false;
    }
}
