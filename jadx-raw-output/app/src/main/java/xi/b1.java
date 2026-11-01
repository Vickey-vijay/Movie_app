package xi;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: ObservableOnErrorReturn.java */
/* JADX INFO: loaded from: classes11.dex */
public final class b1<T> extends xi.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final oi.o<? super Throwable, ? extends T> f74512c;

    /* JADX INFO: compiled from: ObservableOnErrorReturn.java */
    public static final class a<T> implements ii.r<T>, mi.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ii.r<? super T> f74513b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final oi.o<? super Throwable, ? extends T> f74514c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public mi.b f74515d;

        @Override // mi.b
        public void dispose() {
            this.f74515d.dispose();
        }

        @Override // mi.b
        public boolean isDisposed() {
            return this.f74515d.isDisposed();
        }

        @Override // ii.r
        public void onComplete() {
            this.f74513b.onComplete();
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            try {
                T tApply = this.f74514c.apply(th2);
                if (tApply != null) {
                    this.f74513b.onNext(tApply);
                    this.f74513b.onComplete();
                } else {
                    NullPointerException nullPointerException = new NullPointerException("The supplied value is null");
                    nullPointerException.initCause(th2);
                    this.f74513b.onError(nullPointerException);
                }
            } catch (Throwable th3) {
                ni.a.b(th3);
                this.f74513b.onError(new CompositeException(th2, th3));
            }
        }

        @Override // ii.r
        public void onNext(T t10) {
            this.f74513b.onNext(t10);
        }

        @Override // ii.r
        public void onSubscribe(mi.b bVar) {
            if (DisposableHelper.validate(this.f74515d, bVar)) {
                this.f74515d = bVar;
                this.f74513b.onSubscribe(this);
            }
        }

        public a(ii.r<? super T> rVar, oi.o<? super Throwable, ? extends T> oVar) {
            this.f74513b = rVar;
            this.f74514c = oVar;
        }
    }

    @Override // ii.k
    public void subscribeActual(ii.r<? super T> rVar) {
        this.f74487b.subscribe(new a(rVar, this.f74512c));
    }

    public b1(ii.p<T> pVar, oi.o<? super Throwable, ? extends T> oVar) {
        super(pVar);
        this.f74512c = oVar;
    }
}
