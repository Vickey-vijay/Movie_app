package o5;

import m5.l;

/* JADX INFO: compiled from: DoubleUtils.java */
/* JADX INFO: loaded from: classes2.dex */
public final class c {
    public static long a(double d10) {
        l.e(b(d10), "not a normal value");
        int exponent = Math.getExponent(d10);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d10) & 4503599627370495L;
        if (exponent == -1023) {
            return jDoubleToRawLongBits << 1;
        }
        return jDoubleToRawLongBits | 4503599627370496L;
    }

    public static boolean b(double d10) {
        if (Math.getExponent(d10) <= 1023) {
            return true;
        }
        return false;
    }
}
