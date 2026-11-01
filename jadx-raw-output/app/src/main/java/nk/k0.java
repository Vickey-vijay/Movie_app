package nk;

/* JADX INFO: compiled from: CoroutineName.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class k0 extends kotlin.coroutines.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f64796c = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f64797b;

    /* JADX INFO: compiled from: CoroutineName.kt */
    public static final class a implements kotlin.coroutines.d.c<k0> {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k0) && ck.p.e(this.f64797b, ((k0) obj).f64797b);
    }

    public int hashCode() {
        return this.f64797b.hashCode();
    }

    public k0(String str) {
        super(f64796c);
        this.f64797b = str;
    }

    public final String n() {
        return this.f64797b;
    }

    public String toString() {
        return "CoroutineName(" + this.f64797b + ')';
    }
}
