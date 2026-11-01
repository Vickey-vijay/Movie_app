package mj;

/* JADX INFO: compiled from: UInt.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class k implements Comparable<k> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f64546c = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f64547b;

    /* JADX INFO: compiled from: UInt.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public static final /* synthetic */ k a(int i10) {
        return new k(i10);
    }

    public static int b(int i10) {
        return i10;
    }

    public static boolean c(int i10, Object obj) {
        return (obj instanceof k) && i10 == ((k) obj).f();
    }

    public static int d(int i10) {
        return Integer.hashCode(i10);
    }

    public static String e(int i10) {
        return String.valueOf(((long) i10) & 4294967295L);
    }

    public boolean equals(Object obj) {
        return c(this.f64547b, obj);
    }

    public final /* synthetic */ int f() {
        return this.f64547b;
    }

    public int hashCode() {
        return d(this.f64547b);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(k kVar) {
        return s.a(f(), kVar.f());
    }

    public String toString() {
        return e(this.f64547b);
    }

    public /* synthetic */ k(int i10) {
        this.f64547b = i10;
    }
}
