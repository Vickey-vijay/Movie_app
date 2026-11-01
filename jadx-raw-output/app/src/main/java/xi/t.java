package xi;

import io.reactivex.internal.disposables.SequentialDisposable;

/* JADX INFO: compiled from: ObservableDelaySubscriptionOther.java */
/* JADX INFO: loaded from: classes4.dex */
public final class t<T, U> extends ii.k<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ii.p<? extends T> f74836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ii.p<U> f74837c;

    /* JADX INFO: compiled from: ObservableDelaySubscriptionOther.java */
    public final class a implements ii.r<U> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SequentialDisposable f74838b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ii.r<? super T> f74839c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f74840d;

        /* JADX INFO: renamed from: xi.t$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ObservableDelaySubscriptionOther.java */
        public final class C0793a implements ii.r<T> {
            public C0793a() {
            }

            @Override // ii.r
            public void onComplete() {
                a.this.f74839c.onComplete();
            }

            @Override // ii.r
            public void onError(Throwable th2) {
                a.this.f74839c.onError(th2);
            }

            @Override // ii.r
            public void onNext(T t10) {
                a.this.f74839c.onNext(t10);
            }

            @Override // ii.r
            public void onSubscribe(mi.b bVar) {
                a.this.f74838b.update(bVar);
            }
        }

        public a(SequentialDisposable sequentialDisposable, ii.r<? super T> rVar) {
            this.f74838b = sequentialDisposable;
            this.f74839c = rVar;
        }

        @Override // ii.r
        public void onComplete() {
            if (this.f74840d) {
                return;
            }
            this.f74840d = true;
            t.this.f74836b.subscribe(new C0793a());
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            if (this.f74840d) {
                ej.a.s(th2);
            } else {
                this.f74840d = true;
                this.f74839c.onError(th2);
            }
        }

        @Override // ii.r
        public void onSubscribe(mi.b bVar) {
            this.f74838b.update(bVar);
        }

        @Override // ii.r
        public void onNext(U u10) {
            onComplete();
        }
    }

    @Override // ii.k
    public void subscribeActual(ii.r<? super T> rVar) {
        SequentialDisposable sequentialDisposable = new SequentialDisposable();
        rVar.onSubscribe(sequentialDisposable);
        this.f74837c.subscribe(new a(sequentialDisposable, rVar));
    }

    public t(ii.p<? extends T> pVar, ii.p<U> pVar2) {
        this.f74836b = pVar;
        this.f74837c = pVar2;
    }
}
