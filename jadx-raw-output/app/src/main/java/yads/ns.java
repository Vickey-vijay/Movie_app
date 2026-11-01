package yads;

/* JADX INFO: loaded from: classes10.dex */
public final class ns implements w00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g9 f80739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ps f80740b;

    @Override // yads.w00
    public final void a(l4 l4Var) {
    }

    public ns(ps psVar, g9 g9Var) {
        this.f80740b = psVar;
        this.f80739a = g9Var;
    }

    @Override // yads.w00
    public final void a(jd1 jd1Var) {
        qd1 qd1Var = this.f80740b.f81559e;
        g9 g9Var = this.f80739a;
        synchronized (qd1Var) {
            ki2 ki2Var = qd1Var.f81832a;
            qd1Var.f81833b.getClass();
            ki2Var.a(oy0.a(g9Var), jd1Var);
        }
    }
}
