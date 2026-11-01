package yads;

/* JADX INFO: loaded from: classes10.dex */
public final class pp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f81516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f81517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f81518c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f81519d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f81520e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f81521f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f81522g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f81523h;

    public static long a(long j10, long j11, long j12, long j13, long j14, long j15) {
        if (j13 + 1 >= j14 || j11 + 1 >= j12) {
            return j13;
        }
        long j16 = (long) ((j10 - j11) * ((j14 - j13) / (j12 - j11)));
        long j17 = j16 / 20;
        int i10 = ib3.f78556a;
        return Math.max(j13, Math.min(((j16 + j13) - j15) - j17, j14 - 1));
    }

    public pp(long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
        this.f81516a = j10;
        this.f81517b = j11;
        this.f81519d = j12;
        this.f81520e = j13;
        this.f81521f = j14;
        this.f81522g = j15;
        this.f81518c = j16;
        this.f81523h = a(j11, j12, j13, j14, j15, j16);
    }
}
