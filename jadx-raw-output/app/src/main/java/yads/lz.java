package yads;

/* JADX INFO: loaded from: classes10.dex */
public final class lz implements c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mz f79997a;

    public lz(mz mzVar) {
        this.f79997a = mzVar;
    }

    @Override // yads.c2
    public final void a() {
        ay0 ay0Var = this.f79997a.f80476i;
        if (ay0Var != null) {
            ay0Var.resume();
        }
    }

    @Override // yads.c2
    public final void b() {
        ay0 ay0Var = this.f79997a.f80476i;
        if (ay0Var != null) {
            ay0Var.pause();
        }
    }
}
