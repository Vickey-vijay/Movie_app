package xi;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: ObservableAllSingle.java */
/* JADX INFO: loaded from: classes11.dex */
public final class f<T> extends ii.t<Boolean> implements ri.b<Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ii.p<T> f74570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oi.q<? super T> f74571b;

    /* JADX INFO: compiled from: ObservableAllSingle.java */
    public static final class a<T> implements ii.r<T>, mi.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ii.u<? super Boolean> f74572b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final oi.q<? super T> f74573c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public mi.b f74574d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f74575e;

        @Override // mi.b
        public void dispose() {
            this.f74574d.dispose();
        }

        @Override // mi.b
        public boolean isDisposed() {
            return this.f74574d.isDisposed();
        }

        @Override // ii.r
        public void onComplete() {
            if (this.f74575e) {
                return;
            }
            this.f74575e = true;
            this.f74572b.onSuccess(Boolean.TRUE);
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            if (this.f74575e) {
                ej.a.s(th2);
            } else {
                this.f74575e = true;
                this.f74572b.onError(th2);
            }
        }

        @Override // ii.r
        public void onNext(T t10) {
            if (this.f74575e) {
                return;
            }
            try {
                if (this.f74573c.test(t10)) {
                    return;
                }
                this.f74575e = true;
                this.f74574d.dispose();
                this.f74572b.onSuccess(Boolean.FALSE);
            } catch (Throwable th2) {
                ni.a.b(th2);
                this.f74574d.dispose();
                onError(th2);
            }
        }

        @Override // ii.r
        public void onSubscribe(mi.b bVar) {
            if (DisposableHelper.validate(this.f74574d, bVar)) {
                this.f74574d = bVar;
                this.f74572b.onSubscribe(this);
            }
        }

        public a(ii.u<? super Boolean> uVar, oi.q<? super T> qVar) {
            this.f74572b = uVar;
            this.f74573c = qVar;
        }
    }

    @Override // ri.b
    public ii.k<Boolean> a() {
        return ej.a.o(new e(this.f74570a, this.f74571b));
    }

    @Override // ii.t
    public void m(ii.u<? super Boolean> uVar) {
        this.f74570a.subscribe(new a(uVar, this.f74571b));
    }

    public f(ii.p<T> pVar, oi.q<? super T> qVar) {
        this.f74570a = pVar;
        this.f74571b = qVar;
    }
}
