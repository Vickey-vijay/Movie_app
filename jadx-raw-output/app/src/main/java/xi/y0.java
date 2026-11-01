package xi;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: ObservableMaterialize.java */
/* JADX INFO: loaded from: classes11.dex */
public final class y0<T> extends xi.a<T, ii.j<T>> {

    /* JADX INFO: compiled from: ObservableMaterialize.java */
    public static final class a<T> implements ii.r<T>, mi.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ii.r<? super ii.j<T>> f74958b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public mi.b f74959c;

        @Override // mi.b
        public void dispose() {
            this.f74959c.dispose();
        }

        @Override // mi.b
        public boolean isDisposed() {
            return this.f74959c.isDisposed();
        }

        @Override // ii.r
        public void onNext(T t10) {
            this.f74958b.onNext(ii.j.c(t10));
        }

        @Override // ii.r
        public void onSubscribe(mi.b bVar) {
            if (DisposableHelper.validate(this.f74959c, bVar)) {
                this.f74959c = bVar;
                this.f74958b.onSubscribe(this);
            }
        }

        public a(ii.r<? super ii.j<T>> rVar) {
            this.f74958b = rVar;
        }

        @Override // ii.r
        public void onComplete() {
            this.f74958b.onNext(ii.j.a());
            this.f74958b.onComplete();
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            this.f74958b.onNext(ii.j.b(th2));
            this.f74958b.onComplete();
        }
    }

    @Override // ii.k
    public void subscribeActual(ii.r<? super ii.j<T>> rVar) {
        this.f74487b.subscribe(new a(rVar));
    }

    public y0(ii.p<T> pVar) {
        super(pVar);
    }
}
