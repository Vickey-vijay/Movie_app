package xi;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: ObservableHide.java */
/* JADX INFO: loaded from: classes.dex */
public final class p0<T> extends xi.a<T, T> {

    /* JADX INFO: compiled from: ObservableHide.java */
    public static final class a<T> implements ii.r<T>, mi.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ii.r<? super T> f74755b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public mi.b f74756c;

        @Override // mi.b
        public void dispose() {
            this.f74756c.dispose();
        }

        @Override // mi.b
        public boolean isDisposed() {
            return this.f74756c.isDisposed();
        }

        @Override // ii.r
        public void onComplete() {
            this.f74755b.onComplete();
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            this.f74755b.onError(th2);
        }

        @Override // ii.r
        public void onNext(T t10) {
            this.f74755b.onNext(t10);
        }

        @Override // ii.r
        public void onSubscribe(mi.b bVar) {
            if (DisposableHelper.validate(this.f74756c, bVar)) {
                this.f74756c = bVar;
                this.f74755b.onSubscribe(this);
            }
        }

        public a(ii.r<? super T> rVar) {
            this.f74755b = rVar;
        }
    }

    @Override // ii.k
    public void subscribeActual(ii.r<? super T> rVar) {
        this.f74487b.subscribe(new a(rVar));
    }

    public p0(ii.p<T> pVar) {
        super(pVar);
    }
}
