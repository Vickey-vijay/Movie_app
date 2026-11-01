package aj;

import ii.s;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: TrampolineScheduler.java */
/* JADX INFO: loaded from: classes9.dex */
public final class g extends s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f3662b = new g();

    /* JADX INFO: compiled from: TrampolineScheduler.java */
    public static final class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Runnable f3663b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c f3664c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f3665d;

        @Override // java.lang.Runnable
        public void run() {
            if (this.f3664c.f3673e) {
                return;
            }
            long jA = this.f3664c.a(TimeUnit.MILLISECONDS);
            long j10 = this.f3665d;
            if (j10 > jA) {
                try {
                    Thread.sleep(j10 - jA);
                } catch (InterruptedException e10) {
                    Thread.currentThread().interrupt();
                    ej.a.s(e10);
                    return;
                }
            }
            if (this.f3664c.f3673e) {
                return;
            }
            this.f3663b.run();
        }

        public a(Runnable runnable, c cVar, long j10) {
            this.f3663b = runnable;
            this.f3664c = cVar;
            this.f3665d = j10;
        }
    }

    /* JADX INFO: compiled from: TrampolineScheduler.java */
    public static final class b implements Comparable<b> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Runnable f3666b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f3667c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f3668d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public volatile boolean f3669e;

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            int iB = qi.a.b(this.f3667c, bVar.f3667c);
            return iB == 0 ? qi.a.a(this.f3668d, bVar.f3668d) : iB;
        }

        public b(Runnable runnable, Long l10, int i10) {
            this.f3666b = runnable;
            this.f3667c = l10.longValue();
            this.f3668d = i10;
        }
    }

    /* JADX INFO: compiled from: TrampolineScheduler.java */
    public static final class c extends s.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PriorityBlockingQueue<b> f3670b = new PriorityBlockingQueue<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AtomicInteger f3671c = new AtomicInteger();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final AtomicInteger f3672d = new AtomicInteger();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public volatile boolean f3673e;

        /* JADX INFO: compiled from: TrampolineScheduler.java */
        public final class a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final b f3674b;

            public a(b bVar) {
                this.f3674b = bVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f3674b.f3669e = true;
                c.this.f3670b.remove(this.f3674b);
            }
        }

        @Override // mi.b
        public void dispose() {
            this.f3673e = true;
        }

        @Override // ii.s.c
        public mi.b b(Runnable runnable) {
            return e(runnable, a(TimeUnit.MILLISECONDS));
        }

        @Override // ii.s.c
        public mi.b c(Runnable runnable, long j10, TimeUnit timeUnit) {
            long jA = a(TimeUnit.MILLISECONDS) + timeUnit.toMillis(j10);
            return e(new a(runnable, this, jA), jA);
        }

        public mi.b e(Runnable runnable, long j10) {
            if (this.f3673e) {
                return EmptyDisposable.INSTANCE;
            }
            b bVar = new b(runnable, Long.valueOf(j10), this.f3672d.incrementAndGet());
            this.f3670b.add(bVar);
            if (this.f3671c.getAndIncrement() != 0) {
                return io.reactivex.disposables.a.c(new a(bVar));
            }
            int iAddAndGet = 1;
            while (!this.f3673e) {
                b bVarPoll = this.f3670b.poll();
                if (bVarPoll == null) {
                    iAddAndGet = this.f3671c.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return EmptyDisposable.INSTANCE;
                    }
                } else if (!bVarPoll.f3669e) {
                    bVarPoll.f3666b.run();
                }
            }
            this.f3670b.clear();
            return EmptyDisposable.INSTANCE;
        }

        @Override // mi.b
        public boolean isDisposed() {
            return this.f3673e;
        }
    }

    public static g f() {
        return f3662b;
    }

    @Override // ii.s
    public s.c a() {
        return new c();
    }

    @Override // ii.s
    public mi.b c(Runnable runnable) {
        ej.a.u(runnable).run();
        return EmptyDisposable.INSTANCE;
    }

    @Override // ii.s
    public mi.b d(Runnable runnable, long j10, TimeUnit timeUnit) {
        try {
            timeUnit.sleep(j10);
            ej.a.u(runnable).run();
        } catch (InterruptedException e10) {
            Thread.currentThread().interrupt();
            ej.a.s(e10);
        }
        return EmptyDisposable.INSTANCE;
    }
}
