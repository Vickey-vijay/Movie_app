package yads;

/* JADX INFO: loaded from: classes10.dex */
public final class ez2 extends x43 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fz2 f77233f;

    public ez2(fz2 fz2Var) {
        this.f77233f = fz2Var;
    }

    @Override // yads.ua0
    public final void b() {
        fz2 fz2Var = this.f77233f;
        synchronized (fz2Var.f75668b) {
            this.f82731b = 0;
            this.f84450d = null;
            ua0[] ua0VarArr = fz2Var.f75672f;
            int i10 = fz2Var.f75674h;
            fz2Var.f75674h = i10 + 1;
            ua0VarArr[i10] = this;
            fz2Var.f();
        }
    }
}
