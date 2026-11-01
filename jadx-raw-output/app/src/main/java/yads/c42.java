package yads;

/* JADX INFO: loaded from: classes10.dex */
public final class c42 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y00 f76156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cq2 f76157b;

    public final boolean a() {
        y00 y00Var = this.f76156a;
        return (y00Var.f84779n == null && y00Var.f84772g == null && y00Var.f84774i == null && y00Var.f84768c == null && y00Var.f84767b == null) ? false : true;
    }

    public final boolean b() {
        return this.f76156a.f84773h != null && (cq2.f76403c == this.f76157b || (d() ^ true));
    }

    public final boolean c() {
        a10 a10Var = this.f76156a.f84769d;
        return a10Var != null && (ck.p.e("large", a10Var.f75359b) || ck.p.e("wide", this.f76156a.f84769d.f75359b));
    }

    public final boolean d() {
        y00 y00Var = this.f76156a;
        return (y00Var.f84776k == null && y00Var.f84777l == null) ? false : true;
    }

    public c42(y00 y00Var, cq2 cq2Var) {
        this.f76156a = y00Var;
        this.f76157b = cq2Var;
    }
}
