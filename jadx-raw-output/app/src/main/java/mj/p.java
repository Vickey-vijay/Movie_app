package mj;

/* JADX INFO: compiled from: UShort.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class p implements Comparable<p> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f64557c = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final short f64558b;

    /* JADX INFO: compiled from: UShort.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public static final /* synthetic */ p a(short s10) {
        return new p(s10);
    }

    public static short b(short s10) {
        return s10;
    }

    public static boolean c(short s10, Object obj) {
        return (obj instanceof p) && s10 == ((p) obj).f();
    }

    public static int d(short s10) {
        return Short.hashCode(s10);
    }

    public boolean equals(Object obj) {
        return c(this.f64558b, obj);
    }

    public final /* synthetic */ short f() {
        return this.f64558b;
    }

    public int hashCode() {
        return d(this.f64558b);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(p pVar) {
        return ck.p.l(f() & 65535, pVar.f() & 65535);
    }

    public String toString() {
        return e(this.f64558b);
    }

    public /* synthetic */ p(short s10) {
        this.f64558b = s10;
    }

    public static String e(short s10) {
        return String.valueOf(s10 & 65535);
    }
}
