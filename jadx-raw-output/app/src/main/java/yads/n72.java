package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class n72 implements ay0, p72 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o72 f80581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z3 f80582b;

    @Override // yads.p72
    public final void a(boolean z10) {
    }

    @Override // yads.ay0
    public final void pause() {
    }

    @Override // yads.ay0
    public final void resume() {
    }

    @Override // yads.p72
    public final void a() {
        z3 z3Var = this.f80582b;
        if (z3Var != null) {
            z3Var.b();
        }
        this.f80581a.f80956a.remove(this);
        this.f80582b = null;
    }

    @Override // yads.ay0
    public final void invalidate() {
        this.f80581a.f80956a.remove(this);
        this.f80582b = null;
    }

    @Override // yads.ay0
    public final void start() {
        this.f80581a.f80956a.add(this);
    }

    public n72(o72 o72Var, z3 z3Var) {
        this.f80581a = o72Var;
        this.f80582b = z3Var;
    }
}
