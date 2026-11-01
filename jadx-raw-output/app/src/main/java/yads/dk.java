package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class dk implements ak {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jb2 f76696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f76697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f76698c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f76699d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f76700e;

    @Override // yads.ak
    public final int a() {
        return -1;
    }

    @Override // yads.ak
    public final int b() {
        return this.f76697b;
    }

    @Override // yads.ak
    public final int c() {
        int i10 = this.f76698c;
        if (i10 == 8) {
            return this.f76696a.m();
        }
        if (i10 == 16) {
            return this.f76696a.r();
        }
        int i11 = this.f76699d;
        this.f76699d = i11 + 1;
        if (i11 % 2 != 0) {
            return this.f76700e & 15;
        }
        int iM = this.f76696a.m();
        this.f76700e = iM;
        return (iM & 240) >> 4;
    }

    public dk(wj wjVar) {
        jb2 jb2Var = wjVar.f84218b;
        this.f76696a = jb2Var;
        jb2Var.e(12);
        this.f76698c = jb2Var.p() & 255;
        this.f76697b = jb2Var.p();
    }
}
