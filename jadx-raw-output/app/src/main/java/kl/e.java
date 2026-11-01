package kl;

/* JADX INFO: compiled from: DanmakuTimer.java */
/* JADX INFO: loaded from: classes11.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f62916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f62917b;

    public long a(long j10) {
        return update(this.f62916a + j10);
    }

    public long b() {
        return this.f62917b;
    }

    public long update(long j10) {
        long j11 = j10 - this.f62916a;
        this.f62917b = j11;
        this.f62916a = j10;
        return j11;
    }
}
