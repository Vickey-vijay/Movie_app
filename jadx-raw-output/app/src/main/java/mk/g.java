package mk;

import ck.p;
import com.ironsource.Ne;
import kotlin.time.DurationUnit;

/* JADX INFO: compiled from: longSaturatedMath.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class g {
    public static final long a(long j10) {
        return j10 < 0 ? b.f64563c.b() : b.f64563c.a();
    }

    public static final long b(long j10, long j11, DurationUnit durationUnit) {
        p.j(durationUnit, Ne.f27158n1);
        return ((1 | (j11 - 1)) > Long.MAX_VALUE ? 1 : ((1 | (j11 - 1)) == Long.MAX_VALUE ? 0 : -1)) == 0 ? b.L(a(j11)) : c(j10, j11, durationUnit);
    }

    public static final long c(long j10, long j11, DurationUnit durationUnit) {
        long j12 = j10 - j11;
        if (((j12 ^ j10) & (~(j12 ^ j11))) >= 0) {
            return d.t(j12, durationUnit);
        }
        DurationUnit durationUnit2 = DurationUnit.MILLISECONDS;
        if (durationUnit.compareTo(durationUnit2) >= 0) {
            return b.L(a(j12));
        }
        long jB = e.b(1L, durationUnit2, durationUnit);
        long j13 = (j10 / jB) - (j11 / jB);
        long j14 = (j10 % jB) - (j11 % jB);
        b.a aVar = b.f64563c;
        return b.F(d.t(j13, durationUnit2), d.t(j14, durationUnit));
    }

    public static final long d(long j10, long j11, DurationUnit durationUnit) {
        p.j(durationUnit, Ne.f27158n1);
        if (((j11 - 1) | 1) == Long.MAX_VALUE) {
            return j10 == j11 ? b.f64563c.c() : b.L(a(j11));
        }
        return (1 | (j10 - 1)) == Long.MAX_VALUE ? a(j10) : c(j10, j11, durationUnit);
    }
}
