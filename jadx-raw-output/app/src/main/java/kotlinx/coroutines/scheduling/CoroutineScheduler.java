package kotlinx.coroutines.scheduling;

import ck.i;
import ck.p;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$ObjectRef;
import mj.r;
import nk.m0;
import sk.d0;
import sk.y;
import uk.g;
import uk.k;

/* JADX INFO: compiled from: CoroutineScheduler.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class CoroutineScheduler implements Executor, Closeable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f63176i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f63177j = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "parkedWorkersStack$volatile");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f63178k = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "controlState$volatile");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f63179l = AtomicIntegerFieldUpdater.newUpdater(CoroutineScheduler.class, "_isTerminated$volatile");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final d0 f63180m = new d0("NOT_IN_STACK");
    private volatile /* synthetic */ int _isTerminated$volatile;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f63181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f63182c;
    private volatile /* synthetic */ long controlState$volatile;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f63183d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f63184e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final uk.c f63185f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final uk.c f63186g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final y<c> f63187h;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* JADX INFO: compiled from: CoroutineScheduler.kt */
    public enum WorkerState {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED;


        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ uj.a f63189c = kotlin.enums.a.a(d());

        public static uj.a<WorkerState> getEntries() {
            return f63189c;
        }
    }

    /* JADX INFO: compiled from: CoroutineScheduler.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: CoroutineScheduler.kt */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WorkerState.values().length];
            try {
                iArr[WorkerState.PARKING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WorkerState.BLOCKING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WorkerState.CPU_ACQUIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[WorkerState.DORMANT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[WorkerState.TERMINATED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: compiled from: CoroutineScheduler.kt */
    public final class c extends Thread {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f63190j = AtomicIntegerFieldUpdater.newUpdater(c.class, "workerCtl$volatile");

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final k f63191b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Ref$ObjectRef<g> f63192c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public WorkerState f63193d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f63194e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f63195f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f63196g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f63197h;
        private volatile int indexInArray;
        private volatile Object nextParkedWorker;
        private volatile /* synthetic */ int workerCtl$volatile;

        public c() {
            setDaemon(true);
            setContextClassLoader(CoroutineScheduler.this.getClass().getClassLoader());
            this.f63191b = new k();
            this.f63192c = new Ref$ObjectRef<>();
            this.f63193d = WorkerState.DORMANT;
            this.nextParkedWorker = CoroutineScheduler.f63180m;
            int iNanoTime = (int) System.nanoTime();
            this.f63196g = iNanoTime == 0 ? 42 : iNanoTime;
        }

        public final g m() {
            if (k(2) == 0) {
                g gVarE = CoroutineScheduler.this.f63185f.e();
                return gVarE != null ? gVarE : CoroutineScheduler.this.f63186g.e();
            }
            g gVarE2 = CoroutineScheduler.this.f63186g.e();
            return gVarE2 != null ? gVarE2 : CoroutineScheduler.this.f63185f.e();
        }

        public final void n() {
            loop0: while (true) {
                boolean z10 = false;
                while (true) {
                    if (CoroutineScheduler.this.isTerminated() || this.f63193d == WorkerState.TERMINATED) {
                        break loop0;
                    }
                    g gVarF = f(this.f63197h);
                    if (gVarF != null) {
                        this.f63195f = 0L;
                        c(gVarF);
                        break;
                    }
                    this.f63197h = false;
                    if (this.f63195f == 0) {
                        r();
                    } else {
                        if (z10) {
                            s(WorkerState.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f63195f);
                            this.f63195f = 0L;
                            break;
                        }
                        z10 = true;
                    }
                }
            }
            s(WorkerState.TERMINATED);
        }

        public final void c(g gVar) {
            this.f63194e = 0L;
            if (this.f63193d == WorkerState.PARKING) {
                this.f63193d = WorkerState.BLOCKING;
            }
            if (!gVar.f72902c) {
                CoroutineScheduler.this.v(gVar);
                return;
            }
            if (s(WorkerState.BLOCKING)) {
                CoroutineScheduler.this.y();
            }
            CoroutineScheduler.this.v(gVar);
            CoroutineScheduler.n().addAndGet(CoroutineScheduler.this, -2097152L);
            if (this.f63193d != WorkerState.TERMINATED) {
                this.f63193d = WorkerState.DORMANT;
            }
        }

        public final g d(boolean z10) {
            g gVarM;
            g gVarM2;
            if (z10) {
                boolean z11 = k(CoroutineScheduler.this.f63181b * 2) == 0;
                if (z11 && (gVarM2 = m()) != null) {
                    return gVarM2;
                }
                g gVarK = this.f63191b.k();
                if (gVarK != null) {
                    return gVarK;
                }
                if (!z11 && (gVarM = m()) != null) {
                    return gVarM;
                }
            } else {
                g gVarM3 = m();
                if (gVarM3 != null) {
                    return gVarM3;
                }
            }
            return u(3);
        }

        public final g e() {
            g gVarL = this.f63191b.l();
            if (gVarL != null) {
                return gVarL;
            }
            g gVarE = CoroutineScheduler.this.f63186g.e();
            return gVarE == null ? u(1) : gVarE;
        }

        public final int g() {
            return this.indexInArray;
        }

        public final Object h() {
            return this.nextParkedWorker;
        }

        public final boolean j() {
            return this.nextParkedWorker != CoroutineScheduler.f63180m;
        }

        public final int k(int i10) {
            int i11 = this.f63196g;
            int i12 = i11 ^ (i11 << 13);
            int i13 = i12 ^ (i12 >> 17);
            int i14 = i13 ^ (i13 << 5);
            this.f63196g = i14;
            int i15 = i10 - 1;
            return (i15 & i10) == 0 ? i14 & i15 : (i14 & Integer.MAX_VALUE) % i10;
        }

        public final void l() {
            if (this.f63194e == 0) {
                this.f63194e = System.nanoTime() + CoroutineScheduler.this.f63183d;
            }
            LockSupport.parkNanos(CoroutineScheduler.this.f63183d);
            if (System.nanoTime() - this.f63194e >= 0) {
                this.f63194e = 0L;
                v();
            }
        }

        public final void o(int i10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(CoroutineScheduler.this.f63184e);
            sb2.append("-worker-");
            sb2.append(i10 == 0 ? "TERMINATED" : String.valueOf(i10));
            setName(sb2.toString());
            this.indexInArray = i10;
        }

        public final void p(Object obj) {
            this.nextParkedWorker = obj;
        }

        public final boolean q() {
            boolean z10;
            if (this.f63193d != WorkerState.CPU_ACQUIRED) {
                CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
                AtomicLongFieldUpdater atomicLongFieldUpdaterN = CoroutineScheduler.n();
                while (true) {
                    long j10 = atomicLongFieldUpdaterN.get(coroutineScheduler);
                    if (((int) ((9223367638808264704L & j10) >> 42)) == 0) {
                        z10 = false;
                        break;
                    }
                    if (CoroutineScheduler.n().compareAndSet(coroutineScheduler, j10, j10 - 4398046511104L)) {
                        z10 = true;
                        break;
                    }
                }
                if (!z10) {
                    return false;
                }
                this.f63193d = WorkerState.CPU_ACQUIRED;
            }
            return true;
        }

        public final boolean s(WorkerState workerState) {
            WorkerState workerState2 = this.f63193d;
            boolean z10 = workerState2 == WorkerState.CPU_ACQUIRED;
            if (z10) {
                CoroutineScheduler.n().addAndGet(CoroutineScheduler.this, 4398046511104L);
            }
            if (workerState2 != workerState) {
                this.f63193d = workerState;
            }
            return z10;
        }

        public final g u(int i10) {
            int i11 = (int) (CoroutineScheduler.n().get(CoroutineScheduler.this) & 2097151);
            if (i11 < 2) {
                return null;
            }
            int iK = k(i11);
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            long jMin = Long.MAX_VALUE;
            for (int i12 = 0; i12 < i11; i12++) {
                iK++;
                if (iK > i11) {
                    iK = 1;
                }
                c cVarB = coroutineScheduler.f63187h.b(iK);
                if (cVarB != null && cVarB != this) {
                    long jR = cVarB.f63191b.r(i10, this.f63192c);
                    if (jR == -1) {
                        Ref$ObjectRef<g> ref$ObjectRef = this.f63192c;
                        g gVar = ref$ObjectRef.element;
                        ref$ObjectRef.element = null;
                        return gVar;
                    }
                    if (jR > 0) {
                        jMin = Math.min(jMin, jR);
                    }
                }
            }
            if (jMin == Long.MAX_VALUE) {
                jMin = 0;
            }
            this.f63195f = jMin;
            return null;
        }

        public final void v() {
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            synchronized (coroutineScheduler.f63187h) {
                if (coroutineScheduler.isTerminated()) {
                    return;
                }
                if (((int) (CoroutineScheduler.n().get(coroutineScheduler) & 2097151)) <= coroutineScheduler.f63181b) {
                    return;
                }
                if (f63190j.compareAndSet(this, -1, 1)) {
                    int i10 = this.indexInArray;
                    o(0);
                    coroutineScheduler.t(this, i10, 0);
                    int andDecrement = (int) (CoroutineScheduler.n().getAndDecrement(coroutineScheduler) & 2097151);
                    if (andDecrement != i10) {
                        c cVarB = coroutineScheduler.f63187h.b(andDecrement);
                        p.g(cVarB);
                        c cVar = cVarB;
                        coroutineScheduler.f63187h.c(i10, cVar);
                        cVar.o(i10);
                        coroutineScheduler.t(cVar, andDecrement, i10);
                    }
                    coroutineScheduler.f63187h.c(andDecrement, null);
                    r rVar = r.f64562a;
                    this.f63193d = WorkerState.TERMINATED;
                }
            }
        }

        public final g f(boolean z10) {
            if (q()) {
                return d(z10);
            }
            return e();
        }

        public final void r() {
            if (!j()) {
                CoroutineScheduler.this.s(this);
                return;
            }
            f63190j.set(this, -1);
            while (j() && f63190j.get(this) == -1 && !CoroutineScheduler.this.isTerminated() && this.f63193d != WorkerState.TERMINATED) {
                s(WorkerState.PARKING);
                Thread.interrupted();
                l();
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            n();
        }

        public c(CoroutineScheduler coroutineScheduler, int i10) {
            this();
            o(i10);
        }
    }

    public static final /* synthetic */ AtomicLongFieldUpdater n() {
        return f63178k;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        m(this, runnable, false, false, 6, null);
    }

    public static /* synthetic */ boolean B(CoroutineScheduler coroutineScheduler, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = f63178k.get(coroutineScheduler);
        }
        return coroutineScheduler.A(j10);
    }

    public static /* synthetic */ void m(CoroutineScheduler coroutineScheduler, Runnable runnable, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        coroutineScheduler.l(runnable, z10, z11);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws InterruptedException {
        w(10000L);
    }

    public final boolean e(g gVar) {
        return gVar.f72902c ? this.f63186g.a(gVar) : this.f63185f.a(gVar);
    }

    public final int h() {
        synchronized (this.f63187h) {
            if (isTerminated()) {
                return -1;
            }
            long j10 = f63178k.get(this);
            int i10 = (int) (j10 & 2097151);
            int iD = ik.k.d(i10 - ((int) ((j10 & 4398044413952L) >> 21)), 0);
            if (iD >= this.f63181b) {
                return 0;
            }
            if (i10 >= this.f63182c) {
                return 0;
            }
            int i11 = ((int) (n().get(this) & 2097151)) + 1;
            if (!(i11 > 0 && this.f63187h.b(i11) == null)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            c cVar = new c(this, i11);
            this.f63187h.c(i11, cVar);
            if (!(i11 == ((int) (2097151 & f63178k.incrementAndGet(this))))) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            int i12 = iD + 1;
            cVar.start();
            return i12;
        }
    }

    public final g i(Runnable runnable, boolean z10) {
        long jA = uk.i.f72909f.a();
        if (!(runnable instanceof g)) {
            return uk.i.b(runnable, jA, z10);
        }
        g gVar = (g) runnable;
        gVar.f72901b = jA;
        gVar.f72902c = z10;
        return gVar;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        int iA = this.f63187h.a();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 1; i15 < iA; i15++) {
            c cVarB = this.f63187h.b(i15);
            if (cVarB != null) {
                int i16 = cVarB.f63191b.i();
                int i17 = b.$EnumSwitchMapping$0[cVarB.f63193d.ordinal()];
                if (i17 == 1) {
                    i12++;
                } else if (i17 == 2) {
                    i11++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i16);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (i17 == 3) {
                    i10++;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(i16);
                    sb3.append('c');
                    arrayList.add(sb3.toString());
                } else if (i17 == 4) {
                    i13++;
                    if (i16 > 0) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(i16);
                        sb4.append('d');
                        arrayList.add(sb4.toString());
                    }
                } else {
                    if (i17 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i14++;
                }
            }
        }
        long j10 = f63178k.get(this);
        return this.f63184e + '@' + m0.b(this) + "[Pool Size {core = " + this.f63181b + ", max = " + this.f63182c + "}, Worker States {CPU = " + i10 + ", blocking = " + i11 + ", parked = " + i12 + ", dormant = " + i13 + ", terminated = " + i14 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f63185f.c() + ", global blocking queue size = " + this.f63186g.c() + ", Control State {created workers= " + ((int) (2097151 & j10)) + ", blocking tasks = " + ((int) ((4398044413952L & j10) >> 21)) + ", CPUs acquired = " + (this.f63181b - ((int) ((9223367638808264704L & j10) >> 42))) + "}]";
    }

    public final g z(c cVar, g gVar, boolean z10) {
        WorkerState workerState;
        if (cVar == null || (workerState = cVar.f63193d) == WorkerState.TERMINATED) {
            return gVar;
        }
        if (!gVar.f72902c && workerState == WorkerState.BLOCKING) {
            return gVar;
        }
        cVar.f63197h = true;
        return cVar.f63191b.a(gVar, z10);
    }

    public CoroutineScheduler(int i10, int i11, long j10, String str) {
        boolean z10;
        boolean z11;
        boolean z12;
        this.f63181b = i10;
        this.f63182c = i11;
        this.f63183d = j10;
        this.f63184e = str;
        if (i10 >= 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (i11 >= i10) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (i11 <= 2097150) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    if (j10 > 0) {
                        this.f63185f = new uk.c();
                        this.f63186g = new uk.c();
                        this.f63187h = new y<>((i10 + 1) * 2);
                        this.controlState$volatile = ((long) i10) << 42;
                        return;
                    }
                    throw new IllegalArgumentException(("Idle worker keep alive time " + j10 + " must be positive").toString());
                }
                throw new IllegalArgumentException(("Max pool size " + i11 + " should not exceed maximal supported number of threads 2097150").toString());
            }
            throw new IllegalArgumentException(("Max pool size " + i11 + " should be greater than or equals to core pool size " + i10).toString());
        }
        throw new IllegalArgumentException(("Core pool size " + i10 + " should be at least 1").toString());
    }

    public final boolean A(long j10) {
        if (ik.k.d(((int) (2097151 & j10)) - ((int) ((j10 & 4398044413952L) >> 21)), 0) < this.f63181b) {
            int iH = h();
            if (iH == 1 && this.f63181b > 1) {
                h();
            }
            if (iH > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean C() {
        c cVarR;
        do {
            cVarR = r();
            if (cVarR == null) {
                return false;
            }
        } while (!c.f63190j.compareAndSet(cVarR, -1, 0));
        LockSupport.unpark(cVarR);
        return true;
    }

    public final boolean isTerminated() {
        if (f63179l.get(this) == 1) {
            return true;
        }
        return false;
    }

    public final c k() {
        c cVar;
        Thread threadCurrentThread = Thread.currentThread();
        if (threadCurrentThread instanceof c) {
            cVar = (c) threadCurrentThread;
        } else {
            cVar = null;
        }
        if (cVar == null || !p.e(CoroutineScheduler.this, this)) {
            return null;
        }
        return cVar;
    }

    public final void l(Runnable runnable, boolean z10, boolean z11) {
        long jAddAndGet;
        nk.b.a();
        g gVarI = i(runnable, z10);
        boolean z12 = gVarI.f72902c;
        if (z12) {
            jAddAndGet = f63178k.addAndGet(this, 2097152L);
        } else {
            jAddAndGet = 0;
        }
        g gVarZ = z(k(), gVarI, z11);
        if (gVarZ != null && !e(gVarZ)) {
            throw new RejectedExecutionException(this.f63184e + " was terminated");
        }
        if (z12) {
            x(jAddAndGet);
        } else {
            y();
        }
    }

    public final int q(c cVar) {
        Object objH = cVar.h();
        while (objH != f63180m) {
            if (objH == null) {
                return 0;
            }
            c cVar2 = (c) objH;
            int iG = cVar2.g();
            if (iG != 0) {
                return iG;
            }
            objH = cVar2.h();
        }
        return -1;
    }

    public final c r() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f63177j;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            c cVarB = this.f63187h.b((int) (2097151 & j10));
            if (cVarB == null) {
                return null;
            }
            long j11 = (2097152 + j10) & (-2097152);
            int iQ = q(cVarB);
            if (iQ >= 0 && f63177j.compareAndSet(this, j10, ((long) iQ) | j11)) {
                cVarB.p(f63180m);
                return cVarB;
            }
        }
    }

    public final boolean s(c cVar) {
        long j10;
        int iG;
        if (cVar.h() != f63180m) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f63177j;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            iG = cVar.g();
            cVar.p(this.f63187h.b((int) (2097151 & j10)));
        } while (!f63177j.compareAndSet(this, j10, ((2097152 + j10) & (-2097152)) | ((long) iG)));
        return true;
    }

    public final void t(c cVar, int i10, int i11) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f63177j;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            int iQ = (int) (2097151 & j10);
            long j11 = (2097152 + j10) & (-2097152);
            if (iQ == i10) {
                if (i11 == 0) {
                    iQ = q(cVar);
                } else {
                    iQ = i11;
                }
            }
            if (iQ >= 0 && f63177j.compareAndSet(this, j10, j11 | ((long) iQ))) {
                return;
            }
        }
    }

    public final void v(g gVar) {
        try {
            gVar.run();
        } catch (Throwable th2) {
            try {
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th2);
            } finally {
                nk.b.a();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005f  */
    public final void w(long j10) throws InterruptedException {
        int i10;
        g gVarE;
        if (!f63179l.compareAndSet(this, 0, 1)) {
            return;
        }
        c cVarK = k();
        synchronized (this.f63187h) {
            i10 = (int) (n().get(this) & 2097151);
        }
        if (1 <= i10) {
            int i11 = 1;
            while (true) {
                c cVarB = this.f63187h.b(i11);
                p.g(cVarB);
                c cVar = cVarB;
                if (cVar != cVarK) {
                    while (cVar.getState() != Thread.State.TERMINATED) {
                        LockSupport.unpark(cVar);
                        cVar.join(j10);
                    }
                    cVar.f63191b.j(this.f63186g);
                }
                if (i11 == i10) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        this.f63186g.b();
        this.f63185f.b();
        while (true) {
            if (cVarK != null) {
                gVarE = cVarK.f(true);
                if (gVarE == null) {
                    gVarE = this.f63185f.e();
                    if (gVarE == null) {
                        continue;
                    }
                } else {
                    continue;
                }
            } else {
                gVarE = this.f63185f.e();
                if (gVarE == null && (gVarE = this.f63186g.e()) == null) {
                    break;
                }
            }
            v(gVarE);
        }
        if (cVarK != null) {
            cVarK.s(WorkerState.TERMINATED);
        }
        f63177j.set(this, 0L);
        f63178k.set(this, 0L);
    }

    public final void x(long j10) {
        if (C() || A(j10)) {
            return;
        }
        C();
    }

    public final void y() {
        if (C() || B(this, 0L, 1, null)) {
            return;
        }
        C();
    }
}
