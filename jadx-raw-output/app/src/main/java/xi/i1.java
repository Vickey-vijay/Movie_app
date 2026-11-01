package xi;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: ObservableSingleMaybe.java */
/* JADX INFO: loaded from: classes6.dex */
public final class i1<T> extends ii.g<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ii.p<T> f74613a;

    /* JADX INFO: compiled from: ObservableSingleMaybe.java */
    public static final class a<T> implements ii.r<T>, mi.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ii.h<? super T> f74614b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public mi.b f74615c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public T f74616d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f74617e;

        @Override // mi.b
        public void dispose() {
            this.f74615c.dispose();
        }

        @Override // mi.b
        public boolean isDisposed() {
            return this.f74615c.isDisposed();
        }

        @Override // ii.r
        public void onComplete() {
            if (this.f74617e) {
                return;
            }
            this.f74617e = true;
            T t10 = this.f74616d;
            this.f74616d = null;
            if (t10 == null) {
                this.f74614b.onComplete();
            } else {
                this.f74614b.onSuccess(t10);
            }
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            if (this.f74617e) {
                ej.a.s(th2);
            } else {
                this.f74617e = true;
                this.f74614b.onError(th2);
            }
        }

        @Override // ii.r
        public void onNext(T t10) {
            if (this.f74617e) {
                return;
            }
            if (this.f74616d == null) {
                this.f74616d = t10;
                return;
            }
            this.f74617e = true;
            this.f74615c.dispose();
            this.f74614b.onError(new IllegalArgumentException("Sequence contains more than one element!"));
        }

        @Override // ii.r
        public void onSubscribe(mi.b bVar) {
            if (DisposableHelper.validate(this.f74615c, bVar)) {
                this.f74615c = bVar;
                this.f74614b.onSubscribe(this);
            }
        }

        public a(ii.h<? super T> hVar) {
            this.f74614b = hVar;
        }
    }

    @Override // ii.g
    public void d(ii.h<? super T> hVar) {
        this.f74613a.subscribe(new a(hVar));
    }

    public i1(ii.p<T> pVar) {
        this.f74613a = pVar;
    }
}
