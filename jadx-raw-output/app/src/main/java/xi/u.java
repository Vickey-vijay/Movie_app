package xi;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: ObservableDematerialize.java */
/* JADX INFO: loaded from: classes7.dex */
public final class u<T> extends xi.a<ii.j<T>, T> {

    /* JADX INFO: compiled from: ObservableDematerialize.java */
    public static final class a<T> implements ii.r<ii.j<T>>, mi.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ii.r<? super T> f74851b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f74852c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public mi.b f74853d;

        @Override // ii.r
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onNext(ii.j<T> jVar) {
            if (this.f74852c) {
                if (jVar.g()) {
                    ej.a.s(jVar.d());
                }
            } else if (jVar.g()) {
                this.f74853d.dispose();
                onError(jVar.d());
            } else if (!jVar.f()) {
                this.f74851b.onNext(jVar.e());
            } else {
                this.f74853d.dispose();
                onComplete();
            }
        }

        @Override // mi.b
        public void dispose() {
            this.f74853d.dispose();
        }

        @Override // mi.b
        public boolean isDisposed() {
            return this.f74853d.isDisposed();
        }

        @Override // ii.r
        public void onComplete() {
            if (this.f74852c) {
                return;
            }
            this.f74852c = true;
            this.f74851b.onComplete();
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            if (this.f74852c) {
                ej.a.s(th2);
            } else {
                this.f74852c = true;
                this.f74851b.onError(th2);
            }
        }

        @Override // ii.r
        public void onSubscribe(mi.b bVar) {
            if (DisposableHelper.validate(this.f74853d, bVar)) {
                this.f74853d = bVar;
                this.f74851b.onSubscribe(this);
            }
        }

        public a(ii.r<? super T> rVar) {
            this.f74851b = rVar;
        }
    }

    @Override // ii.k
    public void subscribeActual(ii.r<? super T> rVar) {
        this.f74487b.subscribe(new a(rVar));
    }

    public u(ii.p<ii.j<T>> pVar) {
        super(pVar);
    }
}
