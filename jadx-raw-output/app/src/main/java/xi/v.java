package xi;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.EmptyComponent;

/* JADX INFO: compiled from: ObservableDetach.java */
/* JADX INFO: loaded from: classes5.dex */
public final class v<T> extends xi.a<T, T> {

    /* JADX INFO: compiled from: ObservableDetach.java */
    public static final class a<T> implements ii.r<T>, mi.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ii.r<? super T> f74865b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public mi.b f74866c;

        @Override // mi.b
        public void dispose() {
            mi.b bVar = this.f74866c;
            this.f74866c = EmptyComponent.INSTANCE;
            this.f74865b = EmptyComponent.asObserver();
            bVar.dispose();
        }

        @Override // mi.b
        public boolean isDisposed() {
            return this.f74866c.isDisposed();
        }

        @Override // ii.r
        public void onComplete() {
            ii.r<? super T> rVar = this.f74865b;
            this.f74866c = EmptyComponent.INSTANCE;
            this.f74865b = EmptyComponent.asObserver();
            rVar.onComplete();
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            ii.r<? super T> rVar = this.f74865b;
            this.f74866c = EmptyComponent.INSTANCE;
            this.f74865b = EmptyComponent.asObserver();
            rVar.onError(th2);
        }

        @Override // ii.r
        public void onNext(T t10) {
            this.f74865b.onNext(t10);
        }

        @Override // ii.r
        public void onSubscribe(mi.b bVar) {
            if (DisposableHelper.validate(this.f74866c, bVar)) {
                this.f74866c = bVar;
                this.f74865b.onSubscribe(this);
            }
        }

        public a(ii.r<? super T> rVar) {
            this.f74865b = rVar;
        }
    }

    @Override // ii.k
    public void subscribeActual(ii.r<? super T> rVar) {
        this.f74487b.subscribe(new a(rVar));
    }

    public v(ii.p<T> pVar) {
        super(pVar);
    }
}
