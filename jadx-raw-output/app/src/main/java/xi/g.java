package xi;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: ObservableAny.java */
/* JADX INFO: loaded from: classes11.dex */
public final class g<T> extends xi.a<T, Boolean> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final oi.q<? super T> f74583c;

    /* JADX INFO: compiled from: ObservableAny.java */
    public static final class a<T> implements ii.r<T>, mi.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ii.r<? super Boolean> f74584b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final oi.q<? super T> f74585c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public mi.b f74586d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f74587e;

        @Override // mi.b
        public void dispose() {
            this.f74586d.dispose();
        }

        @Override // mi.b
        public boolean isDisposed() {
            return this.f74586d.isDisposed();
        }

        @Override // ii.r
        public void onComplete() {
            if (this.f74587e) {
                return;
            }
            this.f74587e = true;
            this.f74584b.onNext(Boolean.FALSE);
            this.f74584b.onComplete();
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            if (this.f74587e) {
                ej.a.s(th2);
            } else {
                this.f74587e = true;
                this.f74584b.onError(th2);
            }
        }

        @Override // ii.r
        public void onNext(T t10) {
            if (this.f74587e) {
                return;
            }
            try {
                if (this.f74585c.test(t10)) {
                    this.f74587e = true;
                    this.f74586d.dispose();
                    this.f74584b.onNext(Boolean.TRUE);
                    this.f74584b.onComplete();
                }
            } catch (Throwable th2) {
                ni.a.b(th2);
                this.f74586d.dispose();
                onError(th2);
            }
        }

        @Override // ii.r
        public void onSubscribe(mi.b bVar) {
            if (DisposableHelper.validate(this.f74586d, bVar)) {
                this.f74586d = bVar;
                this.f74584b.onSubscribe(this);
            }
        }

        public a(ii.r<? super Boolean> rVar, oi.q<? super T> qVar) {
            this.f74584b = rVar;
            this.f74585c = qVar;
        }
    }

    @Override // ii.k
    public void subscribeActual(ii.r<? super Boolean> rVar) {
        this.f74487b.subscribe(new a(rVar, this.f74583c));
    }

    public g(ii.p<T> pVar, oi.q<? super T> qVar) {
        super(pVar);
        this.f74583c = qVar;
    }
}
