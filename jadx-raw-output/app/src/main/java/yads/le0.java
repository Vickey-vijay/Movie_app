package yads;

/* JADX INFO: loaded from: classes10.dex */
public final class le0 implements vw2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ me0 f79761a;

    @Override // yads.vw2
    public final boolean b() {
        return true;
    }

    public le0(me0 me0Var) {
        this.f79761a = me0Var;
    }

    @Override // yads.vw2
    public final tw2 b(long j10) {
        me0 me0Var = this.f79761a;
        long j11 = (((long) me0Var.f80155d.f85203i) * j10) / 1000000;
        long j12 = me0Var.f80153b;
        long j13 = me0Var.f80154c;
        int i10 = ib3.f78556a;
        xw2 xw2Var = new xw2(j10, Math.max(j12, Math.min(((((j13 - j12) * j11) / me0Var.f80157f) + j12) - 30000, j13 - 1)));
        return new tw2(xw2Var, xw2Var);
    }

    @Override // yads.vw2
    public final long c() {
        me0 me0Var = this.f79761a;
        return (me0Var.f80157f * 1000000) / ((long) me0Var.f80155d.f85203i);
    }
}
