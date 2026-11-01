package yads;

/* JADX INFO: loaded from: classes8.dex */
public final class u32 implements ay0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tj2 f83354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wb2 f83355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sj2 f83356c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u2 f83357d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ic0 f83358e;

    @Override // yads.ay0
    public final void invalidate() {
        ((zb2) this.f83355b).a();
    }

    @Override // yads.ay0
    public final void pause() {
        ((zb2) this.f83355b).b();
    }

    @Override // yads.ay0
    public final void resume() {
        ((zb2) this.f83355b).d();
    }

    @Override // yads.ay0
    public final void start() {
        t32 t32Var = new t32(this);
        ((zb2) this.f83355b).a(this.f83358e.a(), t32Var);
        ((zb2) this.f83355b).f85305e = t32Var;
    }

    public u32(x42 x42Var, wb2 wb2Var, sj2 sj2Var, u2 u2Var, ic0 ic0Var) {
        this.f83354a = x42Var;
        this.f83355b = wb2Var;
        this.f83356c = sj2Var;
        this.f83357d = u2Var;
        this.f83358e = ic0Var;
    }
}
