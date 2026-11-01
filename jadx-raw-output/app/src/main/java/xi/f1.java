package xi;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: ObservableScan.java */
/* JADX INFO: loaded from: classes10.dex */
public final class f1<T> extends xi.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final oi.c<T, T, T> f74577c;

    /* JADX INFO: compiled from: ObservableScan.java */
    public static final class a<T> implements ii.r<T>, mi.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ii.r<? super T> f74578b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final oi.c<T, T, T> f74579c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public mi.b f74580d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public T f74581e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f74582f;

        @Override // mi.b
        public void dispose() {
            this.f74580d.dispose();
        }

        @Override // mi.b
        public boolean isDisposed() {
            return this.f74580d.isDisposed();
        }

        @Override // ii.r
        public void onComplete() {
            if (this.f74582f) {
                return;
            }
            this.f74582f = true;
            this.f74578b.onComplete();
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            if (this.f74582f) {
                ej.a.s(th2);
            } else {
                this.f74582f = true;
                this.f74578b.onError(th2);
            }
        }

        /* JADX WARN: Type inference failed for: r4v3, types: [T, java.lang.Object] */
        @Override // ii.r
        public void onNext(T t10) {
            if (this.f74582f) {
                return;
            }
            ii.r<? super T> rVar = this.f74578b;
            T t11 = this.f74581e;
            if (t11 == null) {
                this.f74581e = t10;
                rVar.onNext(t10);
                return;
            }
            try {
                ?? r10 = (T) qi.a.e(this.f74579c.apply(t11, t10), "The value returned by the accumulator is null");
                this.f74581e = r10;
                rVar.onNext(r10);
            } catch (Throwable th2) {
                ni.a.b(th2);
                this.f74580d.dispose();
                onError(th2);
            }
        }

        @Override // ii.r
        public void onSubscribe(mi.b bVar) {
            if (DisposableHelper.validate(this.f74580d, bVar)) {
                this.f74580d = bVar;
                this.f74578b.onSubscribe(this);
            }
        }

        public a(ii.r<? super T> rVar, oi.c<T, T, T> cVar) {
            this.f74578b = rVar;
            this.f74579c = cVar;
        }
    }

    @Override // ii.k
    public void subscribeActual(ii.r<? super T> rVar) {
        this.f74487b.subscribe(new a(rVar, this.f74577c));
    }

    public f1(ii.p<T> pVar, oi.c<T, T, T> cVar) {
        super(pVar);
        this.f74577c = cVar;
    }
}
