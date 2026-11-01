package ek;

/* JADX INFO: compiled from: MathJVM.kt */
/* JADX INFO: loaded from: classes7.dex */
public class b extends a {
    public static final long e(float f10) {
        return d(f10);
    }

    public static final int a(long j10) {
        return Long.signum(j10);
    }

    public static final int b(double d10) {
        if (!Double.isNaN(d10)) {
            if (d10 > 2.147483647E9d) {
                return Integer.MAX_VALUE;
            }
            if (d10 < -2.147483648E9d) {
                return Integer.MIN_VALUE;
            }
            return (int) Math.round(d10);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }

    public static final int c(float f10) {
        if (!Float.isNaN(f10)) {
            return Math.round(f10);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }

    public static final long d(double d10) {
        if (!Double.isNaN(d10)) {
            return Math.round(d10);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }
}
