package o5;

import java.math.RoundingMode;

/* JADX INFO: compiled from: MathPreconditions.java */
/* JADX INFO: loaded from: classes2.dex */
public final class f {
    public static void a(boolean z10, double d10, RoundingMode roundingMode) {
        if (z10) {
            return;
        }
        throw new ArithmeticException("rounded value is out of range for input " + d10 + " and rounding mode " + roundingMode);
    }

    public static void b(boolean z10, String str, int i10, int i11) {
        if (z10) {
            return;
        }
        throw new ArithmeticException("overflow: " + str + "(" + i10 + ", " + i11 + ")");
    }

    public static void c(boolean z10, String str, long j10, long j11) {
        if (z10) {
            return;
        }
        throw new ArithmeticException("overflow: " + str + "(" + j10 + ", " + j11 + ")");
    }

    public static long d(String str, long j10) {
        if (j10 >= 0) {
            return j10;
        }
        throw new IllegalArgumentException(str + " (" + j10 + ") must be >= 0");
    }

    public static int e(String str, int i10) {
        if (i10 > 0) {
            return i10;
        }
        throw new IllegalArgumentException(str + " (" + i10 + ") must be > 0");
    }

    public static void f(boolean z10) {
        if (!z10) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }
}
