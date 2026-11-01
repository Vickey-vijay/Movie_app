package jl;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.DisplayMetrics;
import android.view.Choreographer;
import java.util.LinkedList;
import kl.k;
import master.flame.danmaku.danmaku.model.android.DanmakuContext;
import tv.cjump.jni.DanDeviceUtils;

/* JADX INFO: compiled from: DrawHandler.java */
/* JADX INFO: loaded from: classes11.dex */
public class c extends Handler {
    public boolean A;
    public boolean B;
    public boolean C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DanmakuContext f61871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e f61872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f61873c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f61874d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f61875e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f61876f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public d f61877g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public kl.e f61878h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public nl.a f61879i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public h f61880j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public g f61881k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f61882l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public kl.a f61883m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ol.a.b f61884n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public LinkedList<Long> f61885o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public i f61886p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f61887q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f61888r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f61889s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f61890t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f61891u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f61892v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f61893w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f61894x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f61895y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f61896z;

    /* JADX INFO: compiled from: DrawHandler.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.f61873c = 0L;
            c.this.f61876f = true;
            if (c.this.f61877g != null) {
                c.this.f61877g.d();
            }
        }
    }

    /* JADX INFO: compiled from: DrawHandler.java */
    public class b extends i {
        public b(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            long jB = ql.b.b();
            while (!a() && !c.this.f61874d) {
                long jB2 = ql.b.b();
                if (c.this.f61890t - (ql.b.b() - jB) <= 1 || c.this.C) {
                    long jV = c.this.V(jB2);
                    if (jV < 0 && !c.this.C) {
                        ql.b.a(60 - jV);
                    } else {
                        long jB3 = c.this.f61881k.b();
                        if (jB3 > c.this.f61889s) {
                            c.this.f61878h.a(jB3);
                            c.this.f61885o.clear();
                        }
                        if (!c.this.f61882l) {
                            c.this.a0(10000000L);
                        } else if (c.this.f61884n.f65418p && c.this.B) {
                            long j10 = c.this.f61884n.f65417o - c.this.f61878h.f62916a;
                            if (j10 > 500) {
                                c.this.H();
                                c.this.a0(j10 - 10);
                            }
                        }
                    }
                    jB = jB2;
                } else {
                    ql.b.a(1L);
                }
            }
        }
    }

    /* JADX INFO: renamed from: jl.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DrawHandler.java */
    public class C0555c implements h.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Runnable f61899a;

        public C0555c(Runnable runnable) {
            this.f61899a = runnable;
        }

        @Override // jl.h.a
        public void a(kl.c cVar) {
            if (c.this.f61877g != null) {
                c.this.f61877g.b(cVar);
            }
        }

        @Override // jl.h.a
        public void b() {
            c.this.D();
            this.f61899a.run();
        }

        @Override // jl.h.a
        public void d() {
            if (c.this.f61877g != null) {
                c.this.f61877g.c();
            }
        }

        @Override // jl.h.a
        public void e() {
            c.this.O();
        }

