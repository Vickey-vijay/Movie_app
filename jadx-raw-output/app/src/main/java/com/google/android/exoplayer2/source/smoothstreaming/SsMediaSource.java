package com.google.android.exoplayer2.source.smoothstreaming;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.f;
import com.google.android.exoplayer2.upstream.g;
import e5.m;
import e5.n;
import e5.q;
import h4.e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import k3.e0;
import k3.k;
import k4.b0;
import k4.j;
import k4.l0;
import k4.r;

/* JADX INFO: loaded from: classes4.dex */
public final class SsMediaSource extends k4.b implements Loader.b<g<com.google.android.exoplayer2.source.smoothstreaming.manifest.a>> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f19691g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Uri f19692h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final com.google.android.exoplayer2.upstream.a.InterfaceC0188a f19693i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b.a f19694j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final k4.g f19695k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final com.google.android.exoplayer2.drm.a<?> f19696l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final m f19697m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f19698n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final b0.a f19699o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final g.a<? extends com.google.android.exoplayer2.source.smoothstreaming.manifest.a> f19700p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ArrayList<c> f19701q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public final Object f19702r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public com.google.android.exoplayer2.upstream.a f19703s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Loader f19704t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public n f19705u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public q f19706v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f19707w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public com.google.android.exoplayer2.source.smoothstreaming.manifest.a f19708x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Handler f19709y;

    public static final class Factory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b.a f19710a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final com.google.android.exoplayer2.upstream.a.InterfaceC0188a f19711b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public g.a<? extends com.google.android.exoplayer2.source.smoothstreaming.manifest.a> f19712c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public List<StreamKey> f19713d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public k4.g f19714e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public com.google.android.exoplayer2.drm.a<?> f19715f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public m f19716g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public long f19717h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f19718i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @Nullable
        public Object f19719j;

        public Factory(com.google.android.exoplayer2.upstream.a.InterfaceC0188a interfaceC0188a) {
            this(new com.google.android.exoplayer2.source.smoothstreaming.a.C0184a(interfaceC0188a), interfaceC0188a);
        }

        public Factory(b.a aVar, @Nullable com.google.android.exoplayer2.upstream.a.InterfaceC0188a interfaceC0188a) {
            this.f19710a = (b.a) g5.a.e(aVar);
            this.f19711b = interfaceC0188a;
            this.f19715f = com.google.android.exoplayer2.drm.a.a();
            this.f19716g = new f();
            this.f19717h = 30000L;
            this.f19714e = new j();
        }

        public SsMediaSource a(Uri uri) {
            this.f19718i = true;
            if (this.f19712c == null) {
                this.f19712c = new SsManifestParser();
            }
            List<StreamKey> list = this.f19713d;
            if (list != null) {
                this.f19712c = new e(this.f19712c, list);
            }
            return new SsMediaSource(null, (Uri) g5.a.e(uri), this.f19711b, this.f19712c, this.f19710a, this.f19714e, this.f19715f, this.f19716g, this.f19717h, this.f19719j);
        }

        public Factory b(long j10) {
            g5.a.f(!this.f19718i);
            this.f19717h = j10;
            return this;
        }

        public Factory c(m mVar) {
            g5.a.f(!this.f19718i);
            this.f19716g = mVar;
            return this;
        }

        @Deprecated
        public Factory d(int i10) {
            return c(new f(i10));
        }
    }

    @Override // k4.r
    public void c(k4.q qVar) {
        ((c) qVar).j();
        this.f19701q.remove(qVar);
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void f(g<com.google.android.exoplayer2.source.smoothstreaming.manifest.a> gVar, long j10, long j11, boolean z10) {
        this.f19699o.x(gVar.f20193a, gVar.d(), gVar.b(), gVar.f20194b, j10, j11, gVar.a());
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(g<com.google.android.exoplayer2.source.smoothstreaming.manifest.a> gVar, long j10, long j11) {
        this.f19699o.A(gVar.f20193a, gVar.d(), gVar.b(), gVar.f20194b, j10, j11, gVar.a());
        this.f19708x = gVar.c();
        this.f19707w = j10 - j11;
        z();
        A();
    }

    static {
        e0.a("goog.exo.smoothstreaming");
    }

    public SsMediaSource(@Nullable com.google.android.exoplayer2.source.smoothstreaming.manifest.a aVar, @Nullable Uri uri, @Nullable com.google.android.exoplayer2.upstream.a.InterfaceC0188a interfaceC0188a, @Nullable g.a<? extends com.google.android.exoplayer2.source.smoothstreaming.manifest.a> aVar2, b.a aVar3, k4.g gVar, com.google.android.exoplayer2.drm.a<?> aVar4, m mVar, long j10, @Nullable Object obj) {
        g5.a.f(aVar == null || !aVar.f19780d);
        this.f19708x = aVar;
        this.f19692h = uri == null ? null : s4.a.a(uri);
        this.f19693i = interfaceC0188a;
        this.f19700p = aVar2;
        this.f19694j = aVar3;
        this.f19695k = gVar;
        this.f19696l = aVar4;
        this.f19697m = mVar;
        this.f19698n = j10;
        this.f19699o = n(null);
        this.f19702r = obj;
        this.f19691g = aVar != null;
        this.f19701q = new ArrayList<>();
    }

    public final void A() {
        if (this.f19708x.f19780d) {
            this.f19709y.postDelayed(new Runnable() { // from class: r4.a
                @Override // java.lang.Runnable
                public final void run() {
                    this.f66704b.B();
                }
            }, Math.max(0L, (this.f19707w + 5000) - SystemClock.elapsedRealtime()));
        }
    }

    public final void B() {
        if (this.f19704t.h()) {
            return;
        }
        g gVar = new g(this.f19703s, this.f19692h, 4, this.f19700p);
        this.f19699o.G(gVar.f20193a, gVar.f20194b, this.f19704t.m(gVar, this, this.f19697m.getMinimumLoadableRetryCount(gVar.f20194b)));
    }

    @Override // k4.r
    @Nullable
    public Object getTag() {
        return this.f19702r;
    }

    @Override // k4.r
    public void maybeThrowSourceInfoRefreshError() throws IOException {
        this.f19705u.maybeThrowError();
    }

    @Override // k4.b
    public void s(@Nullable q qVar) {
        this.f19706v = qVar;
        this.f19696l.prepare();
        if (this.f19691g) {
            this.f19705u = new n.a();
            z();
            return;
        }
        this.f19703s = this.f19693i.createDataSource();
        Loader loader = new Loader("Loader:Manifest");
        this.f19704t = loader;
        this.f19705u = loader;
        this.f19709y = new Handler();
        B();
    }

    @Override // k4.b
    public void u() {
        this.f19708x = this.f19691g ? this.f19708x : null;
        this.f19703s = null;
        this.f19707w = 0L;
        Loader loader = this.f19704t;
        if (loader != null) {
            loader.k();
            this.f19704t = null;
        }
        Handler handler = this.f19709y;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f19709y = null;
        }
        this.f19696l.release();
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public Loader.c k(g<com.google.android.exoplayer2.source.smoothstreaming.manifest.a> gVar, long j10, long j11, IOException iOException, int i10) {
        long jB = this.f19697m.b(4, j11, iOException, i10);
        Loader.c cVarG = jB == -9223372036854775807L ? Loader.f20062g : Loader.g(false, jB);
        this.f19699o.D(gVar.f20193a, gVar.d(), gVar.b(), gVar.f20194b, j10, j11, gVar.a(), iOException, !cVarG.c());
        return cVarG;
    }

    public final void z() {
        l0 l0Var;
        for (int i10 = 0; i10 < this.f19701q.size(); i10++) {
            this.f19701q.get(i10).k(this.f19708x);
        }
        long jMax = Long.MIN_VALUE;
        long jMax2 = Long.MAX_VALUE;
        for (com.google.android.exoplayer2.source.smoothstreaming.manifest.a.b bVar : this.f19708x.f19782f) {
            if (bVar.f19798k > 0) {
                jMax2 = Math.min(jMax2, bVar.e(0));
                jMax = Math.max(jMax, bVar.e(bVar.f19798k - 1) + bVar.c(bVar.f19798k - 1));
            }
        }
        if (jMax2 == Long.MAX_VALUE) {
            long j10 = this.f19708x.f19780d ? -9223372036854775807L : 0L;
            com.google.android.exoplayer2.source.smoothstreaming.manifest.a aVar = this.f19708x;
            boolean z10 = aVar.f19780d;
            l0Var = new l0(j10, 0L, 0L, 0L, true, z10, z10, aVar, this.f19702r);
        } else {
            com.google.android.exoplayer2.source.smoothstreaming.manifest.a aVar2 = this.f19708x;
            if (aVar2.f19780d) {
                long j11 = aVar2.f19784h;
                if (j11 != -9223372036854775807L && j11 > 0) {
                    jMax2 = Math.max(jMax2, jMax - j11);
                }
                long j12 = jMax2;
                long j13 = jMax - j12;
                long jA = j13 - k.a(this.f19698n);
                if (jA < 5000000) {
                    jA = Math.min(5000000L, j13 / 2);
                }
                l0Var = new l0(-9223372036854775807L, j13, j12, jA, true, true, true, this.f19708x, this.f19702r);
            } else {
                long j14 = aVar2.f19783g;
                long j15 = j14 != -9223372036854775807L ? j14 : jMax - jMax2;
                l0Var = new l0(jMax2 + j15, j15, jMax2, 0L, true, false, false, this.f19708x, this.f19702r);
            }
        }
        t(l0Var);
    }

    @Override // k4.r
    public k4.q j(r.a aVar, e5.b bVar, long j10) {
        c cVar = new c(this.f19708x, this.f19694j, this.f19706v, this.f19695k, this.f19696l, this.f19697m, n(aVar), this.f19705u, bVar);
        this.f19701q.add(cVar);
        return cVar;
    }
}
