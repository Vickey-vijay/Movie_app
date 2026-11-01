package yads;

/* JADX INFO: loaded from: classes6.dex */
public final class t32 implements ac2, w63 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u32 f82879a;

    @Override // yads.ac2
    public final void a() {
        this.f82879a.f83354a.a();
    }

    public t32(u32 u32Var) {
        this.f82879a = u32Var;
    }

    @Override // yads.w63
    public final void a(long j10, long j11) {
        long jA = this.f82879a.f83358e.a() - j10;
        u32 u32Var = this.f82879a;
        long j12 = jA + u32Var.f83356c.f82669a;
        this.f82879a.f83354a.a(u32Var.f83357d.a(), j12);
    }
}
