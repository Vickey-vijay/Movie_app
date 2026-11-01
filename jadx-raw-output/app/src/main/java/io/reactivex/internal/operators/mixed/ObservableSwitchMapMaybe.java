package io.reactivex.internal.operators.mixed;

import androidx.lifecycle.e;
import ej.a;
import ii.h;
import ii.i;
import ii.k;
import ii.r;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import mi.b;
import oi.o;

/* JADX INFO: loaded from: classes6.dex */
public final class ObservableSwitchMapMaybe<T, R> extends k<R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k<T> f61111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o<? super T, ? extends i<? extends R>> f61112c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f61113d;

    public static final class SwitchMapMaybeMainObserver<T, R> extends AtomicInteger implements r<T>, b {
        public static final SwitchMapMaybeObserver<Object> INNER_DISPOSED = new SwitchMapMaybeObserver<>(null);
        private static final long serialVersionUID = -5402190102429853762L;
        public volatile boolean cancelled;
        public final boolean delayErrors;
        public volatile boolean done;
        public final r<? super R> downstream;
        public final AtomicThrowable errors = new AtomicThrowable();
        public final AtomicReference<SwitchMapMaybeObserver<R>> inner = new AtomicReference<>();
        public final o<? super T, ? extends i<? extends R>> mapper;
        public b upstream;

        public static final class SwitchMapMaybeObserver<R> extends AtomicReference<b> implements h<R> {
            private static final long serialVersionUID = 8042919737683345351L;
            public volatile R item;
            public final SwitchMapMaybeMainObserver<?, R> parent;

            @Override // ii.h
            public void onComplete() {
                this.parent.innerComplete(this);
            }

            @Override // ii.h
            public void onError(Throwable th2) {
                this.parent.innerError(this, th2);
            }

            @Override // ii.h
            public void onSuccess(R r10) {
                this.item = r10;
                this.parent.drain();
            }

            public SwitchMapMaybeObserver(SwitchMapMaybeMainObserver<?, R> switchMapMaybeMainObserver) {
                this.parent = switchMapMaybeMainObserver;
            }

            public void dispose() {
                DisposableHelper.dispose(this);
            }

            @Override // ii.h
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
            AtomicReference<SwitchMapMaybeObserver<R>> atomicReference = this.inner;
            SwitchMapMaybeObserver<Object> switchMapMaybeObserver = INNER_DISPOSED;
            SwitchMapMaybeObserver<R> andSet = atomicReference.getAndSet((SwitchMapMaybeObserver<R>) switchMapMaybeObserver);
            if (andSet == null || andSet == switchMapMaybeObserver) {
                return;
            }
            andSet.dispose();
        }

        public void innerComplete(SwitchMapMaybeObserver<R> switchMapMaybeObserver) {
            if (e.a(this.inner, switchMapMaybeObserver, null)) {
                drain();
            }
        }

        public void innerError(SwitchMapMaybeObserver<R> switchMapMaybeObserver, Throwable th2) {
            if (!e.a(this.inner, switchMapMaybeObserver, null) || !this.errors.addThrowable(th2)) {
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
            SwitchMapMaybeObserver<R> switchMapMaybeObserver;
            SwitchMapMaybeObserver<R> switchMapMaybeObserver2 = this.inner.get();
            if (switchMapMaybeObserver2 != null) {
                switchMapMaybeObserver2.dispose();
            }
            try {
                i iVar = (i) qi.a.e(this.mapper.apply(t10), "The mapper returned a null MaybeSource");
                SwitchMapMaybeObserver switchMapMaybeObserver3 = new SwitchMapMaybeObserver(this);
                do {
                    switchMapMaybeObserver = this.inner.get();
                    if (switchMapMaybeObserver == INNER_DISPOSED) {
                        return;
                    }
                } while (!e.a(this.inner, switchMapMaybeObserver, switchMapMaybeObserver3));
                iVar.b(switchMapMaybeObserver3);
            } catch (Throwable th2) {
                ni.a.b(th2);
                this.upstream.dispose();
                this.inner.getAndSet((SwitchMapMaybeObserver<R>) INNER_DISPOSED);
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

        public SwitchMapMaybeMainObserver(r<? super R> rVar, o<? super T, ? extends i<? extends R>> oVar, boolean z10) {
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
            AtomicReference<SwitchMapMaybeObserver<R>> atomicReference = this.inner;
            int iAddAndGet = 1;
            while (!this.cancelled) {
                if (atomicThrowable.get() != null && !this.delayErrors) {
                    rVar.onError(atomicThrowable.terminate());
                    return;
                }
                boolean z11 = this.done;
                SwitchMapMaybeObserver<R> switchMapMaybeObserver = atomicReference.get();
                if (switchMapMaybeObserver == null) {
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
                if (!z10 && switchMapMaybeObserver.item != null) {
                    e.a(atomicReference, switchMapMaybeObserver, null);
                    rVar.onNext(switchMapMaybeObserver.item);
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
        if (wi.a.b(this.f61111b, this.f61112c, rVar)) {
            return;
        }
        this.f61111b.subscribe(new SwitchMapMaybeMainObserver(rVar, this.f61112c, this.f61113d));
    }

    public ObservableSwitchMapMaybe(k<T> kVar, o<? super T, ? extends i<? extends R>> oVar, boolean z10) {
        this.f61111b = kVar;
        this.f61112c = oVar;
        this.f61113d = z10;
    }
}
