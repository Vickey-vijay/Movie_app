package yads;

/* JADX INFO: loaded from: classes10.dex */
public final class nr2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4 f80733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lu2 f80734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f2 f80735c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f80736d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final oi0 f80737e;

    public /* synthetic */ nr2(d4 d4Var, lu2 lu2Var, f2 f2Var, int i10) {
        this(d4Var, lu2Var, f2Var, i10, new oi0());
    }

    public static jy a(v9 v9Var, w02 w02Var, b2 b2Var, z3 z3Var, ir2 ir2Var, k63 k63Var, gi0 gi0Var, j7 j7Var) {
        x63 x63Var = new x63();
        ez1 ez1Var = new ez1();
        d42 d42VarC = w02Var.c();
        mr2 mr2Var = new mr2(v9Var, b2Var, ir2Var, ez1Var, d42VarC, k63Var, gi0Var, new jw());
        mz mzVar = new mz(v9Var, b2Var, z3Var, d42VarC, k63Var, gi0Var);
        y42 y42Var = new y42(x63Var, d42VarC, k63Var);
        return new jy(mr2Var, mzVar, new vr2(b2Var, x63Var, y42Var, new ur2(y42Var)), new q03(j7Var, b2Var, ez1Var, h03.a(j7Var)));
    }

    public nr2(d4 d4Var, lu2 lu2Var, f2 f2Var, int i10, oi0 oi0Var) {
        this.f80733a = d4Var;
        this.f80734b = lu2Var;
        this.f80735c = f2Var;
        this.f80736d = i10;
        this.f80737e = oi0Var;
    }
}
