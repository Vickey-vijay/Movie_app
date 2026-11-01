package yads;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class dx2 extends cx2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f76839j;

    @Override // yads.cx2
    public final long a(long j10) {
        return this.f76839j.size();
    }

    @Override // yads.cx2
    public final boolean b() {
        return true;
    }

    public dx2(pl2 pl2Var, long j10, long j11, long j12, long j13, List list, long j14, List list2, long j15, long j16) {
        super(pl2Var, j10, j11, j12, j13, list, j14, j15, j16);
        this.f76839j = list2;
    }

    @Override // yads.cx2
    public final pl2 a(long j10, lo2 lo2Var) {
        return (pl2) this.f76839j.get((int) (j10 - this.f76456d));
    }
}
