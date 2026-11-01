package k3;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.IllegalSeekPositionException;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.ironsource.C3426d4;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: ExoPlayerImpl.java */
/* JADX INFO: loaded from: classes8.dex */
public final class t extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c5.e f62241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p0[] f62242c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c5.d f62243d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f62244e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d0 f62245f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Handler f62246g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CopyOnWriteArrayList<d.a> f62247h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final v0.b f62248i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayDeque<Runnable> f62249j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public k4.r f62250k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f62251l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f62252m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f62253n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f62254o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f62255p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f62256q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f62257r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f62258s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public l0 f62259t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public t0 f62260u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public k0 f62261v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f62262w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f62263x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f62264y;

    /* JADX INFO: compiled from: ExoPlayerImpl.java */
    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            t.this.D(message);
        }
    }

    /* JADX INFO: compiled from: ExoPlayerImpl.java */
    public static final class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final k0 f62266b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CopyOnWriteArrayList<d.a> f62267c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final c5.d f62268d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f62269e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f62270f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f62271g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f62272h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final boolean f62273i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f62274j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final boolean f62275k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final boolean f62276l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final boolean f62277m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final boolean f62278n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final boolean f62279o;

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void i(n0.b bVar) {
            bVar.g(this.f62266b.f62195a, this.f62271g);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void j(n0.b bVar) {
            bVar.onPositionDiscontinuity(this.f62270f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void k(n0.b bVar) {
            bVar.b(this.f62266b.f62200f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void l(n0.b bVar) {
            k0 k0Var = this.f62266b;
            bVar.c(k0Var.f62202h, k0Var.f62203i.f5652c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void m(n0.b bVar) {
            bVar.onLoadingChanged(this.f62266b.f62201g);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void n(n0.b bVar) {
            bVar.onPlayerStateChanged(this.f62278n, this.f62266b.f62199e);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void o(n0.b bVar) {
            bVar.onIsPlayingChanged(this.f62266b.f62199e == 3);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f62275k || this.f62271g == 0) {
                t.G(this.f62267c, new d.b() { // from class: k3.u
                    @Override // k3.d.b
                    public final void a(n0.b bVar) {
                        this.f62287a.i(bVar);
                    }
                });
            }
            if (this.f62269e) {
                t.G(this.f62267c, new d.b() { // from class: k3.v
                    @Override // k3.d.b
                    public final void a(n0.b bVar) {
                        this.f62324a.j(bVar);
                    }
                });
            }
            if (this.f62274j) {
                t.G(this.f62267c, new d.b() { // from class: k3.w
                    @Override // k3.d.b
                    public final void a(n0.b bVar) {
                        this.f62346a.k(bVar);
                    }
                });
            }
            if (this.f62277m) {
                this.f62268d.d(this.f62266b.f62203i.f5653d);
                t.G(this.f62267c, new d.b() { // from class: k3.x
                    @Override // k3.d.b
                    public final void a(n0.b bVar) {
                        this.f62351a.l(bVar);
                    }
                });
            }
            if (this.f62276l) {
                t.G(this.f62267c, new d.b() { // from class: k3.y
                    @Override // k3.d.b
                    public final void a(n0.b bVar) {
                        this.f62356a.m(bVar);
                    }
                });
            }
            if (this.f62273i) {
                t.G(this.f62267c, new d.b() { // from class: k3.z
                    @Override // k3.d.b
                    public final void a(n0.b bVar) {
                        this.f62357a.n(bVar);
                    }
                });
            }
            if (this.f62279o) {
                t.G(this.f62267c, new d.b() { // from class: k3.a0
                    @Override // k3.d.b
                    public final void a(n0.b bVar) {
                        this.f62057a.o(bVar);
                    }
                });
            }
            if (this.f62272h) {
                t.G(this.f62267c, new d.b() { // from class: k3.b0
                    @Override // k3.d.b
                    public final void a(n0.b bVar) {
                        bVar.onSeekProcessed();
                    }
                });
            }
        }

        public b(k0 k0Var, k0 k0Var2, CopyOnWriteArrayList<d.a> copyOnWriteArrayList, c5.d dVar, boolean z10, int i10, int i11, boolean z11, boolean z12, boolean z13) {
            boolean z14;
            boolean z15;
            boolean z16;
            boolean z17;
            this.f62266b = k0Var;
            this.f62267c = new CopyOnWriteArrayList<>(copyOnWriteArrayList);
            this.f62268d = dVar;
            this.f62269e = z10;
            this.f62270f = i10;
            this.f62271g = i11;
            this.f62272h = z11;
            this.f62278n = z12;
            this.f62279o = z13;
            if (k0Var2.f62199e != k0Var.f62199e) {
                z14 = true;
            } else {
                z14 = false;
            }
            this.f62273i = z14;
            ExoPlaybackException exoPlaybackException = k0Var2.f62200f;
            ExoPlaybackException exoPlaybackException2 = k0Var.f62200f;
            if (exoPlaybackException != exoPlaybackException2 && exoPlaybackException2 != null) {
                z15 = true;
            } else {
                z15 = false;
            }
            this.f62274j = z15;
            if (k0Var2.f62195a != k0Var.f62195a) {
                z16 = true;
            } else {
                z16 = false;
            }
            this.f62275k = z16;
            if (k0Var2.f62201g != k0Var.f62201g) {
                z17 = true;
            } else {
                z17 = false;
            }
            this.f62276l = z17;
            this.f62277m = k0Var2.f62203i != k0Var.f62203i;
        }
    }

    @SuppressLint({"HandlerLeak"})
    public t(p0[] p0VarArr, c5.d dVar, g0 g0Var, e5.c cVar, g5.c cVar2, Looper looper) {
        g5.m.f("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.11.7] [" + g5.k0.f53112e + C3426d4.j.f28588e);
        g5.a.f(p0VarArr.length > 0);
        this.f62242c = (p0[]) g5.a.e(p0VarArr);
        this.f62243d = (c5.d) g5.a.e(dVar);
        this.f62251l = false;
        this.f62253n = 0;
        this.f62254o = false;
        this.f62247h = new CopyOnWriteArrayList<>();
        c5.e eVar = new c5.e(new r0[p0VarArr.length], new com.google.android.exoplayer2.trackselection.c[p0VarArr.length], null);
        this.f62241b = eVar;
        this.f62248i = new v0.b();
        this.f62259t = l0.f62208e;
        this.f62260u = t0.f62284g;
        this.f62252m = 0;
        a aVar = new a(looper);
        this.f62244e = aVar;
        this.f62261v = k0.h(0L, eVar);
        this.f62249j = new ArrayDeque<>();
        d0 d0Var = new d0(p0VarArr, dVar, eVar, g0Var, cVar, this.f62251l, this.f62253n, this.f62254o, aVar, cVar2);
        this.f62245f = d0Var;
        this.f62246g = new Handler(d0Var.r());
    }

    public final void W(k0 k0Var, boolean z10, int i10, int i11, boolean z11) {
        boolean zJ = j();
        k0 k0Var2 = this.f62261v;
        this.f62261v = k0Var;
        O(new b(k0Var, k0Var2, this.f62247h, this.f62243d, z10, i10, i11, z11, this.f62251l, zJ != j()));
    }

    @Override // k3.n0
    @Nullable
    public n0.c getTextComponent() {
        return null;
    }

    @Override // k3.n0
    @Nullable
    public n0.d getVideoComponent() {
        return null;
    }

    @Override // k3.n0
    public void setPlayWhenReady(boolean z10) {
        T(z10, 0);
    }

    public static /* synthetic */ void K(boolean z10, boolean z11, int i10, boolean z12, int i11, boolean z13, boolean z14, n0.b bVar) {
        if (z10) {
            bVar.onPlayerStateChanged(z11, i10);
        }
        if (z12) {
            bVar.onPlaybackSuppressionReasonChanged(i11);
        }
        if (z13) {
            bVar.onIsPlayingChanged(z14);
        }
    }

    public l0 A() {
        return this.f62259t;
    }

    public final k0 B(boolean z10, boolean z11, boolean z12, int i10) {
        if (z10) {
            this.f62262w = 0;
            this.f62263x = 0;
            this.f62264y = 0L;
        } else {
            this.f62262w = getCurrentWindowIndex();
            this.f62263x = y();
            this.f62264y = getCurrentPosition();
        }
        boolean z13 = z10 || z11;
        k4.r.a aVarI = z13 ? this.f62261v.i(this.f62254o, this.f62073a, this.f62248i) : this.f62261v.f62196b;
        long j10 = z13 ? 0L : this.f62261v.f62207m;
        return new k0(z11 ? v0.f62325a : this.f62261v.f62195a, aVarI, j10, z13 ? -9223372036854775807L : this.f62261v.f62198d, i10, z12 ? null : this.f62261v.f62200f, false, z11 ? TrackGroupArray.f19434e : this.f62261v.f62202h, z11 ? this.f62241b : this.f62261v.f62203i, aVarI, j10, 0L, j10);
    }

    public c5.d C() {
        return this.f62243d;
    }

    public void D(Message message) {
        int i10 = message.what;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException();
            }
            F((l0) message.obj, message.arg1 != 0);
        } else {
            k0 k0Var = (k0) message.obj;
            int i11 = message.arg1;
            int i12 = message.arg2;
            E(k0Var, i11, i12 != -1, i12);
        }
    }

    public final void E(k0 k0Var, int i10, boolean z10, int i11) {
        int i12 = this.f62255p - i10;
        this.f62255p = i12;
        if (i12 == 0) {
            if (k0Var.f62197c == -9223372036854775807L) {
                k0Var = k0Var.c(k0Var.f62196b, 0L, k0Var.f62198d, k0Var.f62206l);
            }
            k0 k0Var2 = k0Var;
            if (!this.f62261v.f62195a.q() && k0Var2.f62195a.q()) {
                this.f62263x = 0;
                this.f62262w = 0;
                this.f62264y = 0L;
            }
            int i13 = this.f62256q ? 0 : 2;
            boolean z11 = this.f62257r;
            this.f62256q = false;
            this.f62257r = false;
            W(k0Var2, z10, i11, i13, z11);
        }
    }

    public final void F(final l0 l0Var, boolean z10) {
        if (z10) {
            this.f62258s--;
        }
        if (this.f62258s != 0 || this.f62259t.equals(l0Var)) {
            return;
        }
        this.f62259t = l0Var;
        P(new d.b() { // from class: k3.q
            @Override // k3.d.b
            public final void a(n0.b bVar) {
                bVar.a(l0Var);
            }
        });
    }

    public final void O(Runnable runnable) {
        boolean z10 = !this.f62249j.isEmpty();
        this.f62249j.addLast(runnable);
        if (z10) {
            return;
        }
        while (!this.f62249j.isEmpty()) {
            this.f62249j.peekFirst().run();
            this.f62249j.removeFirst();
        }
    }

    public final void P(final d.b bVar) {
        final CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(this.f62247h);
        O(new Runnable() { // from class: k3.s
            @Override // java.lang.Runnable
            public final void run() {
                t.G(copyOnWriteArrayList, bVar);
            }
        });
    }

    public void R(k4.r rVar, boolean z10, boolean z11) {
        this.f62250k = rVar;
        k0 k0VarB = B(z10, z11, true, 2);
        this.f62256q = true;
        this.f62255p++;
        this.f62245f.N(rVar, z10, z11);
        W(k0VarB, false, 4, 1, false);
    }

    public void S() {
        g5.m.f("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.11.7] [" + g5.k0.f53112e + "] [" + e0.b() + C3426d4.j.f28588e);
        this.f62250k = null;
        this.f62245f.P();
        this.f62244e.removeCallbacksAndMessages(null);
        this.f62261v = B(false, false, false, 1);
    }

    public void U(@Nullable final l0 l0Var) {
        if (l0Var == null) {
            l0Var = l0.f62208e;
        }
        if (this.f62259t.equals(l0Var)) {
            return;
        }
        this.f62258s++;
        this.f62259t = l0Var;
        this.f62245f.m0(l0Var);
        P(new d.b() { // from class: k3.p
            @Override // k3.d.b
            public final void a(n0.b bVar) {
                bVar.a(l0Var);
            }
        });
    }

    public final boolean V() {
        return this.f62261v.f62195a.q() || this.f62255p > 0;
    }

    @Override // k3.n0
    public void d(n0.b bVar) {
        this.f62247h.addIfAbsent(new d.a(bVar));
    }

    @Override // k3.n0
    public void f(n0.b bVar) {
        for (d.a aVar : this.f62247h) {
            if (aVar.f62074a.equals(bVar)) {
                aVar.b();
                this.f62247h.remove(aVar);
            }
        }
    }

    @Override // k3.n0
    public v0 getCurrentTimeline() {
        return this.f62261v.f62195a;
    }

    @Override // k3.n0
    public TrackGroupArray getCurrentTrackGroups() {
        return this.f62261v.f62202h;
    }

    @Override // k3.n0
    public c5.c getCurrentTrackSelections() {
        return this.f62261v.f62203i.f5652c;
    }

    @Override // k3.n0
    public boolean getPlayWhenReady() {
        return this.f62251l;
    }

    @Override // k3.n0
    public int getPlaybackState() {
        return this.f62261v.f62199e;
    }

    @Override // k3.n0
    public int getPlaybackSuppressionReason() {
        return this.f62252m;
    }

    @Override // k3.n0
    public int getRendererType(int i10) {
        return this.f62242c[i10].getTrackType();
    }

    @Override // k3.n0
    public int getRepeatMode() {
        return this.f62253n;
    }

    @Override // k3.n0
    public boolean getShuffleModeEnabled() {
        return this.f62254o;
    }

    @Override // k3.n0
    public long getTotalBufferedDuration() {
        return k.b(this.f62261v.f62206l);
    }

    @Override // k3.n0
    public void seekTo(int i10, long j10) {
        v0 v0Var = this.f62261v.f62195a;
        if (i10 < 0 || (!v0Var.q() && i10 >= v0Var.p())) {
            throw new IllegalSeekPositionException(v0Var, i10, j10);
        }
        this.f62257r = true;
        this.f62255p++;
        if (isPlayingAd()) {
            g5.m.h("ExoPlayerImpl", "seekTo ignored because an ad is playing");
            this.f62244e.obtainMessage(0, 1, -1, this.f62261v).sendToTarget();
            return;
        }
        this.f62262w = i10;
        if (v0Var.q()) {
            this.f62264y = j10 == -9223372036854775807L ? 0L : j10;
            this.f62263x = 0;
        } else {
            long jB = j10 == -9223372036854775807L ? v0Var.n(i10, this.f62073a).b() : k.a(j10);
            Pair<Object, Long> pairJ = v0Var.j(this.f62073a, this.f62248i, i10, jB);
            this.f62264y = k.b(jB);
            this.f62263x = v0Var.b(pairJ.first);
        }
        this.f62245f.Z(v0Var, i10, k.a(j10));
        P(new d.b() { // from class: k3.m
            @Override // k3.d.b
            public final void a(n0.b bVar) {
                bVar.onPositionDiscontinuity(1);
            }
        });
    }

    @Override // k3.n0
    public void setRepeatMode(final int i10) {
        if (this.f62253n != i10) {
            this.f62253n = i10;
            this.f62245f.o0(i10);
            P(new d.b() { // from class: k3.r
                @Override // k3.d.b
                public final void a(n0.b bVar) {
                    bVar.onRepeatModeChanged(i10);
                }
            });
        }
    }

    @Override // k3.n0
    public void setShuffleModeEnabled(final boolean z10) {
        if (this.f62254o != z10) {
            this.f62254o = z10;
            this.f62245f.r0(z10);
            P(new d.b() { // from class: k3.o
                @Override // k3.d.b
                public final void a(n0.b bVar) {
                    bVar.onShuffleModeEnabledChanged(z10);
                }
            });
        }
    }

    @Override // k3.n0
    public void stop(boolean z10) {
        if (z10) {
            this.f62250k = null;
        }
        k0 k0VarB = B(z10, z10, z10, 1);
        this.f62255p++;
        this.f62245f.y0(z10);
        W(k0VarB, false, 4, 1, false);
    }

    public o0 v(o0.b bVar) {
        return new o0(this.f62245f, bVar, this.f62261v.f62195a, getCurrentWindowIndex(), this.f62246g);
    }

    public Looper w() {
        return this.f62244e.getLooper();
    }

    @Nullable
    public ExoPlaybackException z() {
        return this.f62261v.f62200f;
    }

    public static void G(CopyOnWriteArrayList<d.a> copyOnWriteArrayList, d.b bVar) {
        Iterator<d.a> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            it.next().a(bVar);
        }
    }

    public final long Q(k4.r.a aVar, long j10) {
        long jB = k.b(j10);
        this.f62261v.f62195a.h(aVar.f62602a, this.f62248i);
        return jB + this.f62248i.l();
    }

    public void T(final boolean z10, final int i10) {
        boolean z11;
        boolean z12;
        final boolean z13;
        final boolean z14;
        final boolean z15;
        boolean zJ = j();
        if (this.f62251l && this.f62252m == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 && i10 == 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z11 != z12) {
            this.f62245f.k0(z12);
        }
        if (this.f62251l != z10) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (this.f62252m != i10) {
            z14 = true;
        } else {
            z14 = false;
        }
        this.f62251l = z10;
        this.f62252m = i10;
        final boolean zJ2 = j();
        if (zJ != zJ2) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (z13 || z14 || z15) {
            final int i11 = this.f62261v.f62199e;
            P(new d.b() { // from class: k3.n
                @Override // k3.d.b
                public final void a(n0.b bVar) {
                    t.K(z13, z10, i11, z14, i10, z15, zJ2, bVar);
                }
            });
        }
    }

    @Override // k3.n0
    public long getBufferedPosition() {
        if (isPlayingAd()) {
            k0 k0Var = this.f62261v;
            if (k0Var.f62204j.equals(k0Var.f62196b)) {
                return k.b(this.f62261v.f62205k);
            }
            return getDuration();
        }
        return x();
    }

    @Override // k3.n0
    public long getContentPosition() {
        if (isPlayingAd()) {
            k0 k0Var = this.f62261v;
            k0Var.f62195a.h(k0Var.f62196b.f62602a, this.f62248i);
            k0 k0Var2 = this.f62261v;
            if (k0Var2.f62198d == -9223372036854775807L) {
                return k0Var2.f62195a.n(getCurrentWindowIndex(), this.f62073a).a();
            }
            return this.f62248i.l() + k.b(this.f62261v.f62198d);
        }
        return getCurrentPosition();
    }

    @Override // k3.n0
    public int getCurrentAdGroupIndex() {
        if (isPlayingAd()) {
            return this.f62261v.f62196b.f62603b;
        }
        return -1;
    }

    @Override // k3.n0
    public int getCurrentAdIndexInAdGroup() {
        if (isPlayingAd()) {
            return this.f62261v.f62196b.f62604c;
        }
        return -1;
    }

    @Override // k3.n0
    public long getCurrentPosition() {
        if (V()) {
            return this.f62264y;
        }
        if (this.f62261v.f62196b.b()) {
            return k.b(this.f62261v.f62207m);
        }
        k0 k0Var = this.f62261v;
        return Q(k0Var.f62196b, k0Var.f62207m);
    }

    @Override // k3.n0
    public int getCurrentWindowIndex() {
        if (V()) {
            return this.f62262w;
        }
        k0 k0Var = this.f62261v;
        return k0Var.f62195a.h(k0Var.f62196b.f62602a, this.f62248i).f62328c;
    }

    @Override // k3.n0
    public long getDuration() {
        if (isPlayingAd()) {
            k0 k0Var = this.f62261v;
            k4.r.a aVar = k0Var.f62196b;
            k0Var.f62195a.h(aVar.f62602a, this.f62248i);
            return k.b(this.f62248i.b(aVar.f62603b, aVar.f62604c));
        }
        return h();
    }

    @Override // k3.n0
    public boolean isPlayingAd() {
        if (!V() && this.f62261v.f62196b.b()) {
            return true;
        }
        return false;
    }

    public long x() {
        if (V()) {
            return this.f62264y;
        }
        k0 k0Var = this.f62261v;
        if (k0Var.f62204j.f62605d != k0Var.f62196b.f62605d) {
            return k0Var.f62195a.n(getCurrentWindowIndex(), this.f62073a).c();
        }
        long j10 = k0Var.f62205k;
        if (this.f62261v.f62204j.b()) {
            k0 k0Var2 = this.f62261v;
            v0.b bVarH = k0Var2.f62195a.h(k0Var2.f62204j.f62602a, this.f62248i);
            long jF = bVarH.f(this.f62261v.f62204j.f62603b);
            if (jF == Long.MIN_VALUE) {
                j10 = bVarH.f62329d;
            } else {
                j10 = jF;
            }
        }
        return Q(this.f62261v.f62204j, j10);
    }

    public int y() {
        if (V()) {
            return this.f62263x;
        }
        k0 k0Var = this.f62261v;
        return k0Var.f62195a.b(k0Var.f62196b.f62602a);
    }
}
