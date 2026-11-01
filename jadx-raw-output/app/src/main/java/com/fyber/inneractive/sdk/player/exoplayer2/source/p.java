package com.fyber.inneractive.sdk.player.exoplayer2.source;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import com.fyber.inneractive.sdk.player.controller.b0;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.UnknownHostException;

/* JADX INFO: loaded from: classes3.dex */
public final class p implements s, com.fyber.inneractive.sdk.player.exoplayer2.extractor.j, com.fyber.inneractive.sdk.player.exoplayer2.upstream.x, com.fyber.inneractive.sdk.player.exoplayer2.extractor.f {
    public boolean A;
    public long C;
    public int E;
    public boolean F;
    public boolean G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f17583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.h f17584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17585c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f17586d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b0 f17587e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f17588f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.b f17589g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final n f17592j;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public r f17598p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.q f17599q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f17600r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f17601s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f17602t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f17603u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f17604v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public z f17605w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f17606x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean[] f17607y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean[] f17608z;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f17590h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.b0 f17591i = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.b0("Loader:ExtractorMediaPeriod");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.e f17593k = new com.fyber.inneractive.sdk.player.exoplayer2.util.e();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final i f17594l = new i(this);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j f17595m = new j(this);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Handler f17596n = new Handler();
    public long D = -9223372036854775807L;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final SparseArray f17597o = new SparseArray();
    public long B = -1;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.z zVar, long j10, long j11, boolean z10) {
        m mVar = (m) zVar;
        if (this.B == -1) {
            this.B = mVar.f17576i;
        }
        if (z10 || this.f17604v <= 0) {
            return;
        }
        int size = this.f17597o.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.f17597o.valueAt(i10)).a(this.f17607y[i10]);
        }
        com.fyber.inneractive.sdk.player.exoplayer2.l lVar = (com.fyber.inneractive.sdk.player.exoplayer2.l) this.f17598p;
        lVar.getClass();
        lVar.f17407f.obtainMessage(9, this).sendToTarget();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.w
    public final boolean b(long j10) {
        boolean z10 = false;
        if (this.F || (this.f17601s && this.f17604v == 0)) {
            return false;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.util.e eVar = this.f17593k;
        synchronized (eVar) {
            if (!eVar.f17818a) {
                eVar.f17818a = true;
                eVar.notifyAll();
                z10 = true;
            }
        }
        if (this.f17591i.a()) {
            return z10;
        }
        i();
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.s
    public final long c() {
        long jMax;
        if (this.F) {
            return Long.MIN_VALUE;
        }
        long j10 = this.D;
        if (j10 != -9223372036854775807L) {
            return j10;
        }
        int i10 = 0;
        if (this.A) {
            jMax = Long.MAX_VALUE;
            int size = this.f17597o.size();
            while (i10 < size) {
                if (this.f17608z[i10]) {
                    jMax = Math.min(jMax, ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.f17597o.valueAt(i10)).d());
                }
                i10++;
            }
        } else {
            int size2 = this.f17597o.size();
            jMax = Long.MIN_VALUE;
            while (i10 < size2) {
                jMax = Math.max(jMax, ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.f17597o.valueAt(i10)).d());
                i10++;
            }
        }
        return jMax == Long.MIN_VALUE ? this.C : jMax;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.s
    public final void d() throws IOException {
        this.f17591i.b();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    public final void e() {
        this.f17596n.post(this.f17594l);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.w
    public final long f() {
        if (this.f17604v == 0) {
            return Long.MIN_VALUE;
        }
        return c();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.s
    public final long g() {
        if (!this.f17603u) {
            return -9223372036854775807L;
        }
        this.f17603u = false;
        return this.C;
    }

    public final int h() {
        int size = this.f17597o.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.e eVar = ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.f17597o.valueAt(i11)).f16506c;
            i10 += eVar.f16470j + eVar.f16469i;
        }
        return i10;
    }

    public final void i() {
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.q qVar;
        m mVar = new m(this, this.f17583a, this.f17584b, this.f17592j, this.f17593k);
        if (this.f17601s) {
            long j10 = this.D;
            if (j10 == -9223372036854775807L) {
                throw new IllegalStateException();
            }
            long j11 = this.f17606x;
            if (j11 != -9223372036854775807L && j10 >= j11) {
                this.F = true;
                this.D = -9223372036854775807L;
                return;
            }
            long jA = this.f17599q.a(j10);
            long j12 = this.D;
            mVar.f17572e.f17021a = jA;
            mVar.f17575h = j12;
            mVar.f17574g = true;
            this.D = -9223372036854775807L;
        }
        this.E = h();
        int i10 = this.f17585c;
        if (i10 == -1) {
            i10 = (this.f17601s && this.B == -1 && ((qVar = this.f17599q) == null || qVar.c() == -9223372036854775807L)) ? 6 : 3;
        }
        int i11 = i10;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.b0 b0Var = this.f17591i;
        b0Var.getClass();
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            throw new IllegalStateException();
        }
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.y yVar = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.y(b0Var, looperMyLooper, mVar, this, i11, SystemClock.elapsedRealtime());
        if (b0Var.f17655b != null) {
            throw new IllegalStateException();
        }
        b0Var.f17655b = yVar;
        yVar.f17806e = null;
        b0Var.f17654a.execute(yVar);
    }

    public p(Uri uri, com.fyber.inneractive.sdk.player.exoplayer2.upstream.h hVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.i[] iVarArr, int i10, Handler handler, b0 b0Var, t tVar, com.fyber.inneractive.sdk.player.exoplayer2.upstream.b bVar) {
        this.f17583a = uri;
        this.f17584b = hVar;
        this.f17585c = i10;
        this.f17586d = handler;
        this.f17587e = b0Var;
        this.f17588f = tVar;
        this.f17589g = bVar;
        this.f17592j = new n(iVarArr, this);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.z zVar, long j10, long j11) {
        m mVar = (m) zVar;
        if (this.B == -1) {
            this.B = mVar.f17576i;
        }
        this.F = true;
        if (this.f17606x == -9223372036854775807L) {
            int size = this.f17597o.size();
            long jMax = Long.MIN_VALUE;
            for (int i10 = 0; i10 < size; i10++) {
                jMax = Math.max(jMax, ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.f17597o.valueAt(i10)).d());
            }
            long j12 = jMax == Long.MIN_VALUE ? 0L : 10000 + jMax;
            this.f17606x = j12;
            this.f17588f.a(new x(j12, j12, 0L, 0L, this.f17599q.a(), false), null);
        }
        com.fyber.inneractive.sdk.player.exoplayer2.l lVar = (com.fyber.inneractive.sdk.player.exoplayer2.l) this.f17598p;
        lVar.getClass();
        lVar.f17407f.obtainMessage(9, this).sendToTarget();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.j
    public final void b() {
        this.f17600r = true;
        this.f17596n.post(this.f17594l);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.z zVar, long j10, long j11, IOException iOException) {
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.q qVar;
        m mVar = (m) zVar;
        if (this.B == -1) {
            this.B = mVar.f17576i;
        }
        Handler handler = this.f17586d;
        if (handler != null && this.f17587e != null) {
            handler.post(new l(this, iOException));
        }
        if ((iOException instanceof a0) || (iOException instanceof com.fyber.inneractive.sdk.player.exoplayer2.upstream.v) || ((iOException instanceof com.fyber.inneractive.sdk.player.exoplayer2.upstream.u) && iOException.getCause() != null && ((iOException.getCause() instanceof MalformedURLException) || (iOException.getCause() instanceof UnknownHostException)))) {
            return 3;
        }
        int i10 = h() > this.E ? 1 : 0;
        if (this.B == -1 && ((qVar = this.f17599q) == null || qVar.c() == -9223372036854775807L)) {
            this.C = 0L;
            this.f17603u = this.f17601s;
            int size = this.f17597o.size();
            for (int i11 = 0; i11 < size; i11++) {
                ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.f17597o.valueAt(i11)).a(!this.f17601s || this.f17607y[i11]);
            }
            mVar.f17572e.f17021a = 0L;
            mVar.f17575h = 0L;
            mVar.f17574g = true;
        }
        this.E = h();
        return i10;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.s
    public final void a(r rVar) {
        this.f17598p = rVar;
        com.fyber.inneractive.sdk.player.exoplayer2.util.e eVar = this.f17593k;
        synchronized (eVar) {
            if (!eVar.f17818a) {
                eVar.f17818a = true;
                eVar.notifyAll();
            }
        }
        i();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.s
    public final z a() {
        return this.f17605w;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.s
    public final long a(com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b[] bVarArr, boolean[] zArr, v[] vVarArr, boolean[] zArr2, long j10) {
        com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b bVar;
        if (this.f17601s) {
            for (int i10 = 0; i10 < bVarArr.length; i10++) {
                v vVar = vVarArr[i10];
                if (vVar != null && (bVarArr[i10] == null || !zArr[i10])) {
                    int i11 = ((o) vVar).f17581a;
                    boolean[] zArr3 = this.f17607y;
                    if (zArr3[i11]) {
                        this.f17604v--;
                        zArr3[i11] = false;
                        ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.f17597o.valueAt(i11)).b();
                        vVarArr[i10] = null;
                    } else {
                        throw new IllegalStateException();
                    }
                }
            }
            boolean z10 = false;
            for (int i12 = 0; i12 < bVarArr.length; i12++) {
                if (vVarArr[i12] == null && (bVar = bVarArr[i12]) != null) {
                    int[] iArr = bVar.f17638c;
                    if (iArr.length == 1) {
                        if (iArr[0] == 0) {
                            z zVar = this.f17605w;
                            y yVar = bVar.f17636a;
                            int i13 = 0;
                            while (true) {
                                if (i13 >= zVar.f17628a) {
                                    i13 = -1;
                                    break;
                                }
                                if (zVar.f17629b[i13] == yVar) {
                                    break;
                                }
                                i13++;
                            }
                            boolean[] zArr4 = this.f17607y;
                            if (!zArr4[i13]) {
                                this.f17604v++;
                                zArr4[i13] = true;
                                vVarArr[i12] = new o(this, i13);
                                zArr2[i12] = true;
                                z10 = true;
                            } else {
                                throw new IllegalStateException();
                            }
                        } else {
                            throw new IllegalStateException();
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                }
            }
            if (!this.f17602t) {
                int size = this.f17597o.size();
                for (int i14 = 0; i14 < size; i14++) {
                    if (!this.f17607y[i14]) {
                        ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.f17597o.valueAt(i14)).b();
                    }
                }
            }
            if (this.f17604v == 0) {
                this.f17603u = false;
                if (this.f17591i.a()) {
                    this.f17591i.f17655b.a(false);
                }
            } else if (!this.f17602t ? j10 != 0 : z10) {
                j10 = a(j10);
                for (int i15 = 0; i15 < vVarArr.length; i15++) {
                    if (vVarArr[i15] != null) {
                        zArr2[i15] = true;
                    }
                }
            }
            this.f17602t = true;
            return j10;
        }
        throw new IllegalStateException();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.s
    public final long a(long j10) {
        if (!this.f17599q.a()) {
            j10 = 0;
        }
        this.C = j10;
        int size = this.f17597o.size();
        boolean zA = !(this.D != -9223372036854775807L);
        for (int i10 = 0; zA && i10 < size; i10++) {
            if (this.f17607y[i10]) {
                zA = ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.f17597o.valueAt(i10)).a(false, j10);
            }
        }
        if (!zA) {
            this.D = j10;
            this.F = false;
            if (this.f17591i.a()) {
                this.f17591i.f17655b.a(false);
            } else {
                for (int i11 = 0; i11 < size; i11++) {
                    ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.f17597o.valueAt(i11)).a(this.f17607y[i11]);
                }
            }
        }
        this.f17603u = false;
        return j10;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.j
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a(int i10, int i11) {
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.f17597o.get(i10);
        if (gVar != null) {
            return gVar;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVar2 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.g(this.f17589g);
        gVar2.f16517n = this;
        this.f17597o.put(i10, gVar2);
        return gVar2;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.j
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.q qVar) {
        this.f17599q = qVar;
        this.f17596n.post(this.f17594l);
    }
}
