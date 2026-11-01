package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class qm3 implements oo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final to2 f81904a;

    @Override // yads.tp2
    public final void a(im3 im3Var) {
        if (this.f81904a != null) {
            this.f81904a.a(pm3.a(im3Var));
        }
    }

    public qm3(to2 to2Var) {
        this.f81904a = to2Var;
    }

    @Override // yads.up2
    public final void a(Object obj) {
        to2 to2Var = this.f81904a;
        if (to2Var != null) {
            to2Var.onSuccess(obj);
        }
    }
}
