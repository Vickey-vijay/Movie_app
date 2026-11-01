package com.google.android.exoplayer2.source.hls.playlist;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.g;
import e5.m;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import k3.k;
import k4.b0;
import p4.e;

/* JADX INFO: compiled from: DefaultHlsPlaylistTracker.java */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements HlsPlaylistTracker, Loader.b<g<q4.d>> {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final HlsPlaylistTracker.a f19588r = new HlsPlaylistTracker.a() { // from class: q4.b
        @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.a
        public final HlsPlaylistTracker a(p4.e eVar, m mVar, e eVar2) {
            return new com.google.android.exoplayer2.source.hls.playlist.a(eVar, mVar, eVar2);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f19589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q4.e f19590c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m f19591d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap<Uri, RunnableC0182a> f19592e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<HlsPlaylistTracker.b> f19593f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final double f19594g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public g.a<q4.d> f19595h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public b0.a f19596i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public Loader f19597j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public Handler f19598k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public HlsPlaylistTracker.c f19599l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public b f19600m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public Uri f19601n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public c f19602o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f19603p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f19604q;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.hls.playlist.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DefaultHlsPlaylistTracker.java */
    public final class RunnableC0182a implements Loader.b<g<q4.d>>, Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Uri f19605b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Loader f19606c = new Loader("DefaultHlsPlaylistTracker:MediaPlaylist");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final g<q4.d> f19607d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public c f19608e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f19609f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f19610g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public long f19611h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public long f19612i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f19613j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public IOException f19614k;

        @Override // com.google.android.exoplayer2.upstream.Loader.b
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public void f(g<q4.d> gVar, long j10, long j11, boolean z10) {
            a.this.f19596i.x(gVar.f20193a, gVar.d(), gVar.b(), 4, j10, j11, gVar.a());
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.b
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public void h(g<q4.d> gVar, long j10, long j11) {
            q4.d dVarC = gVar.c();
            if (!(dVarC instanceof c)) {
                this.f19614k = new ParserException("Loaded playlist has unexpected type.");
            } else {
                q((c) dVarC, j11);
                a.this.f19596i.A(gVar.f20193a, gVar.d(), gVar.b(), 4, j10, j11, gVar.a());
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f19613j = false;
            l();
        }

        public RunnableC0182a(Uri uri) {
            this.f19605b = uri;
            this.f19607d = new g<>(a.this.f19589b.createDataSource(4), uri, 4, a.this.f19595h);
        }

        @Nullable
        public c g() {
            return this.f19608e;
        }

        public boolean i() {
            int i10;
            if (this.f19608e == null) {
                return false;
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long jMax = Math.max(30000L, k.b(this.f19608e.f19649p));
            c cVar = this.f19608e;
            return cVar.f19645l || (i10 = cVar.f19637d) == 2 || i10 == 1 || this.f19609f + jMax > jElapsedRealtime;
        }

        public void j() {
            this.f19612i = 0L;
            if (this.f19613j || this.f19606c.i() || this.f19606c.h()) {
                return;
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (jElapsedRealtime >= this.f19611h) {
                l();
            } else {
                this.f19613j = true;
                a.this.f19598k.postDelayed(this, this.f19611h - jElapsedRealtime);
            }
        }

        public final void l() {
            long jM = this.f19606c.m(this.f19607d, this, a.this.f19591d.getMinimumLoadableRetryCount(this.f19607d.f20194b));
            b0.a aVar = a.this.f19596i;
            g<q4.d> gVar = this.f19607d;
            aVar.G(gVar.f20193a, gVar.f20194b, jM);
        }

        public void m() throws IOException {
            this.f19606c.maybeThrowError();
            IOException iOException = this.f19614k;
            if (iOException != null) {
                throw iOException;
            }
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.b
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public Loader.c k(g<q4.d> gVar, long j10, long j11, IOException iOException, int i10) {
            Loader.c cVarG;
            long jA = a.this.f19591d.a(gVar.f20194b, j11, iOException, i10);
            boolean z10 = jA != -9223372036854775807L;
            boolean zE = a.this.A(this.f19605b, jA) || !z10;
            if (z10) {
                zE |= e(jA);
            }
            if (zE) {
                long jB = a.this.f19591d.b(gVar.f20194b, j11, iOException, i10);
                cVarG = jB != -9223372036854775807L ? Loader.g(false, jB) : Loader.f20062g;
            } else {
                cVarG = Loader.f20061f;
            }
            a.this.f19596i.D(gVar.f20193a, gVar.d(), gVar.b(), 4, j10, j11, gVar.a(), iOException, !cVarG.c());
            return cVarG;
        }

        public final void q(c cVar, long j10) {
            c cVar2 = this.f19608e;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.f19609f = jElapsedRealtime;
            c cVarU = a.this.u(cVar2, cVar);
            this.f19608e = cVarU;
            if (cVarU != cVar2) {
                this.f19614k = null;
                this.f19610g = jElapsedRealtime;
                a.this.E(this.f19605b, cVarU);
            } else if (!cVarU.f19645l) {
                long size = cVar.f19642i + ((long) cVar.f19648o.size());
                c cVar3 = this.f19608e;
                if (size < cVar3.f19642i) {
                    this.f19614k = new HlsPlaylistTracker.PlaylistResetException(this.f19605b);
                    a.this.A(this.f19605b, -9223372036854775807L);
                } else if (jElapsedRealtime - this.f19610g > k.b(cVar3.f19644k) * a.this.f19594g) {
                    this.f19614k = new HlsPlaylistTracker.PlaylistStuckException(this.f19605b);
                    long jA = a.this.f19591d.a(4, j10, this.f19614k, 1);
                    a.this.A(this.f19605b, jA);
                    if (jA != -9223372036854775807L) {
                        e(jA);
                    }
                }
            }
            c cVar4 = this.f19608e;
            this.f19611h = jElapsedRealtime + k.b(cVar4 != cVar2 ? cVar4.f19644k : cVar4.f19644k / 2);
            if (!this.f19605b.equals(a.this.f19601n) || this.f19608e.f19645l) {
                return;
            }
            j();
        }

        public void r() {
            this.f19606c.k();
        }

        public final boolean e(long j10) {
            this.f19612i = SystemClock.elapsedRealtime() + j10;
            if (this.f19605b.equals(a.this.f19601n) && !a.this.y()) {
                return true;
            }
            return false;
        }
    }

    public a(e eVar, m mVar, q4.e eVar2) {
        this(eVar, mVar, eVar2, 3.5d);
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public void f(g<q4.d> gVar, long j10, long j11, boolean z10) {
        this.f19596i.x(gVar.f20193a, gVar.d(), gVar.b(), 4, j10, j11, gVar.a());
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public void h(g<q4.d> gVar, long j10, long j11) {
        q4.d dVarC = gVar.c();
        boolean z10 = dVarC instanceof c;
        b bVarD = z10 ? b.d(dVarC.f66517a) : (b) dVarC;
        this.f19600m = bVarD;
        this.f19595h = this.f19590c.a(bVarD);
        this.f19601n = bVarD.f19618e.get(0).f19631a;
        s(bVarD.f19617d);
        RunnableC0182a runnableC0182a = this.f19592e.get(this.f19601n);
        if (z10) {
            runnableC0182a.q((c) dVarC, j11);
        } else {
            runnableC0182a.j();
        }
        this.f19596i.A(gVar.f20193a, gVar.d(), gVar.b(), 4, j10, j11, gVar.a());
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public void stop() {
        this.f19601n = null;
        this.f19602o = null;
        this.f19600m = null;
        this.f19604q = -9223372036854775807L;
        this.f19597j.k();
        this.f19597j = null;
        Iterator<RunnableC0182a> it = this.f19592e.values().iterator();
        while (it.hasNext()) {
            it.next().r();
        }
        this.f19598k.removeCallbacksAndMessages(null);
        this.f19598k = null;
        this.f19592e.clear();
    }

    public a(e eVar, m mVar, q4.e eVar2, double d10) {
        this.f19589b = eVar;
        this.f19590c = eVar2;
        this.f19591d = mVar;
        this.f19594g = d10;
        this.f19593f = new ArrayList();
        this.f19592e = new HashMap<>();
        this.f19604q = -9223372036854775807L;
    }

    public static c.a t(c cVar, c cVar2) {
        int i10 = (int) (cVar2.f19642i - cVar.f19642i);
        List<c.a> list = cVar.f19648o;
        if (i10 < list.size()) {
            return list.get(i10);
        }
        return null;
    }

    public final boolean A(Uri uri, long j10) {
        int size = this.f19593f.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            z10 |= !this.f19593f.get(i10).b(uri, j10);
        }
        return z10;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public Loader.c k(g<q4.d> gVar, long j10, long j11, IOException iOException, int i10) {
        long jB = this.f19591d.b(gVar.f20194b, j11, iOException, i10);
        boolean z10 = jB == -9223372036854775807L;
        this.f19596i.D(gVar.f20193a, gVar.d(), gVar.b(), 4, j10, j11, gVar.a(), iOException, z10);
        return z10 ? Loader.f20062g : Loader.g(false, jB);
    }

    public final void E(Uri uri, c cVar) {
        if (uri.equals(this.f19601n)) {
            if (this.f19602o == null) {
                this.f19603p = !cVar.f19645l;
                this.f19604q = cVar.f19639f;
            }
            this.f19602o = cVar;
            this.f19599l.g(cVar);
        }
        int size = this.f19593f.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f19593f.get(i10).onPlaylistChanged();
        }
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public void a(HlsPlaylistTracker.b bVar) {
        this.f19593f.remove(bVar);
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    @Nullable
    public b b() {
        return this.f19600m;
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public void c(HlsPlaylistTracker.b bVar) {
        this.f19593f.add(bVar);
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public void d(Uri uri, b0.a aVar, HlsPlaylistTracker.c cVar) {
        this.f19598k = new Handler();
        this.f19596i = aVar;
        this.f19599l = cVar;
        g gVar = new g(this.f19589b.createDataSource(4), uri, 4, this.f19590c.createPlaylistParser());
        g5.a.f(this.f19597j == null);
        Loader loader = new Loader("DefaultHlsPlaylistTracker:MasterPlaylist");
        this.f19597j = loader;
        aVar.G(gVar.f20193a, gVar.f20194b, loader.m(gVar, this, this.f19591d.getMinimumLoadableRetryCount(gVar.f20194b)));
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public long getInitialStartTimeUs() {
        return this.f19604q;
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    @Nullable
    public c getPlaylistSnapshot(Uri uri, boolean z10) {
        c cVarG = this.f19592e.get(uri).g();
        if (cVarG != null && z10) {
            z(uri);
        }
        return cVarG;
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public boolean isLive() {
        return this.f19603p;
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public boolean isSnapshotValid(Uri uri) {
        return this.f19592e.get(uri).i();
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public void maybeThrowPlaylistRefreshError(Uri uri) throws IOException {
        this.f19592e.get(uri).m();
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public void maybeThrowPrimaryPlaylistRefreshError() throws IOException {
        Loader loader = this.f19597j;
        if (loader != null) {
            loader.maybeThrowError();
        }
        Uri uri = this.f19601n;
        if (uri != null) {
            maybeThrowPlaylistRefreshError(uri);
        }
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public void refreshPlaylist(Uri uri) {
        this.f19592e.get(uri).j();
    }

    public final int v(c cVar, c cVar2) {
        c.a aVarT;
        if (cVar2.f19640g) {
            return cVar2.f19641h;
        }
        c cVar3 = this.f19602o;
        int i10 = cVar3 != null ? cVar3.f19641h : 0;
        return (cVar == null || (aVarT = t(cVar, cVar2)) == null) ? i10 : (cVar.f19641h + aVarT.f19654f) - cVar2.f19648o.get(0).f19654f;
    }

    public final long w(c cVar, c cVar2) {
        if (cVar2.f19646m) {
            return cVar2.f19639f;
        }
        c cVar3 = this.f19602o;
        long j10 = cVar3 != null ? cVar3.f19639f : 0L;
        if (cVar == null) {
            return j10;
        }
        int size = cVar.f19648o.size();
        c.a aVarT = t(cVar, cVar2);
        if (aVarT != null) {
            return cVar.f19639f + aVarT.f19655g;
        }
        return ((long) size) == cVar2.f19642i - cVar.f19642i ? cVar.d() : j10;
    }

    public final boolean x(Uri uri) {
        List<b.C0183b> list = this.f19600m.f19618e;
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (uri.equals(list.get(i10).f19631a)) {
                return true;
            }
        }
        return false;
    }

    public final boolean y() {
        List<b.C0183b> list = this.f19600m.f19618e;
        int size = list.size();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        for (int i10 = 0; i10 < size; i10++) {
            RunnableC0182a runnableC0182a = this.f19592e.get(list.get(i10).f19631a);
            if (jElapsedRealtime > runnableC0182a.f19612i) {
                this.f19601n = runnableC0182a.f19605b;
                runnableC0182a.j();
                return true;
            }
        }
        return false;
    }

    public final void z(Uri uri) {
        if (uri.equals(this.f19601n) || !x(uri)) {
            return;
        }
        c cVar = this.f19602o;
        if (cVar == null || !cVar.f19645l) {
            this.f19601n = uri;
            this.f19592e.get(uri).j();
        }
    }

    public final void s(List<Uri> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Uri uri = list.get(i10);
            this.f19592e.put(uri, new RunnableC0182a(uri));
        }
    }

    public final c u(c cVar, c cVar2) {
        if (!cVar2.e(cVar)) {
            if (cVar2.f19645l) {
                return cVar.c();
            }
            return cVar;
        }
        return cVar2.b(w(cVar, cVar2), v(cVar, cVar2));
    }
}
