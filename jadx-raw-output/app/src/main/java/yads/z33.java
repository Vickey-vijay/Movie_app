package yads;

/* JADX INFO: loaded from: classes11.dex */
public abstract class z33 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m73 f85196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public pq0 f85197c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p92 f85198d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f85199e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f85200f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f85201g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f85202h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f85203i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f85205k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f85206l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f85207m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n92 f85195a = new n92();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public x33 f85204j = new x33();

    public abstract long a(jb2 jb2Var);

    public void a(long j10) {
        this.f85201g = j10;
    }

    public abstract boolean a(jb2 jb2Var, long j10, x33 x33Var);

    public void a(boolean z10) {
        if (z10) {
            this.f85204j = new x33();
            this.f85200f = 0L;
            this.f85202h = 0;
        } else {
            this.f85202h = 1;
        }
        this.f85199e = -1L;
        this.f85201g = 0L;
    }
}
