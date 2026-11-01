package nk;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: EventLoop.common.kt */
/* JADX INFO: loaded from: classes9.dex */
public abstract class d1 extends e1 implements r0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f64775e = AtomicReferenceFieldUpdater.newUpdater(d1.class, Object.class, "_queue$volatile");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f64776f = AtomicReferenceFieldUpdater.newUpdater(d1.class, Object.class, "_delayed$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f64777g = AtomicIntegerFieldUpdater.newUpdater(d1.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ Object _queue$volatile;

    /* JADX INFO: compiled from: EventLoop.common.kt */
    public final class a extends c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final l<mj.r> f64778d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(long j10, l<? super mj.r> lVar) {
            super(j10);
            this.f64778d = lVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f64778d.z(d1.this, mj.r.f64562a);
        }

        @Override // nk.d1.c
        public String toString() {
            return super.toString() + this.f64778d;
        }
    }

    /* JADX INFO: compiled from: EventLoop.common.kt */
    public static final class b extends c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Runnable f64780d;

        @Override // java.lang.Runnable
        public void run() {
            this.f64780d.run();
        }

        @Override // nk.d1.c
        public String toString() {
            return super.toString() + this.f64780d;
        }

        public b(long j10, Runnable runnable) {
            super(j10);
            this.f64780d = runnable;
        }
    }

    /* JADX INFO: compiled from: EventLoop.common.kt */
    public static abstract class c implements Runnable, Comparable<c>, y0, sk.n0 {
        private volatile Object _heap;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f64781b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f64782c = -1;

        @Override // nk.y0
        public final void dispose() {
            synchronized (this) {
                Object obj = this._heap;
                if (obj == g1.f64791a) {
                    return;
                }
                d dVar = obj instanceof d ? (d) obj : null;
                if (dVar != null) {
                    dVar.h(this);
                }
                this._heap = g1.f64791a;
                mj.r rVar = mj.r.f64562a;
            }
        }

        public final int f(long j10, d dVar, d1 d1Var) {
            synchronized (this) {
                if (this._heap == g1.f64791a) {
                    return 2;
                }
                synchronized (dVar) {
                    c cVarB = dVar.b();
                    if (d1Var.d()) {
                        return 1;
                    }
                    if (cVarB == null) {
                        dVar.f64783c = j10;
                    } else {
                        long j11 = cVarB.f64781b;
                        if (j11 - j10 < 0) {
                            j10 = j11;
                        }
                        if (j10 - dVar.f64783c > 0) {
                            dVar.f64783c = j10;
                        }
                    }
                    long j12 = this.f64781b;
                    long j13 = dVar.f64783c;
                    if (j12 - j13 < 0) {
                        this.f64781b = j13;
                    }
                    dVar.a(this);
                    return 0;
                }
            }
        }

        @Override // sk.n0
        public sk.m0<?> c() {
            Object obj = this._heap;
            if (obj instanceof sk.m0) {
                return (sk.m0) obj;
            }
            return null;
        }

        @Override // sk.n0
        public void d(sk.m0<?> m0Var) {
            if (!(this._heap != g1.f64791a)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            this._heap = m0Var;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            long j10 = this.f64781b - cVar.f64781b;
            if (j10 > 0) {
                return 1;
            }
            return j10 < 0 ? -1 : 0;
        }

        public final boolean g(long j10) {
            return j10 - this.f64781b >= 0;
        }

        @Override // sk.n0
        public int getIndex() {
            return this.f64782c;
        }

        @Override // sk.n0
        public void setIndex(int i10) {
            this.f64782c = i10;
        }

        public String toString() {
            return "Delayed[nanos=" + this.f64781b + ']';
        }

        public c(long j10) {
            this.f64781b = j10;
        }
    }

    /* JADX INFO: compiled from: EventLoop.common.kt */
    public static final class d extends sk.m0<c> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f64783c;

        public d(long j10) {
            this.f64783c = j10;
        }
    }

    @Override // nk.c1
    public void shutdown() {
        l2.f64799a.c();
        h0(true);
        S();
        while (J() <= 0) {
        }
        b0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean d() {
        if (f64777g.get(this) == 1) {
            return true;
        }
        return false;
    }

    @Override // nk.c1
    public long J() {
        if (K()) {
            return 0L;
        }
        V();
        Runnable runnableT = T();
        if (runnableT != null) {
            runnableT.run();
            return 0L;
        }
        return w();
    }

    public final void S() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f64775e;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                if (androidx.concurrent.futures.a.a(f64775e, this, null, g1.f64792b)) {
                    return;
                }
            } else if (obj instanceof sk.q) {
                ((sk.q) obj).d();
                return;
            } else {
                if (obj == g1.f64792b) {
                    return;
                }
                sk.q qVar = new sk.q(8, true);
                ck.p.h(obj, "null cannot be cast to non-null type java.lang.Runnable");
                qVar.a((Runnable) obj);
                if (androidx.concurrent.futures.a.a(f64775e, this, obj, qVar)) {
                    return;
                }
            }
        }
    }

    public final Runnable T() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f64775e;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return null;
            }
            if (obj instanceof sk.q) {
                ck.p.h(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable>");
                sk.q qVar = (sk.q) obj;
                Object objM = qVar.m();
                if (objM != sk.q.f71979h) {
                    return (Runnable) objM;
                }
                androidx.concurrent.futures.a.a(f64775e, this, obj, qVar.l());
            } else {
                if (obj == g1.f64792b) {
                    return null;
                }
                if (androidx.concurrent.futures.a.a(f64775e, this, obj, null)) {
                    ck.p.h(obj, "null cannot be cast to non-null type java.lang.Runnable");
                    return (Runnable) obj;
                }
            }
        }
    }

    public void U(Runnable runnable) {
        V();
        if (W(runnable)) {
            Q();
        } else {
            n0.f64805h.U(runnable);
        }
    }

    public final void V() {
        c cVarI;
        boolean zW;
        d dVar = (d) f64776f.get(this);
        if (dVar != null && !dVar.e()) {
            nk.b.a();
            long jNanoTime = System.nanoTime();
            do {
                synchronized (dVar) {
                    c cVarB = dVar.b();
                    cVarI = null;
                    if (cVarB != null) {
                        c cVar = cVarB;
                        if (cVar.g(jNanoTime)) {
                            zW = W(cVar);
                        } else {
                            zW = false;
                        }
                        if (zW) {
                            cVarI = dVar.i(0);
                        }
                    }
                }
            } while (cVarI != null);
        }
    }

    public final boolean W(Runnable runnable) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f64775e;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (d()) {
                return false;
            }
            if (obj == null) {
                if (androidx.concurrent.futures.a.a(f64775e, this, null, runnable)) {
                    return true;
                }
            } else if (obj instanceof sk.q) {
                ck.p.h(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable>");
                sk.q qVar = (sk.q) obj;
                int iA = qVar.a(runnable);
                if (iA == 0) {
                    return true;
                }
                if (iA != 1) {
                    if (iA == 2) {
                        return false;
                    }
                } else {
                    androidx.concurrent.futures.a.a(f64775e, this, obj, qVar.l());
                }
            } else {
                if (obj == g1.f64792b) {
                    return false;
                }
                sk.q qVar2 = new sk.q(8, true);
                ck.p.h(obj, "null cannot be cast to non-null type java.lang.Runnable");
                qVar2.a((Runnable) obj);
                qVar2.a(runnable);
                if (androidx.concurrent.futures.a.a(f64775e, this, obj, qVar2)) {
                    return true;
                }
            }
        }
    }

    public boolean a0() {
        if (!D()) {
            return false;
        }
        d dVar = (d) f64776f.get(this);
        if (dVar != null && !dVar.e()) {
            return false;
        }
        Object obj = f64775e.get(this);
        if (obj != null) {
            if (obj instanceof sk.q) {
                return ((sk.q) obj).j();
            }
            if (obj != g1.f64792b) {
                return false;
            }
        }
        return true;
    }

    public final void b0() {
        c cVarJ;
        nk.b.a();
        long jNanoTime = System.nanoTime();
        while (true) {
            d dVar = (d) f64776f.get(this);
            if (dVar != null && (cVarJ = dVar.j()) != null) {
                P(jNanoTime, cVarJ);
            } else {
                return;
            }
        }
    }

    public final void c0() {
        f64775e.set(this, null);
        f64776f.set(this, null);
    }

    @Override // nk.h0
    public final void dispatch(kotlin.coroutines.d dVar, Runnable runnable) {
        U(runnable);
    }

    @Override // nk.r0
    public void e(long j10, l<? super mj.r> lVar) {
        long jC = g1.c(j10);
        if (jC < 4611686018427387903L) {
            nk.b.a();
            long jNanoTime = System.nanoTime();
            a aVar = new a(jC + jNanoTime, lVar);
            e0(jNanoTime, aVar);
            o.a(lVar, aVar);
        }
    }

    public final void e0(long j10, c cVar) {
        int iF0 = f0(j10, cVar);
        if (iF0 != 0) {
            if (iF0 != 1) {
                if (iF0 != 2) {
                    throw new IllegalStateException("unexpected result".toString());
                }
                return;
            } else {
                P(j10, cVar);
                return;
            }
        }
        if (i0(cVar)) {
            Q();
        }
    }

    public final int f0(long j10, c cVar) {
        if (d()) {
            return 1;
        }
        d dVar = (d) f64776f.get(this);
        if (dVar == null) {
            androidx.concurrent.futures.a.a(f64776f, this, null, new d(j10));
            Object obj = f64776f.get(this);
            ck.p.g(obj);
            dVar = (d) obj;
        }
        return cVar.f(j10, dVar, this);
    }

    public final y0 g0(long j10, Runnable runnable) {
        long jC = g1.c(j10);
        if (jC < 4611686018427387903L) {
            nk.b.a();
            long jNanoTime = System.nanoTime();
            b bVar = new b(jC + jNanoTime, runnable);
            e0(jNanoTime, bVar);
            return bVar;
        }
        return a2.f64759b;
    }

    public final void h0(boolean z10) {
        f64777g.set(this, z10 ? 1 : 0);
    }

    public final boolean i0(c cVar) {
        c cVarF;
        d dVar = (d) f64776f.get(this);
        if (dVar != null) {
            cVarF = dVar.f();
        } else {
            cVarF = null;
        }
        if (cVarF == cVar) {
            return true;
        }
        return false;
    }

    @Override // nk.r0
    public y0 j(long j10, Runnable runnable, kotlin.coroutines.d dVar) {
        return r0.a.a(this, j10, runnable, dVar);
    }

    @Override // nk.c1
    public long w() {
        c cVarF;
        if (super.w() == 0) {
            return 0L;
        }
        Object obj = f64775e.get(this);
        if (obj != null) {
            if (obj instanceof sk.q) {
                if (!((sk.q) obj).j()) {
                    return 0L;
                }
            } else {
                if (obj != g1.f64792b) {
                    return 0L;
                }
                return Long.MAX_VALUE;
            }
        }
        d dVar = (d) f64776f.get(this);
        if (dVar == null || (cVarF = dVar.f()) == null) {
            return Long.MAX_VALUE;
        }
        long j10 = cVarF.f64781b;
        nk.b.a();
        return ik.k.e(j10 - System.nanoTime(), 0L);
    }
}
