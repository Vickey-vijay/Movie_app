package yads;

/* JADX INFO: loaded from: classes7.dex */
public final class o33 implements pq0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f80926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pq0 f80927c;

    @Override // yads.pq0
    public final void a() {
        this.f80927c.a();
    }

    @Override // yads.pq0
    public final void a(vw2 vw2Var) {
        this.f80927c.a(new n33(this, vw2Var));
    }

    public o33(long j10, pq0 pq0Var) {
        this.f80926b = j10;
        this.f80927c = pq0Var;
    }

    @Override // yads.pq0
    public final m73 a(int i10, int i11) {
        return this.f80927c.a(i10, i11);
    }
}
