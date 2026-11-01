package io.reactivex.internal.operators.observable;

import dj.e;
import ii.p;
import ii.r;
import ii.s;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import mi.b;

/* JADX INFO: loaded from: classes9.dex */
public final class ObservableDebounceTimed<T> extends xi.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f61161c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TimeUnit f61162d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s f61163e;

    public static final class DebounceEmitter<T> extends AtomicReference<b> implements Runnable, b {
        private static final long serialVersionUID = 6812032969491025141L;
        public final long idx;
        public final AtomicBoolean once = new AtomicBoolean();
        public final a<T> parent;
        public final T value;

        @Override // java.lang.Runnable
        public void run() {
            if (this.once.compareAndSet(false, true)) {
                this.parent.a(this.idx, this.value, this);
            }
        }

        public DebounceEmitter(T t10, long j10, a<T> aVar) {
            this.value = t10;
            this.idx = j10;
            this.parent = aVar;
        }

        @Override // mi.b
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // mi.b
        public boolean isDisposed() {
            if (get() == DisposableHelper.DISPOSED) {
                return true;
            }
            return false;
        }

        public void setResource(b bVar) {
            DisposableHelper.replace(this, bVar);
        }
    }

    public static final class a<T> implements r<T>, b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final r<? super T> f61164b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f61165c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final TimeUnit f61166d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final s.c f61167e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public b f61168f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public b f61169g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public volatile long f61170h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f61171i;

        public void a(long j10, T t10, DebounceEmitter<T> debounceEmitter) {
            if (j10 == this.f61170h) {
                this.f61164b.onNext(t10);
                debounceEmitter.dispose();
            }
        }

        @Override // mi.b
        public void dispose() {
            this.f61168f.dispose();
            this.f61167e.dispose();
        }

        @Override // mi.b
        public boolean isDisposed() {
            return this.f61167e.isDisposed();
        }

        @Override // ii.r
        public void onComplete() {
            if (this.f61171i) {
                return;
            }
            this.f61171i = true;
            b bVar = this.f61169g;
            if (bVar != null) {
                bVar.dispose();
            }
            DebounceEmitter debounceEmitter = (DebounceEmitter) bVar;
            if (debounceEmitter != null) {
                debounceEmitter.run();
            }
            this.f61164b.onComplete();
            this.f61167e.dispose();
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            if (this.f61171i) {
                ej.a.s(th2);
                return;
            }
            b bVar = this.f61169g;
            if (bVar != null) {
                bVar.dispose();
            }
            this.f61171i = true;
            this.f61164b.onError(th2);
            this.f61167e.dispose();
        }

        @Override // ii.r
        public void onNext(T t10) {
            if (this.f61171i) {
                return;
            }
            long j10 = this.f61170h + 1;
            this.f61170h = j10;
            b bVar = this.f61169g;
            if (bVar != null) {
                bVar.dispose();
            }
            DebounceEmitter debounceEmitter = new DebounceEmitter(t10, j10, this);
            this.f61169g = debounceEmitter;
            debounceEmitter.setResource(this.f61167e.c(debounceEmitter, this.f61165c, this.f61166d));
        }

        @Override // ii.r
        public void onSubscribe(b bVar) {
            if (DisposableHelper.validate(this.f61168f, bVar)) {
                this.f61168f = bVar;
                this.f61164b.onSubscribe(this);
            }
        }

        public a(r<? super T> rVar, long j10, TimeUnit timeUnit, s.c cVar) {
            this.f61164b = rVar;
            this.f61165c = j10;
            this.f61166d = timeUnit;
            this.f61167e = cVar;
        }
    }

    @Override // ii.k
    public void subscribeActual(r<? super T> rVar) {
        this.f74487b.subscribe(new a(new e(rVar), this.f61161c, this.f61162d, this.f61163e.a()));
    }

    public ObservableDebounceTimed(p<T> pVar, long j10, TimeUnit timeUnit, s sVar) {
        super(pVar);
        this.f61161c = j10;
        this.f61162d = timeUnit;
        this.f61163e = sVar;
    }
}
