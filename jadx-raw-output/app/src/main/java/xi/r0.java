package xi;

/* JADX INFO: compiled from: ObservableIgnoreElementsCompletable.java */
/* JADX INFO: loaded from: classes7.dex */
public final class r0<T> extends ii.a implements ri.b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ii.p<T> f74780a;

    /* JADX INFO: compiled from: ObservableIgnoreElementsCompletable.java */
    public static final class a<T> implements ii.r<T>, mi.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ii.b f74781b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public mi.b f74782c;

        @Override // ii.r
        public void onNext(T t10) {
        }

        @Override // mi.b
        public void dispose() {
            this.f74782c.dispose();
        }

        @Override // mi.b
        public boolean isDisposed() {
            return this.f74782c.isDisposed();
        }

        @Override // ii.r
        public void onComplete() {
            this.f74781b.onComplete();
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            this.f74781b.onError(th2);
        }

        @Override // ii.r
        public void onSubscribe(mi.b bVar) {
            this.f74782c = bVar;
            this.f74781b.onSubscribe(this);
        }

        public a(ii.b bVar) {
            this.f74781b = bVar;
        }
    }

    @Override // ri.b
    public ii.k<T> a() {
        return ej.a.o(new q0(this.f74780a));
    }

    @Override // ii.a
    public void f(ii.b bVar) {
        this.f74780a.subscribe(new a(bVar));
    }

    public r0(ii.p<T> pVar) {
        this.f74780a = pVar;
    }
}
