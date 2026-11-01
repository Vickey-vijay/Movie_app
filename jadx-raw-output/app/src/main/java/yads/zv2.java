package yads;

/* JADX INFO: loaded from: classes7.dex */
public final class zv2 implements s42 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ aw2 f85619a;

    @Override // yads.s42
    public final void a(l4 l4Var) {
        aw2 aw2Var = this.f85619a;
        if (aw2Var.f75649k) {
            return;
        }
        aw2Var.f75648j = null;
        aw2Var.f75639a.b(l4Var);
    }

    public zv2(aw2 aw2Var) {
        this.f85619a = aw2Var;
    }

    @Override // yads.s42
    public final void a(w02 w02Var) {
        aw2 aw2Var = this.f85619a;
        if (aw2Var.f75649k) {
            return;
        }
        aw2Var.f75648j = w02Var;
        aw2Var.f75639a.l();
    }
}
