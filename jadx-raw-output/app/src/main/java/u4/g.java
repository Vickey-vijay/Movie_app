package u4;

import g5.m;
import g5.t;
import q3.u;

/* JADX INFO: compiled from: CeaUtil.java */
/* JADX INFO: loaded from: classes3.dex */
public final class g {
    public static int c(t tVar) {
        int i10 = 0;
        while (tVar.a() != 0) {
            int iY = tVar.y();
            i10 += iY;
            if (iY != 255) {
                return i10;
            }
        }
        return -1;
    }

    public static void a(long j10, t tVar, u[] uVarArr) {
        int iJ;
        boolean z10;
        while (true) {
            boolean z11 = true;
            if (tVar.a() > 1) {
                int iC = c(tVar);
                int iC2 = c(tVar);
                int iC3 = tVar.c() + iC2;
                if (iC2 != -1 && iC2 <= tVar.a()) {
                    if (iC == 4 && iC2 >= 8) {
                        int iY = tVar.y();
                        int iE = tVar.E();
                        if (iE == 49) {
                            iJ = tVar.j();
                        } else {
                            iJ = 0;
                        }
                        int iY2 = tVar.y();
                        if (iE == 47) {
                            tVar.M(1);
                        }
                        if (iY == 181 && ((iE == 49 || iE == 47) && iY2 == 3)) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (iE == 49) {
                            if (iJ != 1195456820) {
                                z11 = false;
                            }
                            z10 &= z11;
                        }
                        if (z10) {
                            b(j10, tVar, uVarArr);
                        }
                    }
                } else {
                    m.h("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                    iC3 = tVar.d();
                }
                tVar.L(iC3);
            } else {
                return;
            }
        }
    }

    public static void b(long j10, t tVar, u[] uVarArr) {
        boolean z10;
        int iY = tVar.y();
        if ((iY & 64) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return;
        }
        tVar.M(1);
        int i10 = (iY & 31) * 3;
        int iC = tVar.c();
        for (u uVar : uVarArr) {
            tVar.L(iC);
            uVar.c(tVar, i10);
            uVar.d(j10, 1, i10, 0, null);
        }
    }
}
