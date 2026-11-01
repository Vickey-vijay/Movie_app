package xi;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: ObservableReduceMaybe.java */
/* JADX INFO: loaded from: classes10.dex */
public final class c1<T> extends ii.g<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ii.p<T> f74528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oi.c<T, T, T> f74529b;

    /* JADX INFO: compiled from: ObservableReduceMaybe.java */
    public static final class a<T> implements ii.r<T>, mi.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ii.h<? super T> f74530b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final oi.c<T, T, T> f74531c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f74532d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public T f74533e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public mi.b f74534f;

        @Override // mi.b
        public void dispose() {
            this.f74534f.dispose();
        }

        @Override // mi.b
        public boolean isDisposed() {
            return this.f74534f.isDisposed();
        }

        @Override // ii.r
        public void onComplete() {
            if (this.f74532d) {
                return;
            }
            this.f74532d = true;
            T t10 = this.f74533e;
            this.f74533e = null;
            if (t10 != null) {
                this.f74530b.onSuccess(t10);
            } else {
                this.f74530b.onComplete();
            }
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            if (this.f74532d) {
                ej.a.s(th2);
                return;
            }
            this.f74532d = true;
            this.f74533e = null;
            this.f74530b.onError(th2);
        }

        @Override // ii.r
        public void onNext(T t10) {
            if (this.f74532d) {
                return;
            }
            T t11 = this.f74533e;
            if (t11 == null) {
                this.f74533e = t10;
                return;
            }
            try {
                this.f74533e = (T) qi.a.e(this.f74531c.apply(t11, t10), "The reducer returned a null value");
            } catch (Throwable th2) {
                ni.a.b(th2);
                this.f74534f.dispose();
                onError(th2);
            }
        }

        @Override // ii.r
        public void onSubscribe(mi.b bVar) {
            if (DisposableHelper.validate(this.f74534f, bVar)) {
                this.f74534f = bVar;
                this.f74530b.onSubscribe(this);
            }
        }

        public a(ii.h<? super T> hVar, oi.c<T, T, T> cVar) {
            this.f74530b = hVar;
            this.f74531c = cVar;
        }
    }

    @Override // ii.g
    public void d(ii.h<? super T> hVar) {
        this.f74528a.subscribe(new a(hVar, this.f74529b));
    }

    public c1(ii.p<T> pVar, oi.c<T, T, T> cVar) {
        this.f74528a = pVar;
        this.f74529b = cVar;
    }
}
