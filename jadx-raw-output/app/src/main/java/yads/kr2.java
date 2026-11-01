package yads;

/* JADX INFO: loaded from: classes11.dex */
public final class kr2 implements c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mr2 f79528a;

    public kr2(mr2 mr2Var) {
        this.f79528a = mr2Var;
    }

    @Override // yads.c2
    public final void a() {
        ay0 ay0Var = this.f79528a.f80343i;
        if (ay0Var != null) {
            ay0Var.resume();
        }
    }

    @Override // yads.c2
    public final void b() {
        ay0 ay0Var = this.f79528a.f80343i;
        if (ay0Var != null) {
            ay0Var.pause();
        }
    }
}
