package n4;

import o4.h;

/* JADX INFO: compiled from: DashWrappingSegmentIndex.java */
/* JADX INFO: loaded from: classes6.dex */
public final class d implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q3.b f64674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f64675b;

    @Override // n4.c
    public long getFirstSegmentNum() {
        return 0L;
    }

    @Override // n4.c
    public boolean isExplicit() {
        return true;
    }

    @Override // n4.c
    public long getDurationUs(long j10, long j11) {
        return this.f64674a.f66429d[(int) j10];
    }

    @Override // n4.c
    public int getSegmentCount(long j10) {
        return this.f64674a.f66426a;
    }

    @Override // n4.c
    public long getSegmentNum(long j10, long j11) {
        return this.f64674a.a(j10 + this.f64675b);
    }

    @Override // n4.c
    public h getSegmentUrl(long j10) {
        q3.b bVar = this.f64674a;
        int i10 = (int) j10;
        return new h(null, bVar.f66428c[i10], bVar.f66427b[i10]);
    }

    @Override // n4.c
    public long getTimeUs(long j10) {
        return this.f64674a.f66430e[(int) j10] - this.f64675b;
    }

    public d(q3.b bVar, long j10) {
        this.f64674a = bVar;
        this.f64675b = j10;
    }
}
