package yads;

/* JADX INFO: loaded from: classes10.dex */
public final class c32 implements ac2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e32 f76146a;

    public c32(e32 e32Var) {
        this.f76146a = e32Var;
    }

    @Override // yads.ac2
    public final void a() {
        e32 e32Var = this.f76146a;
        tj2 tj2Var = e32Var.f76902d;
        if (tj2Var != null) {
            tj2Var.a();
        }
        z3 z3Var = e32Var.f76901c;
        if (z3Var != null) {
            z3Var.b();
        }
    }
}
