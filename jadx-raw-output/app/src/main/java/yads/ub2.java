package yads;

/* JADX INFO: loaded from: classes11.dex */
public final class ub2 implements rw2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public mx0 f83413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public y63 f83414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public m73 f83415c;

    @Override // yads.rw2
    public final void a(jb2 jb2Var) {
        long jA;
        y63 y63Var = this.f83414b;
        if (y63Var == null) {
            throw new IllegalStateException();
        }
        int i10 = ib3.f78556a;
        synchronized (y63Var) {
            long j10 = y63Var.f84835c;
            jA = j10 != -9223372036854775807L ? j10 + y63Var.f84834b : y63Var.a();
        }
        long jB = this.f83414b.b();
        if (jA == -9223372036854775807L || jB == -9223372036854775807L) {
            return;
        }
        mx0 mx0Var = this.f83413a;
        if (jB != mx0Var.f80433q) {
            lx0 lx0Var = new lx0(mx0Var);
            lx0Var.f79971o = jB;
            mx0 mx0Var2 = new mx0(lx0Var);
            this.f83413a = mx0Var2;
            this.f83415c.a(mx0Var2);
        }
        int i11 = jb2Var.f78968c - jb2Var.f78967b;
        this.f83415c.a(i11, jb2Var);
        this.f83415c.a(jA, 1, i11, 0, null);
    }

    public ub2(String str) {
        this.f83413a = new lx0().d(str).a();
    }

    @Override // yads.rw2
    public final void a(y63 y63Var, pq0 pq0Var, l93 l93Var) {
        this.f83414b = y63Var;
        l93Var.a();
        l93Var.b();
        m73 m73VarA = pq0Var.a(l93Var.f79733d, 5);
        this.f83415c = m73VarA;
        m73VarA.a(this.f83413a);
    }
}
