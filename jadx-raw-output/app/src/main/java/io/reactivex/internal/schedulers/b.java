package io.reactivex.internal.schedulers;

import aj.f;
import ii.s;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: SingleScheduler.java */
/* JADX INFO: loaded from: classes11.dex */
public final class b extends s {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final RxThreadFactory f61388d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ScheduledExecutorService f61389e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ThreadFactory f61390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference<ScheduledExecutorService> f61391c;

    /* JADX INFO: compiled from: SingleScheduler.java */
    public static final class a extends s.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ScheduledExecutorService f61392b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final mi.a f61393c = new mi.a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public volatile boolean f61394d;

        @Override // ii.s.c
        public mi.b c(Runnable runnable, long j10, TimeUnit timeUnit) {
            if (this.f61394d) {
                return EmptyDisposable.INSTANCE;
            }
            ScheduledRunnable scheduledRunnable = new ScheduledRunnable(ej.a.u(runnable), this.f61393c);
            this.f61393c.b(scheduledRunnable);
            try {
                scheduledRunnable.setFuture(j10 <= 0 ? this.f61392b.submit((Callable) scheduledRunnable) : this.f61392b.schedule((Callable) scheduledRunnable, j10, timeUnit));
                return scheduledRunnable;
            } catch (RejectedExecutionException e10) {
                dispose();
                ej.a.s(e10);
                return EmptyDisposable.INSTANCE;
            }
        }

        @Override // mi.b
        public void dispose() {
            if (this.f61394d) {
                return;
            }
            this.f61394d = true;
            this.f61393c.dispose();
        }

        @Override // mi.b
        public boolean isDisposed() {
            return this.f61394d;
        }

        public a(ScheduledExecutorService scheduledExecutorService) {
            this.f61392b = scheduledExecutorService;
        }
    }

    static {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(0);
        f61389e = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.shutdown();
        f61388d = new RxThreadFactory("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())), true);
    }

    public b() {
        this(f61388d);
    }

    public b(ThreadFactory threadFactory) {
        AtomicReference<ScheduledExecutorService> atomicReference = new AtomicReference<>();
        this.f61391c = atomicReference;
        this.f61390b = threadFactory;
        atomicReference.lazySet(f(threadFactory));
    }

    @Override // ii.s
    public s.c a() {
        return new a(this.f61391c.get());
    }

    @Override // ii.s
    public mi.b d(Runnable runnable, long j10, TimeUnit timeUnit) {
        ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(ej.a.u(runnable));
        try {
            scheduledDirectTask.setFuture(j10 <= 0 ? this.f61391c.get().submit(scheduledDirectTask) : this.f61391c.get().schedule(scheduledDirectTask, j10, timeUnit));
            return scheduledDirectTask;
        } catch (RejectedExecutionException e10) {
            ej.a.s(e10);
            return EmptyDisposable.INSTANCE;
        }
    }

    public static ScheduledExecutorService f(ThreadFactory threadFactory) {
        return f.a(threadFactory);
    }

    @Override // ii.s
    public mi.b e(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        Future<?> futureSchedule;
        Runnable runnableU = ej.a.u(runnable);
        if (j11 <= 0) {
            ScheduledExecutorService scheduledExecutorService = this.f61391c.get();
            aj.b bVar = new aj.b(runnableU, scheduledExecutorService);
            try {
                if (j10 <= 0) {
                    futureSchedule = scheduledExecutorService.submit(bVar);
                } else {
                    futureSchedule = scheduledExecutorService.schedule(bVar, j10, timeUnit);
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
            scheduledDirectPeriodicTask.setFuture(this.f61391c.get().scheduleAtFixedRate(scheduledDirectPeriodicTask, j10, j11, timeUnit));
            return scheduledDirectPeriodicTask;
        } catch (RejectedExecutionException e11) {
            ej.a.s(e11);
            return EmptyDisposable.INSTANCE;
        }
    }
}
