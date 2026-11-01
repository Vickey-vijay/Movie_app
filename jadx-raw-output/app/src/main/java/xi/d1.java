package xi;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: ObservableReduceSeedSingle.java */
/* JADX INFO: loaded from: classes9.dex */
public final class d1<T, R> extends ii.t<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ii.p<T> f74554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final R f74555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final oi.c<R, ? super T, R> f74556c;

    /* JADX INFO: compiled from: ObservableReduceSeedSingle.java */
    public static final class a<T, R> implements ii.r<T>, mi.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ii.u<? super R> f74557b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final oi.c<R, ? super T, R> f74558c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public R f74559d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public mi.b f74560e;

        @Override // mi.b
        public void dispose() {
            this.f74560e.dispose();
        }

        @Override // mi.b
        public boolean isDisposed() {
            return this.f74560e.isDisposed();
        }

        @Override // ii.r
        public void onComplete() {
            R r10 = this.f74559d;
            if (r10 != null) {
                this.f74559d = null;
                this.f74557b.onSuccess(r10);
            }
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            if (this.f74559d == null) {
                ej.a.s(th2);
            } else {
                this.f74559d = null;
                this.f74557b.onError(th2);
            }
        }

        @Override // ii.r
        public void onNext(T t10) {
            R r10 = this.f74559d;
            if (r10 != null) {
                try {
                    this.f74559d = (R) qi.a.e(this.f74558c.apply(r10, t10), "The reducer returned a null value");
                } catch (Throwable th2) {
                    ni.a.b(th2);
                    this.f74560e.dispose();
                    onError(th2);
                }
            }
        }

        @Override // ii.r
        public void onSubscribe(mi.b bVar) {
            if (DisposableHelper.validate(this.f74560e, bVar)) {
                this.f74560e = bVar;
                this.f74557b.onSubscribe(this);
            }
        }

        public a(ii.u<? super R> uVar, oi.c<R, ? super T, R> cVar, R r10) {
            this.f74557b = uVar;
            this.f74559d = r10;
            this.f74558c = cVar;
        }
    }

    @Override // ii.t
    public void m(ii.u<? super R> uVar) {
        this.f74554a.subscribe(new a(uVar, this.f74556c, this.f74555b));
    }

    public d1(ii.p<T> pVar, R r10, oi.c<R, ? super T, R> cVar) {
        this.f74554a = pVar;
        this.f74555b = r10;
        this.f74556c = cVar;
    }
}
