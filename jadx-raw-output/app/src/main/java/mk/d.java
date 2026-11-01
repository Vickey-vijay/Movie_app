package mk;

import ck.p;
import com.google.android.material.badge.BadgeDrawable;
import com.ironsource.Ne;
import kotlin.time.DurationUnit;
import lk.a0;
import lk.c0;
import lk.x;

/* JADX INFO: compiled from: Duration.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class d {
    public static final long i(long j10, int i10) {
        return b.i((j10 << 1) + ((long) i10));
    }

    public static final long j(long j10) {
        return b.i((j10 << 1) + 1);
    }

    public static final long l(long j10) {
        return b.i(j10 << 1);
    }

    public static final long n(long j10) {
        return j10 * ((long) 1000000);
    }

    public static final long p(String str, boolean z10) {
        String str2 = str;
        int length = str.length();
        if (length == 0) {
            throw new IllegalArgumentException("The string is empty");
        }
        b.a aVar = b.f64563c;
        long jC = aVar.c();
        char cCharAt = str2.charAt(0);
        boolean z11 = true;
        int length2 = (cCharAt == '+' || cCharAt == '-') ? 1 : 0;
        boolean z12 = length2 > 0;
        boolean z13 = z12 && a0.Q0(str2, '-', false, 2, null);
        if (length <= length2) {
            throw new IllegalArgumentException("No components");
        }
        char c10 = ':';
        char c11 = '0';
        if (str2.charAt(length2) == 'P') {
            int i10 = length2 + 1;
            if (i10 == length) {
                throw new IllegalArgumentException();
            }
            DurationUnit durationUnit = null;
            boolean z14 = false;
            while (i10 < length) {
                if (str2.charAt(i10) != 'T') {
                    int i11 = i10;
                    while (i11 < str.length()) {
                        char cCharAt2 = str2.charAt(i11);
                        if (!(((c11 > cCharAt2 || cCharAt2 >= c10) ? false : z11) || a0.W("+-.", cCharAt2, false, 2, null))) {
                            break;
                        }
                        i11++;
                        c10 = ':';
                        c11 = '0';
                        z11 = true;
                    }
                    p.h(str2, "null cannot be cast to non-null type java.lang.String");
                    String strSubstring = str2.substring(i10, i11);
                    p.i(strSubstring, "substring(...)");
                    if (strSubstring.length() == 0) {
                        throw new IllegalArgumentException();
                    }
                    int length3 = i10 + strSubstring.length();
                    if (!(length3 >= 0 && length3 < str.length())) {
                        throw new IllegalArgumentException("Missing unit for value " + strSubstring);
                    }
                    char cCharAt3 = str2.charAt(length3);
                    i10 = length3 + 1;
                    DurationUnit durationUnitE = f.e(cCharAt3, z14);
                    if (durationUnit != null && durationUnit.compareTo(durationUnitE) <= 0) {
                        throw new IllegalArgumentException("Unexpected order of duration components");
                    }
                    int iK0 = a0.k0(strSubstring, '.', 0, false, 6, null);
                    if (durationUnitE != DurationUnit.SECONDS || iK0 <= 0) {
                        jC = b.F(jC, t(q(strSubstring), durationUnitE));
                    } else {
                        p.h(strSubstring, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring2 = strSubstring.substring(0, iK0);
                        p.i(strSubstring2, "substring(...)");
                        long jF = b.F(jC, t(q(strSubstring2), durationUnitE));
                        p.h(strSubstring, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring3 = strSubstring.substring(iK0);
                        p.i(strSubstring3, "substring(...)");
                        jC = b.F(jF, r(Double.parseDouble(strSubstring3), durationUnitE));
                    }
                    durationUnit = durationUnitE;
                    c10 = ':';
                    c11 = '0';
                    z11 = true;
                    str2 = str;
                } else {
                    if (z14 || (i10 = i10 + 1) == length) {
                        throw new IllegalArgumentException();
                    }
                    z14 = z11;
                }
            }
        } else {
            if (z10) {
                throw new IllegalArgumentException();
            }
            String str3 = "Unexpected order of duration components";
            if (x.H(str, length2, "Infinity", 0, Math.max(length - length2, 8), true)) {
                jC = aVar.a();
            } else {
                boolean z15 = !z12;
                if (z12 && str.charAt(length2) == '(' && c0.t1(str) == ')') {
                    length2++;
                    length--;
                    if (length2 == length) {
                        throw new IllegalArgumentException("No components");
                    }
                    z15 = true;
                }
                boolean z16 = false;
                DurationUnit durationUnit2 = null;
                while (length2 < length) {
                    if (z16 && z15) {
                        while (length2 < str.length()) {
                            if (!(str.charAt(length2) == ' ')) {
                                break;
                            }
                            length2++;
                        }
                    }
                    int i12 = length2;
                    while (i12 < str.length()) {
                        char cCharAt4 = str.charAt(i12);
                        if (!(('0' <= cCharAt4 && cCharAt4 < ':') || cCharAt4 == '.')) {
                            break;
                        }
                        i12++;
                    }
                    p.h(str, "null cannot be cast to non-null type java.lang.String");
                    String strSubstring4 = str.substring(length2, i12);
                    p.i(strSubstring4, "substring(...)");
                    if (strSubstring4.length() == 0) {
                        throw new IllegalArgumentException();
                    }
                    int length4 = length2 + strSubstring4.length();
                    int i13 = length4;
                    while (i13 < str.length()) {
                        char cCharAt5 = str.charAt(i13);
                        if (!('a' <= cCharAt5 && cCharAt5 < '{')) {
                            break;
                        }
                        i13++;
                    }
                    p.h(str, "null cannot be cast to non-null type java.lang.String");
                    String strSubstring5 = str.substring(length4, i13);
                    p.i(strSubstring5, "substring(...)");
                    length2 = length4 + strSubstring5.length();
                    DurationUnit durationUnitF = f.f(strSubstring5);
                    if (durationUnit2 != null && durationUnit2.compareTo(durationUnitF) <= 0) {
                        throw new IllegalArgumentException(str3);
                    }
                    String str4 = str3;
                    int iK1 = a0.k0(strSubstring4, '.', 0, false, 6, null);
                    if (iK1 > 0) {
                        p.h(strSubstring4, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring6 = strSubstring4.substring(0, iK1);
                        p.i(strSubstring6, "substring(...)");
                        long jF2 = b.F(jC, t(Long.parseLong(strSubstring6), durationUnitF));
                        p.h(strSubstring4, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring7 = strSubstring4.substring(iK1);
                        p.i(strSubstring7, "substring(...)");
                        jC = b.F(jF2, r(Double.parseDouble(strSubstring7), durationUnitF));
                        if (length2 < length) {
                            throw new IllegalArgumentException("Fractional component must be last");
                        }
                    } else {
                        jC = b.F(jC, t(Long.parseLong(strSubstring4), durationUnitF));
                    }
                    durationUnit2 = durationUnitF;
                    str3 = str4;
                    z16 = true;
                }
            }
        }
        return z13 ? b.L(jC) : jC;
    }

    public static final long r(double d10, DurationUnit durationUnit) {
        p.j(durationUnit, Ne.f27158n1);
        double dA = e.a(d10, durationUnit, DurationUnit.NANOSECONDS);
        if (!(!Double.isNaN(dA))) {
            throw new IllegalArgumentException("Duration value cannot be NaN.".toString());
        }
        long jD = ek.b.d(dA);
        return -4611686018426999999L <= jD && jD < 4611686018427000000L ? l(jD) : k(ek.b.d(e.a(d10, durationUnit, DurationUnit.MILLISECONDS)));
    }

    public static final long s(int i10, DurationUnit durationUnit) {
        p.j(durationUnit, Ne.f27158n1);
        return durationUnit.compareTo(DurationUnit.SECONDS) <= 0 ? l(e.c(i10, durationUnit, DurationUnit.NANOSECONDS)) : t(i10, durationUnit);
    }

    public static final long t(long j10, DurationUnit durationUnit) {
        p.j(durationUnit, Ne.f27158n1);
        DurationUnit durationUnit2 = DurationUnit.NANOSECONDS;
        long jC = e.c(4611686018426999999L, durationUnit2, durationUnit);
        boolean z10 = false;
        if ((-jC) <= j10 && j10 <= jC) {
            z10 = true;
        }
        return z10 ? l(e.c(j10, durationUnit, durationUnit2)) : j(ik.k.l(e.b(j10, durationUnit, DurationUnit.MILLISECONDS), -4611686018427387903L, 4611686018427387903L));
    }

    public static final long o(long j10) {
        return j10 / ((long) 1000000);
    }

    public static final long q(String str) {
        int i10;
        boolean z10;
        int length = str.length();
        boolean z11 = false;
        if (length > 0 && a0.W("+-", str.charAt(0), false, 2, null)) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (length - i10 > 16) {
            int i11 = i10;
            while (true) {
                if (i10 < length) {
                    char cCharAt = str.charAt(i10);
                    if (cCharAt == '0') {
                        if (i11 == i10) {
                            i11++;
                        }
                    } else {
                        if ('1' <= cCharAt && cCharAt < ':') {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (!z10) {
                            break;
                        }
                    }
                    i10++;
                } else {
                    if (length - i11 <= 16) {
                        break;
                    }
                    if (str.charAt(0) == '-') {
                        return Long.MIN_VALUE;
                    }
                    return Long.MAX_VALUE;
                }
            }
        }
        if (x.R(str, BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX, false, 2, null) && length > 1) {
            char cCharAt2 = str.charAt(1);
            if ('0' <= cCharAt2 && cCharAt2 < ':') {
                z11 = true;
            }
            if (z11) {
                str = c0.p1(str, 1);
            }
        }
        return Long.parseLong(str);
    }

    public static final long k(long j10) {
        boolean z10 = false;
        if (-4611686018426L <= j10 && j10 < 4611686018427L) {
            z10 = true;
        }
        if (z10) {
            return l(n(j10));
        }
        return j(ik.k.l(j10, -4611686018427387903L, 4611686018427387903L));
    }

    public static final long m(long j10) {
        boolean z10 = false;
        if (-4611686018426999999L <= j10 && j10 < 4611686018427000000L) {
            z10 = true;
        }
        if (z10) {
            return l(j10);
        }
        return j(o(j10));
    }
}
