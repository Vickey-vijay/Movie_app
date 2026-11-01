package si;

import ii.r;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: FutureObserver.java */
/* JADX INFO: loaded from: classes2.dex */
public final class h<T> extends CountDownLatch implements r<T>, Future<T>, mi.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public T f71923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Throwable f71924c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference<mi.b> f71925d;

    public h() {
        super(1);
        this.f71925d = new AtomicReference<>();
    }

    @Override // mi.b
    public void dispose() {
    }

    @Override // java.util.concurrent.Future
    public T get() throws ExecutionException, InterruptedException {
        if (getCount() != 0) {
            bj.c.b();
            await();
        }
        if (isCancelled()) {
            throw new CancellationException();
        }
        Throwable th2 = this.f71924c;
        if (th2 == null) {
            return this.f71923b;
        }
        throw new ExecutionException(th2);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        mi.b bVar;
        DisposableHelper disposableHelper;
        do {
            bVar = this.f71925d.get();
            if (bVar == this || bVar == (disposableHelper = DisposableHelper.DISPOSED)) {
                return false;
            }
        } while (!androidx.lifecycle.e.a(this.f71925d, bVar, disposableHelper));
        if (bVar != null) {
            bVar.dispose();
        }
        countDown();
        return true;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return DisposableHelper.isDisposed(this.f71925d.get());
    }

    @Override // ii.r
    public void onComplete() {
        mi.b bVar;
        if (this.f71923b == null) {
            onError(new NoSuchElementException("The source is empty"));
            return;
        }
        do {
            bVar = this.f71925d.get();
            if (bVar == this || bVar == DisposableHelper.DISPOSED) {
                return;
            }
        } while (!androidx.lifecycle.e.a(this.f71925d, bVar, this));
        countDown();
    }

    @Override // ii.r
    public void onError(Throwable th2) {
        mi.b bVar;
        if (this.f71924c != null) {
            ej.a.s(th2);
            return;
        }
        this.f71924c = th2;
        do {
            bVar = this.f71925d.get();
            if (bVar == this || bVar == DisposableHelper.DISPOSED) {
                ej.a.s(th2);
                return;
            }
        } while (!androidx.lifecycle.e.a(this.f71925d, bVar, this));
        countDown();
    }

    @Override // ii.r
    public void onNext(T t10) {
        if (this.f71923b == null) {
            this.f71923b = t10;
        } else {
            this.f71925d.get().dispose();
            onError(new IndexOutOfBoundsException("More than one element received"));
        }
    }

    @Override // ii.r
    public void onSubscribe(mi.b bVar) {
        DisposableHelper.setOnce(this.f71925d, bVar);
    }

    @Override // mi.b
    public boolean isDisposed() {
        return isDone();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        if (getCount() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public T get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        if (getCount() != 0) {
            bj.c.b();
            if (!await(j10, timeUnit)) {
                throw new TimeoutException(ExceptionHelper.c(j10, timeUnit));
            }
        }
        if (!isCancelled()) {
            Throwable th2 = this.f71924c;
            if (th2 == null) {
                return this.f71923b;
            }
            throw new ExecutionException(th2);
        }
        throw new CancellationException();
    }
}
