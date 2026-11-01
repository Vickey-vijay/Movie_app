package yads;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class nc0 implements b30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gg1 f80622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vo f80623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f80624c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f80625d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p30 f80626e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f80627f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final te2 f80628g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final lc0[] f80629h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public op0 f80630i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c30 f80631j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f80632k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public zo f80633l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f80634m;

    public nc0(du duVar, gg1 gg1Var, c30 c30Var, vo voVar, int i10, int[] iArr, op0 op0Var, int i11, p30 p30Var, long j10, boolean z10, ArrayList arrayList, te2 te2Var, ye2 ye2Var) {
        this.f80622a = gg1Var;
        this.f80631j = c30Var;
        this.f80623b = voVar;
        this.f80624c = iArr;
        this.f80630i = op0Var;
        this.f80625d = i11;
        this.f80626e = p30Var;
        this.f80632k = i10;
        this.f80627f = j10;
        this.f80628g = te2Var;
        long jC = c30Var.c(i10);
        ArrayList arrayListA = a();
        this.f80629h = new lc0[op0Var.f()];
        int i12 = 0;
        while (i12 < this.f80629h.length) {
            lo2 lo2Var = (lo2) arrayListA.get(op0Var.b(i12));
            uo uoVarB = voVar.b(lo2Var.f79869b);
            lc0[] lc0VarArr = this.f80629h;
            if (uoVarB == null) {
                uoVarB = (uo) lo2Var.f79869b.get(0);
            }
            int i13 = i12;
            lc0VarArr[i13] = new lc0(jC, lo2Var, uoVarB, duVar.a(i11, lo2Var.f79868a, z10, arrayList, te2Var, ye2Var), 0L, lo2Var.d());
            i12 = i13 + 1;
        }
    }

    public final ArrayList a() {
        List list = ((fc2) this.f80631j.f76137m.get(this.f80632k)).f77351c;
        ArrayList arrayList = new ArrayList();
        for (int i10 : this.f80624c) {
            arrayList.addAll(((zb) list.get(i10)).f85267c);
        }
        return arrayList;
    }
}
