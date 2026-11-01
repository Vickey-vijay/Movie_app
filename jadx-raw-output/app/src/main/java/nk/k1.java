package nk;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: Executors.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class k1 extends j1 implements r0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f64798c;

    public boolean equals(Object obj) {
        return (obj instanceof k1) && ((k1) obj).n() == n();
    }

    @Override // nk.j1
    public Executor n() {
        return this.f64798c;
    }

    public final void p(kotlin.coroutines.d dVar, RejectedExecutionException rejectedExecutionException) {
        t1.c(dVar, h1.a("The task was rejected", rejectedExecutionException));
    }

    public final ScheduledFuture<?> q(ScheduledExecutorService scheduledExecutorService, Runnable runnable, kotlin.coroutines.d dVar, long j10) {
        try {
            return scheduledExecutorService.schedule(runnable, j10, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            p(dVar, e10);
            return null;
        }
    }

    public k1(Executor executor) {
        this.f64798c = executor;
        if (n() instanceof ScheduledThreadPoolExecutor) {
            ((ScheduledThreadPoolExecutor) n()).setRemoveOnCancelPolicy(true);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ExecutorService executorService;
        Executor executorN = n();
        if (executorN instanceof ExecutorService) {
            executorService = (ExecutorService) executorN;
        } else {
            executorService = null;
        }
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // nk.h0
    public void dispatch(kotlin.coroutines.d dVar, Runnable runnable) {
        try {
            Executor executorN = n();
            b.a();
            executorN.execute(runnable);
        } catch (RejectedExecutionException e10) {
            b.a();
            p(dVar, e10);
            w0.b().dispatch(dVar, runnable);
        }
    }

    @Override // nk.r0
    public void e(long j10, l<? super mj.r> lVar) {
        ScheduledExecutorService scheduledExecutorService;
        Executor executorN = n();
        ScheduledFuture<?> scheduledFutureQ = null;
        if (executorN instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) executorN;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            scheduledFutureQ = q(scheduledExecutorService, new f2(this, lVar), lVar.getContext(), j10);
        }
        if (scheduledFutureQ != null) {
            o.c(lVar, new k(scheduledFutureQ));
        } else {
            n0.f64805h.e(j10, lVar);
        }
    }

    public int hashCode() {
        return System.identityHashCode(n());
    }

    @Override // nk.r0
    public y0 j(long j10, Runnable runnable, kotlin.coroutines.d dVar) {
        ScheduledExecutorService scheduledExecutorService;
        Executor executorN = n();
        ScheduledFuture<?> scheduledFutureQ = null;
        if (executorN instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) executorN;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            scheduledFutureQ = q(scheduledExecutorService, runnable, dVar, j10);
        }
        if (scheduledFutureQ != null) {
            return new x0(scheduledFutureQ);
        }
        return n0.f64805h.j(j10, runnable, dVar);
    }

    @Override // nk.h0
    public String toString() {
        return n().toString();
    }
}
