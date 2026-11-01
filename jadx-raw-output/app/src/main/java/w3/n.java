package w3;

import g5.t;
import java.io.IOException;

/* JADX INFO: compiled from: TrackFragment.java */
/* JADX INFO: loaded from: classes2.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f73468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f73469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f73470c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f73471d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f73472e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f73473f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long[] f73474g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int[] f73475h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f73476i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int[] f73477j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long[] f73478k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean[] f73479l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f73480m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean[] f73481n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public m f73482o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f73483p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public t f73484q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f73485r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f73486s;

    public void f() {
        this.f73472e = 0;
        this.f73486s = 0L;
        this.f73480m = false;
        this.f73485r = false;
        this.f73482o = null;
    }

    public void a(t tVar) {
        tVar.h(this.f73484q.f53154a, 0, this.f73483p);
        this.f73484q.L(0);
        this.f73485r = false;
    }

    public void b(q3.h hVar) throws InterruptedException, IOException {
        hVar.readFully(this.f73484q.f53154a, 0, this.f73483p);
        this.f73484q.L(0);
        this.f73485r = false;
    }

    public long c(int i10) {
        return this.f73478k[i10] + ((long) this.f73477j[i10]);
    }

    public void d(int i10) {
        t tVar = this.f73484q;
        if (tVar == null || tVar.d() < i10) {
            this.f73484q = new t(i10);
        }
        this.f73483p = i10;
        this.f73480m = true;
        this.f73485r = true;
    }

    public void e(int i10, int i11) {
        this.f73472e = i10;
        this.f73473f = i11;
        int[] iArr = this.f73475h;
        if (iArr == null || iArr.length < i10) {
            this.f73474g = new long[i10];
            this.f73475h = new int[i10];
        }
        int[] iArr2 = this.f73476i;
        if (iArr2 == null || iArr2.length < i11) {
            int i12 = (i11 * 125) / 100;
            this.f73476i = new int[i12];
            this.f73477j = new int[i12];
            this.f73478k = new long[i12];
            this.f73479l = new boolean[i12];
            this.f73481n = new boolean[i12];
        }
    }

    public boolean g(int i10) {
        return this.f73480m && this.f73481n[i10];
    }
}
