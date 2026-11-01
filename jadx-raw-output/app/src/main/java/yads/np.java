package yads;

/* JADX INFO: loaded from: classes10.dex */
public final class np implements vw2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qp f80722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f80723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f80724c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f80725d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f80726e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f80727f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f80728g;

    @Override // yads.vw2
    public final boolean b() {
        return true;
    }

    @Override // yads.vw2
    public final tw2 b(long j10) {
        xw2 xw2Var = new xw2(j10, pp.a(this.f80722a.a(j10), this.f80724c, this.f80725d, this.f80726e, this.f80727f, this.f80728g));
        return new tw2(xw2Var, xw2Var);
    }

    @Override // yads.vw2
    public final long c() {
        return this.f80723b;
    }

    public np(qp qpVar, long j10, long j11, long j12, long j13, long j14) {
        this.f80722a = qpVar;
        this.f80723b = j10;
        this.f80725d = j11;
        this.f80726e = j12;
        this.f80727f = j13;
        this.f80728g = j14;
    }
}
