package xi;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: ObservableSkip.java */
/* JADX INFO: loaded from: classes.dex */
public final class k1<T> extends xi.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f74646c;

    /* JADX INFO: compiled from: ObservableSkip.java */
    public static final class a<T> implements ii.r<T>, mi.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ii.r<? super T> f74647b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f74648c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public mi.b f74649d;

        @Override // mi.b
        public void dispose() {
            this.f74649d.dispose();
        }

        @Override // mi.b
        public boolean isDisposed() {
            return this.f74649d.isDisposed();
        }

        @Override // ii.r
        public void onComplete() {
            this.f74647b.onComplete();
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            this.f74647b.onError(th2);
        }

        @Override // ii.r
        public void onNext(T t10) {
            long j10 = this.f74648c;
            if (j10 != 0) {
                this.f74648c = j10 - 1;
            } else {
                this.f74647b.onNext(t10);
            }
        }

        @Override // ii.r
        public void onSubscribe(mi.b bVar) {
            if (DisposableHelper.validate(this.f74649d, bVar)) {
                this.f74649d = bVar;
                this.f74647b.onSubscribe(this);
            }
        }

        public a(ii.r<? super T> rVar, long j10) {
            this.f74647b = rVar;
            this.f74648c = j10;
        }
    }

    @Override // ii.k
    public void subscribeActual(ii.r<? super T> rVar) {
        this.f74487b.subscribe(new a(rVar, this.f74646c));
    }

    public k1(ii.p<T> pVar, long j10) {
        super(pVar);
        this.f74646c = j10;
    }
}
