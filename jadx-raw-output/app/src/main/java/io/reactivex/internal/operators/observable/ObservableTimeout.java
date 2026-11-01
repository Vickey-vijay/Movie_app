package io.reactivex.internal.operators.observable;

import ii.k;
import ii.p;
import ii.r;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import mi.b;
import oi.o;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableTimeout<T, U, V> extends xi.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p<U> f61323c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o<? super T, ? extends p<V>> f61324d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p<? extends T> f61325e;

    public static final class TimeoutFallbackObserver<T> extends AtomicReference<b> implements r<T>, b, a {
        private static final long serialVersionUID = -7508389464265974549L;
        public final r<? super T> downstream;
        public p<? extends T> fallback;
        public final o<? super T, ? extends p<?>> itemTimeoutIndicator;
        public final SequentialDisposable task = new SequentialDisposable();
        public final AtomicLong index = new AtomicLong();
        public final AtomicReference<b> upstream = new AtomicReference<>();

        @Override // mi.b
        public void dispose() {
            DisposableHelper.dispose(this.upstream);
            DisposableHelper.dispose(this);
            this.task.dispose();
        }

        @Override // ii.r
        public void onComplete() {
            if (this.index.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onComplete();
                this.task.dispose();
            }
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            if (this.index.getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                ej.a.s(th2);
                return;
            }
            this.task.dispose();
            this.downstream.onError(th2);
            this.task.dispose();
        }

        @Override // ii.r
        public void onNext(T t10) {
            long j10 = this.index.get();
            if (j10 != Long.MAX_VALUE) {
                long j11 = 1 + j10;
                if (this.index.compareAndSet(j10, j11)) {
                    b bVar = this.task.get();
                    if (bVar != null) {
                        bVar.dispose();
                    }
                    this.downstream.onNext(t10);
                    try {
                        p pVar = (p) qi.a.e(this.itemTimeoutIndicator.apply(t10), "The itemTimeoutIndicator returned a null ObservableSource.");
                        TimeoutConsumer timeoutConsumer = new TimeoutConsumer(j11, this);
                        if (this.task.replace(timeoutConsumer)) {
                            pVar.subscribe(timeoutConsumer);
                        }
                    } catch (Throwable th2) {
                        ni.a.b(th2);
                        this.upstream.get().dispose();
                        this.index.getAndSet(Long.MAX_VALUE);
                        this.downstream.onError(th2);
                    }
                }
            }
        }

        @Override // ii.r
        public void onSubscribe(b bVar) {
            DisposableHelper.setOnce(this.upstream, bVar);
        }

        @Override // io.reactivex.internal.operators.observable.ObservableTimeoutTimed.b
        public void onTimeout(long j10) {
            if (this.index.compareAndSet(j10, Long.MAX_VALUE)) {
                DisposableHelper.dispose(this.upstream);
                p<? extends T> pVar = this.fallback;
                this.fallback = null;
                pVar.subscribe(new ObservableTimeoutTimed.a(this.downstream, this));
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableTimeout.a
        public void onTimeoutError(long j10, Throwable th2) {
            if (!this.index.compareAndSet(j10, Long.MAX_VALUE)) {
                ej.a.s(th2);
            } else {
                DisposableHelper.dispose(this);
                this.downstream.onError(th2);
            }
        }

        public void startFirstTimeout(p<?> pVar) {
            if (pVar != null) {
                TimeoutConsumer timeoutConsumer = new TimeoutConsumer(0L, this);
                if (this.task.replace(timeoutConsumer)) {
                    pVar.subscribe(timeoutConsumer);
                }
            }
        }

        public TimeoutFallbackObserver(r<? super T> rVar, o<? super T, ? extends p<?>> oVar, p<? extends T> pVar) {
            this.downstream = rVar;
            this.itemTimeoutIndicator = oVar;
            this.fallback = pVar;
        }

        @Override // mi.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }
    }

    public static final class TimeoutObserver<T> extends AtomicLong implements r<T>, b, a {
        private static final long serialVersionUID = 3764492702657003550L;
        public final r<? super T> downstream;
        public final o<? super T, ? extends p<?>> itemTimeoutIndicator;
        public final SequentialDisposable task = new SequentialDisposable();
        public final AtomicReference<b> upstream = new AtomicReference<>();

        @Override // mi.b
        public void dispose() {
            DisposableHelper.dispose(this.upstream);
            this.task.dispose();
        }

        @Override // mi.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(this.upstream.get());
        }

        @Override // ii.r
        public void onSubscribe(b bVar) {
            DisposableHelper.setOnce(this.upstream, bVar);
        }

        public void startFirstTimeout(p<?> pVar) {
            if (pVar != null) {
                TimeoutConsumer timeoutConsumer = new TimeoutConsumer(0L, this);
                if (this.task.replace(timeoutConsumer)) {
                    pVar.subscribe(timeoutConsumer);
                }
            }
        }

        public TimeoutObserver(r<? super T> rVar, o<? super T, ? extends p<?>> oVar) {
            this.downstream = rVar;
            this.itemTimeoutIndicator = oVar;
        }

        @Override // ii.r
        public void onNext(T t10) {
            long j10 = get();
            if (j10 != Long.MAX_VALUE) {
                long j11 = 1 + j10;
                if (compareAndSet(j10, j11)) {
                    b bVar = this.task.get();
                    if (bVar != null) {
                        bVar.dispose();
                    }
                    this.downstream.onNext(t10);
                    try {
                        p pVar = (p) qi.a.e(this.itemTimeoutIndicator.apply(t10), "The itemTimeoutIndicator returned a null ObservableSource.");
                        TimeoutConsumer timeoutConsumer = new TimeoutConsumer(j11, this);
                        if (this.task.replace(timeoutConsumer)) {
                            pVar.subscribe(timeoutConsumer);
                        }
                    } catch (Throwable th2) {
                        ni.a.b(th2);
                        this.upstream.get().dispose();
                        getAndSet(Long.MAX_VALUE);
                        this.downstream.onError(th2);
                    }
                }
            }
        }

        @Override // ii.r
        public void onComplete() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onComplete();
            }
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onError(th2);
            } else {
                ej.a.s(th2);
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableTimeoutTimed.b
        public void onTimeout(long j10) {
            if (compareAndSet(j10, Long.MAX_VALUE)) {
                DisposableHelper.dispose(this.upstream);
                this.downstream.onError(new TimeoutException());
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableTimeout.a
        public void onTimeoutError(long j10, Throwable th2) {
            if (compareAndSet(j10, Long.MAX_VALUE)) {
                DisposableHelper.dispose(this.upstream);
                this.downstream.onError(th2);
            } else {
                ej.a.s(th2);
            }
        }
    }

    public interface a extends ObservableTimeoutTimed.b {
        void onTimeoutError(long j10, Throwable th2);
    }

    public static final class TimeoutConsumer extends AtomicReference<b> implements r<Object>, b {
        private static final long serialVersionUID = 8708641127342403073L;
        public final long idx;
        public final a parent;

        public TimeoutConsumer(long j10, a aVar) {
            this.idx = j10;
            this.parent = aVar;
        }

        @Override // mi.b
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // mi.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // ii.r
        public void onComplete() {
            Object obj = get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (obj != disposableHelper) {
                lazySet(disposableHelper);
                this.parent.onTimeout(this.idx);
            }
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            Object obj = get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (obj != disposableHelper) {
                lazySet(disposableHelper);
                this.parent.onTimeoutError(this.idx, th2);
            } else {
                ej.a.s(th2);
            }
        }

        @Override // ii.r
        public void onNext(Object obj) {
            b bVar = (b) get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (bVar != disposableHelper) {
                bVar.dispose();
                lazySet(disposableHelper);
                this.parent.onTimeout(this.idx);
            }
        }

        @Override // ii.r
        public void onSubscribe(b bVar) {
            DisposableHelper.setOnce(this, bVar);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // ii.k
    public void subscribeActual(r<? super T> rVar) {
        if (this.f61325e == null) {
            TimeoutObserver timeoutObserver = new TimeoutObserver(rVar, this.f61324d);
            rVar.onSubscribe(timeoutObserver);
            timeoutObserver.startFirstTimeout(this.f61323c);
            this.f74487b.subscribe(timeoutObserver);
            return;
        }
        TimeoutFallbackObserver timeoutFallbackObserver = new TimeoutFallbackObserver(rVar, this.f61324d, this.f61325e);
        rVar.onSubscribe(timeoutFallbackObserver);
        timeoutFallbackObserver.startFirstTimeout(this.f61323c);
        this.f74487b.subscribe(timeoutFallbackObserver);
    }

    public ObservableTimeout(k<T> kVar, p<U> pVar, o<? super T, ? extends p<V>> oVar, p<? extends T> pVar2) {
        super(kVar);
        this.f61323c = pVar;
        this.f61324d = oVar;
        this.f61325e = pVar2;
    }
}
