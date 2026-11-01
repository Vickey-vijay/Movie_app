package io.reactivex.internal.operators.mixed;

import androidx.lifecycle.e;
import ej.a;
import ii.k;
import ii.r;
import ii.u;
import ii.v;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import mi.b;
import oi.o;

/* JADX INFO: loaded from: classes7.dex */
public final class ObservableSwitchMapSingle<T, R> extends k<R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k<T> f61114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o<? super T, ? extends v<? extends R>> f61115c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f61116d;

    public static final class SwitchMapSingleMainObserver<T, R> extends AtomicInteger implements r<T>, b {
        public static final SwitchMapSingleObserver<Object> INNER_DISPOSED = new SwitchMapSingleObserver<>(null);
        private static final long serialVersionUID = -5402190102429853762L;
        public volatile boolean cancelled;
        public final boolean delayErrors;
        public volatile boolean done;
        public final r<? super R> downstream;
        public final AtomicThrowable errors = new AtomicThrowable();
        public final AtomicReference<SwitchMapSingleObserver<R>> inner = new AtomicReference<>();
        public final o<? super T, ? extends v<? extends R>> mapper;
        public b upstream;

        public static final class SwitchMapSingleObserver<R> extends AtomicReference<b> implements u<R> {
            private static final long serialVersionUID = 8042919737683345351L;
            public volatile R item;
            public final SwitchMapSingleMainObserver<?, R> parent;

            @Override // ii.u
            public void onError(Throwable th2) {
                this.parent.innerError(this, th2);
            }

            @Override // ii.u
            public void onSuccess(R r10) {
                this.item = r10;
                this.parent.drain();
            }

            public SwitchMapSingleObserver(SwitchMapSingleMainObserver<?, R> switchMapSingleMainObserver) {
                this.parent = switchMapSingleMainObserver;
            }

            public void dispose() {
                DisposableHelper.dispose(this);
            }

            @Override // ii.u
            public void onSubscribe(b bVar) {
                DisposableHelper.setOnce(this, bVar);
            }
        }

        @Override // mi.b
        public void dispose() {
            this.cancelled = true;
            this.upstream.dispose();
            disposeInner();
        }

        @Override // ii.r
        public void onComplete() {
            this.done = true;
            drain();
        }

        public void disposeInner() {
            AtomicReference<SwitchMapSingleObserver<R>> atomicReference = this.inner;
            SwitchMapSingleObserver<Object> switchMapSingleObserver = INNER_DISPOSED;
            SwitchMapSingleObserver<R> andSet = atomicReference.getAndSet((SwitchMapSingleObserver<R>) switchMapSingleObserver);
            if (andSet == null || andSet == switchMapSingleObserver) {
                return;
            }
            andSet.dispose();
        }

        public void innerError(SwitchMapSingleObserver<R> switchMapSingleObserver, Throwable th2) {
            if (!e.a(this.inner, switchMapSingleObserver, null) || !this.errors.addThrowable(th2)) {
                a.s(th2);
                return;
            }
            if (!this.delayErrors) {
                this.upstream.dispose();
                disposeInner();
            }
            drain();
        }

        @Override // mi.b
        public boolean isDisposed() {
            return this.cancelled;
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            if (!this.errors.addThrowable(th2)) {
                a.s(th2);
                return;
            }
            if (!this.delayErrors) {
                disposeInner();
            }
            this.done = true;
            drain();
        }

        @Override // ii.r
        public void onNext(T t10) {
            SwitchMapSingleObserver<R> switchMapSingleObserver;
            SwitchMapSingleObserver<R> switchMapSingleObserver2 = this.inner.get();
            if (switchMapSingleObserver2 != null) {
                switchMapSingleObserver2.dispose();
            }
            try {
                v vVar = (v) qi.a.e(this.mapper.apply(t10), "The mapper returned a null SingleSource");
                SwitchMapSingleObserver switchMapSingleObserver3 = new SwitchMapSingleObserver(this);
                do {
                    switchMapSingleObserver = this.inner.get();
                    if (switchMapSingleObserver == INNER_DISPOSED) {
                        return;
                    }
                } while (!e.a(this.inner, switchMapSingleObserver, switchMapSingleObserver3));
                vVar.b(switchMapSingleObserver3);
            } catch (Throwable th2) {
                ni.a.b(th2);
                this.upstream.dispose();
                this.inner.getAndSet((SwitchMapSingleObserver<R>) INNER_DISPOSED);
                onError(th2);
            }
        }

        @Override // ii.r
        public void onSubscribe(b bVar) {
            if (DisposableHelper.validate(this.upstream, bVar)) {
                this.upstream = bVar;
                this.downstream.onSubscribe(this);
            }
        }

        public SwitchMapSingleMainObserver(r<? super R> rVar, o<? super T, ? extends v<? extends R>> oVar, boolean z10) {
            this.downstream = rVar;
            this.mapper = oVar;
            this.delayErrors = z10;
        }

        public void drain() {
            boolean z10;
            if (getAndIncrement() != 0) {
                return;
            }
            r<? super R> rVar = this.downstream;
            AtomicThrowable atomicThrowable = this.errors;
            AtomicReference<SwitchMapSingleObserver<R>> atomicReference = this.inner;
            int iAddAndGet = 1;
            while (!this.cancelled) {
                if (atomicThrowable.get() != null && !this.delayErrors) {
                    rVar.onError(atomicThrowable.terminate());
                    return;
                }
                boolean z11 = this.done;
                SwitchMapSingleObserver<R> switchMapSingleObserver = atomicReference.get();
                if (switchMapSingleObserver == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z11 && z10) {
                    Throwable thTerminate = atomicThrowable.terminate();
                    if (thTerminate != null) {
                        rVar.onError(thTerminate);
                        return;
                    } else {
                        rVar.onComplete();
                        return;
                    }
                }
                if (!z10 && switchMapSingleObserver.item != null) {
                    e.a(atomicReference, switchMapSingleObserver, null);
                    rVar.onNext(switchMapSingleObserver.item);
                } else {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }
    }

    @Override // ii.k
    public void subscribeActual(r<? super R> rVar) {
        if (wi.a.c(this.f61114b, this.f61115c, rVar)) {
            return;
        }
        this.f61114b.subscribe(new SwitchMapSingleMainObserver(rVar, this.f61115c, this.f61116d));
    }

    public ObservableSwitchMapSingle(k<T> kVar, o<? super T, ? extends v<? extends R>> oVar, boolean z10) {
        this.f61114b = kVar;
        this.f61115c = oVar;
        this.f61116d = z10;
    }
}
