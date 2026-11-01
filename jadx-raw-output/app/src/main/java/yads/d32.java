package yads;

/* JADX INFO: loaded from: classes11.dex */
public final class d32 implements w63 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f76546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e32 f76547b;

    public d32(e32 e32Var, long j10) {
        this.f76547b = e32Var;
        this.f76546a = j10;
    }

    @Override // yads.w63
    public final void a(long j10, long j11) {
        tj2 tj2Var = this.f76547b.f76902d;
        if (tj2Var != null) {
            long j12 = this.f76546a;
            tj2Var.a(j12, j12 - j10);
        }
    }
}
