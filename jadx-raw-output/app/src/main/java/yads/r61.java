package yads;

/* JADX INFO: loaded from: classes10.dex */
public final class r61 extends cu {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final fu f82109j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public eu f82110k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f82111l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public volatile boolean f82112m;

    public r61(p30 p30Var, u30 u30Var, mx0 mx0Var, int i10, Object obj, fu fuVar) {
        super(p30Var, u30Var, 2, mx0Var, i10, obj, -9223372036854775807L, -9223372036854775807L);
        this.f82109j = fuVar;
    }

    @Override // yads.bg1
    public final void b() {
        this.f82112m = true;
    }

    @Override // yads.bg1
    public final void a() {
        if (this.f82111l == 0) {
            ((ar) this.f82109j).a(this.f82110k, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            u30 u30Var = this.f76425b;
            long j10 = this.f82111l;
            long j11 = u30Var.f83347g;
            long j12 = -1;
            if (j11 != -1) {
                j12 = j11 - j10;
            }
            u30 u30VarA = u30Var.a(j10, j12);
            r33 r33Var = this.f76432i;
            ld0 ld0Var = new ld0(r33Var, u30VarA.f83346f, r33Var.a(u30VarA));
            while (!this.f82112m) {
                try {
                    int iA = ((ar) this.f82109j).f75599b.a(ld0Var, ar.f75598l);
                    if (iA == 1) {
                        throw new IllegalStateException();
                    }
                    if (iA != 0) {
                        break;
                    }
                } catch (Throwable th2) {
                    this.f82111l = ld0Var.f79757d - this.f76425b.f83346f;
                    throw th2;
                }
            }
            this.f82111l = ld0Var.f79757d - this.f76425b.f83346f;
            s30.a(this.f76432i);
        } catch (Throwable th3) {
            s30.a(this.f76432i);
            throw th3;
        }
    }
}
