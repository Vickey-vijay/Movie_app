package yads;

/* JADX INFO: loaded from: classes10.dex */
public final class ew1 extends fo {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wv1 f77212b;

    @Override // yads.fo
    public final void a(String str) {
        this.f77212b.a(str);
    }

    public final void a(kw1 kw1Var) {
        this.f77466a.setHtmlWebViewListener(new zv1(this.f77212b));
    }

    public ew1(gw1 gw1Var, lh3 lh3Var, xv1 xv1Var, xv1 xv1Var2, xv1 xv1Var3, hw1 hw1Var, wv1 wv1Var) {
        super(gw1Var);
        this.f77212b = wv1Var;
        wv1Var.f84343l = hw1Var;
        wv1Var.a(lh3Var);
        wv1Var.a(xv1Var);
        wv1Var.b(xv1Var2);
        wv1Var.c(xv1Var3);
    }
}
