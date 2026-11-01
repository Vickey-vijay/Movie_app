package xi;

import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.Collection;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: ObservableDistinct.java */
/* JADX INFO: loaded from: classes9.dex */
public final class w<T, K> extends xi.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final oi.o<? super T, K> f74885c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Callable<? extends Collection<? super K>> f74886d;

    /* JADX INFO: compiled from: ObservableDistinct.java */
    public static final class a<T, K> extends si.a<T, T> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Collection<? super K> f74887g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final oi.o<? super T, K> f74888h;

        @Override // si.a, ri.h
        public void clear() {
            this.f74887g.clear();
            super.clear();
        }

        @Override // si.a, ii.r
        public void onComplete() {
            if (this.f71909e) {
                return;
            }
            this.f71909e = true;
            this.f74887g.clear();
            this.f71906b.onComplete();
        }

        @Override // si.a, ii.r
        public void onError(Throwable th2) {
            if (this.f71909e) {
                ej.a.s(th2);
                return;
            }
            this.f71909e = true;
            this.f74887g.clear();
            this.f71906b.onError(th2);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // ii.r
        public void onNext(T t10) {
            if (this.f71909e) {
                return;
            }
            if (this.f71910f != 0) {
                this.f71906b.onNext(null);
                return;
            }
            try {
                if (this.f74887g.add(qi.a.e(this.f74888h.apply(t10), "The keySelector returned a null key"))) {
                    this.f71906b.onNext((Object) t10);
                }
            } catch (Throwable th2) {
                c(th2);
            }
        }

        @Override // ri.h
        public T poll() throws Exception {
            T tPoll;
            do {
                tPoll = this.f71908d.poll();
                if (tPoll == null) {
                    break;
                }
            } while (!this.f74887g.add((Object) qi.a.e(this.f74888h.apply(tPoll), "The keySelector returned a null key")));
            return tPoll;
        }

        public a(ii.r<? super T> rVar, oi.o<? super T, K> oVar, Collection<? super K> collection) {
            super(rVar);
            this.f74888h = oVar;
            this.f74887g = collection;
        }

        @Override // ri.d
        public int requestFusion(int i10) {
            return d(i10);
        }
    }

    @Override // ii.k
    public void subscribeActual(ii.r<? super T> rVar) {
        try {
            this.f74487b.subscribe(new a(rVar, this.f74885c, (Collection) qi.a.e(this.f74886d.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th2) {
            ni.a.b(th2);
            EmptyDisposable.error(th2, rVar);
        }
    }

    public w(ii.p<T> pVar, oi.o<? super T, K> oVar, Callable<? extends Collection<? super K>> callable) {
        super(pVar);
        this.f74885c = oVar;
        this.f74886d = callable;
    }
}
