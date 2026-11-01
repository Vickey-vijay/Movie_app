package com.monetization.ads.exo.source.dash.offline;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import yads.c30;
import yads.dv0;
import yads.e30;
import yads.fc2;
import yads.fm1;
import yads.hj0;
import yads.hu;
import yads.i30;
import yads.ib3;
import yads.j30;
import yads.k30;
import yads.kx2;
import yads.lo2;
import yads.mx2;
import yads.pl2;
import yads.qr;
import yads.rr;
import yads.uo;
import yads.vo;
import yads.zb;

/* JADX INFO: loaded from: classes2.dex */
public final class DashDownloader extends mx2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final vo f42950j;

    public DashDownloader(fm1 fm1Var, qr qrVar, Executor executor) {
        this(fm1Var, new e30(), qrVar, executor);
    }

    private void a(rr rrVar, zb zbVar, long j10, long j11, boolean z10, ArrayList arrayList) throws IOException {
        for (int i10 = 0; i10 < zbVar.f85267c.size(); i10++) {
            lo2 lo2Var = (lo2) zbVar.f85267c.get(i10);
            try {
                int i11 = zbVar.f85266b;
                i30 i30VarD = lo2Var.d();
                if (i30VarD == null) {
                    hu huVar = (hu) a(new a(rrVar, i11, lo2Var), z10);
                    i30VarD = huVar == null ? null : new k30(huVar, lo2Var.f79870c);
                }
                if (i30VarD == null) {
                    throw new hj0("Missing segment index");
                }
                long jC = i30VarD.c(j11);
                if (jC == -1) {
                    throw new hj0("Unbounded segment index");
                }
                uo uoVarB = this.f42950j.b(lo2Var.f79869b);
                int i12 = ib3.f78556a;
                String str = uoVarB.f83549a;
                pl2 pl2Var = lo2Var.f79872e;
                if (pl2Var != null) {
                    arrayList.add(new kx2(j10, j30.a(lo2Var, str, pl2Var, 0)));
                }
                pl2 pl2VarE = lo2Var.e();
                if (pl2VarE != null) {
                    arrayList.add(new kx2(j10, j30.a(lo2Var, str, pl2VarE, 0)));
                }
                long jB = i30VarD.b();
                long j12 = (jB + jC) - 1;
                for (long j13 = jB; j13 <= j12; j13++) {
                    arrayList.add(new kx2(i30VarD.a(j13) + j10, j30.a(lo2Var, str, i30VarD.b(j13), 0)));
                }
            } catch (IOException e10) {
                if (!z10) {
                    throw e10;
                }
            }
        }
    }

    public DashDownloader(fm1 fm1Var, e30 e30Var, qr qrVar, Executor executor) {
        super(fm1Var, e30Var, qrVar, executor);
        this.f42950j = new vo();
    }

    @Override // yads.mx2
    public final ArrayList a(rr rrVar, dv0 dv0Var, boolean z10) throws IOException {
        c30 c30Var = (c30) dv0Var;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < c30Var.f76137m.size(); i10++) {
            fc2 fc2Var = (fc2) c30Var.f76137m.get(i10);
            long jA = ib3.a(fc2Var.f77350b);
            long jA2 = ib3.a(c30Var.b(i10));
            int i11 = 0;
            for (List list = fc2Var.f77351c; i11 < list.size(); list = list) {
                a(rrVar, (zb) list.get(i11), jA, jA2, z10, arrayList);
                i11++;
            }
        }
        return arrayList;
    }
}
