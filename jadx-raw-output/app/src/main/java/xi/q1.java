package xi;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: ObservableTakeUntilPredicate.java */
/* JADX INFO: loaded from: classes11.dex */
public final class q1<T> extends xi.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final oi.q<? super T> f74774c;

    /* JADX INFO: compiled from: ObservableTakeUntilPredicate.java */
    public static final class a<T> implements ii.r<T>, mi.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ii.r<? super T> f74775b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final oi.q<? super T> f74776c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public mi.b f74777d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f74778e;

        @Override // mi.b
        public void dispose() {
            this.f74777d.dispose();
        }

        @Override // mi.b
        public boolean isDisposed() {
            return this.f74777d.isDisposed();
        }

        @Override // ii.r
        public void onComplete() {
            if (this.f74778e) {
                return;
            }
            this.f74778e = true;
            this.f74775b.onComplete();
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            if (this.f74778e) {
                ej.a.s(th2);
            } else {
                this.f74778e = true;
                this.f74775b.onError(th2);
            }
        }

        @Override // ii.r
        public void onNext(T t10) {
            if (this.f74778e) {
                return;
            }
            this.f74775b.onNext(t10);
            try {
                if (this.f74776c.test(t10)) {
                    this.f74778e = true;
                    this.f74777d.dispose();
                    this.f74775b.onComplete();
                }
            } catch (Throwable th2) {
                ni.a.b(th2);
                this.f74777d.dispose();
                onError(th2);
            }
        }

        @Override // ii.r
        public void onSubscribe(mi.b bVar) {
            if (DisposableHelper.validate(this.f74777d, bVar)) {
                this.f74777d = bVar;
                this.f74775b.onSubscribe(this);
            }
        }

        public a(ii.r<? super T> rVar, oi.q<? super T> qVar) {
            this.f74775b = rVar;
            this.f74776c = qVar;
        }
    }

    @Override // ii.k
    public void subscribeActual(ii.r<? super T> rVar) {
        this.f74487b.subscribe(new a(rVar, this.f74774c));
    }

    public q1(ii.p<T> pVar, oi.q<? super T> qVar) {
        super(pVar);
        this.f74774c = qVar;
    }
}
