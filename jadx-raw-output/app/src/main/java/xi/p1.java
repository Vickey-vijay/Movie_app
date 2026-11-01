package xi;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: ObservableTakeLastOne.java */
/* JADX INFO: loaded from: classes11.dex */
public final class p1<T> extends xi.a<T, T> {

    /* JADX INFO: compiled from: ObservableTakeLastOne.java */
    public static final class a<T> implements ii.r<T>, mi.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ii.r<? super T> f74757b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public mi.b f74758c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public T f74759d;

        @Override // mi.b
        public void dispose() {
            this.f74759d = null;
            this.f74758c.dispose();
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            this.f74759d = null;
            this.f74757b.onError(th2);
        }

        public void a() {
            T t10 = this.f74759d;
            if (t10 != null) {
                this.f74759d = null;
                this.f74757b.onNext(t10);
            }
            this.f74757b.onComplete();
        }

        @Override // mi.b
        public boolean isDisposed() {
            return this.f74758c.isDisposed();
        }

        @Override // ii.r
        public void onNext(T t10) {
            this.f74759d = t10;
        }

        @Override // ii.r
        public void onSubscribe(mi.b bVar) {
            if (DisposableHelper.validate(this.f74758c, bVar)) {
                this.f74758c = bVar;
                this.f74757b.onSubscribe(this);
            }
        }

        public a(ii.r<? super T> rVar) {
            this.f74757b = rVar;
        }

        @Override // ii.r
        public void onComplete() {
            a();
        }
    }

    @Override // ii.k
    public void subscribeActual(ii.r<? super T> rVar) {
        this.f74487b.subscribe(new a(rVar));
    }

    public p1(ii.p<T> pVar) {
        super(pVar);
    }
}
