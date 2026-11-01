package aj;

import ii.s;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.schedulers.RxThreadFactory;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: ComputationScheduler.java */
/* JADX INFO: loaded from: classes9.dex */
public final class a extends s {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f3616d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final RxThreadFactory f3617e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f3618f = f(Runtime.getRuntime().availableProcessors(), Integer.getInteger("rx2.computation-threads", 0).intValue());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f3619g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ThreadFactory f3620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference<b> f3621c;

    /* JADX INFO: renamed from: aj.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ComputationScheduler.java */
    public static final class C0002a extends s.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final pi.b f3622b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final mi.a f3623c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final pi.b f3624d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final c f3625e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public volatile boolean f3626f;

        @Override // ii.s.c
        public mi.b b(Runnable runnable) {
            return this.f3626f ? EmptyDisposable.INSTANCE : this.f3625e.e(runnable, 0L, TimeUnit.MILLISECONDS, this.f3622b);
        }

        @Override // ii.s.c
        public mi.b c(Runnable runnable, long j10, TimeUnit timeUnit) {
            return this.f3626f ? EmptyDisposable.INSTANCE : this.f3625e.e(runnable, j10, timeUnit, this.f3623c);
        }

        @Override // mi.b
        public void dispose() {
            if (this.f3626f) {
                return;
            }
            this.f3626f = true;
            this.f3624d.dispose();
        }

        @Override // mi.b
        public boolean isDisposed() {
            return this.f3626f;
        }

        public C0002a(c cVar) {
            this.f3625e = cVar;
            pi.b bVar = new pi.b();
            this.f3622b = bVar;
            mi.a aVar = new mi.a();
            this.f3623c = aVar;
            pi.b bVar2 = new pi.b();
            this.f3624d = bVar2;
            bVar2.b(bVar);
            bVar2.b(aVar);
        }
    }

    /* JADX INFO: compiled from: ComputationScheduler.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f3627a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c[] f3628b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f3629c;

        public c a() {
            int i10 = this.f3627a;
            if (i10 == 0) {
                return a.f3619g;
            }
            c[] cVarArr = this.f3628b;
            long j10 = this.f3629c;
            this.f3629c = 1 + j10;
            return cVarArr[(int) (j10 % ((long) i10))];
        }

        public void b() {
            for (c cVar : this.f3628b) {
                cVar.dispose();
            }
        }

        public b(int i10, ThreadFactory threadFactory) {
            this.f3627a = i10;
            this.f3628b = new c[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                this.f3628b[i11] = new c(threadFactory);
            }
        }
    }

    public a() {
        this(f3617e);
    }

    public static int f(int i10, int i11) {
        return (i11 <= 0 || i11 > i10) ? i10 : i11;
    }

    /* JADX INFO: compiled from: ComputationScheduler.java */
    public static final class c extends io.reactivex.internal.schedulers.a {
        public c(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    public a(ThreadFactory threadFactory) {
        this.f3620b = threadFactory;
        this.f3621c = new AtomicReference<>(f3616d);
        g();
    }

    @Override // ii.s
    public s.c a() {
        return new C0002a(this.f3621c.get().a());
    }

    @Override // ii.s
    public mi.b d(Runnable runnable, long j10, TimeUnit timeUnit) {
        return this.f3621c.get().a().f(runnable, j10, timeUnit);
    }

    @Override // ii.s
    public mi.b e(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        return this.f3621c.get().a().g(runnable, j10, j11, timeUnit);
    }

    public void g() {
        b bVar = new b(f3618f, this.f3620b);
        if (androidx.lifecycle.e.a(this.f3621c, f3616d, bVar)) {
            return;
        }
        bVar.b();
    }

    static {
        c cVar = new c(new RxThreadFactory("RxComputationShutdown"));
        f3619g = cVar;
        cVar.dispose();
        RxThreadFactory rxThreadFactory = new RxThreadFactory("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())), true);
        f3617e = rxThreadFactory;
        b bVar = new b(0, rxThreadFactory);
        f3616d = bVar;
        bVar.b();
    }
}
