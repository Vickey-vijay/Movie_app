package xi;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: ObservableCollect.java */
/* JADX INFO: loaded from: classes6.dex */
public final class m<T, U> extends xi.a<T, U> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Callable<? extends U> f74704c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final oi.b<? super U, ? super T> f74705d;

    /* JADX INFO: compiled from: ObservableCollect.java */
    public static final class a<T, U> implements ii.r<T>, mi.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ii.r<? super U> f74706b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final oi.b<? super U, ? super T> f74707c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final U f74708d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public mi.b f74709e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f74710f;

        @Override // mi.b
        public void dispose() {
            this.f74709e.dispose();
        }

        @Override // mi.b
        public boolean isDisposed() {
            return this.f74709e.isDisposed();
        }

        @Override // ii.r
        public void onComplete() {
            if (this.f74710f) {
                return;
            }
            this.f74710f = true;
            this.f74706b.onNext(this.f74708d);
            this.f74706b.onComplete();
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            if (this.f74710f) {
                ej.a.s(th2);
            } else {
                this.f74710f = true;
                this.f74706b.onError(th2);
            }
        }

        @Override // ii.r
        public void onNext(T t10) {
            if (this.f74710f) {
                return;
            }
            try {
                this.f74707c.accept(this.f74708d, t10);
            } catch (Throwable th2) {
                this.f74709e.dispose();
                onError(th2);
            }
        }

        @Override // ii.r
        public void onSubscribe(mi.b bVar) {
            if (DisposableHelper.validate(this.f74709e, bVar)) {
                this.f74709e = bVar;
                this.f74706b.onSubscribe(this);
            }
        }

        public a(ii.r<? super U> rVar, U u10, oi.b<? super U, ? super T> bVar) {
            this.f74706b = rVar;
            this.f74707c = bVar;
            this.f74708d = u10;
        }
    }

    @Override // ii.k
    public void subscribeActual(ii.r<? super U> rVar) {
        try {
            this.f74487b.subscribe(new a(rVar, qi.a.e(this.f74704c.call(), "The initialSupplier returned a null value"), this.f74705d));
        } catch (Throwable th2) {
            EmptyDisposable.error(th2, rVar);
        }
    }

    public m(ii.p<T> pVar, Callable<? extends U> callable, oi.b<? super U, ? super T> bVar) {
        super(pVar);
        this.f74704c = callable;
        this.f74705d = bVar;
    }
}
