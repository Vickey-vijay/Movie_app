package yads;

/* JADX INFO: loaded from: classes7.dex */
public final class vl3 implements qf3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hf3 f83953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gk3 f83954b;

    public /* synthetic */ vl3(r52 r52Var, i72 i72Var) {
        this(r52Var, uw1.a(i72Var));
    }

    @Override // yads.qf3
    public final void a(long j10, long j11) {
        if (this.f83954b.a()) {
            if (this.f83953a.isPlayingAd()) {
                return;
            }
            this.f83953a.resumeAd();
        } else if (this.f83953a.isPlayingAd()) {
            this.f83953a.pauseAd();
        }
    }

    public vl3(r52 r52Var, gk3 gk3Var) {
        this.f83953a = r52Var;
        this.f83954b = gk3Var;
    }
}
