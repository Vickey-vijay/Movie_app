package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class ti1 extends px0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f83059f = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f83060d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f83061e;

    @Override // yads.px0, yads.s63
    public final int a(Object obj) {
        Object obj2;
        s63 s63Var = this.f81642c;
        if (f83059f.equals(obj) && (obj2 = this.f83061e) != null) {
            obj = obj2;
        }
        return s63Var.a(obj);
    }

    public ti1(s63 s63Var, Object obj, Object obj2) {
        super(s63Var);
        this.f83060d = obj;
        this.f83061e = obj2;
    }

    @Override // yads.s63
    public final p63 a(int i10, p63 p63Var, boolean z10) {
        this.f81642c.a(i10, p63Var, z10);
        if (ib3.a(p63Var.f81267c, this.f83061e) && z10) {
            p63Var.f81267c = f83059f;
        }
        return p63Var;
    }

    @Override // yads.px0, yads.s63
    public final Object a(int i10) {
        Object objA = this.f81642c.a(i10);
        return ib3.a(objA, this.f83061e) ? f83059f : objA;
    }

    @Override // yads.px0, yads.s63
    public final r63 a(int i10, r63 r63Var, long j10) {
        this.f81642c.a(i10, r63Var, j10);
        if (ib3.a(r63Var.f82118b, this.f83060d)) {
            r63Var.f82118b = r63.f82114s;
        }
        return r63Var;
    }

    public static ti1 a(fm1 fm1Var) {
        return new ti1(new ui1(fm1Var), r63.f82114s, f83059f);
    }
}
