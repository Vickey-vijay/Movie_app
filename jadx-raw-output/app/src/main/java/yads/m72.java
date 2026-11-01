package yads;

/* JADX INFO: loaded from: classes11.dex */
public final class m72 implements ay0, p72 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o72 f80121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lr2 f80122b;

    @Override // yads.p72
    public final void a() {
    }

    @Override // yads.ay0
    public final void pause() {
    }

    @Override // yads.ay0
    public final void resume() {
    }

    @Override // yads.p72
    public final void a(boolean z10) {
        if (z10) {
            return;
        }
        this.f80122b.a();
        this.f80121a.f80956a.remove(this);
    }

    @Override // yads.ay0
    public final void invalidate() {
        this.f80121a.f80956a.remove(this);
    }

    @Override // yads.ay0
    public final void start() {
        this.f80121a.f80956a.add(this);
    }

    public m72(o72 o72Var, lr2 lr2Var) {
        this.f80121a = o72Var;
        this.f80122b = lr2Var;
    }
}
