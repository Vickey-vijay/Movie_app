package yads;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class q43 implements r43 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o20[] f81707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f81708c;

    @Override // yads.r43
    public final long a(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
        long[] jArr = this.f81708c;
        if (i10 < jArr.length) {
            return jArr[i10];
        }
        throw new IllegalArgumentException();
    }

    @Override // yads.r43
    public final List b(long j10) {
        o20 o20Var;
        int iB = ib3.b(this.f81708c, j10, false);
        return (iB == -1 || (o20Var = this.f81707b[iB]) == o20.f80902s) ? Collections.emptyList() : Collections.singletonList(o20Var);
    }

    public q43(o20[] o20VarArr, long[] jArr) {
        this.f81707b = o20VarArr;
        this.f81708c = jArr;
    }

    @Override // yads.r43
    public final int a() {
        return this.f81708c.length;
    }

    @Override // yads.r43
    public final int a(long j10) {
        int iA = ib3.a(this.f81708c, j10, false);
        if (iA < this.f81708c.length) {
            return iA;
        }
        return -1;
    }
}
