package gk;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import ck.p;
import ik.i;
import kotlin.random.Random;

/* JADX INFO: compiled from: Random.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class d {
    public static final int g(int i10, int i11) {
        return (i10 >>> (32 - i11)) & ((-i11) >> 31);
    }

    public static final String a(Object obj, Object obj2) {
        p.j(obj, TypedValues.TransitionType.S_FROM);
        p.j(obj2, "until");
        return "Random range is empty: [" + obj + ", " + obj2 + ").";
    }

    public static final void b(double d10, double d11) {
        if (!(d11 > d10)) {
            throw new IllegalArgumentException(a(Double.valueOf(d10), Double.valueOf(d11)).toString());
        }
    }

    public static final void c(int i10, int i11) {
        if (!(i11 > i10)) {
            throw new IllegalArgumentException(a(Integer.valueOf(i10), Integer.valueOf(i11)).toString());
        }
    }

    public static final void d(long j10, long j11) {
        if (!(j11 > j10)) {
            throw new IllegalArgumentException(a(Long.valueOf(j10), Long.valueOf(j11)).toString());
        }
    }

    public static final int f(Random random, i iVar) {
        p.j(random, "<this>");
        p.j(iVar, "range");
        if (!iVar.isEmpty()) {
            if (iVar.f() < Integer.MAX_VALUE) {
                return random.nextInt(iVar.e(), iVar.f() + 1);
            }
            return iVar.e() > Integer.MIN_VALUE ? random.nextInt(iVar.e() - 1, iVar.f()) + 1 : random.nextInt();
        }
        throw new IllegalArgumentException("Cannot get random in empty range: " + iVar);
    }

    public static final int e(int i10) {
        return 31 - Integer.numberOfLeadingZeros(i10);
    }
}
