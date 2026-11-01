package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class qj1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y00 f81870a;

    public final Float a() {
        int i10;
        int i11;
        y00 y00Var = this.f81870a;
        h10 h10Var = y00Var.f84766a;
        a10 a10Var = y00Var.f84769d;
        if (h10Var != null) {
            return Float.valueOf(h10Var.f78012a);
        }
        if (a10Var == null || (i10 = a10Var.f75360c) <= 0 || (i11 = a10Var.f75361d) <= 0) {
            return null;
        }
        return Float.valueOf(i10 / i11);
    }

    public qj1(y00 y00Var) {
        this.f81870a = y00Var;
    }
}
