package xi;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: ObservableScanSeed.java */
/* JADX INFO: loaded from: classes10.dex */
public final class g1<T, R> extends xi.a<T, R> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final oi.c<R, ? super T, R> f74590c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Callable<R> f74591d;

    /* JADX INFO: compiled from: ObservableScanSeed.java */
    public static final class a<T, R> implements ii.r<T>, mi.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ii.r<? super R> f74592b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final oi.c<R, ? super T, R> f74593c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public R f74594d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public mi.b f74595e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f74596f;

        @Override // mi.b
        public void dispose() {
            this.f74595e.dispose();
        }

        @Override // mi.b
        public boolean isDisposed() {
            return this.f74595e.isDisposed();
        }

        @Override // ii.r
        public void onComplete() {
            if (this.f74596f) {
                return;
            }
            this.f74596f = true;
            this.f74592b.onComplete();
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            if (this.f74596f) {
                ej.a.s(th2);
            } else {
                this.f74596f = true;
                this.f74592b.onError(th2);
            }
        }

        @Override // ii.r
        public void onNext(T t10) {
            if (this.f74596f) {
                return;
            }
            try {
                R r10 = (R) qi.a.e(this.f74593c.apply(this.f74594d, t10), "The accumulator returned a null value");
                this.f74594d = r10;
                this.f74592b.onNext(r10);
            } catch (Throwable th2) {
                ni.a.b(th2);
                this.f74595e.dispose();
                onError(th2);
            }
        }

        @Override // ii.r
        public void onSubscribe(mi.b bVar) {
            if (DisposableHelper.validate(this.f74595e, bVar)) {
                this.f74595e = bVar;
                this.f74592b.onSubscribe(this);
                this.f74592b.onNext(this.f74594d);
            }
        }

        public a(ii.r<? super R> rVar, oi.c<R, ? super T, R> cVar, R r10) {
            this.f74592b = rVar;
            this.f74593c = cVar;
            this.f74594d = r10;
        }
    }

    @Override // ii.k
    public void subscribeActual(ii.r<? super R> rVar) {
        try {
            this.f74487b.subscribe(new a(rVar, this.f74590c, qi.a.e(this.f74591d.call(), "The seed supplied is null")));
        } catch (Throwable th2) {
            ni.a.b(th2);
            EmptyDisposable.error(th2, rVar);
        }
    }

    public g1(ii.p<T> pVar, Callable<R> callable, oi.c<R, ? super T, R> cVar) {
        super(pVar);
        this.f74590c = cVar;
        this.f74591d = callable;
    }
}
