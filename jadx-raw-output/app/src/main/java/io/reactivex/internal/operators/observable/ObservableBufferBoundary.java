package io.reactivex.internal.operators.observable;

import ii.k;
import ii.p;
import ii.r;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import mi.b;
import oi.o;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableBufferBoundary<T, U extends Collection<? super T>, Open, Close> extends xi.a<T, U> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Callable<U> f61133c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p<? extends Open> f61134d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o<? super Open, ? extends p<? extends Close>> f61135e;

    public static final class BufferBoundaryObserver<T, C extends Collection<? super T>, Open, Close> extends AtomicInteger implements r<T>, b {
        private static final long serialVersionUID = -8466418554264089604L;
        public final o<? super Open, ? extends p<? extends Close>> bufferClose;
        public final p<? extends Open> bufferOpen;
        public final Callable<C> bufferSupplier;
        public volatile boolean cancelled;
        public volatile boolean done;
        public final r<? super C> downstream;
        public long index;
        public final zi.a<C> queue = new zi.a<>(k.bufferSize());
        public final mi.a observers = new mi.a();
        public final AtomicReference<b> upstream = new AtomicReference<>();
        public Map<Long, C> buffers = new LinkedHashMap();
        public final AtomicThrowable errors = new AtomicThrowable();

        public static final class BufferOpenObserver<Open> extends AtomicReference<b> implements r<Open>, b {
            private static final long serialVersionUID = -8498650778633225126L;
            public final BufferBoundaryObserver<?, ?, Open, ?> parent;

            @Override // ii.r
            public void onComplete() {
                lazySet(DisposableHelper.DISPOSED);
                this.parent.openComplete(this);
            }

            @Override // ii.r
            public void onError(Throwable th2) {
                lazySet(DisposableHelper.DISPOSED);
                this.parent.boundaryError(this, th2);
            }

            @Override // ii.r
            public void onNext(Open open) {
                this.parent.open(open);
            }

            public BufferOpenObserver(BufferBoundaryObserver<?, ?, Open, ?> bufferBoundaryObserver) {
                this.parent = bufferBoundaryObserver;
            }

            @Override // mi.b
            public void dispose() {
                DisposableHelper.dispose(this);
            }

            @Override // mi.b
            public boolean isDisposed() {
                if (get() == DisposableHelper.DISPOSED) {
                    return true;
                }
                return false;
            }

            @Override // ii.r
            public void onSubscribe(b bVar) {
                DisposableHelper.setOnce(this, bVar);
            }
        }

        @Override // ii.r
        public void onNext(T t10) {
            synchronized (this) {
                Map<Long, C> map = this.buffers;
                if (map == null) {
                    return;
                }
                Iterator<C> it = map.values().iterator();
                while (it.hasNext()) {
                    it.next().add(t10);
                }
            }
        }

        public void boundaryError(b bVar, Throwable th2) {
            DisposableHelper.dispose(this.upstream);
            this.observers.delete(bVar);
            onError(th2);
        }

        public void close(BufferCloseObserver<T, C> bufferCloseObserver, long j10) {
            boolean z10;
            this.observers.delete(bufferCloseObserver);
            if (this.observers.e() == 0) {
                DisposableHelper.dispose(this.upstream);
                z10 = true;
            } else {
                z10 = false;
            }
            synchronized (this) {
                Map<Long, C> map = this.buffers;
                if (map == null) {
                    return;
                }
                this.queue.offer(map.remove(Long.valueOf(j10)));
                if (z10) {
                    this.done = true;
                }
                drain();
            }
        }

        @Override // mi.b
        public void dispose() {
            if (DisposableHelper.dispose(this.upstream)) {
                this.cancelled = true;
                this.observers.dispose();
                synchronized (this) {
                    this.buffers = null;
                }
                if (getAndIncrement() != 0) {
                    this.queue.clear();
                }
            }
        }

        @Override // mi.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(this.upstream.get());
        }

        @Override // ii.r
        public void onComplete() {
            this.observers.dispose();
            synchronized (this) {
                Map<Long, C> map = this.buffers;
                if (map == null) {
                    return;
                }
                Iterator<C> it = map.values().iterator();
                while (it.hasNext()) {
                    this.queue.offer(it.next());
                }
                this.buffers = null;
                this.done = true;
                drain();
            }
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            if (!this.errors.addThrowable(th2)) {
                ej.a.s(th2);
                return;
            }
            this.observers.dispose();
            synchronized (this) {
                this.buffers = null;
            }
            this.done = true;
            drain();
        }

        @Override // ii.r
        public void onSubscribe(b bVar) {
            if (DisposableHelper.setOnce(this.upstream, bVar)) {
                BufferOpenObserver bufferOpenObserver = new BufferOpenObserver(this);
                this.observers.b(bufferOpenObserver);
                this.bufferOpen.subscribe(bufferOpenObserver);
            }
        }

        public void open(Open open) {
            try {
                Collection collection = (Collection) qi.a.e(this.bufferSupplier.call(), "The bufferSupplier returned a null Collection");
                p pVar = (p) qi.a.e(this.bufferClose.apply(open), "The bufferClose returned a null ObservableSource");
                long j10 = this.index;
                this.index = 1 + j10;
                synchronized (this) {
                    Map<Long, C> map = this.buffers;
                    if (map == null) {
                        return;
                    }
                    map.put(Long.valueOf(j10), (C) collection);
                    BufferCloseObserver bufferCloseObserver = new BufferCloseObserver(this, j10);
                    this.observers.b(bufferCloseObserver);
                    pVar.subscribe(bufferCloseObserver);
                }
            } catch (Throwable th2) {
                ni.a.b(th2);
                DisposableHelper.dispose(this.upstream);
                onError(th2);
            }
        }

        public void openComplete(BufferOpenObserver<Open> bufferOpenObserver) {
            this.observers.delete(bufferOpenObserver);
            if (this.observers.e() == 0) {
                DisposableHelper.dispose(this.upstream);
                this.done = true;
                drain();
            }
        }

        public BufferBoundaryObserver(r<? super C> rVar, p<? extends Open> pVar, o<? super Open, ? extends p<? extends Close>> oVar, Callable<C> callable) {
            this.downstream = rVar;
            this.bufferSupplier = callable;
            this.bufferOpen = pVar;
            this.bufferClose = oVar;
        }

        public void drain() {
            boolean z10;
            if (getAndIncrement() != 0) {
                return;
            }
            r<? super C> rVar = this.downstream;
            zi.a<C> aVar = this.queue;
            int iAddAndGet = 1;
            while (!this.cancelled) {
                boolean z11 = this.done;
                if (z11 && this.errors.get() != null) {
                    aVar.clear();
                    rVar.onError(this.errors.terminate());
                    return;
                }
                C cPoll = aVar.poll();
                if (cPoll == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z11 && z10) {
                    rVar.onComplete();
                    return;
                } else if (z10) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    rVar.onNext(cPoll);
                }
            }
            aVar.clear();
        }
    }

    public static final class BufferCloseObserver<T, C extends Collection<? super T>> extends AtomicReference<b> implements r<Object>, b {
        private static final long serialVersionUID = -8498650778633225126L;
        public final long index;
        public final BufferBoundaryObserver<T, C, ?, ?> parent;

        public BufferCloseObserver(BufferBoundaryObserver<T, C, ?, ?> bufferBoundaryObserver, long j10) {
            this.parent = bufferBoundaryObserver;
            this.index = j10;
        }

        @Override // mi.b
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // mi.b
        public boolean isDisposed() {
            if (get() == DisposableHelper.DISPOSED) {
                return true;
            }
            return false;
        }

        @Override // ii.r
        public void onComplete() {
            b bVar = get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (bVar != disposableHelper) {
                lazySet(disposableHelper);
                this.parent.close(this, this.index);
            }
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            b bVar = get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (bVar != disposableHelper) {
                lazySet(disposableHelper);
                this.parent.boundaryError(this, th2);
            } else {
                ej.a.s(th2);
            }
        }

        @Override // ii.r
        public void onNext(Object obj) {
            b bVar = get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (bVar != disposableHelper) {
                lazySet(disposableHelper);
                bVar.dispose();
                this.parent.close(this, this.index);
            }
        }

        @Override // ii.r
        public void onSubscribe(b bVar) {
            DisposableHelper.setOnce(this, bVar);
        }
    }

    @Override // ii.k
    public void subscribeActual(r<? super U> rVar) {
        BufferBoundaryObserver bufferBoundaryObserver = new BufferBoundaryObserver(rVar, this.f61134d, this.f61135e, this.f61133c);
        rVar.onSubscribe(bufferBoundaryObserver);
        this.f74487b.subscribe(bufferBoundaryObserver);
    }

    public ObservableBufferBoundary(p<T> pVar, p<? extends Open> pVar2, o<? super Open, ? extends p<? extends Close>> oVar, Callable<U> callable) {
        super(pVar);
        this.f61134d = pVar2;
        this.f61135e = oVar;
        this.f61133c = callable;
    }
}