        @Override // jl.h.a
        public void c(kl.c cVar) {
            if (cVar.v()) {
                return;
            }
            long jB = cVar.b() - c.this.A();
            if (jB < c.this.f61871a.f64339z.f63689f && (c.this.A || c.this.f61884n.f65418p)) {
                c.this.H();
            } else if (jB > 0 && jB <= c.this.f61871a.f64339z.f63689f) {
                c.this.sendEmptyMessageDelayed(11, jB);
            }
        }
    }

    /* JADX INFO: compiled from: DrawHandler.java */
    public interface d {
        void a(kl.e eVar);

        void b(kl.c cVar);

        void c();

        void d();
    }

    /* JADX INFO: compiled from: DrawHandler.java */
    @TargetApi(16)
    public class e implements Choreographer.FrameCallback {
        public e() {
        }

        public /* synthetic */ e(c cVar, a aVar) {
            this();
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j10) {
            c.this.sendEmptyMessage(2);
        }
    }

    public void I() {
        removeMessages(3);
        W();
        sendEmptyMessage(7);
    }

    public void J() {
        this.f61876f = false;
        if (this.f61871a.B == 0) {
            this.f61872b = new e(this, null);
        }
        this.f61887q = this.f61871a.B == 1;
        sendEmptyMessage(5);
    }

    public void L() {
        this.f61874d = true;
        sendEmptyMessage(6);
    }

    public final synchronized void M() {
        i iVar = this.f61886p;
        this.f61886p = null;
        if (iVar != null) {
            synchronized (this.f61880j) {
                this.f61880j.notifyAll();
            }
            iVar.c();
            try {
                iVar.join(2000L);
            } catch (InterruptedException e10) {
                e10.printStackTrace();
            }
        }
    }

    public final synchronized void N() {
        this.f61885o.addLast(Long.valueOf(ql.b.b()));
        if (this.f61885o.size() > 500) {
            this.f61885o.removeFirst();
        }
    }

    public void P() {
        removeMessages(7);
        sendEmptyMessage(3);
    }

    public void Q(Long l10) {
        this.f61893w = true;
        this.f61894x = l10.longValue();
        removeMessages(2);
        removeMessages(3);
        removeMessages(4);
        obtainMessage(4, l10).sendToTarget();
    }

    public final synchronized long y() {
        int size = this.f61885o.size();
        if (size <= 0) {
            return 0L;
        }
        Long lPeekFirst = this.f61885o.peekFirst();
        Long lPeekLast = this.f61885o.peekLast();
        if (lPeekFirst != null && lPeekLast != null) {
            return (lPeekLast.longValue() - lPeekFirst.longValue()) / ((long) size);
        }
        return 0L;
    }

    public long A() {
        long jB;
        long j10;
        if (!this.f61876f) {
            return 0L;
        }
        if (this.f61893w) {
            return this.f61894x;
        }
        if (this.f61874d || !this.A) {
            jB = this.f61878h.f62916a;
            j10 = this.f61895y;
        } else {
            jB = ql.b.b();
            j10 = this.f61875e;
        }
        return jB - j10;
    }

    public k B() {
        h hVar = this.f61880j;
        if (hVar != null) {
            return hVar.c(A());
        }
        return null;
    }

    public long C(boolean z10) {
        if (!this.f61882l) {
            return this.f61878h.f62916a;
        }
        this.f61882l = false;
        removeMessages(8);
        removeMessages(9);
        obtainMessage(9, Boolean.valueOf(z10)).sendToTarget();
        return this.f61878h.f62916a;
    }

    public final void D() {
        long jMax = Math.max(33L, (long) (16 * 2.5f));
        this.f61888r = jMax;
        this.f61889s = (long) (jMax * 2.5f);
        long jMax2 = Math.max(16L, 15L);
        this.f61890t = jMax2;
        this.f61891u = jMax2 + 3;
    }

    public boolean E() {
        return this.f61876f;
    }

    public boolean F() {
        return this.f61874d;
    }

    public void G(int i10, int i11) {
        kl.a aVar = this.f61883m;
        if (aVar == null) {
            return;
        }
        if (aVar.getWidth() == i10 && this.f61883m.getHeight() == i11) {
            return;
        }
        this.f61883m.p(i10, i11);
        obtainMessage(10, Boolean.TRUE).sendToTarget();
    }

    public final void H() {
        if (this.A) {
            h hVar = this.f61880j;
            if (hVar != null) {
                hVar.f();
            }
            if (this.f61887q) {
                synchronized (this) {
                    this.f61885o.clear();
                }
                synchronized (this.f61880j) {
                    this.f61880j.notifyAll();
                }
            } else {
                this.f61885o.clear();
                removeMessages(2);
                sendEmptyMessage(2);
            }
            this.A = false;
        }
    }

    public final void K(Runnable runnable) {
        if (this.f61880j == null) {
            this.f61880j = w(this.f61881k.e(), this.f61878h, this.f61881k.getContext(), this.f61881k.getViewWidth(), this.f61881k.getViewHeight(), this.f61881k.isHardwareAccelerated(), new C0555c(runnable));
        } else {
            runnable.run();
        }
    }

    public final void O() {
        if (this.f61874d && this.f61882l) {
            removeMessages(12);
            sendEmptyMessageDelayed(12, 100L);
        }
    }

    public void R(d dVar) {
        this.f61877g = dVar;
    }

    public void S(DanmakuContext danmakuContext) {
        this.f61871a = danmakuContext;
    }

    public void T(nl.a aVar) {
        this.f61879i = aVar;
        kl.e eVarC = aVar.c();
        if (eVarC != null) {
            this.f61878h = eVarC;
        }
    }

    public void U(Long l10) {
        if (this.f61882l) {
            return;
        }
        this.f61882l = true;
        removeMessages(8);
        removeMessages(9);
        obtainMessage(8, l10).sendToTarget();
    }

    public final long V(long j10) {
        long jB = 0;
        if (!this.f61893w && !this.f61896z) {
            this.f61896z = true;
            long j11 = j10 - this.f61875e;
            if (this.C) {
                d dVar = this.f61877g;
                if (dVar != null) {
                    dVar.a(this.f61878h);
                    jB = this.f61878h.b();
                }
            } else if (!this.f61882l || this.f61884n.f65418p || this.A) {
                this.f61878h.update(j11);
                this.f61895y = 0L;
                d dVar2 = this.f61877g;
                if (dVar2 != null) {
                    dVar2.a(this.f61878h);
                }
            } else {
                long j12 = j11 - this.f61878h.f62916a;
                long jMax = Math.max(this.f61890t, y());
                if (j12 <= 2000) {
                    long j13 = this.f61884n.f65415m;
                    long j14 = this.f61888r;
                    if (j13 <= j14 && jMax <= j14) {
                        long j15 = this.f61890t;
                        long jMin = Math.min(this.f61888r, Math.max(j15, jMax + (j12 / j15)));
                        long j16 = this.f61892v;
                        long j17 = jMin - j16;
                        if (j17 > 3 && j17 < 8 && j16 >= this.f61890t && j16 <= this.f61888r) {
                            jMin = j16;
                        }
                        long j18 = j12 - jMin;
                        this.f61892v = jMin;
                        j12 = jMin;
                        jB = j18;
                    }
                }
                this.f61895y = jB;
                this.f61878h.a(j12);
                d dVar3 = this.f61877g;
                if (dVar3 != null) {
                    dVar3.a(this.f61878h);
                }
                jB = j12;
            }
            this.f61896z = false;
        }
        return jB;
    }

    public final void W() {
        if (this.A) {
            V(ql.b.b());
        }
    }

    @TargetApi(16)
    public final void X() {
        if (this.f61874d) {
            return;
        }
        Choreographer.getInstance().postFrameCallback(this.f61872b);
        if (V(ql.b.b()) < 0) {
            removeMessages(2);
            return;
        }
        long jB = this.f61881k.b();
        removeMessages(2);
        if (jB > this.f61889s) {
            this.f61878h.a(jB);
            this.f61885o.clear();
        }
        if (!this.f61882l) {
            a0(10000000L);
            return;
        }
        ol.a.b bVar = this.f61884n;
        if (bVar.f65418p && this.B) {
            long j10 = bVar.f65417o - this.f61878h.f62916a;
            if (j10 > 500) {
                a0(j10 - 10);
            }
        }
    }

    public final void Y() {
        if (this.f61874d) {
            return;
        }
        long jV = V(ql.b.b());
        if (jV < 0 && !this.C) {
            removeMessages(2);
            sendEmptyMessageDelayed(2, 60 - jV);
            return;
        }
        long jB = this.f61881k.b();
        removeMessages(2);
        if (jB > this.f61889s) {
            this.f61878h.a(jB);
            this.f61885o.clear();
        }
        if (!this.f61882l) {
            a0(10000000L);
            return;
        }
        ol.a.b bVar = this.f61884n;
        if (bVar.f65418p && this.B) {
            long j10 = bVar.f65417o - this.f61878h.f62916a;
            if (j10 > 500) {
                a0(j10 - 10);
                return;
            }
        }
        long j11 = this.f61890t;
        if (jB < j11) {
            sendEmptyMessageDelayed(2, j11 - jB);
        } else {
            sendEmptyMessage(2);
        }
    }

    public final void Z() {
        if (this.f61886p != null) {
            return;
        }
        b bVar = new b("DFM Update");
        this.f61886p = bVar;
        bVar.start();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:101:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:61:0x0103  */
    /* JADX WARN: Code duplicated, block: B:63:0x010e  */
    /* JADX WARN: Code duplicated, block: B:65:0x0112  */
    /* JADX WARN: Code duplicated, block: B:68:0x0119  */
    /* JADX WARN: Code duplicated, block: B:71:0x0126  */
    /* JADX WARN: Code duplicated, block: B:88:0x0171  */
    /* JADX WARN: Code duplicated, block: B:89:0x0178  */
    /* JADX WARN: Code duplicated, block: B:92:0x017f  */
    /* JADX WARN: Code duplicated, block: B:94:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:98:0x01bf  */
    @Override // android.os.Handler
    public void handleMessage(Message message) {
        h hVar;
        Long l10;
        h hVar2;
        Long l11;
        h hVar3;
        nl.a aVar;
        h hVar4;
        boolean z10;
        g gVar;
        h hVar5;
        int i10 = message.what;
        switch (i10) {
            case 1:
                l11 = (Long) message.obj;
                if (l11 != null) {
                    this.f61873c = l11.longValue();
                } else {
                    this.f61873c = 0L;
                }
                if (i10 == 4) {
                    this.f61874d = true;
                    M();
                    l10 = (Long) message.obj;
                    long jLongValue = l10.longValue();
                    kl.e eVar = this.f61878h;
                    this.f61875e -= jLongValue - eVar.f62916a;
                    eVar.update(l10.longValue());
                    this.f61871a.f64337x.d();
                    hVar2 = this.f61880j;
                    if (hVar2 != null) {
                        hVar2.seek(l10.longValue());
                    }
                    this.f61873c = l10.longValue();
                }
                removeMessages(7);
                this.f61874d = false;
                if (this.f61876f) {
                    sendEmptyMessageDelayed(3, 100L);
                } else {
                    this.f61884n.d();
                    this.f61885o.clear();
                    long jB = ql.b.b();
                    long j10 = this.f61873c;
                    this.f61875e = jB - j10;
                    this.f61878h.update(j10);
                    removeMessages(3);
                    sendEmptyMessage(2);
                    this.f61880j.start();
                    H();
                    this.f61893w = false;
                    hVar = this.f61880j;
                    if (hVar != null) {
                        hVar.onPlayStateChanged(1);
                    }
                }
                break;
            case 2:
                byte b10 = this.f61871a.B;
                if (b10 == 0) {
                    X();
                } else if (b10 == 1) {
                    Z();
                } else if (b10 == 2) {
                    Y();
                }
                break;
            case 3:
                removeMessages(7);
                this.f61874d = false;
                if (this.f61876f) {
                    sendEmptyMessageDelayed(3, 100L);
                } else {
                    this.f61884n.d();
                    this.f61885o.clear();
                    long jB2 = ql.b.b();
                    long j11 = this.f61873c;
                    this.f61875e = jB2 - j11;
                    this.f61878h.update(j11);
                    removeMessages(3);
                    sendEmptyMessage(2);
                    this.f61880j.start();
                    H();
                    this.f61893w = false;
                    hVar = this.f61880j;
                    if (hVar != null) {
                        hVar.onPlayStateChanged(1);
                    }
                }
                break;
            case 4:
                if (i10 == 4) {
                    this.f61874d = true;
                    M();
                    l10 = (Long) message.obj;
                    long jLongValue2 = l10.longValue();
                    kl.e eVar2 = this.f61878h;
                    this.f61875e -= jLongValue2 - eVar2.f62916a;
                    eVar2.update(l10.longValue());
                    this.f61871a.f64337x.d();
                    hVar2 = this.f61880j;
                    if (hVar2 != null) {
                        hVar2.seek(l10.longValue());
                    }
                    this.f61873c = l10.longValue();
                }
                removeMessages(7);
                this.f61874d = false;
                if (this.f61876f) {
                    sendEmptyMessageDelayed(3, 100L);
                } else {
                    this.f61884n.d();
                    this.f61885o.clear();
                    long jB3 = ql.b.b();
                    long j12 = this.f61873c;
                    this.f61875e = jB3 - j12;
                    this.f61878h.update(j12);
                    removeMessages(3);
                    sendEmptyMessage(2);
                    this.f61880j.start();
                    H();
                    this.f61893w = false;
                    hVar = this.f61880j;
                    if (hVar != null) {
                        hVar.onPlayStateChanged(1);
                    }
                }
                break;
            case 5:
                this.f61875e = ql.b.b();
                if (this.f61879i != null && this.f61881k.d()) {
                    K(new a());
                } else {
                    sendEmptyMessageDelayed(5, 100L);
                }
                break;
            case 6:
                if (i10 == 6) {
                    removeCallbacksAndMessages(null);
                }
                this.f61874d = true;
                W();
                this.f61873c = this.f61878h.f62916a;
                if (this.f61887q) {
                    H();
                    M();
                }
                if (this.f61872b != null) {
                    Choreographer.getInstance().removeFrameCallback(this.f61872b);
                }
                if (i10 == 6) {
                    hVar3 = this.f61880j;
                    if (hVar3 != null) {
                        hVar3.i();
                    }
                    aVar = this.f61879i;
                    if (aVar != null) {
                        aVar.f();
                    }
                    if (getLooper() != Looper.getMainLooper()) {
                        getLooper().quit();
                    }
                }
                break;
            case 7:
                removeMessages(3);
                removeMessages(2);
                hVar4 = this.f61880j;
                if (hVar4 != null) {
                    hVar4.onPlayStateChanged(2);
                }
                if (i10 == 6) {
                    removeCallbacksAndMessages(null);
                }
                this.f61874d = true;
                W();
                this.f61873c = this.f61878h.f62916a;
                if (this.f61887q) {
                    H();
                    M();
                }
                if (this.f61872b != null) {
                    Choreographer.getInstance().removeFrameCallback(this.f61872b);
                }
                if (i10 == 6) {
                    hVar3 = this.f61880j;
                    if (hVar3 != null) {
                        hVar3.i();
                    }
                    aVar = this.f61879i;
                    if (aVar != null) {
                        aVar.f();
                    }
                    if (getLooper() != Looper.getMainLooper()) {
                        getLooper().quit();
                    }
                }
                break;
            case 8:
                this.f61882l = true;
                Long l12 = (Long) message.obj;
                h hVar6 = this.f61880j;
                if (hVar6 == null) {
                    z10 = false;
                } else if (l12 == null) {
                    this.f61878h.update(A());
                    this.f61880j.f();
                    z10 = false;
                } else {
                    hVar6.start();
                    this.f61880j.seek(l12.longValue());
                    this.f61880j.f();
                    z10 = true;
                }
                if (this.f61874d && (gVar = this.f61881k) != null) {
                    gVar.b();
                }
                H();
                if (!z10) {
                }
                l11 = (Long) message.obj;
                if (l11 != null) {
                    this.f61873c = l11.longValue();
                } else {
                    this.f61873c = 0L;
                }
                if (i10 == 4) {
                    this.f61874d = true;
                    M();
                    l10 = (Long) message.obj;
                    long jLongValue3 = l10.longValue();
                    kl.e eVar3 = this.f61878h;
                    this.f61875e -= jLongValue3 - eVar3.f62916a;
                    eVar3.update(l10.longValue());
                    this.f61871a.f64337x.d();
                    hVar2 = this.f61880j;
                    if (hVar2 != null) {
                        hVar2.seek(l10.longValue());
                    }
                    this.f61873c = l10.longValue();
                }
                removeMessages(7);
                this.f61874d = false;
                if (this.f61876f) {
                    sendEmptyMessageDelayed(3, 100L);
                } else {
                    this.f61884n.d();
                    this.f61885o.clear();
                    long jB4 = ql.b.b();
                    long j13 = this.f61873c;
                    this.f61875e = jB4 - j13;
                    this.f61878h.update(j13);
                    removeMessages(3);
                    sendEmptyMessage(2);
                    this.f61880j.start();
                    H();
                    this.f61893w = false;
                    hVar = this.f61880j;
                    if (hVar != null) {
                        hVar.onPlayStateChanged(1);
                    }
                }
                break;
            case 9:
                this.f61882l = false;
                g gVar2 = this.f61881k;
                if (gVar2 != null) {
                    gVar2.clear();
                }
                h hVar7 = this.f61880j;
                if (hVar7 != null) {
                    hVar7.f();
                    this.f61880j.j();
                }
                Boolean bool = (Boolean) message.obj;
                if (bool.booleanValue() && (hVar5 = this.f61880j) != null) {
                    hVar5.i();
                }
                if (!bool.booleanValue()) {
                }
                removeMessages(3);
                removeMessages(2);
                hVar4 = this.f61880j;
                if (hVar4 != null) {
                    hVar4.onPlayStateChanged(2);
                }
                if (i10 == 6) {
                    removeCallbacksAndMessages(null);
                }
                this.f61874d = true;
                W();
                this.f61873c = this.f61878h.f62916a;
                if (this.f61887q) {
                    H();
                    M();
                }
                if (this.f61872b != null) {
                    Choreographer.getInstance().removeFrameCallback(this.f61872b);
                }
                if (i10 == 6) {
                    hVar3 = this.f61880j;
                    if (hVar3 != null) {
                        hVar3.i();
                    }
                    aVar = this.f61879i;
                    if (aVar != null) {
                        aVar.f();
                    }
                    if (getLooper() != Looper.getMainLooper()) {
                        getLooper().quit();
                    }
                }
                break;
            case 10:
                DanmakuContext danmakuContext = this.f61871a;
                danmakuContext.f64339z.f(danmakuContext);
                Boolean bool2 = (Boolean) message.obj;
                if (bool2 != null && bool2.booleanValue()) {
                    this.f61871a.f64337x.d();
                    this.f61871a.f64337x.g();
                    this.f61880j.h();
                    break;
                }
                break;
            case 11:
                H();
                break;
            case 12:
                if (this.f61874d && this.f61881k != null) {
                    this.f61880j.f();
                    this.f61881k.b();
                    H();
                    break;
                }
                break;
            case 13:
                h hVar8 = this.f61880j;
                if (hVar8 != null) {
                    hVar8.e(A());
                }
                break;
            case 14:
                h hVar9 = this.f61880j;
                if (hVar9 != null) {
                    hVar9.d();
                }
                break;
        }
    }

    public void u(kl.c cVar) {
        if (this.f61880j != null) {
            cVar.H = this.f61871a.f64337x;
            cVar.B(this.f61878h);
            this.f61880j.a(cVar);
            obtainMessage(11).sendToTarget();
        }
    }

    public final void v(g gVar) {
        this.f61881k = gVar;
    }

    public final h w(boolean z10, kl.e eVar, Context context, int i10, int i11, boolean z11, h.a aVar) {
        kl.a aVarB = this.f61871a.b();
        this.f61883m = aVarB;
        aVarB.p(i10, i11);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.f61883m.c(displayMetrics.density, displayMetrics.densityDpi, displayMetrics.scaledDensity);
        this.f61883m.a(this.f61871a.f64317d);
        this.f61883m.j(z11);
        h aVar2 = z10 ? new jl.a(eVar, this.f61871a, aVar) : new jl.e(eVar, this.f61871a, aVar);
        aVar2.b(this.f61879i);
        aVar2.prepare();
        obtainMessage(10, Boolean.FALSE).sendToTarget();
        return aVar2;
    }

    public ol.a.b x(Canvas canvas) {
        if (this.f61880j == null) {
            return this.f61884n;
        }
        if (!this.A) {
            this.f61871a.getClass();
        }
        this.f61883m.v(canvas);
        this.f61884n.e(this.f61880j.g(this.f61883m));
        N();
        return this.f61884n;
    }

    public DanmakuContext z() {
        return this.f61871a;
    }

    public c(Looper looper, g gVar, boolean z10) {
        super(looper);
        this.f61873c = 0L;
        this.f61874d = true;
        this.f61878h = new kl.e();
        this.f61882l = true;
        this.f61884n = new ol.a.b();
        this.f61885o = new LinkedList<>();
        this.f61888r = 30L;
        this.f61889s = 60L;
        this.f61890t = 16L;
        this.B = true ^ DanDeviceUtils.f();
        v(gVar);
        if (z10) {
            U(null);
        } else {
            C(false);
        }
        this.f61882l = z10;
    }

    public final void a0(long j10) {
        if (!F() && E() && !this.f61893w) {
            this.f61884n.f65419q = ql.b.b();
            this.A = true;
            if (this.f61887q) {
                if (this.f61886p == null) {
                    return;
                }
                try {
                    synchronized (this.f61880j) {
                        try {
                            if (j10 == 10000000) {
                                this.f61880j.wait();
                            } else {
                                this.f61880j.wait(j10);
                            }
                            sendEmptyMessage(11);
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return;
                } catch (InterruptedException e10) {
                    e10.printStackTrace();
                    return;
                }
            }
            if (j10 == 10000000) {
                removeMessages(11);
                removeMessages(2);
            } else {
                removeMessages(11);
                removeMessages(2);
                sendEmptyMessageDelayed(11, j10);
            }
        }
    }
}
