package xi;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: ObservableAnySingle.java */
/* JADX INFO: loaded from: classes6.dex */
public final class h<T> extends ii.t<Boolean> implements ri.b<Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ii.p<T> f74597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oi.q<? super T> f74598b;

    /* JADX INFO: compiled from: ObservableAnySingle.java */
    public static final class a<T> implements ii.r<T>, mi.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ii.u<? super Boolean> f74599b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final oi.q<? super T> f74600c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public mi.b f74601d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f74602e;

        @Override // mi.b
        public void dispose() {
            this.f74601d.dispose();
        }

        @Override // mi.b
        public boolean isDisposed() {
            return this.f74601d.isDisposed();
        }

        @Override // ii.r
        public void onComplete() {
            if (this.f74602e) {
                return;
            }
            this.f74602e = true;
            this.f74599b.onSuccess(Boolean.FALSE);
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            if (this.f74602e) {
                ej.a.s(th2);
            } else {
                this.f74602e = true;
                this.f74599b.onError(th2);
            }
        }

        @Override // ii.r
        public void onNext(T t10) {
            if (this.f74602e) {
                return;
            }
            try {
                if (this.f74600c.test(t10)) {
                    this.f74602e = true;
                    this.f74601d.dispose();
                    this.f74599b.onSuccess(Boolean.TRUE);
                }
            } catch (Throwable th2) {
                ni.a.b(th2);
                this.f74601d.dispose();
                onError(th2);
            }
        }

        @Override // ii.r
        public void onSubscribe(mi.b bVar) {
            if (DisposableHelper.validate(this.f74601d, bVar)) {
                this.f74601d = bVar;
                this.f74599b.onSubscribe(this);
            }
        }

        public a(ii.u<? super Boolean> uVar, oi.q<? super T> qVar) {
            this.f74599b = uVar;
            this.f74600c = qVar;
        }
    }

    @Override // ri.b
    public ii.k<Boolean> a() {
        return ej.a.o(new g(this.f74597a, this.f74598b));
    }

    @Override // ii.t
    public void m(ii.u<? super Boolean> uVar) {
        this.f74597a.subscribe(new a(uVar, this.f74598b));
    }

    public h(ii.p<T> pVar, oi.q<? super T> qVar) {
        this.f74597a = pVar;
        this.f74598b = qVar;
    }
}
