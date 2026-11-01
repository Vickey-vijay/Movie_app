package xi;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: ObservableMapNotification.java */
/* JADX INFO: loaded from: classes11.dex */
public final class x0<T, R> extends xi.a<T, ii.p<? extends R>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final oi.o<? super T, ? extends ii.p<? extends R>> f74940c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final oi.o<? super Throwable, ? extends ii.p<? extends R>> f74941d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Callable<? extends ii.p<? extends R>> f74942e;

    /* JADX INFO: compiled from: ObservableMapNotification.java */
    public static final class a<T, R> implements ii.r<T>, mi.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ii.r<? super ii.p<? extends R>> f74943b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final oi.o<? super T, ? extends ii.p<? extends R>> f74944c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final oi.o<? super Throwable, ? extends ii.p<? extends R>> f74945d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Callable<? extends ii.p<? extends R>> f74946e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public mi.b f74947f;

        @Override // mi.b
        public void dispose() {
            this.f74947f.dispose();
        }

        @Override // mi.b
        public boolean isDisposed() {
            return this.f74947f.isDisposed();
        }

        @Override // ii.r
        public void onComplete() {
            try {
                this.f74943b.onNext((ii.p) qi.a.e(this.f74946e.call(), "The onComplete ObservableSource returned is null"));
                this.f74943b.onComplete();
            } catch (Throwable th2) {
                ni.a.b(th2);
                this.f74943b.onError(th2);
            }
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            try {
                this.f74943b.onNext((ii.p) qi.a.e(this.f74945d.apply(th2), "The onError ObservableSource returned is null"));
                this.f74943b.onComplete();
            } catch (Throwable th3) {
                ni.a.b(th3);
                this.f74943b.onError(new CompositeException(th2, th3));
            }
        }

        @Override // ii.r
        public void onNext(T t10) {
            try {
                this.f74943b.onNext((ii.p) qi.a.e(this.f74944c.apply(t10), "The onNext ObservableSource returned is null"));
            } catch (Throwable th2) {
                ni.a.b(th2);
                this.f74943b.onError(th2);
            }
        }

        @Override // ii.r
        public void onSubscribe(mi.b bVar) {
            if (DisposableHelper.validate(this.f74947f, bVar)) {
                this.f74947f = bVar;
                this.f74943b.onSubscribe(this);
            }
        }

        public a(ii.r<? super ii.p<? extends R>> rVar, oi.o<? super T, ? extends ii.p<? extends R>> oVar, oi.o<? super Throwable, ? extends ii.p<? extends R>> oVar2, Callable<? extends ii.p<? extends R>> callable) {
            this.f74943b = rVar;
            this.f74944c = oVar;
            this.f74945d = oVar2;
            this.f74946e = callable;
        }
    }

    @Override // ii.k
    public void subscribeActual(ii.r<? super ii.p<? extends R>> rVar) {
        this.f74487b.subscribe(new a(rVar, this.f74940c, this.f74941d, this.f74942e));
    }

    public x0(ii.p<T> pVar, oi.o<? super T, ? extends ii.p<? extends R>> oVar, oi.o<? super Throwable, ? extends ii.p<? extends R>> oVar2, Callable<? extends ii.p<? extends R>> callable) {
        super(pVar);
        this.f74940c = oVar;
        this.f74941d = oVar2;
        this.f74942e = callable;
    }
}
