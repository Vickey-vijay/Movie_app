package mj;

/* JADX INFO: compiled from: UByte.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class i implements Comparable<i> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f64541c = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte f64542b;

    /* JADX INFO: compiled from: UByte.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public static final /* synthetic */ i a(byte b10) {
        return new i(b10);
    }

    public static byte b(byte b10) {
        return b10;
    }

    public static boolean c(byte b10, Object obj) {
        return (obj instanceof i) && b10 == ((i) obj).f();
    }

    public static int d(byte b10) {
        return Byte.hashCode(b10);
    }

    public boolean equals(Object obj) {
        return c(this.f64542b, obj);
    }

    public final /* synthetic */ byte f() {
        return this.f64542b;
    }

    public int hashCode() {
        return d(this.f64542b);
    }

    public static String e(byte b10) {
        return String.valueOf(b10 & 255);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(i iVar) {
        return ck.p.l(f() & 255, iVar.f() & 255);
    }

    public String toString() {
        return e(this.f64542b);
    }

    public /* synthetic */ i(byte b10) {
        this.f64542b = b10;
    }
}
