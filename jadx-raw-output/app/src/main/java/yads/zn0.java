package yads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import com.ironsource.C3426d4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;
import yads.ce2;
import yads.co0;
import yads.dw0;
import yads.me2;
import yads.zn0;

/* JADX INFO: loaded from: classes2.dex */
public final class zn0 extends qo implements sn0 {
    public int A;
    public int B;
    public boolean C;
    public int D;
    public sy2 E;
    public le2 F;
    public jm1 G;
    public AudioTrack H;
    public Object I;
    public Surface J;
    public SurfaceHolder K;
    public i23 L;
    public boolean M;
    public TextureView N;
    public final int O;
    public int P;
    public int Q;
    public final int R;
    public final pk S;
    public float T;
    public boolean U;
    public final boolean V;
    public boolean W;
    public ig0 X;
    public jm1 Y;
    public ce2 Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public int f85517a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t73 f85518b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public long f85519b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final le2 f85520c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final vy f85521d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final oe2 f85522e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ro[] f85523f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final s73 f85524g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i53 f85525h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final go0 f85526i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final pf1 f85527j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final CopyOnWriteArraySet f85528k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p63 f85529l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f85530m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f85531n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final se f85532o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Looper f85533p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final im f85534q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final f53 f85535r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final wn0 f85536s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final xn0 f85537t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final sk f85538u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final yk f85539v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final c43 f85540w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final fn3 f85541x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final uo3 f85542y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final long f85543z;

    public final void a(wn0 wn0Var) {
        this.f85528k.add(wn0Var);
    }

    public final long b() {
        r();
        r();
        if (!this.Z.f76250b.a()) {
            r();
            return ib3.b(a(this.Z));
        }
        ce2 ce2Var = this.Z;
        ce2Var.f76249a.a(ce2Var.f76250b.f82311a, this.f85529l);
        ce2 ce2Var2 = this.Z;
        return ce2Var2.f76251c == -9223372036854775807L ? ib3.b(ce2Var2.f76249a.a(e(), this.f81910a, 0L).f82130n) : ib3.b(this.f85529l.f81270f) + ib3.b(this.Z.f76251c);
    }

    public final int c() {
        r();
        r();
        if (this.Z.f76250b.a()) {
            return this.Z.f76250b.f82312b;
        }
        return -1;
    }

    public final int d() {
        r();
        r();
        if (this.Z.f76250b.a()) {
            return this.Z.f76250b.f82313c;
        }
        return -1;
    }

    public final int e() {
        r();
        int i10 = i();
        if (i10 == -1) {
            return 0;
        }
        return i10;
    }

    public final int f() {
        r();
        if (this.Z.f76249a.c()) {
            return 0;
        }
        ce2 ce2Var = this.Z;
        return ce2Var.f76249a.a(ce2Var.f76250b.f82311a);
    }

    public final long g() {
        r();
        return ib3.b(a(this.Z));
    }

    public final s63 h() {
        r();
        return this.Z.f76249a;
    }

    public final int i() {
        if (this.Z.f76249a.c()) {
            return this.f85517a0;
        }
        ce2 ce2Var = this.Z;
        return ce2Var.f76249a.a(ce2Var.f76250b.f82311a, this.f85529l).f81268d;
    }

    static {
        ho0.a("goog.exo.exoplayer");
    }

