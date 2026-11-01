package io.reactivex.internal.schedulers;

import aj.f;
import ii.s;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: NewThreadWorker.java */
/* JADX INFO: loaded from: classes2.dex */
public class a extends s.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ScheduledExecutorService f61386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f61387c;

    @Override // ii.s.c
    public mi.b b(Runnable runnable) {
        return c(runnable, 0L, null);
    }

    @Override // ii.s.c
    public mi.b c(Runnable runnable, long j10, TimeUnit timeUnit) {
        return this.f61387c ? EmptyDisposable.INSTANCE : e(runnable, j10, timeUnit, null);
    }

    @Override // mi.b
    public void dispose() {
        if (this.f61387c) {
            return;
        }
        this.f61387c = true;
        this.f61386b.shutdownNow();
    }

    public mi.b f(Runnable runnable, long j10, TimeUnit timeUnit) {
        ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(ej.a.u(runnable));
        try {
            scheduledDirectTask.setFuture(j10 <= 0 ? this.f61386b.submit(scheduledDirectTask) : this.f61386b.schedule(scheduledDirectTask, j10, timeUnit));
            return scheduledDirectTask;
        } catch (RejectedExecutionException e10) {
            ej.a.s(e10);
            return EmptyDisposable.INSTANCE;
        }
    }

    public void h() {
        if (this.f61387c) {
            return;
        }
        this.f61387c = true;
        this.f61386b.shutdown();
    }

    @Override // mi.b
    public boolean isDisposed() {
        return this.f61387c;
    }

    public a(ThreadFactory threadFactory) {
        this.f61386b = f.a(threadFactory);
    }

    public ScheduledRunnable e(Runnable runnable, long j10, TimeUnit timeUnit, pi.a aVar) {
        Future<?> futureSchedule;
        ScheduledRunnable scheduledRunnable = new ScheduledRunnable(ej.a.u(runnable), aVar);
        if (aVar != null && !aVar.b(scheduledRunnable)) {
            return scheduledRunnable;
        }
        try {
            if (j10 <= 0) {
                futureSchedule = this.f61386b.submit((Callable) scheduledRunnable);
            } else {
                futureSchedule = this.f61386b.schedule((Callable) scheduledRunnable, j10, timeUnit);
            }
            scheduledRunnable.setFuture(futureSchedule);
        } catch (RejectedExecutionException e10) {
            if (aVar != null) {
                aVar.a(scheduledRunnable);
            }
            ej.a.s(e10);
        }
        return scheduledRunnable;
    }

    public mi.b g(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        Future<?> futureSchedule;
        Runnable runnableU = ej.a.u(runnable);
        if (j11 <= 0) {
            aj.b bVar = new aj.b(runnableU, this.f61386b);
            try {
                if (j10 <= 0) {
                    futureSchedule = this.f61386b.submit(bVar);
                } else {
                    futureSchedule = this.f61386b.schedule(bVar, j10, timeUnit);
                }
                bVar.a(futureSchedule);
                return bVar;
            } catch (RejectedExecutionException e10) {
                ej.a.s(e10);
                return EmptyDisposable.INSTANCE;
            }
        }
        ScheduledDirectPeriodicTask scheduledDirectPeriodicTask = new ScheduledDirectPeriodicTask(runnableU);
        try {
            scheduledDirectPeriodicTask.setFuture(this.f61386b.scheduleAtFixedRate(scheduledDirectPeriodicTask, j10, j11, timeUnit));
            return scheduledDirectPeriodicTask;
        } catch (RejectedExecutionException e11) {
            ej.a.s(e11);
            return EmptyDisposable.INSTANCE;
        }
    }
}
