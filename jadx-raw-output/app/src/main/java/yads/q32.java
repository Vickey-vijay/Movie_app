package yads;

/* JADX INFO: loaded from: classes8.dex */
public final class q32 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y00 f81695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cq2 f81696b;

    public final boolean a() {
        a10 a10Var;
        y00 y00Var = this.f81695a;
        return (b() || this.f81695a.f84767b == null || !(y00Var.f84766a != null || (a10Var = y00Var.f84769d) == null || a(a10Var))) ? false : true;
    }

    public final boolean b() {
        return this.f81695a.f84768c != null && (cq2.f76404d == this.f81696b || !c());
    }

    public final boolean c() {
        a10 a10Var;
        y00 y00Var = this.f81695a;
        return (y00Var.f84766a != null || (a10Var = y00Var.f84769d) == null || a(a10Var) || cq2.f76404d == this.f81696b) ? false : true;
    }

    public q32(y00 y00Var, cq2 cq2Var) {
        this.f81695a = y00Var;
        this.f81696b = cq2Var;
    }

    public static boolean a(a10 a10Var) {
        return ck.p.e("large", a10Var.f75359b) || ck.p.e("wide", a10Var.f75359b);
    }
}
