package c;

/* JADX INFO: loaded from: classes9.dex */
public final class k implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k0 f5578b;

    public k(k0 k0Var) {
        this.f5578b = k0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k0 k0Var = this.f5578b;
        if (k0Var.D) {
            return;
        }
        k0Var.v("load ad time out!");
        this.f5578b.E = true;
    }
}
