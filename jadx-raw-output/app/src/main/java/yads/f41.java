package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class f41 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k41 f77296b;

    public f41(k41 k41Var) {
        this.f77296b = k41Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (g41 g41Var : this.f77296b.f79300d.values()) {
            for (i41 i41Var : g41Var.f77627d) {
                j41 j41Var = i41Var.f78483b;
                if (j41Var != null) {
                    im3 im3Var = g41Var.f77626c;
                    if (im3Var == null) {
                        i41Var.f78482a = g41Var.f77625b;
                        j41Var.a(i41Var, false);
                    } else {
                        j41Var.a(im3Var);
                    }
                }
            }
        }
        this.f77296b.f79300d.clear();
        this.f77296b.f79302f = null;
    }
}
