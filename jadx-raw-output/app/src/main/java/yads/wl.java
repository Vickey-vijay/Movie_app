package yads;

/* JADX INFO: loaded from: classes11.dex */
public final class wl implements vw2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f84251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yl f84252b;

    @Override // yads.vw2
    public final boolean b() {
        return true;
    }

    public wl(yl ylVar, long j10) {
        this.f84252b = ylVar;
        this.f84251a = j10;
    }

    @Override // yads.vw2
    public final tw2 b(long j10) {
        tw2 tw2VarB = this.f84252b.f85029g[0].b(j10);
        int i10 = 1;
        while (true) {
            iu[] iuVarArr = this.f84252b.f85029g;
            if (i10 >= iuVarArr.length) {
                return tw2VarB;
            }
            tw2 tw2VarB2 = iuVarArr[i10].b(j10);
            if (tw2VarB2.f83229a.f84728b < tw2VarB.f83229a.f84728b) {
                tw2VarB = tw2VarB2;
            }
            i10++;
        }
    }

    @Override // yads.vw2
    public final long c() {
        return this.f84251a;
    }
}
