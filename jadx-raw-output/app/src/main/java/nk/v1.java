package nk;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final sk.d0 f64825a = new sk.d0("COMPLETING_ALREADY");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final sk.d0 f64826b = new sk.d0("COMPLETING_WAITING_CHILDREN");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final sk.d0 f64827c = new sk.d0("COMPLETING_RETRY");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final sk.d0 f64828d = new sk.d0("TOO_LATE_TO_CANCEL");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final sk.d0 f64829e = new sk.d0("SEALED");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b1 f64830f = new b1(false);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b1 f64831g = new b1(true);

    public static final Object g(Object obj) {
        return obj instanceof o1 ? new p1((o1) obj) : obj;
    }

    public static final Object h(Object obj) {
        o1 o1Var;
        p1 p1Var = obj instanceof p1 ? (p1) obj : null;
        return (p1Var == null || (o1Var = p1Var.f64813a) == null) ? obj : o1Var;
    }
}
