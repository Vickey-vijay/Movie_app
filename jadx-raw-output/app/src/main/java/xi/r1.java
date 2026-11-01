package xi;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: ObservableTakeWhile.java */
/* JADX INFO: loaded from: classes11.dex */
public final class r1<T> extends xi.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final oi.q<? super T> f74783c;

    /* JADX INFO: compiled from: ObservableTakeWhile.java */
    public static final class a<T> implements ii.r<T>, mi.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ii.r<? super T> f74784b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final oi.q<? super T> f74785c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public mi.b f74786d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f74787e;

        @Override // mi.b
        public void dispose() {
            this.f74786d.dispose();
        }

        @Override // mi.b
        public boolean isDisposed() {
            return this.f74786d.isDisposed();
        }

        @Override // ii.r
        public void onComplete() {
            if (this.f74787e) {
                return;
            }
            this.f74787e = true;
            this.f74784b.onComplete();
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            if (this.f74787e) {
                ej.a.s(th2);
            } else {
                this.f74787e = true;
                this.f74784b.onError(th2);
            }
        }

        @Override // ii.r
        public void onNext(T t10) {
            if (this.f74787e) {
                return;
            }
            try {
                if (this.f74785c.test(t10)) {
                    this.f74784b.onNext(t10);
                    return;
                }
                this.f74787e = true;
                this.f74786d.dispose();
                this.f74784b.onComplete();
            } catch (Throwable th2) {
                ni.a.b(th2);
                this.f74786d.dispose();
                onError(th2);
            }
        }

        @Override // ii.r
        public void onSubscribe(mi.b bVar) {
            if (DisposableHelper.validate(this.f74786d, bVar)) {
                this.f74786d = bVar;
                this.f74784b.onSubscribe(this);
            }
        }

        public a(ii.r<? super T> rVar, oi.q<? super T> qVar) {
            this.f74784b = rVar;
            this.f74785c = qVar;
        }
    }

    @Override // ii.k
    public void subscribeActual(ii.r<? super T> rVar) {
        this.f74487b.subscribe(new a(rVar, this.f74783c));
    }

    public r1(ii.p<T> pVar, oi.q<? super T> qVar) {
        super(pVar);
        this.f74783c = qVar;
    }
}
