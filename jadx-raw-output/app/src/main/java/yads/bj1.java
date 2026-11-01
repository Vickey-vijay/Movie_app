package yads;

/* JADX INFO: loaded from: classes8.dex */
public final class bj1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f75846c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cj1 f75847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aj1 f75848b = new aj1();

    public final String a() {
        String strA;
        synchronized (f75846c) {
            strA = this.f75847a.a();
            if (strA == null) {
                this.f75848b.getClass();
                strA = aj1.a();
                this.f75847a.a(strA);
            }
        }
        return strA;
    }

    public bj1(rg1 rg1Var) {
        this.f75847a = new cj1(rg1Var);
    }
}
