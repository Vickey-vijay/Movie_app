package yads;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class ex2 extends cx2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final va3 f77219j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final va3 f77220k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f77221l;

    @Override // yads.hx2
    public final pl2 a(lo2 lo2Var) {
        va3 va3Var = this.f77219j;
        if (va3Var == null) {
            return this.f78407a;
        }
        mx0 mx0Var = lo2Var.f79868a;
        return new pl2(va3Var.a(mx0Var.f80418b, 0L, mx0Var.f80425i, 0L), 0L, -1L);
    }

    public ex2(pl2 pl2Var, long j10, long j11, long j12, long j13, long j14, List list, long j15, va3 va3Var, va3 va3Var2, long j16, long j17) {
        super(pl2Var, j10, j11, j12, j14, list, j15, j16, j17);
        this.f77219j = va3Var;
        this.f77220k = va3Var2;
        this.f77221l = j13;
    }

    @Override // yads.cx2
    public final long a(long j10) {
        List list = this.f76458f;
        if (list != null) {
            return list.size();
        }
        long j11 = this.f77221l;
        if (j11 != -1) {
            return (j11 - this.f76456d) + 1;
        }
        if (j10 == -9223372036854775807L) {
            return -1L;
        }
        BigInteger bigIntegerMultiply = BigInteger.valueOf(j10).multiply(BigInteger.valueOf(this.f78408b));
        BigInteger bigIntegerMultiply2 = BigInteger.valueOf(this.f76457e).multiply(BigInteger.valueOf(1000000L));
        RoundingMode roundingMode = RoundingMode.CEILING;
        int i10 = kp.f79518a;
        return new BigDecimal(bigIntegerMultiply).divide(new BigDecimal(bigIntegerMultiply2), 0, roundingMode).toBigIntegerExact().longValue();
    }

    @Override // yads.cx2
    public final pl2 a(long j10, lo2 lo2Var) {
        long j11;
        List list = this.f76458f;
        if (list != null) {
            j11 = ((fx2) list.get((int) (j10 - this.f76456d))).f77539a;
        } else {
            j11 = (j10 - this.f76456d) * this.f76457e;
        }
        long j12 = j11;
        va3 va3Var = this.f77220k;
        mx0 mx0Var = lo2Var.f79868a;
        return new pl2(va3Var.a(mx0Var.f80418b, j10, mx0Var.f80425i, j12), 0L, -1L);
    }
}
