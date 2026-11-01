package xi;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: ObservableSkipWhile.java */
/* JADX INFO: loaded from: classes7.dex */
public final class m1<T> extends xi.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final oi.q<? super T> f74714c;

    /* JADX INFO: compiled from: ObservableSkipWhile.java */
    public static final class a<T> implements ii.r<T>, mi.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ii.r<? super T> f74715b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final oi.q<? super T> f74716c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public mi.b f74717d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f74718e;

        @Override // mi.b
        public void dispose() {
            this.f74717d.dispose();
        }

        @Override // mi.b
        public boolean isDisposed() {
            return this.f74717d.isDisposed();
        }

        @Override // ii.r
        public void onComplete() {
            this.f74715b.onComplete();
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            this.f74715b.onError(th2);
        }

        @Override // ii.r
        public void onNext(T t10) {
            if (this.f74718e) {
                this.f74715b.onNext(t10);
                return;
            }
            try {
                if (this.f74716c.test(t10)) {
                    return;
                }
                this.f74718e = true;
                this.f74715b.onNext(t10);
            } catch (Throwable th2) {
                ni.a.b(th2);
                this.f74717d.dispose();
                this.f74715b.onError(th2);
            }
        }

        @Override // ii.r
        public void onSubscribe(mi.b bVar) {
            if (DisposableHelper.validate(this.f74717d, bVar)) {
                this.f74717d = bVar;
                this.f74715b.onSubscribe(this);
            }
        }

        public a(ii.r<? super T> rVar, oi.q<? super T> qVar) {
            this.f74715b = rVar;
            this.f74716c = qVar;
        }
    }

    @Override // ii.k
    public void subscribeActual(ii.r<? super T> rVar) {
        this.f74487b.subscribe(new a(rVar, this.f74714c));
    }

    public m1(ii.p<T> pVar, oi.q<? super T> qVar) {
        super(pVar);
        this.f74714c = qVar;
    }
}
