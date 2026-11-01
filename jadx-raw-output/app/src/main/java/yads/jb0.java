package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class jb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p63 f78960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p51 f78961b = p51.g();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public xm2 f78962c = xm2.f84636h;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ym1 f78963d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ym1 f78964e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ym1 f78965f;

    public final void a(q51 q51Var, ym1 ym1Var, s63 s63Var) {
        if (ym1Var == null) {
            return;
        }
        if (s63Var.a(ym1Var.f82311a) != -1) {
            q51Var.a(ym1Var, s63Var);
            return;
        }
        s63 s63Var2 = (s63) this.f78962c.get(ym1Var);
        if (s63Var2 != null) {
            q51Var.a(ym1Var, s63Var2);
        }
    }

    public jb0(p63 p63Var) {
        this.f78960a = p63Var;
    }

    public static ym1 a(oe2 oe2Var, p51 p51Var, ym1 ym1Var, p63 p63Var) {
        zn0 zn0Var = (zn0) oe2Var;
        s63 s63VarH = zn0Var.h();
        int iF = zn0Var.f();
        Object objA = s63VarH.c() ? null : s63VarH.a(iF);
        int iA = (zn0Var.l() || s63VarH.c()) ? -1 : s63VarH.a(iF, p63Var).a(ib3.a(zn0Var.g()) - p63Var.a());
        for (int i10 = 0; i10 < p51Var.size(); i10++) {
            ym1 ym1Var2 = (ym1) p51Var.get(i10);
            if (a(ym1Var2, objA, zn0Var.l(), zn0Var.c(), zn0Var.d(), iA)) {
                return ym1Var2;
            }
        }
        if (p51Var.isEmpty() && ym1Var != null) {
            if (a(ym1Var, objA, zn0Var.l(), zn0Var.c(), zn0Var.d(), iA)) {
                return ym1Var;
            }
        }
        return null;
    }

    public static boolean a(ym1 ym1Var, Object obj, boolean z10, int i10, int i11, int i12) {
        if (ym1Var.f82311a.equals(obj)) {
            return (z10 && ym1Var.f82312b == i10 && ym1Var.f82313c == i11) || (!z10 && ym1Var.f82312b == -1 && ym1Var.f82315e == i12);
        }
        return false;
    }

    public final void a(s63 s63Var) {
        q51 q51VarA = s51.a();
        if (this.f78961b.isEmpty()) {
            a(q51VarA, this.f78964e, s63Var);
            if (!l92.a(this.f78965f, this.f78964e)) {
                a(q51VarA, this.f78965f, s63Var);
            }
            if (!l92.a(this.f78963d, this.f78964e) && !l92.a(this.f78963d, this.f78965f)) {
                a(q51VarA, this.f78963d, s63Var);
            }
        } else {
            for (int i10 = 0; i10 < this.f78961b.size(); i10++) {
                a(q51VarA, (ym1) this.f78961b.get(i10), s63Var);
            }
            if (!this.f78961b.contains(this.f78963d)) {
                a(q51VarA, this.f78963d, s63Var);
            }
        }
        this.f78962c = q51VarA.a();
    }
}
