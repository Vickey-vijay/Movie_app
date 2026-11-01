package ii;

import io.reactivex.BackpressureStrategy;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.observers.ForEachWhileObserver;
import io.reactivex.internal.observers.LambdaObserver;
import io.reactivex.internal.operators.flowable.FlowableOnBackpressureError;
import io.reactivex.internal.operators.mixed.ObservableConcatMapCompletable;
import io.reactivex.internal.operators.mixed.ObservableConcatMapMaybe;
import io.reactivex.internal.operators.mixed.ObservableConcatMapSingle;
import io.reactivex.internal.operators.mixed.ObservableSwitchMapCompletable;
import io.reactivex.internal.operators.mixed.ObservableSwitchMapMaybe;
import io.reactivex.internal.operators.mixed.ObservableSwitchMapSingle;
import io.reactivex.internal.operators.observable.BlockingObservableIterable;
import io.reactivex.internal.operators.observable.ObservableAmb;
import io.reactivex.internal.operators.observable.ObservableBuffer;
import io.reactivex.internal.operators.observable.ObservableBufferBoundary;
import io.reactivex.internal.operators.observable.ObservableCache;
import io.reactivex.internal.operators.observable.ObservableCombineLatest;
import io.reactivex.internal.operators.observable.ObservableConcatMap;
import io.reactivex.internal.operators.observable.ObservableConcatMapEager;
import io.reactivex.internal.operators.observable.ObservableConcatWithCompletable;
import io.reactivex.internal.operators.observable.ObservableConcatWithMaybe;
import io.reactivex.internal.operators.observable.ObservableConcatWithSingle;
import io.reactivex.internal.operators.observable.ObservableCreate;
import io.reactivex.internal.operators.observable.ObservableDebounceTimed;
import io.reactivex.internal.operators.observable.ObservableDoFinally;
import io.reactivex.internal.operators.observable.ObservableFlatMap;
import io.reactivex.internal.operators.observable.ObservableFlatMapCompletableCompletable;
import io.reactivex.internal.operators.observable.ObservableFlatMapMaybe;
import io.reactivex.internal.operators.observable.ObservableFlatMapSingle;
import io.reactivex.internal.operators.observable.ObservableGroupBy;
import io.reactivex.internal.operators.observable.ObservableGroupJoin;
import io.reactivex.internal.operators.observable.ObservableInterval;
import io.reactivex.internal.operators.observable.ObservableIntervalRange;
import io.reactivex.internal.operators.observable.ObservableJoin;
import io.reactivex.internal.operators.observable.ObservableMergeWithCompletable;
import io.reactivex.internal.operators.observable.ObservableMergeWithMaybe;
import io.reactivex.internal.operators.observable.ObservableMergeWithSingle;
import io.reactivex.internal.operators.observable.ObservableObserveOn;
import io.reactivex.internal.operators.observable.ObservablePublish;
import io.reactivex.internal.operators.observable.ObservablePublishSelector;
import io.reactivex.internal.operators.observable.ObservableRange;
import io.reactivex.internal.operators.observable.ObservableRangeLong;
import io.reactivex.internal.operators.observable.ObservableRepeat;
import io.reactivex.internal.operators.observable.ObservableRepeatUntil;
import io.reactivex.internal.operators.observable.ObservableRepeatWhen;
import io.reactivex.internal.operators.observable.ObservableReplay;
import io.reactivex.internal.operators.observable.ObservableRetryBiPredicate;
import io.reactivex.internal.operators.observable.ObservableRetryPredicate;
import io.reactivex.internal.operators.observable.ObservableRetryWhen;
import io.reactivex.internal.operators.observable.ObservableSampleTimed;
import io.reactivex.internal.operators.observable.ObservableSampleWithObservable;
import io.reactivex.internal.operators.observable.ObservableScalarXMap;
import io.reactivex.internal.operators.observable.ObservableSequenceEqualSingle;
import io.reactivex.internal.operators.observable.ObservableSkipLast;
import io.reactivex.internal.operators.observable.ObservableSkipLastTimed;
import io.reactivex.internal.operators.observable.ObservableSubscribeOn;
import io.reactivex.internal.operators.observable.ObservableSwitchMap;
import io.reactivex.internal.operators.observable.ObservableTakeLast;
import io.reactivex.internal.operators.observable.ObservableTakeLastTimed;
import io.reactivex.internal.operators.observable.ObservableTakeUntil;
import io.reactivex.internal.operators.observable.ObservableThrottleFirstTimed;
import io.reactivex.internal.operators.observable.ObservableThrottleLatest;
import io.reactivex.internal.operators.observable.ObservableTimeout;
import io.reactivex.internal.operators.observable.ObservableTimeoutTimed;
import io.reactivex.internal.operators.observable.ObservableTimer;
import io.reactivex.internal.operators.observable.ObservableUnsubscribeOn;
import io.reactivex.internal.operators.observable.ObservableUsing;
import io.reactivex.internal.operators.observable.ObservableWindow;
import io.reactivex.internal.operators.observable.ObservableWindowBoundary;
import io.reactivex.internal.operators.observable.ObservableWindowBoundarySupplier;
import io.reactivex.internal.operators.observable.ObservableWithLatestFrom;
import io.reactivex.internal.operators.observable.ObservableWithLatestFromMany;
import io.reactivex.internal.operators.observable.ObservableZip;
import io.reactivex.internal.util.ArrayListSupplier;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.HashMapSupplier;
import io.reactivex.observers.TestObserver;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import xi.a0;
import xi.a1;
import xi.b1;
import xi.c0;
import xi.c1;
import xi.d0;
import xi.d1;
import xi.e0;
import xi.e1;
import xi.f0;
import xi.f1;
import xi.g0;
import xi.g1;
import xi.h0;
import xi.h1;
import xi.i0;
import xi.i1;
import xi.j0;
import xi.j1;
import xi.k0;
import xi.k1;
import xi.l0;
import xi.l1;
import xi.m0;
import xi.m1;
import xi.n0;
import xi.n1;
import xi.o0;
import xi.o1;
import xi.p0;
import xi.p1;
import xi.q0;
import xi.q1;
import xi.r0;
import xi.r1;
import xi.s0;
import xi.s1;
import xi.t0;
import xi.t1;
import xi.u0;
import xi.u1;
import xi.v0;
import xi.v1;
import xi.w0;
import xi.w1;
import xi.x;
import xi.x0;
import xi.x1;
import xi.y;
import xi.y0;
import xi.z;
import xi.z0;

