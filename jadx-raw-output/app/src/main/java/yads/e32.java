package yads;

/* JADX INFO: loaded from: classes3.dex */
public final class e32 implements ay0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wb2 f76899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ic0 f76900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public z3 f76901c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public tj2 f76902d;

    public e32(z3 z3Var, tj2 tj2Var, wb2 wb2Var, ic0 ic0Var) {
        this.f76899a = wb2Var;
        this.f76900b = ic0Var;
        this.f76901c = z3Var;
        this.f76902d = tj2Var;
    }

    @Override // yads.ay0
    public final void invalidate() {
        ((zb2) this.f76899a).a();
        ((zb2) this.f76899a).f85305e = null;
        this.f76901c = null;
        this.f76902d = null;
    }

    @Override // yads.ay0
    public final void pause() {
        ((zb2) this.f76899a).b();
    }

    @Override // yads.ay0
    public final void resume() {
        ((zb2) this.f76899a).d();
    }

    @Override // yads.ay0
    public final void start() {
        c32 c32Var = new c32(this);
        long jA = this.f76900b.a();
        d32 d32Var = new d32(this, jA);
        zb2 zb2Var = (zb2) this.f76899a;
        zb2Var.f85305e = d32Var;
        zb2Var.a(jA, c32Var);
    }

    public /* synthetic */ e32(z3 z3Var, k63 k63Var, tj2 tj2Var) {
        this(z3Var, tj2Var, vb2.a(false), k63Var.c());
    }
}
