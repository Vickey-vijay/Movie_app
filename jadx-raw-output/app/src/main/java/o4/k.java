package o4;

/* JADX INFO: compiled from: SingleSegmentIndex.java */
/* JADX INFO: loaded from: classes7.dex */
public final class k implements n4.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f65065a;

    @Override // n4.c
    public long getDurationUs(long j10, long j11) {
        return j11;
    }

    @Override // n4.c
    public long getFirstSegmentNum() {
        return 0L;
    }

    @Override // n4.c
    public int getSegmentCount(long j10) {
        return 1;
    }

    @Override // n4.c
    public long getSegmentNum(long j10, long j11) {
        return 0L;
    }

    @Override // n4.c
    public long getTimeUs(long j10) {
        return 0L;
    }

    @Override // n4.c
    public boolean isExplicit() {
        return true;
    }

    @Override // n4.c
    public h getSegmentUrl(long j10) {
        return this.f65065a;
    }

    public k(h hVar) {
        this.f65065a = hVar;
    }
}
