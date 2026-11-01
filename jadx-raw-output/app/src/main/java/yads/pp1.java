package yads;

/* JADX INFO: loaded from: classes10.dex */
public final class pp1 implements x22 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v9 f81528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hq1 f81529b;

    @Override // yads.x22
    public final w22 a(m02 m02Var) {
        v9 v9Var = this.f81528a;
        hq1 hq1Var = this.f81529b;
        d4 d4Var = m02Var.f85497c;
        lu2 lu2Var = m02Var.f85498d;
        ep1 ep1Var = new ep1(d4Var);
        xo1 xo1Var = new xo1(d4Var, lu2Var, v9Var);
        lp1 lp1Var = new lp1(new mo1(hq1Var.f78303b, ep1Var, xo1Var));
        do1 do1Var = new do1(d4Var, lu2Var, m02Var.f85496b, new mp1(), xo1Var, lp1Var, new sb2(m02Var, hq1Var));
        return new op1(do1Var, new c22(v9Var, lu2Var, m02Var, do1Var));
    }

    public pp1(v9 v9Var, hq1 hq1Var) {
        this.f81528a = v9Var;
        this.f81529b = hq1Var;
    }
}
