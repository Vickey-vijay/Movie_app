package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class f7 implements z3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g7 f77317a;

    public f7(g7 g7Var) {
        this.f77317a = g7Var;
    }

    @Override // yads.z3
    public final void a() {
        this.f77317a.b();
    }

    @Override // yads.z3
    public final void b() {
        g7 g7Var = this.f77317a;
        int i10 = g7Var.f77661m - 1;
        if (i10 == g7Var.f77652d.f76195c && !g7Var.f77662n) {
            g7Var.f77662n = true;
            g7Var.f77650b.b();
        }
        j7 j7Var = (j7) nj.b0.i0(this.f77317a.f77659k, i10);
        if ((j7Var != null ? j7Var.f78928c : null) != l7.f79716c || j7Var.f78927b == null) {
            this.f77317a.b();
        }
    }
}
