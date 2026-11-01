package io.reactivex.internal.operators.observable;

import cj.b;
import ii.p;
import ii.r;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import oi.o;

/* JADX INFO: loaded from: classes4.dex */
public final class ObservableGroupBy<T, K, V> extends xi.a<T, b<K, V>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o<? super T, ? extends K> f61188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o<? super T, ? extends V> f61189d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f61190e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f61191f;

    public static final class GroupByObserver<T, K, V> extends AtomicInteger implements r<T>, mi.b {
        public static final Object NULL_KEY = new Object();
        private static final long serialVersionUID = -3688291656102519502L;
        public final int bufferSize;
        public final boolean delayError;
        public final r<? super b<K, V>> downstream;
        public final o<? super T, ? extends K> keySelector;
        public mi.b upstream;
        public final o<? super T, ? extends V> valueSelector;
        public final AtomicBoolean cancelled = new AtomicBoolean();
        public final Map<Object, a<K, V>> groups = new ConcurrentHashMap();

        public void cancel(K k10) {
            if (k10 == null) {
                k10 = (K) NULL_KEY;
            }
            this.groups.remove(k10);
            if (decrementAndGet() == 0) {
                this.upstream.dispose();
            }
        }

        @Override // mi.b
        public void dispose() {
            if (this.cancelled.compareAndSet(false, true) && decrementAndGet() == 0) {
                this.upstream.dispose();
            }
        }

        @Override // mi.b
        public boolean isDisposed() {
            return this.cancelled.get();
        }

        @Override // ii.r
        public void onComplete() {
            ArrayList arrayList = new ArrayList(this.groups.values());
            this.groups.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((a) it.next()).onComplete();
            }
            this.downstream.onComplete();
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            ArrayList arrayList = new ArrayList(this.groups.values());
            this.groups.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((a) it.next()).onError(th2);
            }
            this.downstream.onError(th2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // ii.r
        public void onNext(T t10) {
            try {
                K kApply = this.keySelector.apply(t10);
                Object obj = kApply != null ? kApply : NULL_KEY;
                a<K, V> aVar = this.groups.get(obj);
                a aVar2 = aVar;
                if (aVar == false) {
                    if (this.cancelled.get()) {
                        return;
                    }
                    a<K, V> aVarB = a.b(kApply, this.bufferSize, this, this.delayError);
                    this.groups.put(obj, aVarB);
                    getAndIncrement();
                    this.downstream.onNext(aVarB);
                    aVar2 = aVarB;
                }
                try {
                    aVar2.onNext(qi.a.e(this.valueSelector.apply(t10), "The value supplied is null"));
                } catch (Throwable th2) {
                    ni.a.b(th2);
                    this.upstream.dispose();
                    onError(th2);
                }
            } catch (Throwable th3) {
                ni.a.b(th3);
                this.upstream.dispose();
                onError(th3);
            }
        }

        @Override // ii.r
        public void onSubscribe(mi.b bVar) {
            if (DisposableHelper.validate(this.upstream, bVar)) {
                this.upstream = bVar;
                this.downstream.onSubscribe(this);
            }
        }

        public GroupByObserver(r<? super b<K, V>> rVar, o<? super T, ? extends K> oVar, o<? super T, ? extends V> oVar2, int i10, boolean z10) {
            this.downstream = rVar;
            this.keySelector = oVar;
            this.valueSelector = oVar2;
            this.bufferSize = i10;
            this.delayError = z10;
            lazySet(1);
        }
    }

    public static final class State<T, K> extends AtomicInteger implements mi.b, p<T> {
        private static final long serialVersionUID = -3852313036005250360L;
        public final boolean delayError;
        public volatile boolean done;
        public Throwable error;
        public final K key;
        public final GroupByObserver<?, K, T> parent;
        public final zi.a<T> queue;
        public final AtomicBoolean cancelled = new AtomicBoolean();
        public final AtomicBoolean once = new AtomicBoolean();
        public final AtomicReference<r<? super T>> actual = new AtomicReference<>();

        public void onComplete() {
            this.done = true;
            drain();
        }

        public boolean checkTerminated(boolean z10, boolean z11, r<? super T> rVar, boolean z12) {
            if (this.cancelled.get()) {
                this.queue.clear();
                this.parent.cancel(this.key);
                this.actual.lazySet(null);
                return true;
            }
            if (!z10) {
                return false;
            }
            if (z12) {
                if (!z11) {
                    return false;
                }
                Throwable th2 = this.error;
                this.actual.lazySet(null);
                if (th2 != null) {
                    rVar.onError(th2);
                } else {
                    rVar.onComplete();
                }
                return true;
            }
            Throwable th3 = this.error;
            if (th3 != null) {
                this.queue.clear();
                this.actual.lazySet(null);
                rVar.onError(th3);
                return true;
            }
            if (!z11) {
                return false;
            }
            this.actual.lazySet(null);
            rVar.onComplete();
            return true;
        }

        @Override // mi.b
        public void dispose() {
            if (this.cancelled.compareAndSet(false, true) && getAndIncrement() == 0) {
                this.actual.lazySet(null);
                this.parent.cancel(this.key);
            }
        }

        @Override // mi.b
        public boolean isDisposed() {
            return this.cancelled.get();
        }

        public void onError(Throwable th2) {
            this.error = th2;
            this.done = true;
            drain();
        }

        public void onNext(T t10) {
            this.queue.offer(t10);
            drain();
        }

        @Override // ii.p
        public void subscribe(r<? super T> rVar) {
            if (!this.once.compareAndSet(false, true)) {
                EmptyDisposable.error(new IllegalStateException("Only one Observer allowed!"), rVar);
                return;
            }
            rVar.onSubscribe(this);
            this.actual.lazySet(rVar);
            if (this.cancelled.get()) {
                this.actual.lazySet(null);
            } else {
                drain();
            }
        }

        public State(int i10, GroupByObserver<?, K, T> groupByObserver, K k10, boolean z10) {
            this.queue = new zi.a<>(i10);
            this.parent = groupByObserver;
            this.key = k10;
            this.delayError = z10;
        }

        public void drain() {
            boolean z10;
            if (getAndIncrement() != 0) {
                return;
            }
            zi.a<T> aVar = this.queue;
            boolean z11 = this.delayError;
            r<? super T> rVar = this.actual.get();
            int iAddAndGet = 1;
            while (true) {
                if (rVar != null) {
                    while (true) {
                        boolean z12 = this.done;
                        T tPoll = aVar.poll();
                        if (tPoll == null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (checkTerminated(z12, z10, rVar, z11)) {
                            return;
                        }
                        if (z10) {
                            break;
                        } else {
                            rVar.onNext(tPoll);
                        }
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
                if (rVar == null) {
                    rVar = this.actual.get();
                }
            }
        }
    }

    public static final class a<K, T> extends b<K, T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final State<T, K> f61192c;

        public static <T, K> a<K, T> b(K k10, int i10, GroupByObserver<?, K, T> groupByObserver, boolean z10) {
            return new a<>(k10, new State(i10, groupByObserver, k10, z10));
        }

        public void onComplete() {
            this.f61192c.onComplete();
        }

        public void onError(Throwable th2) {
            this.f61192c.onError(th2);
        }

        public void onNext(T t10) {
            this.f61192c.onNext(t10);
        }

        @Override // ii.k
        public void subscribeActual(r<? super T> rVar) {
            this.f61192c.subscribe(rVar);
        }

        public a(K k10, State<T, K> state) {
            super(k10);
            this.f61192c = state;
        }
    }

    @Override // ii.k
    public void subscribeActual(r<? super b<K, V>> rVar) {
        this.f74487b.subscribe(new GroupByObserver(rVar, this.f61188c, this.f61189d, this.f61190e, this.f61191f));
    }

    public ObservableGroupBy(p<T> pVar, o<? super T, ? extends K> oVar, o<? super T, ? extends V> oVar2, int i10, boolean z10) {
        super(pVar);
        this.f61188c = oVar;
        this.f61189d = oVar2;
        this.f61190e = i10;
        this.f61191f = z10;
    }
}
