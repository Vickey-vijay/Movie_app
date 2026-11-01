package xi;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: ObservableSingleSingle.java */
/* JADX INFO: loaded from: classes4.dex */
public final class j1<T> extends ii.t<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ii.p<? extends T> f74628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T f74629b;

    /* JADX INFO: compiled from: ObservableSingleSingle.java */
    public static final class a<T> implements ii.r<T>, mi.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ii.u<? super T> f74630b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final T f74631c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public mi.b f74632d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public T f74633e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f74634f;

        @Override // mi.b
        public void dispose() {
            this.f74632d.dispose();
        }

        @Override // mi.b
        public boolean isDisposed() {
            return this.f74632d.isDisposed();
        }

        @Override // ii.r
        public void onComplete() {
            if (this.f74634f) {
                return;
            }
            this.f74634f = true;
            T t10 = this.f74633e;
            this.f74633e = null;
            if (t10 == null) {
                t10 = this.f74631c;
            }
            if (t10 != null) {
                this.f74630b.onSuccess(t10);
            } else {
                this.f74630b.onError(new NoSuchElementException());
            }
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            if (this.f74634f) {
                ej.a.s(th2);
            } else {
                this.f74634f = true;
                this.f74630b.onError(th2);
            }
        }

        @Override // ii.r
        public void onNext(T t10) {
            if (this.f74634f) {
                return;
            }
            if (this.f74633e == null) {
                this.f74633e = t10;
                return;
            }
            this.f74634f = true;
            this.f74632d.dispose();
            this.f74630b.onError(new IllegalArgumentException("Sequence contains more than one element!"));
        }

        @Override // ii.r
        public void onSubscribe(mi.b bVar) {
            if (DisposableHelper.validate(this.f74632d, bVar)) {
                this.f74632d = bVar;
                this.f74630b.onSubscribe(this);
            }
        }

        public a(ii.u<? super T> uVar, T t10) {
            this.f74630b = uVar;
            this.f74631c = t10;
        }
    }

    @Override // ii.t
    public void m(ii.u<? super T> uVar) {
        this.f74628a.subscribe(new a(uVar, this.f74629b));
    }

    public j1(ii.p<? extends T> pVar, T t10) {
        this.f74628a = pVar;
        this.f74629b = t10;
    }
}
