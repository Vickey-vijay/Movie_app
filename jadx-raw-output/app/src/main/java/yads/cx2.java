package yads;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class cx2 extends hx2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f76456d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f76457e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f76458f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f76459g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f76460h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f76461i;

    public cx2(pl2 pl2Var, long j10, long j11, long j12, long j13, List list, long j14, long j15, long j16) {
        super(pl2Var, j10, j11);
        this.f76456d = j12;
        this.f76457e = j13;
        this.f76458f = list;
        this.f76461i = j14;
        this.f76459g = j15;
        this.f76460h = j16;
    }

    public abstract long a(long j10);

    public abstract pl2 a(long j10, lo2 lo2Var);

    public final long b(long j10, long j11) {
        List list = this.f76458f;
        if (list != null) {
            return (((fx2) list.get((int) (j10 - this.f76456d))).f77540b * 1000000) / this.f78408b;
        }
        long jA = a(j11);
        return (jA == -1 || j10 != (this.f76456d + jA) - 1) ? (this.f76457e * 1000000) / this.f78408b : j11 - b(j10);
    }

    public final long c(long j10, long j11) {
        long j12 = this.f76456d;
        long jA = a(j11);
        if (jA == 0) {
            return j12;
        }
        if (this.f76458f == null) {
            long j13 = (j10 / ((this.f76457e * 1000000) / this.f78408b)) + this.f76456d;
            if (j13 < j12) {
                return j12;
            }
            return jA == -1 ? j13 : Math.min(j13, (j12 + jA) - 1);
        }
        long j14 = (jA + j12) - 1;
        long j15 = j12;
        while (j15 <= j14) {
            long j16 = ((j14 - j15) / 2) + j15;
            long jB = b(j16);
            if (jB < j10) {
                j15 = j16 + 1;
            } else {
                if (jB <= j10) {
                    return j16;
                }
                j14 = j16 - 1;
            }
        }
        return j15 == j12 ? j15 : j14;
    }

    public final long a(long j10, long j11) {
        if (a(j10) == -1) {
            long j12 = this.f76459g;
            if (j12 != -9223372036854775807L) {
                return Math.max(this.f76456d, c((j11 - this.f76460h) - j12, j10));
            }
        }
        return this.f76456d;
    }

    public final long b(long j10) {
        long j11;
        List list = this.f76458f;
        if (list != null) {
            j11 = ((fx2) list.get((int) (j10 - this.f76456d))).f77539a - this.f78409c;
        } else {
            j11 = (j10 - this.f76456d) * this.f76457e;
        }
        return ib3.a(j11, 1000000L, this.f78408b);
    }

    public boolean b() {
        return this.f76458f != null;
    }
}
