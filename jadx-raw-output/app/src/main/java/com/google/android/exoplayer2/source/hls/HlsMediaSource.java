package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import e5.m;
import e5.q;
import java.io.IOException;
import java.util.List;
import k3.e0;
import k3.k;
import k4.b;
import k4.g;
import k4.j;
import k4.l0;
import k4.r;
import p4.e;
import p4.f;
import p4.i;
import q4.c;

/* JADX INFO: loaded from: classes.dex */
public final class HlsMediaSource extends b implements HlsPlaylistTracker.c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f f19555g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Uri f19556h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final e f19557i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final g f19558j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final com.google.android.exoplayer2.drm.a<?> f19559k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final m f19560l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f19561m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f19562n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f19563o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final HlsPlaylistTracker f19564p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public final Object f19565q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public q f19566r;

    public static final class Factory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e f19567a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public f f19568b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public q4.e f19569c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public List<StreamKey> f19570d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public HlsPlaylistTracker.a f19571e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public g f19572f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public com.google.android.exoplayer2.drm.a<?> f19573g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public m f19574h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f19575i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f19576j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f19577k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f19578l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @Nullable
        public Object f19579m;

        public Factory(com.google.android.exoplayer2.upstream.a.InterfaceC0188a interfaceC0188a) {
            this(new p4.b(interfaceC0188a));
        }

        public Factory(e eVar) {
            this.f19567a = (e) g5.a.e(eVar);
            this.f19569c = new q4.a();
            this.f19571e = com.google.android.exoplayer2.source.hls.playlist.a.f19588r;
            this.f19568b = f.f65914a;
            this.f19573g = com.google.android.exoplayer2.drm.a.a();
            this.f19574h = new com.google.android.exoplayer2.upstream.f();
            this.f19572f = new j();
            this.f19576j = 1;
        }

        public HlsMediaSource a(Uri uri) {
            this.f19578l = true;
            List<StreamKey> list = this.f19570d;
            if (list != null) {
                this.f19569c = new c(this.f19569c, list);
            }
            e eVar = this.f19567a;
            f fVar = this.f19568b;
            g gVar = this.f19572f;
            com.google.android.exoplayer2.drm.a<?> aVar = this.f19573g;
            m mVar = this.f19574h;
            return new HlsMediaSource(uri, eVar, fVar, gVar, aVar, mVar, this.f19571e.a(eVar, mVar, this.f19569c), this.f19575i, this.f19576j, this.f19577k, this.f19579m);
        }

        public Factory b(boolean z10) {
            g5.a.f(!this.f19578l);
            this.f19575i = z10;
            return this;
        }

        public Factory c(f fVar) {
            g5.a.f(!this.f19578l);
            this.f19568b = (f) g5.a.e(fVar);
            return this;
        }

        @Deprecated
        public Factory d(int i10) {
            g5.a.f(!this.f19578l);
            this.f19574h = new com.google.android.exoplayer2.upstream.f(i10);
            return this;
        }
    }

    @Override // k4.r
    public k4.q j(r.a aVar, e5.b bVar, long j10) {
        return new i(this.f19555g, this.f19564p, this.f19557i, this.f19566r, this.f19559k, this.f19560l, n(aVar), bVar, this.f19558j, this.f19561m, this.f19562n, this.f19563o);
    }

    static {
        e0.a("goog.exo.hls");
    }

    public HlsMediaSource(Uri uri, e eVar, f fVar, g gVar, com.google.android.exoplayer2.drm.a<?> aVar, m mVar, HlsPlaylistTracker hlsPlaylistTracker, boolean z10, int i10, boolean z11, @Nullable Object obj) {
        this.f19556h = uri;
        this.f19557i = eVar;
        this.f19555g = fVar;
        this.f19558j = gVar;
        this.f19559k = aVar;
        this.f19560l = mVar;
        this.f19564p = hlsPlaylistTracker;
        this.f19561m = z10;
        this.f19562n = i10;
        this.f19563o = z11;
        this.f19565q = obj;
    }

    @Override // k4.r
    public void c(k4.q qVar) {
        ((i) qVar).o();
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.c
    public void g(com.google.android.exoplayer2.source.hls.playlist.c cVar) {
        l0 l0Var;
        long j10;
        long jB = cVar.f19646m ? k.b(cVar.f19639f) : -9223372036854775807L;
        int i10 = cVar.f19637d;
        long j11 = (i10 == 2 || i10 == 1) ? jB : -9223372036854775807L;
        long j12 = cVar.f19638e;
        p4.g gVar = new p4.g((com.google.android.exoplayer2.source.hls.playlist.b) g5.a.e(this.f19564p.b()), cVar);
        if (this.f19564p.isLive()) {
            long initialStartTimeUs = cVar.f19639f - this.f19564p.getInitialStartTimeUs();
            long j13 = cVar.f19645l ? initialStartTimeUs + cVar.f19649p : -9223372036854775807L;
            List<com.google.android.exoplayer2.source.hls.playlist.c.a> list = cVar.f19648o;
            if (j12 != -9223372036854775807L) {
                j10 = j12;
            } else if (list.isEmpty()) {
                j10 = 0;
            } else {
                int iMax = Math.max(0, list.size() - 3);
                long j14 = cVar.f19649p - (cVar.f19644k * 2);
                while (iMax > 0 && list.get(iMax).f19655g > j14) {
                    iMax--;
                }
                j10 = list.get(iMax).f19655g;
            }
            l0Var = new l0(j11, jB, j13, cVar.f19649p, initialStartTimeUs, j10, true, !cVar.f19645l, true, gVar, this.f19565q);
        } else {
            long j15 = j12 == -9223372036854775807L ? 0L : j12;
            long j16 = cVar.f19649p;
            l0Var = new l0(j11, jB, j16, j16, 0L, j15, true, false, false, gVar, this.f19565q);
        }
        t(l0Var);
    }

    @Override // k4.r
    @Nullable
    public Object getTag() {
        return this.f19565q;
    }

    @Override // k4.r
    public void maybeThrowSourceInfoRefreshError() throws IOException {
        this.f19564p.maybeThrowPrimaryPlaylistRefreshError();
    }

    @Override // k4.b
    public void s(@Nullable q qVar) {
        this.f19566r = qVar;
        this.f19559k.prepare();
        this.f19564p.d(this.f19556h, n(null), this);
    }

    @Override // k4.b
    public void u() {
        this.f19564p.stop();
        this.f19559k.release();
    }
}
