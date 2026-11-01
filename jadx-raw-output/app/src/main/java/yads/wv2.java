package yads;

/* JADX INFO: loaded from: classes9.dex */
public final class wv2 implements s42 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xv2 f84350a;

    @Override // yads.s42
    public final void a(l4 l4Var) {
        xv2 xv2Var = this.f84350a;
        if (xv2Var.f84719k) {
            return;
        }
        xv2Var.f84718j = null;
        xv2Var.f84709a.b(l4Var);
    }

    public wv2(xv2 xv2Var) {
        this.f84350a = xv2Var;
    }

    @Override // yads.s42
    public final void a(w02 w02Var) {
        xv2 xv2Var = this.f84350a;
        if (xv2Var.f84719k) {
            return;
        }
        xv2Var.f84718j = w02Var;
        xv2Var.f84709a.l();
    }
}
