package yads;

/* JADX INFO: loaded from: classes9.dex */
public final class ww2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ww2 f84368c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f84369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f84370b;

    public final long a(long j10, long j11, long j12) {
        long j13 = this.f84369a;
        if (j13 == 0 && this.f84370b == 0) {
            return j10;
        }
        int i10 = ib3.f78556a;
        long j14 = j10 - j13;
        long j15 = ((j13 ^ j10) & (j10 ^ j14)) >= 0 ? j14 : Long.MIN_VALUE;
        long j16 = this.f84370b;
        long j17 = j10 + j16;
        long j18 = ((j16 ^ j17) & (j10 ^ j17)) >= 0 ? j17 : Long.MAX_VALUE;
        boolean z10 = j15 <= j11 && j11 <= j18;
        boolean z11 = j15 <= j12 && j12 <= j18;
        if (z10 && z11) {
            return Math.abs(j11 - j10) <= Math.abs(j12 - j10) ? j11 : j12;
        }
        if (z10) {
            return j11;
        }
        return z11 ? j12 : j15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ww2.class != obj.getClass()) {
            return false;
        }
        ww2 ww2Var = (ww2) obj;
        return this.f84369a == ww2Var.f84369a && this.f84370b == ww2Var.f84370b;
    }

    static {
        ww2 ww2Var = new ww2(0L, 0L);
        new ww2(Long.MAX_VALUE, Long.MAX_VALUE);
        new ww2(Long.MAX_VALUE, 0L);
        new ww2(0L, Long.MAX_VALUE);
        f84368c = ww2Var;
    }

    public final int hashCode() {
        return (((int) this.f84369a) * 31) + ((int) this.f84370b);
    }

    public ww2(long j10, long j11) {
        boolean z10;
        if (j10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        ni.a(z10);
        ni.a(j11 >= 0);
        this.f84369a = j10;
        this.f84370b = j11;
    }
}
