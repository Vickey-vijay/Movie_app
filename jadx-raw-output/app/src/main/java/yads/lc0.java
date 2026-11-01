package yads;

/* JADX INFO: loaded from: classes10.dex */
public final class lc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fu f79743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lo2 f79744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uo f79745c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i30 f79746d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f79747e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f79748f;

    public final lc0 a(long j10, lo2 lo2Var) throws zo {
        long jA;
        i30 i30VarD = this.f79744b.d();
        i30 i30VarD2 = lo2Var.d();
        if (i30VarD == null) {
            return new lc0(j10, lo2Var, this.f79745c, this.f79743a, this.f79748f, i30VarD);
        }
        if (!i30VarD.a()) {
            return new lc0(j10, lo2Var, this.f79745c, this.f79743a, this.f79748f, i30VarD2);
        }
        long jC = i30VarD.c(j10);
        if (jC == 0) {
            return new lc0(j10, lo2Var, this.f79745c, this.f79743a, this.f79748f, i30VarD2);
        }
        long jB = i30VarD.b();
        long jA2 = i30VarD.a(jB);
        long j11 = jC + jB;
        long j12 = j11 - 1;
        long jB2 = i30VarD.b(j12, j10) + i30VarD.a(j12);
        long jB3 = i30VarD2.b();
        long jA3 = i30VarD2.a(jB3);
        long j13 = this.f79748f;
        if (jB2 == jA3) {
            jA = (j11 - jB3) + j13;
        } else {
            if (jB2 < jA3) {
                throw new zo();
            }
            jA = jA3 < jA2 ? j13 - (i30VarD2.a(jA2, j10) - jB) : (i30VarD.a(jA3, j10) - jB3) + j13;
        }
        return new lc0(j10, lo2Var, this.f79745c, this.f79743a, jA, i30VarD2);
    }

    public lc0(long j10, lo2 lo2Var, uo uoVar, fu fuVar, long j11, i30 i30Var) {
        this.f79747e = j10;
        this.f79744b = lo2Var;
        this.f79745c = uoVar;
        this.f79748f = j11;
        this.f79743a = fuVar;
        this.f79746d = i30Var;
    }

    public final long a(long j10) {
        return this.f79746d.b(j10 - this.f79748f, this.f79747e) + this.f79746d.a(j10 - this.f79748f);
    }
}
