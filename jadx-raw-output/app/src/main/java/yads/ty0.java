package yads;

/* JADX INFO: loaded from: classes11.dex */
public final class ty0 implements py0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xe1 f83239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kz f83240b;

    @Override // yads.py0
    public final void c() {
        if (this.f83239a.a()) {
            return;
        }
        this.f83240b.e();
    }

    @Override // yads.py0
    public final void invalidate() {
        this.f83239a.b();
    }

    public ty0(xe1 xe1Var, kz kzVar) {
        this.f83239a = xe1Var;
        this.f83240b = kzVar;
    }
}
