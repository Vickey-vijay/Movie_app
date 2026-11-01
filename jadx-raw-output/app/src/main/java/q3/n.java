package q3;

import g5.k0;

/* JADX INFO: compiled from: FlacSeekTableSeekMap.java */
/* JADX INFO: loaded from: classes4.dex */
public final class n implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g5.j f66457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f66458b;

    @Override // q3.s
    public boolean isSeekable() {
        return true;
    }

    @Override // q3.s
    public long getDurationUs() {
        return this.f66457a.h();
    }

    @Override // q3.s
    public s.a getSeekPoints(long j10) {
        g5.a.e(this.f66457a.f53103k);
        g5.j jVar = this.f66457a;
        g5.j.a aVar = jVar.f53103k;
        long[] jArr = aVar.f53105a;
        long[] jArr2 = aVar.f53106b;
        int iH = k0.h(jArr, jVar.k(j10), true, false);
        t tVarA = a(iH == -1 ? 0L : jArr[iH], iH != -1 ? jArr2[iH] : 0L);
        if (tVarA.f66483a == j10 || iH == jArr.length - 1) {
            return new s.a(tVarA);
        }
        int i10 = iH + 1;
        return new s.a(tVarA, a(jArr[i10], jArr2[i10]));
    }

    public n(g5.j jVar, long j10) {
        this.f66457a = jVar;
        this.f66458b = j10;
    }

    public final t a(long j10, long j11) {
        return new t((j10 * 1000000) / ((long) this.f66457a.f53097e), this.f66458b + j11);
    }
}
