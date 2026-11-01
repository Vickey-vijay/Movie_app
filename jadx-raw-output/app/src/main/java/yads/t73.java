package yads;

/* JADX INFO: loaded from: classes.dex */
public final class t73 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f82907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mn2[] f82908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final op0[] f82909c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o83 f82910d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f82911e;

    public final boolean a(int i10) {
        return this.f82908b[i10] != null;
    }

    public t73(mn2[] mn2VarArr, op0[] op0VarArr, o83 o83Var, li1 li1Var) {
        this.f82908b = mn2VarArr;
        this.f82909c = (op0[]) op0VarArr.clone();
        this.f82910d = o83Var;
        this.f82911e = li1Var;
        this.f82907a = mn2VarArr.length;
    }
}