/* JADX INFO: compiled from: Observable.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class k<T> implements p<T> {
    public static <T, R> k<R> combineLatest(oi.o<? super Object[], ? extends R> oVar, int i10, p<? extends T>... pVarArr) {
        return combineLatest(pVarArr, oVar, i10);
    }

    public static <T, R> k<R> combineLatestDelayError(p<? extends T>[] pVarArr, oi.o<? super Object[], ? extends R> oVar) {
        return combineLatestDelayError(pVarArr, oVar, bufferSize());
    }

    public static <T> k<T> concat(Iterable<? extends p<? extends T>> iterable) {
        qi.a.e(iterable, "sources is null");
        return fromIterable(iterable).concatMapDelayError(Functions.i(), bufferSize(), false);
    }

    public static <T> k<T> concatArray(p<? extends T>... pVarArr) {
        if (pVarArr.length == 0) {
            return empty();
        }
        return pVarArr.length == 1 ? wrap(pVarArr[0]) : ej.a.o(new ObservableConcatMap(fromArray(pVarArr), Functions.i(), bufferSize(), ErrorMode.BOUNDARY));
    }

    public static <T> k<T> concatArrayDelayError(p<? extends T>... pVarArr) {
        if (pVarArr.length == 0) {
            return empty();
        }
        return pVarArr.length == 1 ? wrap(pVarArr[0]) : concatDelayError(fromArray(pVarArr));
    }

    public static <T> k<T> concatArrayEager(p<? extends T>... pVarArr) {
        return concatArrayEager(bufferSize(), bufferSize(), pVarArr);
    }

    public static <T> k<T> concatArrayEagerDelayError(p<? extends T>... pVarArr) {
        return concatArrayEagerDelayError(bufferSize(), bufferSize(), pVarArr);
    }

    public static <T> k<T> concatDelayError(Iterable<? extends p<? extends T>> iterable) {
        qi.a.e(iterable, "sources is null");
        return concatDelayError(fromIterable(iterable));
    }

    public static <T> k<T> concatEager(p<? extends p<? extends T>> pVar) {
        return concatEager(pVar, bufferSize(), bufferSize());
    }

    private k<T> doOnEach(oi.g<? super T> gVar, oi.g<? super Throwable> gVar2, oi.a aVar, oi.a aVar2) {
        qi.a.e(gVar, "onNext is null");
        qi.a.e(gVar2, "onError is null");
        qi.a.e(aVar, "onComplete is null");
        qi.a.e(aVar2, "onAfterTerminate is null");
        return ej.a.o(new z(this, gVar, gVar2, aVar, aVar2));
    }

    public static <T> k<T> error(Callable<? extends Throwable> callable) {
        qi.a.e(callable, "errorSupplier is null");
        return ej.a.o(new f0(callable));
    }

    public static <T> k<T> fromFuture(Future<? extends T> future) {
        qi.a.e(future, "future is null");
        return ej.a.o(new k0(future, 0L, null));
    }

    public static <T> k<T> generate(oi.g<d<T>> gVar) {
        qi.a.e(gVar, "generator  is null");
        return generate(Functions.s(), s0.m(gVar), Functions.g());
    }

    public static k<Long> interval(long j10, long j11, TimeUnit timeUnit) {
        return interval(j10, j11, timeUnit, gj.a.a());
    }

    public static k<Long> intervalRange(long j10, long j11, long j12, long j13, TimeUnit timeUnit) {
        return intervalRange(j10, j11, j12, j13, timeUnit, gj.a.a());
    }

    public static <T> k<T> just(T t10) {
        qi.a.e(t10, "The item is null");
        return ej.a.o(new io.reactivex.internal.operators.observable.a(t10));
    }

    public static <T> k<T> merge(Iterable<? extends p<? extends T>> iterable, int i10, int i11) {
        return fromIterable(iterable).flatMap(Functions.i(), false, i10, i11);
    }

    public static <T> k<T> mergeArray(int i10, int i11, p<? extends T>... pVarArr) {
        return fromArray(pVarArr).flatMap(Functions.i(), false, i10, i11);
    }

    public static <T> k<T> mergeArrayDelayError(int i10, int i11, p<? extends T>... pVarArr) {
        return fromArray(pVarArr).flatMap(Functions.i(), true, i10, i11);
    }

    public static <T> k<T> mergeDelayError(Iterable<? extends p<? extends T>> iterable) {
        return fromIterable(iterable).flatMap(Functions.i(), true);
    }

    public static <T> t<Boolean> sequenceEqual(p<? extends T> pVar, p<? extends T> pVar2) {
        return sequenceEqual(pVar, pVar2, qi.a.d(), bufferSize());
    }

    public static <T> k<T> switchOnNext(p<? extends p<? extends T>> pVar, int i10) {
        qi.a.e(pVar, "sources is null");
        qi.a.f(i10, "bufferSize");
        return ej.a.o(new ObservableSwitchMap(pVar, Functions.i(), i10, false));
    }

    public static <T> k<T> switchOnNextDelayError(p<? extends p<? extends T>> pVar) {
        return switchOnNextDelayError(pVar, bufferSize());
    }

    private k<T> timeout0(long j10, TimeUnit timeUnit, p<? extends T> pVar, s sVar) {
        qi.a.e(timeUnit, "timeUnit is null");
        qi.a.e(sVar, "scheduler is null");
        return ej.a.o(new ObservableTimeoutTimed(this, j10, timeUnit, sVar, pVar));
    }

    public static k<Long> timer(long j10, TimeUnit timeUnit) {
        return timer(j10, timeUnit, gj.a.a());
    }

    public static <T, D> k<T> using(Callable<? extends D> callable, oi.o<? super D, ? extends p<? extends T>> oVar, oi.g<? super D> gVar) {
        return using(callable, oVar, gVar, true);
    }

    public static <T, R> k<R> zip(Iterable<? extends p<? extends T>> iterable, oi.o<? super Object[], ? extends R> oVar) {
        qi.a.e(oVar, "zipper is null");
        qi.a.e(iterable, "sources is null");
        return ej.a.o(new ObservableZip(null, iterable, oVar, bufferSize(), false));
    }

    public static <T, R> k<R> zipArray(oi.o<? super Object[], ? extends R> oVar, boolean z10, int i10, p<? extends T>... pVarArr) {
        if (pVarArr.length == 0) {
            return empty();
        }
        qi.a.e(oVar, "zipper is null");
        qi.a.f(i10, "bufferSize");
        return ej.a.o(new ObservableZip(pVarArr, null, oVar, i10, z10));
    }

    public final T blockingFirst() {
        si.d dVar = new si.d();
        subscribe(dVar);
        T tA = dVar.a();
        if (tA != null) {
            return tA;
        }
        throw new NoSuchElementException();
    }

    public final Iterable<T> blockingIterable() {
        return blockingIterable(bufferSize());
    }

    public final T blockingLast() {
        si.e eVar = new si.e();
        subscribe(eVar);
        T tA = eVar.a();
        if (tA != null) {
            return tA;
        }
        throw new NoSuchElementException();
    }

    public final T blockingSingle() {
        T tC = singleElement().c();
        if (tC != null) {
            return tC;
        }
        throw new NoSuchElementException();
    }

    public final void blockingSubscribe() {
        xi.i.a(this);
    }

    public final k<List<T>> buffer(int i10) {
        return buffer(i10, i10);
    }

    public final <R> k<R> concatMap(oi.o<? super T, ? extends p<? extends R>> oVar) {
        return concatMap(oVar, 2);
    }

    public final ii.a concatMapCompletable(oi.o<? super T, ? extends c> oVar) {
        return concatMapCompletable(oVar, 2);
    }

    public final ii.a concatMapCompletableDelayError(oi.o<? super T, ? extends c> oVar) {
        return concatMapCompletableDelayError(oVar, true, 2);
    }

    public final <R> k<R> concatMapDelayError(oi.o<? super T, ? extends p<? extends R>> oVar) {
        return concatMapDelayError(oVar, bufferSize(), true);
    }

    public final <R> k<R> concatMapEager(oi.o<? super T, ? extends p<? extends R>> oVar) {
        return concatMapEager(oVar, Integer.MAX_VALUE, bufferSize());
    }

    public final <R> k<R> concatMapEagerDelayError(oi.o<? super T, ? extends p<? extends R>> oVar, boolean z10) {
        return concatMapEagerDelayError(oVar, Integer.MAX_VALUE, bufferSize(), z10);
    }

    public final <U> k<U> concatMapIterable(oi.o<? super T, ? extends Iterable<? extends U>> oVar) {
        qi.a.e(oVar, "mapper is null");
        return ej.a.o(new h0(this, oVar));
    }

    public final <R> k<R> concatMapMaybe(oi.o<? super T, ? extends i<? extends R>> oVar) {
        return concatMapMaybe(oVar, 2);
    }

    public final <R> k<R> concatMapMaybeDelayError(oi.o<? super T, ? extends i<? extends R>> oVar) {
        return concatMapMaybeDelayError(oVar, true, 2);
    }

    public final <R> k<R> concatMapSingle(oi.o<? super T, ? extends v<? extends R>> oVar) {
        return concatMapSingle(oVar, 2);
    }

    public final <R> k<R> concatMapSingleDelayError(oi.o<? super T, ? extends v<? extends R>> oVar) {
        return concatMapSingleDelayError(oVar, true, 2);
    }

    public final k<T> concatWith(p<? extends T> pVar) {
        qi.a.e(pVar, "other is null");
        return concat(this, pVar);
    }

    public final <U> k<T> debounce(oi.o<? super T, ? extends p<U>> oVar) {
        qi.a.e(oVar, "debounceSelector is null");
        return ej.a.o(new xi.q(this, oVar));
    }

    public final <U> k<T> delay(oi.o<? super T, ? extends p<U>> oVar) {
        qi.a.e(oVar, "itemDelay is null");
        return (k<T>) flatMap(s0.c(oVar));
    }

    public final <U> k<T> delaySubscription(p<U> pVar) {
        qi.a.e(pVar, "other is null");
        return ej.a.o(new xi.t(this, pVar));
    }

    public final k<T> distinct() {
        return distinct(Functions.i(), Functions.f());
    }

    public final k<T> distinctUntilChanged() {
        return distinctUntilChanged(Functions.i());
    }

    public final g<T> elementAt(long j10) {
        if (j10 >= 0) {
            return ej.a.n(new c0(this, j10));
        }
        throw new IndexOutOfBoundsException("index >= 0 required but it was " + j10);
    }

    public final <R> k<R> flatMap(oi.o<? super T, ? extends p<? extends R>> oVar) {
        return flatMap((oi.o) oVar, false);
    }

    public final ii.a flatMapCompletable(oi.o<? super T, ? extends c> oVar) {
        return flatMapCompletable(oVar, false);
    }

    public final <U> k<U> flatMapIterable(oi.o<? super T, ? extends Iterable<? extends U>> oVar) {
        qi.a.e(oVar, "mapper is null");
        return ej.a.o(new h0(this, oVar));
    }

    public final <R> k<R> flatMapMaybe(oi.o<? super T, ? extends i<? extends R>> oVar) {
        return flatMapMaybe(oVar, false);
    }

    public final <R> k<R> flatMapSingle(oi.o<? super T, ? extends v<? extends R>> oVar) {
        return flatMapSingle(oVar, false);
    }

    public final mi.b forEachWhile(oi.q<? super T> qVar) {
        return forEachWhile(qVar, Functions.f61034f, Functions.f61031c);
    }

    public final <K> k<cj.b<K, T>> groupBy(oi.o<? super T, ? extends K> oVar) {
        return (k<cj.b<K, T>>) groupBy(oVar, Functions.i(), false, bufferSize());
    }

    public final k<T> mergeWith(p<? extends T> pVar) {
        qi.a.e(pVar, "other is null");
        return merge(this, pVar);
    }

    public final k<T> observeOn(s sVar) {
        return observeOn(sVar, false, bufferSize());
    }

    public final k<T> onErrorResumeNext(oi.o<? super Throwable, ? extends p<? extends T>> oVar) {
        qi.a.e(oVar, "resumeFunction is null");
        return ej.a.o(new a1(this, oVar, false));
    }

    public final cj.a<T> publish() {
        return ObservablePublish.d(this);
    }

    public final g<T> reduce(oi.c<T, T, T> cVar) {
        qi.a.e(cVar, "reducer is null");
        return ej.a.n(new c1(this, cVar));
    }

    public final k<T> repeat() {
        return repeat(Long.MAX_VALUE);
    }

    public final cj.a<T> replay() {
        return ObservableReplay.h(this);
    }

    public final k<T> retry() {
        return retry(Long.MAX_VALUE, Functions.c());
    }

    public final k<T> sample(long j10, TimeUnit timeUnit) {
        return sample(j10, timeUnit, gj.a.a());
    }

    public final k<T> scan(oi.c<T, T, T> cVar) {
        qi.a.e(cVar, "accumulator is null");
        return ej.a.o(new f1(this, cVar));
    }

    public final k<T> skip(long j10) {
        return j10 <= 0 ? ej.a.o(this) : ej.a.o(new k1(this, j10));
    }

    public final k<T> skipLast(int i10) {
        if (i10 >= 0) {
            return i10 == 0 ? ej.a.o(this) : ej.a.o(new ObservableSkipLast(this, i10));
        }
        throw new IndexOutOfBoundsException("count >= 0 required but it was " + i10);
    }

    public final k<T> sorted() {
        return toList().r().map(Functions.m(Functions.n())).flatMapIterable(Functions.i());
    }

    public final k<T> startWith(Iterable<? extends T> iterable) {
        return concatArray(fromIterable(iterable), this);
    }

    public final mi.b subscribe() {
        return subscribe(Functions.g(), Functions.f61034f, Functions.f61031c, Functions.g());
    }

    public abstract void subscribeActual(r<? super T> rVar);

    public final <R> k<R> switchMap(oi.o<? super T, ? extends p<? extends R>> oVar) {
        return switchMap(oVar, bufferSize());
    }

    public final <R> k<R> switchMapDelayError(oi.o<? super T, ? extends p<? extends R>> oVar) {
        return switchMapDelayError(oVar, bufferSize());
    }

    public final k<T> take(long j10) {
        if (j10 >= 0) {
            return ej.a.o(new o1(this, j10));
        }
        throw new IllegalArgumentException("count >= 0 required but it was " + j10);
    }

    public final k<T> takeLast(int i10) {
        if (i10 >= 0) {
            if (i10 == 0) {
                return ej.a.o(new q0(this));
            }
            return i10 == 1 ? ej.a.o(new p1(this)) : ej.a.o(new ObservableTakeLast(this, i10));
        }
        throw new IndexOutOfBoundsException("count >= 0 required but it was " + i10);
    }

    public final <U> k<T> takeUntil(p<U> pVar) {
        qi.a.e(pVar, "other is null");
        return ej.a.o(new ObservableTakeUntil(this, pVar));
    }

    public final TestObserver<T> test() {
        TestObserver<T> testObserver = new TestObserver<>();
        subscribe(testObserver);
        return testObserver;
    }

    public final k<T> throttleFirst(long j10, TimeUnit timeUnit) {
        return throttleFirst(j10, timeUnit, gj.a.a());
    }

    public final k<T> throttleLast(long j10, TimeUnit timeUnit) {
        return sample(j10, timeUnit);
    }

    public final k<T> throttleLatest(long j10, TimeUnit timeUnit) {
        return throttleLatest(j10, timeUnit, gj.a.a(), false);
    }

    public final k<T> throttleWithTimeout(long j10, TimeUnit timeUnit) {
        return debounce(j10, timeUnit);
    }

    public final k<gj.b<T>> timeInterval() {
        return timeInterval(TimeUnit.MILLISECONDS, gj.a.a());
    }

    public final <V> k<T> timeout(oi.o<? super T, ? extends p<V>> oVar) {
        return timeout0(null, oVar, null);
    }

    public final k<gj.b<T>> timestamp() {
        return timestamp(TimeUnit.MILLISECONDS, gj.a.a());
    }

    public final t<List<T>> toList() {
        return toList(16);
    }

    public final <K> t<Map<K, T>> toMap(oi.o<? super T, ? extends K> oVar) {
        qi.a.e(oVar, "keySelector is null");
        return (t<Map<K, T>>) collect(HashMapSupplier.asCallable(), Functions.D(oVar));
    }

    public final <K> t<Map<K, Collection<T>>> toMultimap(oi.o<? super T, ? extends K> oVar) {
        return (t<Map<K, Collection<T>>>) toMultimap(oVar, Functions.i(), HashMapSupplier.asCallable(), ArrayListSupplier.asFunction());
    }

    public final t<List<T>> toSortedList() {
        return toSortedList(Functions.o());
    }

    public final k<k<T>> window(long j10) {
        return window(j10, j10, bufferSize());
    }

    public final <U, R> k<R> withLatestFrom(p<? extends U> pVar, oi.c<? super T, ? super U, ? extends R> cVar) {
        qi.a.e(pVar, "other is null");
        qi.a.e(cVar, "combiner is null");
        return ej.a.o(new ObservableWithLatestFrom(this, cVar, pVar));
    }

    public final <U, R> k<R> zipWith(Iterable<U> iterable, oi.c<? super T, ? super U, ? extends R> cVar) {
        qi.a.e(iterable, "other is null");
        qi.a.e(cVar, "zipper is null");
        return ej.a.o(new x1(this, iterable, cVar));
    }

    /* JADX INFO: compiled from: Observable.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f54179a;

        static {
            int[] iArr = new int[BackpressureStrategy.values().length];
            f54179a = iArr;
            try {
                iArr[BackpressureStrategy.DROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f54179a[BackpressureStrategy.LATEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f54179a[BackpressureStrategy.MISSING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f54179a[BackpressureStrategy.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static <T> k<T> amb(Iterable<? extends p<? extends T>> iterable) {
        qi.a.e(iterable, "sources is null");
        return ej.a.o(new ObservableAmb(null, iterable));
    }

    public static <T> k<T> ambArray(p<? extends T>... pVarArr) {
        qi.a.e(pVarArr, "sources is null");
        int length = pVarArr.length;
        if (length == 0) {
            return empty();
        }
        return length == 1 ? wrap(pVarArr[0]) : ej.a.o(new ObservableAmb(pVarArr, null));
    }

    public static <T, R> k<R> combineLatest(Iterable<? extends p<? extends T>> iterable, oi.o<? super Object[], ? extends R> oVar) {
        return combineLatest(iterable, oVar, bufferSize());
    }

    public static <T, R> k<R> combineLatestDelayError(oi.o<? super Object[], ? extends R> oVar, int i10, p<? extends T>... pVarArr) {
        return combineLatestDelayError(pVarArr, oVar, i10);
    }

    public static <T> k<T> concatArrayEager(int i10, int i11, p<? extends T>... pVarArr) {
        return fromArray(pVarArr).concatMapEagerDelayError(Functions.i(), i10, i11, false);
    }

    public static <T> k<T> concatArrayEagerDelayError(int i10, int i11, p<? extends T>... pVarArr) {
        return fromArray(pVarArr).concatMapEagerDelayError(Functions.i(), i10, i11, true);
    }

    public static <T> k<T> concatEager(p<? extends p<? extends T>> pVar, int i10, int i11) {
        return wrap(pVar).concatMapEager(Functions.i(), i10, i11);
    }

    public static <T> k<T> create(n<T> nVar) {
        qi.a.e(nVar, "source is null");
        return ej.a.o(new ObservableCreate(nVar));
    }

    public static <T> k<T> defer(Callable<? extends p<? extends T>> callable) {
        qi.a.e(callable, "supplier is null");
        return ej.a.o(new xi.r(callable));
    }

    public static <T> k<T> empty() {
        return ej.a.o(e0.f74566b);
    }

    public static <T> k<T> fromArray(T... tArr) {
        qi.a.e(tArr, "items is null");
        if (tArr.length == 0) {
            return empty();
        }
        return tArr.length == 1 ? just(tArr[0]) : ej.a.o(new i0(tArr));
    }

    public static <T> k<T> fromCallable(Callable<? extends T> callable) {
        qi.a.e(callable, "supplier is null");
        return ej.a.o(new j0(callable));
    }

    public static <T> k<T> fromIterable(Iterable<? extends T> iterable) {
        qi.a.e(iterable, "source is null");
        return ej.a.o(new l0(iterable));
    }

    public static <T> k<T> fromPublisher(qo.a<? extends T> aVar) {
        qi.a.e(aVar, "publisher is null");
        return ej.a.o(new m0(aVar));
    }

    public static k<Long> interval(long j10, long j11, TimeUnit timeUnit, s sVar) {
        qi.a.e(timeUnit, "unit is null");
        qi.a.e(sVar, "scheduler is null");
        return ej.a.o(new ObservableInterval(Math.max(0L, j10), Math.max(0L, j11), timeUnit, sVar));
    }

    public static k<Long> intervalRange(long j10, long j11, long j12, long j13, TimeUnit timeUnit, s sVar) {
        if (j11 < 0) {
            throw new IllegalArgumentException("count >= 0 required but it was " + j11);
        }
        if (j11 == 0) {
            return empty().delay(j12, timeUnit, sVar);
        }
        long j14 = j10 + (j11 - 1);
        if (j10 > 0 && j14 < 0) {
            throw new IllegalArgumentException("Overflow! start + count is bigger than Long.MAX_VALUE");
        }
        qi.a.e(timeUnit, "unit is null");
        qi.a.e(sVar, "scheduler is null");
        return ej.a.o(new ObservableIntervalRange(j10, j14, Math.max(0L, j12), Math.max(0L, j13), timeUnit, sVar));
    }

    public static <T> k<T> merge(Iterable<? extends p<? extends T>> iterable) {
        return fromIterable(iterable).flatMap(Functions.i());
    }

    public static <T> k<T> mergeArray(p<? extends T>... pVarArr) {
        return fromArray(pVarArr).flatMap(Functions.i(), pVarArr.length);
    }

    public static <T> k<T> mergeArrayDelayError(p<? extends T>... pVarArr) {
        return fromArray(pVarArr).flatMap(Functions.i(), true, pVarArr.length);
    }

    public static <T> k<T> mergeDelayError(Iterable<? extends p<? extends T>> iterable, int i10, int i11) {
        return fromIterable(iterable).flatMap(Functions.i(), true, i10, i11);
    }

    public static <T> k<T> never() {
        return ej.a.o(z0.f74971b);
    }

    public static k<Integer> range(int i10, int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException("count >= 0 required but it was " + i11);
        }
        if (i11 == 0) {
            return empty();
        }
        if (i11 == 1) {
            return just(Integer.valueOf(i10));
        }
        if (((long) i10) + ((long) (i11 - 1)) <= 2147483647L) {
            return ej.a.o(new ObservableRange(i10, i11));
        }
        throw new IllegalArgumentException("Integer overflow");
    }

    public static k<Long> rangeLong(long j10, long j11) {
        if (j11 < 0) {
            throw new IllegalArgumentException("count >= 0 required but it was " + j11);
        }
        if (j11 == 0) {
            return empty();
        }
        if (j11 == 1) {
            return just(Long.valueOf(j10));
        }
        long j12 = (j11 - 1) + j10;
        if (j10 <= 0 || j12 >= 0) {
            return ej.a.o(new ObservableRangeLong(j10, j11));
        }
        throw new IllegalArgumentException("Overflow! start + count is bigger than Long.MAX_VALUE");
    }

    public static <T> t<Boolean> sequenceEqual(p<? extends T> pVar, p<? extends T> pVar2, oi.d<? super T, ? super T> dVar) {
        return sequenceEqual(pVar, pVar2, dVar, bufferSize());
    }

    public static <T> k<T> switchOnNextDelayError(p<? extends p<? extends T>> pVar, int i10) {
        qi.a.e(pVar, "sources is null");
        qi.a.f(i10, "prefetch");
        return ej.a.o(new ObservableSwitchMap(pVar, Functions.i(), i10, true));
    }

    public static k<Long> timer(long j10, TimeUnit timeUnit, s sVar) {
        qi.a.e(timeUnit, "unit is null");
        qi.a.e(sVar, "scheduler is null");
        return ej.a.o(new ObservableTimer(Math.max(j10, 0L), timeUnit, sVar));
    }

    public static <T> k<T> unsafeCreate(p<T> pVar) {
        qi.a.e(pVar, "source is null");
        qi.a.e(pVar, "onSubscribe is null");
        if (pVar instanceof k) {
            throw new IllegalArgumentException("unsafeCreate(Observable) should be upgraded");
        }
        return ej.a.o(new n0(pVar));
    }

    public static <T, D> k<T> using(Callable<? extends D> callable, oi.o<? super D, ? extends p<? extends T>> oVar, oi.g<? super D> gVar, boolean z10) {
        qi.a.e(callable, "resourceSupplier is null");
        qi.a.e(oVar, "sourceSupplier is null");
        qi.a.e(gVar, "disposer is null");
        return ej.a.o(new ObservableUsing(callable, oVar, gVar, z10));
    }

    public static <T> k<T> wrap(p<T> pVar) {
        qi.a.e(pVar, "source is null");
        return pVar instanceof k ? ej.a.o((k) pVar) : ej.a.o(new n0(pVar));
    }

    public static <T, R> k<R> zipIterable(Iterable<? extends p<? extends T>> iterable, oi.o<? super Object[], ? extends R> oVar, boolean z10, int i10) {
        qi.a.e(oVar, "zipper is null");
        qi.a.e(iterable, "sources is null");
        qi.a.f(i10, "bufferSize");
        return ej.a.o(new ObservableZip(null, iterable, oVar, i10, z10));
    }

    public final t<Boolean> all(oi.q<? super T> qVar) {
        qi.a.e(qVar, "predicate is null");
        return ej.a.p(new xi.f(this, qVar));
    }

    public final k<T> ambWith(p<? extends T> pVar) {
        qi.a.e(pVar, "other is null");
        return ambArray(this, pVar);
    }

    public final t<Boolean> any(oi.q<? super T> qVar) {
        qi.a.e(qVar, "predicate is null");
        return ej.a.p(new xi.h(this, qVar));
    }

    public final <R> R as(l<T, ? extends R> lVar) {
        return (R) ((l) qi.a.e(lVar, "converter is null")).apply(this);
    }

    public final Iterable<T> blockingIterable(int i10) {
        qi.a.f(i10, "bufferSize");
        return new BlockingObservableIterable(this, i10);
    }

    public final Iterable<T> blockingLatest() {
        return new xi.b(this);
    }

    public final Iterable<T> blockingMostRecent(T t10) {
        return new xi.c(this, t10);
    }

    public final Iterable<T> blockingNext() {
        return new xi.d(this);
    }

    public final void blockingSubscribe(oi.g<? super T> gVar) {
        xi.i.c(this, gVar, Functions.f61034f, Functions.f61031c);
    }

    public final k<List<T>> buffer(int i10, int i11) {
        return (k<List<T>>) buffer(i10, i11, ArrayListSupplier.asCallable());
    }

    public final <U> k<U> cast(Class<U> cls) {
        qi.a.e(cls, "clazz is null");
        return (k<U>) map(Functions.d(cls));
    }

    public final <U> t<U> collect(Callable<? extends U> callable, oi.b<? super U, ? super T> bVar) {
        qi.a.e(callable, "initialValueSupplier is null");
        qi.a.e(bVar, "collector is null");
        return ej.a.p(new xi.n(this, callable, bVar));
    }

    public final <U> t<U> collectInto(U u10, oi.b<? super U, ? super T> bVar) {
        qi.a.e(u10, "initialValue is null");
        return collect(Functions.k(u10), bVar);
    }

    public final <R> k<R> compose(q<? super T, ? extends R> qVar) {
        return wrap(((q) qi.a.e(qVar, "composer is null")).apply(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> k<R> concatMap(oi.o<? super T, ? extends p<? extends R>> oVar, int i10) {
        qi.a.e(oVar, "mapper is null");
        qi.a.f(i10, "prefetch");
        if (!(this instanceof ri.f)) {
            return ej.a.o(new ObservableConcatMap(this, oVar, i10, ErrorMode.IMMEDIATE));
        }
        Object objCall = ((ri.f) this).call();
        return objCall == null ? empty() : ObservableScalarXMap.a(objCall, oVar);
    }

    public final ii.a concatMapCompletable(oi.o<? super T, ? extends c> oVar, int i10) {
        qi.a.e(oVar, "mapper is null");
        qi.a.f(i10, "capacityHint");
        return ej.a.l(new ObservableConcatMapCompletable(this, oVar, ErrorMode.IMMEDIATE, i10));
    }

    public final ii.a concatMapCompletableDelayError(oi.o<? super T, ? extends c> oVar, boolean z10) {
        return concatMapCompletableDelayError(oVar, z10, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> k<R> concatMapDelayError(oi.o<? super T, ? extends p<? extends R>> oVar, int i10, boolean z10) {
        qi.a.e(oVar, "mapper is null");
        qi.a.f(i10, "prefetch");
        if (!(this instanceof ri.f)) {
            return ej.a.o(new ObservableConcatMap(this, oVar, i10, z10 ? ErrorMode.END : ErrorMode.BOUNDARY));
        }
        Object objCall = ((ri.f) this).call();
        return objCall == null ? empty() : ObservableScalarXMap.a(objCall, oVar);
    }

    public final <R> k<R> concatMapEager(oi.o<? super T, ? extends p<? extends R>> oVar, int i10, int i11) {
        qi.a.e(oVar, "mapper is null");
        qi.a.f(i10, "maxConcurrency");
        qi.a.f(i11, "prefetch");
        return ej.a.o(new ObservableConcatMapEager(this, oVar, ErrorMode.IMMEDIATE, i10, i11));
    }

    public final <R> k<R> concatMapEagerDelayError(oi.o<? super T, ? extends p<? extends R>> oVar, int i10, int i11, boolean z10) {
        qi.a.e(oVar, "mapper is null");
        qi.a.f(i10, "maxConcurrency");
        qi.a.f(i11, "prefetch");
        return ej.a.o(new ObservableConcatMapEager(this, oVar, z10 ? ErrorMode.END : ErrorMode.BOUNDARY, i10, i11));
    }

    public final <R> k<R> concatMapMaybe(oi.o<? super T, ? extends i<? extends R>> oVar, int i10) {
        qi.a.e(oVar, "mapper is null");
        qi.a.f(i10, "prefetch");
        return ej.a.o(new ObservableConcatMapMaybe(this, oVar, ErrorMode.IMMEDIATE, i10));
    }

    public final <R> k<R> concatMapMaybeDelayError(oi.o<? super T, ? extends i<? extends R>> oVar, boolean z10) {
        return concatMapMaybeDelayError(oVar, z10, 2);
    }

    public final <R> k<R> concatMapSingle(oi.o<? super T, ? extends v<? extends R>> oVar, int i10) {
        qi.a.e(oVar, "mapper is null");
        qi.a.f(i10, "prefetch");
        return ej.a.o(new ObservableConcatMapSingle(this, oVar, ErrorMode.IMMEDIATE, i10));
    }

    public final <R> k<R> concatMapSingleDelayError(oi.o<? super T, ? extends v<? extends R>> oVar, boolean z10) {
        return concatMapSingleDelayError(oVar, z10, 2);
    }

    public final t<Boolean> contains(Object obj) {
        qi.a.e(obj, "element is null");
        return any(Functions.h(obj));
    }

    public final t<Long> count() {
        return ej.a.p(new xi.p(this));
    }

    public final k<T> defaultIfEmpty(T t10) {
        qi.a.e(t10, "defaultItem is null");
        return switchIfEmpty(just(t10));
    }

    public final <T2> k<T2> dematerialize() {
        return ej.a.o(new xi.u(this));
    }

    public final <K> k<T> distinct(oi.o<? super T, K> oVar) {
        return distinct(oVar, Functions.f());
    }

    public final <K> k<T> distinctUntilChanged(oi.o<? super T, K> oVar) {
        qi.a.e(oVar, "keySelector is null");
        return ej.a.o(new x(this, oVar, qi.a.d()));
    }

    public final k<T> doAfterNext(oi.g<? super T> gVar) {
        qi.a.e(gVar, "onAfterNext is null");
        return ej.a.o(new y(this, gVar));
    }

    public final k<T> doAfterTerminate(oi.a aVar) {
        qi.a.e(aVar, "onFinally is null");
        return doOnEach(Functions.g(), Functions.g(), Functions.f61031c, aVar);
    }

    public final k<T> doFinally(oi.a aVar) {
        qi.a.e(aVar, "onFinally is null");
        return ej.a.o(new ObservableDoFinally(this, aVar));
    }

    public final k<T> doOnLifecycle(oi.g<? super mi.b> gVar, oi.a aVar) {
        qi.a.e(gVar, "onSubscribe is null");
        qi.a.e(aVar, "onDispose is null");
        return ej.a.o(new a0(this, gVar, aVar));
    }

    public final k<T> doOnSubscribe(oi.g<? super mi.b> gVar) {
        return doOnLifecycle(gVar, Functions.f61031c);
    }

    public final k<T> doOnTerminate(oi.a aVar) {
        qi.a.e(aVar, "onTerminate is null");
        return doOnEach(Functions.g(), Functions.a(aVar), aVar, Functions.f61031c);
    }

    public final t<T> elementAtOrError(long j10) {
        if (j10 >= 0) {
            return ej.a.p(new d0(this, j10, null));
        }
        throw new IndexOutOfBoundsException("index >= 0 required but it was " + j10);
    }

    public final k<T> filter(oi.q<? super T> qVar) {
        qi.a.e(qVar, "predicate is null");
        return ej.a.o(new g0(this, qVar));
    }

    public final t<T> first(T t10) {
        return elementAt(0L, t10);
    }

    public final g<T> firstElement() {
        return elementAt(0L);
    }

    public final t<T> firstOrError() {
        return elementAtOrError(0L);
    }

    public final <R> k<R> flatMap(oi.o<? super T, ? extends p<? extends R>> oVar, boolean z10) {
        return flatMap(oVar, z10, Integer.MAX_VALUE);
    }

    public final ii.a flatMapCompletable(oi.o<? super T, ? extends c> oVar, boolean z10) {
        qi.a.e(oVar, "mapper is null");
        return ej.a.l(new ObservableFlatMapCompletableCompletable(this, oVar, z10));
    }

    public final <R> k<R> flatMapMaybe(oi.o<? super T, ? extends i<? extends R>> oVar, boolean z10) {
        qi.a.e(oVar, "mapper is null");
        return ej.a.o(new ObservableFlatMapMaybe(this, oVar, z10));
    }

    public final <R> k<R> flatMapSingle(oi.o<? super T, ? extends v<? extends R>> oVar, boolean z10) {
        qi.a.e(oVar, "mapper is null");
        return ej.a.o(new ObservableFlatMapSingle(this, oVar, z10));
    }

    public final mi.b forEachWhile(oi.q<? super T> qVar, oi.g<? super Throwable> gVar) {
        return forEachWhile(qVar, gVar, Functions.f61031c);
    }

    public final <K> k<cj.b<K, T>> groupBy(oi.o<? super T, ? extends K> oVar, boolean z10) {
        return (k<cj.b<K, T>>) groupBy(oVar, Functions.i(), z10, bufferSize());
    }

    public final <TRight, TLeftEnd, TRightEnd, R> k<R> groupJoin(p<? extends TRight> pVar, oi.o<? super T, ? extends p<TLeftEnd>> oVar, oi.o<? super TRight, ? extends p<TRightEnd>> oVar2, oi.c<? super T, ? super k<TRight>, ? extends R> cVar) {
        qi.a.e(pVar, "other is null");
        qi.a.e(oVar, "leftEnd is null");
        qi.a.e(oVar2, "rightEnd is null");
        qi.a.e(cVar, "resultSelector is null");
        return ej.a.o(new ObservableGroupJoin(this, pVar, oVar, oVar2, cVar));
    }

    public final k<T> hide() {
        return ej.a.o(new p0(this));
    }

    public final ii.a ignoreElements() {
        return ej.a.l(new r0(this));
    }

    public final <TRight, TLeftEnd, TRightEnd, R> k<R> join(p<? extends TRight> pVar, oi.o<? super T, ? extends p<TLeftEnd>> oVar, oi.o<? super TRight, ? extends p<TRightEnd>> oVar2, oi.c<? super T, ? super TRight, ? extends R> cVar) {
        qi.a.e(pVar, "other is null");
        qi.a.e(oVar, "leftEnd is null");
        qi.a.e(oVar2, "rightEnd is null");
        qi.a.e(cVar, "resultSelector is null");
        return ej.a.o(new ObservableJoin(this, pVar, oVar, oVar2, cVar));
    }

    public final t<T> last(T t10) {
        qi.a.e(t10, "defaultItem is null");
        return ej.a.p(new u0(this, t10));
    }

    public final g<T> lastElement() {
        return ej.a.n(new t0(this));
    }

    public final t<T> lastOrError() {
        return ej.a.p(new u0(this, null));
    }

    public final <R> k<R> lift(o<? extends R, ? super T> oVar) {
        qi.a.e(oVar, "onLift is null");
        return ej.a.o(new v0(this, oVar));
    }

    public final <R> k<R> map(oi.o<? super T, ? extends R> oVar) {
        qi.a.e(oVar, "mapper is null");
        return ej.a.o(new w0(this, oVar));
    }

    public final k<j<T>> materialize() {
        return ej.a.o(new y0(this));
    }

    public final k<T> observeOn(s sVar, boolean z10) {
        return observeOn(sVar, z10, bufferSize());
    }

    public final <U> k<U> ofType(Class<U> cls) {
        qi.a.e(cls, "clazz is null");
        return filter(Functions.j(cls)).cast(cls);
    }

    public final k<T> onErrorReturn(oi.o<? super Throwable, ? extends T> oVar) {
        qi.a.e(oVar, "valueSupplier is null");
        return ej.a.o(new b1(this, oVar));
    }

    public final k<T> onErrorReturnItem(T t10) {
        qi.a.e(t10, "item is null");
        return onErrorReturn(Functions.l(t10));
    }

    public final k<T> onExceptionResumeNext(p<? extends T> pVar) {
        qi.a.e(pVar, "next is null");
        return ej.a.o(new a1(this, Functions.l(pVar), true));
    }

    public final k<T> onTerminateDetach() {
        return ej.a.o(new xi.v(this));
    }

    public final <R> k<R> publish(oi.o<? super k<T>, ? extends p<R>> oVar) {
        qi.a.e(oVar, "selector is null");
        return ej.a.o(new ObservablePublishSelector(this, oVar));
    }

    public final <R> t<R> reduceWith(Callable<R> callable, oi.c<R, ? super T, R> cVar) {
        qi.a.e(callable, "seedSupplier is null");
        qi.a.e(cVar, "reducer is null");
        return ej.a.p(new e1(this, callable, cVar));
    }

    public final k<T> repeat(long j10) {
        if (j10 >= 0) {
            return j10 == 0 ? empty() : ej.a.o(new ObservableRepeat(this, j10));
        }
        throw new IllegalArgumentException("times >= 0 required but it was " + j10);
    }

    public final k<T> repeatUntil(oi.e eVar) {
        qi.a.e(eVar, "stop is null");
        return ej.a.o(new ObservableRepeatUntil(this, eVar));
    }

    public final k<T> repeatWhen(oi.o<? super k<Object>, ? extends p<?>> oVar) {
        qi.a.e(oVar, "handler is null");
        return ej.a.o(new ObservableRepeatWhen(this, oVar));
    }

    public final <R> k<R> replay(oi.o<? super k<T>, ? extends p<R>> oVar) {
        qi.a.e(oVar, "selector is null");
        return ObservableReplay.i(s0.g(this), oVar);
    }

    public final k<T> retry(oi.d<? super Integer, ? super Throwable> dVar) {
        qi.a.e(dVar, "predicate is null");
        return ej.a.o(new ObservableRetryBiPredicate(this, dVar));
    }

    public final k<T> retryUntil(oi.e eVar) {
        qi.a.e(eVar, "stop is null");
        return retry(Long.MAX_VALUE, Functions.t(eVar));
    }

    public final k<T> retryWhen(oi.o<? super k<Throwable>, ? extends p<?>> oVar) {
        qi.a.e(oVar, "handler is null");
        return ej.a.o(new ObservableRetryWhen(this, oVar));
    }

    public final void safeSubscribe(r<? super T> rVar) {
        qi.a.e(rVar, "s is null");
        if (rVar instanceof dj.d) {
            subscribe(rVar);
        } else {
            subscribe(new dj.d(rVar));
        }
    }

    public final k<T> sample(long j10, TimeUnit timeUnit, boolean z10) {
        return sample(j10, timeUnit, gj.a.a(), z10);
    }

    public final <R> k<R> scanWith(Callable<R> callable, oi.c<R, ? super T, R> cVar) {
        qi.a.e(callable, "seedSupplier is null");
        qi.a.e(cVar, "accumulator is null");
        return ej.a.o(new g1(this, callable, cVar));
    }

    public final k<T> serialize() {
        return ej.a.o(new h1(this));
    }

    public final t<T> single(T t10) {
        qi.a.e(t10, "defaultItem is null");
        return ej.a.p(new j1(this, t10));
    }

    public final g<T> singleElement() {
        return ej.a.n(new i1(this));
    }

    public final t<T> singleOrError() {
        return ej.a.p(new j1(this, null));
    }

    public final <U> k<T> skipUntil(p<U> pVar) {
        qi.a.e(pVar, "other is null");
        return ej.a.o(new l1(this, pVar));
    }

    public final k<T> skipWhile(oi.q<? super T> qVar) {
        qi.a.e(qVar, "predicate is null");
        return ej.a.o(new m1(this, qVar));
    }

    public final k<T> sorted(Comparator<? super T> comparator) {
        qi.a.e(comparator, "sortFunction is null");
        return toList().r().map(Functions.m(comparator)).flatMapIterable(Functions.i());
    }

    public final k<T> startWith(p<? extends T> pVar) {
        qi.a.e(pVar, "other is null");
        return concatArray(pVar, this);
    }

    public final mi.b subscribe(oi.g<? super T> gVar) {
        return subscribe(gVar, Functions.f61034f, Functions.f61031c, Functions.g());
    }

    public final k<T> subscribeOn(s sVar) {
        qi.a.e(sVar, "scheduler is null");
        return ej.a.o(new ObservableSubscribeOn(this, sVar));
    }

    public final k<T> switchIfEmpty(p<? extends T> pVar) {
        qi.a.e(pVar, "other is null");
        return ej.a.o(new n1(this, pVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> k<R> switchMap(oi.o<? super T, ? extends p<? extends R>> oVar, int i10) {
        qi.a.e(oVar, "mapper is null");
        qi.a.f(i10, "bufferSize");
        if (!(this instanceof ri.f)) {
            return ej.a.o(new ObservableSwitchMap(this, oVar, i10, false));
        }
        Object objCall = ((ri.f) this).call();
        return objCall == null ? empty() : ObservableScalarXMap.a(objCall, oVar);
    }

    public final ii.a switchMapCompletable(oi.o<? super T, ? extends c> oVar) {
        qi.a.e(oVar, "mapper is null");
        return ej.a.l(new ObservableSwitchMapCompletable(this, oVar, false));
    }

    public final ii.a switchMapCompletableDelayError(oi.o<? super T, ? extends c> oVar) {
        qi.a.e(oVar, "mapper is null");
        return ej.a.l(new ObservableSwitchMapCompletable(this, oVar, true));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> k<R> switchMapDelayError(oi.o<? super T, ? extends p<? extends R>> oVar, int i10) {
        qi.a.e(oVar, "mapper is null");
        qi.a.f(i10, "bufferSize");
        if (!(this instanceof ri.f)) {
            return ej.a.o(new ObservableSwitchMap(this, oVar, i10, true));
        }
        Object objCall = ((ri.f) this).call();
        return objCall == null ? empty() : ObservableScalarXMap.a(objCall, oVar);
    }

    public final <R> k<R> switchMapMaybe(oi.o<? super T, ? extends i<? extends R>> oVar) {
        qi.a.e(oVar, "mapper is null");
        return ej.a.o(new ObservableSwitchMapMaybe(this, oVar, false));
    }

    public final <R> k<R> switchMapMaybeDelayError(oi.o<? super T, ? extends i<? extends R>> oVar) {
        qi.a.e(oVar, "mapper is null");
        return ej.a.o(new ObservableSwitchMapMaybe(this, oVar, true));
    }

    public final <R> k<R> switchMapSingle(oi.o<? super T, ? extends v<? extends R>> oVar) {
        qi.a.e(oVar, "mapper is null");
        return ej.a.o(new ObservableSwitchMapSingle(this, oVar, false));
    }

    public final <R> k<R> switchMapSingleDelayError(oi.o<? super T, ? extends v<? extends R>> oVar) {
        qi.a.e(oVar, "mapper is null");
        return ej.a.o(new ObservableSwitchMapSingle(this, oVar, true));
    }

    public final k<T> takeWhile(oi.q<? super T> qVar) {
        qi.a.e(qVar, "predicate is null");
        return ej.a.o(new r1(this, qVar));
    }

    public final k<T> throttleFirst(long j10, TimeUnit timeUnit, s sVar) {
        qi.a.e(timeUnit, "unit is null");
        qi.a.e(sVar, "scheduler is null");
        return ej.a.o(new ObservableThrottleFirstTimed(this, j10, timeUnit, sVar));
    }

    public final k<T> throttleLast(long j10, TimeUnit timeUnit, s sVar) {
        return sample(j10, timeUnit, sVar);
    }

    public final k<T> throttleLatest(long j10, TimeUnit timeUnit, boolean z10) {
        return throttleLatest(j10, timeUnit, gj.a.a(), z10);
    }

    public final k<T> throttleWithTimeout(long j10, TimeUnit timeUnit, s sVar) {
        return debounce(j10, timeUnit, sVar);
    }

    public final k<gj.b<T>> timeInterval(s sVar) {
        return timeInterval(TimeUnit.MILLISECONDS, sVar);
    }

    public final <V> k<T> timeout(oi.o<? super T, ? extends p<V>> oVar, p<? extends T> pVar) {
        qi.a.e(pVar, "other is null");
        return timeout0(null, oVar, pVar);
    }

    public final k<gj.b<T>> timestamp(s sVar) {
        return timestamp(TimeUnit.MILLISECONDS, sVar);
    }

    public final <R> R to(oi.o<? super k<T>, R> oVar) {
        try {
            return (R) ((oi.o) qi.a.e(oVar, "converter is null")).apply(this);
        } catch (Throwable th2) {
            ni.a.b(th2);
            throw ExceptionHelper.d(th2);
        }
    }

    public final e<T> toFlowable(BackpressureStrategy backpressureStrategy) {
        ui.d dVar = new ui.d(this);
        int i10 = a.f54179a[backpressureStrategy.ordinal()];
        if (i10 == 1) {
            return dVar.j();
        }
        if (i10 == 2) {
            return dVar.k();
        }
        if (i10 != 3) {
            return i10 != 4 ? dVar.h() : ej.a.m(new FlowableOnBackpressureError(dVar));
        }
        return dVar;
    }

    public final Future<T> toFuture() {
        return (Future) subscribeWith(new si.h());
    }

    public final t<List<T>> toList(int i10) {
        qi.a.f(i10, "capacityHint");
        return ej.a.p(new u1(this, i10));
    }

    public final t<List<T>> toSortedList(Comparator<? super T> comparator) {
        qi.a.e(comparator, "comparator is null");
        return (t<List<T>>) toList().h(Functions.m(comparator));
    }

    public final k<T> unsubscribeOn(s sVar) {
        qi.a.e(sVar, "scheduler is null");
        return ej.a.o(new ObservableUnsubscribeOn(this, sVar));
    }

    public final k<k<T>> window(long j10, long j11) {
        return window(j10, j11, bufferSize());
    }

    public static int bufferSize() {
        return e.b();
    }

    public static <T, R> k<R> combineLatest(Iterable<? extends p<? extends T>> iterable, oi.o<? super Object[], ? extends R> oVar, int i10) {
        qi.a.e(iterable, "sources is null");
        qi.a.e(oVar, "combiner is null");
        qi.a.f(i10, "bufferSize");
        return ej.a.o(new ObservableCombineLatest(null, iterable, oVar, i10 << 1, false));
    }

    public static <T, R> k<R> combineLatestDelayError(p<? extends T>[] pVarArr, oi.o<? super Object[], ? extends R> oVar, int i10) {
        qi.a.f(i10, "bufferSize");
        qi.a.e(oVar, "combiner is null");
        if (pVarArr.length == 0) {
            return empty();
        }
        return ej.a.o(new ObservableCombineLatest(pVarArr, null, oVar, i10 << 1, true));
    }

    public static <T> k<T> concat(p<? extends p<? extends T>> pVar) {
        return concat(pVar, bufferSize());
    }

    public static <T> k<T> concatDelayError(p<? extends p<? extends T>> pVar) {
        return concatDelayError(pVar, bufferSize(), true);
    }

    public static <T> k<T> concatEager(Iterable<? extends p<? extends T>> iterable) {
        return concatEager(iterable, bufferSize(), bufferSize());
    }

    public static <T> k<T> error(Throwable th2) {
        qi.a.e(th2, "e is null");
        return error((Callable<? extends Throwable>) Functions.k(th2));
    }

    public static <T> k<T> fromFuture(Future<? extends T> future, long j10, TimeUnit timeUnit) {
        qi.a.e(future, "future is null");
        qi.a.e(timeUnit, "unit is null");
        return ej.a.o(new k0(future, j10, timeUnit));
    }

    public static <T> k<T> just(T t10, T t11) {
        qi.a.e(t10, "The first item is null");
        qi.a.e(t11, "The second item is null");
        return fromArray(t10, t11);
    }

    public static <T> k<T> merge(Iterable<? extends p<? extends T>> iterable, int i10) {
        return fromIterable(iterable).flatMap(Functions.i(), i10);
    }

    public static <T> k<T> mergeDelayError(Iterable<? extends p<? extends T>> iterable, int i10) {
        return fromIterable(iterable).flatMap(Functions.i(), true, i10);
    }

    public static <T> t<Boolean> sequenceEqual(p<? extends T> pVar, p<? extends T> pVar2, oi.d<? super T, ? super T> dVar, int i10) {
        qi.a.e(pVar, "source1 is null");
        qi.a.e(pVar2, "source2 is null");
        qi.a.e(dVar, "isEqual is null");
        qi.a.f(i10, "bufferSize");
        return ej.a.p(new ObservableSequenceEqualSingle(pVar, pVar2, dVar, i10));
    }

    public final void blockingForEach(oi.g<? super T> gVar) {
        Iterator<T> it = blockingIterable().iterator();
        while (it.hasNext()) {
            try {
                gVar.accept(it.next());
            } catch (Throwable th2) {
                ni.a.b(th2);
                ((mi.b) it).dispose();
                throw ExceptionHelper.d(th2);
            }
        }
    }

    public final T blockingSingle(T t10) {
        return single(t10).d();
    }

    public final void blockingSubscribe(oi.g<? super T> gVar, oi.g<? super Throwable> gVar2) {
        xi.i.c(this, gVar, gVar2, Functions.f61031c);
    }

    public final <U extends Collection<? super T>> k<U> buffer(int i10, int i11, Callable<U> callable) {
        qi.a.f(i10, "count");
        qi.a.f(i11, "skip");
        qi.a.e(callable, "bufferSupplier is null");
        return ej.a.o(new ObservableBuffer(this, i10, i11, callable));
    }

    public final k<T> cache() {
        return ObservableCache.b(this);
    }

    public final k<T> cacheWithInitialCapacity(int i10) {
        return ObservableCache.c(this, i10);
    }

    public final ii.a concatMapCompletableDelayError(oi.o<? super T, ? extends c> oVar, boolean z10, int i10) {
        qi.a.e(oVar, "mapper is null");
        qi.a.f(i10, "prefetch");
        return ej.a.l(new ObservableConcatMapCompletable(this, oVar, z10 ? ErrorMode.END : ErrorMode.BOUNDARY, i10));
    }

    public final <U> k<U> concatMapIterable(oi.o<? super T, ? extends Iterable<? extends U>> oVar, int i10) {
        qi.a.e(oVar, "mapper is null");
        qi.a.f(i10, "prefetch");
        return (k<U>) concatMap(s0.a(oVar), i10);
    }

    public final <R> k<R> concatMapMaybeDelayError(oi.o<? super T, ? extends i<? extends R>> oVar, boolean z10, int i10) {
        qi.a.e(oVar, "mapper is null");
        qi.a.f(i10, "prefetch");
        return ej.a.o(new ObservableConcatMapMaybe(this, oVar, z10 ? ErrorMode.END : ErrorMode.BOUNDARY, i10));
    }

    public final <R> k<R> concatMapSingleDelayError(oi.o<? super T, ? extends v<? extends R>> oVar, boolean z10, int i10) {
        qi.a.e(oVar, "mapper is null");
        qi.a.f(i10, "prefetch");
        return ej.a.o(new ObservableConcatMapSingle(this, oVar, z10 ? ErrorMode.END : ErrorMode.BOUNDARY, i10));
    }

    public final k<T> concatWith(v<? extends T> vVar) {
        qi.a.e(vVar, "other is null");
        return ej.a.o(new ObservableConcatWithSingle(this, vVar));
    }

    public final k<T> debounce(long j10, TimeUnit timeUnit) {
        return debounce(j10, timeUnit, gj.a.a());
    }

    public final k<T> delay(long j10, TimeUnit timeUnit) {
        return delay(j10, timeUnit, gj.a.a(), false);
    }

    public final k<T> delaySubscription(long j10, TimeUnit timeUnit) {
        return delaySubscription(j10, timeUnit, gj.a.a());
    }

    public final <K> k<T> distinct(oi.o<? super T, K> oVar, Callable<? extends Collection<? super K>> callable) {
        qi.a.e(oVar, "keySelector is null");
        qi.a.e(callable, "collectionSupplier is null");
        return ej.a.o(new xi.w(this, oVar, callable));
    }

    public final k<T> doOnComplete(oi.a aVar) {
        return doOnEach(Functions.g(), Functions.g(), aVar, Functions.f61031c);
    }

    public final k<T> doOnDispose(oi.a aVar) {
        return doOnLifecycle(Functions.g(), aVar);
    }

    public final k<T> doOnError(oi.g<? super Throwable> gVar) {
        oi.g<? super T> gVarG = Functions.g();
        oi.a aVar = Functions.f61031c;
        return doOnEach(gVarG, gVar, aVar, aVar);
    }

    public final k<T> doOnNext(oi.g<? super T> gVar) {
        oi.g<? super Throwable> gVarG = Functions.g();
        oi.a aVar = Functions.f61031c;
        return doOnEach(gVar, gVarG, aVar, aVar);
    }

    public final t<T> elementAt(long j10, T t10) {
        if (j10 >= 0) {
            qi.a.e(t10, "defaultItem is null");
            return ej.a.p(new d0(this, j10, t10));
        }
        throw new IndexOutOfBoundsException("index >= 0 required but it was " + j10);
    }

    public final <R> k<R> flatMap(oi.o<? super T, ? extends p<? extends R>> oVar, boolean z10, int i10) {
        return flatMap(oVar, z10, i10, bufferSize());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <U, V> k<V> flatMapIterable(oi.o<? super T, ? extends Iterable<? extends U>> oVar, oi.c<? super T, ? super U, ? extends V> cVar) {
        qi.a.e(oVar, "mapper is null");
        qi.a.e(cVar, "resultSelector is null");
        return (k<V>) flatMap(s0.a(oVar), cVar, false, bufferSize(), bufferSize());
    }

    public final mi.b forEach(oi.g<? super T> gVar) {
        return subscribe(gVar);
    }

    public final mi.b forEachWhile(oi.q<? super T> qVar, oi.g<? super Throwable> gVar, oi.a aVar) {
        qi.a.e(qVar, "onNext is null");
        qi.a.e(gVar, "onError is null");
        qi.a.e(aVar, "onComplete is null");
        ForEachWhileObserver forEachWhileObserver = new ForEachWhileObserver(qVar, gVar, aVar);
        subscribe(forEachWhileObserver);
        return forEachWhileObserver;
    }

    public final <K, V> k<cj.b<K, V>> groupBy(oi.o<? super T, ? extends K> oVar, oi.o<? super T, ? extends V> oVar2) {
        return groupBy(oVar, oVar2, false, bufferSize());
    }

    public final t<Boolean> isEmpty() {
        return all(Functions.b());
    }

    public final k<T> mergeWith(v<? extends T> vVar) {
        qi.a.e(vVar, "other is null");
        return ej.a.o(new ObservableMergeWithSingle(this, vVar));
    }

    public final k<T> observeOn(s sVar, boolean z10, int i10) {
        qi.a.e(sVar, "scheduler is null");
        qi.a.f(i10, "bufferSize");
        return ej.a.o(new ObservableObserveOn(this, sVar, z10, i10));
    }

    public final k<T> onErrorResumeNext(p<? extends T> pVar) {
        qi.a.e(pVar, "next is null");
        return onErrorResumeNext(Functions.l(pVar));
    }

    public final <R> t<R> reduce(R r10, oi.c<R, ? super T, R> cVar) {
        qi.a.e(r10, "seed is null");
        qi.a.e(cVar, "reducer is null");
        return ej.a.p(new d1(this, r10, cVar));
    }

    public final k<T> sample(long j10, TimeUnit timeUnit, s sVar) {
        qi.a.e(timeUnit, "unit is null");
        qi.a.e(sVar, "scheduler is null");
        return ej.a.o(new ObservableSampleTimed(this, j10, timeUnit, sVar, false));
    }

    public final <R> k<R> scan(R r10, oi.c<R, ? super T, R> cVar) {
        qi.a.e(r10, "seed is null");
        return scanWith(Functions.k(r10), cVar);
    }

    public final k<T> share() {
        return publish().c();
    }

    public final k<T> skip(long j10, TimeUnit timeUnit) {
        return skipUntil(timer(j10, timeUnit));
    }

    public final k<T> startWithArray(T... tArr) {
        k kVarFromArray = fromArray(tArr);
        if (kVarFromArray == empty()) {
            return ej.a.o(this);
        }
        return concatArray(kVarFromArray, this);
    }

    public final mi.b subscribe(oi.g<? super T> gVar, oi.g<? super Throwable> gVar2) {
        return subscribe(gVar, gVar2, Functions.f61031c, Functions.g());
    }

    public final <E extends r<? super T>> E subscribeWith(E e10) {
        subscribe(e10);
        return e10;
    }

    public final k<T> take(long j10, TimeUnit timeUnit) {
        return takeUntil(timer(j10, timeUnit));
    }

    public final k<T> takeUntil(oi.q<? super T> qVar) {
        qi.a.e(qVar, "predicate is null");
        return ej.a.o(new q1(this, qVar));
    }

    public final TestObserver<T> test(boolean z10) {
        TestObserver<T> testObserver = new TestObserver<>();
        if (z10) {
            testObserver.dispose();
        }
        subscribe(testObserver);
        return testObserver;
    }

    public final k<T> throttleLatest(long j10, TimeUnit timeUnit, s sVar) {
        return throttleLatest(j10, timeUnit, sVar, false);
    }

    public final k<gj.b<T>> timeInterval(TimeUnit timeUnit) {
        return timeInterval(timeUnit, gj.a.a());
    }

    public final k<gj.b<T>> timestamp(TimeUnit timeUnit) {
        return timestamp(timeUnit, gj.a.a());
    }

    public final <K, V> t<Map<K, V>> toMap(oi.o<? super T, ? extends K> oVar, oi.o<? super T, ? extends V> oVar2) {
        qi.a.e(oVar, "keySelector is null");
        qi.a.e(oVar2, "valueSelector is null");
        return (t<Map<K, V>>) collect(HashMapSupplier.asCallable(), Functions.E(oVar, oVar2));
    }

    public final k<k<T>> window(long j10, long j11, int i10) {
        qi.a.g(j10, "count");
        qi.a.g(j11, "skip");
        qi.a.f(i10, "bufferSize");
        return ej.a.o(new ObservableWindow(this, j10, j11, i10));
    }

    public static <T> k<T> concat(p<? extends p<? extends T>> pVar, int i10) {
        qi.a.e(pVar, "sources is null");
        qi.a.f(i10, "prefetch");
        return ej.a.o(new ObservableConcatMap(pVar, Functions.i(), i10, ErrorMode.IMMEDIATE));
    }

    public static <T> k<T> concatDelayError(p<? extends p<? extends T>> pVar, int i10, boolean z10) {
        qi.a.e(pVar, "sources is null");
        qi.a.f(i10, "prefetch is null");
        return ej.a.o(new ObservableConcatMap(pVar, Functions.i(), i10, z10 ? ErrorMode.END : ErrorMode.BOUNDARY));
    }

    public static <T> k<T> concatEager(Iterable<? extends p<? extends T>> iterable, int i10, int i11) {
        return fromIterable(iterable).concatMapEagerDelayError(Functions.i(), i10, i11, false);
    }

    public static <T> k<T> merge(p<? extends p<? extends T>> pVar) {
        qi.a.e(pVar, "sources is null");
        return ej.a.o(new ObservableFlatMap(pVar, Functions.i(), false, Integer.MAX_VALUE, bufferSize()));
    }

    public static <T> k<T> mergeDelayError(p<? extends p<? extends T>> pVar) {
        qi.a.e(pVar, "sources is null");
        return ej.a.o(new ObservableFlatMap(pVar, Functions.i(), true, Integer.MAX_VALUE, bufferSize()));
    }

    public static <T> k<T> switchOnNext(p<? extends p<? extends T>> pVar) {
        return switchOnNext(pVar, bufferSize());
    }

    private <U, V> k<T> timeout0(p<U> pVar, oi.o<? super T, ? extends p<V>> oVar, p<? extends T> pVar2) {
        qi.a.e(oVar, "itemTimeoutIndicator is null");
        return ej.a.o(new ObservableTimeout(this, pVar, oVar, pVar2));
    }

    public static <T, R> k<R> zip(p<? extends p<? extends T>> pVar, oi.o<? super Object[], ? extends R> oVar) {
        qi.a.e(oVar, "zipper is null");
        qi.a.e(pVar, "sources is null");
        return ej.a.o(new t1(pVar, 16).flatMap(s0.n(oVar)));
    }

    public final void blockingSubscribe(oi.g<? super T> gVar, oi.g<? super Throwable> gVar2, oi.a aVar) {
        xi.i.c(this, gVar, gVar2, aVar);
    }

    public final k<T> debounce(long j10, TimeUnit timeUnit, s sVar) {
        qi.a.e(timeUnit, "unit is null");
        qi.a.e(sVar, "scheduler is null");
        return ej.a.o(new ObservableDebounceTimed(this, j10, timeUnit, sVar));
    }

    public final k<T> delay(long j10, TimeUnit timeUnit, boolean z10) {
        return delay(j10, timeUnit, gj.a.a(), z10);
    }

    public final k<T> delaySubscription(long j10, TimeUnit timeUnit, s sVar) {
        return delaySubscription(timer(j10, timeUnit, sVar));
    }

    public final k<T> distinctUntilChanged(oi.d<? super T, ? super T> dVar) {
        qi.a.e(dVar, "comparer is null");
        return ej.a.o(new x(this, Functions.i(), dVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> k<R> flatMap(oi.o<? super T, ? extends p<? extends R>> oVar, boolean z10, int i10, int i11) {
        qi.a.e(oVar, "mapper is null");
        qi.a.f(i10, "maxConcurrency");
        qi.a.f(i11, "bufferSize");
        if (this instanceof ri.f) {
            Object objCall = ((ri.f) this).call();
            if (objCall == null) {
                return empty();
            }
            return ObservableScalarXMap.a(objCall, oVar);
        }
        return ej.a.o(new ObservableFlatMap(this, oVar, z10, i10, i11));
    }

    public final <K, V> k<cj.b<K, V>> groupBy(oi.o<? super T, ? extends K> oVar, oi.o<? super T, ? extends V> oVar2, boolean z10) {
        return groupBy(oVar, oVar2, z10, bufferSize());
    }

    public final <R> k<R> replay(oi.o<? super k<T>, ? extends p<R>> oVar, int i10) {
        qi.a.e(oVar, "selector is null");
        qi.a.f(i10, "bufferSize");
        return ObservableReplay.i(s0.h(this, i10), oVar);
    }

    public final k<T> retry(long j10) {
        return retry(j10, Functions.c());
    }

    public final k<T> skip(long j10, TimeUnit timeUnit, s sVar) {
        return skipUntil(timer(j10, timeUnit, sVar));
    }

    public final k<T> skipLast(long j10, TimeUnit timeUnit) {
        return skipLast(j10, timeUnit, gj.a.c(), false, bufferSize());
    }

    public final k<T> startWith(T t10) {
        qi.a.e(t10, "item is null");
        return concatArray(just(t10), this);
    }

    public final mi.b subscribe(oi.g<? super T> gVar, oi.g<? super Throwable> gVar2, oi.a aVar) {
        return subscribe(gVar, gVar2, aVar, Functions.g());
    }

    public final k<T> take(long j10, TimeUnit timeUnit, s sVar) {
        return takeUntil(timer(j10, timeUnit, sVar));
    }

    public final k<T> throttleLatest(long j10, TimeUnit timeUnit, s sVar, boolean z10) {
        qi.a.e(timeUnit, "unit is null");
        qi.a.e(sVar, "scheduler is null");
        return ej.a.o(new ObservableThrottleLatest(this, j10, timeUnit, sVar, z10));
    }

    public final k<gj.b<T>> timeInterval(TimeUnit timeUnit, s sVar) {
        qi.a.e(timeUnit, "unit is null");
        qi.a.e(sVar, "scheduler is null");
        return ej.a.o(new s1(this, timeUnit, sVar));
    }

    public final k<T> timeout(long j10, TimeUnit timeUnit) {
        return timeout0(j10, timeUnit, null, gj.a.a());
    }

    public final k<gj.b<T>> timestamp(TimeUnit timeUnit, s sVar) {
        qi.a.e(timeUnit, "unit is null");
        qi.a.e(sVar, "scheduler is null");
        return (k<gj.b<T>>) map(Functions.u(timeUnit, sVar));
    }

    public final <U extends Collection<? super T>> t<U> toList(Callable<U> callable) {
        qi.a.e(callable, "collectionSupplier is null");
        return ej.a.p(new u1(this, callable));
    }

    public final t<List<T>> toSortedList(Comparator<? super T> comparator, int i10) {
        qi.a.e(comparator, "comparator is null");
        return (t<List<T>>) toList(i10).h(Functions.m(comparator));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T1, T2, R> k<R> withLatestFrom(p<T1> pVar, p<T2> pVar2, oi.h<? super T, ? super T1, ? super T2, R> hVar) {
        qi.a.e(pVar, "o1 is null");
        qi.a.e(pVar2, "o2 is null");
        qi.a.e(hVar, "combiner is null");
        return withLatestFrom((p<?>[]) new p[]{pVar, pVar2}, Functions.w(hVar));
    }

    public final <U, R> k<R> zipWith(p<? extends U> pVar, oi.c<? super T, ? super U, ? extends R> cVar) {
        qi.a.e(pVar, "other is null");
        return zip(this, pVar, cVar);
    }

    public static <T, S> k<T> generate(Callable<S> callable, oi.b<S, d<T>> bVar) {
        qi.a.e(bVar, "generator  is null");
        return generate(callable, s0.l(bVar), Functions.g());
    }

    public static k<Long> interval(long j10, TimeUnit timeUnit) {
        return interval(j10, j10, timeUnit, gj.a.a());
    }

    public final T blockingFirst(T t10) {
        si.d dVar = new si.d();
        subscribe(dVar);
        T tA = dVar.a();
        return tA != null ? tA : t10;
    }

    public final T blockingLast(T t10) {
        si.e eVar = new si.e();
        subscribe(eVar);
        T tA = eVar.a();
        return tA != null ? tA : t10;
    }

    public final void blockingSubscribe(r<? super T> rVar) {
        xi.i.b(this, rVar);
    }

    public final k<T> concatWith(i<? extends T> iVar) {
        qi.a.e(iVar, "other is null");
        return ej.a.o(new ObservableConcatWithMaybe(this, iVar));
    }

    public final k<T> delay(long j10, TimeUnit timeUnit, s sVar) {
        return delay(j10, timeUnit, sVar, false);
    }

    public final <K, V> k<cj.b<K, V>> groupBy(oi.o<? super T, ? extends K> oVar, oi.o<? super T, ? extends V> oVar2, boolean z10, int i10) {
        qi.a.e(oVar, "keySelector is null");
        qi.a.e(oVar2, "valueSelector is null");
        qi.a.f(i10, "bufferSize");
        return ej.a.o(new ObservableGroupBy(this, oVar, oVar2, i10, z10));
    }

    public final k<T> mergeWith(i<? extends T> iVar) {
        qi.a.e(iVar, "other is null");
        return ej.a.o(new ObservableMergeWithMaybe(this, iVar));
    }

    public final k<T> retry(long j10, oi.q<? super Throwable> qVar) {
        if (j10 >= 0) {
            qi.a.e(qVar, "predicate is null");
            return ej.a.o(new ObservableRetryPredicate(this, j10, qVar));
        }
        throw new IllegalArgumentException("times >= 0 required but it was " + j10);
    }

    public final k<T> skipLast(long j10, TimeUnit timeUnit, boolean z10) {
        return skipLast(j10, timeUnit, gj.a.c(), z10, bufferSize());
    }

    public final mi.b subscribe(oi.g<? super T> gVar, oi.g<? super Throwable> gVar2, oi.a aVar, oi.g<? super mi.b> gVar3) {
        qi.a.e(gVar, "onNext is null");
        qi.a.e(gVar2, "onError is null");
        qi.a.e(aVar, "onComplete is null");
        qi.a.e(gVar3, "onSubscribe is null");
        LambdaObserver lambdaObserver = new LambdaObserver(gVar, gVar2, aVar, gVar3);
        subscribe(lambdaObserver);
        return lambdaObserver;
    }

    public final k<T> takeLast(long j10, long j11, TimeUnit timeUnit) {
        return takeLast(j10, j11, timeUnit, gj.a.c(), false, bufferSize());
    }

    public final k<T> timeout(long j10, TimeUnit timeUnit, p<? extends T> pVar) {
        qi.a.e(pVar, "other is null");
        return timeout0(j10, timeUnit, pVar, gj.a.a());
    }

    public final <K, V> t<Map<K, Collection<V>>> toMultimap(oi.o<? super T, ? extends K> oVar, oi.o<? super T, ? extends V> oVar2) {
        return toMultimap(oVar, oVar2, HashMapSupplier.asCallable(), ArrayListSupplier.asFunction());
    }

    public static <T> k<T> fromFuture(Future<? extends T> future, long j10, TimeUnit timeUnit, s sVar) {
        qi.a.e(sVar, "scheduler is null");
        return fromFuture(future, j10, timeUnit).subscribeOn(sVar);
    }

    public static k<Long> interval(long j10, TimeUnit timeUnit, s sVar) {
        return interval(j10, j10, timeUnit, sVar);
    }

    public static <T> k<T> just(T t10, T t11, T t12) {
        qi.a.e(t10, "The first item is null");
        qi.a.e(t11, "The second item is null");
        qi.a.e(t12, "The third item is null");
        return fromArray(t10, t11, t12);
    }

    public static <T> k<T> merge(p<? extends p<? extends T>> pVar, int i10) {
        qi.a.e(pVar, "sources is null");
        qi.a.f(i10, "maxConcurrency");
        return ej.a.o(new ObservableFlatMap(pVar, Functions.i(), false, i10, bufferSize()));
    }

    public static <T> k<T> mergeDelayError(p<? extends p<? extends T>> pVar, int i10) {
        qi.a.e(pVar, "sources is null");
        qi.a.f(i10, "maxConcurrency");
        return ej.a.o(new ObservableFlatMap(pVar, Functions.i(), true, i10, bufferSize()));
    }

    public final k<T> delay(long j10, TimeUnit timeUnit, s sVar, boolean z10) {
        qi.a.e(timeUnit, "unit is null");
        qi.a.e(sVar, "scheduler is null");
        return ej.a.o(new xi.s(this, j10, timeUnit, sVar, z10));
    }

    public final k<T> doOnEach(oi.g<? super j<T>> gVar) {
        qi.a.e(gVar, "consumer is null");
        return doOnEach(Functions.r(gVar), Functions.q(gVar), Functions.p(gVar), Functions.f61031c);
    }

    public final k<T> sample(long j10, TimeUnit timeUnit, s sVar, boolean z10) {
        qi.a.e(timeUnit, "unit is null");
        qi.a.e(sVar, "scheduler is null");
        return ej.a.o(new ObservableSampleTimed(this, j10, timeUnit, sVar, z10));
    }

    public final k<T> skipLast(long j10, TimeUnit timeUnit, s sVar) {
        return skipLast(j10, timeUnit, sVar, false, bufferSize());
    }

    public final k<T> takeLast(long j10, long j11, TimeUnit timeUnit, s sVar) {
        return takeLast(j10, j11, timeUnit, sVar, false, bufferSize());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <K, V> t<Map<K, V>> toMap(oi.o<? super T, ? extends K> oVar, oi.o<? super T, ? extends V> oVar2, Callable<? extends Map<K, V>> callable) {
        qi.a.e(oVar, "keySelector is null");
        qi.a.e(oVar2, "valueSelector is null");
        qi.a.e(callable, "mapSupplier is null");
        return (t<Map<K, V>>) collect(callable, Functions.E(oVar, oVar2));
    }

    public final t<List<T>> toSortedList(int i10) {
        return toSortedList(Functions.o(), i10);
    }

    public final <U, R> k<R> zipWith(p<? extends U> pVar, oi.c<? super T, ? super U, ? extends R> cVar, boolean z10) {
        return zip(this, pVar, cVar, z10);
    }

    public static <T, R> k<R> combineLatest(p<? extends T>[] pVarArr, oi.o<? super Object[], ? extends R> oVar) {
        return combineLatest(pVarArr, oVar, bufferSize());
    }

    public static <T> k<T> concat(p<? extends T> pVar, p<? extends T> pVar2) {
        qi.a.e(pVar, "source1 is null");
        qi.a.e(pVar2, "source2 is null");
        return concatArray(pVar, pVar2);
    }

    public static <T, S> k<T> generate(Callable<S> callable, oi.b<S, d<T>> bVar, oi.g<? super S> gVar) {
        qi.a.e(bVar, "generator  is null");
        return generate(callable, s0.l(bVar), gVar);
    }

    public final <U extends Collection<? super T>> k<U> buffer(int i10, Callable<U> callable) {
        return buffer(i10, i10, callable);
    }

    public final k<T> concatWith(c cVar) {
        qi.a.e(cVar, "other is null");
        return ej.a.o(new ObservableConcatWithCompletable(this, cVar));
    }

    public final k<T> mergeWith(c cVar) {
        qi.a.e(cVar, "other is null");
        return ej.a.o(new ObservableMergeWithCompletable(this, cVar));
    }

    public final <R> k<R> replay(oi.o<? super k<T>, ? extends p<R>> oVar, int i10, long j10, TimeUnit timeUnit) {
        return replay(oVar, i10, j10, timeUnit, gj.a.a());
    }

    public final k<T> skipLast(long j10, TimeUnit timeUnit, s sVar, boolean z10) {
        return skipLast(j10, timeUnit, sVar, z10, bufferSize());
    }

    public final k<T> takeLast(long j10, long j11, TimeUnit timeUnit, s sVar, boolean z10, int i10) {
        qi.a.e(timeUnit, "unit is null");
        qi.a.e(sVar, "scheduler is null");
        qi.a.f(i10, "bufferSize");
        if (j10 >= 0) {
            return ej.a.o(new ObservableTakeLastTimed(this, j10, j11, timeUnit, sVar, i10, z10));
        }
        throw new IndexOutOfBoundsException("count >= 0 required but it was " + j10);
    }

    public final k<T> timeout(long j10, TimeUnit timeUnit, s sVar, p<? extends T> pVar) {
        qi.a.e(pVar, "other is null");
        return timeout0(j10, timeUnit, pVar, sVar);
    }

    public final k<k<T>> window(long j10, long j11, TimeUnit timeUnit) {
        return window(j10, j11, timeUnit, gj.a.a(), bufferSize());
    }

    public final <U, R> k<R> zipWith(p<? extends U> pVar, oi.c<? super T, ? super U, ? extends R> cVar, boolean z10, int i10) {
        return zip(this, pVar, cVar, z10, i10);
    }

    public static <T, R> k<R> combineLatest(p<? extends T>[] pVarArr, oi.o<? super Object[], ? extends R> oVar, int i10) {
        qi.a.e(pVarArr, "sources is null");
        if (pVarArr.length == 0) {
            return empty();
        }
        qi.a.e(oVar, "combiner is null");
        qi.a.f(i10, "bufferSize");
        return ej.a.o(new ObservableCombineLatest(pVarArr, null, oVar, i10 << 1, false));
    }

    public static <T, R> k<R> combineLatestDelayError(Iterable<? extends p<? extends T>> iterable, oi.o<? super Object[], ? extends R> oVar) {
        return combineLatestDelayError(iterable, oVar, bufferSize());
    }

    public static <T> t<Boolean> sequenceEqual(p<? extends T> pVar, p<? extends T> pVar2, int i10) {
        return sequenceEqual(pVar, pVar2, qi.a.d(), i10);
    }

    public final k<List<T>> buffer(long j10, long j11, TimeUnit timeUnit) {
        return (k<List<T>>) buffer(j10, j11, timeUnit, gj.a.a(), ArrayListSupplier.asCallable());
    }

    public final <R> k<R> replay(oi.o<? super k<T>, ? extends p<R>> oVar, int i10, long j10, TimeUnit timeUnit, s sVar) {
        qi.a.e(oVar, "selector is null");
        qi.a.f(i10, "bufferSize");
        qi.a.e(timeUnit, "unit is null");
        qi.a.e(sVar, "scheduler is null");
        return ObservableReplay.i(s0.i(this, i10, j10, timeUnit, sVar), oVar);
    }

    public final k<T> retry(oi.q<? super Throwable> qVar) {
        return retry(Long.MAX_VALUE, qVar);
    }

    public final k<T> skipLast(long j10, TimeUnit timeUnit, s sVar, boolean z10, int i10) {
        qi.a.e(timeUnit, "unit is null");
        qi.a.e(sVar, "scheduler is null");
        qi.a.f(i10, "bufferSize");
        return ej.a.o(new ObservableSkipLastTimed(this, j10, timeUnit, sVar, i10 << 1, z10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <K, V> t<Map<K, Collection<V>>> toMultimap(oi.o<? super T, ? extends K> oVar, oi.o<? super T, ? extends V> oVar2, Callable<? extends Map<K, Collection<V>>> callable, oi.o<? super K, ? extends Collection<? super V>> oVar3) {
        qi.a.e(oVar, "keySelector is null");
        qi.a.e(oVar2, "valueSelector is null");
        qi.a.e(callable, "mapSupplier is null");
        qi.a.e(oVar3, "collectionFactory is null");
        return (t<Map<K, Collection<V>>>) collect(callable, Functions.F(oVar, oVar2, oVar3));
    }

    public final k<k<T>> window(long j10, long j11, TimeUnit timeUnit, s sVar) {
        return window(j10, j11, timeUnit, sVar, bufferSize());
    }

    public static <T, R> k<R> combineLatestDelayError(Iterable<? extends p<? extends T>> iterable, oi.o<? super Object[], ? extends R> oVar, int i10) {
        qi.a.e(iterable, "sources is null");
        qi.a.e(oVar, "combiner is null");
        qi.a.f(i10, "bufferSize");
        return ej.a.o(new ObservableCombineLatest(null, iterable, oVar, i10 << 1, true));
    }

    public static <T> k<T> fromFuture(Future<? extends T> future, s sVar) {
        qi.a.e(sVar, "scheduler is null");
        return fromFuture(future).subscribeOn(sVar);
    }

    public static <T, S> k<T> generate(Callable<S> callable, oi.c<S, d<T>, S> cVar) {
        return generate(callable, cVar, Functions.g());
    }

    public static <T> k<T> merge(p<? extends T> pVar, p<? extends T> pVar2) {
        qi.a.e(pVar, "source1 is null");
        qi.a.e(pVar2, "source2 is null");
        return fromArray(pVar, pVar2).flatMap(Functions.i(), false, 2);
    }

    public static <T> k<T> mergeDelayError(p<? extends T> pVar, p<? extends T> pVar2) {
        qi.a.e(pVar, "source1 is null");
        qi.a.e(pVar2, "source2 is null");
        return fromArray(pVar, pVar2).flatMap(Functions.i(), true, 2);
    }

    public static <T1, T2, R> k<R> zip(p<? extends T1> pVar, p<? extends T2> pVar2, oi.c<? super T1, ? super T2, ? extends R> cVar) {
        qi.a.e(pVar, "source1 is null");
        qi.a.e(pVar2, "source2 is null");
        return zipArray(Functions.v(cVar), false, bufferSize(), pVar, pVar2);
    }

    public final k<List<T>> buffer(long j10, long j11, TimeUnit timeUnit, s sVar) {
        return (k<List<T>>) buffer(j10, j11, timeUnit, sVar, ArrayListSupplier.asCallable());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <U, V> k<T> delay(p<U> pVar, oi.o<? super T, ? extends p<V>> oVar) {
        return delaySubscription(pVar).delay(oVar);
    }

    public final <U> k<T> sample(p<U> pVar) {
        qi.a.e(pVar, "sampler is null");
        return ej.a.o(new ObservableSampleWithObservable(this, pVar, false));
    }

    public final k<T> timeout(long j10, TimeUnit timeUnit, s sVar) {
        return timeout0(j10, timeUnit, null, sVar);
    }

    public final k<k<T>> window(long j10, long j11, TimeUnit timeUnit, s sVar, int i10) {
        qi.a.g(j10, "timespan");
        qi.a.g(j11, "timeskip");
        qi.a.f(i10, "bufferSize");
        qi.a.e(sVar, "scheduler is null");
        qi.a.e(timeUnit, "unit is null");
        return ej.a.o(new w1(this, j10, j11, timeUnit, sVar, Long.MAX_VALUE, i10, false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T1, T2, T3, R> k<R> withLatestFrom(p<T1> pVar, p<T2> pVar2, p<T3> pVar3, oi.i<? super T, ? super T1, ? super T2, ? super T3, R> iVar) {
        qi.a.e(pVar, "o1 is null");
        qi.a.e(pVar2, "o2 is null");
        qi.a.e(pVar3, "o3 is null");
        qi.a.e(iVar, "combiner is null");
        return withLatestFrom((p<?>[]) new p[]{pVar, pVar2, pVar3}, Functions.x(iVar));
    }

    public static <T> k<T> concat(p<? extends T> pVar, p<? extends T> pVar2, p<? extends T> pVar3) {
        qi.a.e(pVar, "source1 is null");
        qi.a.e(pVar2, "source2 is null");
        qi.a.e(pVar3, "source3 is null");
        return concatArray(pVar, pVar2, pVar3);
    }

    public static <T, S> k<T> generate(Callable<S> callable, oi.c<S, d<T>, S> cVar, oi.g<? super S> gVar) {
        qi.a.e(callable, "initialState is null");
        qi.a.e(cVar, "generator  is null");
        qi.a.e(gVar, "disposeState is null");
        return ej.a.o(new o0(callable, cVar, gVar));
    }

    public static <T> k<T> just(T t10, T t11, T t12, T t13) {
        qi.a.e(t10, "The first item is null");
        qi.a.e(t11, "The second item is null");
        qi.a.e(t12, "The third item is null");
        qi.a.e(t13, "The fourth item is null");
        return fromArray(t10, t11, t12, t13);
    }

    public final <U extends Collection<? super T>> k<U> buffer(long j10, long j11, TimeUnit timeUnit, s sVar, Callable<U> callable) {
        qi.a.e(timeUnit, "unit is null");
        qi.a.e(sVar, "scheduler is null");
        qi.a.e(callable, "bufferSupplier is null");
        return ej.a.o(new xi.l(this, j10, j11, timeUnit, sVar, callable, Integer.MAX_VALUE, false));
    }

    public final <U, V> k<T> timeout(p<U> pVar, oi.o<? super T, ? extends p<V>> oVar) {
        qi.a.e(pVar, "firstTimeoutIndicator is null");
        return timeout0(pVar, oVar, null);
    }

    public final k<T> doOnEach(r<? super T> rVar) {
        qi.a.e(rVar, "observer is null");
        return doOnEach(s0.f(rVar), s0.e(rVar), s0.d(rVar), Functions.f61031c);
    }

    public final <U> k<T> sample(p<U> pVar, boolean z10) {
        qi.a.e(pVar, "sampler is null");
        return ej.a.o(new ObservableSampleWithObservable(this, pVar, z10));
    }

    @Override // ii.p
    public final void subscribe(r<? super T> rVar) {
        qi.a.e(rVar, "observer is null");
        try {
            r<? super T> rVarX = ej.a.x(this, rVar);
            qi.a.e(rVarX, "The RxJavaPlugins.onSubscribe hook returned a null Observer. Please change the handler provided to RxJavaPlugins.setOnObservableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            subscribeActual(rVarX);
        } catch (NullPointerException e10) {
            throw e10;
        } catch (Throwable th2) {
            ni.a.b(th2);
            ej.a.s(th2);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }

    public static <T> k<T> merge(p<? extends T> pVar, p<? extends T> pVar2, p<? extends T> pVar3) {
        qi.a.e(pVar, "source1 is null");
        qi.a.e(pVar2, "source2 is null");
        qi.a.e(pVar3, "source3 is null");
        return fromArray(pVar, pVar2, pVar3).flatMap(Functions.i(), false, 3);
    }

    public static <T> k<T> mergeDelayError(p<? extends T> pVar, p<? extends T> pVar2, p<? extends T> pVar3) {
        qi.a.e(pVar, "source1 is null");
        qi.a.e(pVar2, "source2 is null");
        qi.a.e(pVar3, "source3 is null");
        return fromArray(pVar, pVar2, pVar3).flatMap(Functions.i(), true, 3);
    }

    public static <T1, T2, R> k<R> zip(p<? extends T1> pVar, p<? extends T2> pVar2, oi.c<? super T1, ? super T2, ? extends R> cVar, boolean z10) {
        qi.a.e(pVar, "source1 is null");
        qi.a.e(pVar2, "source2 is null");
        return zipArray(Functions.v(cVar), z10, bufferSize(), pVar, pVar2);
    }

    public final <R> k<R> flatMap(oi.o<? super T, ? extends p<? extends R>> oVar, oi.o<? super Throwable, ? extends p<? extends R>> oVar2, Callable<? extends p<? extends R>> callable) {
        qi.a.e(oVar, "onNextMapper is null");
        qi.a.e(oVar2, "onErrorMapper is null");
        qi.a.e(callable, "onCompleteSupplier is null");
        return merge(new x0(this, oVar, oVar2, callable));
    }

    public final k<T> takeLast(long j10, TimeUnit timeUnit) {
        return takeLast(j10, timeUnit, gj.a.c(), false, bufferSize());
    }

    public final <U, V> k<T> timeout(p<U> pVar, oi.o<? super T, ? extends p<V>> oVar, p<? extends T> pVar2) {
        qi.a.e(pVar, "firstTimeoutIndicator is null");
        qi.a.e(pVar2, "other is null");
        return timeout0(pVar, oVar, pVar2);
    }

    public final k<T> takeLast(long j10, TimeUnit timeUnit, boolean z10) {
        return takeLast(j10, timeUnit, gj.a.c(), z10, bufferSize());
    }

    public final <K, V> t<Map<K, Collection<V>>> toMultimap(oi.o<? super T, ? extends K> oVar, oi.o<? super T, ? extends V> oVar2, Callable<Map<K, Collection<V>>> callable) {
        return toMultimap(oVar, oVar2, callable, ArrayListSupplier.asFunction());
    }

    public static <T1, T2, R> k<R> combineLatest(p<? extends T1> pVar, p<? extends T2> pVar2, oi.c<? super T1, ? super T2, ? extends R> cVar) {
        qi.a.e(pVar, "source1 is null");
        qi.a.e(pVar2, "source2 is null");
        return combineLatest(Functions.v(cVar), bufferSize(), pVar, pVar2);
    }

    public static <T> k<T> concat(p<? extends T> pVar, p<? extends T> pVar2, p<? extends T> pVar3, p<? extends T> pVar4) {
        qi.a.e(pVar, "source1 is null");
        qi.a.e(pVar2, "source2 is null");
        qi.a.e(pVar3, "source3 is null");
        qi.a.e(pVar4, "source4 is null");
        return concatArray(pVar, pVar2, pVar3, pVar4);
    }

    public final k<List<T>> buffer(long j10, TimeUnit timeUnit) {
        return buffer(j10, timeUnit, gj.a.a(), Integer.MAX_VALUE);
    }

    public final <R> k<R> replay(oi.o<? super k<T>, ? extends p<R>> oVar, int i10, s sVar) {
        qi.a.e(oVar, "selector is null");
        qi.a.e(sVar, "scheduler is null");
        qi.a.f(i10, "bufferSize");
        return ObservableReplay.i(s0.h(this, i10), s0.k(oVar, sVar));
    }

    public final k<T> takeLast(long j10, TimeUnit timeUnit, s sVar) {
        return takeLast(j10, timeUnit, sVar, false, bufferSize());
    }

    public static <T> k<T> just(T t10, T t11, T t12, T t13, T t14) {
        qi.a.e(t10, "The first item is null");
        qi.a.e(t11, "The second item is null");
        qi.a.e(t12, "The third item is null");
        qi.a.e(t13, "The fourth item is null");
        qi.a.e(t14, "The fifth item is null");
        return fromArray(t10, t11, t12, t13, t14);
    }

    public static <T1, T2, R> k<R> zip(p<? extends T1> pVar, p<? extends T2> pVar2, oi.c<? super T1, ? super T2, ? extends R> cVar, boolean z10, int i10) {
        qi.a.e(pVar, "source1 is null");
        qi.a.e(pVar2, "source2 is null");
        return zipArray(Functions.v(cVar), z10, i10, pVar, pVar2);
    }

    public final k<List<T>> buffer(long j10, TimeUnit timeUnit, int i10) {
        return buffer(j10, timeUnit, gj.a.a(), i10);
    }

    public final k<T> takeLast(long j10, TimeUnit timeUnit, s sVar, boolean z10) {
        return takeLast(j10, timeUnit, sVar, z10, bufferSize());
    }

    public final k<k<T>> window(long j10, TimeUnit timeUnit) {
        return window(j10, timeUnit, gj.a.a(), Long.MAX_VALUE, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T1, T2, T3, T4, R> k<R> withLatestFrom(p<T1> pVar, p<T2> pVar2, p<T3> pVar3, p<T4> pVar4, oi.j<? super T, ? super T1, ? super T2, ? super T3, ? super T4, R> jVar) {
        qi.a.e(pVar, "o1 is null");
        qi.a.e(pVar2, "o2 is null");
        qi.a.e(pVar3, "o3 is null");
        qi.a.e(pVar4, "o4 is null");
        qi.a.e(jVar, "combiner is null");
        return withLatestFrom((p<?>[]) new p[]{pVar, pVar2, pVar3, pVar4}, Functions.y(jVar));
    }

    public static <T> k<T> merge(p<? extends T> pVar, p<? extends T> pVar2, p<? extends T> pVar3, p<? extends T> pVar4) {
        qi.a.e(pVar, "source1 is null");
        qi.a.e(pVar2, "source2 is null");
        qi.a.e(pVar3, "source3 is null");
        qi.a.e(pVar4, "source4 is null");
        return fromArray(pVar, pVar2, pVar3, pVar4).flatMap(Functions.i(), false, 4);
    }

    public static <T> k<T> mergeDelayError(p<? extends T> pVar, p<? extends T> pVar2, p<? extends T> pVar3, p<? extends T> pVar4) {
        qi.a.e(pVar, "source1 is null");
        qi.a.e(pVar2, "source2 is null");
        qi.a.e(pVar3, "source3 is null");
        qi.a.e(pVar4, "source4 is null");
        return fromArray(pVar, pVar2, pVar3, pVar4).flatMap(Functions.i(), true, 4);
    }

    public final k<List<T>> buffer(long j10, TimeUnit timeUnit, s sVar, int i10) {
        return (k<List<T>>) buffer(j10, timeUnit, sVar, i10, ArrayListSupplier.asCallable(), false);
    }

    public final <R> k<R> flatMap(oi.o<? super T, ? extends p<? extends R>> oVar, oi.o<Throwable, ? extends p<? extends R>> oVar2, Callable<? extends p<? extends R>> callable, int i10) {
        qi.a.e(oVar, "onNextMapper is null");
        qi.a.e(oVar2, "onErrorMapper is null");
        qi.a.e(callable, "onCompleteSupplier is null");
        return merge(new x0(this, oVar, oVar2, callable), i10);
    }

    public final k<T> takeLast(long j10, TimeUnit timeUnit, s sVar, boolean z10, int i10) {
        return takeLast(Long.MAX_VALUE, j10, timeUnit, sVar, z10, i10);
    }

    public final k<k<T>> window(long j10, TimeUnit timeUnit, long j11) {
        return window(j10, timeUnit, gj.a.a(), j11, false);
    }

    public static <T1, T2, T3, R> k<R> combineLatest(p<? extends T1> pVar, p<? extends T2> pVar2, p<? extends T3> pVar3, oi.h<? super T1, ? super T2, ? super T3, ? extends R> hVar) {
        qi.a.e(pVar, "source1 is null");
        qi.a.e(pVar2, "source2 is null");
        qi.a.e(pVar3, "source3 is null");
        return combineLatest(Functions.w(hVar), bufferSize(), pVar, pVar2, pVar3);
    }

    public final <U extends Collection<? super T>> k<U> buffer(long j10, TimeUnit timeUnit, s sVar, int i10, Callable<U> callable, boolean z10) {
        qi.a.e(timeUnit, "unit is null");
        qi.a.e(sVar, "scheduler is null");
        qi.a.e(callable, "bufferSupplier is null");
        qi.a.f(i10, "count");
        return ej.a.o(new xi.l(this, j10, j10, timeUnit, sVar, callable, i10, z10));
    }

    public final k<k<T>> window(long j10, TimeUnit timeUnit, long j11, boolean z10) {
        return window(j10, timeUnit, gj.a.a(), j11, z10);
    }

    public static <T1, T2, T3, R> k<R> zip(p<? extends T1> pVar, p<? extends T2> pVar2, p<? extends T3> pVar3, oi.h<? super T1, ? super T2, ? super T3, ? extends R> hVar) {
        qi.a.e(pVar, "source1 is null");
        qi.a.e(pVar2, "source2 is null");
        qi.a.e(pVar3, "source3 is null");
        return zipArray(Functions.w(hVar), false, bufferSize(), pVar, pVar2, pVar3);
    }

    public final k<k<T>> window(long j10, TimeUnit timeUnit, s sVar) {
        return window(j10, timeUnit, sVar, Long.MAX_VALUE, false);
    }

    public final k<k<T>> window(long j10, TimeUnit timeUnit, s sVar, long j11) {
        return window(j10, timeUnit, sVar, j11, false);
    }

    public final <R> k<R> flatMap(oi.o<? super T, ? extends p<? extends R>> oVar, int i10) {
        return flatMap((oi.o) oVar, false, i10, bufferSize());
    }

    public final <R> k<R> replay(oi.o<? super k<T>, ? extends p<R>> oVar, long j10, TimeUnit timeUnit) {
        return replay(oVar, j10, timeUnit, gj.a.a());
    }

    public final k<k<T>> window(long j10, TimeUnit timeUnit, s sVar, long j11, boolean z10) {
        return window(j10, timeUnit, sVar, j11, z10, bufferSize());
    }

    public static <T1, T2, T3, T4, R> k<R> combineLatest(p<? extends T1> pVar, p<? extends T2> pVar2, p<? extends T3> pVar3, p<? extends T4> pVar4, oi.i<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> iVar) {
        qi.a.e(pVar, "source1 is null");
        qi.a.e(pVar2, "source2 is null");
        qi.a.e(pVar3, "source3 is null");
        qi.a.e(pVar4, "source4 is null");
        return combineLatest(Functions.x(iVar), bufferSize(), pVar, pVar2, pVar3, pVar4);
    }

    public static <T> k<T> just(T t10, T t11, T t12, T t13, T t14, T t15) {
        qi.a.e(t10, "The first item is null");
        qi.a.e(t11, "The second item is null");
        qi.a.e(t12, "The third item is null");
        qi.a.e(t13, "The fourth item is null");
        qi.a.e(t14, "The fifth item is null");
        qi.a.e(t15, "The sixth item is null");
        return fromArray(t10, t11, t12, t13, t14, t15);
    }

    public final <U, R> k<R> flatMap(oi.o<? super T, ? extends p<? extends U>> oVar, oi.c<? super T, ? super U, ? extends R> cVar) {
        return flatMap(oVar, cVar, false, bufferSize(), bufferSize());
    }

    public final <R> k<R> replay(oi.o<? super k<T>, ? extends p<R>> oVar, long j10, TimeUnit timeUnit, s sVar) {
        qi.a.e(oVar, "selector is null");
        qi.a.e(timeUnit, "unit is null");
        qi.a.e(sVar, "scheduler is null");
        return ObservableReplay.i(s0.j(this, j10, timeUnit, sVar), oVar);
    }

    public final k<k<T>> window(long j10, TimeUnit timeUnit, s sVar, long j11, boolean z10, int i10) {
        qi.a.f(i10, "bufferSize");
        qi.a.e(sVar, "scheduler is null");
        qi.a.e(timeUnit, "unit is null");
        qi.a.g(j11, "count");
        return ej.a.o(new w1(this, j10, j10, timeUnit, sVar, j11, i10, z10));
    }

    public static <T1, T2, T3, T4, R> k<R> zip(p<? extends T1> pVar, p<? extends T2> pVar2, p<? extends T3> pVar3, p<? extends T4> pVar4, oi.i<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> iVar) {
        qi.a.e(pVar, "source1 is null");
        qi.a.e(pVar2, "source2 is null");
        qi.a.e(pVar3, "source3 is null");
        qi.a.e(pVar4, "source4 is null");
        return zipArray(Functions.x(iVar), false, bufferSize(), pVar, pVar2, pVar3, pVar4);
    }

    public final k<List<T>> buffer(long j10, TimeUnit timeUnit, s sVar) {
        return (k<List<T>>) buffer(j10, timeUnit, sVar, Integer.MAX_VALUE, ArrayListSupplier.asCallable(), false);
    }

    public final <U, R> k<R> flatMap(oi.o<? super T, ? extends p<? extends U>> oVar, oi.c<? super T, ? super U, ? extends R> cVar, boolean z10) {
        return flatMap(oVar, cVar, z10, bufferSize(), bufferSize());
    }

    public final <R> k<R> withLatestFrom(p<?>[] pVarArr, oi.o<? super Object[], R> oVar) {
        qi.a.e(pVarArr, "others is null");
        qi.a.e(oVar, "combiner is null");
        return ej.a.o(new ObservableWithLatestFromMany(this, pVarArr, oVar));
    }

    public final <TOpening, TClosing> k<List<T>> buffer(p<? extends TOpening> pVar, oi.o<? super TOpening, ? extends p<? extends TClosing>> oVar) {
        return (k<List<T>>) buffer(pVar, oVar, ArrayListSupplier.asCallable());
    }

    public final <U, R> k<R> flatMap(oi.o<? super T, ? extends p<? extends U>> oVar, oi.c<? super T, ? super U, ? extends R> cVar, boolean z10, int i10) {
        return flatMap(oVar, cVar, z10, i10, bufferSize());
    }

    public final <TOpening, TClosing, U extends Collection<? super T>> k<U> buffer(p<? extends TOpening> pVar, oi.o<? super TOpening, ? extends p<? extends TClosing>> oVar, Callable<U> callable) {
        qi.a.e(pVar, "openingIndicator is null");
        qi.a.e(oVar, "closingIndicator is null");
        qi.a.e(callable, "bufferSupplier is null");
        return ej.a.o(new ObservableBufferBoundary(this, pVar, oVar, callable));
    }

    public final <U, R> k<R> flatMap(oi.o<? super T, ? extends p<? extends U>> oVar, oi.c<? super T, ? super U, ? extends R> cVar, boolean z10, int i10, int i11) {
        qi.a.e(oVar, "mapper is null");
        qi.a.e(cVar, "combiner is null");
        return flatMap(s0.b(oVar, cVar), z10, i10, i11);
    }

    public final <R> k<R> replay(oi.o<? super k<T>, ? extends p<R>> oVar, s sVar) {
        qi.a.e(oVar, "selector is null");
        qi.a.e(sVar, "scheduler is null");
        return ObservableReplay.i(s0.g(this), s0.k(oVar, sVar));
    }

    public final <R> k<R> withLatestFrom(Iterable<? extends p<?>> iterable, oi.o<? super Object[], R> oVar) {
        qi.a.e(iterable, "others is null");
        qi.a.e(oVar, "combiner is null");
        return ej.a.o(new ObservableWithLatestFromMany(this, iterable, oVar));
    }

    public static <T1, T2, T3, T4, T5, R> k<R> combineLatest(p<? extends T1> pVar, p<? extends T2> pVar2, p<? extends T3> pVar3, p<? extends T4> pVar4, p<? extends T5> pVar5, oi.j<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> jVar) {
        qi.a.e(pVar, "source1 is null");
        qi.a.e(pVar2, "source2 is null");
        qi.a.e(pVar3, "source3 is null");
        qi.a.e(pVar4, "source4 is null");
        qi.a.e(pVar5, "source5 is null");
        return combineLatest(Functions.y(jVar), bufferSize(), pVar, pVar2, pVar3, pVar4, pVar5);
    }

    public final <B> k<k<T>> window(p<B> pVar) {
        return window(pVar, bufferSize());
    }

    public static <T1, T2, T3, T4, T5, R> k<R> zip(p<? extends T1> pVar, p<? extends T2> pVar2, p<? extends T3> pVar3, p<? extends T4> pVar4, p<? extends T5> pVar5, oi.j<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> jVar) {
        qi.a.e(pVar, "source1 is null");
        qi.a.e(pVar2, "source2 is null");
        qi.a.e(pVar3, "source3 is null");
        qi.a.e(pVar4, "source4 is null");
        qi.a.e(pVar5, "source5 is null");
        return zipArray(Functions.y(jVar), false, bufferSize(), pVar, pVar2, pVar3, pVar4, pVar5);
    }

    public final <U, R> k<R> flatMap(oi.o<? super T, ? extends p<? extends U>> oVar, oi.c<? super T, ? super U, ? extends R> cVar, int i10) {
        return flatMap(oVar, cVar, false, i10, bufferSize());
    }

    public final <B> k<k<T>> window(p<B> pVar, int i10) {
        qi.a.e(pVar, "boundary is null");
        qi.a.f(i10, "bufferSize");
        return ej.a.o(new ObservableWindowBoundary(this, pVar, i10));
    }

    public static <T> k<T> just(T t10, T t11, T t12, T t13, T t14, T t15, T t16) {
        qi.a.e(t10, "The first item is null");
        qi.a.e(t11, "The second item is null");
        qi.a.e(t12, "The third item is null");
        qi.a.e(t13, "The fourth item is null");
        qi.a.e(t14, "The fifth item is null");
        qi.a.e(t15, "The sixth item is null");
        qi.a.e(t16, "The seventh item is null");
        return fromArray(t10, t11, t12, t13, t14, t15, t16);
    }

    public final <B> k<List<T>> buffer(p<B> pVar) {
        return (k<List<T>>) buffer(pVar, ArrayListSupplier.asCallable());
    }

    public final <B> k<List<T>> buffer(p<B> pVar, int i10) {
        qi.a.f(i10, "initialCapacity");
        return (k<List<T>>) buffer(pVar, Functions.e(i10));
    }

    public final cj.a<T> replay(int i10) {
        qi.a.f(i10, "bufferSize");
        return ObservableReplay.d(this, i10);
    }

    public final <U, V> k<k<T>> window(p<U> pVar, oi.o<? super U, ? extends p<V>> oVar) {
        return window(pVar, oVar, bufferSize());
    }

    public final <B, U extends Collection<? super T>> k<U> buffer(p<B> pVar, Callable<U> callable) {
        qi.a.e(pVar, "boundary is null");
        qi.a.e(callable, "bufferSupplier is null");
        return ej.a.o(new xi.k(this, pVar, callable));
    }

    public final <U, V> k<k<T>> window(p<U> pVar, oi.o<? super U, ? extends p<V>> oVar, int i10) {
        qi.a.e(pVar, "openingIndicator is null");
        qi.a.e(oVar, "closingIndicator is null");
        qi.a.f(i10, "bufferSize");
        return ej.a.o(new v1(this, pVar, oVar, i10));
    }

    public static <T1, T2, T3, T4, T5, T6, R> k<R> combineLatest(p<? extends T1> pVar, p<? extends T2> pVar2, p<? extends T3> pVar3, p<? extends T4> pVar4, p<? extends T5> pVar5, p<? extends T6> pVar6, oi.k<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> kVar) {
        qi.a.e(pVar, "source1 is null");
        qi.a.e(pVar2, "source2 is null");
        qi.a.e(pVar3, "source3 is null");
        qi.a.e(pVar4, "source4 is null");
        qi.a.e(pVar5, "source5 is null");
        qi.a.e(pVar6, "source6 is null");
        return combineLatest(Functions.z(kVar), bufferSize(), pVar, pVar2, pVar3, pVar4, pVar5, pVar6);
    }

    public final cj.a<T> replay(int i10, long j10, TimeUnit timeUnit) {
        return replay(i10, j10, timeUnit, gj.a.a());
    }

    public static <T1, T2, T3, T4, T5, T6, R> k<R> zip(p<? extends T1> pVar, p<? extends T2> pVar2, p<? extends T3> pVar3, p<? extends T4> pVar4, p<? extends T5> pVar5, p<? extends T6> pVar6, oi.k<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> kVar) {
        qi.a.e(pVar, "source1 is null");
        qi.a.e(pVar2, "source2 is null");
        qi.a.e(pVar3, "source3 is null");
        qi.a.e(pVar4, "source4 is null");
        qi.a.e(pVar5, "source5 is null");
        qi.a.e(pVar6, "source6 is null");
        return zipArray(Functions.z(kVar), false, bufferSize(), pVar, pVar2, pVar3, pVar4, pVar5, pVar6);
    }

    public final cj.a<T> replay(int i10, long j10, TimeUnit timeUnit, s sVar) {
        qi.a.f(i10, "bufferSize");
        qi.a.e(timeUnit, "unit is null");
        qi.a.e(sVar, "scheduler is null");
        return ObservableReplay.f(this, j10, timeUnit, sVar, i10);
    }

    public final <B> k<List<T>> buffer(Callable<? extends p<B>> callable) {
        return (k<List<T>>) buffer(callable, ArrayListSupplier.asCallable());
    }

    public final <B, U extends Collection<? super T>> k<U> buffer(Callable<? extends p<B>> callable, Callable<U> callable2) {
        qi.a.e(callable, "boundarySupplier is null");
        qi.a.e(callable2, "bufferSupplier is null");
        return ej.a.o(new xi.j(this, callable, callable2));
    }

    public final <B> k<k<T>> window(Callable<? extends p<B>> callable) {
        return window(callable, bufferSize());
    }

    public static <T> k<T> just(T t10, T t11, T t12, T t13, T t14, T t15, T t16, T t17) {
        qi.a.e(t10, "The first item is null");
        qi.a.e(t11, "The second item is null");
        qi.a.e(t12, "The third item is null");
        qi.a.e(t13, "The fourth item is null");
        qi.a.e(t14, "The fifth item is null");
        qi.a.e(t15, "The sixth item is null");
        qi.a.e(t16, "The seventh item is null");
        qi.a.e(t17, "The eighth item is null");
        return fromArray(t10, t11, t12, t13, t14, t15, t16, t17);
    }

    public final <B> k<k<T>> window(Callable<? extends p<B>> callable, int i10) {
        qi.a.e(callable, "boundary is null");
        qi.a.f(i10, "bufferSize");
        return ej.a.o(new ObservableWindowBoundarySupplier(this, callable, i10));
    }

    public final cj.a<T> replay(int i10, s sVar) {
        qi.a.f(i10, "bufferSize");
        return ObservableReplay.j(replay(i10), sVar);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> k<R> combineLatest(p<? extends T1> pVar, p<? extends T2> pVar2, p<? extends T3> pVar3, p<? extends T4> pVar4, p<? extends T5> pVar5, p<? extends T6> pVar6, p<? extends T7> pVar7, oi.l<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> lVar) {
        qi.a.e(pVar, "source1 is null");
        qi.a.e(pVar2, "source2 is null");
        qi.a.e(pVar3, "source3 is null");
        qi.a.e(pVar4, "source4 is null");
        qi.a.e(pVar5, "source5 is null");
        qi.a.e(pVar6, "source6 is null");
        qi.a.e(pVar7, "source7 is null");
        return combineLatest(Functions.A(lVar), bufferSize(), pVar, pVar2, pVar3, pVar4, pVar5, pVar6, pVar7);
    }

    public final cj.a<T> replay(long j10, TimeUnit timeUnit) {
        return replay(j10, timeUnit, gj.a.a());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> k<R> zip(p<? extends T1> pVar, p<? extends T2> pVar2, p<? extends T3> pVar3, p<? extends T4> pVar4, p<? extends T5> pVar5, p<? extends T6> pVar6, p<? extends T7> pVar7, oi.l<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> lVar) {
        qi.a.e(pVar, "source1 is null");
        qi.a.e(pVar2, "source2 is null");
        qi.a.e(pVar3, "source3 is null");
        qi.a.e(pVar4, "source4 is null");
        qi.a.e(pVar5, "source5 is null");
        qi.a.e(pVar6, "source6 is null");
        qi.a.e(pVar7, "source7 is null");
        return zipArray(Functions.A(lVar), false, bufferSize(), pVar, pVar2, pVar3, pVar4, pVar5, pVar6, pVar7);
    }

    public final cj.a<T> replay(long j10, TimeUnit timeUnit, s sVar) {
        qi.a.e(timeUnit, "unit is null");
        qi.a.e(sVar, "scheduler is null");
        return ObservableReplay.e(this, j10, timeUnit, sVar);
    }

    public final cj.a<T> replay(s sVar) {
        qi.a.e(sVar, "scheduler is null");
        return ObservableReplay.j(replay(), sVar);
    }

    public static <T> k<T> just(T t10, T t11, T t12, T t13, T t14, T t15, T t16, T t17, T t18) {
        qi.a.e(t10, "The first item is null");
        qi.a.e(t11, "The second item is null");
        qi.a.e(t12, "The third item is null");
        qi.a.e(t13, "The fourth item is null");
        qi.a.e(t14, "The fifth item is null");
        qi.a.e(t15, "The sixth item is null");
        qi.a.e(t16, "The seventh item is null");
        qi.a.e(t17, "The eighth item is null");
        qi.a.e(t18, "The ninth item is null");
        return fromArray(t10, t11, t12, t13, t14, t15, t16, t17, t18);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> k<R> combineLatest(p<? extends T1> pVar, p<? extends T2> pVar2, p<? extends T3> pVar3, p<? extends T4> pVar4, p<? extends T5> pVar5, p<? extends T6> pVar6, p<? extends T7> pVar7, p<? extends T8> pVar8, oi.m<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> mVar) {
        qi.a.e(pVar, "source1 is null");
        qi.a.e(pVar2, "source2 is null");
        qi.a.e(pVar3, "source3 is null");
        qi.a.e(pVar4, "source4 is null");
        qi.a.e(pVar5, "source5 is null");
        qi.a.e(pVar6, "source6 is null");
        qi.a.e(pVar7, "source7 is null");
        qi.a.e(pVar8, "source8 is null");
        return combineLatest(Functions.B(mVar), bufferSize(), pVar, pVar2, pVar3, pVar4, pVar5, pVar6, pVar7, pVar8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> k<R> zip(p<? extends T1> pVar, p<? extends T2> pVar2, p<? extends T3> pVar3, p<? extends T4> pVar4, p<? extends T5> pVar5, p<? extends T6> pVar6, p<? extends T7> pVar7, p<? extends T8> pVar8, oi.m<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> mVar) {
        qi.a.e(pVar, "source1 is null");
        qi.a.e(pVar2, "source2 is null");
        qi.a.e(pVar3, "source3 is null");
        qi.a.e(pVar4, "source4 is null");
        qi.a.e(pVar5, "source5 is null");
        qi.a.e(pVar6, "source6 is null");
        qi.a.e(pVar7, "source7 is null");
        qi.a.e(pVar8, "source8 is null");
        return zipArray(Functions.B(mVar), false, bufferSize(), pVar, pVar2, pVar3, pVar4, pVar5, pVar6, pVar7, pVar8);
    }

    public static <T> k<T> just(T t10, T t11, T t12, T t13, T t14, T t15, T t16, T t17, T t18, T t19) {
        qi.a.e(t10, "The first item is null");
        qi.a.e(t11, "The second item is null");
        qi.a.e(t12, "The third item is null");
        qi.a.e(t13, "The fourth item is null");
        qi.a.e(t14, "The fifth item is null");
        qi.a.e(t15, "The sixth item is null");
        qi.a.e(t16, "The seventh item is null");
        qi.a.e(t17, "The eighth item is null");
        qi.a.e(t18, "The ninth item is null");
        qi.a.e(t19, "The tenth item is null");
        return fromArray(t10, t11, t12, t13, t14, t15, t16, t17, t18, t19);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> k<R> combineLatest(p<? extends T1> pVar, p<? extends T2> pVar2, p<? extends T3> pVar3, p<? extends T4> pVar4, p<? extends T5> pVar5, p<? extends T6> pVar6, p<? extends T7> pVar7, p<? extends T8> pVar8, p<? extends T9> pVar9, oi.n<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> nVar) {
        qi.a.e(pVar, "source1 is null");
        qi.a.e(pVar2, "source2 is null");
        qi.a.e(pVar3, "source3 is null");
        qi.a.e(pVar4, "source4 is null");
        qi.a.e(pVar5, "source5 is null");
        qi.a.e(pVar6, "source6 is null");
        qi.a.e(pVar7, "source7 is null");
        qi.a.e(pVar8, "source8 is null");
        qi.a.e(pVar9, "source9 is null");
        return combineLatest(Functions.C(nVar), bufferSize(), pVar, pVar2, pVar3, pVar4, pVar5, pVar6, pVar7, pVar8, pVar9);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> k<R> zip(p<? extends T1> pVar, p<? extends T2> pVar2, p<? extends T3> pVar3, p<? extends T4> pVar4, p<? extends T5> pVar5, p<? extends T6> pVar6, p<? extends T7> pVar7, p<? extends T8> pVar8, p<? extends T9> pVar9, oi.n<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> nVar) {
        qi.a.e(pVar, "source1 is null");
        qi.a.e(pVar2, "source2 is null");
        qi.a.e(pVar3, "source3 is null");
        qi.a.e(pVar4, "source4 is null");
        qi.a.e(pVar5, "source5 is null");
        qi.a.e(pVar6, "source6 is null");
        qi.a.e(pVar7, "source7 is null");
        qi.a.e(pVar8, "source8 is null");
        qi.a.e(pVar9, "source9 is null");
        return zipArray(Functions.C(nVar), false, bufferSize(), pVar, pVar2, pVar3, pVar4, pVar5, pVar6, pVar7, pVar8, pVar9);
    }
}
