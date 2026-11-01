package mk;

import androidx.exifinterface.media.ExifInterface;
import ck.p;
import com.ironsource.Ne;
import kotlin.time.DurationUnit;
import lk.a0;

/* JADX INFO: compiled from: Duration.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class b implements Comparable<b> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f64563c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f64564d = i(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f64565e = d.j(4611686018427387903L);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f64566f = d.j(-4611686018427387903L);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f64567b;

    /* JADX INFO: compiled from: Duration.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final long d(String str) {
            p.j(str, "value");
            try {
                return d.p(str, true);
            } catch (IllegalArgumentException e10) {
                throw new IllegalArgumentException("Invalid ISO duration string format: '" + str + "'.", e10);
            }
        }

        public final long a() {
            return b.f64565e;
        }

        public final long b() {
            return b.f64566f;
        }

        public final long c() {
            return b.f64564d;
        }
    }

    public static final boolean A(long j10) {
        return (((int) j10) & 1) == 1;
    }

    public static final boolean B(long j10) {
        return (((int) j10) & 1) == 0;
    }

    public static final boolean D(long j10) {
        return j10 < 0;
    }

    public static final boolean E(long j10) {
        return j10 > 0;
    }

    public static final /* synthetic */ b f(long j10) {
        return new b(j10);
    }

    public static boolean j(long j10, Object obj) {
        return (obj instanceof b) && j10 == ((b) obj).M();
    }

    public static final boolean k(long j10, long j11) {
        return j10 == j11;
    }

    public static final long x(long j10) {
        return j10 >> 1;
    }

    public static int y(long j10) {
        return Long.hashCode(j10);
    }

    public final /* synthetic */ long M() {
        return this.f64567b;
    }

    public boolean equals(Object obj) {
        return j(this.f64567b, obj);
    }

    public int hashCode() {
        return y(this.f64567b);
    }

    public static final boolean C(long j10) {
        return j10 == f64565e || j10 == f64566f;
    }

    public static final double G(long j10, DurationUnit durationUnit) {
        p.j(durationUnit, Ne.f27158n1);
        if (j10 == f64565e) {
            return Double.POSITIVE_INFINITY;
        }
        if (j10 == f64566f) {
            return Double.NEGATIVE_INFINITY;
        }
        return e.a(x(j10), w(j10), durationUnit);
    }

    public static final int H(long j10, DurationUnit durationUnit) {
        p.j(durationUnit, Ne.f27158n1);
        return (int) ik.k.l(J(j10, durationUnit), -2147483648L, 2147483647L);
    }

    public static final String I(long j10) {
        StringBuilder sb2 = new StringBuilder();
        if (D(j10)) {
            sb2.append('-');
        }
        sb2.append("PT");
        long jL = l(j10);
        long jO = o(jL);
        int iT = t(jL);
        int iV = v(jL);
        int iU = u(jL);
        if (C(j10)) {
            jO = 9999999999999L;
        }
        boolean z10 = true;
        boolean z11 = jO != 0;
        boolean z12 = (iV == 0 && iU == 0) ? false : true;
        if (iT == 0 && (!z12 || !z11)) {
            z10 = false;
        }
        if (z11) {
            sb2.append(jO);
            sb2.append('H');
        }
        if (z10) {
            sb2.append(iT);
            sb2.append('M');
        }
        if (z12 || (!z11 && !z10)) {
            e(j10, sb2, iV, iU, 9, ExifInterface.LATITUDE_SOUTH, true);
        }
        return sb2.toString();
    }

    public static final long J(long j10, DurationUnit durationUnit) {
        p.j(durationUnit, Ne.f27158n1);
        if (j10 == f64565e) {
            return Long.MAX_VALUE;
        }
        if (j10 == f64566f) {
            return Long.MIN_VALUE;
        }
        return e.b(x(j10), w(j10), durationUnit);
    }

    public static String K(long j10) {
        if (j10 == 0) {
            return "0s";
        }
        if (j10 == f64565e) {
            return "Infinity";
        }
        if (j10 == f64566f) {
            return "-Infinity";
        }
        boolean zD = D(j10);
        StringBuilder sb2 = new StringBuilder();
        if (zD) {
            sb2.append('-');
        }
        long jL = l(j10);
        long jN = n(jL);
        int iM = m(jL);
        int iT = t(jL);
        int iV = v(jL);
        int iU = u(jL);
        int i10 = 0;
        boolean z10 = jN != 0;
        boolean z11 = iM != 0;
        boolean z12 = iT != 0;
        boolean z13 = (iV == 0 && iU == 0) ? false : true;
        if (z10) {
            sb2.append(jN);
            sb2.append('d');
            i10 = 1;
        }
        if (z11 || (z10 && (z12 || z13))) {
            int i11 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            sb2.append(iM);
            sb2.append('h');
            i10 = i11;
        }
        if (z12 || (z13 && (z11 || z10))) {
            int i12 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            sb2.append(iT);
            sb2.append('m');
            i10 = i12;
        }
        if (z13) {
            int i13 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            if (iV != 0 || z10 || z11 || z12) {
                e(j10, sb2, iV, iU, 9, "s", false);
            } else if (iU >= 1000000) {
                e(j10, sb2, iU / 1000000, iU % 1000000, 6, "ms", false);
            } else if (iU >= 1000) {
                e(j10, sb2, iU / 1000, iU % 1000, 3, "us", false);
            } else {
                sb2.append(iU);
                sb2.append("ns");
            }
            i10 = i13;
        }
        if (zD && i10 > 1) {
            sb2.insert(1, '(').append(')');
        }
        return sb2.toString();
    }

    public static int h(long j10, long j11) {
        long j12 = j10 ^ j11;
        if (j12 < 0 || (((int) j12) & 1) == 0) {
            return p.m(j10, j11);
        }
        int i10 = (((int) j10) & 1) - (((int) j11) & 1);
        return D(j10) ? -i10 : i10;
    }

    public static final long n(long j10) {
        return J(j10, DurationUnit.DAYS);
    }

    public static final long o(long j10) {
        return J(j10, DurationUnit.HOURS);
    }

    public static final long q(long j10) {
        return J(j10, DurationUnit.MINUTES);
    }

    public static final long s(long j10) {
        return J(j10, DurationUnit.SECONDS);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(b bVar) {
        return g(bVar.M());
    }

    public int g(long j10) {
        return h(this.f64567b, j10);
    }

    public String toString() {
        return K(this.f64567b);
    }

    public /* synthetic */ b(long j10) {
        this.f64567b = j10;
    }

    public static final long F(long j10, long j11) {
        if (C(j10)) {
            if (!z(j11) && (j11 ^ j10) < 0) {
                throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
            }
            return j10;
        }
        if (C(j11)) {
            return j11;
        }
        if ((((int) j10) & 1) == (((int) j11) & 1)) {
            long jX = x(j10) + x(j11);
            return B(j10) ? d.m(jX) : d.k(jX);
        }
        if (A(j10)) {
            return d(j10, x(j10), x(j11));
        }
        return d(j10, x(j11), x(j10));
    }

    public static final long L(long j10) {
        return d.i(-x(j10), ((int) j10) & 1);
    }

    public static final long d(long j10, long j11, long j12) {
        long jO = d.o(j12);
        long j13 = j11 + jO;
        boolean z10 = false;
        if (-4611686018426L <= j13 && j13 < 4611686018427L) {
            z10 = true;
        }
        if (!z10) {
            return d.j(ik.k.l(j13, -4611686018427387903L, 4611686018427387903L));
        }
        return d.l(d.n(j13) + (j12 - d.n(jO)));
    }

    public static final void e(long j10, StringBuilder sb2, int i10, int i11, int i12, String str, boolean z10) {
        boolean z11;
        sb2.append(i10);
        if (i11 != 0) {
            sb2.append('.');
            String strW0 = a0.w0(String.valueOf(i11), i12, '0');
            int i13 = -1;
            int length = strW0.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i14 = length - 1;
                    if (strW0.charAt(length) != '0') {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        i13 = length;
                        break;
                    } else if (i14 < 0) {
                        break;
                    } else {
                        length = i14;
                    }
                }
            }
            int i15 = i13 + 1;
            if (!z10 && i15 < 3) {
                sb2.append((CharSequence) strW0, 0, i15);
                p.i(sb2, "append(...)");
            } else {
                sb2.append((CharSequence) strW0, 0, ((i15 + 2) / 3) * 3);
                p.i(sb2, "append(...)");
            }
        }
        sb2.append(str);
    }

    public static long i(long j10) {
        boolean z10;
        if (c.a()) {
            boolean z11 = true;
            if (B(j10)) {
                long jX = x(j10);
                if (-4611686018426999999L > jX || jX >= 4611686018427000000L) {
                    z11 = false;
                }
                if (!z11) {
                    throw new AssertionError(x(j10) + " ns is out of nanoseconds range");
                }
            } else {
                long jX2 = x(j10);
                if (-4611686018427387903L <= jX2 && jX2 < 4611686018427387904L) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    long jX3 = x(j10);
                    if (-4611686018426L > jX3 || jX3 >= 4611686018427L) {
                        z11 = false;
                    }
                    if (z11) {
                        throw new AssertionError(x(j10) + " ms is denormalized");
                    }
                } else {
                    throw new AssertionError(x(j10) + " ms is out of milliseconds range");
                }
            }
        }
        return j10;
    }

    public static final long l(long j10) {
        if (D(j10)) {
            return L(j10);
        }
        return j10;
    }

    public static final int m(long j10) {
        if (C(j10)) {
            return 0;
        }
        return (int) (o(j10) % ((long) 24));
    }

    public static final long p(long j10) {
        if (A(j10) && z(j10)) {
            return x(j10);
        }
        return J(j10, DurationUnit.MILLISECONDS);
    }

    public static final long r(long j10) {
        long jX = x(j10);
        if (!B(j10)) {
            if (jX > 9223372036854L) {
                return Long.MAX_VALUE;
            }
            if (jX >= -9223372036854L) {
                return d.n(jX);
            }
            return Long.MIN_VALUE;
        }
        return jX;
    }

    public static final int t(long j10) {
        if (C(j10)) {
            return 0;
        }
        return (int) (q(j10) % ((long) 60));
    }

    public static final int u(long j10) {
        long jX;
        if (C(j10)) {
            return 0;
        }
        if (A(j10)) {
            jX = d.n(x(j10) % ((long) 1000));
        } else {
            jX = x(j10) % ((long) 1000000000);
        }
        return (int) jX;
    }

    public static final int v(long j10) {
        if (C(j10)) {
            return 0;
        }
        return (int) (s(j10) % ((long) 60));
    }

    public static final DurationUnit w(long j10) {
        if (B(j10)) {
            return DurationUnit.NANOSECONDS;
        }
        return DurationUnit.MILLISECONDS;
    }

    public static final boolean z(long j10) {
        return !C(j10);
    }
}
