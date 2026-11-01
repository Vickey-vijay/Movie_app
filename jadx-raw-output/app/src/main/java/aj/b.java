package aj;

import io.reactivex.internal.functions.Functions;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: InstantPeriodicTask.java */
/* JADX INFO: loaded from: classes9.dex */
public final class b implements Callable<Void>, mi.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final FutureTask<Void> f3630g = new FutureTask<>(Functions.f61030b, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Runnable f3631b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ExecutorService f3634e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Thread f3635f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference<Future<?>> f3633d = new AtomicReference<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference<Future<?>> f3632c = new AtomicReference<>();

    public void a(Future<?> future) {
        Future<?> future2;
        do {
            future2 = this.f3633d.get();
            if (future2 == f3630g) {
                future.cancel(this.f3635f != Thread.currentThread());
                return;
            }
        } while (!androidx.lifecycle.e.a(this.f3633d, future2, future));
    }

    public void b(Future<?> future) {
        Future<?> future2;
        do {
            future2 = this.f3632c.get();
            if (future2 == f3630g) {
                future.cancel(this.f3635f != Thread.currentThread());
                return;
            }
        } while (!androidx.lifecycle.e.a(this.f3632c, future2, future));
    }

    @Override // java.util.concurrent.Callable
    public Void call() throws Exception {
        this.f3635f = Thread.currentThread();
        try {
            this.f3631b.run();
            b(this.f3634e.submit(this));
            this.f3635f = null;
        } catch (Throwable th2) {
            this.f3635f = null;
            ej.a.s(th2);
        }
        return null;
    }

    @Override // mi.b
    public void dispose() {
        AtomicReference<Future<?>> atomicReference = this.f3633d;
        FutureTask<Void> futureTask = f3630g;
        Future<?> andSet = atomicReference.getAndSet(futureTask);
        if (andSet != null && andSet != futureTask) {
            andSet.cancel(this.f3635f != Thread.currentThread());
        }
        Future<?> andSet2 = this.f3632c.getAndSet(futureTask);
        if (andSet2 == null || andSet2 == futureTask) {
            return;
        }
        andSet2.cancel(this.f3635f != Thread.currentThread());
    }

    @Override // mi.b
    public boolean isDisposed() {
        return this.f3633d.get() == f3630g;
    }

    public b(Runnable runnable, ExecutorService executorService) {
        this.f3631b = runnable;
        this.f3634e = executorService;
    }
}
