package k3;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroupArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: ExoPlayerImplInternal.java */
/* JADX INFO: loaded from: classes2.dex */
public final class d0 implements Handler.Callback, k4.q.a, c5.d.a, k4.r.b, i.a, o0.a {
    public boolean A;
    public int B;
    public boolean C;
    public boolean D;
    public int E;
    public e F;
    public long G;
    public int H;
    public boolean I;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p0[] f62076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q0[] f62077c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c5.d f62078d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c5.e f62079e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g0 f62080f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e5.c f62081g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g5.l f62082h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final HandlerThread f62083i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Handler f62084j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final v0.c f62085k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final v0.b f62086l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f62087m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f62088n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final i f62089o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ArrayList<c> f62091q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final g5.c f62092r;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public k0 f62095u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public k4.r f62096v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public p0[] f62097w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f62098x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f62099y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f62100z;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j0 f62093s = new j0();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public t0 f62094t = t0.f62284g;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f62090p = new d();

    /* JADX INFO: compiled from: ExoPlayerImplInternal.java */
    public static final class c implements Comparable<c> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final o0 f62103b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f62104c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f62105d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public Object f62106e;

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            Object obj = this.f62106e;
            if ((obj == null) != (cVar.f62106e == null)) {
                return obj != null ? -1 : 1;
            }
            if (obj == null) {
                return 0;
            }
            int i10 = this.f62104c - cVar.f62104c;
            return i10 != 0 ? i10 : g5.k0.o(this.f62105d, cVar.f62105d);
        }

        public void b(int i10, long j10, Object obj) {
            this.f62104c = i10;
            this.f62105d = j10;
            this.f62106e = obj;
        }

        public c(o0 o0Var) {
            this.f62103b = o0Var;
        }
    }

    /* JADX INFO: compiled from: ExoPlayerImplInternal.java */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public k0 f62107a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f62108b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f62109c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f62110d;

        public d() {
        }

        public boolean d(k0 k0Var) {
            return k0Var != this.f62107a || this.f62108b > 0 || this.f62109c;
        }

        public void e(int i10) {
            this.f62108b += i10;
        }

        public void f(k0 k0Var) {
            this.f62107a = k0Var;
            this.f62108b = 0;
            this.f62109c = false;
        }

        public void g(int i10) {
            if (this.f62109c && this.f62110d != 4) {
                g5.a.a(i10 == 4);
            } else {
                this.f62109c = true;
                this.f62110d = i10;
            }
        }
    }

    public static Format[] o(com.google.android.exoplayer2.trackselection.c cVar) {
        int length = cVar != null ? cVar.length() : 0;
        Format[] formatArr = new Format[length];
        for (int i10 = 0; i10 < length; i10++) {
            formatArr[i10] = cVar.getFormat(i10);
        }
        return formatArr;
    }

    public final void J() throws ExoPlaybackException {
        boolean z10 = false;
        while (u0()) {
            if (z10) {
                F();
            }
            h0 h0VarN = this.f62093s.n();
            if (h0VarN == this.f62093s.o()) {
                i0();
            }
            h0 h0VarA = this.f62093s.a();
            F0(h0VarN);
            i0 i0Var = h0VarA.f62148f;
            this.f62095u = g(i0Var.f62163a, i0Var.f62164b, i0Var.f62165c);
            this.f62090p.g(h0VarN.f62148f.f62168f ? 0 : 3);
            E0();
            z10 = true;
        }
    }

    public synchronized void P() {
        if (!this.f62098x && this.f62083i.isAlive()) {
            this.f62082h.sendEmptyMessage(7);
            boolean z10 = false;
            while (!this.f62098x) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z10 = true;
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public final void Q() {
        S(true, true, true, true, false);
        this.f62080f.onReleased();
        t0(1);
        this.f62083i.quit();
        synchronized (this) {
            this.f62098x = true;
            notifyAll();
        }
    }

    @Override // k3.i.a
    public void a(l0 l0Var) {
        h0(l0Var, false);
    }

    @Override // k3.o0.a
    public synchronized void b(o0 o0Var) {
        if (!this.f62098x && this.f62083i.isAlive()) {
            this.f62082h.obtainMessage(15, o0Var).sendToTarget();
            return;
        }
        g5.m.h("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        o0Var.j(false);
    }

    public final k0 g(k4.r.a aVar, long j10, long j11) {
        this.I = true;
        return this.f62095u.c(aVar, j10, j11, s());
    }

    public final void l0(boolean z10) throws ExoPlaybackException {
        this.f62100z = false;
        this.f62099y = z10;
        if (!z10) {
            A0();
            E0();
            return;
        }
        int i10 = this.f62095u.f62199e;
        if (i10 == 3) {
            x0();
            this.f62082h.sendEmptyMessage(2);
        } else if (i10 == 2) {
            this.f62082h.sendEmptyMessage(2);
        }
    }

    public final void x0() throws ExoPlaybackException {
        this.f62100z = false;
        this.f62089o.f();
        for (p0 p0Var : this.f62097w) {
            p0Var.start();
        }
    }

    public final void z0(boolean z10, boolean z11, boolean z12) {
        S(z10 || !this.D, true, z11, z11, z11);
        this.f62090p.e(this.E + (z12 ? 1 : 0));
        this.E = 0;
        this.f62080f.onStopped();
        t0(1);
    }

    /* JADX INFO: compiled from: ExoPlayerImplInternal.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k4.r f62101a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final v0 f62102b;

        public b(k4.r rVar, v0 v0Var) {
            this.f62101a = rVar;
            this.f62102b = v0Var;
        }
    }

    /* JADX INFO: compiled from: ExoPlayerImplInternal.java */
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final v0 f62111a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f62112b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f62113c;

        public e(v0 v0Var, int i10, long j10) {
            this.f62111a = v0Var;
            this.f62112b = i10;
            this.f62113c = j10;
        }
    }

    public final boolean A() {
        h0 h0VarO = this.f62093s.o();
        if (!h0VarO.f62146d) {
            return false;
        }
        int i10 = 0;
        while (true) {
            p0[] p0VarArr = this.f62076b;
            if (i10 >= p0VarArr.length) {
                return true;
            }
            p0 p0Var = p0VarArr[i10];
            k4.i0 i0Var = h0VarO.f62145c[i10];
            if (p0Var.getStream() != i0Var || (i0Var != null && !p0Var.hasReadStreamToEnd())) {
                return false;
            }
            i10++;
        }
    }

    public final void A0() throws ExoPlaybackException {
        this.f62089o.g();
        for (p0 p0Var : this.f62097w) {
            m(p0Var);
        }
    }

    public final boolean B() {
        h0 h0VarI = this.f62093s.i();
        return (h0VarI == null || h0VarI.k() == Long.MIN_VALUE) ? false : true;
    }

    public final void B0() {
        h0 h0VarI = this.f62093s.i();
        boolean z10 = this.A || (h0VarI != null && h0VarI.f62143a.isLoading());
        k0 k0Var = this.f62095u;
        if (z10 != k0Var.f62201g) {
            this.f62095u = k0Var.a(z10);
        }
    }

    public final boolean C() {
        h0 h0VarN = this.f62093s.n();
        long j10 = h0VarN.f62148f.f62167e;
        return h0VarN.f62146d && (j10 == -9223372036854775807L || this.f62095u.f62207m < j10);
    }

    public final void C0(TrackGroupArray trackGroupArray, c5.e eVar) {
        this.f62080f.a(this.f62076b, trackGroupArray, eVar.f5652c);
    }

    public final void D0() throws ExoPlaybackException, IOException {
        k4.r rVar = this.f62096v;
        if (rVar == null) {
            return;
        }
        if (this.E > 0) {
            rVar.maybeThrowSourceInfoRefreshError();
            return;
        }
        I();
        K();
        J();
    }

    public final void E0() throws ExoPlaybackException {
        h0 h0VarN = this.f62093s.n();
        if (h0VarN == null) {
            return;
        }
        long discontinuity = h0VarN.f62146d ? h0VarN.f62143a.readDiscontinuity() : -9223372036854775807L;
        if (discontinuity != -9223372036854775807L) {
            T(discontinuity);
            if (discontinuity != this.f62095u.f62207m) {
                k0 k0Var = this.f62095u;
                this.f62095u = g(k0Var.f62196b, discontinuity, k0Var.f62198d);
                this.f62090p.g(4);
            }
        } else {
            long jH = this.f62089o.h(h0VarN != this.f62093s.o());
            this.G = jH;
            long jY = h0VarN.y(jH);
            H(this.f62095u.f62207m, jY);
            this.f62095u.f62207m = jY;
        }
        this.f62095u.f62205k = this.f62093s.i().i();
        this.f62095u.f62206l = s();
    }

    public final void F() {
        if (this.f62090p.d(this.f62095u)) {
            this.f62084j.obtainMessage(0, this.f62090p.f62108b, this.f62090p.f62109c ? this.f62090p.f62110d : -1, this.f62095u).sendToTarget();
            this.f62090p.f(this.f62095u);
        }
    }

    public final void F0(@Nullable h0 h0Var) throws ExoPlaybackException {
        h0 h0VarN = this.f62093s.n();
        if (h0VarN == null || h0Var == h0VarN) {
            return;
        }
        boolean[] zArr = new boolean[this.f62076b.length];
        int i10 = 0;
        int i11 = 0;
        while (true) {
            p0[] p0VarArr = this.f62076b;
            if (i10 >= p0VarArr.length) {
                this.f62095u = this.f62095u.g(h0VarN.n(), h0VarN.o());
                l(zArr, i11);
                return;
            }
            p0 p0Var = p0VarArr[i10];
            zArr[i10] = p0Var.getState() != 0;
            if (h0VarN.o().c(i10)) {
                i11++;
            }
            if (zArr[i10] && (!h0VarN.o().c(i10) || (p0Var.isCurrentStreamFinal() && p0Var.getStream() == h0Var.f62145c[i10]))) {
                i(p0Var);
            }
            i10++;
        }
    }

    public final void G() throws IOException {
        if (this.f62093s.i() != null) {
            for (p0 p0Var : this.f62097w) {
                if (!p0Var.hasReadStreamToEnd()) {
                    return;
                }
            }
        }
        this.f62096v.maybeThrowSourceInfoRefreshError();
    }

    public final void G0(float f10) {
        for (h0 h0VarN = this.f62093s.n(); h0VarN != null; h0VarN = h0VarN.j()) {
            for (com.google.android.exoplayer2.trackselection.c cVar : h0VarN.o().f5652c.b()) {
                if (cVar != null) {
                    cVar.onPlaybackSpeed(f10);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x004b, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x007a, code lost:
    
        r3 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void H(long r8, long r10) throws com.google.android.exoplayer2.ExoPlaybackException {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k3.d0.H(long, long):void");
    }

    public final void I() throws ExoPlaybackException, IOException {
        this.f62093s.t(this.G);
        if (this.f62093s.z()) {
            i0 i0VarM = this.f62093s.m(this.G, this.f62095u);
            if (i0VarM == null) {
                G();
            } else {
                h0 h0VarF = this.f62093s.f(this.f62077c, this.f62078d, this.f62080f.getAllocator(), this.f62096v, i0VarM, this.f62079e);
                h0VarF.f62143a.c(this, i0VarM.f62164b);
                if (this.f62093s.n() == h0VarF) {
                    T(h0VarF.m());
                }
                v(false);
            }
        }
        if (!this.A) {
            E();
        } else {
            this.A = B();
            B0();
        }
    }

    public final void K() throws ExoPlaybackException {
        h0 h0VarO = this.f62093s.o();
        if (h0VarO == null) {
            return;
        }
        int i10 = 0;
        if (h0VarO.j() == null) {
            if (!h0VarO.f62148f.f62169g) {
                return;
            }
            while (true) {
                p0[] p0VarArr = this.f62076b;
                if (i10 >= p0VarArr.length) {
                    return;
                }
                p0 p0Var = p0VarArr[i10];
                k4.i0 i0Var = h0VarO.f62145c[i10];
                if (i0Var != null && p0Var.getStream() == i0Var && p0Var.hasReadStreamToEnd()) {
                    p0Var.setCurrentStreamFinal();
                }
                i10++;
            }
        } else {
            if (!A() || !h0VarO.j().f62146d) {
                return;
            }
            c5.e eVarO = h0VarO.o();
            h0 h0VarB = this.f62093s.b();
            c5.e eVarO2 = h0VarB.o();
            if (h0VarB.f62143a.readDiscontinuity() != -9223372036854775807L) {
                i0();
                return;
            }
            int i11 = 0;
            while (true) {
                p0[] p0VarArr2 = this.f62076b;
                if (i11 >= p0VarArr2.length) {
                    return;
                }
                p0 p0Var2 = p0VarArr2[i11];
                if (eVarO.c(i11) && !p0Var2.isCurrentStreamFinal()) {
                    com.google.android.exoplayer2.trackselection.c cVarA = eVarO2.f5652c.a(i11);
                    boolean zC = eVarO2.c(i11);
                    boolean z10 = this.f62077c[i11].getTrackType() == 6;
                    r0 r0Var = eVarO.f5651b[i11];
                    r0 r0Var2 = eVarO2.f5651b[i11];
                    if (zC && r0Var2.equals(r0Var) && !z10) {
                        p0Var2.e(o(cVarA), h0VarB.f62145c[i11], h0VarB.l());
                    } else {
                        p0Var2.setCurrentStreamFinal();
                    }
                }
                i11++;
            }
        }
    }

    public final void L() {
        for (h0 h0VarN = this.f62093s.n(); h0VarN != null; h0VarN = h0VarN.j()) {
            for (com.google.android.exoplayer2.trackselection.c cVar : h0VarN.o().f5652c.b()) {
                if (cVar != null) {
                    cVar.onDiscontinuity();
                }
            }
        }
    }

    @Override // k4.j0.a
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public void e(k4.q qVar) {
        this.f62082h.obtainMessage(10, qVar).sendToTarget();
    }

    public void N(k4.r rVar, boolean z10, boolean z11) {
        this.f62082h.obtainMessage(0, z10 ? 1 : 0, z11 ? 1 : 0, rVar).sendToTarget();
    }

    public final void O(k4.r rVar, boolean z10, boolean z11) {
        this.E++;
        S(false, true, z10, z11, true);
        this.f62080f.onPrepared();
        this.f62096v = rVar;
        t0(2);
        rVar.e(this, this.f62081g.getTransferListener());
        this.f62082h.sendEmptyMessage(2);
    }

    public final void R() throws ExoPlaybackException {
        float f10 = this.f62089o.getPlaybackParameters().f62209a;
        h0 h0VarO = this.f62093s.o();
        boolean z10 = true;
        for (h0 h0VarN = this.f62093s.n(); h0VarN != null && h0VarN.f62146d; h0VarN = h0VarN.j()) {
            c5.e eVarV = h0VarN.v(f10, this.f62095u.f62195a);
            if (!eVarV.a(h0VarN.o())) {
                if (z10) {
                    h0 h0VarN2 = this.f62093s.n();
                    boolean zU = this.f62093s.u(h0VarN2);
                    boolean[] zArr = new boolean[this.f62076b.length];
                    long jB = h0VarN2.b(eVarV, this.f62095u.f62207m, zU, zArr);
                    k0 k0Var = this.f62095u;
                    if (k0Var.f62199e != 4 && jB != k0Var.f62207m) {
                        k0 k0Var2 = this.f62095u;
                        this.f62095u = g(k0Var2.f62196b, jB, k0Var2.f62198d);
                        this.f62090p.g(4);
                        T(jB);
                    }
                    boolean[] zArr2 = new boolean[this.f62076b.length];
                    int i10 = 0;
                    int i11 = 0;
                    while (true) {
                        p0[] p0VarArr = this.f62076b;
                        if (i10 >= p0VarArr.length) {
                            break;
                        }
                        p0 p0Var = p0VarArr[i10];
                        boolean z11 = p0Var.getState() != 0;
                        zArr2[i10] = z11;
                        k4.i0 i0Var = h0VarN2.f62145c[i10];
                        if (i0Var != null) {
                            i11++;
                        }
                        if (z11) {
                            if (i0Var != p0Var.getStream()) {
                                i(p0Var);
                            } else if (zArr[i10]) {
                                p0Var.resetPosition(this.G);
                            }
                        }
                        i10++;
                    }
                    this.f62095u = this.f62095u.g(h0VarN2.n(), h0VarN2.o());
                    l(zArr2, i11);
                } else {
                    this.f62093s.u(h0VarN);
                    if (h0VarN.f62146d) {
                        h0VarN.a(eVarV, Math.max(h0VarN.f62148f.f62164b, h0VarN.y(this.G)), false);
                    }
                }
                v(true);
                if (this.f62095u.f62199e != 4) {
                    E();
                    E0();
                    this.f62082h.sendEmptyMessage(2);
                    return;
                }
                return;
            }
            if (h0VarN == h0VarO) {
                z10 = false;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0093  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a6 A[LOOP:2: B:36:0x00a0->B:38:0x00a6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:41:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:49:0x00df  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:53:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:61:0x0102  */
    /* JADX WARN: Code duplicated, block: B:64:0x0108  */
    /* JADX WARN: Code duplicated, block: B:65:0x010b  */
    public final void S(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        boolean z15;
        k4.r.a aVarI;
        long j10;
        v0 v0Var;
        k0 k0Var;
        ExoPlaybackException exoPlaybackException;
        TrackGroupArray trackGroupArray;
        c5.e eVar;
        k4.r rVar;
        Iterator<c> it;
        this.f62082h.removeMessages(2);
        this.f62100z = false;
        this.f62089o.g();
        this.G = 0L;
        for (p0 p0Var : this.f62097w) {
            try {
                i(p0Var);
            } catch (ExoPlaybackException | RuntimeException e10) {
                g5.m.d("ExoPlayerImplInternal", "Disable failed.", e10);
            }
        }
        if (z10) {
            for (p0 p0Var2 : this.f62076b) {
                try {
                    p0Var2.reset();
                } catch (RuntimeException e11) {
                    g5.m.d("ExoPlayerImplInternal", "Reset failed.", e11);
                }
            }
        }
        this.f62097w = new p0[0];
        if (!z12) {
            if (z13) {
                if (this.F == null && !this.f62095u.f62195a.q()) {
                    k0 k0Var2 = this.f62095u;
                    k0Var2.f62195a.h(k0Var2.f62196b.f62602a, this.f62086l);
                    this.F = new e(v0.f62325a, this.f62086l.f62328c, this.f62095u.f62207m + this.f62086l.m());
                }
                z15 = true;
            }
            this.f62093s.e(!z13);
            this.A = false;
            if (z13) {
                this.f62093s.y(v0.f62325a);
                it = this.f62091q.iterator();
                while (it.hasNext()) {
                    it.next().f62103b.j(false);
                }
                this.f62091q.clear();
            }
            if (z15) {
                aVarI = this.f62095u.i(this.C, this.f62085k, this.f62086l);
            } else {
                aVarI = this.f62095u.f62196b;
            }
            k4.r.a aVar = aVarI;
            if (z15) {
                j10 = -9223372036854775807L;
            } else {
                j10 = this.f62095u.f62207m;
            }
            long j11 = z15 ? -9223372036854775807L : this.f62095u.f62198d;
            if (z13) {
                v0Var = v0.f62325a;
            } else {
                v0Var = this.f62095u.f62195a;
            }
            v0 v0Var2 = v0Var;
            k0Var = this.f62095u;
            int i10 = k0Var.f62199e;
            if (z14) {
                exoPlaybackException = null;
            } else {
                exoPlaybackException = k0Var.f62200f;
            }
            if (z13) {
                trackGroupArray = TrackGroupArray.f19434e;
            } else {
                trackGroupArray = k0Var.f62202h;
            }
            TrackGroupArray trackGroupArray2 = trackGroupArray;
            if (z13) {
                eVar = this.f62079e;
            } else {
                eVar = k0Var.f62203i;
            }
            this.f62095u = new k0(v0Var2, aVar, j10, j11, i10, exoPlaybackException, false, trackGroupArray2, eVar, aVar, j10, 0L, j10);
            if (z11 || (rVar = this.f62096v) == null) {
            }
            try {
                rVar.b(this);
            } catch (RuntimeException e12) {
                g5.m.d("ExoPlayerImplInternal", "Failed to release child source.", e12);
            }
            this.f62096v = null;
            return;
        }
        this.F = null;
        z15 = z12;
        this.f62093s.e(!z13);
        this.A = false;
        if (z13) {
            this.f62093s.y(v0.f62325a);
            it = this.f62091q.iterator();
            while (it.hasNext()) {
                it.next().f62103b.j(false);
            }
            this.f62091q.clear();
        }
        if (z15) {
            aVarI = this.f62095u.i(this.C, this.f62085k, this.f62086l);
        } else {
            aVarI = this.f62095u.f62196b;
        }
        k4.r.a aVar2 = aVarI;
        if (z15) {
            j10 = -9223372036854775807L;
        } else {
            j10 = this.f62095u.f62207m;
        }
        long j12 = z15 ? -9223372036854775807L : this.f62095u.f62198d;
        if (z13) {
            v0Var = v0.f62325a;
        } else {
            v0Var = this.f62095u.f62195a;
        }
        v0 v0Var3 = v0Var;
        k0Var = this.f62095u;
        int i11 = k0Var.f62199e;
        if (z14) {
            exoPlaybackException = null;
        } else {
            exoPlaybackException = k0Var.f62200f;
        }
        if (z13) {
            trackGroupArray = TrackGroupArray.f19434e;
        } else {
            trackGroupArray = k0Var.f62202h;
        }
        TrackGroupArray trackGroupArray3 = trackGroupArray;
        if (z13) {
            eVar = this.f62079e;
        } else {
            eVar = k0Var.f62203i;
        }
        this.f62095u = new k0(v0Var3, aVar2, j10, j12, i11, exoPlaybackException, false, trackGroupArray3, eVar, aVar2, j10, 0L, j10);
        if (z11) {
        }
    }

    public final void T(long j10) throws ExoPlaybackException {
        h0 h0VarN = this.f62093s.n();
        if (h0VarN != null) {
            j10 = h0VarN.z(j10);
        }
        this.G = j10;
        this.f62089o.d(j10);
        for (p0 p0Var : this.f62097w) {
            p0Var.resetPosition(this.G);
        }
        L();
    }

    public final boolean U(c cVar) {
        Object obj = cVar.f62106e;
        if (obj == null) {
            Pair<Object, Long> pairW = W(new e(cVar.f62103b.g(), cVar.f62103b.h(), k.a(cVar.f62103b.e())), false);
            if (pairW == null) {
                return false;
            }
            cVar.b(this.f62095u.f62195a.b(pairW.first), ((Long) pairW.second).longValue(), pairW.first);
            return true;
        }
        int iB = this.f62095u.f62195a.b(obj);
        if (iB == -1) {
            return false;
        }
        cVar.f62104c = iB;
        return true;
    }

    public final void V() {
        for (int size = this.f62091q.size() - 1; size >= 0; size--) {
            if (!U(this.f62091q.get(size))) {
                this.f62091q.get(size).f62103b.j(false);
                this.f62091q.remove(size);
            }
        }
        Collections.sort(this.f62091q);
    }

    @Nullable
    public final Pair<Object, Long> W(e eVar, boolean z10) {
        Object objX;
        v0 v0Var = this.f62095u.f62195a;
        v0 v0Var2 = eVar.f62111a;
        if (v0Var.q()) {
            return null;
        }
        if (v0Var2.q()) {
            v0Var2 = v0Var;
        }
        try {
            Pair<Object, Long> pairJ = v0Var2.j(this.f62085k, this.f62086l, eVar.f62112b, eVar.f62113c);
            if (v0Var == v0Var2 || v0Var.b(pairJ.first) != -1) {
                return pairJ;
            }
            if (z10 && (objX = X(pairJ.first, v0Var2, v0Var)) != null) {
                return q(v0Var, v0Var.h(objX, this.f62086l).f62328c, -9223372036854775807L);
            }
            return null;
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    public final void Y(long j10, long j11) {
        this.f62082h.removeMessages(2);
        this.f62082h.sendEmptyMessageAtTime(2, j10 + j11);
    }

    public void Z(v0 v0Var, int i10, long j10) {
        this.f62082h.obtainMessage(3, new e(v0Var, i10, j10)).sendToTarget();
    }

    public final void a0(boolean z10) throws ExoPlaybackException {
        k4.r.a aVar = this.f62093s.n().f62148f.f62163a;
        long jD0 = d0(aVar, this.f62095u.f62207m, true);
        if (jD0 != this.f62095u.f62207m) {
            this.f62095u = g(aVar, jD0, this.f62095u.f62198d);
            if (z10) {
                this.f62090p.g(4);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void b0(e eVar) throws Throwable {
        long jLongValue;
        long jLongValue2;
        boolean z10;
        k4.r.a aVarI;
        long j10;
        long jA;
        this.f62090p.e(1);
        Pair<Object, Long> pairW = W(eVar, true);
        int i10 = -9223372036854775807;
        if (pairW == null) {
            aVarI = this.f62095u.i(this.C, this.f62085k, this.f62086l);
            z10 = true;
            jLongValue2 = -9223372036854775807L;
            jLongValue = -9223372036854775807L;
        } else {
            Object obj = pairW.first;
            jLongValue = ((Long) pairW.second).longValue();
            k4.r.a aVarV = this.f62093s.v(obj, jLongValue);
            if (aVarV.b()) {
                jLongValue2 = 0;
                z10 = true;
            } else {
                jLongValue2 = ((Long) pairW.second).longValue();
                z10 = eVar.f62113c == -9223372036854775807L;
            }
            aVarI = aVarV;
        }
        int i11 = 2;
        try {
            try {
                if (this.f62096v != null && this.E <= 0) {
                    if (jLongValue2 == -9223372036854775807L) {
                        t0(4);
                        S(false, false, true, false, true);
                    } else {
                        i11 = 2;
                        if (aVarI.equals(this.f62095u.f62196b)) {
                            h0 h0VarN = this.f62093s.n();
                            jA = (h0VarN == null || !h0VarN.f62146d || jLongValue2 == 0) ? jLongValue2 : h0VarN.f62143a.a(jLongValue2, this.f62094t);
                            if (k.b(jA) == k.b(this.f62095u.f62207m)) {
                                this.f62095u = g(aVarI, this.f62095u.f62207m, jLongValue);
                                if (z10) {
                                    this.f62090p.g(2);
                                    return;
                                }
                                return;
                            }
                        } else {
                            jA = jLongValue2;
                        }
                        long jC0 = c0(aVarI, jA);
                        z10 |= jLongValue2 != jC0;
                        j10 = jC0;
                    }
                    this.f62095u = g(aVarI, j10, jLongValue);
                    if (z10) {
                        this.f62090p.g(i11);
                    }
                }
                this.F = eVar;
                j10 = jLongValue2;
                this.f62095u = g(aVarI, j10, jLongValue);
                if (z10) {
                    this.f62090p.g(i11);
                }
            } catch (Throwable th2) {
                th = th2;
                this.f62095u = g(aVarI, jLongValue2, jLongValue);
                if (z10) {
                    this.f62090p.g(i10);
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            i10 = 2;
        }
    }

    @Override // k4.r.b
    public void c(k4.r rVar, v0 v0Var) {
        this.f62082h.obtainMessage(8, new b(rVar, v0Var)).sendToTarget();
    }

    public final long c0(k4.r.a aVar, long j10) throws ExoPlaybackException {
        return d0(aVar, j10, this.f62093s.n() != this.f62093s.o());
    }

    @Override // k4.q.a
    public void f(k4.q qVar) {
        this.f62082h.obtainMessage(9, qVar).sendToTarget();
    }

    public final void h0(l0 l0Var, boolean z10) {
        this.f62082h.obtainMessage(17, z10 ? 1 : 0, 0, l0Var).sendToTarget();
    }

    /* JADX WARN: Code duplicated, block: B:60:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d0  */
    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) throws Throwable {
        ExoPlaybackException exoPlaybackExceptionCreateForUnexpected;
        try {
            switch (message.what) {
                case 0:
                    O((k4.r) message.obj, message.arg1 != 0, message.arg2 != 0);
                    break;
                case 1:
                    l0(message.arg1 != 0);
                    break;
                case 2:
                    j();
                    break;
                case 3:
                    b0((e) message.obj);
                    break;
                case 4:
                    n0((l0) message.obj);
                    break;
                case 5:
                    q0((t0) message.obj);
                    break;
                case 6:
                    z0(false, message.arg1 != 0, true);
                    break;
                case 7:
                    Q();
                    return true;
                case 8:
                    z((b) message.obj);
                    break;
                case 9:
                    w((k4.q) message.obj);
                    break;
                case 10:
                    u((k4.q) message.obj);
                    break;
                case 11:
                    R();
                    break;
                case 12:
                    p0(message.arg1);
                    break;
                case 13:
                    s0(message.arg1 != 0);
                    break;
                case 14:
                    j0(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 15:
                    e0((o0) message.obj);
                    break;
                case 16:
                    g0((o0) message.obj);
                    break;
                case 17:
                    x((l0) message.obj, message.arg1 != 0);
                    break;
                default:
                    return false;
            }
            F();
        } catch (ExoPlaybackException e10) {
            g5.m.d("ExoPlayerImplInternal", n(e10), e10);
            z0(true, false, false);
            this.f62095u = this.f62095u.d(e10);
            F();
        } catch (IOException e11) {
            g5.m.d("ExoPlayerImplInternal", "Source error", e11);
            z0(false, false, false);
            this.f62095u = this.f62095u.d(ExoPlaybackException.createForSource(e11));
            F();
        } catch (OutOfMemoryError e12) {
            e = e12;
            g5.m.d("ExoPlayerImplInternal", "Internal runtime error", e);
            if (e instanceof OutOfMemoryError) {
                exoPlaybackExceptionCreateForUnexpected = ExoPlaybackException.createForOutOfMemoryError((OutOfMemoryError) e);
            } else {
                exoPlaybackExceptionCreateForUnexpected = ExoPlaybackException.createForUnexpected((RuntimeException) e);
            }
            z0(true, false, false);
            this.f62095u = this.f62095u.d(exoPlaybackExceptionCreateForUnexpected);
            F();
        } catch (RuntimeException e13) {
            e = e13;
            g5.m.d("ExoPlayerImplInternal", "Internal runtime error", e);
            if (e instanceof OutOfMemoryError) {
                exoPlaybackExceptionCreateForUnexpected = ExoPlaybackException.createForOutOfMemoryError((OutOfMemoryError) e);
            } else {
                exoPlaybackExceptionCreateForUnexpected = ExoPlaybackException.createForUnexpected((RuntimeException) e);
            }
            z0(true, false, false);
            this.f62095u = this.f62095u.d(exoPlaybackExceptionCreateForUnexpected);
            F();
        }
        return true;
    }

    public final void i(p0 p0Var) throws ExoPlaybackException {
        this.f62089o.a(p0Var);
        m(p0Var);
        p0Var.disable();
    }

    public final void i0() {
        for (p0 p0Var : this.f62076b) {
            if (p0Var.getStream() != null) {
                p0Var.setCurrentStreamFinal();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:84:0x011c  */
    /* JADX WARN: Code duplicated, block: B:86:0x0121 A[LOOP:1: B:85:0x011f->B:86:0x0121, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:96:0x0145 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:98:0x014d  */
    /* JADX WARN: Instruction removed from duplicated block: B:84:0x011c, please report this as an issue */
    public final void j() throws ExoPlaybackException, IOException {
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        long jUptimeMillis = this.f62092r.uptimeMillis();
        D0();
        int i12 = this.f62095u.f62199e;
        if (i12 == 1 || i12 == 4) {
            this.f62082h.removeMessages(2);
            return;
        }
        h0 h0VarN = this.f62093s.n();
        if (h0VarN == null) {
            Y(jUptimeMillis, 10L);
            return;
        }
        g5.h0.a("doSomeWork");
        E0();
        if (h0VarN.f62146d) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() * 1000;
            h0VarN.f62143a.discardBuffer(this.f62095u.f62207m - this.f62087m, this.f62088n);
            boolean z12 = true;
            boolean z13 = true;
            int i13 = 0;
            while (true) {
                p0[] p0VarArr = this.f62076b;
                if (i13 >= p0VarArr.length) {
                    break;
                }
                p0 p0Var = p0VarArr[i13];
                if (p0Var.getState() != 0) {
                    p0Var.render(this.G, jElapsedRealtime);
                    z12 = z12 && p0Var.isEnded();
                    boolean z14 = h0VarN.f62145c[i13] != p0Var.getStream();
                    boolean z15 = z14 || (!z14 && h0VarN.j() != null && p0Var.hasReadStreamToEnd()) || p0Var.isReady() || p0Var.isEnded();
                    z13 = z13 && z15;
                    if (!z15) {
                        p0Var.maybeThrowStreamError();
                    }
                }
                i13++;
            }
            z10 = z12;
            z11 = z13;
        } else {
            h0VarN.f62143a.maybeThrowPrepareError();
            z10 = true;
            z11 = true;
        }
        long j10 = h0VarN.f62148f.f62167e;
        if (z10 && h0VarN.f62146d && ((j10 == -9223372036854775807L || j10 <= this.f62095u.f62207m) && h0VarN.f62148f.f62169g)) {
            t0(4);
            A0();
        } else {
            if (this.f62095u.f62199e != 2 || !w0(z11)) {
                if (this.f62095u.f62199e == 3 && (this.f62097w.length != 0 ? !z11 : !C())) {
                    this.f62100z = this.f62099y;
                    i10 = 2;
                    t0(2);
                    A0();
                }
                if (this.f62095u.f62199e == i10) {
                    for (p0 p0Var2 : this.f62097w) {
                        p0Var2.maybeThrowStreamError();
                    }
                }
                if ((!this.f62099y && this.f62095u.f62199e == 3) || (i11 = this.f62095u.f62199e) == 2) {
                    Y(jUptimeMillis, 10L);
                } else if (this.f62097w.length != 0 || i11 == 4) {
                    this.f62082h.removeMessages(2);
                } else {
                    Y(jUptimeMillis, 1000L);
                }
                g5.h0.c();
            }
            t0(3);
            if (this.f62099y) {
                x0();
            }
        }
        i10 = 2;
        if (this.f62095u.f62199e == i10) {
            while (i < r5) {
                p0Var2.maybeThrowStreamError();
            }
        }
        if (!this.f62099y) {
            if (this.f62097w.length != 0) {
                this.f62082h.removeMessages(2);
            } else {
                this.f62082h.removeMessages(2);
            }
        } else if (this.f62097w.length != 0) {
            this.f62082h.removeMessages(2);
        } else {
            this.f62082h.removeMessages(2);
        }
        g5.h0.c();
    }

    public final void j0(boolean z10, @Nullable AtomicBoolean atomicBoolean) {
        if (this.D != z10) {
            this.D = z10;
            if (!z10) {
                for (p0 p0Var : this.f62076b) {
                    if (p0Var.getState() == 0) {
                        p0Var.reset();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    public final void k(int i10, boolean z10, int i11) throws ExoPlaybackException {
        h0 h0VarN = this.f62093s.n();
        p0 p0Var = this.f62076b[i10];
        this.f62097w[i11] = p0Var;
        if (p0Var.getState() == 0) {
            c5.e eVarO = h0VarN.o();
            r0 r0Var = eVarO.f5651b[i10];
            Format[] formatArrO = o(eVarO.f5652c.a(i10));
            boolean z11 = this.f62099y && this.f62095u.f62199e == 3;
            p0Var.d(r0Var, formatArrO, h0VarN.f62145c[i10], this.G, !z10 && z11, h0VarN.l());
            this.f62089o.c(p0Var);
            if (z11) {
                p0Var.start();
            }
        }
    }

    public void k0(boolean z10) {
        this.f62082h.obtainMessage(1, z10 ? 1 : 0, 0).sendToTarget();
    }

    public final void l(boolean[] zArr, int i10) throws ExoPlaybackException {
        this.f62097w = new p0[i10];
        c5.e eVarO = this.f62093s.n().o();
        for (int i11 = 0; i11 < this.f62076b.length; i11++) {
            if (!eVarO.c(i11)) {
                this.f62076b[i11].reset();
            }
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.f62076b.length; i13++) {
            if (eVarO.c(i13)) {
                k(i13, zArr[i13], i12);
                i12++;
            }
        }
    }

    public void m0(l0 l0Var) {
        this.f62082h.obtainMessage(4, l0Var).sendToTarget();
    }

    public final String n(ExoPlaybackException exoPlaybackException) {
        if (exoPlaybackException.type != 1) {
            return "Playback error.";
        }
        return "Renderer error: index=" + exoPlaybackException.rendererIndex + ", type=" + g5.k0.a0(this.f62076b[exoPlaybackException.rendererIndex].getTrackType()) + ", format=" + exoPlaybackException.rendererFormat + ", rendererSupport=" + q0.f(exoPlaybackException.rendererFormatSupport);
    }

    public final void n0(l0 l0Var) {
        this.f62089o.b(l0Var);
        h0(this.f62089o.getPlaybackParameters(), true);
    }

    public void o0(int i10) {
        this.f62082h.obtainMessage(12, i10, 0).sendToTarget();
    }

    @Override // c5.d.a
    public void onTrackSelectionsInvalidated() {
        this.f62082h.sendEmptyMessage(11);
    }

    public final long p() {
        h0 h0VarO = this.f62093s.o();
        if (h0VarO == null) {
            return 0L;
        }
        long jL = h0VarO.l();
        if (!h0VarO.f62146d) {
            return jL;
        }
        int i10 = 0;
        while (true) {
            p0[] p0VarArr = this.f62076b;
            if (i10 >= p0VarArr.length) {
                return jL;
            }
            if (p0VarArr[i10].getState() != 0 && this.f62076b[i10].getStream() == h0VarO.f62145c[i10]) {
                long readingPositionUs = this.f62076b[i10].getReadingPositionUs();
                if (readingPositionUs == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                jL = Math.max(readingPositionUs, jL);
            }
            i10++;
        }
    }

    public final void p0(int i10) throws ExoPlaybackException {
        this.B = i10;
        if (!this.f62093s.C(i10)) {
            a0(true);
        }
        v(false);
    }

    public final Pair<Object, Long> q(v0 v0Var, int i10, long j10) {
        return v0Var.j(this.f62085k, this.f62086l, i10, j10);
    }

    public final void q0(t0 t0Var) {
        this.f62094t = t0Var;
    }

    public Looper r() {
        return this.f62083i.getLooper();
    }

    public void r0(boolean z10) {
        this.f62082h.obtainMessage(13, z10 ? 1 : 0, 0).sendToTarget();
    }

    public final long s() {
        return t(this.f62095u.f62205k);
    }

    public final void s0(boolean z10) throws ExoPlaybackException {
        this.C = z10;
        if (!this.f62093s.D(z10)) {
            a0(true);
        }
        v(false);
    }

    public final long t(long j10) {
        h0 h0VarI = this.f62093s.i();
        if (h0VarI == null) {
            return 0L;
        }
        return Math.max(0L, j10 - h0VarI.y(this.G));
    }

    public final void t0(int i10) {
        k0 k0Var = this.f62095u;
        if (k0Var.f62199e != i10) {
            this.f62095u = k0Var.e(i10);
        }
    }

    public final void u(k4.q qVar) {
        if (this.f62093s.s(qVar)) {
            this.f62093s.t(this.G);
            E();
        }
    }

    public final boolean u0() {
        h0 h0VarN;
        h0 h0VarJ;
        if (!this.f62099y || (h0VarN = this.f62093s.n()) == null || (h0VarJ = h0VarN.j()) == null) {
            return false;
        }
        return (h0VarN != this.f62093s.o() || A()) && this.G >= h0VarJ.m();
    }

    public final void v(boolean z10) {
        h0 h0VarI = this.f62093s.i();
        k4.r.a aVar = h0VarI == null ? this.f62095u.f62196b : h0VarI.f62148f.f62163a;
        boolean z11 = !this.f62095u.f62204j.equals(aVar);
        if (z11) {
            this.f62095u = this.f62095u.b(aVar);
        }
        k0 k0Var = this.f62095u;
        k0Var.f62205k = h0VarI == null ? k0Var.f62207m : h0VarI.i();
        this.f62095u.f62206l = s();
        if ((z11 || z10) && h0VarI != null && h0VarI.f62146d) {
            C0(h0VarI.n(), h0VarI.o());
        }
    }

    public final void w(k4.q qVar) throws ExoPlaybackException {
        if (this.f62093s.s(qVar)) {
            h0 h0VarI = this.f62093s.i();
            h0VarI.p(this.f62089o.getPlaybackParameters().f62209a, this.f62095u.f62195a);
            C0(h0VarI.n(), h0VarI.o());
            if (h0VarI == this.f62093s.n()) {
                T(h0VarI.f62148f.f62164b);
                F0(null);
            }
            E();
        }
    }

    public final boolean w0(boolean z10) {
        if (this.f62097w.length == 0) {
            return C();
        }
        if (!z10) {
            return false;
        }
        if (!this.f62095u.f62201g) {
            return true;
        }
        h0 h0VarI = this.f62093s.i();
        return (h0VarI.q() && h0VarI.f62148f.f62169g) || this.f62080f.shouldStartPlayback(s(), this.f62089o.getPlaybackParameters().f62209a, this.f62100z);
    }

    public final void x(l0 l0Var, boolean z10) throws ExoPlaybackException {
        this.f62084j.obtainMessage(1, z10 ? 1 : 0, 0, l0Var).sendToTarget();
        G0(l0Var.f62209a);
        for (p0 p0Var : this.f62076b) {
            if (p0Var != null) {
                p0Var.c(l0Var.f62209a);
            }
        }
    }

    public final void y() {
        if (this.f62095u.f62199e != 1) {
            t0(4);
        }
        S(false, false, true, false, true);
    }

    public void y0(boolean z10) {
        this.f62082h.obtainMessage(6, z10 ? 1 : 0, 0).sendToTarget();
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0110  */
    /* JADX WARN: Code duplicated, block: B:48:0x0118 A[LOOP:0: B:48:0x0118->B:62:0x0118, LOOP_START, PHI: r12
  0x0118: PHI (r12v20 k3.h0) = (r12v17 k3.h0), (r12v21 k3.h0) binds: [B:47:0x0116, B:62:0x0118] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x011e  */
    /* JADX WARN: Code duplicated, block: B:55:0x013d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0140  */
    /* JADX WARN: Code duplicated, block: B:61:0x012c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x0118 A[SYNTHETIC] */
    public final void z(b bVar) throws ExoPlaybackException {
        k4.r.a aVar;
        long jLongValue;
        long jLongValue2;
        k4.r.a aVarV;
        h0 h0VarN;
        long j10;
        if (bVar.f62101a != this.f62096v) {
            return;
        }
        this.f62090p.e(this.E);
        this.E = 0;
        v0 v0Var = this.f62095u.f62195a;
        v0 v0Var2 = bVar.f62102b;
        this.f62093s.y(v0Var2);
        this.f62095u = this.f62095u.f(v0Var2);
        V();
        k4.r.a aVar2 = this.f62095u.f62196b;
        long j11 = aVar2.b() ? this.f62095u.f62198d : this.f62095u.f62207m;
        e eVar = this.F;
        if (eVar == null) {
            if (j11 == -9223372036854775807L && !v0Var2.q()) {
                Pair<Object, Long> pairQ = q(v0Var2, v0Var2.a(this.C), -9223372036854775807L);
                k4.r.a aVarV2 = this.f62093s.v(pairQ.first, ((Long) pairQ.second).longValue());
                jLongValue = !aVarV2.b() ? ((Long) pairQ.second).longValue() : j11;
                aVar = aVarV2;
            } else if (v0Var2.b(aVar2.f62602a) == -1) {
                Object objX = X(aVar2.f62602a, v0Var, v0Var2);
                if (objX == null) {
                    y();
                    return;
                } else {
                    Pair<Object, Long> pairQ2 = q(v0Var2, v0Var2.h(objX, this.f62086l).f62328c, -9223372036854775807L);
                    jLongValue2 = ((Long) pairQ2.second).longValue();
                    aVarV = this.f62093s.v(pairQ2.first, jLongValue2);
                }
            } else {
                k4.r.a aVarV3 = this.f62093s.v(this.f62095u.f62196b.f62602a, j11);
                if (!this.f62095u.f62196b.b() && !aVarV3.b()) {
                    aVarV3 = this.f62095u.f62196b;
                }
                aVar = aVarV3;
                jLongValue = j11;
            }
            if (this.f62095u.f62196b.equals(aVar) || j11 != jLongValue) {
                h0VarN = this.f62093s.n();
                if (h0VarN != null) {
                    while (h0VarN.j() != null) {
                        h0VarN = h0VarN.j();
                        if (h0VarN.f62148f.f62163a.equals(aVar)) {
                            h0VarN.f62148f = this.f62093s.p(h0VarN.f62148f);
                        }
                    }
                }
                if (aVar.b()) {
                    j10 = 0;
                } else {
                    j10 = jLongValue;
                }
                this.f62095u = g(aVar, c0(aVar, j10), jLongValue);
            } else if (!this.f62093s.B(this.G, p())) {
                a0(false);
            }
            v(false);
        }
        Pair<Object, Long> pairW = W(eVar, true);
        this.F = null;
        if (pairW == null) {
            y();
            return;
        } else {
            jLongValue2 = ((Long) pairW.second).longValue();
            aVarV = this.f62093s.v(pairW.first, jLongValue2);
        }
        aVar = aVarV;
        jLongValue = jLongValue2;
        if (this.f62095u.f62196b.equals(aVar)) {
            h0VarN = this.f62093s.n();
            if (h0VarN != null) {
                while (h0VarN.j() != null) {
                    h0VarN = h0VarN.j();
                    if (h0VarN.f62148f.f62163a.equals(aVar)) {
                        h0VarN.f62148f = this.f62093s.p(h0VarN.f62148f);
                    }
                }
            }
            if (aVar.b()) {
                j10 = 0;
            } else {
                j10 = jLongValue;
            }
            this.f62095u = g(aVar, c0(aVar, j10), jLongValue);
        } else {
            h0VarN = this.f62093s.n();
            if (h0VarN != null) {
                while (h0VarN.j() != null) {
                    h0VarN = h0VarN.j();
                    if (h0VarN.f62148f.f62163a.equals(aVar)) {
                        h0VarN.f62148f = this.f62093s.p(h0VarN.f62148f);
                    }
                }
            }
            if (aVar.b()) {
                j10 = 0;
            } else {
                j10 = jLongValue;
            }
            this.f62095u = g(aVar, c0(aVar, j10), jLongValue);
        }
        v(false);
    }

    public d0(p0[] p0VarArr, c5.d dVar, c5.e eVar, g0 g0Var, e5.c cVar, boolean z10, int i10, boolean z11, Handler handler, g5.c cVar2) {
        this.f62076b = p0VarArr;
        this.f62078d = dVar;
        this.f62079e = eVar;
        this.f62080f = g0Var;
        this.f62081g = cVar;
        this.f62099y = z10;
        this.B = i10;
        this.C = z11;
        this.f62084j = handler;
        this.f62092r = cVar2;
        this.f62087m = g0Var.getBackBufferDurationUs();
        this.f62088n = g0Var.retainBackBufferFromKeyframe();
        this.f62095u = k0.h(-9223372036854775807L, eVar);
        this.f62077c = new q0[p0VarArr.length];
        for (int i11 = 0; i11 < p0VarArr.length; i11++) {
            p0VarArr[i11].setIndex(i11);
            this.f62077c[i11] = p0VarArr[i11].getCapabilities();
        }
        this.f62089o = new i(this, cVar2);
        this.f62091q = new ArrayList<>();
        this.f62097w = new p0[0];
        this.f62085k = new v0.c();
        this.f62086l = new v0.b();
        dVar.b(this, cVar);
        HandlerThread handlerThread = new HandlerThread("ExoPlayerImplInternal:Handler", -16);
        this.f62083i = handlerThread;
        handlerThread.start();
        this.f62082h = cVar2.createHandler(handlerThread.getLooper(), this);
        this.I = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D(o0 o0Var) {
        try {
            h(o0Var);
        } catch (ExoPlaybackException e10) {
            g5.m.d("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e10);
            throw new RuntimeException(e10);
        }
    }

    public final void E() {
        boolean zV0 = v0();
        this.A = zV0;
        if (zV0) {
            this.f62093s.i().d(this.G);
        }
        B0();
    }

    @Nullable
    public final Object X(Object obj, v0 v0Var, v0 v0Var2) {
        int iB = v0Var.b(obj);
        int i10 = v0Var.i();
        int iD = iB;
        int iB2 = -1;
        for (int i11 = 0; i11 < i10 && iB2 == -1; i11++) {
            iD = v0Var.d(iD, this.f62086l, this.f62085k, this.B, this.C);
            if (iD == -1) {
                break;
            }
            iB2 = v0Var2.b(v0Var.m(iD));
        }
        if (iB2 == -1) {
            return null;
        }
        return v0Var2.m(iB2);
    }

    public final long d0(k4.r.a aVar, long j10, boolean z10) throws ExoPlaybackException {
        A0();
        this.f62100z = false;
        k0 k0Var = this.f62095u;
        if (k0Var.f62199e != 1 && !k0Var.f62195a.q()) {
            t0(2);
        }
        h0 h0VarN = this.f62093s.n();
        h0 h0VarA = h0VarN;
        while (h0VarA != null) {
            if (aVar.equals(h0VarA.f62148f.f62163a) && h0VarA.f62146d) {
                this.f62093s.u(h0VarA);
                break;
            }
            h0VarA = this.f62093s.a();
        }
        if (z10 || h0VarN != h0VarA || (h0VarA != null && h0VarA.z(j10) < 0)) {
            for (p0 p0Var : this.f62097w) {
                i(p0Var);
            }
            this.f62097w = new p0[0];
            h0VarN = null;
            if (h0VarA != null) {
                h0VarA.x(0L);
            }
        }
        if (h0VarA != null) {
            F0(h0VarN);
            if (h0VarA.f62147e) {
                long jSeekToUs = h0VarA.f62143a.seekToUs(j10);
                h0VarA.f62143a.discardBuffer(jSeekToUs - this.f62087m, this.f62088n);
                j10 = jSeekToUs;
            }
            T(j10);
            E();
        } else {
            this.f62093s.e(true);
            this.f62095u = this.f62095u.g(TrackGroupArray.f19434e, this.f62079e);
            T(j10);
        }
        v(false);
        this.f62082h.sendEmptyMessage(2);
        return j10;
    }

    public final void e0(o0 o0Var) throws ExoPlaybackException {
        if (o0Var.e() == -9223372036854775807L) {
            f0(o0Var);
            return;
        }
        if (this.f62096v != null && this.E <= 0) {
            c cVar = new c(o0Var);
            if (U(cVar)) {
                this.f62091q.add(cVar);
                Collections.sort(this.f62091q);
                return;
            } else {
                o0Var.j(false);
                return;
            }
        }
        this.f62091q.add(new c(o0Var));
    }

    public final void f0(o0 o0Var) throws ExoPlaybackException {
        if (o0Var.c().getLooper() == this.f62082h.getLooper()) {
            h(o0Var);
            int i10 = this.f62095u.f62199e;
            if (i10 == 3 || i10 == 2) {
                this.f62082h.sendEmptyMessage(2);
                return;
            }
            return;
        }
        this.f62082h.obtainMessage(16, o0Var).sendToTarget();
    }

    public final void g0(final o0 o0Var) {
        Handler handlerC = o0Var.c();
        if (!handlerC.getLooper().getThread().isAlive()) {
            g5.m.h("TAG", "Trying to send message on a dead thread.");
            o0Var.j(false);
        } else {
            handlerC.post(new Runnable() { // from class: k3.c0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f62071b.D(o0Var);
                }
            });
        }
    }

    public final void h(o0 o0Var) throws ExoPlaybackException {
        if (o0Var.i()) {
            return;
        }
        try {
            o0Var.f().handleMessage(o0Var.getType(), o0Var.d());
        } finally {
            o0Var.j(true);
        }
    }

    public final void m(p0 p0Var) throws ExoPlaybackException {
        if (p0Var.getState() == 2) {
            p0Var.stop();
        }
    }

    public final boolean v0() {
        if (!B()) {
            return false;
        }
        return this.f62080f.shouldContinueLoading(t(this.f62093s.i().k()), this.f62089o.getPlaybackParameters().f62209a);
    }
}
