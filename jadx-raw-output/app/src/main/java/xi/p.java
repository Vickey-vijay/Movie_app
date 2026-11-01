package xi;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: ObservableCountSingle.java */
/* JADX INFO: loaded from: classes11.dex */
public final class p<T> extends ii.t<Long> implements ri.b<Long> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ii.p<T> f74751a;

    /* JADX INFO: compiled from: ObservableCountSingle.java */
    public static final class a implements ii.r<Object>, mi.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ii.u<? super Long> f74752b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public mi.b f74753c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f74754d;

        @Override // mi.b
        public void dispose() {
            this.f74753c.dispose();
            this.f74753c = DisposableHelper.DISPOSED;
        }

        @Override // mi.b
        public boolean isDisposed() {
            return this.f74753c.isDisposed();
        }

        @Override // ii.r
        public void onComplete() {
            this.f74753c = DisposableHelper.DISPOSED;
            this.f74752b.onSuccess(Long.valueOf(this.f74754d));
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            this.f74753c = DisposableHelper.DISPOSED;
            this.f74752b.onError(th2);
        }

        @Override // ii.r
        public void onNext(Object obj) {
            this.f74754d++;
        }

        @Override // ii.r
        public void onSubscribe(mi.b bVar) {
            if (DisposableHelper.validate(this.f74753c, bVar)) {
                this.f74753c = bVar;
                this.f74752b.onSubscribe(this);
            }
        }

        public a(ii.u<? super Long> uVar) {
            this.f74752b = uVar;
        }
    }

    @Override // ri.b
    public ii.k<Long> a() {
        return ej.a.o(new o(this.f74751a));
    }

    @Override // ii.t
    public void m(ii.u<? super Long> uVar) {
        this.f74751a.subscribe(new a(uVar));
    }

    public p(ii.p<T> pVar) {
        this.f74751a = pVar;
    }
}
