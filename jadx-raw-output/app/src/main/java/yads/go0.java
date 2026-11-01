package yads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes11.dex */
public final class go0 implements Handler.Callback, om1, r73, hn1, ce0, ze2 {
    public boolean A;
    public boolean C;
    public boolean D;
    public boolean E;
    public int F;
    public boolean H;
    public boolean I;
    public boolean J;
    public int K;
    public fo0 L;
    public long M;
    public int N;
    public boolean O;
    public pn0 P;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ro[] f77873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f77874c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ro[] f77875d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s73 f77876e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t73 f77877f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final sf1 f77878g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final im f77879h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final i53 f77880i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final HandlerThread f77881j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Looper f77882k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final r63 f77883l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p63 f77884m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f77885n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f77886o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final de0 f77887p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ArrayList f77888q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final xv f77889r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final do0 f77890s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final tm1 f77891t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final in1 f77892u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final rf1 f77893v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final long f77894w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ww2 f77895x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ce2 f77896y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public co0 f77897z;
    public boolean G = false;
    public boolean B = false;
    public long Q = -9223372036854775807L;

    public go0(ro[] roVarArr, s73 s73Var, t73 t73Var, sf1 sf1Var, im imVar, int i10, se seVar, ww2 ww2Var, yd0 yd0Var, long j10, Looper looper, f53 f53Var, do0 do0Var, ye2 ye2Var) {
        this.f77890s = do0Var;
        this.f77873b = roVarArr;
        this.f77876e = s73Var;
        this.f77877f = t73Var;
        this.f77878g = sf1Var;
        this.f77879h = imVar;
        this.F = i10;
        this.f77895x = ww2Var;
        this.f77893v = yd0Var;
        this.f77894w = j10;
        this.f77889r = f53Var;
        zd0 zd0Var = (zd0) sf1Var;
        this.f77885n = zd0Var.a();
        this.f77886o = zd0Var.b();
        ce2 ce2VarA = ce2.a(t73Var);
        this.f77896y = ce2VarA;
        this.f77897z = new co0(ce2VarA);
        this.f77875d = new ro[roVarArr.length];
        for (int i11 = 0; i11 < roVarArr.length; i11++) {
            roVarArr[i11].a(i11, ye2Var);
            this.f77875d[i11] = roVarArr[i11].b();
        }
        this.f77887p = new de0(this, f53Var);
        this.f77888q = new ArrayList();
        this.f77874c = ly2.a();
        this.f77883l = new r63();
        this.f77884m = new p63();
        s73Var.a(this, imVar);
        this.O = true;
        Handler handler = new Handler(looper);
        this.f77891t = new tm1(seVar, handler);
        this.f77892u = new in1(this, seVar, handler, ye2Var);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.f77881j = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.f77882k = looper2;
        this.f77880i = f53Var.a(looper2, this);
    }

    public final void a(bo0 bo0Var, int i10) {
        this.f77897z.a(1);
        in1 in1Var = this.f77892u;
        if (i10 == -1) {
            i10 = in1Var.f78727b.size();
        }
        a(in1Var.a(i10, bo0Var.f75916a, bo0Var.f75917b), false);
    }

    public final long b() {
        qm1 qm1Var = this.f77891t.f83094i;
        if (qm1Var == null) {
            return 0L;
        }
        long jMax = qm1Var.f81902o;
        if (!qm1Var.f81891d) {
            return jMax;
        }
        int i10 = 0;
        while (true) {
            ro[] roVarArr = this.f77873b;
            if (i10 >= roVarArr.length) {
                return jMax;
            }
            if (b(roVarArr[i10])) {
                ro roVar = this.f77873b[i10];
                if (roVar.f82360h != qm1Var.f81890c[i10]) {
                    continue;
                } else {
                    long j10 = roVar.f82363k;
                    if (j10 == Long.MIN_VALUE) {
                        return Long.MIN_VALUE;
                    }
                    jMax = Math.max(j10, jMax);
                }
            }
            i10++;
        }
    }

    public final void c(pm1 pm1Var) throws pn0 {
        qm1 qm1Var = this.f77891t.f83095j;
        if (qm1Var == null || qm1Var.f81888a != pm1Var) {
            return;
        }
        float f10 = this.f77887p.getPlaybackParameters().f77040b;
        s63 s63Var = this.f77896y.f76249a;
        qm1Var.f81891d = true;
        i73 trackGroups = qm1Var.f81888a.getTrackGroups();
        qm1Var.f81900m = trackGroups;
        t73 t73VarA = qm1Var.f81897j.a(qm1Var.f81896i, trackGroups, qm1Var.f81893f.f82688a, s63Var);
        for (op0 op0Var : t73VarA.f82909c) {
            if (op0Var != null) {
                op0Var.a(f10);
            }
        }
        sm1 sm1Var = qm1Var.f81893f;
        long jMax = sm1Var.f82689b;
        long j10 = sm1Var.f82692e;
        if (j10 != -9223372036854775807L && jMax >= j10) {
            jMax = Math.max(0L, j10 - 1);
        }
        long jA = qm1Var.a(t73VarA, jMax, false, new boolean[qm1Var.f81896i.length]);
        long j11 = qm1Var.f81902o;
        sm1 sm1Var2 = qm1Var.f81893f;
        long j12 = sm1Var2.f82689b;
        qm1Var.f81902o = (j12 - jA) + j11;
        if (jA != j12) {
            sm1Var2 = new sm1(sm1Var2.f82688a, jA, sm1Var2.f82690c, sm1Var2.f82691d, sm1Var2.f82692e, sm1Var2.f82693f, sm1Var2.f82694g, sm1Var2.f82695h, sm1Var2.f82696i);
        }
        qm1Var.f81893f = sm1Var2;
        a(qm1Var.f81901n);
        if (qm1Var == this.f77891t.f83093h) {
            b(qm1Var.f81893f.f82689b);
            a(new boolean[this.f77873b.length]);
            ce2 ce2Var = this.f77896y;
            ym1 ym1Var = ce2Var.f76250b;
            long j13 = qm1Var.f81893f.f82689b;
            this.f77896y = a(ym1Var, j13, ce2Var.f76251c, j13, false, 5);
        }
        d();
    }

