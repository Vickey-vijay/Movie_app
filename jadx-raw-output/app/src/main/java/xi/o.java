package xi;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: ObservableCount.java */
/* JADX INFO: loaded from: classes10.dex */
public final class o<T> extends xi.a<T, Long> {

    /* JADX INFO: compiled from: ObservableCount.java */
    public static final class a implements ii.r<Object>, mi.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ii.r<? super Long> f74733b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public mi.b f74734c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f74735d;

        @Override // mi.b
        public void dispose() {
            this.f74734c.dispose();
        }

        @Override // mi.b
        public boolean isDisposed() {
            return this.f74734c.isDisposed();
        }

        @Override // ii.r
        public void onComplete() {
            this.f74733b.onNext(Long.valueOf(this.f74735d));
            this.f74733b.onComplete();
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            this.f74733b.onError(th2);
        }

        @Override // ii.r
        public void onNext(Object obj) {
            this.f74735d++;
        }

        @Override // ii.r
        public void onSubscribe(mi.b bVar) {
            if (DisposableHelper.validate(this.f74734c, bVar)) {
                this.f74734c = bVar;
                this.f74733b.onSubscribe(this);
            }
        }

        public a(ii.r<? super Long> rVar) {
            this.f74733b = rVar;
        }
    }

    @Override // ii.k
    public void subscribeActual(ii.r<? super Long> rVar) {
        this.f74487b.subscribe(new a(rVar));
    }

    public o(ii.p<T> pVar) {
        super(pVar);
    }
}
