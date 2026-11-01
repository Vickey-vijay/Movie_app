package sg.bigo.ads.api.core;

/* JADX INFO: loaded from: classes2.dex */
public final class t {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f69430d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f69427a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f69428b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f69429c = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f69431e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f69432f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f69433g = "";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f69434h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f69435i = "";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f69437k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f69438l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f69439m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f69440n = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f69436j = false;

    public t(int i10) {
        this.f69430d = i10;
    }

    public final void a(int i10) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (i10 == 1) {
            if (this.f69437k <= 0) {
                this.f69437k = jCurrentTimeMillis;
            }
        } else if (i10 == 2) {
            if (this.f69438l <= 0) {
                this.f69438l = jCurrentTimeMillis;
            }
        } else {
            if (i10 != 3) {
                return;
            }
            if (this.f69439m <= 0) {
                this.f69439m = jCurrentTimeMillis;
            }
            if (this.f69440n <= 0) {
                this.f69440n = jCurrentTimeMillis;
            }
        }
    }

    public final void a(String str, String str2, boolean z10) {
        this.f69433g = str;
        this.f69435i = str2;
        this.f69434h = z10;
    }

    public final void b(int i10) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (i10 == 1) {
            if (this.f69428b <= 0) {
                long j10 = this.f69437k;
                if (j10 > 0) {
                    this.f69428b = jCurrentTimeMillis - j10;
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == 2) {
            this.f69436j = true;
            if (this.f69429c <= 0) {
                long j11 = this.f69438l;
                if (j11 > 0) {
                    this.f69429c = jCurrentTimeMillis - j11;
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == 3) {
            if (this.f69431e <= 0) {
                long j12 = this.f69439m;
                if (j12 > 0) {
                    this.f69431e = jCurrentTimeMillis - j12;
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == 4 && this.f69432f <= 0) {
            long j13 = this.f69440n;
            if (j13 > 0) {
                this.f69432f = jCurrentTimeMillis - j13;
            }
        }
    }
}
