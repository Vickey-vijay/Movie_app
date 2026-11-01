package xi;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.Functions;
import java.util.Collection;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: ObservableToList.java */
/* JADX INFO: loaded from: classes11.dex */
public final class t1<T, U extends Collection<? super T>> extends xi.a<T, U> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Callable<U> f74847c;

    /* JADX INFO: compiled from: ObservableToList.java */
    public static final class a<T, U extends Collection<? super T>> implements ii.r<T>, mi.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ii.r<? super U> f74848b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public mi.b f74849c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public U f74850d;

        @Override // ii.r
        public void onError(Throwable th2) {
            this.f74850d = null;
            this.f74848b.onError(th2);
        }

        @Override // mi.b
        public void dispose() {
            this.f74849c.dispose();
        }

        @Override // mi.b
        public boolean isDisposed() {
            return this.f74849c.isDisposed();
        }

        @Override // ii.r
        public void onComplete() {
            U u10 = this.f74850d;
            this.f74850d = null;
            this.f74848b.onNext(u10);
            this.f74848b.onComplete();
        }

        @Override // ii.r
        public void onNext(T t10) {
            this.f74850d.add(t10);
        }

        @Override // ii.r
        public void onSubscribe(mi.b bVar) {
            if (DisposableHelper.validate(this.f74849c, bVar)) {
                this.f74849c = bVar;
                this.f74848b.onSubscribe(this);
            }
        }

        public a(ii.r<? super U> rVar, U u10) {
            this.f74848b = rVar;
            this.f74850d = u10;
        }
    }

    public t1(ii.p<T> pVar, int i10) {
        super(pVar);
        this.f74847c = Functions.e(i10);
    }

    @Override // ii.k
    public void subscribeActual(ii.r<? super U> rVar) {
        try {
            this.f74487b.subscribe(new a(rVar, (Collection) qi.a.e(this.f74847c.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th2) {
            ni.a.b(th2);
            EmptyDisposable.error(th2, rVar);
        }
    }

    public t1(ii.p<T> pVar, Callable<U> callable) {
        super(pVar);
        this.f74847c = callable;
    }
}
