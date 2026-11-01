package q6;

import y5.j;

/* JADX INFO: compiled from: DetectionResultRowIndicatorColumn.java */
/* JADX INFO: loaded from: classes11.dex */
public final class g extends f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f66550c;

    public final void l(d[] dVarArr, a aVar) {
        for (int i10 = 0; i10 < dVarArr.length; i10++) {
            d dVar = dVarArr[i10];
            if (dVar != null) {
                int iE = dVar.e() % 30;
                int iC = dVar.c();
                if (iC > aVar.c()) {
                    dVarArr[i10] = null;
                } else {
                    if (!this.f66550c) {
                        iC += 2;
                    }
                    int i11 = iC % 3;
                    if (i11 != 0) {
                        if (i11 != 1) {
                            if (i11 == 2 && iE + 1 != aVar.a()) {
                                dVarArr[i10] = null;
                            }
                        } else if (iE / 3 != aVar.b() || iE % 3 != aVar.d()) {
                            dVarArr[i10] = null;
                        }
                    } else if ((iE * 3) + 1 != aVar.e()) {
                        dVarArr[i10] = null;
                    }
                }
            }
        }
    }

    public boolean k() {
        return this.f66550c;
    }

    @Override // q6.f
    public String toString() {
        return "IsLeft: " + this.f66550c + '\n' + super.toString();
    }

    public g(c cVar, boolean z10) {
        super(cVar);
        this.f66550c = z10;
    }

    public void g(a aVar) {
        j jVarI;
        j jVarC;
        boolean z10;
        d[] dVarArrD = d();
        m();
        l(dVarArrD, aVar);
        c cVarA = a();
        if (this.f66550c) {
            jVarI = cVarA.h();
        } else {
            jVarI = cVarA.i();
        }
        if (this.f66550c) {
            jVarC = cVarA.b();
        } else {
            jVarC = cVarA.c();
        }
        int iE = e((int) jVarC.d());
        int iC = -1;
        int i10 = 0;
        int iMax = 1;
        for (int iE2 = e((int) jVarI.d()); iE2 < iE; iE2++) {
            d dVar = dVarArrD[iE2];
            if (dVar != null) {
                int iC2 = dVar.c() - iC;
                if (iC2 == 0) {
                    i10++;
                } else {
                    if (iC2 == 1) {
                        iMax = Math.max(iMax, i10);
                        iC = dVar.c();
                    } else if (iC2 >= 0 && dVar.c() < aVar.c() && iC2 <= iE2) {
                        if (iMax > 2) {
                            iC2 *= iMax - 2;
                        }
                        if (iC2 >= iE2) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        for (int i11 = 1; i11 <= iC2 && !z10; i11++) {
                            if (dVarArrD[iE2 - i11] != null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                        }
                        if (z10) {
                            dVarArrD[iE2] = null;
                        } else {
                            iC = dVar.c();
                        }
                    } else {
                        dVarArrD[iE2] = null;
                    }
                    i10 = 1;
                }
            }
        }
    }

    public final void h(a aVar) {
        j jVarI;
        j jVarC;
        c cVarA = a();
        if (this.f66550c) {
            jVarI = cVarA.h();
        } else {
            jVarI = cVarA.i();
        }
        if (this.f66550c) {
            jVarC = cVarA.b();
        } else {
            jVarC = cVarA.c();
        }
        int iE = e((int) jVarC.d());
        d[] dVarArrD = d();
        int iC = -1;
        int i10 = 0;
        int iMax = 1;
        for (int iE2 = e((int) jVarI.d()); iE2 < iE; iE2++) {
            d dVar = dVarArrD[iE2];
            if (dVar != null) {
                dVar.j();
                int iC2 = dVar.c() - iC;
                if (iC2 == 0) {
                    i10++;
                } else {
                    if (iC2 == 1) {
                        iMax = Math.max(iMax, i10);
                        iC = dVar.c();
                    } else if (dVar.c() >= aVar.c()) {
                        dVarArrD[iE2] = null;
                    } else {
                        iC = dVar.c();
                    }
                    i10 = 1;
                }
            }
        }
    }

    public a i() {
        d[] dVarArrD = d();
        b bVar = new b();
        b bVar2 = new b();
        b bVar3 = new b();
        b bVar4 = new b();
        for (d dVar : dVarArrD) {
            if (dVar != null) {
                dVar.j();
                int iE = dVar.e() % 30;
                int iC = dVar.c();
                if (!this.f66550c) {
                    iC += 2;
                }
                int i10 = iC % 3;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            bVar.b(iE + 1);
                        }
                    } else {
                        bVar4.b(iE / 3);
                        bVar3.b(iE % 3);
                    }
                } else {
                    bVar2.b((iE * 3) + 1);
                }
            }
        }
        if (bVar.a().length != 0 && bVar2.a().length != 0 && bVar3.a().length != 0 && bVar4.a().length != 0 && bVar.a()[0] > 0 && bVar2.a()[0] + bVar3.a()[0] >= 3 && bVar2.a()[0] + bVar3.a()[0] <= 90) {
            a aVar = new a(bVar.a()[0], bVar2.a()[0], bVar3.a()[0], bVar4.a()[0]);
            l(dVarArrD, aVar);
            return aVar;
        }
        return null;
    }

    public int[] j() {
        int iC;
        a aVarI = i();
        if (aVarI == null) {
            return null;
        }
        h(aVarI);
        int iC2 = aVarI.c();
        int[] iArr = new int[iC2];
        for (d dVar : d()) {
            if (dVar != null && (iC = dVar.c()) < iC2) {
                iArr[iC] = iArr[iC] + 1;
            }
        }
        return iArr;
    }

    public final void m() {
        for (d dVar : d()) {
            if (dVar != null) {
                dVar.j();
            }
        }
    }
}
