package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class de0 implements zj1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j33 f76650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ce0 f76651c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ro f76652d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public zj1 f76653e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f76654f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f76655g;

    @Override // yads.zj1
    public final long a() {
        if (this.f76654f) {
            return this.f76650b.a();
        }
        zj1 zj1Var = this.f76653e;
        zj1Var.getClass();
        return zj1Var.a();
    }

    @Override // yads.zj1
    public final ee2 getPlaybackParameters() {
        zj1 zj1Var = this.f76653e;
        return zj1Var != null ? zj1Var.getPlaybackParameters() : this.f76650b.f78907f;
    }

    public de0(ce0 ce0Var, f53 f53Var) {
        this.f76651c = ce0Var;
        this.f76650b = new j33(f53Var);
    }

    @Override // yads.zj1
    public final void a(ee2 ee2Var) {
        zj1 zj1Var = this.f76653e;
        if (zj1Var != null) {
            zj1Var.a(ee2Var);
            ee2Var = this.f76653e.getPlaybackParameters();
        }
        this.f76650b.a(ee2Var);
    }
}
