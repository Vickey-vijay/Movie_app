package gl;

/* JADX INFO: loaded from: classes2.dex */
public final class n1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n0 f53567b;

    public n1(n0 n0Var) {
        this.f53567b = n0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n0 n0Var = this.f53567b;
        if (n0Var.f53561s) {
            return;
        }
        n0.c(n0Var, "load ad time out!");
        this.f53567b.f53562t = true;
    }
}
