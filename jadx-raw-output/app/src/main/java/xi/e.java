package xi;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: ObservableAll.java */
/* JADX INFO: loaded from: classes10.dex */
public final class e<T> extends xi.a<T, Boolean> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final oi.q<? super T> f74561c;

    /* JADX INFO: compiled from: ObservableAll.java */
    public static final class a<T> implements ii.r<T>, mi.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ii.r<? super Boolean> f74562b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final oi.q<? super T> f74563c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public mi.b f74564d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f74565e;

        @Override // mi.b
        public void dispose() {
            this.f74564d.dispose();
        }

        @Override // mi.b
        public boolean isDisposed() {
            return this.f74564d.isDisposed();
        }

        @Override // ii.r
        public void onComplete() {
            if (this.f74565e) {
                return;
            }
            this.f74565e = true;
            this.f74562b.onNext(Boolean.TRUE);
            this.f74562b.onComplete();
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            if (this.f74565e) {
                ej.a.s(th2);
            } else {
                this.f74565e = true;
                this.f74562b.onError(th2);
            }
        }

        @Override // ii.r
        public void onNext(T t10) {
            if (this.f74565e) {
                return;
            }
            try {
                if (this.f74563c.test(t10)) {
                    return;
                }
                this.f74565e = true;
                this.f74564d.dispose();
                this.f74562b.onNext(Boolean.FALSE);
                this.f74562b.onComplete();
            } catch (Throwable th2) {
                ni.a.b(th2);
                this.f74564d.dispose();
                onError(th2);
            }
        }

        @Override // ii.r
        public void onSubscribe(mi.b bVar) {
            if (DisposableHelper.validate(this.f74564d, bVar)) {
                this.f74564d = bVar;
                this.f74562b.onSubscribe(this);
            }
        }

        public a(ii.r<? super Boolean> rVar, oi.q<? super T> qVar) {
            this.f74562b = rVar;
            this.f74563c = qVar;
        }
    }

    @Override // ii.k
    public void subscribeActual(ii.r<? super Boolean> rVar) {
        this.f74487b.subscribe(new a(rVar, this.f74561c));
    }

    public e(ii.p<T> pVar, oi.q<? super T> qVar) {
        super(pVar);
        this.f74561c = qVar;
    }
}
