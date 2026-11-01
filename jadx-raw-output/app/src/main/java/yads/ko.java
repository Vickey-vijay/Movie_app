package yads;

/* JADX INFO: loaded from: classes11.dex */
public abstract class ko implements yj1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f79495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f79496c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f79497d;

    public final void c() {
        this.f79497d = this.f79495b - 1;
    }

    @Override // yads.yj1
    public final boolean next() {
        long j10 = this.f79497d + 1;
        this.f79497d = j10;
        return !(j10 > this.f79496c);
    }

    public ko(long j10, long j11) {
        this.f79495b = j10;
        this.f79496c = j11;
        c();
    }
}
