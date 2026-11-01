package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class w62 implements ay0, m62 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d62 f84115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tj2 f84116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sj2 f84117c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u2 f84118d;

    @Override // yads.m62
    public final void a(long j10, long j11) {
        long j12 = j11 + this.f84117c.f82669a;
        long jA = this.f84118d.a(j10);
        if (j12 < jA) {
            this.f84116b.a(jA, j12);
        } else {
            invalidate();
            this.f84116b.a();
        }
    }

    @Override // yads.ay0
    public final void pause() {
    }

    @Override // yads.ay0
    public final void resume() {
    }

    @Override // yads.m62
    public final void b() {
        this.f84116b.a();
        invalidate();
    }

    @Override // yads.ay0
    public final void invalidate() {
        this.f84115a.f76588a.remove(this);
    }

    @Override // yads.ay0
    public final void start() {
        this.f84115a.f76588a.add(this);
    }

    public w62(d62 d62Var, x42 x42Var, sj2 sj2Var, u2 u2Var) {
        this.f84115a = d62Var;
        this.f84116b = x42Var;
        this.f84117c = sj2Var;
        this.f84118d = u2Var;
    }

    @Override // yads.m62
    public final void a() {
        this.f84116b.a();
        invalidate();
    }
}
