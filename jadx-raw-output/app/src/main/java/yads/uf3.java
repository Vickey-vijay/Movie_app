package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class uf3 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ vf3 f83459b;

    public uf3(vf3 vf3Var) {
        this.f83459b = vf3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long adPosition = this.f83459b.f83898a.getAdPosition();
        this.f83459b.f83899b.a(this.f83459b.f83898a.b(), adPosition);
        vf3 vf3Var = this.f83459b;
        if (vf3Var.f83901d) {
            vf3Var.f83900c.postDelayed(this, 200L);
        }
    }
}
