package com.google.common.util.concurrent;

import com.ironsource.C3426d4;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import m5.l;
import q5.i;
import q5.j;
import q5.k;

/* JADX INFO: compiled from: MoreExecutors.java */
/* JADX INFO: loaded from: classes8.dex */
public final class c {

    /* JADX INFO: compiled from: MoreExecutors.java */
    public static class a extends q5.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ExecutorService f20691b;

        @Override // java.util.concurrent.ExecutorService
        public final boolean awaitTermination(long j10, TimeUnit timeUnit) throws InterruptedException {
            return this.f20691b.awaitTermination(j10, timeUnit);
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.f20691b.execute(runnable);
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isShutdown() {
            return this.f20691b.isShutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isTerminated() {
            return this.f20691b.isTerminated();
        }

        @Override // java.util.concurrent.ExecutorService
        public final void shutdown() {
            this.f20691b.shutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public final List<Runnable> shutdownNow() {
            return this.f20691b.shutdownNow();
        }

        public final String toString() {
            return super.toString() + C3426d4.j.f28586d + this.f20691b + C3426d4.j.f28588e;
        }

        public a(ExecutorService executorService) {
            this.f20691b = (ExecutorService) l.m(executorService);
        }
    }

    /* JADX INFO: compiled from: MoreExecutors.java */
    public static final class b extends a implements ScheduledExecutorService {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ScheduledExecutorService f20692c;

        /* JADX INFO: compiled from: MoreExecutors.java */
        public static final class a<V> extends com.google.common.util.concurrent.b.a<V> implements j<V> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final ScheduledFuture<?> f20693d;

            @Override // java.util.concurrent.Delayed
            public long getDelay(TimeUnit timeUnit) {
                return this.f20693d.getDelay(timeUnit);
            }

            @Override // java.lang.Comparable
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public int compareTo(Delayed delayed) {
                return this.f20693d.compareTo(delayed);
            }

            public a(i<V> iVar, ScheduledFuture<?> scheduledFuture) {
                super(iVar);
                this.f20693d = scheduledFuture;
            }

            @Override // q5.c, java.util.concurrent.Future
            public boolean cancel(boolean z10) {
                boolean zCancel = super.cancel(z10);
                if (zCancel) {
                    this.f20693d.cancel(z10);
                }
                return zCancel;
            }
        }

        /* JADX INFO: renamed from: com.google.common.util.concurrent.c$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: MoreExecutors.java */
        public static final class RunnableC0204b extends AbstractFuture.i<Void> implements Runnable {

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public final Runnable f20694i;

            @Override // java.lang.Runnable
            public void run() {
                try {
                    this.f20694i.run();
                } catch (Throwable th2) {
                    F(th2);
                    throw th2;
                }
            }

            @Override // com.google.common.util.concurrent.AbstractFuture
            public String z() {
                return "task=[" + this.f20694i + C3426d4.j.f28588e;
            }

            public RunnableC0204b(Runnable runnable) {
                this.f20694i = (Runnable) l.m(runnable);
            }
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public j<?> schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
            TrustedListenableFutureTask trustedListenableFutureTaskI = TrustedListenableFutureTask.I(runnable, null);
            return new a(trustedListenableFutureTaskI, this.f20692c.schedule(trustedListenableFutureTaskI, j10, timeUnit));
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public j<?> scheduleAtFixedRate(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
            RunnableC0204b runnableC0204b = new RunnableC0204b(runnable);
            return new a(runnableC0204b, this.f20692c.scheduleAtFixedRate(runnableC0204b, j10, j11, timeUnit));
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public j<?> scheduleWithFixedDelay(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
            RunnableC0204b runnableC0204b = new RunnableC0204b(runnable);
            return new a(runnableC0204b, this.f20692c.scheduleWithFixedDelay(runnableC0204b, j10, j11, timeUnit));
        }

        public b(ScheduledExecutorService scheduledExecutorService) {
            super(scheduledExecutorService);
            this.f20692c = (ScheduledExecutorService) l.m(scheduledExecutorService);
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public <V> j<V> schedule(Callable<V> callable, long j10, TimeUnit timeUnit) {
            TrustedListenableFutureTask trustedListenableFutureTaskJ = TrustedListenableFutureTask.J(callable);
            return new a(trustedListenableFutureTaskJ, this.f20692c.schedule(trustedListenableFutureTaskJ, j10, timeUnit));
        }
    }

    public static Executor a() {
        return DirectExecutor.INSTANCE;
    }

    public static k b(ExecutorService executorService) {
        if (executorService instanceof k) {
            return (k) executorService;
        }
        return executorService instanceof ScheduledExecutorService ? new b((ScheduledExecutorService) executorService) : new a(executorService);
    }
}
