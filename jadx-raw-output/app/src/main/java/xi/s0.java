package xi;

import io.reactivex.internal.functions.Functions;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: ObservableInternalHelper.java */
/* JADX INFO: loaded from: classes11.dex */
public final class s0 {

    /* JADX INFO: compiled from: ObservableInternalHelper.java */
    public static final class a<T> implements Callable<cj.a<T>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ii.k<T> f74803b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f74804c;

        @Override // java.util.concurrent.Callable
        public cj.a<T> call() {
            return this.f74803b.replay(this.f74804c);
        }

        public a(ii.k<T> kVar, int i10) {
            this.f74803b = kVar;
            this.f74804c = i10;
        }
    }

    /* JADX INFO: compiled from: ObservableInternalHelper.java */
    public static final class b<T> implements Callable<cj.a<T>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ii.k<T> f74805b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f74806c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f74807d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final TimeUnit f74808e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final ii.s f74809f;

        @Override // java.util.concurrent.Callable
        public cj.a<T> call() {
            return this.f74805b.replay(this.f74806c, this.f74807d, this.f74808e, this.f74809f);
        }

        public b(ii.k<T> kVar, int i10, long j10, TimeUnit timeUnit, ii.s sVar) {
            this.f74805b = kVar;
            this.f74806c = i10;
            this.f74807d = j10;
            this.f74808e = timeUnit;
            this.f74809f = sVar;
        }
    }

    /* JADX INFO: compiled from: ObservableInternalHelper.java */
    public static final class c<T, U> implements oi.o<T, ii.p<U>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final oi.o<? super T, ? extends Iterable<? extends U>> f74810b;

        @Override // oi.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ii.p<U> apply(T t10) throws Exception {
            return new l0((Iterable) qi.a.e(this.f74810b.apply(t10), "The mapper returned a null Iterable"));
        }

        public c(oi.o<? super T, ? extends Iterable<? extends U>> oVar) {
            this.f74810b = oVar;
        }
    }

    /* JADX INFO: compiled from: ObservableInternalHelper.java */
    public static final class d<U, R, T> implements oi.o<U, R> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final oi.c<? super T, ? super U, ? extends R> f74811b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final T f74812c;

        @Override // oi.o
        public R apply(U u10) throws Exception {
            return this.f74811b.apply(this.f74812c, u10);
        }

        public d(oi.c<? super T, ? super U, ? extends R> cVar, T t10) {
            this.f74811b = cVar;
            this.f74812c = t10;
        }
    }

    /* JADX INFO: compiled from: ObservableInternalHelper.java */
    public static final class e<T, R, U> implements oi.o<T, ii.p<R>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final oi.c<? super T, ? super U, ? extends R> f74813b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final oi.o<? super T, ? extends ii.p<? extends U>> f74814c;

        @Override // oi.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ii.p<R> apply(T t10) throws Exception {
            return new w0((ii.p) qi.a.e(this.f74814c.apply(t10), "The mapper returned a null ObservableSource"), new d(this.f74813b, t10));
        }

        public e(oi.c<? super T, ? super U, ? extends R> cVar, oi.o<? super T, ? extends ii.p<? extends U>> oVar) {
            this.f74813b = cVar;
            this.f74814c = oVar;
        }
    }

    /* JADX INFO: compiled from: ObservableInternalHelper.java */
    public static final class f<T, U> implements oi.o<T, ii.p<T>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final oi.o<? super T, ? extends ii.p<U>> f74815b;

        @Override // oi.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ii.p<T> apply(T t10) throws Exception {
            return new o1((ii.p) qi.a.e(this.f74815b.apply(t10), "The itemDelay returned a null ObservableSource"), 1L).map(Functions.l(t10)).defaultIfEmpty(t10);
        }

        public f(oi.o<? super T, ? extends ii.p<U>> oVar) {
            this.f74815b = oVar;
        }
    }

    /* JADX INFO: compiled from: ObservableInternalHelper.java */
    public static final class g<T> implements oi.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ii.r<T> f74816b;

        @Override // oi.a
        public void run() throws Exception {
            this.f74816b.onComplete();
        }

        public g(ii.r<T> rVar) {
            this.f74816b = rVar;
        }
    }

    /* JADX INFO: compiled from: ObservableInternalHelper.java */
    public static final class h<T> implements oi.g<Throwable> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ii.r<T> f74817b;

        @Override // oi.g
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Throwable th2) throws Exception {
            this.f74817b.onError(th2);
        }

        public h(ii.r<T> rVar) {
            this.f74817b = rVar;
        }
    }

    /* JADX INFO: compiled from: ObservableInternalHelper.java */
    public static final class i<T> implements oi.g<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ii.r<T> f74818b;

        @Override // oi.g
        public void accept(T t10) throws Exception {
            this.f74818b.onNext(t10);
        }

        public i(ii.r<T> rVar) {
            this.f74818b = rVar;
        }
    }

    /* JADX INFO: compiled from: ObservableInternalHelper.java */
    public static final class j<T> implements Callable<cj.a<T>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ii.k<T> f74819b;

        @Override // java.util.concurrent.Callable
        public cj.a<T> call() {
            return this.f74819b.replay();
        }

        public j(ii.k<T> kVar) {
            this.f74819b = kVar;
        }
    }

    /* JADX INFO: compiled from: ObservableInternalHelper.java */
    public static final class k<T, R> implements oi.o<ii.k<T>, ii.p<R>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final oi.o<? super ii.k<T>, ? extends ii.p<R>> f74820b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ii.s f74821c;

        @Override // oi.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ii.p<R> apply(ii.k<T> kVar) throws Exception {
            return ii.k.wrap((ii.p) qi.a.e(this.f74820b.apply(kVar), "The selector returned a null ObservableSource")).observeOn(this.f74821c);
        }

        public k(oi.o<? super ii.k<T>, ? extends ii.p<R>> oVar, ii.s sVar) {
            this.f74820b = oVar;
            this.f74821c = sVar;
        }
    }

    /* JADX INFO: compiled from: ObservableInternalHelper.java */
    public static final class l<T, S> implements oi.c<S, ii.d<T>, S> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final oi.b<S, ii.d<T>> f74822a;

        @Override // oi.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public S apply(S s10, ii.d<T> dVar) throws Exception {
            this.f74822a.accept(s10, dVar);
            return s10;
        }

        public l(oi.b<S, ii.d<T>> bVar) {
            this.f74822a = bVar;
        }
    }

    /* JADX INFO: compiled from: ObservableInternalHelper.java */
    public static final class m<T, S> implements oi.c<S, ii.d<T>, S> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final oi.g<ii.d<T>> f74823a;

        @Override // oi.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public S apply(S s10, ii.d<T> dVar) throws Exception {
            this.f74823a.accept(dVar);
            return s10;
        }

        public m(oi.g<ii.d<T>> gVar) {
            this.f74823a = gVar;
        }
    }

    /* JADX INFO: compiled from: ObservableInternalHelper.java */
    public static final class n<T> implements Callable<cj.a<T>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ii.k<T> f74824b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f74825c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final TimeUnit f74826d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ii.s f74827e;

        @Override // java.util.concurrent.Callable
        public cj.a<T> call() {
            return this.f74824b.replay(this.f74825c, this.f74826d, this.f74827e);
        }

        public n(ii.k<T> kVar, long j10, TimeUnit timeUnit, ii.s sVar) {
            this.f74824b = kVar;
            this.f74825c = j10;
            this.f74826d = timeUnit;
            this.f74827e = sVar;
        }
    }

    /* JADX INFO: compiled from: ObservableInternalHelper.java */
    public static final class o<T, R> implements oi.o<List<ii.p<? extends T>>, ii.p<? extends R>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final oi.o<? super Object[], ? extends R> f74828b;

        @Override // oi.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ii.p<? extends R> apply(List<ii.p<? extends T>> list) {
            return ii.k.zipIterable(list, this.f74828b, false, ii.k.bufferSize());
        }

        public o(oi.o<? super Object[], ? extends R> oVar) {
            this.f74828b = oVar;
        }
    }

    public static <T, U> oi.o<T, ii.p<U>> a(oi.o<? super T, ? extends Iterable<? extends U>> oVar) {
        return new c(oVar);
    }

    public static <T, U, R> oi.o<T, ii.p<R>> b(oi.o<? super T, ? extends ii.p<? extends U>> oVar, oi.c<? super T, ? super U, ? extends R> cVar) {
        return new e(cVar, oVar);
    }

    public static <T, U> oi.o<T, ii.p<T>> c(oi.o<? super T, ? extends ii.p<U>> oVar) {
        return new f(oVar);
    }

    public static <T> oi.a d(ii.r<T> rVar) {
        return new g(rVar);
    }

    public static <T> oi.g<Throwable> e(ii.r<T> rVar) {
        return new h(rVar);
    }

    public static <T> oi.g<T> f(ii.r<T> rVar) {
        return new i(rVar);
    }

    public static <T> Callable<cj.a<T>> g(ii.k<T> kVar) {
        return new j(kVar);
    }

    public static <T> Callable<cj.a<T>> h(ii.k<T> kVar, int i10) {
        return new a(kVar, i10);
    }

    public static <T> Callable<cj.a<T>> i(ii.k<T> kVar, int i10, long j10, TimeUnit timeUnit, ii.s sVar) {
        return new b(kVar, i10, j10, timeUnit, sVar);
    }

    public static <T> Callable<cj.a<T>> j(ii.k<T> kVar, long j10, TimeUnit timeUnit, ii.s sVar) {
        return new n(kVar, j10, timeUnit, sVar);
    }

    public static <T, R> oi.o<ii.k<T>, ii.p<R>> k(oi.o<? super ii.k<T>, ? extends ii.p<R>> oVar, ii.s sVar) {
        return new k(oVar, sVar);
    }

    public static <T, S> oi.c<S, ii.d<T>, S> l(oi.b<S, ii.d<T>> bVar) {
        return new l(bVar);
    }

    public static <T, S> oi.c<S, ii.d<T>, S> m(oi.g<ii.d<T>> gVar) {
        return new m(gVar);
    }

    public static <T, R> oi.o<List<ii.p<? extends T>>, ii.p<? extends R>> n(oi.o<? super Object[], ? extends R> oVar) {
        return new o(oVar);
    }
}
