package yads;

/* JADX INFO: loaded from: classes3.dex */
public final class n33 implements vw2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vw2 f80548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o33 f80549b;

    @Override // yads.vw2
    public final tw2 b(long j10) {
        tw2 tw2VarB = this.f80548a.b(j10);
        xw2 xw2Var = tw2VarB.f83229a;
        long j11 = xw2Var.f84727a;
        long j12 = xw2Var.f84728b;
        long j13 = this.f80549b.f80926b;
        xw2 xw2Var2 = new xw2(j11, j12 + j13);
        xw2 xw2Var3 = tw2VarB.f83230b;
        return new tw2(xw2Var2, new xw2(xw2Var3.f84727a, xw2Var3.f84728b + j13));
    }

    public n33(o33 o33Var, vw2 vw2Var) {
        this.f80549b = o33Var;
        this.f80548a = vw2Var;
    }

    @Override // yads.vw2
    public final long c() {
        return this.f80548a.c();
    }

    @Override // yads.vw2
    public final boolean b() {
        return this.f80548a.b();
    }
}
