package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class a32 implements ay0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lr2 f75375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lw f75376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f75377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final wb2 f75378d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z22 f75379e;

    public /* synthetic */ a32(v9 v9Var, lr2 lr2Var, k63 k63Var) {
        this(lr2Var, k63Var.b(), b32.a(v9Var), vb2.a(false));
    }

    @Override // yads.ay0
    public final void invalidate() {
        ((zb2) this.f75378d).a();
    }

    @Override // yads.ay0
    public final void pause() {
        ((zb2) this.f75378d).b();
    }

    @Override // yads.ay0
    public final void resume() {
        ((zb2) this.f75378d).d();
    }

    @Override // yads.ay0
    public final void start() {
        long jMax = Math.max(0L, this.f75377c - this.f75376b.f79948a);
        zb2 zb2Var = (zb2) this.f75378d;
        zb2Var.f85305e = this.f75376b;
        zb2Var.a(jMax, this.f75379e);
    }

    public a32(lr2 lr2Var, lw lwVar, long j10, wb2 wb2Var) {
        this.f75375a = lr2Var;
        this.f75376b = lwVar;
        this.f75377c = j10;
        this.f75378d = wb2Var;
        this.f75379e = new z22(this);
    }
}
