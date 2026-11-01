package xi;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: ObservableCollectSingle.java */
/* JADX INFO: loaded from: classes8.dex */
public final class n<T, U> extends ii.t<U> implements ri.b<U> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ii.p<T> f74719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Callable<? extends U> f74720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final oi.b<? super U, ? super T> f74721c;

    /* JADX INFO: compiled from: ObservableCollectSingle.java */
    public static final class a<T, U> implements ii.r<T>, mi.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ii.u<? super U> f74722b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final oi.b<? super U, ? super T> f74723c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final U f74724d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public mi.b f74725e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f74726f;

        @Override // mi.b
        public void dispose() {
            this.f74725e.dispose();
        }

        @Override // mi.b
        public boolean isDisposed() {
            return this.f74725e.isDisposed();
        }

        @Override // ii.r
        public void onComplete() {
            if (this.f74726f) {
                return;
            }
            this.f74726f = true;
            this.f74722b.onSuccess(this.f74724d);
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            if (this.f74726f) {
                ej.a.s(th2);
            } else {
                this.f74726f = true;
                this.f74722b.onError(th2);
            }
        }

        @Override // ii.r
        public void onNext(T t10) {
            if (this.f74726f) {
                return;
            }
            try {
                this.f74723c.accept(this.f74724d, t10);
            } catch (Throwable th2) {
                this.f74725e.dispose();
                onError(th2);
            }
        }

        @Override // ii.r
        public void onSubscribe(mi.b bVar) {
            if (DisposableHelper.validate(this.f74725e, bVar)) {
                this.f74725e = bVar;
                this.f74722b.onSubscribe(this);
            }
        }

        public a(ii.u<? super U> uVar, U u10, oi.b<? super U, ? super T> bVar) {
            this.f74722b = uVar;
            this.f74723c = bVar;
            this.f74724d = u10;
        }
    }

    @Override // ri.b
    public ii.k<U> a() {
        return ej.a.o(new m(this.f74719a, this.f74720b, this.f74721c));
    }

    @Override // ii.t
    public void m(ii.u<? super U> uVar) {
        try {
            this.f74719a.subscribe(new a(uVar, qi.a.e(this.f74720b.call(), "The initialSupplier returned a null value"), this.f74721c));
        } catch (Throwable th2) {
            EmptyDisposable.error(th2, uVar);
        }
    }

    public n(ii.p<T> pVar, Callable<? extends U> callable, oi.b<? super U, ? super T> bVar) {
        this.f74719a = pVar;
        this.f74720b = callable;
        this.f74721c = bVar;
    }
}
