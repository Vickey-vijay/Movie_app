package ll;

import kl.m;

/* JADX INFO: compiled from: DrawingCache.java */
/* JADX INFO: loaded from: classes8.dex */
public class f implements m<g>, ml.c<f> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public f f63708c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f63709d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f63707b = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f63710e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f63706a = new g();

    @Override // kl.m
    public synchronized void c() {
        this.f63710e--;
    }

    @Override // kl.m
    public synchronized boolean g() {
        return this.f63710e > 0;
    }

    public synchronized void k() {
        this.f63710e++;
    }

    @Override // kl.m
    public int a() {
        return this.f63706a.f63716f;
    }

    @Override // kl.m
    public void destroy() {
        g gVar = this.f63706a;
        if (gVar != null) {
            gVar.c();
        }
        this.f63707b = 0;
        this.f63710e = 0;
    }

    @Override // ml.c
    public void e(boolean z10) {
        this.f63709d = z10;
    }

    @Override // ml.c
    public boolean f() {
        return this.f63709d;
    }

    public void h(int i10, int i11, int i12, boolean z10, int i13) {
        this.f63706a.a(i10, i11, i12, z10, i13);
        this.f63707b = this.f63706a.f63712b.getRowBytes() * this.f63706a.f63712b.getHeight();
    }

    @Override // kl.m
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public g get() {
        g gVar = this.f63706a;
        if (gVar.f63712b == null) {
            return null;
        }
        return gVar;
    }

    @Override // ml.c
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public f b() {
        return this.f63708c;
    }

    @Override // ml.c
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void d(f fVar) {
        this.f63708c = fVar;
    }

    @Override // kl.m
    public int size() {
        return this.f63707b;
    }

    @Override // kl.m
    public int width() {
        return this.f63706a.f63715e;
    }
}
