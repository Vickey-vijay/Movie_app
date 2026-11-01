package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class j61 implements zw2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f78922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kh1 f78923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kh1 f78924c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f78925d;

    @Override // yads.zw2
    public final long a() {
        return this.f78922a;
    }

    @Override // yads.vw2
    public final boolean b() {
        return true;
    }

    @Override // yads.vw2
    public final long c() {
        return this.f78925d;
    }

    @Override // yads.zw2
    public final long a(long j10) {
        return this.f78923b.a(ib3.a(this.f78924c, j10));
    }

    @Override // yads.vw2
    public final tw2 b(long j10) {
        int iA = ib3.a(this.f78923b, j10);
        long jA = this.f78923b.a(iA);
        xw2 xw2Var = new xw2(jA, this.f78924c.a(iA));
        if (jA != j10) {
            kh1 kh1Var = this.f78923b;
            if (iA != kh1Var.f79412a - 1) {
                int i10 = iA + 1;
                return new tw2(xw2Var, new xw2(kh1Var.a(i10), this.f78924c.a(i10)));
            }
        }
        return new tw2(xw2Var, xw2Var);
    }

    public final boolean c(long j10) {
        kh1 kh1Var = this.f78923b;
        return j10 - kh1Var.a(kh1Var.f79412a - 1) < 100000;
    }

    public j61(long j10, long j11, long j12) {
        this.f78925d = j10;
        this.f78922a = j12;
        kh1 kh1Var = new kh1();
        this.f78923b = kh1Var;
        kh1 kh1Var2 = new kh1();
        this.f78924c = kh1Var2;
        kh1Var.a(0L);
        kh1Var2.a(j11);
    }
}
