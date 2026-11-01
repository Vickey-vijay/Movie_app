package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class ck implements ak {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f76298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f76299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jb2 f76300c;

    @Override // yads.ak
    public final int a() {
        return this.f76298a;
    }

    @Override // yads.ak
    public final int b() {
        return this.f76299b;
    }

    @Override // yads.ak
    public final int c() {
        int i10 = this.f76298a;
        return i10 == -1 ? this.f76300c.p() : i10;
    }

    public ck(wj wjVar, mx0 mx0Var) {
        jb2 jb2Var = wjVar.f84218b;
        this.f76300c = jb2Var;
        jb2Var.e(12);
        int iP = jb2Var.p();
        if ("audio/raw".equals(mx0Var.f80429m)) {
            int iB = ib3.b(mx0Var.B, mx0Var.f80442z);
            if (iP == 0 || iP % iB != 0) {
                ih1.d("AtomParsers", "Audio sample size mismatch. stsd sample size: " + iB + ", stsz sample size: " + iP);
                iP = iB;
            }
        }
        this.f76298a = iP == 0 ? -1 : iP;
        this.f76299b = jb2Var.p();
    }
}
