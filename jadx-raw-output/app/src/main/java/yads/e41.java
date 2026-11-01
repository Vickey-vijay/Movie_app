package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class e41 implements tp2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f76912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k41 f76913b;

    public e41(k41 k41Var, String str) {
        this.f76913b = k41Var;
        this.f76912a = str;
    }

    @Override // yads.tp2
    public final void a(im3 im3Var) {
        k41 k41Var = this.f76913b;
        String str = this.f76912a;
        g41 g41Var = (g41) k41Var.f79299c.remove(str);
        if (g41Var != null) {
            g41Var.f77626c = im3Var;
            k41Var.f79300d.put(str, g41Var);
            if (k41Var.f79302f == null) {
                f41 f41Var = new f41(k41Var);
                k41Var.f79302f = f41Var;
                k41Var.f79301e.postDelayed(f41Var, 100);
            }
        }
    }
}
