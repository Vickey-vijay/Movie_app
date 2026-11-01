package yads;

/* JADX INFO: loaded from: classes9.dex */
public final class sv1 implements fv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gw1 f82768a;

    @Override // yads.fv
    public final void a(if1 if1Var, hv hvVar) {
        this.f82768a.setClickListener(new rv1(if1Var, hvVar));
    }

    public sv1(gw1 gw1Var) {
        this.f82768a = gw1Var;
    }
}
