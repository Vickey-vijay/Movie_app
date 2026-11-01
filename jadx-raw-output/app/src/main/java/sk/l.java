package sk;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.EmptyCoroutineContext;
import nk.r0;
import nk.y0;

/* JADX INFO: compiled from: LimitedDispatcher.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class l extends nk.h0 implements r0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f71959h = AtomicIntegerFieldUpdater.newUpdater(l.class, "runningWorkers$volatile");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r0 f71960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nk.h0 f71961c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f71962d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f71963e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p<Runnable> f71964f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f71965g;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX INFO: compiled from: LimitedDispatcher.kt */
    public final class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Runnable f71966b;

        @Override // java.lang.Runnable
        public void run() {
            int i10 = 0;
            while (true) {
                try {
                    this.f71966b.run();
                } catch (Throwable th2) {
                    nk.j0.a(EmptyCoroutineContext.INSTANCE, th2);
                }
                Runnable runnableR = l.this.r();
                if (runnableR == null) {
                    return;
                }
                this.f71966b = runnableR;
                i10++;
                if (i10 >= 16 && h.d(l.this.f71961c, l.this)) {
                    h.c(l.this.f71961c, l.this, this);
                    return;
                }
            }
        }

        public a(Runnable runnable) {
            this.f71966b = runnable;
        }
    }

    @Override // nk.r0
    public void e(long j10, nk.l<? super mj.r> lVar) {
        this.f71960b.e(j10, lVar);
    }

    @Override // nk.r0
    public y0 j(long j10, Runnable runnable, kotlin.coroutines.d dVar) {
        return this.f71960b.j(j10, runnable, dVar);
    }

    @Override // nk.h0
    public void dispatch(kotlin.coroutines.d dVar, Runnable runnable) {
        Runnable runnableR;
        this.f71964f.a(runnable);
        if (f71959h.get(this) >= this.f71962d || !w() || (runnableR = r()) == null) {
            return;
        }
        h.c(this.f71961c, this, new a(runnableR));
    }

    @Override // nk.h0
    public void dispatchYield(kotlin.coroutines.d dVar, Runnable runnable) {
        Runnable runnableR;
        this.f71964f.a(runnable);
        if (f71959h.get(this) >= this.f71962d || !w() || (runnableR = r()) == null) {
            return;
        }
        this.f71961c.dispatchYield(this, new a(runnableR));
    }

    public final Runnable r() {
        while (true) {
            Runnable runnableE = this.f71964f.e();
            if (runnableE != null) {
                return runnableE;
            }
            synchronized (this.f71965g) {
                f71959h.decrementAndGet(this);
                if (this.f71964f.c() == 0) {
                    return null;
                }
                f71959h.incrementAndGet(this);
            }
        }
    }

    @Override // nk.h0
    public String toString() {
        String str = this.f71963e;
        if (str != null) {
            return str;
        }
        return this.f71961c + ".limitedParallelism(" + this.f71962d + ')';
    }

    public final boolean w() {
        synchronized (this.f71965g) {
            if (f71959h.get(this) >= this.f71962d) {
                return false;
            }
            f71959h.incrementAndGet(this);
            return true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l(nk.h0 h0Var, int i10, String str) {
        r0 r0Var;
        if (h0Var instanceof r0) {
            r0Var = (r0) h0Var;
        } else {
            r0Var = null;
        }
        this.f71960b = r0Var == null ? nk.o0.a() : r0Var;
        this.f71961c = h0Var;
        this.f71962d = i10;
        this.f71963e = str;
        this.f71964f = new p<>(false);
        this.f71965g = new Object();
    }

    @Override // nk.h0
    public nk.h0 limitedParallelism(int i10, String str) {
        m.a(i10);
        if (i10 >= this.f71962d) {
            return m.b(this, str);
        }
        return super.limitedParallelism(i10, str);
    }
}
