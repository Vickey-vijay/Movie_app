package xi;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.Iterator;

/* JADX INFO: compiled from: ObservableZipIterable.java */
/* JADX INFO: loaded from: classes11.dex */
public final class x1<T, U, V> extends ii.k<V> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ii.k<? extends T> f74948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Iterable<U> f74949c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final oi.c<? super T, ? super U, ? extends V> f74950d;

    /* JADX INFO: compiled from: ObservableZipIterable.java */
    public static final class a<T, U, V> implements ii.r<T>, mi.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ii.r<? super V> f74951b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Iterator<U> f74952c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final oi.c<? super T, ? super U, ? extends V> f74953d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public mi.b f74954e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f74955f;

        public void a(Throwable th2) {
            this.f74955f = true;
            this.f74954e.dispose();
            this.f74951b.onError(th2);
        }

        @Override // mi.b
        public void dispose() {
            this.f74954e.dispose();
        }

        @Override // mi.b
        public boolean isDisposed() {
            return this.f74954e.isDisposed();
        }

        @Override // ii.r
        public void onComplete() {
            if (this.f74955f) {
                return;
            }
            this.f74955f = true;
            this.f74951b.onComplete();
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            if (this.f74955f) {
                ej.a.s(th2);
            } else {
                this.f74955f = true;
                this.f74951b.onError(th2);
            }
        }

        @Override // ii.r
        public void onNext(T t10) {
            if (this.f74955f) {
                return;
            }
            try {
                try {
                    this.f74951b.onNext(qi.a.e(this.f74953d.apply(t10, qi.a.e(this.f74952c.next(), "The iterator returned a null value")), "The zipper function returned a null value"));
                    try {
                        if (this.f74952c.hasNext()) {
                            return;
                        }
                        this.f74955f = true;
                        this.f74954e.dispose();
                        this.f74951b.onComplete();
                    } catch (Throwable th2) {
                        ni.a.b(th2);
                        a(th2);
                    }
                } catch (Throwable th3) {
                    ni.a.b(th3);
                    a(th3);
                }
            } catch (Throwable th4) {
                ni.a.b(th4);
                a(th4);
            }
        }

        @Override // ii.r
        public void onSubscribe(mi.b bVar) {
            if (DisposableHelper.validate(this.f74954e, bVar)) {
                this.f74954e = bVar;
                this.f74951b.onSubscribe(this);
            }
        }

        public a(ii.r<? super V> rVar, Iterator<U> it, oi.c<? super T, ? super U, ? extends V> cVar) {
            this.f74951b = rVar;
            this.f74952c = it;
            this.f74953d = cVar;
        }
    }

    @Override // ii.k
    public void subscribeActual(ii.r<? super V> rVar) {
        try {
            Iterator it = (Iterator) qi.a.e(this.f74949c.iterator(), "The iterator returned by other is null");
            try {
                if (it.hasNext()) {
                    this.f74948b.subscribe(new a(rVar, it, this.f74950d));
                } else {
                    EmptyDisposable.complete(rVar);
                }
            } catch (Throwable th2) {
                ni.a.b(th2);
                EmptyDisposable.error(th2, rVar);
            }
        } catch (Throwable th3) {
            ni.a.b(th3);
            EmptyDisposable.error(th3, rVar);
        }
    }

    public x1(ii.k<? extends T> kVar, Iterable<U> iterable, oi.c<? super T, ? super U, ? extends V> cVar) {
        this.f74948b = kVar;
        this.f74949c = iterable;
        this.f74950d = cVar;
    }
}
