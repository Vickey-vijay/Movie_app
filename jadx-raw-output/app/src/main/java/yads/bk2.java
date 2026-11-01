package yads;

import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class bk2 implements ns2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f75856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ek2 f75857c;

    @Override // yads.ns2
    public final void a() throws IOException {
        ek2 ek2Var = this.f75857c;
        ms2 ms2Var = ek2Var.f77122t[this.f75856b];
        mk0 mk0Var = ms2Var.f80357h;
        if (mk0Var == null || mk0Var.getState() != 1) {
            ek2Var.f77114l.a(ek2Var.f77107e.a(ek2Var.C));
        } else {
            lk0 lk0VarC = ms2Var.f80357h.c();
            lk0VarC.getClass();
            throw lk0VarC;
        }
    }

    public bk2(ek2 ek2Var, int i10) {
        this.f75857c = ek2Var;
        this.f75856b = i10;
    }

    @Override // yads.ns2
    public final boolean isReady() {
        ek2 ek2Var = this.f75857c;
        return !ek2Var.E && ek2Var.I == -9223372036854775807L && ek2Var.f77122t[this.f75856b].a(ek2Var.L);
    }

    @Override // yads.ns2
    public final int a(nx0 nx0Var, sa0 sa0Var, int i10) {
        ek2 ek2Var = this.f75857c;
        int i11 = this.f75856b;
        if (ek2Var.E || ek2Var.I != -9223372036854775807L) {
            return -3;
        }
        ek2Var.c();
        dk2 dk2Var = ek2Var.f77127y;
        boolean[] zArr = dk2Var.f76711d;
        if (!zArr[i11]) {
            mx0 mx0Var = dk2Var.f76708a.a(i11).f78090e[0];
            bn1 bn1Var = ek2Var.f77108f;
            bn1Var.a(new hm1(1, ht1.d(mx0Var.f80429m), mx0Var, 0, null, bn1Var.a(ek2Var.H), -9223372036854775807L));
            zArr[i11] = true;
        }
        int iA = ek2Var.f77122t[i11].a(nx0Var, sa0Var, i10, ek2Var.L);
        if (iA == -3) {
            ek2Var.a(i11);
        }
        return iA;
    }

    @Override // yads.ns2
    public final int a(long j10) {
        ek2 ek2Var = this.f75857c;
        int i10 = this.f75856b;
        int iA = 0;
        if (!ek2Var.E && ek2Var.I == -9223372036854775807L) {
            ek2Var.c();
            dk2 dk2Var = ek2Var.f77127y;
            boolean[] zArr = dk2Var.f76711d;
            if (!zArr[i10]) {
                mx0 mx0Var = dk2Var.f76708a.a(i10).f78090e[0];
                bn1 bn1Var = ek2Var.f77108f;
                bn1Var.a(new hm1(1, ht1.d(mx0Var.f80429m), mx0Var, 0, null, bn1Var.a(ek2Var.H), -9223372036854775807L));
                zArr[i10] = true;
            }
            ms2 ms2Var = ek2Var.f77122t[i10];
            iA = ms2Var.a(j10, ek2Var.L);
            synchronized (ms2Var) {
                if (iA >= 0) {
                    int i11 = ms2Var.f80368s + iA;
                    if (i11 <= ms2Var.f80365p) {
                        ms2Var.f80368s = i11;
                    }
                }
                throw new IllegalArgumentException();
            }
            if (iA == 0) {
                ek2Var.a(i10);
            }
        }
        return iA;
    }
}
