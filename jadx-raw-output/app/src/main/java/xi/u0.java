package xi;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: ObservableLastSingle.java */
/* JADX INFO: loaded from: classes11.dex */
public final class u0<T> extends ii.t<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ii.p<T> f74854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T f74855b;

    /* JADX INFO: compiled from: ObservableLastSingle.java */
    public static final class a<T> implements ii.r<T>, mi.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ii.u<? super T> f74856b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final T f74857c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public mi.b f74858d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public T f74859e;

        @Override // mi.b
        public void dispose() {
            this.f74858d.dispose();
            this.f74858d = DisposableHelper.DISPOSED;
        }

        @Override // mi.b
        public boolean isDisposed() {
            return this.f74858d == DisposableHelper.DISPOSED;
        }

        @Override // ii.r
        public void onComplete() {
            this.f74858d = DisposableHelper.DISPOSED;
            T t10 = this.f74859e;
            if (t10 != null) {
                this.f74859e = null;
                this.f74856b.onSuccess(t10);
                return;
            }
            T t11 = this.f74857c;
            if (t11 != null) {
                this.f74856b.onSuccess(t11);
            } else {
                this.f74856b.onError(new NoSuchElementException());
            }
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            this.f74858d = DisposableHelper.DISPOSED;
            this.f74859e = null;
            this.f74856b.onError(th2);
        }

        @Override // ii.r
        public void onNext(T t10) {
            this.f74859e = t10;
        }

        @Override // ii.r
        public void onSubscribe(mi.b bVar) {
            if (DisposableHelper.validate(this.f74858d, bVar)) {
                this.f74858d = bVar;
                this.f74856b.onSubscribe(this);
            }
        }

        public a(ii.u<? super T> uVar, T t10) {
            this.f74856b = uVar;
            this.f74857c = t10;
        }
    }

    @Override // ii.t
    public void m(ii.u<? super T> uVar) {
        this.f74854a.subscribe(new a(uVar, this.f74855b));
    }

    public u0(ii.p<T> pVar, T t10) {
        this.f74854a = pVar;
        this.f74855b = t10;
    }
}
