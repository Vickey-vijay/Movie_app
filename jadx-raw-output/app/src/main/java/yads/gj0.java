package yads;

/* JADX INFO: loaded from: classes11.dex */
public final class gj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pj0 f77816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f77817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f77818c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f77819d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f77820e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f77821f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f77822g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final nj0 f77823h;

    public gj0(pj0 pj0Var, int i10, long j10, long j11, long j12, int i11, int i12, nj0 nj0Var) {
        boolean z10;
        boolean z11;
        boolean z12;
        ni.a(nj0Var);
        if (i12 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i10 != 4) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 == z11) {
            z12 = true;
        } else {
            z12 = false;
        }
        ni.a(z12);
        if (i11 != 0) {
            ni.a((i10 == 2 || i10 == 0) ? false : true);
        }
        this.f77816a = pj0Var;
        this.f77817b = i10;
        this.f77818c = j10;
        this.f77819d = j11;
        this.f77820e = j12;
        this.f77821f = i11;
        this.f77822g = i12;
        this.f77823h = nj0Var;
    }
}
