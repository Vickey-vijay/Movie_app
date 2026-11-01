package io.reactivex.internal.operators.observable;

import ii.k;
import ii.r;
import ii.s;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import mi.b;
import oi.g;
import pi.c;

/* JADX INFO: loaded from: classes9.dex */
public final class ObservableRefCount<T> extends k<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cj.a<T> f61234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f61235c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f61236d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TimeUnit f61237e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final s f61238f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public RefConnection f61239g;

    public static final class RefConnection extends AtomicReference<b> implements Runnable, g<b> {
        private static final long serialVersionUID = -4552101107598366241L;
        public boolean connected;
        public final ObservableRefCount<?> parent;
        public long subscriberCount;
        public b timer;

        @Override // oi.g
        public void accept(b bVar) throws Exception {
            DisposableHelper.replace(this, bVar);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.parent.d(this);
        }

        public RefConnection(ObservableRefCount<?> observableRefCount) {
            this.parent = observableRefCount;
        }
    }

    public static final class RefCountObserver<T> extends AtomicBoolean implements r<T>, b {
        private static final long serialVersionUID = -7419642935409022375L;
        public final RefConnection connection;
        public final r<? super T> downstream;
        public final ObservableRefCount<T> parent;
        public b upstream;

        @Override // ii.r
        public void onComplete() {
            if (compareAndSet(false, true)) {
                this.parent.c(this.connection);
                this.downstream.onComplete();
            }
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            if (!compareAndSet(false, true)) {
                ej.a.s(th2);
            } else {
                this.parent.c(this.connection);
                this.downstream.onError(th2);
            }
        }

        @Override // mi.b
        public void dispose() {
            this.upstream.dispose();
            if (compareAndSet(false, true)) {
                this.parent.b(this.connection);
            }
        }

        @Override // mi.b
        public boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        @Override // ii.r
        public void onNext(T t10) {
            this.downstream.onNext(t10);
        }

        @Override // ii.r
        public void onSubscribe(b bVar) {
            if (DisposableHelper.validate(this.upstream, bVar)) {
                this.upstream = bVar;
                this.downstream.onSubscribe(this);
            }
        }

        public RefCountObserver(r<? super T> rVar, ObservableRefCount<T> observableRefCount, RefConnection refConnection) {
            this.downstream = rVar;
            this.parent = observableRefCount;
            this.connection = refConnection;
        }
    }

    public ObservableRefCount(cj.a<T> aVar) {
        this(aVar, 1, 0L, TimeUnit.NANOSECONDS, gj.a.c());
    }

    public void b(RefConnection refConnection) {
        synchronized (this) {
            RefConnection refConnection2 = this.f61239g;
            if (refConnection2 != null && refConnection2 == refConnection) {
                long j10 = refConnection.subscriberCount - 1;
                refConnection.subscriberCount = j10;
                if (j10 == 0 && refConnection.connected) {
                    if (this.f61236d == 0) {
                        d(refConnection);
                        return;
                    }
                    SequentialDisposable sequentialDisposable = new SequentialDisposable();
                    refConnection.timer = sequentialDisposable;
                    sequentialDisposable.replace(this.f61238f.d(refConnection, this.f61236d, this.f61237e));
                }
            }
        }
    }

    public void c(RefConnection refConnection) {
        synchronized (this) {
            RefConnection refConnection2 = this.f61239g;
            if (refConnection2 != null && refConnection2 == refConnection) {
                this.f61239g = null;
                b bVar = refConnection.timer;
                if (bVar != null) {
                    bVar.dispose();
                }
            }
            long j10 = refConnection.subscriberCount - 1;
            refConnection.subscriberCount = j10;
            if (j10 == 0) {
                cj.a<T> aVar = this.f61234b;
                if (aVar instanceof b) {
                    ((b) aVar).dispose();
                } else if (aVar instanceof c) {
                    ((c) aVar).a(refConnection.get());
                }
            }
        }
    }

    public void d(RefConnection refConnection) {
        synchronized (this) {
            if (refConnection.subscriberCount == 0 && refConnection == this.f61239g) {
                this.f61239g = null;
                b bVar = refConnection.get();
                DisposableHelper.dispose(refConnection);
                cj.a<T> aVar = this.f61234b;
                if (aVar instanceof b) {
                    ((b) aVar).dispose();
                } else if (aVar instanceof c) {
                    ((c) aVar).a(bVar);
                }
            }
        }
    }

    @Override // ii.k
    public void subscribeActual(r<? super T> rVar) {
        RefConnection refConnection;
        boolean z10;
        b bVar;
        synchronized (this) {
            refConnection = this.f61239g;
            if (refConnection == null) {
                refConnection = new RefConnection(this);
                this.f61239g = refConnection;
            }
            long j10 = refConnection.subscriberCount;
            if (j10 == 0 && (bVar = refConnection.timer) != null) {
                bVar.dispose();
            }
            long j11 = j10 + 1;
            refConnection.subscriberCount = j11;
            z10 = true;
            if (refConnection.connected || j11 != this.f61235c) {
                z10 = false;
            } else {
                refConnection.connected = true;
            }
        }
        this.f61234b.subscribe(new RefCountObserver(rVar, this, refConnection));
        if (z10) {
            this.f61234b.b(refConnection);
        }
    }

    public ObservableRefCount(cj.a<T> aVar, int i10, long j10, TimeUnit timeUnit, s sVar) {
        this.f61234b = aVar;
        this.f61235c = i10;
        this.f61236d = j10;
        this.f61237e = timeUnit;
        this.f61238f = sVar;
    }
}
