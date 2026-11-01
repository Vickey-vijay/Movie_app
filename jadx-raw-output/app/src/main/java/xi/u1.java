package xi;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.Functions;
import java.util.Collection;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: ObservableToListSingle.java */
/* JADX INFO: loaded from: classes10.dex */
public final class u1<T, U extends Collection<? super T>> extends ii.t<U> implements ri.b<U> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ii.p<T> f74860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Callable<U> f74861b;

    /* JADX INFO: compiled from: ObservableToListSingle.java */
    public static final class a<T, U extends Collection<? super T>> implements ii.r<T>, mi.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ii.u<? super U> f74862b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public U f74863c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public mi.b f74864d;

        @Override // ii.r
        public void onError(Throwable th2) {
            this.f74863c = null;
            this.f74862b.onError(th2);
        }

        @Override // mi.b
        public void dispose() {
            this.f74864d.dispose();
        }

        @Override // mi.b
        public boolean isDisposed() {
            return this.f74864d.isDisposed();
        }

        @Override // ii.r
        public void onComplete() {
            U u10 = this.f74863c;
            this.f74863c = null;
            this.f74862b.onSuccess(u10);
        }

        @Override // ii.r
        public void onNext(T t10) {
            this.f74863c.add(t10);
        }

        @Override // ii.r
        public void onSubscribe(mi.b bVar) {
            if (DisposableHelper.validate(this.f74864d, bVar)) {
                this.f74864d = bVar;
                this.f74862b.onSubscribe(this);
            }
        }

        public a(ii.u<? super U> uVar, U u10) {
            this.f74862b = uVar;
            this.f74863c = u10;
        }
    }

    public u1(ii.p<T> pVar, int i10) {
        this.f74860a = pVar;
        this.f74861b = Functions.e(i10);
    }

    @Override // ri.b
    public ii.k<U> a() {
        return ej.a.o(new t1(this.f74860a, this.f74861b));
    }

    @Override // ii.t
    public void m(ii.u<? super U> uVar) {
        try {
            this.f74860a.subscribe(new a(uVar, (Collection) qi.a.e(this.f74861b.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th2) {
            ni.a.b(th2);
            EmptyDisposable.error(th2, uVar);
        }
    }

    public u1(ii.p<T> pVar, Callable<U> callable) {
        this.f74860a = pVar;
        this.f74861b = callable;
    }
}
