package ik;

import ck.p;
import java.util.NoSuchElementException;
import kotlin.random.Random;

/* JADX INFO: compiled from: _Ranges.kt */
/* JADX INFO: loaded from: classes2.dex */
public class k extends j {
    public static final float c(float f10, float f11) {
        return f10 < f11 ? f11 : f10;
    }

    public static final int d(int i10, int i11) {
        return i10 < i11 ? i11 : i10;
    }

    public static final long e(long j10, long j11) {
        return j10 < j11 ? j11 : j10;
    }

    public static final float f(float f10, float f11) {
        return f10 > f11 ? f11 : f10;
    }

    public static final int g(int i10, int i11) {
        return i10 > i11 ? i11 : i10;
    }

    public static final long h(long j10, long j11) {
        return j10 > j11 ? j11 : j10;
    }

    public static final double i(double d10, double d11, double d12) {
        if (d11 <= d12) {
            if (d10 < d11) {
                return d11;
            }
            return d10 > d12 ? d12 : d10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d12 + " is less than minimum " + d11 + '.');
    }

    public static final float j(float f10, float f11, float f12) {
        if (f11 <= f12) {
            if (f10 < f11) {
                return f11;
            }
            return f10 > f12 ? f12 : f10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f12 + " is less than minimum " + f11 + '.');
    }

    public static final int k(int i10, int i11, int i12) {
        if (i11 <= i12) {
            if (i10 < i11) {
                return i11;
            }
            return i10 > i12 ? i12 : i10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i12 + " is less than minimum " + i11 + '.');
    }

    public static final long l(long j10, long j11, long j12) {
        if (j11 <= j12) {
            if (j10 < j11) {
                return j11;
            }
            return j10 > j12 ? j12 : j10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j12 + " is less than minimum " + j11 + '.');
    }

    public static final g m(int i10, int i11) {
        return g.f54212e.a(i10, i11, -1);
    }

    public static final int n(i iVar, Random random) {
        p.j(iVar, "<this>");
        p.j(random, "random");
        try {
            return gk.d.f(random, iVar);
        } catch (IllegalArgumentException e10) {
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    public static final g o(g gVar) {
        p.j(gVar, "<this>");
        return g.f54212e.a(gVar.f(), gVar.e(), -gVar.g());
    }

    public static final g p(g gVar, int i10) {
        p.j(gVar, "<this>");
        j.a(i10 > 0, Integer.valueOf(i10));
        g.a aVar = g.f54212e;
        int iE = gVar.e();
        int iF = gVar.f();
        if (gVar.g() <= 0) {
            i10 = -i10;
        }
        return aVar.a(iE, iF, i10);
    }

    public static final i q(int i10, int i11) {
        return i11 <= Integer.MIN_VALUE ? i.f54220f.a() : new i(i10, i11 - 1);
    }
}
