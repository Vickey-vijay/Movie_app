package yads;

/* JADX INFO: loaded from: classes7.dex */
public final class ms1 implements ns2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ns2 f80348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f80349c;

    @Override // yads.ns2
    public final void a() {
        this.f80348b.a();
    }

    @Override // yads.ns2
    public final int a(nx0 nx0Var, sa0 sa0Var, int i10) {
        int iA = this.f80348b.a(nx0Var, sa0Var, i10);
        if (iA == -4) {
            sa0Var.f82570f = Math.max(0L, sa0Var.f82570f + this.f80349c);
        }
        return iA;
    }

    @Override // yads.ns2
    public final boolean isReady() {
        return this.f80348b.isReady();
    }

    public ms1(ns2 ns2Var, long j10) {
        this.f80348b = ns2Var;
        this.f80349c = j10;
    }

    @Override // yads.ns2
    public final int a(long j10) {
        return this.f80348b.a(j10 - this.f80349c);
    }
}
