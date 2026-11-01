package yads;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class jo2 extends lo2 implements i30 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final cx2 f79136f;

    @Override // yads.i30
    public final long a(long j10, long j11) {
        return this.f79136f.c(j10, j11);
    }

    @Override // yads.i30
    public final long b(long j10, long j11) {
        return this.f79136f.b(j10, j11);
    }

    @Override // yads.i30
    public final long c(long j10, long j11) {
        return this.f79136f.a(j10, j11);
    }

    @Override // yads.lo2
    public final String c() {
        return null;
    }

    @Override // yads.lo2
    public final i30 d() {
        return this;
    }

    @Override // yads.lo2
    public final pl2 e() {
        return null;
    }

    @Override // yads.i30
    public final long a(long j10) {
        return this.f79136f.b(j10);
    }

    @Override // yads.i30
    public final long b() {
        return this.f79136f.f76456d;
    }

    @Override // yads.i30
    public final long c(long j10) {
        return this.f79136f.a(j10);
    }

    @Override // yads.i30
    public final long d(long j10, long j11) {
        cx2 cx2Var = this.f79136f;
        if (cx2Var.f76458f != null) {
            return -9223372036854775807L;
        }
        long jA = cx2Var.a(j10, j11);
        long jA2 = cx2Var.a(j10);
        if (jA2 == -1) {
            jA2 = (int) (cx2Var.c((j11 - cx2Var.f76460h) + cx2Var.f76461i, j10) - cx2Var.a(j10, j11));
        }
        long j12 = jA2 + jA;
        return (cx2Var.b(j12, j10) + cx2Var.b(j12)) - cx2Var.f76461i;
    }

    @Override // yads.i30
    public final long e(long j10, long j11) {
        cx2 cx2Var = this.f79136f;
        long jA = cx2Var.a(j10);
        return jA != -1 ? jA : (int) (cx2Var.c((j11 - cx2Var.f76460h) + cx2Var.f76461i, j10) - cx2Var.a(j10, j11));
    }

    public jo2(long j10, mx0 mx0Var, p51 p51Var, cx2 cx2Var, ArrayList arrayList) {
        super(mx0Var, p51Var, cx2Var, arrayList);
        this.f79136f = cx2Var;
    }

    @Override // yads.i30
    public final boolean a() {
        return this.f79136f.b();
    }

    @Override // yads.i30
    public final pl2 b(long j10) {
        return this.f79136f.a(j10, this);
    }
}
