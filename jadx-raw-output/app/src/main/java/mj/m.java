package mj;

/* JADX INFO: compiled from: ULong.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class m implements Comparable<m> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f64551c = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f64552b;

    /* JADX INFO: compiled from: ULong.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public static final /* synthetic */ m a(long j10) {
        return new m(j10);
    }

    public static long b(long j10) {
        return j10;
    }

    public static boolean c(long j10, Object obj) {
        return (obj instanceof m) && j10 == ((m) obj).f();
    }

    public static int d(long j10) {
        return Long.hashCode(j10);
    }

    public boolean equals(Object obj) {
        return c(this.f64552b, obj);
    }

    public final /* synthetic */ long f() {
        return this.f64552b;
    }

    public int hashCode() {
        return d(this.f64552b);
    }

    public static String e(long j10) {
        return s.c(j10, 10);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(m mVar) {
        return s.b(f(), mVar.f());
    }

    public String toString() {
        return e(this.f64552b);
    }

    public /* synthetic */ m(long j10) {
        this.f64552b = j10;
    }
}
