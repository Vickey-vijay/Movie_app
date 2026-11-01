package yads;

/* JADX INFO: loaded from: classes10.dex */
public final class qs implements q10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g9 f81946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ts f81947b;

    @Override // yads.q10
    public final void a(l4 l4Var) {
    }

    public qs(ts tsVar, g9 g9Var) {
        this.f81947b = tsVar;
        this.f81946a = g9Var;
    }

    @Override // yads.q10
    public final void a(dr2 dr2Var) {
        tr2 tr2Var = this.f81947b.f83159e;
        g9 g9Var = this.f81946a;
        synchronized (tr2Var) {
            ki2 ki2Var = tr2Var.f83153a;
            tr2Var.f83154b.getClass();
            ki2Var.a(oy0.a(g9Var), dr2Var);
        }
    }
}
