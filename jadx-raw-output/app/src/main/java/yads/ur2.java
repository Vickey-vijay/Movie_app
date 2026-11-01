package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class ur2 implements c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y42 f83588a;

    @Override // yads.c2
    public final void a() {
        ay0 ay0Var = this.f83588a.f84817b;
        if (ay0Var != null) {
            ay0Var.resume();
        }
    }

    @Override // yads.c2
    public final void b() {
        ay0 ay0Var = this.f83588a.f84817b;
        if (ay0Var != null) {
            ay0Var.pause();
        }
    }

    public ur2(y42 y42Var) {
        this.f83588a = y42Var;
    }
}
