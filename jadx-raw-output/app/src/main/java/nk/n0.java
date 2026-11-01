package nk;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: DefaultExecutor.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class n0 extends d1 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final n0 f64805h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final long f64806i;

    public final synchronized void j0() {
        if (m0()) {
            debugStatus = 3;
            c0();
            ck.p.h(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    public final synchronized Thread k0() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setContextClassLoader(f64805h.getClass().getClassLoader());
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    public final synchronized boolean n0() {
        if (m0()) {
            return false;
        }
        debugStatus = 1;
        ck.p.h(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return true;
    }

    @Override // nk.d1, nk.c1
    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // nk.h0
    public String toString() {
        return "DefaultExecutor";
    }

    static {
        Long l10;
        n0 n0Var = new n0();
        f64805h = n0Var;
        c1.z(n0Var, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l10 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l10 = 1000L;
        }
        f64806i = timeUnit.toNanos(l10.longValue());
    }

    @Override // nk.e1
    public Thread M() {
        Thread thread = _thread;
        return thread == null ? k0() : thread;
    }

    public final boolean l0() {
        return debugStatus == 4;
    }

    public final boolean m0() {
        int i10 = debugStatus;
        return i10 == 2 || i10 == 3;
    }

    public final void o0() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean zA0;
        l2.f64799a.d(this);
        b.a();
        try {
            if (!n0()) {
                if (zA0) {
                    return;
                } else {
                    return;
                }
            }
            long j10 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long J = J();
                if (J == Long.MAX_VALUE) {
                    b.a();
                    long jNanoTime = System.nanoTime();
                    if (j10 == Long.MAX_VALUE) {
                        j10 = f64806i + jNanoTime;
                    }
                    long j11 = j10 - jNanoTime;
                    if (j11 <= 0) {
                        if (zA0) {
                            return;
                        } else {
                            return;
                        }
                    }
                    J = ik.k.h(J, j11);
                } else {
                    j10 = Long.MAX_VALUE;
                }
                if (J > 0) {
                    if (m0()) {
                        if (zA0) {
                            return;
                        } else {
                            return;
                        }
                    } else {
                        b.a();
                        LockSupport.parkNanos(this, J);
                    }
                }
            }
        } finally {
            _thread = null;
            j0();
            b.a();
            if (!a0()) {
                M();
            }
        }
    }

    @Override // nk.e1
    public void P(long j10, d1.c cVar) {
        o0();
    }

    @Override // nk.d1
    public void U(Runnable runnable) {
        if (l0()) {
            o0();
        }
        super.U(runnable);
    }

    @Override // nk.d1, nk.r0
    public y0 j(long j10, Runnable runnable, kotlin.coroutines.d dVar) {
        return g0(j10, runnable);
    }
}
