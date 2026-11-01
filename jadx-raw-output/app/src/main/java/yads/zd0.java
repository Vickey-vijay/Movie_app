package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class zd0 implements sf1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ib0 f85347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f85348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f85349c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f85350d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f85351e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f85352f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f85353g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f85354h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f85355i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f85356j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f85357k;

    public zd0() {
        this(new ib0(), 50000, 50000, 2500, 5000, -1, false);
    }

    public static void a(int i10, int i11, String str, String str2) {
        ni.a(str + " cannot be less than " + str2, i10 >= i11);
    }

    public zd0(ib0 ib0Var, int i10, int i11, int i12, int i13, int i14, boolean z10) {
        a(i12, 0, "bufferForPlaybackMs", "0");
        a(i13, 0, "bufferForPlaybackAfterRebufferMs", "0");
        a(i10, i12, "minBufferMs", "bufferForPlaybackMs");
        a(i10, i13, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        a(i11, i10, "maxBufferMs", "minBufferMs");
        a(0, 0, "backBufferDurationMs", "0");
        this.f85347a = ib0Var;
        this.f85348b = ib3.a(i10);
        this.f85349c = ib3.a(i11);
        this.f85350d = ib3.a(i12);
        this.f85351e = ib3.a(i13);
        this.f85352f = i14;
        this.f85356j = i14 == -1 ? 13107200 : i14;
        this.f85353g = z10;
        this.f85354h = ib3.a(0);
        this.f85355i = false;
    }

    public final long a() {
        return this.f85354h;
    }

    public final boolean b() {
        return this.f85355i;
    }

    public final void a(boolean z10) {
        int i10 = this.f85352f;
        if (i10 == -1) {
            i10 = 13107200;
        }
        this.f85356j = i10;
        this.f85357k = false;
        if (z10) {
            ib0 ib0Var = this.f85347a;
            synchronized (ib0Var) {
                if (ib0Var.f78545a) {
                    ib0Var.a(0);
                }
            }
        }
    }
}
