package yads;

/* JADX INFO: loaded from: classes11.dex */
public final class yd0 implements rf1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f84892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f84893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f84894c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f84895d = -9223372036854775807L;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f84896e = -9223372036854775807L;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f84898g = -9223372036854775807L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f84899h = -9223372036854775807L;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f84902k = 0.97f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f84901j = 1.03f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f84903l = 1.0f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f84904m = -9223372036854775807L;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f84897f = -9223372036854775807L;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f84900i = -9223372036854775807L;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f84905n = -9223372036854775807L;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f84906o = -9223372036854775807L;

    public final void a() {
        long j10 = this.f84895d;
        if (j10 != -9223372036854775807L) {
            long j11 = this.f84896e;
            if (j11 != -9223372036854775807L) {
                j10 = j11;
            }
            long j12 = this.f84898g;
            if (j12 != -9223372036854775807L && j10 < j12) {
                j10 = j12;
            }
            long j13 = this.f84899h;
            if (j13 != -9223372036854775807L && j10 > j13) {
                j10 = j13;
            }
        } else {
            j10 = -9223372036854775807L;
        }
        if (this.f84897f == j10) {
            return;
        }
        this.f84897f = j10;
        this.f84900i = j10;
        this.f84905n = -9223372036854775807L;
        this.f84906o = -9223372036854775807L;
        this.f84904m = -9223372036854775807L;
    }

    public yd0(long j10, long j11, float f10) {
        this.f84892a = j10;
        this.f84893b = j11;
        this.f84894c = f10;
    }
}
