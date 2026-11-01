package xi;

/* JADX INFO: compiled from: ObservableIgnoreElements.java */
/* JADX INFO: loaded from: classes7.dex */
public final class q0<T> extends xi.a<T, T> {

    /* JADX INFO: compiled from: ObservableIgnoreElements.java */
    public static final class a<T> implements ii.r<T>, mi.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ii.r<? super T> f74772b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public mi.b f74773c;

        @Override // ii.r
        public void onNext(T t10) {
        }

        @Override // mi.b
        public void dispose() {
            this.f74773c.dispose();
        }

        @Override // mi.b
        public boolean isDisposed() {
            return this.f74773c.isDisposed();
        }

        @Override // ii.r
        public void onComplete() {
            this.f74772b.onComplete();
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            this.f74772b.onError(th2);
        }

        @Override // ii.r
        public void onSubscribe(mi.b bVar) {
            this.f74773c = bVar;
            this.f74772b.onSubscribe(this);
        }

        public a(ii.r<? super T> rVar) {
            this.f74772b = rVar;
        }
    }

    @Override // ii.k
    public void subscribeActual(ii.r<? super T> rVar) {
        this.f74487b.subscribe(new a(rVar));
    }

    public q0(ii.p<T> pVar) {
        super(pVar);
    }
}
