package nk;

/* JADX INFO: compiled from: EventLoop.common.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l2 f64799a = new l2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadLocal<c1> f64800b = sk.l0.a(new sk.d0("ThreadLocalEventLoop"));

    public final c1 a() {
        return f64800b.get();
    }

    public final c1 b() {
        ThreadLocal<c1> threadLocal = f64800b;
        c1 c1Var = threadLocal.get();
        if (c1Var != null) {
            return c1Var;
        }
        c1 c1VarA = f1.a();
        threadLocal.set(c1VarA);
        return c1VarA;
    }

    public final void c() {
        f64800b.set(null);
    }

    public final void d(c1 c1Var) {
        f64800b.set(c1Var);
    }
}