    public zn0(rn0 rn0Var) throws Throwable {
        final zn0 zn0Var = this;
        vy vyVar = new vy();
        zn0Var.f85521d = vyVar;
        try {
            ih1.c("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.18.1] [" + ib3.f78560e + C3426d4.j.f28588e);
            Context applicationContext = rn0Var.f82323a.getApplicationContext();
            se seVar = (se) rn0Var.f82330h.apply(rn0Var.f82324b);
            zn0Var.f85532o = seVar;
            pk pkVar = rn0Var.f82332j;
            zn0Var.S = pkVar;
            int i10 = rn0Var.f82333k;
            zn0Var.O = i10;
            zn0Var.U = false;
            zn0Var.f85543z = rn0Var.f82338p;
            wn0 wn0Var = new wn0(zn0Var);
            zn0Var.f85536s = wn0Var;
            xn0 xn0Var = new xn0();
            zn0Var.f85537t = xn0Var;
            Handler handler = new Handler(rn0Var.f82331i);
            ro[] roVarArrA = ((pe0) rn0Var.f82325c.get()).a(handler, wn0Var, wn0Var, wn0Var, wn0Var);
            zn0Var.f85523f = roVarArrA;
            ni.b(roVarArrA.length > 0);
            s73 s73Var = (s73) rn0Var.f82327e.get();
            zn0Var.f85524g = s73Var;
            im imVar = (im) rn0Var.f82329g.get();
            zn0Var.f85534q = imVar;
            zn0Var.f85531n = rn0Var.f82334l;
            ww2 ww2Var = rn0Var.f82335m;
            Looper looper = rn0Var.f82331i;
            zn0Var.f85533p = looper;
            f53 f53Var = rn0Var.f82324b;
            zn0Var.f85535r = f53Var;
            zn0Var.f85522e = zn0Var;
            zn0Var.f85527j = new pf1(looper, f53Var, new nf1() { // from class: cp.ed
                @Override // yads.nf1
                public final void a(Object obj, dw0 dw0Var) {
                    this.f51315a.a((me2) obj, dw0Var);
                }
            });
            zn0Var.f85528k = new CopyOnWriteArraySet();
            zn0Var.f85530m = new ArrayList();
            zn0Var.E = new sy2();
            t73 t73Var = new t73(new mn2[roVarArrA.length], new op0[roVarArrA.length], o83.f80972c, null);
            zn0Var.f85518b = t73Var;
            zn0Var.f85529l = new p63();
            ke2 ke2VarA = new ke2().a(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 22, 23, 24, 25, 26, 27, 28);
            s73Var.getClass();
            le2 le2VarA = ke2VarA.a(true, 29).a();
            zn0Var.f85520c = le2VarA;
            zn0Var.F = new ke2().a(le2VarA).a(4).a(10).a();
            zn0Var.f85525h = f53Var.a(looper, null);
            do0 do0Var = new do0() { // from class: cp.pd
                @Override // yads.do0
                public final void a(co0 co0Var) {
                    this.f51520a.b(co0Var);
                }
            };
            zn0Var.Z = ce2.a(t73Var);
            ((kb0) seVar).a(zn0Var, looper);
            int i11 = ib3.f78556a;
            ye2 ye2Var = i11 < 31 ? new ye2() : vn0.a(applicationContext, zn0Var, rn0Var.f82339q);
            try {
                zn0Var = this;
                zn0Var.f85526i = new go0(roVarArrA, s73Var, t73Var, (sf1) rn0Var.f82328f.get(), imVar, 0, seVar, ww2Var, rn0Var.f82336n, rn0Var.f82337o, looper, f53Var, do0Var, ye2Var);
                zn0Var.T = 1.0f;
                jm1 jm1Var = jm1.H;
                zn0Var.G = jm1Var;
                zn0Var.Y = jm1Var;
                zn0Var.f85517a0 = -1;
                if (i11 < 21) {
                    zn0Var.R = k();
                } else {
                    zn0Var.R = ib3.a(applicationContext);
                }
                int i12 = q20.f81686b;
                zn0Var.V = true;
                zn0Var.a(seVar);
                ((dc0) imVar).a(new Handler(looper), seVar);
                zn0Var.a(wn0Var);
                sk skVar = new sk(rn0Var.f82323a, handler, wn0Var);
                zn0Var.f85538u = skVar;
                skVar.a();
                yk ykVar = new yk(rn0Var.f82323a, handler, wn0Var);
                zn0Var.f85539v = ykVar;
                ykVar.b();
                c43 c43Var = new c43(rn0Var.f82323a, handler, wn0Var);
                zn0Var.f85540w = c43Var;
                c43Var.a(ib3.c(pkVar.f81434d));
                fn3 fn3Var = new fn3(rn0Var.f82323a);
                zn0Var.f85541x = fn3Var;
                fn3Var.a();
                uo3 uo3Var = new uo3(rn0Var.f82323a);
                zn0Var.f85542y = uo3Var;
                uo3Var.a();
                zn0Var.X = a(c43Var);
                int i13 = oj3.f81056f;
                s73Var.a(pkVar);
                zn0Var.a(1, 10, Integer.valueOf(zn0Var.R));
                zn0Var.a(2, 10, Integer.valueOf(zn0Var.R));
                zn0Var.a(1, 3, pkVar);
                zn0Var.a(2, 4, Integer.valueOf(i10));
                zn0Var.a(2, 5, (Object) 0);
                zn0Var.a(1, 9, Boolean.valueOf(zn0Var.U));
                zn0Var.a(2, 7, xn0Var);
                zn0Var.a(6, 8, xn0Var);
                vyVar.d();
            } catch (Throwable th2) {
                th = th2;
                zn0Var = this;
                zn0Var.f85521d.d();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final void a(me2 me2Var) {
        me2Var.getClass();
        pf1 pf1Var = this.f85527j;
        if (pf1Var.f81400g) {
            return;
        }
        pf1Var.f81397d.add(new of1(me2Var));
    }

    public final int k() {
        AudioTrack audioTrack = this.H;
        if (audioTrack != null && audioTrack.getAudioSessionId() != 0) {
            this.H.release();
            this.H = null;
        }
        if (this.H == null) {
            this.H = new AudioTrack(3, 4000, 4, 2, 2, 0, 0);
        }
        return this.H.getAudioSessionId();
    }

    public final void n() {
        String str;
        AudioTrack audioTrack;
        StringBuilder sb2 = new StringBuilder("Release ");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" [ExoPlayerLib/2.18.1] [");
        sb2.append(ib3.f78560e);
        sb2.append("] [");
        synchronized (ho0.class) {
            str = ho0.f78292b;
        }
        sb2.append(str);
        sb2.append(C3426d4.j.f28588e);
        ih1.c("ExoPlayerImpl", sb2.toString());
        r();
        if (ib3.f78556a < 21 && (audioTrack = this.H) != null) {
            audioTrack.release();
            this.H = null;
        }
        this.f85538u.a();
        this.f85540w.b();
        fn3 fn3Var = this.f85541x;
        fn3Var.f77465b = false;
        fn3Var.b();
        uo3 uo3Var = this.f85542y;
        uo3Var.f83555b = false;
        uo3Var.b();
        yk ykVar = this.f85539v;
        ykVar.f85014c = null;
        ykVar.a();
        if (!this.f85526i.h()) {
            pf1 pf1Var = this.f85527j;
            pf1Var.a(10, new mf1() { // from class: cp.md
                @Override // yads.mf1
                public final void invoke(Object obj) {
                    zn0.b((me2) obj);
                }
            });
            pf1Var.a();
        }
        pf1 pf1Var2 = this.f85527j;
        for (of1 of1Var : pf1Var2.f81397d) {
            nf1 nf1Var = pf1Var2.f81396c;
            of1Var.f81029d = true;
            if (of1Var.f81028c) {
                nf1Var.a(of1Var.f81026a, of1Var.f81027b.a());
            }
        }
        pf1Var2.f81397d.clear();
        pf1Var2.f81400g = true;
        this.f85525h.f78499a.removeCallbacksAndMessages(null);
        im imVar = this.f85534q;
        se seVar = this.f85532o;
        gm gmVar = ((dc0) imVar).f76619b;
        for (fm fmVar : gmVar.f77853a) {
            if (fmVar.f77439b == seVar) {
                fmVar.f77440c = true;
                gmVar.f77853a.remove(fmVar);
            }
        }
        ce2 ce2VarA = this.Z.a(1);
        this.Z = ce2VarA;
        ce2 ce2VarA2 = ce2VarA.a(ce2VarA.f76250b);
        this.Z = ce2VarA2;
        ce2VarA2.f76264p = ce2VarA2.f76266r;
        this.Z.f76265q = 0L;
        ((kb0) this.f85532o).c();
        this.f85524g.a();
        o();
        Surface surface = this.J;
        if (surface != null) {
            surface.release();
            this.J = null;
        }
        int i10 = q20.f81686b;
    }

    public final void o() {
        if (this.L != null) {
            bf2 bf2VarA = a(this.f85537t);
            boolean z10 = !bf2VarA.f75808g;
            if (!z10) {
                throw new IllegalStateException();
            }
            bf2VarA.f75805d = 10000;
            if (!z10) {
                throw new IllegalStateException();
            }
            bf2VarA.f75806e = null;
            bf2VarA.a();
            this.L.f78464a.remove(this.f85536s);
            this.L = null;
        }
        TextureView textureView = this.N;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.f85536s) {
                ih1.d("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.N.setSurfaceTextureListener(null);
            }
            this.N = null;
        }
        SurfaceHolder surfaceHolder = this.K;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.f85536s);
            this.K = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0065  */
    /* JADX WARN: Code duplicated, block: B:21:0x008d  */
    public final void p() {
        boolean z10;
        boolean z11;
        le2 le2Var = this.F;
        oe2 oe2Var = this.f85522e;
        le2 le2Var2 = this.f85520c;
        int i10 = ib3.f78556a;
        zn0 zn0Var = (zn0) oe2Var;
        zn0Var.r();
        boolean zA = zn0Var.Z.f76250b.a();
        qo qoVar = (qo) oe2Var;
        zn0 zn0Var2 = (zn0) qoVar;
        zn0Var2.r();
        s63 s63Var = zn0Var2.Z.f76249a;
        boolean z12 = !s63Var.c() && s63Var.a(zn0Var2.e(), qoVar.f81910a, 0L).f82125i;
        zn0Var2.r();
        s63 s63Var2 = zn0Var2.Z.f76249a;
        if (s63Var2.c()) {
            z10 = false;
        } else {
            int iE = zn0Var2.e();
            qoVar.getClass();
            ((zn0) qoVar).r();
            zn0Var2.r();
            if (s63Var2.b(iE, 0, false) != -1) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        zn0Var2.r();
        s63 s63Var3 = zn0Var2.Z.f76249a;
        if (s63Var3.c()) {
            z11 = false;
        } else {
            int iE2 = zn0Var2.e();
            qoVar.getClass();
            ((zn0) qoVar).r();
            zn0Var2.r();
            if (s63Var3.a(iE2, 0, false) != -1) {
                z11 = true;
            } else {
                z11 = false;
            }
        }
        zn0Var2.r();
        s63 s63Var4 = zn0Var2.Z.f76249a;
        boolean z13 = !s63Var4.c() && s63Var4.a(zn0Var2.e(), qoVar.f81910a, 0L).a();
        zn0Var2.r();
        s63 s63Var5 = zn0Var2.Z.f76249a;
        boolean z14 = !s63Var5.c() && s63Var5.a(zn0Var2.e(), qoVar.f81910a, 0L).f82126j;
        zn0Var.r();
        boolean zC = zn0Var.Z.f76249a.c();
        boolean z15 = !zA;
        le2 le2Var3 = new le2(new ke2().a(le2Var2).a(z15, 4).a(z12 && !zA, 5).a(z10 && !zA, 6).a(!zC && (z10 || !z13 || z12) && !zA, 7).a(z11 && !zA, 8).a(!zC && (z11 || (z13 && z14)) && !zA, 9).a(z15, 10).a(z12 && !zA, 11).a(z12 && !zA, 12).f79403a.a());
        this.F = le2Var3;
        if (le2Var3.equals(le2Var)) {
            return;
        }
        this.f85527j.a(13, new mf1() { // from class: cp.qd
            @Override // yads.mf1
            public final void invoke(Object obj) {
                this.f51542a.c((me2) obj);
            }
        });
    }

    public final void r() {
        this.f85521d.b();
        if (Thread.currentThread() != this.f85533p.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = this.f85533p.getThread().getName();
            int i10 = ib3.f78556a;
            Locale locale = Locale.US;
            String str = "Player is accessed on the wrong thread.\nCurrent thread: '" + name + "'\nExpected thread: '" + name2 + "'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread";
            if (this.V) {
                throw new IllegalStateException(str);
            }
            ih1.d("ExoPlayerImpl", ih1.a(str, this.W ? null : new IllegalStateException()));
            this.W = true;
        }
    }

    public static void h(ce2 ce2Var, me2 me2Var) {
        me2Var.onIsPlayingChanged(ce2Var.f76253e == 3 && ce2Var.f76260l && ce2Var.f76261m == 0);
    }

    public final long j() {
        r();
        r();
        if (this.Z.f76250b.a()) {
            ce2 ce2Var = this.Z;
            ym1 ym1Var = ce2Var.f76250b;
            ce2Var.f76249a.a(ym1Var.f82311a, this.f85529l);
            return ib3.b(this.f85529l.a(ym1Var.f82312b, ym1Var.f82313c));
        }
        r();
        s63 s63Var = this.Z.f76249a;
        if (s63Var.c()) {
            return -9223372036854775807L;
        }
        return ib3.b(s63Var.a(e(), this.f81910a, 0L).f82131o);
    }

    public final boolean l() {
        r();
        return this.Z.f76250b.a();
    }

    public final void m() {
        int i10;
        r();
        r();
        boolean z10 = this.Z.f76260l;
        int i11 = 2;
        int iA = this.f85539v.a(z10, 2);
        if (z10 && iA != 1) {
            i10 = 2;
        } else {
            i10 = 1;
        }
        a(iA, i10, z10);
        ce2 ce2Var = this.Z;
        if (ce2Var.f76253e != 1) {
            return;
        }
        ce2 ce2VarA = ce2Var.a((pn0) null);
        if (ce2VarA.f76249a.c()) {
            i11 = 4;
        }
        ce2 ce2VarA2 = ce2VarA.a(i11);
        this.A++;
        i53 i53Var = this.f85526i.f77880i;
        i53Var.getClass();
        h53 h53VarA = i53.a();
        h53VarA.f78073a = i53Var.f78499a.obtainMessage(0);
        h53VarA.b();
        a(ce2VarA2, 1, 1, false, 5, -9223372036854775807L);
    }

    public final void q() {
        r();
        int i10 = this.Z.f76253e;
        boolean z10 = true;
        if (i10 != 1) {
            if (i10 != 2 && i10 != 3) {
                if (i10 != 4) {
                    throw new IllegalStateException();
                }
            } else {
                r();
                boolean z11 = this.Z.f76263o;
                fn3 fn3Var = this.f85541x;
                r();
                if (!this.Z.f76260l || z11) {
                    z10 = false;
                }
                fn3Var.f77465b = z10;
                fn3Var.b();
                uo3 uo3Var = this.f85542y;
                r();
                uo3Var.f83555b = this.Z.f76260l;
                uo3Var.b();
                return;
            }
        }
        fn3 fn3Var2 = this.f85541x;
        fn3Var2.f77465b = false;
        fn3Var2.b();
        uo3 uo3Var2 = this.f85542y;
        uo3Var2.f83555b = false;
        uo3Var2.b();
    }

    public static /* synthetic */ void d(ce2 ce2Var, me2 me2Var) {
        boolean z10 = ce2Var.f76255g;
        me2Var.getClass();
        me2Var.onIsLoadingChanged(ce2Var.f76255g);
    }

    public final /* synthetic */ void c(me2 me2Var) {
        me2Var.a(this.F);
    }

    public final jm1 a() {
        r();
        s63 s63Var = this.Z.f76249a;
        if (s63Var.c()) {
            return this.Y;
        }
        fm1 fm1Var = s63Var.a(e(), this.f81910a, 0L).f82120d;
        jm1 jm1Var = this.Y;
        jm1Var.getClass();
        im1 im1Var = new im1(jm1Var);
        jm1 jm1Var2 = fm1Var.f77446e;
        if (jm1Var2 != null) {
            CharSequence charSequence = jm1Var2.f79103b;
            if (charSequence != null) {
                im1Var.f78698a = charSequence;
            }
            CharSequence charSequence2 = jm1Var2.f79104c;
            if (charSequence2 != null) {
                im1Var.f78699b = charSequence2;
            }
            CharSequence charSequence3 = jm1Var2.f79105d;
            if (charSequence3 != null) {
                im1Var.f78700c = charSequence3;
            }
            CharSequence charSequence4 = jm1Var2.f79106e;
            if (charSequence4 != null) {
                im1Var.f78701d = charSequence4;
            }
            CharSequence charSequence5 = jm1Var2.f79107f;
            if (charSequence5 != null) {
                im1Var.f78702e = charSequence5;
            }
            CharSequence charSequence6 = jm1Var2.f79108g;
            if (charSequence6 != null) {
                im1Var.f78703f = charSequence6;
            }
            CharSequence charSequence7 = jm1Var2.f79109h;
            if (charSequence7 != null) {
                im1Var.f78704g = charSequence7;
            }
            ql2 ql2Var = jm1Var2.f79110i;
            if (ql2Var != null) {
                im1Var.f78705h = ql2Var;
            }
            ql2 ql2Var2 = jm1Var2.f79111j;
            if (ql2Var2 != null) {
                im1Var.f78706i = ql2Var2;
            }
            byte[] bArr = jm1Var2.f79112k;
            if (bArr != null) {
                Integer num = jm1Var2.f79113l;
                im1Var.f78707j = (byte[]) bArr.clone();
                im1Var.f78708k = num;
            }
            Uri uri = jm1Var2.f79114m;
            if (uri != null) {
                im1Var.f78709l = uri;
            }
            Integer num2 = jm1Var2.f79115n;
            if (num2 != null) {
                im1Var.f78710m = num2;
            }
            Integer num3 = jm1Var2.f79116o;
            if (num3 != null) {
                im1Var.f78711n = num3;
            }
            Integer num4 = jm1Var2.f79117p;
            if (num4 != null) {
                im1Var.f78712o = num4;
            }
            Boolean bool = jm1Var2.f79118q;
            if (bool != null) {
                im1Var.f78713p = bool;
            }
            Integer num5 = jm1Var2.f79119r;
            if (num5 != null) {
                im1Var.f78714q = num5;
            }
            Integer num6 = jm1Var2.f79120s;
            if (num6 != null) {
                im1Var.f78714q = num6;
            }
            Integer num7 = jm1Var2.f79121t;
            if (num7 != null) {
                im1Var.f78715r = num7;
            }
            Integer num8 = jm1Var2.f79122u;
            if (num8 != null) {
                im1Var.f78716s = num8;
            }
            Integer num9 = jm1Var2.f79123v;
            if (num9 != null) {
                im1Var.f78717t = num9;
            }
            Integer num10 = jm1Var2.f79124w;
            if (num10 != null) {
                im1Var.f78718u = num10;
            }
            Integer num11 = jm1Var2.f79125x;
            if (num11 != null) {
                im1Var.f78719v = num11;
            }
            CharSequence charSequence8 = jm1Var2.f79126y;
            if (charSequence8 != null) {
                im1Var.f78720w = charSequence8;
            }
            CharSequence charSequence9 = jm1Var2.f79127z;
            if (charSequence9 != null) {
                im1Var.f78721x = charSequence9;
            }
            CharSequence charSequence10 = jm1Var2.A;
            if (charSequence10 != null) {
                im1Var.f78722y = charSequence10;
            }
            Integer num12 = jm1Var2.B;
            if (num12 != null) {
                im1Var.f78723z = num12;
            }
            Integer num13 = jm1Var2.C;
            if (num13 != null) {
                im1Var.A = num13;
            }
            CharSequence charSequence11 = jm1Var2.D;
            if (charSequence11 != null) {
                im1Var.B = charSequence11;
            }
            CharSequence charSequence12 = jm1Var2.E;
            if (charSequence12 != null) {
                im1Var.C = charSequence12;
            }
            CharSequence charSequence13 = jm1Var2.F;
            if (charSequence13 != null) {
                im1Var.D = charSequence13;
            }
            Bundle bundle = jm1Var2.G;
            if (bundle != null) {
                im1Var.E = bundle;
            }
        }
        return new jm1(im1Var);
    }

    public final void d(me2 me2Var) {
        me2Var.getClass();
        pf1 pf1Var = this.f85527j;
        for (of1 of1Var : pf1Var.f81397d) {
            if (of1Var.f81026a.equals(me2Var)) {
                nf1 nf1Var = pf1Var.f81396c;
                of1Var.f81029d = true;
                if (of1Var.f81028c) {
                    nf1Var.a(of1Var.f81026a, of1Var.f81027b.a());
                }
                pf1Var.f81397d.remove(of1Var);
            }
        }
    }

    public static long b(ce2 ce2Var) {
        r63 r63Var = new r63();
        p63 p63Var = new p63();
        ce2Var.f76249a.a(ce2Var.f76250b.f82311a, p63Var);
        long j10 = ce2Var.f76251c;
        if (j10 == -9223372036854775807L) {
            return ce2Var.f76249a.a(p63Var.f81268d, r63Var, 0L).f82130n;
        }
        return p63Var.f81270f + j10;
    }

    public final void b(final co0 co0Var) {
        i53 i53Var = this.f85525h;
        i53Var.f78499a.post(new Runnable() { // from class: cp.od
            @Override // java.lang.Runnable
            public final void run() {
                this.f51498b.a(co0Var);
            }
        });
    }

    public static void b(me2 me2Var) {
        me2Var.a(new pn0(2, new lp0(1), 1003, 0));
    }

    public final void b(int i10) {
        for (int i11 = i10 - 1; i11 >= 0; i11--) {
            this.f85530m.remove(i11);
        }
        sy2 sy2Var = this.E;
        int[] iArr = new int[sy2Var.f82834b.length - i10];
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int[] iArr2 = sy2Var.f82834b;
            if (i12 < iArr2.length) {
                int i14 = iArr2[i12];
                if (i14 < 0 || i14 >= i10) {
                    int i15 = i12 - i13;
                    if (i14 >= 0) {
                        i14 -= i10;
                    }
                    iArr[i15] = i14;
                } else {
                    i13++;
                }
                i12++;
            } else {
                this.E = new sy2(iArr, new Random(sy2Var.f82833a.nextLong()));
                return;
            }
        }
    }

    public final bf2 a(af2 af2Var) {
        int i10 = i();
        go0 go0Var = this.f85526i;
        s63 s63Var = this.Z.f76249a;
        if (i10 == -1) {
            i10 = 0;
        }
        return new bf2(go0Var, af2Var, s63Var, i10, this.f85535r, go0Var.f77882k);
    }

    public final long a(ce2 ce2Var) {
        if (ce2Var.f76249a.c()) {
            return ib3.a(this.f85519b0);
        }
        if (ce2Var.f76250b.a()) {
            return ce2Var.f76266r;
        }
        s63 s63Var = ce2Var.f76249a;
        ym1 ym1Var = ce2Var.f76250b;
        long j10 = ce2Var.f76266r;
        s63Var.a(ym1Var.f82311a, this.f85529l);
        return j10 + this.f85529l.f81270f;
    }

    public final /* synthetic */ void a(me2 me2Var, dw0 dw0Var) {
        me2Var.getClass();
    }

    public final void a(co0 co0Var) {
        boolean z10;
        int i10 = this.A - co0Var.f76343c;
        this.A = i10;
        boolean z11 = true;
        if (co0Var.f76344d) {
            this.B = co0Var.f76345e;
            this.C = true;
        }
        if (co0Var.f76346f) {
            this.D = co0Var.f76347g;
        }
        if (i10 == 0) {
            s63 s63Var = co0Var.f76342b.f76249a;
            if (!this.Z.f76249a.c() && s63Var.c()) {
                this.f85517a0 = -1;
                this.f85519b0 = 0L;
            }
            if (!s63Var.c()) {
                List listAsList = Arrays.asList(((xf2) s63Var).f84580j);
                if (listAsList.size() == this.f85530m.size()) {
                    for (int i11 = 0; i11 < listAsList.size(); i11++) {
                        ((yn0) this.f85530m.get(i11)).f85066b = (s63) listAsList.get(i11);
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
            long j10 = -9223372036854775807L;
            if (this.C) {
                if (co0Var.f76342b.f76250b.equals(this.Z.f76250b) && co0Var.f76342b.f76252d == this.Z.f76266r) {
                    z11 = false;
                }
                if (z11) {
                    if (!s63Var.c() && !co0Var.f76342b.f76250b.a()) {
                        ce2 ce2Var = co0Var.f76342b;
                        ym1 ym1Var = ce2Var.f76250b;
                        long j11 = ce2Var.f76252d;
                        s63Var.a(ym1Var.f82311a, this.f85529l);
                        j10 = j11 + this.f85529l.f81270f;
                    } else {
                        j10 = co0Var.f76342b.f76252d;
                    }
                }
                z10 = z11;
            } else {
                z10 = false;
            }
            this.C = false;
            a(co0Var.f76342b, 1, this.D, z10, this.B, j10);
        }
    }

    public static /* synthetic */ void a(ce2 ce2Var, int i10, me2 me2Var) {
        s63 s63Var = ce2Var.f76249a;
        me2Var.a(i10);
    }

    public static /* synthetic */ void a(int i10, ne2 ne2Var, ne2 ne2Var2, me2 me2Var) {
        me2Var.getClass();
        me2Var.a(ne2Var, ne2Var2, i10);
    }

    public final ce2 a(ce2 ce2Var, xf2 xf2Var, Pair pair) {
        List list;
        ce2 ce2VarA;
        long jA;
        if (!xf2Var.c() && pair == null) {
            throw new IllegalArgumentException();
        }
        s63 s63Var = ce2Var.f76249a;
        ce2 ce2VarA2 = ce2Var.a(xf2Var);
        if (xf2Var.c()) {
            ym1 ym1Var = ce2.f76248s;
            long jA2 = ib3.a(this.f85519b0);
            ce2 ce2VarA3 = ce2VarA2.a(ym1Var, jA2, jA2, jA2, 0L, i73.f78512e, this.f85518b, sm2.f82697f).a(ym1Var);
            ce2VarA3.f76264p = ce2VarA3.f76266r;
            return ce2VarA3;
        }
        Object obj = ce2VarA2.f76250b.f82311a;
        int i10 = ib3.f78556a;
        boolean z10 = !obj.equals(pair.first);
        ym1 ym1Var2 = z10 ? new ym1(pair.first) : ce2VarA2.f76250b;
        long jLongValue = ((Long) pair.second).longValue();
        long jA3 = ib3.a(b());
        if (!s63Var.c()) {
            jA3 -= s63Var.a(obj, this.f85529l).f81270f;
        }
        if (z10 || jLongValue < jA3) {
            if (!ym1Var2.a()) {
                i73 i73Var = z10 ? i73.f78512e : ce2VarA2.f76256h;
                t73 t73Var = z10 ? this.f85518b : ce2VarA2.f76257i;
                if (z10) {
                    m51 m51Var = p51.f81258c;
                    list = sm2.f82697f;
                } else {
                    list = ce2VarA2.f76258j;
                }
                ce2 ce2VarA4 = ce2VarA2.a(r0, jLongValue, jLongValue, jLongValue, 0L, i73Var, t73Var, list).a(ym1Var2);
                ce2VarA4.f76264p = jLongValue;
                return ce2VarA4;
            }
            throw new IllegalStateException();
        }
        if (jLongValue == jA3) {
            int iA = xf2Var.a(ce2VarA2.f76259k.f82311a);
            if (iA != -1 && xf2Var.a(iA, this.f85529l, false).f81268d == xf2Var.a(ym1Var2.f82311a, this.f85529l).f81268d) {
                return ce2VarA2;
            }
            xf2Var.a(ym1Var2.f82311a, this.f85529l);
            if (ym1Var2.a()) {
                jA = this.f85529l.a(ym1Var2.f82312b, ym1Var2.f82313c);
            } else {
                jA = this.f85529l.f81269e;
            }
            ce2VarA = ce2VarA2.a(ym1Var2, ce2VarA2.f76266r, ce2VarA2.f76266r, ce2VarA2.f76252d, jA - ce2VarA2.f76266r, ce2VarA2.f76256h, ce2VarA2.f76257i, ce2VarA2.f76258j).a(ym1Var2);
            ce2VarA.f76264p = jA;
        } else if (!ym1Var2.a()) {
            long jMax = Math.max(0L, ce2VarA2.f76265q - (jLongValue - jA3));
            long j10 = ce2VarA2.f76264p;
            if (ce2VarA2.f76259k.equals(ce2VarA2.f76250b)) {
                j10 = jLongValue + jMax;
            }
            ce2VarA = ce2VarA2.a(ym1Var2, jLongValue, jLongValue, jLongValue, jMax, ce2VarA2.f76256h, ce2VarA2.f76257i, ce2VarA2.f76258j);
            ce2VarA.f76264p = j10;
        } else {
            throw new IllegalStateException();
        }
        return ce2VarA;
    }

    public final Pair a(xf2 xf2Var, int i10, long j10) {
        if (xf2Var.c()) {
            this.f85517a0 = i10;
            if (j10 == -9223372036854775807L) {
                j10 = 0;
            }
            this.f85519b0 = j10;
            return null;
        }
        if (i10 == -1 || i10 >= xf2Var.f84576f) {
            i10 = xf2Var.a(false);
            j10 = ib3.b(xf2Var.a(i10, this.f81910a, 0L).f82130n);
        }
        return xf2Var.a(this.f81910a, this.f85529l, i10, ib3.a(j10));
    }

    public final void a(final int i10, final int i11) {
        if (i10 == this.P && i11 == this.Q) {
            return;
        }
        this.P = i10;
        this.Q = i11;
        pf1 pf1Var = this.f85527j;
        pf1Var.a(24, new mf1() { // from class: cp.ld
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ((me2) obj).onSurfaceSizeChanged(i10, i11);
            }
        });
        pf1Var.a();
    }

    public final void a(int i10, int i11, Object obj) {
        for (ro roVar : this.f85523f) {
            if (roVar.f82354b == i10) {
                bf2 bf2VarA = a(roVar);
                boolean z10 = !bf2VarA.f75808g;
                if (z10) {
                    bf2VarA.f75805d = i11;
                    if (z10) {
                        bf2VarA.f75806e = obj;
                        bf2VarA.a();
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        }
    }

    public final void a(mo moVar) {
        r();
        List listSingletonList = Collections.singletonList(moVar);
        r();
        r();
        i();
        r();
        a(this.Z);
        int i10 = ib3.f78556a;
        this.A++;
        if (!this.f85530m.isEmpty()) {
            b(this.f85530m.size());
        }
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < listSingletonList.size(); i11++) {
            gn1 gn1Var = new gn1((mo) listSingletonList.get(i11), this.f85531n);
            arrayList.add(gn1Var);
            this.f85530m.add(i11, new yn0(gn1Var.f77860a.f83930o, gn1Var.f77861b));
        }
        this.E = this.E.a(arrayList.size());
        xf2 xf2Var = new xf2(this.f85530m, this.E);
        if (!xf2Var.c() && -1 >= xf2Var.f84576f) {
            throw new f31();
        }
        int iA = xf2Var.a(false);
        ce2 ce2VarA = a(this.Z, xf2Var, a(xf2Var, iA, -9223372036854775807L));
        int i12 = ce2VarA.f76253e;
        if (iA != -1 && i12 != 1) {
            i12 = (xf2Var.c() || iA >= xf2Var.f84576f) ? 4 : 2;
        }
        ce2 ce2VarA2 = ce2VarA.a(i12);
        this.f85526i.f77880i.a(17, new bo0(iA, ib3.a(-9223372036854775807L), this.E, arrayList)).b();
        a(ce2VarA2, 0, 1, (this.Z.f76250b.f82311a.equals(ce2VarA2.f76250b.f82311a) || this.Z.f76249a.c()) ? false : true, 4, a(ce2VarA2));
    }

    public final void a(boolean z10) {
        r();
        yk ykVar = this.f85539v;
        r();
        int iA = ykVar.a(z10, this.Z.f76253e);
        int i10 = 1;
        if (z10 && iA != 1) {
            i10 = 2;
        }
        a(iA, i10, z10);
    }

    public final void a(SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        a(surface);
        this.J = surface;
    }

    public final void a(Surface surface) {
        ArrayList arrayList = new ArrayList();
        ro[] roVarArr = this.f85523f;
        int length = roVarArr.length;
        int i10 = 0;
        while (true) {
            boolean z10 = true;
            if (i10 < length) {
                ro roVar = roVarArr[i10];
                if (roVar.f82354b == 2) {
                    bf2 bf2VarA = a(roVar);
                    boolean z11 = !bf2VarA.f75808g;
                    if (z11) {
                        bf2VarA.f75805d = 1;
                        if (z11) {
                            bf2VarA.f75806e = surface;
                            arrayList.add(bf2VarA.a());
                        } else {
                            throw new IllegalStateException();
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                }
                i10++;
            } else {
                Object obj = this.I;
                if (obj == null || obj == surface) {
                    z10 = false;
                } else {
                    try {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((bf2) it.next()).a(this.f85543z);
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    } catch (TimeoutException unused2) {
                    }
                    z10 = false;
                    Object obj2 = this.I;
                    Surface surface2 = this.J;
                    if (obj2 == surface2) {
                        surface2.release();
                        this.J = null;
                    }
                }
                this.I = surface;
                if (z10) {
                    a(new pn0(2, new lp0(3), 1003, 0));
                    return;
                }
                return;
            }
        }
    }

    public final void a(TextureView textureView) {
        r();
        if (textureView == null) {
            r();
            o();
            a((Surface) null);
            a(0, 0);
            return;
        }
        o();
        this.N = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            ih1.d("ExoPlayerImpl", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.f85536s);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            a((Surface) null);
            a(0, 0);
        } else {
            Surface surface = new Surface(surfaceTexture);
            a(surface);
            this.J = surface;
            a(textureView.getWidth(), textureView.getHeight());
        }
    }

    public final void a(float f10) {
        r();
        int i10 = ib3.f78556a;
        final float fMax = Math.max(0.0f, Math.min(f10, 1.0f));
        if (this.T == fMax) {
            return;
        }
        this.T = fMax;
        a(1, 2, Float.valueOf(this.f85539v.f85018g * fMax));
        pf1 pf1Var = this.f85527j;
        pf1Var.a(22, new mf1() { // from class: cp.nd
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ((me2) obj).onVolumeChanged(fMax);
            }
        });
        pf1Var.a();
    }

    public final void a(pn0 pn0Var) {
        ce2 ce2Var = this.Z;
        ce2 ce2VarA = ce2Var.a(ce2Var.f76250b);
        ce2VarA.f76264p = ce2VarA.f76266r;
        ce2VarA.f76265q = 0L;
        ce2 ce2VarA2 = ce2VarA.a(1);
        if (pn0Var != null) {
            ce2VarA2 = ce2VarA2.a(pn0Var);
        }
        ce2 ce2Var2 = ce2VarA2;
        this.A++;
        i53 i53Var = this.f85526i.f77880i;
        i53Var.getClass();
        h53 h53VarA = i53.a();
        h53VarA.f78073a = i53Var.f78499a.obtainMessage(6);
        h53VarA.b();
        a(ce2Var2, 0, 1, ce2Var2.f76249a.c() && !this.Z.f76249a.c(), 4, a(ce2Var2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(int i10, int i11, boolean z10) {
        int i12 = 0;
        int i13 = (!z10 || i10 == -1) ? 0 : 1;
        if (i13 != 0 && i10 != 1) {
            i12 = 1;
        }
        ce2 ce2Var = this.Z;
        if (ce2Var.f76260l == i13 && ce2Var.f76261m == i12) {
            return;
        }
        this.A++;
        ce2 ce2Var2 = new ce2(ce2Var.f76249a, ce2Var.f76250b, ce2Var.f76251c, ce2Var.f76252d, ce2Var.f76253e, ce2Var.f76254f, ce2Var.f76255g, ce2Var.f76256h, ce2Var.f76257i, ce2Var.f76258j, ce2Var.f76259k, i13, i12, ce2Var.f76262n, ce2Var.f76264p, ce2Var.f76265q, ce2Var.f76266r, ce2Var.f76263o);
        i53 i53Var = this.f85526i.f77880i;
        i53Var.getClass();
        h53 h53VarA = i53.a();
        h53VarA.f78073a = i53Var.f78499a.obtainMessage(1, i13, i12);
        h53VarA.b();
        a(ce2Var2, 0, i11, false, 5, -9223372036854775807L);
    }

    public final void a(final ce2 ce2Var, final int i10, final int i11, boolean z10, final int i12, long j10) {
        Pair pair;
        int i13;
        final fm1 fm1Var;
        boolean z11;
        Object obj;
        int i14;
        fm1 fm1Var2;
        Object obj2;
        int i15;
        long j11;
        long j12;
        long jB;
        long jB2;
        Object obj3;
        fm1 fm1Var3;
        Object obj4;
        int iA;
        ce2 ce2Var2 = this.Z;
        this.Z = ce2Var;
        boolean z12 = !ce2Var2.f76249a.equals(ce2Var.f76249a);
        s63 s63Var = ce2Var2.f76249a;
        s63 s63Var2 = ce2Var.f76249a;
        if (s63Var2.c() && s63Var.c()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (s63Var2.c() != s63Var.c()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else if (!s63Var.a(s63Var.a(ce2Var2.f76250b.f82311a, this.f85529l).f81268d, this.f81910a, 0L).f82118b.equals(s63Var2.a(s63Var2.a(ce2Var.f76250b.f82311a, this.f85529l).f81268d, this.f81910a, 0L).f82118b)) {
            if (z10 && i12 == 0) {
                i13 = 1;
            } else if (z10 && i12 == 1) {
                i13 = 2;
            } else {
                if (!z12) {
                    throw new IllegalStateException();
                }
                i13 = 3;
            }
            pair = new Pair(Boolean.TRUE, Integer.valueOf(i13));
        } else if (z10 && i12 == 0 && ce2Var2.f76250b.f82314d < ce2Var.f76250b.f82314d) {
            pair = new Pair(Boolean.TRUE, 0);
        } else {
            pair = new Pair(Boolean.FALSE, -1);
        }
        boolean zBooleanValue = ((Boolean) pair.first).booleanValue();
        final int iIntValue = ((Integer) pair.second).intValue();
        jm1 jm1VarA = this.G;
        if (zBooleanValue) {
            fm1Var = ce2Var.f76249a.c() ? null : ce2Var.f76249a.a(ce2Var.f76249a.a(ce2Var.f76250b.f82311a, this.f85529l).f81268d, this.f81910a, 0L).f82120d;
            this.Y = jm1.H;
        } else {
            fm1Var = null;
        }
        if (zBooleanValue || !ce2Var2.f76258j.equals(ce2Var.f76258j)) {
            jm1 jm1Var = this.Y;
            jm1Var.getClass();
            im1 im1Var = new im1(jm1Var);
            List list = ce2Var.f76258j;
            for (int i16 = 0; i16 < list.size(); i16++) {
                ts1 ts1Var = (ts1) list.get(i16);
                int i17 = 0;
                while (true) {
                    ss1[] ss1VarArr = ts1Var.f83163b;
                    if (i17 < ss1VarArr.length) {
                        ss1VarArr[i17].a(im1Var);
                        i17++;
                    }
                }
            }
            this.Y = new jm1(im1Var);
            jm1VarA = a();
        }
        boolean z13 = !jm1VarA.equals(this.G);
        this.G = jm1VarA;
        boolean z14 = ce2Var2.f76260l != ce2Var.f76260l;
        boolean z15 = ce2Var2.f76253e != ce2Var.f76253e;
        if (z15 || z14) {
            q();
        }
        boolean z16 = ce2Var2.f76255g != ce2Var.f76255g;
        if (!ce2Var2.f76249a.equals(ce2Var.f76249a)) {
            this.f85527j.a(0, new mf1() { // from class: cp.rd
                @Override // yads.mf1
                public final void invoke(Object obj5) {
                    zn0.a(ce2Var, i10, (me2) obj5);
                }
            });
        }
        if (z10) {
            p63 p63Var = new p63();
            if (ce2Var2.f76249a.c()) {
                obj = null;
                i14 = -1;
                fm1Var2 = null;
                obj2 = null;
                i15 = -1;
            } else {
                Object obj5 = ce2Var2.f76250b.f82311a;
                ce2Var2.f76249a.a(obj5, p63Var);
                int i18 = p63Var.f81268d;
                int iA2 = ce2Var2.f76249a.a(obj5);
                obj2 = obj5;
                obj = ce2Var2.f76249a.a(i18, this.f81910a, 0L).f82118b;
                fm1Var2 = this.f81910a.f82120d;
                i14 = i18;
                i15 = iA2;
            }
            if (i12 == 0) {
                if (ce2Var2.f76250b.a()) {
                    ym1 ym1Var = ce2Var2.f76250b;
                    jB = p63Var.a(ym1Var.f82312b, ym1Var.f82313c);
                    jB2 = b(ce2Var2);
                } else {
                    if (ce2Var2.f76250b.f82315e != -1) {
                        jB = b(this.Z);
                    } else {
                        j11 = p63Var.f81270f;
                        j12 = p63Var.f81269e;
                        jB = j11 + j12;
                    }
                    jB2 = jB;
                }
            } else if (ce2Var2.f76250b.a()) {
                jB = ce2Var2.f76266r;
                jB2 = b(ce2Var2);
            } else {
                j11 = p63Var.f81270f;
                j12 = ce2Var2.f76266r;
                jB = j11 + j12;
                jB2 = jB;
            }
            long jB3 = ib3.b(jB);
            long jB4 = ib3.b(jB2);
            ym1 ym1Var2 = ce2Var2.f76250b;
            final ne2 ne2Var = new ne2(obj, i14, fm1Var2, obj2, i15, jB3, jB4, ym1Var2.f82312b, ym1Var2.f82313c);
            int iE = e();
            if (this.Z.f76249a.c()) {
                obj3 = null;
                fm1Var3 = null;
                obj4 = null;
                iA = -1;
            } else {
                ce2 ce2Var3 = this.Z;
                Object obj6 = ce2Var3.f76250b.f82311a;
                ce2Var3.f76249a.a(obj6, this.f85529l);
                iA = this.Z.f76249a.a(obj6);
                obj3 = this.Z.f76249a.a(iE, this.f81910a, 0L).f82118b;
                fm1Var3 = this.f81910a.f82120d;
                obj4 = obj6;
            }
            long jB5 = ib3.b(j10);
            long jB6 = this.Z.f76250b.a() ? ib3.b(b(this.Z)) : jB5;
            ym1 ym1Var3 = this.Z.f76250b;
            final ne2 ne2Var2 = new ne2(obj3, iE, fm1Var3, obj4, iA, jB5, jB6, ym1Var3.f82312b, ym1Var3.f82313c);
            this.f85527j.a(11, new mf1() { // from class: cp.wd
                @Override // yads.mf1
                public final void invoke(Object obj7) {
                    zn0.a(i12, ne2Var, ne2Var2, (me2) obj7);
                }
            });
        } else {
            z15 = z15;
            z16 = z16;
        }
        if (zBooleanValue) {
            pf1 pf1Var = this.f85527j;
            mf1 mf1Var = new mf1() { // from class: cp.xd
                @Override // yads.mf1
                public final void invoke(Object obj7) {
                    ((me2) obj7).a(fm1Var, iIntValue);
                }
            };
            z11 = true;
            pf1Var.a(1, mf1Var);
        } else {
            z11 = true;
        }
        if (ce2Var2.f76254f != ce2Var.f76254f) {
            this.f85527j.a(10, new mf1() { // from class: cp.yd
                @Override // yads.mf1
                public final void invoke(Object obj7) {
                    ((me2) obj7).b(ce2Var.f76254f);
                }
            });
            if (ce2Var.f76254f != null) {
                this.f85527j.a(10, new mf1() { // from class: cp.fd
                    @Override // yads.mf1
                    public final void invoke(Object obj7) {
                        ((me2) obj7).a(ce2Var.f76254f);
                    }
                });
            }
        }
        t73 t73Var = ce2Var2.f76257i;
        t73 t73Var2 = ce2Var.f76257i;
        if (t73Var != t73Var2) {
            s73 s73Var = this.f85524g;
            Object obj7 = t73Var2.f82911e;
            ((mi1) s73Var).getClass();
            this.f85527j.a(2, new mf1() { // from class: cp.gd
                @Override // yads.mf1
                public final void invoke(Object obj8) {
                    ((me2) obj8).a(ce2Var.f76257i.f82910d);
                }
            });
        }
        if (z13) {
            final jm1 jm1Var2 = this.G;
            this.f85527j.a(14, new mf1() { // from class: cp.hd
                @Override // yads.mf1
                public final void invoke(Object obj8) {
                    ((me2) obj8).a(jm1Var2);
                }
            });
        }
        if (z16) {
            this.f85527j.a(3, new mf1() { // from class: cp.id
                @Override // yads.mf1
                public final void invoke(Object obj8) {
                    zn0.d(ce2Var, (me2) obj8);
                }
            });
        }
        if (z15 || z14) {
            this.f85527j.a(-1, new mf1() { // from class: cp.jd
                @Override // yads.mf1
                public final void invoke(Object obj8) {
                    ce2 ce2Var4 = ce2Var;
                    ((me2) obj8).onPlayerStateChanged(ce2Var4.f76260l, ce2Var4.f76253e);
                }
            });
        }
        if (z15) {
            this.f85527j.a(4, new mf1() { // from class: cp.kd
                @Override // yads.mf1
                public final void invoke(Object obj8) {
                    ((me2) obj8).onPlaybackStateChanged(ce2Var.f76253e);
                }
            });
        }
        if (z14) {
            this.f85527j.a(5, new mf1() { // from class: cp.sd
                @Override // yads.mf1
                public final void invoke(Object obj8) {
                    me2 me2Var = (me2) obj8;
                    me2Var.onPlayWhenReadyChanged(ce2Var.f76260l, i11);
                }
            });
        }
        if (ce2Var2.f76261m != ce2Var.f76261m) {
            this.f85527j.a(6, new mf1() { // from class: cp.td
                @Override // yads.mf1
                public final void invoke(Object obj8) {
                    ((me2) obj8).onPlaybackSuppressionReasonChanged(ce2Var.f76261m);
                }
            });
        }
        if (((ce2Var2.f76253e == 3 && ce2Var2.f76260l && ce2Var2.f76261m == 0) ? z11 : false) != ((ce2Var.f76253e == 3 && ce2Var.f76260l && ce2Var.f76261m == 0) ? z11 : false)) {
            this.f85527j.a(7, new mf1() { // from class: cp.ud
                @Override // yads.mf1
                public final void invoke(Object obj8) {
                    zn0.h(ce2Var, (me2) obj8);
                }
            });
        }
        if (!ce2Var2.f76262n.equals(ce2Var.f76262n)) {
            this.f85527j.a(12, new mf1() { // from class: cp.vd
                @Override // yads.mf1
                public final void invoke(Object obj8) {
                    ((me2) obj8).a(ce2Var.f76262n);
                }
            });
        }
        p();
        this.f85527j.a();
        if (ce2Var2.f76263o != ce2Var.f76263o) {
            Iterator it = this.f85528k.iterator();
            while (it.hasNext()) {
                ((wn0) ((qn0) it.next())).f84275a.q();
            }
        }
    }

    public static ig0 a(c43 c43Var) {
        return new ig0(0, c43Var.a(), c43Var.f76161d.getStreamMaxVolume(c43Var.f76164g));
    }
}
