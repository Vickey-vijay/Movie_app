package mk;

import ck.p;

/* JADX INFO: compiled from: TimeSource.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class j implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f64572a = new j();

    /* JADX INFO: compiled from: TimeSource.kt */
    public static final class a implements mk.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f64573b;

        public static final /* synthetic */ a b(long j10) {
            return new a(j10);
        }

        public static long d(long j10) {
            return j10;
        }

        public static boolean f(long j10, Object obj) {
            return (obj instanceof a) && j10 == ((a) obj).k();
        }

        public static int g(long j10) {
            return Long.hashCode(j10);
        }

        public static String j(long j10) {
            return "ValueTimeMark(reading=" + j10 + ')';
        }

        public boolean equals(Object obj) {
            return f(this.f64573b, obj);
        }

        public int hashCode() {
            return g(this.f64573b);
        }

        public final /* synthetic */ long k() {
            return this.f64573b;
        }

        public String toString() {
            return j(this.f64573b);
        }

        public static long e(long j10) {
            return h.f64570a.c(j10);
        }

        public static final long h(long j10, long j11) {
            return h.f64570a.b(j10, j11);
        }

        public static long i(long j10, mk.a aVar) {
            p.j(aVar, "other");
            if (aVar instanceof a) {
                return h(j10, ((a) aVar).k());
            }
            throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + ((Object) j(j10)) + " and " + aVar);
        }

        @Override // mk.a
        public long Y(mk.a aVar) {
            p.j(aVar, "other");
            return i(this.f64573b, aVar);
        }

        @Override // mk.i
        public long a() {
            return e(this.f64573b);
        }

        public /* synthetic */ a(long j10) {
            this.f64573b = j10;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int compareTo(mk.a aVar) {
            return mk.a.C0587a.a(this, aVar);
        }
    }

    public long b() {
        return h.f64570a.d();
    }

    public String toString() {
        return h.f64570a.toString();
    }

    @Override // mk.k
    public /* bridge */ /* synthetic */ mk.a a() {
        return a.b(b());
    }
}
