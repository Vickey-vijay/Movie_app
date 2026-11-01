package aj;

import ii.s;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.schedulers.RxThreadFactory;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: IoScheduler.java */
/* JADX INFO: loaded from: classes9.dex */
public final class c extends s {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final RxThreadFactory f3636d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final RxThreadFactory f3637e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final TimeUnit f3638f = TimeUnit.SECONDS;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C0003c f3639g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f3640h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ThreadFactory f3641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference<a> f3642c;

    /* JADX INFO: compiled from: IoScheduler.java */
    public static final class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f3643b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ConcurrentLinkedQueue<C0003c> f3644c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final mi.a f3645d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ScheduledExecutorService f3646e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Future<?> f3647f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final ThreadFactory f3648g;

        public void a() {
            if (this.f3644c.isEmpty()) {
                return;
            }
            long jD = d();
            for (C0003c c0003c : this.f3644c) {
                if (c0003c.i() > jD) {
                    return;
                }
                if (this.f3644c.remove(c0003c)) {
                    this.f3645d.a(c0003c);
                }
            }
        }

        public C0003c c() {
            if (this.f3645d.isDisposed()) {
                return c.f3639g;
            }
            while (!this.f3644c.isEmpty()) {
                C0003c c0003cPoll = this.f3644c.poll();
                if (c0003cPoll != null) {
                    return c0003cPoll;
                }
            }
            C0003c c0003c = new C0003c(this.f3648g);
            this.f3645d.b(c0003c);
            return c0003c;
        }

        public void f() {
            this.f3645d.dispose();
            Future<?> future = this.f3647f;
            if (future != null) {
                future.cancel(true);
            }
            ScheduledExecutorService scheduledExecutorService = this.f3646e;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
            }
        }

        public a(long j10, TimeUnit timeUnit, ThreadFactory threadFactory) {
            long nanos;
            ScheduledFuture<?> scheduledFutureScheduleWithFixedDelay;
            if (timeUnit != null) {
                nanos = timeUnit.toNanos(j10);
            } else {
                nanos = 0;
            }
            long j11 = nanos;
            this.f3643b = j11;
            this.f3644c = new ConcurrentLinkedQueue<>();
            this.f3645d = new mi.a();
            this.f3648g = threadFactory;
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = null;
            if (timeUnit != null) {
                scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, c.f3637e);
                scheduledFutureScheduleWithFixedDelay = scheduledExecutorServiceNewScheduledThreadPool.scheduleWithFixedDelay(this, j11, j11, TimeUnit.NANOSECONDS);
            } else {
                scheduledFutureScheduleWithFixedDelay = null;
            }
            this.f3646e = scheduledExecutorServiceNewScheduledThreadPool;
            this.f3647f = scheduledFutureScheduleWithFixedDelay;
        }

        public long d() {
            return System.nanoTime();
        }

        public void e(C0003c c0003c) {
            c0003c.j(d() + this.f3643b);
            this.f3644c.offer(c0003c);
        }

        @Override // java.lang.Runnable
        public void run() {
            a();
        }
    }

    /* JADX INFO: compiled from: IoScheduler.java */
    public static final class b extends s.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a f3650c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final C0003c f3651d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final AtomicBoolean f3652e = new AtomicBoolean();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final mi.a f3649b = new mi.a();

        @Override // ii.s.c
        public mi.b c(Runnable runnable, long j10, TimeUnit timeUnit) {
            return this.f3649b.isDisposed() ? EmptyDisposable.INSTANCE : this.f3651d.e(runnable, j10, timeUnit, this.f3649b);
        }

        @Override // mi.b
        public void dispose() {
            if (this.f3652e.compareAndSet(false, true)) {
                this.f3649b.dispose();
                this.f3650c.e(this.f3651d);
            }
        }

        @Override // mi.b
        public boolean isDisposed() {
            return this.f3652e.get();
        }

        public b(a aVar) {
            this.f3650c = aVar;
            this.f3651d = aVar.c();
        }
    }

    /* JADX INFO: renamed from: aj.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: IoScheduler.java */
    public static final class C0003c extends io.reactivex.internal.schedulers.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f3653d;

        public long i() {
            return this.f3653d;
        }

        public void j(long j10) {
            this.f3653d = j10;
        }

        public C0003c(ThreadFactory threadFactory) {
            super(threadFactory);
            this.f3653d = 0L;
        }
    }

    public c() {
        this(f3636d);
    }

    static {
        C0003c c0003c = new C0003c(new RxThreadFactory("RxCachedThreadSchedulerShutdown"));
        f3639g = c0003c;
        c0003c.dispose();
        int iMax = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        RxThreadFactory rxThreadFactory = new RxThreadFactory("RxCachedThreadScheduler", iMax);
        f3636d = rxThreadFactory;
        f3637e = new RxThreadFactory("RxCachedWorkerPoolEvictor", iMax);
        a aVar = new a(0L, null, rxThreadFactory);
        f3640h = aVar;
        aVar.f();
    }

    public c(ThreadFactory threadFactory) {
        this.f3641b = threadFactory;
        this.f3642c = new AtomicReference<>(f3640h);
        f();
    }

    @Override // ii.s
    public s.c a() {
        return new b(this.f3642c.get());
    }

    public void f() {
        a aVar = new a(60L, f3638f, this.f3641b);
        if (androidx.lifecycle.e.a(this.f3642c, f3640h, aVar)) {
            return;
        }
        aVar.f();
    }
}
