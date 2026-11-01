package xi;

import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.Iterator;

/* JADX INFO: compiled from: ObservableFromIterable.java */
/* JADX INFO: loaded from: classes10.dex */
public final class l0<T> extends ii.k<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterable<? extends T> f74686b;

    /* JADX INFO: compiled from: ObservableFromIterable.java */
    public static final class a<T> extends si.b<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ii.r<? super T> f74687b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Iterator<? extends T> f74688c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public volatile boolean f74689d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f74690e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f74691f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f74692g;

        @Override // ri.h
        public void clear() {
            this.f74691f = true;
        }

        @Override // mi.b
        public void dispose() {
            this.f74689d = true;
        }

        @Override // ri.d
        public int requestFusion(int i10) {
            if ((i10 & 1) == 0) {
                return 0;
            }
            this.f74690e = true;
            return 1;
        }

        @Override // mi.b
        public boolean isDisposed() {
            return this.f74689d;
        }

        @Override // ri.h
        public boolean isEmpty() {
            return this.f74691f;
        }

        @Override // ri.h
        public T poll() {
            if (this.f74691f) {
                return null;
            }
            if (!this.f74692g) {
                this.f74692g = true;
            } else if (!this.f74688c.hasNext()) {
                this.f74691f = true;
                return null;
            }
            return (T) qi.a.e(this.f74688c.next(), "The iterator returned a null value");
        }

        public a(ii.r<? super T> rVar, Iterator<? extends T> it) {
            this.f74687b = rVar;
            this.f74688c = it;
        }

        public void a() {
            while (!isDisposed()) {
                try {
                    this.f74687b.onNext(qi.a.e(this.f74688c.next(), "The iterator returned a null value"));
                    if (isDisposed()) {
                        return;
                    }
                    try {
                        if (!this.f74688c.hasNext()) {
                            if (!isDisposed()) {
                                this.f74687b.onComplete();
                                return;
                            }
                            return;
                        }
                    } catch (Throwable th2) {
                        ni.a.b(th2);
                        this.f74687b.onError(th2);
                        return;
                    }
                } catch (Throwable th3) {
                    ni.a.b(th3);
                    this.f74687b.onError(th3);
                    return;
                }
            }
        }
    }

    @Override // ii.k
    public void subscribeActual(ii.r<? super T> rVar) {
        try {
            Iterator<? extends T> it = this.f74686b.iterator();
            try {
                if (!it.hasNext()) {
                    EmptyDisposable.complete(rVar);
                    return;
                }
                a aVar = new a(rVar, it);
                rVar.onSubscribe(aVar);
                if (aVar.f74690e) {
                    return;
                }
                aVar.a();
            } catch (Throwable th2) {
                ni.a.b(th2);
                EmptyDisposable.error(th2, rVar);
            }
        } catch (Throwable th3) {
            ni.a.b(th3);
            EmptyDisposable.error(th3, rVar);
        }
    }

    public l0(Iterable<? extends T> iterable) {
        this.f74686b = iterable;
    }
}
