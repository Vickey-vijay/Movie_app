package ii;

import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: Scheduler.java */
/* JADX INFO: loaded from: classes10.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f54180a = TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15).longValue());

    /* JADX INFO: compiled from: Scheduler.java */
    public static final class a implements mi.b, Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Runnable f54181b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c f54182c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Thread f54183d;

        @Override // mi.b
        public void dispose() {
            if (this.f54183d == Thread.currentThread()) {
                c cVar = this.f54182c;
                if (cVar instanceof io.reactivex.internal.schedulers.a) {
                    ((io.reactivex.internal.schedulers.a) cVar).h();
                    return;
                }
            }
            this.f54182c.dispose();
        }

        @Override // mi.b
        public boolean isDisposed() {
            return this.f54182c.isDisposed();
        }

        public a(Runnable runnable, c cVar) {
            this.f54181b = runnable;
            this.f54182c = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f54183d = Thread.currentThread();
            try {
                this.f54181b.run();
            } finally {
                dispose();
                this.f54183d = null;
            }
        }
    }

    /* JADX INFO: compiled from: Scheduler.java */
    public static final class b implements mi.b, Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Runnable f54184b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c f54185c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public volatile boolean f54186d;

        @Override // mi.b
        public void dispose() {
            this.f54186d = true;
            this.f54185c.dispose();
        }

        @Override // mi.b
        public boolean isDisposed() {
            return this.f54186d;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f54186d) {
                return;
            }
            try {
                this.f54184b.run();
            } catch (Throwable th2) {
                ni.a.b(th2);
                this.f54185c.dispose();
                throw ExceptionHelper.d(th2);
            }
        }

        public b(Runnable runnable, c cVar) {
            this.f54184b = runnable;
            this.f54185c = cVar;
        }
    }

    /* JADX INFO: compiled from: Scheduler.java */
    public static abstract class c implements mi.b {

        /* JADX INFO: compiled from: Scheduler.java */
        public final class a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Runnable f54187b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final SequentialDisposable f54188c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final long f54189d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public long f54190e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public long f54191f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public long f54192g;

            public a(long j10, Runnable runnable, long j11, SequentialDisposable sequentialDisposable, long j12) {
                this.f54187b = runnable;
                this.f54188c = sequentialDisposable;
                this.f54189d = j12;
                this.f54191f = j11;
                this.f54192g = j10;
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0034  */
            @Override // java.lang.Runnable
            public void run() {
                long j10;
                this.f54187b.run();
                if (this.f54188c.isDisposed()) {
                    return;
                }
                c cVar = c.this;
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                long jA = cVar.a(timeUnit);
                long j11 = s.f54180a;
                long j12 = jA + j11;
                long j13 = this.f54191f;
                if (j12 >= j13) {
                    long j14 = this.f54189d;
                    if (jA >= j13 + j14 + j11) {
                        long j15 = this.f54189d;
                        long j16 = jA + j15;
                        long j17 = this.f54190e + 1;
                        this.f54190e = j17;
                        this.f54192g = j16 - (j15 * j17);
                        j10 = j16;
                    } else {
                        long j18 = this.f54192g;
                        long j19 = this.f54190e + 1;
                        this.f54190e = j19;
                        j10 = j18 + (j19 * j14);
                    }
                } else {
                    long j110 = this.f54189d;
                    long j111 = jA + j110;
                    long j112 = this.f54190e + 1;
                    this.f54190e = j112;
                    this.f54192g = j111 - (j110 * j112);
                    j10 = j111;
                }
                this.f54191f = jA;
                this.f54188c.replace(c.this.c(this, j10 - jA, timeUnit));
            }
        }

        public abstract mi.b c(Runnable runnable, long j10, TimeUnit timeUnit);

        public mi.b b(Runnable runnable) {
            return c(runnable, 0L, TimeUnit.NANOSECONDS);
        }

        public mi.b d(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
            SequentialDisposable sequentialDisposable = new SequentialDisposable();
            SequentialDisposable sequentialDisposable2 = new SequentialDisposable(sequentialDisposable);
            Runnable runnableU = ej.a.u(runnable);
            long nanos = timeUnit.toNanos(j11);
            long jA = a(TimeUnit.NANOSECONDS);
            mi.b bVarC = c(new a(jA + timeUnit.toNanos(j10), runnableU, jA, sequentialDisposable2, nanos), j10, timeUnit);
            if (bVarC == EmptyDisposable.INSTANCE) {
                return bVarC;
            }
            sequentialDisposable.replace(bVarC);
            return sequentialDisposable2;
        }

        public long a(TimeUnit timeUnit) {
            return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }
    }

    public abstract c a();

    public mi.b c(Runnable runnable) {
        return d(runnable, 0L, TimeUnit.NANOSECONDS);
    }

    public long b(TimeUnit timeUnit) {
        return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }

    public mi.b d(Runnable runnable, long j10, TimeUnit timeUnit) {
        c cVarA = a();
        a aVar = new a(ej.a.u(runnable), cVarA);
        cVarA.c(aVar, j10, timeUnit);
        return aVar;
    }

    public mi.b e(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        c cVarA = a();
        b bVar = new b(ej.a.u(runnable), cVarA);
        mi.b bVarD = cVarA.d(bVar, j10, j11, timeUnit);
        if (bVarD == EmptyDisposable.INSTANCE) {
            return bVarD;
        }
        return bVar;
    }
}
