package xi;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: ObservableLastMaybe.java */
/* JADX INFO: loaded from: classes11.dex */
public final class t0<T> extends ii.g<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ii.p<T> f74843a;

    /* JADX INFO: compiled from: ObservableLastMaybe.java */
    public static final class a<T> implements ii.r<T>, mi.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ii.h<? super T> f74844b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public mi.b f74845c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public T f74846d;

        @Override // mi.b
        public void dispose() {
            this.f74845c.dispose();
            this.f74845c = DisposableHelper.DISPOSED;
        }

        @Override // mi.b
        public boolean isDisposed() {
            return this.f74845c == DisposableHelper.DISPOSED;
        }

        @Override // ii.r
        public void onComplete() {
            this.f74845c = DisposableHelper.DISPOSED;
            T t10 = this.f74846d;
            if (t10 == null) {
                this.f74844b.onComplete();
            } else {
                this.f74846d = null;
                this.f74844b.onSuccess(t10);
            }
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            this.f74845c = DisposableHelper.DISPOSED;
            this.f74846d = null;
            this.f74844b.onError(th2);
        }

        @Override // ii.r
        public void onNext(T t10) {
            this.f74846d = t10;
        }

        @Override // ii.r
        public void onSubscribe(mi.b bVar) {
            if (DisposableHelper.validate(this.f74845c, bVar)) {
                this.f74845c = bVar;
                this.f74844b.onSubscribe(this);
            }
        }

        public a(ii.h<? super T> hVar) {
            this.f74844b = hVar;
        }
    }

    @Override // ii.g
    public void d(ii.h<? super T> hVar) {
        this.f74843a.subscribe(new a(hVar));
    }

    public t0(ii.p<T> pVar) {
        this.f74843a = pVar;
    }
}
