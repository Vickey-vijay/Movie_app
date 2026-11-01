package ll;

/* JADX INFO: compiled from: CachingPolicy.java */
/* JADX INFO: loaded from: classes8.dex */
public class c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c f63674h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c f63675i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final c f63676j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f63677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f63678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f63679c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f63680d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f63681e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f63682f = 20;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f63683g = 150;

    static {
        c cVar = new c(16, 0.3f, 0L, 50, 0.01f);
        f63674h = cVar;
        f63675i = new c(16, 0.5f, -1L, 50, 0.005f);
        f63676j = cVar;
    }

    public c(int i10, float f10, long j10, int i11, float f11) {
        this.f63678b = 0.3f;
        this.f63679c = 0L;
        this.f63680d = 0.01f;
        this.f63681e = 0;
        this.f63677a = i10;
        this.f63677a = 32;
        this.f63678b = f10;
        this.f63679c = j10;
        this.f63681e = i11;
        this.f63680d = f11;
    }
}