    public final void d() {
        int i10;
        qm1 qm1Var = this.f77891t.f83095j;
        boolean z10 = false;
        if (qm1Var != null) {
            if ((!qm1Var.f81891d ? 0L : qm1Var.f81888a.getNextLoadPositionUs()) != Long.MIN_VALUE) {
                qm1 qm1Var2 = this.f77891t.f83095j;
                long jA = a(qm1Var2.f81891d ? qm1Var2.f81888a.getNextLoadPositionUs() : 0L);
                if (qm1Var2 != this.f77891t.f83093h) {
                    long j10 = qm1Var2.f81893f.f82689b;
                }
                sf1 sf1Var = this.f77878g;
                float f10 = this.f77887p.getPlaybackParameters().f77040b;
                zd0 zd0Var = (zd0) sf1Var;
                ib0 ib0Var = zd0Var.f85347a;
                synchronized (ib0Var) {
                    i10 = ib0Var.f78549e * ib0Var.f78546b;
                }
                boolean z11 = i10 >= zd0Var.f85356j;
                long jMin = zd0Var.f85348b;
                if (f10 > 1.0f) {
                    int i11 = ib3.f78556a;
                    if (f10 != 1.0f) {
                        jMin = Math.round(jMin * ((double) f10));
                    }
                    jMin = Math.min(jMin, zd0Var.f85349c);
                }
                if (jA < Math.max(jMin, 500000L)) {
                    z10 = zd0Var.f85353g || !z11;
                    zd0Var.f85357k = z10;
                    if (!z10 && jA < 500000) {
                        ih1.d("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
                    }
                } else if (jA >= zd0Var.f85349c || z11) {
                    zd0Var.f85357k = false;
                }
                z10 = zd0Var.f85357k;
            }
        }
        this.E = z10;
        if (z10) {
            qm1 qm1Var3 = this.f77891t.f83095j;
            long j11 = this.M;
            if (qm1Var3.f81899l != null) {
                throw new IllegalStateException();
            }
            qm1Var3.f81888a.continueLoading(j11 - qm1Var3.f81902o);
        }
        n();
    }

    public final void e() {
        a(this.f77892u.a(), true);
    }

    public final synchronized boolean h() {
        if (!this.A && this.f77881j.isAlive()) {
            this.f77880i.f78499a.sendEmptyMessage(7);
            a(new y43() { // from class: cp.f2
                @Override // yads.y43
                public final Object get() {
                    return this.f51320b.c();
                }
            }, this.f77894w);
            return this.A;
        }
        return true;
    }

    public final void i() {
        a(true, false, true, false);
        ((zd0) this.f77878g).a(true);
        b(1);
        this.f77881j.quit();
        synchronized (this) {
            this.A = true;
            notifyAll();
        }
    }

    public final void f() {
        this.f77897z.a(1);
        throw null;
    }

    public final void g() {
        this.f77897z.a(1);
        a(false, false, false, true);
        ((zd0) this.f77878g).a(false);
        b(this.f77896y.f76249a.c() ? 4 : 2);
        in1 in1Var = this.f77892u;
        dc0 dc0Var = (dc0) this.f77879h;
        dc0Var.getClass();
        if (!(!in1Var.f78736k)) {
            throw new IllegalStateException();
        }
        in1Var.f78737l = dc0Var;
        for (int i10 = 0; i10 < in1Var.f78727b.size(); i10++) {
            gn1 gn1Var = (gn1) in1Var.f78727b.get(i10);
            in1Var.a(gn1Var);
            in1Var.f78734i.add(gn1Var);
        }
        in1Var.f78736k = true;
        this.f77880i.f78499a.sendEmptyMessage(2);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) throws Throwable {
        boolean z10;
        qm1 qm1Var;
        int i10 = 1000;
        try {
            switch (message.what) {
                case 0:
                    g();
                    break;
                case 1:
                    a(message.arg1 != 0, message.arg2, true, 1);
                    break;
                case 2:
                    a();
                    break;
                case 3:
                    a((fo0) message.obj);
                    break;
                case 4:
                    a((ee2) message.obj);
                    break;
                case 5:
                    this.f77895x = (ww2) message.obj;
                    break;
                case 6:
                    a(false, true);
                    break;
                case 7:
                    i();
                    return true;
                case 8:
                    c((pm1) message.obj);
                    break;
                case 9:
                    b((pm1) message.obj);
                    break;
                case 10:
                    j();
                    break;
                case 11:
                    a(message.arg1);
                    break;
                case 12:
                    e(message.arg1 != 0);
                    break;
                case 13:
                    a(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    bf2 bf2Var = (bf2) message.obj;
                    bf2Var.getClass();
                    if (bf2Var.f75807f != this.f77882k) {
                        this.f77880i.a(15, bf2Var).b();
                    } else {
                        a(bf2Var);
                        int i11 = this.f77896y.f76253e;
                        if (i11 == 3 || i11 == 2) {
                            this.f77880i.f78499a.sendEmptyMessage(2);
                        }
                    }
                    break;
                case 15:
                    c((bf2) message.obj);
                    break;
                case 16:
                    ee2 ee2Var = (ee2) message.obj;
                    a(ee2Var, ee2Var.f77040b, true, false);
                    break;
                case 17:
                    a((bo0) message.obj);
                    break;
                case 18:
                    a((bo0) message.obj, message.arg1);
                    break;
                case 19:
                    a2.a(message.obj);
                    f();
                    throw null;
                case 20:
                    a(message.arg1, message.arg2, (sy2) message.obj);
                    break;
                case 21:
                    a((sy2) message.obj);
                    break;
                case 22:
                    e();
                    break;
                case 23:
                    d(message.arg1 != 0);
                    break;
                case 24:
                    c(message.arg1 == 1);
                    break;
                case 25:
                    b(true);
                    break;
                default:
                    return false;
            }
        } catch (lk0 e10) {
            a(e10, e10.f79828b);
        } catch (ob2 e11) {
            int i12 = e11.f80987c;
            if (i12 == 1) {
                i10 = e11.f80986b ? 3001 : 3003;
            } else if (i12 == 4) {
                i10 = e11.f80986b ? 3002 : 3004;
            }
            a(e11, i10);
        } catch (IOException e12) {
            a(e12, 2000);
        } catch (RuntimeException e13) {
            pn0 pn0Var = new pn0(2, e13, ((e13 instanceof IllegalStateException) || (e13 instanceof IllegalArgumentException)) ? 1004 : 1000, 0);
            ih1.b("ExoPlayerImplInternal", ih1.a("Playback error", pn0Var));
            a(true, false);
            this.f77896y = this.f77896y.a(pn0Var);
        } catch (pn0 e14) {
            pn0 pn0Var2 = e14;
            if (pn0Var2.f81460d == 1 && (qm1Var = this.f77891t.f83094i) != null) {
                ym1 ym1Var = qm1Var.f81893f.f82688a;
                String message2 = pn0Var2.getMessage();
                int i13 = ib3.f78556a;
                pn0Var2 = new pn0(message2, pn0Var2.getCause(), pn0Var2.f75792b, pn0Var2.f81460d, pn0Var2.f81461e, pn0Var2.f81462f, pn0Var2.f81463g, pn0Var2.f81464h, ym1Var, pn0Var2.f75793c, pn0Var2.f81466j);
            }
            if (pn0Var2.f81466j && this.P == null) {
                ih1.d("ExoPlayerImplInternal", ih1.a("Recoverable renderer error", pn0Var2));
                this.P = pn0Var2;
                i53 i53Var = this.f77880i;
                h53 h53VarA = i53Var.a(25, pn0Var2);
                Handler handler = i53Var.f78499a;
                Message message3 = h53VarA.f78073a;
                message3.getClass();
                handler.sendMessageAtFrontOfQueue(message3);
                h53VarA.a();
                z10 = false;
            } else {
                pn0 pn0Var3 = this.P;
                if (pn0Var3 != null) {
                    pn0Var3.addSuppressed(pn0Var2);
                    pn0Var2 = this.P;
                }
                ih1.b("ExoPlayerImplInternal", ih1.a("Playback error", pn0Var2));
                z10 = false;
                a(true, false);
                this.f77896y = this.f77896y.a(pn0Var2);
            }
        } catch (q30 e15) {
            a(e15, e15.f81692b);
        } catch (zo e16) {
            a(e16, 1002);
        }
        z10 = false;
        co0 co0Var = this.f77897z;
        ce2 ce2Var = this.f77896y;
        boolean z11 = co0Var.f76341a | (co0Var.f76342b != ce2Var ? true : z10);
        co0Var.f76341a = z11;
        co0Var.f76342b = ce2Var;
        if (z11) {
            this.f77890s.a(co0Var);
            this.f77897z = new co0(this.f77896y);
        }
        return true;
    }

    public final void j() throws pn0 {
        float f10 = this.f77887p.getPlaybackParameters().f77040b;
        tm1 tm1Var = this.f77891t;
        qm1 qm1Var = tm1Var.f83093h;
        qm1 qm1Var2 = tm1Var.f83094i;
        boolean z10 = true;
        for (qm1 qm1Var3 = qm1Var; qm1Var3 != null && qm1Var3.f81891d; qm1Var3 = qm1Var3.f81899l) {
            t73 t73VarA = qm1Var3.f81897j.a(qm1Var3.f81896i, qm1Var3.f81900m, qm1Var3.f81893f.f82688a, this.f77896y.f76249a);
            for (op0 op0Var : t73VarA.f82909c) {
                if (op0Var != null) {
                    op0Var.a(f10);
                }
            }
            t73 t73Var = qm1Var3.f81901n;
            if (t73Var != null && t73Var.f82909c.length == t73VarA.f82909c.length) {
                int i10 = 0;
                while (true) {
                    if (i10 >= t73VarA.f82909c.length) {
                        if (qm1Var3 == qm1Var2) {
                            z10 = false;
                        }
                    } else if (ib3.a(t73VarA.f82908b[i10], t73Var.f82908b[i10]) && ib3.a(t73VarA.f82909c[i10], t73Var.f82909c[i10])) {
                        i10++;
                    }
                }
            }
            if (z10) {
                tm1 tm1Var2 = this.f77891t;
                qm1 qm1Var4 = tm1Var2.f83093h;
                boolean zA = tm1Var2.a(qm1Var4);
                boolean[] zArr = new boolean[this.f77873b.length];
                long jA = qm1Var4.a(t73VarA, this.f77896y.f76266r, zA, zArr);
                ce2 ce2Var = this.f77896y;
                boolean z11 = (ce2Var.f76253e == 4 || jA == ce2Var.f76266r) ? false : true;
                ce2 ce2Var2 = this.f77896y;
                this.f77896y = a(ce2Var2.f76250b, jA, ce2Var2.f76251c, ce2Var2.f76252d, z11, 5);
                if (z11) {
                    b(jA);
                }
                boolean[] zArr2 = new boolean[this.f77873b.length];
                int i11 = 0;
                while (true) {
                    ro[] roVarArr = this.f77873b;
                    if (i11 >= roVarArr.length) {
                        break;
                    }
                    ro roVar = roVarArr[i11];
                    boolean zB = b(roVar);
                    zArr2[i11] = zB;
                    ns2 ns2Var = qm1Var4.f81890c[i11];
                    if (zB) {
                        if (ns2Var != roVar.f82360h) {
                            a(roVar);
                        } else if (zArr[i11]) {
                            long j10 = this.M;
                            roVar.f82364l = false;
                            roVar.f82363k = j10;
                            roVar.a(j10, false);
                        }
                    }
                    i11++;
                }
                a(zArr2);
            } else {
                this.f77891t.a(qm1Var3);
                if (qm1Var3.f81891d) {
                    qm1Var3.a(t73VarA, Math.max(qm1Var3.f81893f.f82689b, this.M - qm1Var3.f81902o), false, new boolean[qm1Var3.f81896i.length]);
                }
            }
            a(true);
            if (this.f77896y.f76253e != 4) {
                d();
                o();
                this.f77880i.f78499a.sendEmptyMessage(2);
                return;
            }
            return;
        }
    }

    public final void k() {
        qm1 qm1Var = this.f77891t.f83093h;
        this.C = qm1Var != null && qm1Var.f81893f.f82695h && this.B;
    }

    public final boolean l() {
        ce2 ce2Var = this.f77896y;
        return ce2Var.f76260l && ce2Var.f76261m == 0;
    }

    public final void m() {
        int i10;
        de0 de0Var = this.f77887p;
        de0Var.f76655g = false;
        j33 j33Var = de0Var.f76650b;
        if (j33Var.f78904c) {
            j33Var.a(j33Var.a());
            j33Var.f78904c = false;
        }
        for (ro roVar : this.f77873b) {
            if (b(roVar) && (i10 = roVar.f82359g) == 2) {
                if (i10 != 2) {
                    throw new IllegalStateException();
                }
                roVar.f82359g = 1;
                roVar.k();
            }
        }
    }

    public final void n() {
        qm1 qm1Var = this.f77891t.f83095j;
        boolean z10 = this.E || (qm1Var != null && qm1Var.f81888a.isLoading());
        ce2 ce2Var = this.f77896y;
        if (z10 != ce2Var.f76255g) {
            this.f77896y = new ce2(ce2Var.f76249a, ce2Var.f76250b, ce2Var.f76251c, ce2Var.f76252d, ce2Var.f76253e, ce2Var.f76254f, z10, ce2Var.f76256h, ce2Var.f76257i, ce2Var.f76258j, ce2Var.f76259k, ce2Var.f76260l, ce2Var.f76261m, ce2Var.f76262n, ce2Var.f76264p, ce2Var.f76265q, ce2Var.f76266r, ce2Var.f76263o);
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00bc  */
    public final void o() {
        ee2 playbackParameters;
        long j10;
        long j11;
        qm1 qm1Var = this.f77891t.f83093h;
        if (qm1Var == null) {
            return;
        }
        long discontinuity = qm1Var.f81891d ? qm1Var.f81888a.readDiscontinuity() : -9223372036854775807L;
        if (discontinuity != -9223372036854775807L) {
            b(discontinuity);
            if (discontinuity != this.f77896y.f76266r) {
                ce2 ce2Var = this.f77896y;
                this.f77896y = a(ce2Var.f76250b, discontinuity, ce2Var.f76251c, discontinuity, true, 5);
            }
        } else {
            de0 de0Var = this.f77887p;
            boolean z10 = qm1Var != this.f77891t.f83094i;
            ro roVar = de0Var.f76652d;
            if (roVar == null || roVar.f() || (!de0Var.f76652d.g() && (z10 || de0Var.f76652d.e()))) {
                de0Var.f76654f = true;
                if (de0Var.f76655g) {
                    j33 j33Var = de0Var.f76650b;
                    if (!j33Var.f78904c) {
                        ((f53) j33Var.f78903b).getClass();
                        j33Var.f78906e = SystemClock.elapsedRealtime();
                        j33Var.f78904c = true;
                    }
                }
            } else {
                zj1 zj1Var = de0Var.f76653e;
                zj1Var.getClass();
                long jA = zj1Var.a();
                if (!de0Var.f76654f) {
                    de0Var.f76650b.a(jA);
                    playbackParameters = zj1Var.getPlaybackParameters();
                    if (!playbackParameters.equals(de0Var.f76650b.f78907f)) {
                        de0Var.f76650b.a(playbackParameters);
                        ((go0) de0Var.f76651c).f77880i.a(16, playbackParameters).b();
                    }
                } else if (jA < de0Var.f76650b.a()) {
                    j33 j33Var2 = de0Var.f76650b;
                    if (j33Var2.f78904c) {
                        j33Var2.a(j33Var2.a());
                        j33Var2.f78904c = false;
                    }
                } else {
                    de0Var.f76654f = false;
                    if (de0Var.f76655g) {
                        j33 j33Var3 = de0Var.f76650b;
                        if (!j33Var3.f78904c) {
                            ((f53) j33Var3.f78903b).getClass();
                            j33Var3.f78906e = SystemClock.elapsedRealtime();
                            j33Var3.f78904c = true;
                        }
                    }
                    de0Var.f76650b.a(jA);
                    playbackParameters = zj1Var.getPlaybackParameters();
                    if (!playbackParameters.equals(de0Var.f76650b.f78907f)) {
                        de0Var.f76650b.a(playbackParameters);
                        ((go0) de0Var.f76651c).f77880i.a(16, playbackParameters).b();
                    }
                }
            }
            long jA2 = de0Var.a();
            this.M = jA2;
            long j12 = jA2 - qm1Var.f81902o;
            long j13 = this.f77896y.f76266r;
            if (!this.f77888q.isEmpty() && !this.f77896y.f76250b.a()) {
                if (this.O) {
                    this.O = false;
                }
                ce2 ce2Var2 = this.f77896y;
                ce2Var2.f76249a.a(ce2Var2.f76250b.f82311a);
                int iMin = Math.min(this.N, this.f77888q.size());
                if (iMin > 0 && this.f77888q.get(iMin - 1) != null) {
                    throw new ClassCastException();
                }
                if (iMin < this.f77888q.size() && this.f77888q.get(iMin) != null) {
                    throw new ClassCastException();
                }
                this.N = iMin;
            }
            this.f77896y.f76266r = j12;
        }
        qm1 qm1Var2 = this.f77891t.f83095j;
        ce2 ce2Var3 = this.f77896y;
        if (qm1Var2.f81891d) {
            long bufferedPositionUs = qm1Var2.f81892e ? qm1Var2.f81888a.getBufferedPositionUs() : Long.MIN_VALUE;
            j10 = bufferedPositionUs == Long.MIN_VALUE ? qm1Var2.f81893f.f82692e : bufferedPositionUs;
        } else {
            j10 = qm1Var2.f81893f.f82689b;
        }
        ce2Var3.f76264p = j10;
        ce2 ce2Var4 = this.f77896y;
        ce2Var4.f76265q = a(ce2Var4.f76264p);
        ce2 ce2Var5 = this.f77896y;
        if (ce2Var5.f76260l && ce2Var5.f76253e == 3 && a(ce2Var5.f76249a, ce2Var5.f76250b)) {
            ce2 ce2Var6 = this.f77896y;
            float f10 = 1.0f;
            if (ce2Var6.f76262n.f77040b == 1.0f) {
                rf1 rf1Var = this.f77893v;
                long jA3 = a(ce2Var6.f76249a, ce2Var6.f76250b.f82311a, ce2Var6.f76266r);
                long jA4 = a(this.f77896y.f76264p);
                yd0 yd0Var = (yd0) rf1Var;
                if (yd0Var.f84895d != -9223372036854775807L) {
                    long j14 = jA3 - jA4;
                    long j15 = yd0Var.f84905n;
                    if (j15 == -9223372036854775807L) {
                        yd0Var.f84905n = j14;
                        yd0Var.f84906o = 0L;
                    } else {
                        float f11 = yd0Var.f84894c;
                        long jMax = Math.max(j14, (long) (((1.0f - f11) * j14) + (j15 * f11)));
                        yd0Var.f84905n = jMax;
                        long jAbs = Math.abs(j14 - jMax);
                        long j16 = yd0Var.f84906o;
                        float f12 = yd0Var.f84894c;
                        yd0Var.f84906o = (long) (((1.0f - f12) * jAbs) + (j16 * f12));
                    }
                    if (yd0Var.f84904m == -9223372036854775807L || SystemClock.elapsedRealtime() - yd0Var.f84904m >= 1000) {
                        yd0Var.f84904m = SystemClock.elapsedRealtime();
                        long j17 = (yd0Var.f84906o * 3) + yd0Var.f84905n;
                        if (yd0Var.f84900i > j17) {
                            float fA = ib3.a(1000L);
                            j11 = jA3;
                            long[] jArr = {j17, yd0Var.f84897f, yd0Var.f84900i - (((long) ((yd0Var.f84903l - 1.0f) * fA)) + ((long) ((yd0Var.f84901j - 1.0f) * fA)))};
                            for (int i10 = 1; i10 < 3; i10++) {
                                long j18 = jArr[i10];
                                if (j18 > j17) {
                                    j17 = j18;
                                }
                            }
                            yd0Var.f84900i = j17;
                        } else {
                            j11 = jA3;
                            long jMax2 = j11 - ((long) (Math.max(0.0f, yd0Var.f84903l - 1.0f) / 1.0E-7f));
                            long j19 = yd0Var.f84900i;
                            int i11 = ib3.f78556a;
                            long jMax3 = Math.max(j19, Math.min(jMax2, j17));
                            yd0Var.f84900i = jMax3;
                            long j20 = yd0Var.f84899h;
                            if (j20 != -9223372036854775807L && jMax3 > j20) {
                                yd0Var.f84900i = j20;
                            }
                        }
                        long j21 = j11 - yd0Var.f84900i;
                        if (Math.abs(j21) < yd0Var.f84892a) {
                            yd0Var.f84903l = 1.0f;
                        } else {
                            float f13 = (j21 * 1.0E-7f) + 1.0f;
                            float f14 = yd0Var.f84902k;
                            float f15 = yd0Var.f84901j;
                            int i12 = ib3.f78556a;
                            yd0Var.f84903l = Math.max(f14, Math.min(f13, f15));
                        }
                        f10 = yd0Var.f84903l;
                    } else {
                        f10 = yd0Var.f84903l;
                    }
                }
                if (this.f77887p.getPlaybackParameters().f77040b != f10) {
                    this.f77887p.a(new ee2(f10, this.f77896y.f76262n.f77041c));
                    a(this.f77896y.f76262n, this.f77887p.getPlaybackParameters().f77040b, false, false);
                }
            }
        }
    }

    public final void e(boolean z10) throws pn0 {
        this.G = z10;
        tm1 tm1Var = this.f77891t;
        s63 s63Var = this.f77896y.f76249a;
        tm1Var.f83092g = z10;
        if (!tm1Var.a(s63Var)) {
            b(true);
        }
        a(false);
    }

    public static void a(bf2 bf2Var) {
        synchronized (bf2Var) {
        }
        try {
            bf2Var.f75802a.handleMessage(bf2Var.f75805d, bf2Var.f75806e);
        } finally {
            bf2Var.a(true);
        }
    }

    public final void b(pm1 pm1Var) {
        pm1 pm1Var2;
        qm1 qm1Var = this.f77891t.f83095j;
        if (qm1Var == null || (pm1Var2 = qm1Var.f81888a) != pm1Var) {
            return;
        }
        long j10 = this.M;
        if (qm1Var.f81899l == null) {
            if (qm1Var.f81891d) {
                pm1Var2.reevaluateBuffer(j10 - qm1Var.f81902o);
            }
            d();
            return;
        }
        throw new IllegalStateException();
    }

    public final void a(ro roVar) {
        if (b(roVar)) {
            de0 de0Var = this.f77887p;
            if (roVar == de0Var.f76652d) {
                de0Var.f76653e = null;
                de0Var.f76652d = null;
                de0Var.f76654f = true;
            }
            int i10 = roVar.f82359g;
            if (i10 == 2) {
                if (i10 == 2) {
                    roVar.f82359g = 1;
                    roVar.k();
                } else {
                    throw new IllegalStateException();
                }
            }
            if (roVar.f82359g == 1) {
                nx0 nx0Var = roVar.f82355c;
                nx0Var.f80853a = null;
                nx0Var.f80854b = null;
                roVar.f82359g = 0;
                roVar.f82360h = null;
                roVar.f82361i = null;
                roVar.f82364l = false;
                roVar.h();
                this.K--;
                return;
            }
            throw new IllegalStateException();
        }
    }

    public static boolean b(ro roVar) {
        return roVar.f82359g != 0;
    }

    public final void b(bf2 bf2Var) {
        try {
            a(bf2Var);
        } catch (pn0 e10) {
            ih1.b("ExoPlayerImplInternal", ih1.a("Unexpected error delivering message on external thread.", e10));
            throw new RuntimeException(e10);
        }
    }

    public final void b(long j10) {
        qm1 qm1Var = this.f77891t.f83093h;
        long j11 = j10 + (qm1Var == null ? 1000000000000L : qm1Var.f81902o);
        this.M = j11;
        this.f77887p.f76650b.a(j11);
        for (ro roVar : this.f77873b) {
            if (b(roVar)) {
                long j12 = this.M;
                roVar.f82364l = false;
                roVar.f82363k = j12;
                roVar.a(j12, false);
            }
        }
        for (qm1 qm1Var2 = this.f77891t.f83093h; qm1Var2 != null; qm1Var2 = qm1Var2.f81899l) {
            for (op0 op0Var : qm1Var2.f81901n.f82909c) {
                if (op0Var != null) {
                    op0Var.h();
                }
            }
        }
    }

    public final /* synthetic */ Boolean c() {
        return Boolean.valueOf(this.A);
    }

    public final void c(final bf2 bf2Var) {
        Looper looper = bf2Var.f75807f;
        if (!looper.getThread().isAlive()) {
            ih1.d("TAG", "Trying to send message on a dead thread.");
            bf2Var.a(false);
        } else {
            ((f53) this.f77889r).getClass();
            new Handler(looper, null).post(new Runnable() { // from class: cp.e2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f51298b.b(bf2Var);
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:239:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:380:0x05e6  */
    /* JADX WARN: Code duplicated, block: B:382:0x05f4  */
    /* JADX WARN: Code duplicated, block: B:385:0x0609  */
    /* JADX WARN: Code duplicated, block: B:387:0x0611  */
    /* JADX WARN: Code duplicated, block: B:389:0x0615  */
    /* JADX WARN: Code duplicated, block: B:393:0x0625  */
    /* JADX WARN: Code duplicated, block: B:395:0x062d  */
    /* JADX WARN: Code duplicated, block: B:397:0x0631  */
    /* JADX WARN: Code duplicated, block: B:399:0x063d  */
    /* JADX WARN: Code duplicated, block: B:406:0x064e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:407:0x0650  */
    /* JADX WARN: Code duplicated, block: B:409:0x065e  */
    /* JADX WARN: Code duplicated, block: B:411:0x0664  */
    /* JADX WARN: Code duplicated, block: B:413:0x066c  */
    /* JADX WARN: Code duplicated, block: B:415:0x0670  */
    /* JADX WARN: Code duplicated, block: B:421:0x0684  */
    /* JADX WARN: Code duplicated, block: B:423:0x068f  */
    /* JADX WARN: Code duplicated, block: B:430:0x06a1  */
    /* JADX WARN: Code duplicated, block: B:433:0x06a7  */
    /* JADX WARN: Code duplicated, block: B:461:0x071b  */
    /* JADX WARN: Code duplicated, block: B:467:0x072c  */
    /* JADX WARN: Code duplicated, block: B:474:0x0738  */
    /* JADX WARN: Code duplicated, block: B:477:0x073f  */
    /* JADX WARN: Code duplicated, block: B:517:0x06c4 A[EDGE_INSN: B:517:0x06c4->B:439:0x06c4 BREAK  A[LOOP:4: B:431:0x06a2->B:438:0x06c1], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:522:0x061c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:523:0x0622 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:528:0x0673 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0162  */
    /* JADX WARN: Code duplicated, block: B:70:0x0174 A[EDGE_INSN: B:70:0x0174->B:71:0x0175 BREAK  A[LOOP:8: B:81:0x018c->B:98:0x01c4]] */
    /* JADX WARN: Instruction removed from duplicated block: B:411:0x0664, please report this as an issue */
    public final void a() throws pn0 {
        long j10;
        boolean z10;
        boolean z11;
        boolean z12;
        ce2 ce2Var;
        qm1 qm1Var;
        yd0 yd0Var;
        long j11;
        long j12;
        int i10;
        qm1 qm1Var2;
        int i11;
        j33 j33Var;
        int i12;
        boolean z13;
        ce2 ce2Var2;
        int i13;
        int i14;
        ro[] roVarArr;
        ce2 ce2Var3;
        qm1 qm1Var3;
        ns2 ns2Var;
        sm1 sm1VarA;
        int i15;
        qm1 qm1Var4;
        qm1 qm1Var5;
        qm1 qm1Var6;
        boolean z14;
        boolean z15;
        ((f53) this.f77889r).getClass();
        long jUptimeMillis = SystemClock.uptimeMillis();
        this.f77880i.f78499a.removeMessages(2);
        int i16 = 0;
        if (this.f77896y.f76249a.c() || !this.f77892u.f78736k) {
            j10 = -9223372036854775807L;
        } else {
            tm1 tm1Var = this.f77891t;
            long j13 = this.M;
            qm1 qm1Var7 = tm1Var.f83095j;
            if (qm1Var7 != null) {
                if (qm1Var7.f81899l == null) {
                    if (qm1Var7.f81891d) {
                        qm1Var7.f81888a.reevaluateBuffer(j13 - qm1Var7.f81902o);
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
            tm1 tm1Var2 = this.f77891t;
            qm1 qm1Var8 = tm1Var2.f83095j;
            if (qm1Var8 == null || (!qm1Var8.f81893f.f82696i && qm1Var8.f81891d && ((!qm1Var8.f81892e || qm1Var8.f81888a.getBufferedPositionUs() == Long.MIN_VALUE) && tm1Var2.f83095j.f81893f.f82692e != -9223372036854775807L && tm1Var2.f83096k < 100))) {
                tm1 tm1Var3 = this.f77891t;
                long j14 = this.M;
                ce2 ce2Var4 = this.f77896y;
                qm1 qm1Var9 = tm1Var3.f83095j;
                if (qm1Var9 == null) {
                    s63 s63Var = ce2Var4.f76249a;
                    ym1 ym1Var = ce2Var4.f76250b;
                    long j15 = ce2Var4.f76251c;
                    long j16 = ce2Var4.f76266r;
                    s63Var.a(ym1Var.f82311a, tm1Var3.f83086a);
                    if (ym1Var.a()) {
                        sm1VarA = tm1Var3.a(s63Var, ym1Var.f82311a, ym1Var.f82312b, ym1Var.f82313c, j15, ym1Var.f82314d);
                    } else {
                        sm1VarA = tm1Var3.a(s63Var, ym1Var.f82311a, j16, j15, ym1Var.f82314d);
                    }
                } else {
                    sm1VarA = tm1Var3.a(ce2Var4.f76249a, qm1Var9, j14);
                }
                if (sm1VarA != null) {
                    tm1 tm1Var4 = this.f77891t;
                    ro[] roVarArr2 = this.f77875d;
                    s73 s73Var = this.f77876e;
                    ib0 ib0Var = ((zd0) this.f77878g).f85347a;
                    in1 in1Var = this.f77892u;
                    t73 t73Var = this.f77877f;
                    qm1 qm1Var10 = tm1Var4.f83095j;
                    qm1 qm1Var11 = new qm1(roVarArr2, qm1Var10 == null ? 1000000000000L : (qm1Var10.f81902o + qm1Var10.f81893f.f82692e) - sm1VarA.f82689b, s73Var, ib0Var, in1Var, sm1VarA, t73Var);
                    qm1 qm1Var12 = tm1Var4.f83095j;
                    if (qm1Var12 != null) {
                        if (qm1Var11 != qm1Var12.f81899l) {
                            qm1Var12.a();
                            qm1Var12.f81899l = qm1Var11;
                        }
                    } else {
                        tm1Var4.f83093h = qm1Var11;
                        tm1Var4.f83094i = qm1Var11;
                    }
                    tm1Var4.f83097l = null;
                    tm1Var4.f83095j = qm1Var11;
                    tm1Var4.f83096k++;
                    tm1Var4.c();
                    qm1Var11.f81888a.a(this, sm1VarA.f82689b);
                    if (this.f77891t.f83093h == qm1Var11) {
                        b(sm1VarA.f82689b);
                    }
                    a(false);
                }
            }
            if (this.E) {
                qm1 qm1Var13 = this.f77891t.f83095j;
                if (qm1Var13 == null) {
                    z15 = false;
                } else if ((!qm1Var13.f81891d ? 0L : qm1Var13.f81888a.getNextLoadPositionUs()) == Long.MIN_VALUE) {
                    z15 = false;
                } else {
                    z15 = true;
                }
                this.E = z15;
                n();
            } else {
                d();
            }
            qm1 qm1Var14 = this.f77891t.f83094i;
            if (qm1Var14 == null) {
                i15 = 1;
                break;
            }
            if (qm1Var14.f81899l != null && !this.C) {
                if (!qm1Var14.f81891d) {
                    i15 = 1;
                    break;
                }
                int i17 = 0;
                while (true) {
                    ro[] roVarArr3 = this.f77873b;
                    if (i17 < roVarArr3.length) {
                        ro roVar = roVarArr3[i17];
                        ns2 ns2Var2 = qm1Var14.f81890c[i17];
                        if (roVar.f82360h == ns2Var2) {
                            if (ns2Var2 != null && !roVar.e()) {
                                qm1 qm1Var15 = qm1Var14.f81899l;
                                if (!qm1Var14.f81893f.f82693f || !qm1Var15.f81891d || (!(roVar instanceof a63) && !(roVar instanceof ys1) && roVar.f82363k < qm1Var15.f81893f.f82689b + qm1Var15.f81902o)) {
                                }
                            }
                            i17++;
                        }
                    } else {
                        qm1 qm1Var16 = qm1Var14.f81899l;
                        if (qm1Var16.f81891d || this.M >= qm1Var16.f81893f.f82689b + qm1Var16.f81902o) {
                            t73 t73Var2 = qm1Var14.f81901n;
                            tm1 tm1Var5 = this.f77891t;
                            qm1 qm1Var17 = tm1Var5.f83094i;
                            if (qm1Var17 != null && (qm1Var4 = qm1Var17.f81899l) != null) {
                                tm1Var5.f83094i = qm1Var4;
                                tm1Var5.c();
                                qm1 qm1Var18 = tm1Var5.f83094i;
                                t73 t73Var3 = qm1Var18.f81901n;
                                s63 s63Var2 = this.f77896y.f76249a;
                                i15 = 1;
                                a(s63Var2, qm1Var18.f81893f.f82688a, s63Var2, qm1Var14.f81893f.f82688a, -9223372036854775807L);
                                if (qm1Var18.f81891d && qm1Var18.f81888a.readDiscontinuity() != -9223372036854775807L) {
                                    long j17 = qm1Var18.f81893f.f82689b + qm1Var18.f81902o;
                                    for (ro roVar2 : this.f77873b) {
                                        if (roVar2.f82360h != null) {
                                            a(roVar2, j17);
                                        }
                                    }
                                    break;
                                }
                                for (int i18 = 0; i18 < this.f77873b.length; i18++) {
                                    boolean zA = t73Var2.a(i18);
                                    boolean zA2 = t73Var3.a(i18);
                                    if (zA && !this.f77873b[i18].f82364l) {
                                        boolean z16 = this.f77875d[i18].f82354b == -2;
                                        mn2 mn2Var = t73Var2.f82908b[i18];
                                        mn2 mn2Var2 = t73Var3.f82908b[i18];
                                        if (!zA2 || !mn2Var2.equals(mn2Var) || z16) {
                                            a(this.f77873b[i18], qm1Var18.f81893f.f82689b + qm1Var18.f81902o);
                                        }
                                    }
                                }
                                break;
                            }
                            throw new IllegalStateException();
                        }
                    }
                    i15 = 1;
                    break;
                }
            } else {
                i15 = 1;
                if (qm1Var14.f81893f.f82696i || this.C) {
                    int i19 = 0;
                    while (true) {
                        ro[] roVarArr4 = this.f77873b;
                        if (i19 >= roVarArr4.length) {
                            break;
                        }
                        ro roVar3 = roVarArr4[i19];
                        ns2 ns2Var3 = qm1Var14.f81890c[i19];
                        if (ns2Var3 != null && roVar3.f82360h == ns2Var3 && roVar3.e()) {
                            long j18 = qm1Var14.f81893f.f82692e;
                            a(roVar3, (j18 == -9223372036854775807L || j18 == Long.MIN_VALUE) ? -9223372036854775807L : j18 + qm1Var14.f81902o);
                        }
                        i19++;
                    }
                }
            }
            tm1 tm1Var6 = this.f77891t;
            qm1 qm1Var19 = tm1Var6.f83094i;
            if (qm1Var19 != null && tm1Var6.f83093h != qm1Var19 && !qm1Var19.f81894g) {
                t73 t73Var4 = qm1Var19.f81901n;
                int i20 = 0;
                boolean z17 = false;
                while (true) {
                    ro[] roVarArr5 = this.f77873b;
                    if (i20 >= roVarArr5.length) {
                        if (!(!z17)) {
                            break;
                        }
                        a(new boolean[roVarArr5.length]);
                        break;
                    }
                    ro roVar4 = roVarArr5[i20];
                    if (b(roVar4)) {
                        int i21 = roVar4.f82360h != qm1Var19.f81890c[i20] ? i15 : i16;
                        if (!t73Var4.a(i20) || i21 != 0) {
                            if (!roVar4.f82364l) {
                                op0 op0Var = t73Var4.f82909c[i20];
                                int iF = op0Var != null ? op0Var.f() : i16;
                                mx0[] mx0VarArr = new mx0[iF];
                                for (int i22 = i16; i22 < iF; i22++) {
                                    mx0VarArr[i22] = op0Var.a(i22);
                                }
                                ns2 ns2Var4 = qm1Var19.f81890c[i20];
                                long j19 = qm1Var19.f81893f.f82689b;
                                long j20 = qm1Var19.f81902o;
                                long j21 = j19 + j20;
                                if (!roVar4.f82364l) {
                                    roVar4.f82360h = ns2Var4;
                                    if (roVar4.f82363k == Long.MIN_VALUE) {
                                        roVar4.f82363k = j21;
                                    }
                                    roVar4.f82361i = mx0VarArr;
                                    roVar4.f82362j = j20;
                                    roVar4.a(mx0VarArr, j21, j20);
                                } else {
                                    throw new IllegalStateException();
                                }
                            } else if (roVar4.f()) {
                                a(roVar4);
                            } else {
                                z17 = true;
                            }
                        }
                    }
                    i20++;
                    i16 = 0;
                    i15 = 1;
                }
            }
            boolean z18 = false;
            while (l() && !this.C && (qm1Var5 = this.f77891t.f83093h) != null && (qm1Var6 = qm1Var5.f81899l) != null && this.M >= qm1Var6.f81893f.f82689b + qm1Var6.f81902o && qm1Var6.f81894g) {
                if (z18) {
                    co0 co0Var = this.f77897z;
                    ce2 ce2Var5 = this.f77896y;
                    boolean z19 = co0Var.f76341a | (co0Var.f76342b != ce2Var5);
                    co0Var.f76341a = z19;
                    co0Var.f76342b = ce2Var5;
                    if (z19) {
                        this.f77890s.a(co0Var);
                        this.f77897z = new co0(this.f77896y);
                    }
                }
                qm1 qm1VarA = this.f77891t.a();
                qm1VarA.getClass();
                if (this.f77896y.f76250b.f82311a.equals(qm1VarA.f81893f.f82688a.f82311a)) {
                    ym1 ym1Var2 = this.f77896y.f76250b;
                    if (ym1Var2.f82312b == -1) {
                        ym1 ym1Var3 = qm1VarA.f81893f.f82688a;
                        if (ym1Var3.f82312b != -1 || ym1Var2.f82315e == ym1Var3.f82315e) {
                            z14 = false;
                        } else {
                            z14 = true;
                        }
                    } else {
                        z14 = false;
                    }
                } else {
                    z14 = false;
                }
                sm1 sm1Var = qm1VarA.f81893f;
                ym1 ym1Var4 = sm1Var.f82688a;
                long j22 = sm1Var.f82689b;
                this.f77896y = a(ym1Var4, j22, sm1Var.f82690c, j22, !z14, 0);
                k();
                o();
                z18 = true;
            }
            j10 = -9223372036854775807L;
        }
        int i23 = this.f77896y.f76253e;
        if (i23 == 1 || i23 == 4) {
            return;
        }
        qm1 qm1Var20 = this.f77891t.f83093h;
        if (qm1Var20 == null) {
            this.f77880i.f78499a.sendEmptyMessageAtTime(2, jUptimeMillis + 10);
            return;
        }
        d73.a("doSomeWork");
        o();
        if (qm1Var20.f81891d) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() * 1000;
            qm1Var20.f81888a.discardBuffer(this.f77896y.f76266r - this.f77885n, this.f77886o);
            boolean z20 = true;
            z10 = true;
            int i24 = 0;
            while (true) {
                ro[] roVarArr6 = this.f77873b;
                if (i24 >= roVarArr6.length) {
                    break;
                }
                ro roVar5 = roVarArr6[i24];
                if (b(roVar5)) {
                    roVar5.a(this.M, jElapsedRealtime);
                    z20 = z20 && roVar5.f();
                    boolean z21 = qm1Var20.f81890c[i24] != roVar5.f82360h;
                    boolean z22 = z21 || (!z21 && roVar5.e()) || roVar5.g() || roVar5.f();
                    z10 = z10 && z22;
                    if (!z22) {
                        ns2 ns2Var5 = roVar5.f82360h;
                        ns2Var5.getClass();
                        ns2Var5.a();
                    }
                }
                i24++;
            }
            z11 = z20;
        } else {
            qm1Var20.f81888a.maybeThrowPrepareError();
            z10 = true;
            z11 = true;
        }
        long j23 = qm1Var20.f81893f.f82692e;
        boolean z23 = z11 && qm1Var20.f81891d && (j23 == j10 || j23 <= this.f77896y.f76266r);
        if (z23 && this.C) {
            this.C = false;
            a(false, this.f77896y.f76261m, false, 5);
        }
        if (z23 && qm1Var20.f81893f.f82696i) {
            b(4);
            m();
        } else {
            ce2 ce2Var6 = this.f77896y;
            if (ce2Var6.f76253e == 2) {
                if (this.K == 0) {
                    qm1 qm1Var21 = this.f77891t.f83093h;
                    long j24 = qm1Var21.f81893f.f82692e;
                    if (qm1Var21.f81891d && (j24 == j10 || ce2Var6.f76266r < j24 || !l())) {
                        b(3);
                        this.P = null;
                        if (l()) {
                            this.D = false;
                            de0 de0Var = this.f77887p;
                            z12 = true;
                            de0Var.f76655g = true;
                            j33Var = de0Var.f76650b;
                            if (!j33Var.f78904c) {
                                ((f53) j33Var.f78903b).getClass();
                                j33Var.f78906e = SystemClock.elapsedRealtime();
                                j33Var.f78904c = true;
                            }
                            for (ro roVar6 : this.f77873b) {
                                if (!b(roVar6)) {
                                    if (roVar6.f82359g == 1) {
                                        roVar6.f82359g = 2;
                                        roVar6.j();
                                    } else {
                                        throw new IllegalStateException();
                                    }
                                }
                            }
                        }
                    } else {
                        z12 = true;
                        ce2Var = this.f77896y;
                        if (ce2Var.f76253e == 3) {
                            if (this.K == 0) {
                                qm1Var2 = this.f77891t.f83093h;
                                long j25 = qm1Var2.f81893f.f82692e;
                                if (qm1Var2.f81891d) {
                                    this.D = l();
                                    b(2);
                                    if (this.D) {
                                        for (qm1Var = this.f77891t.f83093h; qm1Var != null; qm1Var = qm1Var.f81899l) {
                                            for (op0 op0Var2 : qm1Var.f81901n.f82909c) {
                                                if (op0Var2 != null) {
                                                    op0Var2.i();
                                                }
                                            }
                                        }
                                        yd0Var = (yd0) this.f77893v;
                                        j11 = yd0Var.f84900i;
                                        if (j11 != j10) {
                                            long j26 = j11 + yd0Var.f84893b;
                                            yd0Var.f84900i = j26;
                                            j12 = yd0Var.f84899h;
                                            if (j12 != j10) {
                                                yd0Var.f84900i = j12;
                                            }
                                            yd0Var.f84904m = j10;
                                        }
                                    }
                                    m();
                                } else {
                                    this.D = l();
                                    b(2);
                                    if (this.D) {
                                        while (qm1Var != null) {
                                            while (i10 < r4) {
                                                if (op0Var2 != null) {
                                                    op0Var2.i();
                                                }
                                            }
                                        }
                                        yd0Var = (yd0) this.f77893v;
                                        j11 = yd0Var.f84900i;
                                        if (j11 != j10) {
                                            long j27 = j11 + yd0Var.f84893b;
                                            yd0Var.f84900i = j27;
                                            j12 = yd0Var.f84899h;
                                            if (j12 != j10) {
                                                yd0Var.f84900i = j12;
                                            }
                                            yd0Var.f84904m = j10;
                                        }
                                    }
                                    m();
                                }
                            } else if (!z10) {
                                this.D = l();
                                b(2);
                                if (this.D) {
                                    while (qm1Var != null) {
                                        while (i10 < r4) {
                                            if (op0Var2 != null) {
                                                op0Var2.i();
                                            }
                                        }
                                    }
                                    yd0Var = (yd0) this.f77893v;
                                    j11 = yd0Var.f84900i;
                                    if (j11 != j10) {
                                        long j28 = j11 + yd0Var.f84893b;
                                        yd0Var.f84900i = j28;
                                        j12 = yd0Var.f84899h;
                                        if (j12 != j10) {
                                            yd0Var.f84900i = j12;
                                        }
                                        yd0Var.f84904m = j10;
                                    }
                                }
                                m();
                            }
                        }
                    }
                } else {
                    if (z10) {
                        if (ce2Var6.f76255g) {
                            long j29 = a(ce2Var6.f76249a, this.f77891t.f83093h.f81893f.f82688a) ? ((yd0) this.f77893v).f84900i : j10;
                            qm1 qm1Var22 = this.f77891t.f83095j;
                            boolean z24 = qm1Var22.f81891d && (!qm1Var22.f81892e || qm1Var22.f81888a.getBufferedPositionUs() == Long.MIN_VALUE) && qm1Var22.f81893f.f82696i;
                            boolean z25 = qm1Var22.f81893f.f82688a.a() && !qm1Var22.f81891d;
                            if (!z24 && !z25) {
                                sf1 sf1Var = this.f77878g;
                                long jA = a(this.f77896y.f76264p);
                                float f10 = this.f77887p.getPlaybackParameters().f77040b;
                                boolean z26 = this.D;
                                zd0 zd0Var = (zd0) sf1Var;
                                zd0Var.getClass();
                                if (f10 != 1.0f) {
                                    jA = Math.round(jA / ((double) f10));
                                }
                                long jMin = z26 ? zd0Var.f85351e : zd0Var.f85350d;
                                if (j29 != j10) {
                                    jMin = Math.min(j29 / 2, jMin);
                                }
                                if (jMin > 0 && jA < jMin) {
                                    if (!zd0Var.f85353g) {
                                        ib0 ib0Var2 = zd0Var.f85347a;
                                        synchronized (ib0Var2) {
                                            i11 = ib0Var2.f78549e * ib0Var2.f78546b;
                                        }
                                        if (i11 >= zd0Var.f85356j) {
                                        }
                                    }
                                }
                            }
                        }
                        b(3);
                        this.P = null;
                        if (l()) {
                            this.D = false;
                            de0 de0Var2 = this.f77887p;
                            z12 = true;
                            de0Var2.f76655g = true;
                            j33Var = de0Var2.f76650b;
                            if (!j33Var.f78904c) {
                                ((f53) j33Var.f78903b).getClass();
                                j33Var.f78906e = SystemClock.elapsedRealtime();
                                j33Var.f78904c = true;
                            }
                            while (i12 < r3) {
                                if (!b(roVar6)) {
                                    if (roVar6.f82359g == 1) {
                                        roVar6.f82359g = 2;
                                        roVar6.j();
                                    } else {
                                        throw new IllegalStateException();
                                    }
                                }
                            }
                        }
                    }
                    z12 = true;
                    ce2Var = this.f77896y;
                    if (ce2Var.f76253e == 3) {
                        if (this.K == 0) {
                            qm1Var2 = this.f77891t.f83093h;
                            long j210 = qm1Var2.f81893f.f82692e;
                            if (qm1Var2.f81891d) {
                                this.D = l();
                                b(2);
                                if (this.D) {
                                    while (qm1Var != null) {
                                        while (i10 < r4) {
                                            if (op0Var2 != null) {
                                                op0Var2.i();
                                            }
                                        }
                                    }
                                    yd0Var = (yd0) this.f77893v;
                                    j11 = yd0Var.f84900i;
                                    if (j11 != j10) {
                                        long j211 = j11 + yd0Var.f84893b;
                                        yd0Var.f84900i = j211;
                                        j12 = yd0Var.f84899h;
                                        if (j12 != j10) {
                                            yd0Var.f84900i = j12;
                                        }
                                        yd0Var.f84904m = j10;
                                    }
                                }
                                m();
                            } else {
                                this.D = l();
                                b(2);
                                if (this.D) {
                                    while (qm1Var != null) {
                                        while (i10 < r4) {
                                            if (op0Var2 != null) {
                                                op0Var2.i();
                                            }
                                        }
                                    }
                                    yd0Var = (yd0) this.f77893v;
                                    j11 = yd0Var.f84900i;
                                    if (j11 != j10) {
                                        long j212 = j11 + yd0Var.f84893b;
                                        yd0Var.f84900i = j212;
                                        j12 = yd0Var.f84899h;
                                        if (j12 != j10) {
                                            yd0Var.f84900i = j12;
                                        }
                                        yd0Var.f84904m = j10;
                                    }
                                }
                                m();
                            }
                        } else if (!z10) {
                            this.D = l();
                            b(2);
                            if (this.D) {
                                while (qm1Var != null) {
                                    while (i10 < r4) {
                                        if (op0Var2 != null) {
                                            op0Var2.i();
                                        }
                                    }
                                }
                                yd0Var = (yd0) this.f77893v;
                                j11 = yd0Var.f84900i;
                                if (j11 != j10) {
                                    long j213 = j11 + yd0Var.f84893b;
                                    yd0Var.f84900i = j213;
                                    j12 = yd0Var.f84899h;
                                    if (j12 != j10) {
                                        yd0Var.f84900i = j12;
                                    }
                                    yd0Var.f84904m = j10;
                                }
                            }
                            m();
                        }
                    }
                }
            } else {
                z12 = true;
                ce2Var = this.f77896y;
                if (ce2Var.f76253e == 3) {
                    if (this.K == 0) {
                        qm1Var2 = this.f77891t.f83093h;
                        long j214 = qm1Var2.f81893f.f82692e;
                        if (qm1Var2.f81891d || (j214 != j10 && ce2Var.f76266r >= j214 && l())) {
                            this.D = l();
                            b(2);
                            if (this.D) {
                                while (qm1Var != null) {
                                    while (i10 < r4) {
                                        if (op0Var2 != null) {
                                            op0Var2.i();
                                        }
                                    }
                                }
                                yd0Var = (yd0) this.f77893v;
                                j11 = yd0Var.f84900i;
                                if (j11 != j10) {
                                    long j215 = j11 + yd0Var.f84893b;
                                    yd0Var.f84900i = j215;
                                    j12 = yd0Var.f84899h;
                                    if (j12 != j10 && j215 > j12) {
                                        yd0Var.f84900i = j12;
                                    }
                                    yd0Var.f84904m = j10;
                                }
                            }
                            m();
                        }
                    } else if (!z10) {
                        this.D = l();
                        b(2);
                        if (this.D) {
                            while (qm1Var != null) {
                                while (i10 < r4) {
                                    if (op0Var2 != null) {
                                        op0Var2.i();
                                    }
                                }
                            }
                            yd0Var = (yd0) this.f77893v;
                            j11 = yd0Var.f84900i;
                            if (j11 != j10) {
                                long j216 = j11 + yd0Var.f84893b;
                                yd0Var.f84900i = j216;
                                j12 = yd0Var.f84899h;
                                if (j12 != j10) {
                                    yd0Var.f84900i = j12;
                                }
                                yd0Var.f84904m = j10;
                            }
                        }
                        m();
                    }
                }
            }
            if (this.f77896y.f76253e == 2) {
                i14 = 0;
                while (true) {
                    roVarArr = this.f77873b;
                    if (i14 < roVarArr.length) {
                        break;
                    }
                    if (!b(roVarArr[i14]) && (ns2Var = this.f77873b[i14].f82360h) == qm1Var20.f81890c[i14]) {
                        ns2Var.getClass();
                        ns2Var.a();
                    }
                    i14++;
                }
                ce2Var3 = this.f77896y;
                if (!ce2Var3.f76255g || ce2Var3.f76265q >= 500000 || (qm1Var3 = this.f77891t.f83095j) == null) {
                    this.Q = j10;
                } else if ((qm1Var3.f81891d ? qm1Var3.f81888a.getNextLoadPositionUs() : 0L) == Long.MIN_VALUE) {
                    this.Q = j10;
                } else if (this.Q == j10) {
                    ((f53) this.f77889r).getClass();
                    this.Q = SystemClock.elapsedRealtime();
                } else {
                    ((f53) this.f77889r).getClass();
                    if (SystemClock.elapsedRealtime() - this.Q >= 4000) {
                        throw new IllegalStateException("Playback stuck buffering and not loading");
                    }
                }
            } else {
                this.Q = j10;
            }
            if (l() || this.f77896y.f76253e != 3) {
                z13 = false;
            } else {
                z13 = z12;
            }
            if (this.J || !this.I || !z13) {
                z12 = false;
            }
            ce2Var2 = this.f77896y;
            if (ce2Var2.f76263o != z12) {
                this.f77896y = new ce2(ce2Var2.f76249a, ce2Var2.f76250b, ce2Var2.f76251c, ce2Var2.f76252d, ce2Var2.f76253e, ce2Var2.f76254f, ce2Var2.f76255g, ce2Var2.f76256h, ce2Var2.f76257i, ce2Var2.f76258j, ce2Var2.f76259k, ce2Var2.f76260l, ce2Var2.f76261m, ce2Var2.f76262n, ce2Var2.f76264p, ce2Var2.f76265q, ce2Var2.f76266r, z12);
            }
            this.I = false;
            if (!z12 || (i13 = this.f77896y.f76253e) == 4) {
            }
            if (!z13 && i13 != 2) {
                if (i13 == 3 && this.K != 0) {
                    this.f77880i.f78499a.sendEmptyMessageAtTime(2, jUptimeMillis + 1000);
                }
            } else {
                this.f77880i.f78499a.sendEmptyMessageAtTime(2, jUptimeMillis + 10);
            }
            d73.a();
            return;
        }
        z12 = true;
        if (this.f77896y.f76253e == 2) {
            i14 = 0;
            while (true) {
                roVarArr = this.f77873b;
                if (i14 < roVarArr.length) {
                    break;
                    break;
                } else {
                    if (!b(roVarArr[i14])) {
                    }
                    i14++;
                }
            }
            ce2Var3 = this.f77896y;
            if (ce2Var3.f76255g) {
                this.Q = j10;
            } else {
                this.Q = j10;
            }
        } else {
            this.Q = j10;
        }
        if (l()) {
            z13 = false;
        } else {
            z13 = false;
        }
        if (this.J) {
            z12 = false;
        } else {
            z12 = false;
        }
        ce2Var2 = this.f77896y;
        if (ce2Var2.f76263o != z12) {
            this.f77896y = new ce2(ce2Var2.f76249a, ce2Var2.f76250b, ce2Var2.f76251c, ce2Var2.f76252d, ce2Var2.f76253e, ce2Var2.f76254f, ce2Var2.f76255g, ce2Var2.f76256h, ce2Var2.f76257i, ce2Var2.f76258j, ce2Var2.f76259k, ce2Var2.f76260l, ce2Var2.f76261m, ce2Var2.f76262n, ce2Var2.f76264p, ce2Var2.f76265q, ce2Var2.f76266r, z12);
        }
        this.I = false;
        if (z12) {
        }
    }

    public final void c(boolean z10) {
        if (z10 == this.J) {
            return;
        }
        this.J = z10;
        if (z10 || !this.f77896y.f76263o) {
            return;
        }
        this.f77880i.f78499a.sendEmptyMessage(2);
    }

    public final void d(boolean z10) throws pn0 {
        this.B = z10;
        k();
        if (this.C) {
            tm1 tm1Var = this.f77891t;
            if (tm1Var.f83094i != tm1Var.f83093h) {
                b(true);
                a(false);
            }
        }
    }

    public final void b(boolean z10) throws pn0 {
        ym1 ym1Var = this.f77891t.f83093h.f81893f.f82688a;
        long jA = a(ym1Var, this.f77896y.f76266r, true, false);
        if (jA != this.f77896y.f76266r) {
            ce2 ce2Var = this.f77896y;
            this.f77896y = a(ym1Var, jA, ce2Var.f76251c, ce2Var.f76252d, z10, 5);
        }
    }

    public final void b(int i10) {
        ce2 ce2Var = this.f77896y;
        if (ce2Var.f76253e != i10) {
            if (i10 != 2) {
                this.Q = -9223372036854775807L;
            }
            this.f77896y = ce2Var.a(i10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:70:0x0145  */
    public final void a(boolean[] zArr) throws pn0 {
        qm1 qm1Var;
        t73 t73Var;
        int i10;
        zj1 zj1Var;
        qm1 qm1Var2 = this.f77891t.f83094i;
        t73 t73Var2 = qm1Var2.f81901n;
        for (int i11 = 0; i11 < this.f77873b.length; i11++) {
            if (!t73Var2.a(i11) && this.f77874c.remove(this.f77873b[i11])) {
                ro roVar = this.f77873b[i11];
                if (roVar.f82359g == 0) {
                    nx0 nx0Var = roVar.f82355c;
                    nx0Var.f80853a = null;
                    nx0Var.f80854b = null;
                    roVar.i();
                } else {
                    throw new IllegalStateException();
                }
            }
        }
        int i12 = 0;
        while (i12 < this.f77873b.length) {
            if (t73Var2.a(i12)) {
                boolean z10 = zArr[i12];
                ro roVar2 = this.f77873b[i12];
                if (b(roVar2)) {
                    qm1Var = qm1Var2;
                    t73Var = t73Var2;
                    i10 = i12;
                } else {
                    tm1 tm1Var = this.f77891t;
                    qm1 qm1Var3 = tm1Var.f83094i;
                    boolean z11 = qm1Var3 == tm1Var.f83093h;
                    t73 t73Var3 = qm1Var3.f81901n;
                    mn2 mn2Var = t73Var3.f82908b[i12];
                    op0 op0Var = t73Var3.f82909c[i12];
                    int iF = op0Var != null ? op0Var.f() : 0;
                    mx0[] mx0VarArr = new mx0[iF];
                    for (int i13 = 0; i13 < iF; i13++) {
                        mx0VarArr[i13] = op0Var.a(i13);
                    }
                    boolean z12 = l() && this.f77896y.f76253e == 3;
                    boolean z13 = !z10 && z12;
                    this.K++;
                    this.f77874c.add(roVar2);
                    ns2 ns2Var = qm1Var3.f81890c[i12];
                    i10 = i12;
                    long j10 = this.M;
                    long j11 = qm1Var3.f81893f.f82689b;
                    qm1Var = qm1Var2;
                    t73Var = t73Var2;
                    long j12 = qm1Var3.f81902o;
                    long j13 = j11 + j12;
                    if (roVar2.f82359g == 0) {
                        roVar2.f82356d = mn2Var;
                        roVar2.f82359g = 1;
                        roVar2.a(z11);
                        if (!roVar2.f82364l) {
                            roVar2.f82360h = ns2Var;
                            if (roVar2.f82363k == Long.MIN_VALUE) {
                                roVar2.f82363k = j13;
                            }
                            roVar2.f82361i = mx0VarArr;
                            roVar2.f82362j = j12;
                            roVar2.a(mx0VarArr, j13, j12);
                            roVar2.f82364l = false;
                            roVar2.f82363k = j10;
                            roVar2.a(j10, z13);
                            roVar2.handleMessage(11, new ao0(this));
                            de0 de0Var = this.f77887p;
                            de0Var.getClass();
                            zj1 zj1VarC = roVar2.c();
                            if (zj1VarC != null && zj1VarC != (zj1Var = de0Var.f76653e)) {
                                if (zj1Var == null) {
                                    de0Var.f76653e = zj1VarC;
                                    de0Var.f76652d = roVar2;
                                    ((fk1) zj1VarC).a(de0Var.f76650b.f78907f);
                                } else {
                                    throw new pn0(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000, 0);
                                }
                            }
                            if (!z12) {
                                continue;
                            } else if (roVar2.f82359g == 1) {
                                roVar2.f82359g = 2;
                                roVar2.j();
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
            } else {
                qm1Var = qm1Var2;
                t73Var = t73Var2;
                i10 = i12;
            }
            i12 = i10 + 1;
            qm1Var2 = qm1Var;
            t73Var2 = t73Var;
        }
        qm1Var2.f81894g = true;
    }

    public final long a(s63 s63Var, Object obj, long j10) {
        long jElapsedRealtime;
        s63Var.a(s63Var.a(obj, this.f77884m).f81268d, this.f77883l, 0L);
        r63 r63Var = this.f77883l;
        if (r63Var.f82123g != -9223372036854775807L && r63Var.a()) {
            r63 r63Var2 = this.f77883l;
            if (r63Var2.f82126j) {
                long j11 = r63Var2.f82124h;
                int i10 = ib3.f78556a;
                if (j11 == -9223372036854775807L) {
                    jElapsedRealtime = System.currentTimeMillis();
                } else {
                    jElapsedRealtime = j11 + SystemClock.elapsedRealtime();
                }
                return ib3.a(jElapsedRealtime - this.f77883l.f82123g) - (j10 + this.f77884m.f81270f);
            }
        }
        return -9223372036854775807L;
    }

    public final Pair a(s63 s63Var) {
        long j10 = 0;
        if (s63Var.c()) {
            return Pair.create(ce2.f76248s, 0L);
        }
        Pair pairA = s63Var.a(this.f77883l, this.f77884m, s63Var.a(this.G), -9223372036854775807L);
        ym1 ym1VarA = this.f77891t.a(s63Var, pairA.first, 0L);
        long jLongValue = ((Long) pairA.second).longValue();
        if (ym1VarA.a()) {
            s63Var.a(ym1VarA.f82311a, this.f77884m);
            if (ym1VarA.f82313c == this.f77884m.a(ym1VarA.f82312b)) {
                j10 = this.f77884m.f81272h.f76930d;
            }
        } else {
            j10 = jLongValue;
        }
        return Pair.create(ym1VarA, Long.valueOf(j10));
    }

    public final long a(long j10) {
        qm1 qm1Var = this.f77891t.f83095j;
        if (qm1Var == null) {
            return 0L;
        }
        return Math.max(0L, j10 - (this.M - qm1Var.f81902o));
    }

    public final void a(IOException iOException, int i10) {
        pn0 pn0Var = new pn0(0, iOException, i10, 0);
        qm1 qm1Var = this.f77891t.f83093h;
        if (qm1Var != null) {
            ym1 ym1Var = qm1Var.f81893f.f82688a;
            String message = pn0Var.getMessage();
            int i11 = ib3.f78556a;
            pn0Var = new pn0(message, pn0Var.getCause(), pn0Var.f75792b, pn0Var.f81460d, pn0Var.f81461e, pn0Var.f81462f, pn0Var.f81463g, pn0Var.f81464h, ym1Var, pn0Var.f75793c, pn0Var.f81466j);
        }
        ih1.b("ExoPlayerImplInternal", ih1.a("Playback error", pn0Var));
        a(false, false);
        this.f77896y = this.f77896y.a(pn0Var);
    }

    public final void a(boolean z10) {
        long j10;
        qm1 qm1Var = this.f77891t.f83095j;
        ym1 ym1Var = qm1Var == null ? this.f77896y.f76250b : qm1Var.f81893f.f82688a;
        boolean z11 = !this.f77896y.f76259k.equals(ym1Var);
        if (z11) {
            this.f77896y = this.f77896y.a(ym1Var);
        }
        ce2 ce2Var = this.f77896y;
        if (qm1Var == null) {
            j10 = ce2Var.f76266r;
        } else if (!qm1Var.f81891d) {
            j10 = qm1Var.f81893f.f82689b;
        } else {
            long bufferedPositionUs = qm1Var.f81892e ? qm1Var.f81888a.getBufferedPositionUs() : Long.MIN_VALUE;
            j10 = bufferedPositionUs == Long.MIN_VALUE ? qm1Var.f81893f.f82692e : bufferedPositionUs;
        }
        ce2Var.f76264p = j10;
        ce2 ce2Var2 = this.f77896y;
        ce2Var2.f76265q = a(ce2Var2.f76264p);
        if ((z11 || z10) && qm1Var != null && qm1Var.f81891d) {
            a(qm1Var.f81901n);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v52 ??, still in use, count: 1, list:
          (r0v52 ?? I:??[OBJECT, ARRAY]) from 0x0036: MOVE (r7v6 ?? I:??[OBJECT, ARRAY]) = (r0v52 ?? I:??[OBJECT, ARRAY])
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public final void a(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v52 ??, still in use, count: 1, list:
          (r0v52 ?? I:??[OBJECT, ARRAY]) from 0x0036: MOVE (r7v6 ?? I:??[OBJECT, ARRAY]) = (r0v52 ?? I:??[OBJECT, ARRAY])
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r37v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
        */

    public final void a(ee2 ee2Var, float f10, boolean z10, boolean z11) {
        int i10;
        go0 go0Var = this;
        if (z10) {
            if (z11) {
                go0Var.f77897z.a(1);
            }
            ce2 ce2Var = go0Var.f77896y;
            go0Var = this;
            go0Var.f77896y = new ce2(ce2Var.f76249a, ce2Var.f76250b, ce2Var.f76251c, ce2Var.f76252d, ce2Var.f76253e, ce2Var.f76254f, ce2Var.f76255g, ce2Var.f76256h, ce2Var.f76257i, ce2Var.f76258j, ce2Var.f76259k, ce2Var.f76260l, ce2Var.f76261m, ee2Var, ce2Var.f76264p, ce2Var.f76265q, ce2Var.f76266r, ce2Var.f76263o);
        }
        float f11 = ee2Var.f77040b;
        qm1 qm1Var = go0Var.f77891t.f83093h;
        while (true) {
            i10 = 0;
            if (qm1Var == null) {
                break;
            }
            op0[] op0VarArr = qm1Var.f81901n.f82909c;
            int length = op0VarArr.length;
            while (i10 < length) {
                op0 op0Var = op0VarArr[i10];
                if (op0Var != null) {
                    op0Var.a(f11);
                }
                i10++;
            }
            qm1Var = qm1Var.f81899l;
        }
        ro[] roVarArr = go0Var.f77873b;
        int length2 = roVarArr.length;
        while (i10 < length2) {
            ro roVar = roVarArr[i10];
            if (roVar != null) {
                roVar.a(f10, ee2Var.f77040b);
            }
            i10++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00bd  */
    public final ce2 a(ym1 ym1Var, long j10, long j11, long j12, boolean z10, int i10) {
        i73 i73Var;
        t73 t73Var;
        List list;
        i73 i73Var2;
        t73 t73Var2;
        sm2 sm2VarA;
        this.O = (!this.O && j10 == this.f77896y.f76266r && ym1Var.equals(this.f77896y.f76250b)) ? false : true;
        k();
        ce2 ce2Var = this.f77896y;
        i73 i73Var3 = ce2Var.f76256h;
        t73 t73Var3 = ce2Var.f76257i;
        List list2 = ce2Var.f76258j;
        if (this.f77892u.f78736k) {
            qm1 qm1Var = this.f77891t.f83093h;
            if (qm1Var == null) {
                i73Var2 = i73.f78512e;
            } else {
                i73Var2 = qm1Var.f81900m;
            }
            i73 i73Var4 = i73Var2;
            if (qm1Var == null) {
                t73Var2 = this.f77877f;
            } else {
                t73Var2 = qm1Var.f81901n;
            }
            t73 t73Var4 = t73Var2;
            op0[] op0VarArr = t73Var4.f82909c;
            l51 l51Var = new l51();
            boolean z11 = false;
            for (op0 op0Var : op0VarArr) {
                if (op0Var != null) {
                    ts1 ts1Var = op0Var.a(0).f80427k;
                    if (ts1Var == null) {
                        l51Var.a(new ts1(new ss1[0]));
                    } else {
                        l51Var.a(ts1Var);
                        z11 = true;
                    }
                }
            }
            if (z11) {
                sm2VarA = l51Var.a();
            } else {
                m51 m51Var = p51.f81258c;
                sm2VarA = sm2.f82697f;
            }
            sm2 sm2Var = sm2VarA;
            if (qm1Var != null) {
                sm1 sm1Var = qm1Var.f81893f;
                long j13 = sm1Var.f82690c;
                if (j13 != j11) {
                    if (j11 != j13) {
                        sm1Var = new sm1(sm1Var.f82688a, sm1Var.f82689b, j11, sm1Var.f82691d, sm1Var.f82692e, sm1Var.f82693f, sm1Var.f82694g, sm1Var.f82695h, sm1Var.f82696i);
                    }
                    qm1Var.f81893f = sm1Var;
                } else {
                    t73Var4 = t73Var4;
                }
            } else {
                t73Var4 = t73Var4;
            }
            i73Var = i73Var4;
            list = sm2Var;
            t73Var = t73Var4;
        } else if (ym1Var.equals(ce2Var.f76250b)) {
            i73Var = i73Var3;
            t73Var = t73Var3;
            list = list2;
        } else {
            i73Var = i73.f78512e;
            t73Var = this.f77877f;
            list = sm2.f82697f;
        }
        if (z10) {
            co0 co0Var = this.f77897z;
            if (!co0Var.f76344d || co0Var.f76345e == 5) {
                co0Var.f76341a = true;
                co0Var.f76344d = true;
                co0Var.f76345e = i10;
            } else if (i10 != 5) {
                throw new IllegalArgumentException();
            }
        }
        ce2 ce2Var2 = this.f77896y;
        return ce2Var2.a(ym1Var, j10, j11, j12, a(ce2Var2.f76264p), i73Var, t73Var, list);
    }

    @Override // yads.qx2
    public final void a(rx2 rx2Var) {
        this.f77880i.a(9, (pm1) rx2Var).b();
    }

    @Override // yads.om1
    public final void a(pm1 pm1Var) {
        this.f77880i.a(8, pm1Var).b();
    }

    public final void a(int i10, int i11, sy2 sy2Var) {
        this.f77897z.a(1);
        in1 in1Var = this.f77892u;
        in1Var.getClass();
        if (i10 >= 0 && i10 <= i11 && i11 <= in1Var.f78727b.size()) {
            in1Var.f78735j = sy2Var;
            in1Var.a(i10, i11);
            a(in1Var.a(), false);
            return;
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d7 A[PHI: r4 r5 r7
  0x00d7: PHI (r4v4 yads.ym1) = (r4v3 yads.ym1), (r4v11 yads.ym1) binds: [B:38:0x00ae, B:40:0x00d3] A[DONT_GENERATE, DONT_INLINE]
  0x00d7: PHI (r5v2 long) = (r5v1 long), (r5v8 long) binds: [B:38:0x00ae, B:40:0x00d3] A[DONT_GENERATE, DONT_INLINE]
  0x00d7: PHI (r7v3 long) = (r7v2 long), (r7v5 long) binds: [B:38:0x00ae, B:40:0x00d3] A[DONT_GENERATE, DONT_INLINE]] */
    public final void a(boolean z10, boolean z11, boolean z12, boolean z13) {
        long j10;
        boolean z14;
        List list;
        this.f77880i.f78499a.removeMessages(2);
        this.P = null;
        this.D = false;
        de0 de0Var = this.f77887p;
        de0Var.f76655g = false;
        j33 j33Var = de0Var.f76650b;
        if (j33Var.f78904c) {
            j33Var.a(j33Var.a());
            j33Var.f78904c = false;
        }
        this.M = 1000000000000L;
        for (ro roVar : this.f77873b) {
            try {
                a(roVar);
            } catch (RuntimeException | pn0 e10) {
                ih1.b("ExoPlayerImplInternal", ih1.a("Disable failed.", e10));
            }
        }
        if (z10) {
            for (ro roVar2 : this.f77873b) {
                if (this.f77874c.remove(roVar2)) {
                    try {
                        if (roVar2.f82359g == 0) {
                            nx0 nx0Var = roVar2.f82355c;
                            nx0Var.f80853a = null;
                            nx0Var.f80854b = null;
                            roVar2.i();
                        } else {
                            throw new IllegalStateException();
                        }
                    } catch (RuntimeException e11) {
                        ih1.b("ExoPlayerImplInternal", ih1.a("Reset failed.", e11));
                    }
                }
            }
        }
        this.K = 0;
        ce2 ce2Var = this.f77896y;
        ym1 ym1Var = ce2Var.f76250b;
        long jLongValue = ce2Var.f76266r;
        if (!this.f77896y.f76250b.a()) {
            ce2 ce2Var2 = this.f77896y;
            p63 p63Var = this.f77884m;
            ym1 ym1Var2 = ce2Var2.f76250b;
            s63 s63Var = ce2Var2.f76249a;
            if (!s63Var.c() && !s63Var.a(ym1Var2.f82311a, p63Var).f81271g) {
                j10 = this.f77896y.f76266r;
            } else {
                j10 = this.f77896y.f76251c;
            }
        } else {
            j10 = this.f77896y.f76251c;
        }
        if (z11) {
            this.L = null;
            Pair pairA = a(this.f77896y.f76249a);
            ym1Var = (ym1) pairA.first;
            jLongValue = ((Long) pairA.second).longValue();
            j10 = -9223372036854775807L;
            if (ym1Var.equals(this.f77896y.f76250b)) {
                z14 = false;
            } else {
                z14 = true;
            }
        } else {
            z14 = false;
        }
        ym1 ym1Var3 = ym1Var;
        long j11 = jLongValue;
        this.f77891t.b();
        this.E = false;
        ce2 ce2Var3 = this.f77896y;
        s63 s63Var2 = ce2Var3.f76249a;
        int i10 = ce2Var3.f76253e;
        pn0 pn0Var = z13 ? null : ce2Var3.f76254f;
        i73 i73Var = z14 ? i73.f78512e : ce2Var3.f76256h;
        t73 t73Var = z14 ? this.f77877f : ce2Var3.f76257i;
        if (z14) {
            m51 m51Var = p51.f81258c;
            list = sm2.f82697f;
        } else {
            list = ce2Var3.f76258j;
        }
        this.f77896y = new ce2(s63Var2, ym1Var3, j10, j11, i10, pn0Var, false, i73Var, t73Var, list, ym1Var3, ce2Var3.f76260l, ce2Var3.f76261m, ce2Var3.f76262n, j11, 0L, j11, false);
        if (z12) {
            in1 in1Var = this.f77892u;
            for (fn1 fn1Var : in1Var.f78733h.values()) {
                try {
                    fn1Var.f77457a.c(fn1Var.f77458b);
                } catch (RuntimeException e12) {
                    ih1.b("MediaSourceList", ih1.a("Failed to release child source.", e12));
                }
                fn1Var.f77457a.a((cn1) fn1Var.f77459c);
                fn1Var.f77457a.a((pk0) fn1Var.f77459c);
            }
            in1Var.f78733h.clear();
            in1Var.f78734i.clear();
            in1Var.f78736k = false;
        }
    }

    public final void a(s63 s63Var, s63 s63Var2) {
        if (s63Var.c() && s63Var2.c()) {
            return;
        }
        int size = this.f77888q.size() - 1;
        if (size < 0) {
            Collections.sort(this.f77888q);
        } else {
            a2.a(this.f77888q.get(size));
            throw null;
        }
    }

    public static Pair a(s63 s63Var, fo0 fo0Var, boolean z10, int i10, boolean z11, r63 r63Var, p63 p63Var) {
        Object objA;
        s63 s63Var2 = fo0Var.f77467a;
        if (s63Var.c()) {
            return null;
        }
        s63 s63Var3 = s63Var2.c() ? s63Var : s63Var2;
        try {
            Pair pairA = s63Var3.a(r63Var, p63Var, fo0Var.f77468b, fo0Var.f77469c);
            if (s63Var.equals(s63Var3)) {
                return pairA;
            }
            if (s63Var.a(pairA.first) != -1) {
                return (s63Var3.a(pairA.first, p63Var).f81271g && s63Var3.a(p63Var.f81268d, r63Var, 0L).f82132p == s63Var3.a(pairA.first)) ? s63Var.a(r63Var, p63Var, s63Var.a(pairA.first, p63Var).f81268d, fo0Var.f77469c) : pairA;
            }
            if (z10 && (objA = a(r63Var, p63Var, i10, z11, pairA.first, s63Var3, s63Var)) != null) {
                return s63Var.a(r63Var, p63Var, s63Var.a(objA, p63Var).f81268d, -9223372036854775807L);
            }
            return null;
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    public static Object a(r63 r63Var, p63 p63Var, int i10, boolean z10, Object obj, s63 s63Var, s63 s63Var2) {
        int iA = s63Var.a(obj);
        int iA2 = s63Var.a();
        int iA3 = iA;
        int iA4 = -1;
        for (int i11 = 0; i11 < iA2 && iA4 == -1; i11++) {
            iA3 = s63Var.a(iA3, p63Var, r63Var, i10, z10);
            if (iA3 == -1) {
                break;
            }
            iA4 = s63Var2.a(s63Var.a(iA3));
        }
        if (iA4 == -1) {
            return null;
        }
        return s63Var2.a(iA4);
    }

    public final void a(fo0 fo0Var) throws Throwable {
        long j10;
        long j11;
        ym1 ym1Var;
        boolean z10;
        long j12;
        long j13;
        long j14;
        ce2 ce2Var;
        int i10;
        this.f77897z.a(1);
        Pair pairA = a(this.f77896y.f76249a, fo0Var, true, this.F, this.G, this.f77883l, this.f77884m);
        if (pairA == null) {
            Pair pairA2 = a(this.f77896y.f76249a);
            ym1Var = (ym1) pairA2.first;
            long jLongValue = ((Long) pairA2.second).longValue();
            z10 = !this.f77896y.f76249a.c();
            j10 = jLongValue;
            j11 = -9223372036854775807L;
        } else {
            Object obj = pairA.first;
            long jLongValue2 = ((Long) pairA.second).longValue();
            long j15 = fo0Var.f77469c == -9223372036854775807L ? -9223372036854775807L : jLongValue2;
            ym1 ym1VarA = this.f77891t.a(this.f77896y.f76249a, obj, jLongValue2);
            if (ym1VarA.a()) {
                this.f77896y.f76249a.a(ym1VarA.f82311a, this.f77884m);
                jLongValue2 = this.f77884m.a(ym1VarA.f82312b) == ym1VarA.f82313c ? this.f77884m.f81272h.f76930d : 0L;
            } else if (fo0Var.f77469c != -9223372036854775807L) {
                j10 = jLongValue2;
                j11 = j15;
                ym1Var = ym1VarA;
                z10 = false;
            }
            j10 = jLongValue2;
            j11 = j15;
            ym1Var = ym1VarA;
            z10 = true;
        }
        try {
            if (this.f77896y.f76249a.c()) {
                this.L = fo0Var;
            } else {
                if (pairA == null) {
                    if (this.f77896y.f76253e != 1) {
                        b(4);
                    }
                    a(false, true, false, true);
                } else {
                    if (ym1Var.equals(this.f77896y.f76250b)) {
                        qm1 qm1Var = this.f77891t.f83093h;
                        long jA = (qm1Var == null || !qm1Var.f81891d || j10 == 0) ? j10 : qm1Var.f81888a.a(j10, this.f77895x);
                        if (ib3.b(jA) == ib3.b(this.f77896y.f76266r) && ((i10 = (ce2Var = this.f77896y).f76253e) == 2 || i10 == 3)) {
                            long j16 = ce2Var.f76266r;
                            this.f77896y = a(ym1Var, j16, j11, j16, z10, 2);
                            return;
                        }
                        j13 = jA;
                    } else {
                        j13 = j10;
                    }
                    boolean z11 = this.f77896y.f76253e == 4;
                    tm1 tm1Var = this.f77891t;
                    long jA2 = a(ym1Var, j13, tm1Var.f83093h != tm1Var.f83094i, z11);
                    boolean z12 = (j10 != jA2) | z10;
                    try {
                        ce2 ce2Var2 = this.f77896y;
                        s63 s63Var = ce2Var2.f76249a;
                        a(s63Var, ym1Var, s63Var, ce2Var2.f76250b, j11);
                        z10 = z12;
                        j14 = jA2;
                    } catch (Throwable th2) {
                        th = th2;
                        z10 = z12;
                        j12 = jA2;
                        this.f77896y = a(ym1Var, j12, j11, j12, z10, 2);
                        throw th;
                    }
                }
                this.f77896y = a(ym1Var, j14, j11, j14, z10, 2);
            }
            j14 = j10;
            this.f77896y = a(ym1Var, j14, j11, j14, z10, 2);
        } catch (Throwable th3) {
            th = th3;
            j12 = j10;
        }
    }

    public final long a(ym1 ym1Var, long j10, boolean z10, boolean z11) throws pn0 {
        tm1 tm1Var;
        long jSeekToUs;
        m();
        this.D = false;
        if (z11 || this.f77896y.f76253e == 3) {
            b(2);
        }
        qm1 qm1Var = this.f77891t.f83093h;
        qm1 qm1Var2 = qm1Var;
        while (qm1Var2 != null && !ym1Var.equals(qm1Var2.f81893f.f82688a)) {
            qm1Var2 = qm1Var2.f81899l;
        }
        if (z10 || qm1Var != qm1Var2 || (qm1Var2 != null && qm1Var2.f81902o + j10 < 0)) {
            for (ro roVar : this.f77873b) {
                a(roVar);
            }
            if (qm1Var2 != null) {
                while (true) {
                    tm1Var = this.f77891t;
                    if (tm1Var.f83093h == qm1Var2) {
                        break;
                    }
                    tm1Var.a();
                }
                tm1Var.a(qm1Var2);
                qm1Var2.f81902o = 1000000000000L;
                a(new boolean[this.f77873b.length]);
            }
        }
        if (qm1Var2 != null) {
            this.f77891t.a(qm1Var2);
            if (!qm1Var2.f81891d) {
                sm1 sm1Var = qm1Var2.f81893f;
                if (j10 != sm1Var.f82689b) {
                    sm1Var = new sm1(sm1Var.f82688a, j10, sm1Var.f82690c, sm1Var.f82691d, sm1Var.f82692e, sm1Var.f82693f, sm1Var.f82694g, sm1Var.f82695h, sm1Var.f82696i);
                }
                qm1Var2.f81893f = sm1Var;
            } else {
                qm1 qm1Var3 = qm1Var2;
                if (qm1Var3.f81892e) {
                    jSeekToUs = qm1Var3.f81888a.seekToUs(j10);
                    qm1Var3.f81888a.discardBuffer(jSeekToUs - this.f77885n, this.f77886o);
                }
                b(jSeekToUs);
                d();
            }
            jSeekToUs = j10;
            b(jSeekToUs);
            d();
        } else {
            this.f77891t.b();
            b(j10);
            jSeekToUs = j10;
        }
        a(false);
        this.f77880i.f78499a.sendEmptyMessage(2);
        return jSeekToUs;
    }

    public static void a(ro roVar, long j10) {
        roVar.f82364l = true;
        if (roVar instanceof a63) {
            a63 a63Var = (a63) roVar;
            if (a63Var.f82364l) {
                a63Var.B = j10;
                return;
            }
            throw new IllegalStateException();
        }
    }

    public final void a(boolean z10, AtomicBoolean atomicBoolean) {
        if (this.H != z10) {
            this.H = z10;
            if (!z10) {
                for (ro roVar : this.f77873b) {
                    if (!b(roVar) && this.f77874c.remove(roVar)) {
                        if (roVar.f82359g == 0) {
                            nx0 nx0Var = roVar.f82355c;
                            nx0Var.f80853a = null;
                            nx0Var.f80854b = null;
                            roVar.i();
                        } else {
                            throw new IllegalStateException();
                        }
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

    public final void a(bo0 bo0Var) {
        this.f77897z.a(1);
        if (bo0Var.f75918c != -1) {
            this.L = new fo0(new xf2(bo0Var.f75916a, bo0Var.f75917b), bo0Var.f75918c, bo0Var.f75919d);
        }
        in1 in1Var = this.f77892u;
        List list = bo0Var.f75916a;
        sy2 sy2Var = bo0Var.f75917b;
        in1Var.a(0, in1Var.f78727b.size());
        a(in1Var.a(in1Var.f78727b.size(), list, sy2Var), false);
    }

    public final void a(boolean z10, int i10, boolean z11, int i11) {
        this.f77897z.a(z11 ? 1 : 0);
        co0 co0Var = this.f77897z;
        co0Var.f76341a = true;
        co0Var.f76346f = true;
        co0Var.f76347g = i11;
        ce2 ce2Var = this.f77896y;
        this.f77896y = new ce2(ce2Var.f76249a, ce2Var.f76250b, ce2Var.f76251c, ce2Var.f76252d, ce2Var.f76253e, ce2Var.f76254f, ce2Var.f76255g, ce2Var.f76256h, ce2Var.f76257i, ce2Var.f76258j, ce2Var.f76259k, z10, i10, ce2Var.f76262n, ce2Var.f76264p, ce2Var.f76265q, ce2Var.f76266r, ce2Var.f76263o);
        this.D = false;
        for (qm1 qm1Var = this.f77891t.f83093h; qm1Var != null; qm1Var = qm1Var.f81899l) {
            for (op0 op0Var : qm1Var.f81901n.f82909c) {
                if (op0Var != null) {
                    op0Var.a(z10);
                }
            }
        }
        if (!l()) {
            m();
            o();
            return;
        }
        int i12 = this.f77896y.f76253e;
        if (i12 != 3) {
            if (i12 == 2) {
                this.f77880i.f78499a.sendEmptyMessage(2);
                return;
            }
            return;
        }
        this.D = false;
        de0 de0Var = this.f77887p;
        de0Var.f76655g = true;
        j33 j33Var = de0Var.f76650b;
        if (!j33Var.f78904c) {
            ((f53) j33Var.f78903b).getClass();
            j33Var.f78906e = SystemClock.elapsedRealtime();
            j33Var.f78904c = true;
        }
        for (ro roVar : this.f77873b) {
            if (b(roVar)) {
                if (roVar.f82359g == 1) {
                    roVar.f82359g = 2;
                    roVar.j();
                } else {
                    throw new IllegalStateException();
                }
            }
        }
        this.f77880i.f78499a.sendEmptyMessage(2);
    }

    public final void a(ee2 ee2Var) {
        this.f77887p.a(ee2Var);
        ee2 playbackParameters = this.f77887p.getPlaybackParameters();
        a(playbackParameters, playbackParameters.f77040b, true, true);
    }

    public final void a(int i10) throws pn0 {
        this.F = i10;
        tm1 tm1Var = this.f77891t;
        s63 s63Var = this.f77896y.f76249a;
        tm1Var.f83091f = i10;
        if (!tm1Var.a(s63Var)) {
            b(true);
        }
        a(false);
    }

    public final void a(sy2 sy2Var) {
        this.f77897z.a(1);
        in1 in1Var = this.f77892u;
        int size = in1Var.f78727b.size();
        if (sy2Var.f82834b.length != size) {
            sy2Var = new sy2(new int[0], new Random(sy2Var.f82833a.nextLong())).a(size);
        }
        in1Var.f78735j = sy2Var;
        a(in1Var.a(), false);
    }

    public final boolean a(s63 s63Var, ym1 ym1Var) {
        if (ym1Var.a() || s63Var.c()) {
            return false;
        }
        s63Var.a(s63Var.a(ym1Var.f82311a, this.f77884m).f81268d, this.f77883l, 0L);
        if (!this.f77883l.a()) {
            return false;
        }
        r63 r63Var = this.f77883l;
        return r63Var.f82126j && r63Var.f82123g != -9223372036854775807L;
    }

    public final void a(boolean z10, boolean z11) {
        a(z10 || !this.H, false, true, false);
        this.f77897z.a(z11 ? 1 : 0);
        ((zd0) this.f77878g).a(true);
        b(1);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void a(t73 t73Var) {
        sf1 sf1Var = this.f77878g;
        ro[] roVarArr = this.f77873b;
        op0[] op0VarArr = t73Var.f82909c;
        zd0 zd0Var = (zd0) sf1Var;
        int iMax = zd0Var.f85352f;
        if (iMax == -1) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                int i12 = 13107200;
                if (i10 < roVarArr.length) {
                    if (op0VarArr[i10] != null) {
                        switch (roVarArr[i10].f82354b) {
                            case -2:
                                i12 = 0;
                                i11 += i12;
                                break;
                            case -1:
                            default:
                                throw new IllegalArgumentException();
                            case 0:
                                i12 = 144310272;
                                i11 += i12;
                                break;
                            case 1:
                                i11 += i12;
                                break;
                            case 2:
                                i12 = 131072000;
                                i11 += i12;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                i12 = 131072;
                                i11 += i12;
                                break;
                        }
                    }
                    i10++;
                } else {
                    iMax = Math.max(13107200, i11);
                }
            }
        }
        zd0Var.f85356j = iMax;
        zd0Var.f85347a.a(iMax);
    }

    public final void a(s63 s63Var, ym1 ym1Var, s63 s63Var2, ym1 ym1Var2, long j10) {
        if (!a(s63Var, ym1Var)) {
            ee2 ee2Var = ym1Var.a() ? ee2.f77039e : this.f77896y.f76262n;
            if (this.f77887p.getPlaybackParameters().equals(ee2Var)) {
                return;
            }
            this.f77887p.a(ee2Var);
            return;
        }
        s63Var.a(s63Var.a(ym1Var.f82311a, this.f77884m).f81268d, this.f77883l, 0L);
        rf1 rf1Var = this.f77893v;
        yl1 yl1Var = this.f77883l.f82128l;
        int i10 = ib3.f78556a;
        yd0 yd0Var = (yd0) rf1Var;
        yd0Var.getClass();
        yd0Var.f84895d = ib3.a(yl1Var.f85039b);
        yd0Var.f84898g = ib3.a(yl1Var.f85040c);
        yd0Var.f84899h = ib3.a(yl1Var.f85041d);
        float f10 = yl1Var.f85042e;
        if (f10 == -3.4028235E38f) {
            f10 = 0.97f;
        }
        yd0Var.f84902k = f10;
        float f11 = yl1Var.f85043f;
        if (f11 == -3.4028235E38f) {
            f11 = 1.03f;
        }
        yd0Var.f84901j = f11;
        if (f10 == 1.0f && f11 == 1.0f) {
            yd0Var.f84895d = -9223372036854775807L;
        }
        yd0Var.a();
        if (j10 != -9223372036854775807L) {
            yd0 yd0Var2 = (yd0) this.f77893v;
            yd0Var2.f84896e = a(s63Var, ym1Var.f82311a, j10);
            yd0Var2.a();
        } else {
            if (ib3.a(s63Var2.c() ? null : s63Var2.a(s63Var2.a(ym1Var2.f82311a, this.f77884m).f81268d, this.f77883l, 0L).f82118b, this.f77883l.f82118b)) {
                return;
            }
            yd0 yd0Var3 = (yd0) this.f77893v;
            yd0Var3.f84896e = -9223372036854775807L;
            yd0Var3.a();
        }
    }

    public final synchronized void a(y43 y43Var, long j10) {
        ((f53) this.f77889r).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() + j10;
        boolean z10 = false;
        while (!((Boolean) y43Var.get()).booleanValue() && j10 > 0) {
            try {
                this.f77889r.getClass();
                wait(j10);
            } catch (InterruptedException unused) {
                z10 = true;
            }
            ((f53) this.f77889r).getClass();
            j10 = jElapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }
}
