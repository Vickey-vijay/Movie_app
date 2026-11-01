package io.reactivex.internal.operators.observable;

import a.i;
import androidx.lifecycle.e;
import ii.p;
import ii.r;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import mi.b;
import oi.o;
import ri.c;
import ri.h;

/* JADX INFO: loaded from: classes11.dex */
public final class ObservableSwitchMap<T, R> extends xi.a<T, R> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o<? super T, ? extends p<? extends R>> f61305c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f61306d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f61307e;

    public static final class SwitchMapInnerObserver<T, R> extends AtomicReference<b> implements r<R> {
        private static final long serialVersionUID = 3837284832786408377L;
        public final int bufferSize;
        public volatile boolean done;
        public final long index;
        public final SwitchMapObserver<T, R> parent;
        public volatile h<R> queue;

        @Override // ii.r
        public void onComplete() {
            if (this.index == this.parent.unique) {
                this.done = true;
                this.parent.drain();
            }
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            this.parent.innerError(this, th2);
        }

        @Override // ii.r
        public void onNext(R r10) {
            if (this.index == this.parent.unique) {
                if (r10 != null) {
                    this.queue.offer(r10);
                }
                this.parent.drain();
            }
        }

        public SwitchMapInnerObserver(SwitchMapObserver<T, R> switchMapObserver, long j10, int i10) {
            this.parent = switchMapObserver;
            this.index = j10;
            this.bufferSize = i10;
        }

        public void cancel() {
            DisposableHelper.dispose(this);
        }

        @Override // ii.r
        public void onSubscribe(b bVar) {
            if (DisposableHelper.setOnce(this, bVar)) {
                if (bVar instanceof c) {
                    c cVar = (c) bVar;
                    int iRequestFusion = cVar.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.queue = cVar;
                        this.done = true;
                        this.parent.drain();
                        return;
                    } else if (iRequestFusion == 2) {
                        this.queue = cVar;
                        return;
                    }
                }
                this.queue = new zi.a(this.bufferSize);
            }
        }
    }

    public static final class SwitchMapObserver<T, R> extends AtomicInteger implements r<T>, b {
        public static final SwitchMapInnerObserver<Object, Object> CANCELLED;
        private static final long serialVersionUID = -3491074160481096299L;
        public final int bufferSize;
        public volatile boolean cancelled;
        public final boolean delayErrors;
        public volatile boolean done;
        public final r<? super R> downstream;
        public final o<? super T, ? extends p<? extends R>> mapper;
        public volatile long unique;
        public b upstream;
        public final AtomicReference<SwitchMapInnerObserver<T, R>> active = new AtomicReference<>();
        public final AtomicThrowable errors = new AtomicThrowable();

        static {
            SwitchMapInnerObserver<Object, Object> switchMapInnerObserver = new SwitchMapInnerObserver<>(null, -1L, 1);
            CANCELLED = switchMapInnerObserver;
            switchMapInnerObserver.cancel();
        }

        @Override // mi.b
        public void dispose() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.upstream.dispose();
            disposeInner();
        }

        public void disposeInner() {
            SwitchMapInnerObserver<T, R> andSet;
            SwitchMapInnerObserver<T, R> switchMapInnerObserver = this.active.get();
            SwitchMapInnerObserver<Object, Object> switchMapInnerObserver2 = CANCELLED;
            if (switchMapInnerObserver == switchMapInnerObserver2 || (andSet = this.active.getAndSet((SwitchMapInnerObserver<T, R>) switchMapInnerObserver2)) == switchMapInnerObserver2 || andSet == null) {
                return;
            }
            andSet.cancel();
        }

        public void innerError(SwitchMapInnerObserver<T, R> switchMapInnerObserver, Throwable th2) {
            if (switchMapInnerObserver.index != this.unique || !this.errors.addThrowable(th2)) {
                ej.a.s(th2);
                return;
            }
            if (!this.delayErrors) {
                this.upstream.dispose();
            }
            switchMapInnerObserver.done = true;
            drain();
        }

        @Override // mi.b
        public boolean isDisposed() {
            return this.cancelled;
        }

        @Override // ii.r
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            drain();
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            if (this.done || !this.errors.addThrowable(th2)) {
                ej.a.s(th2);
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
            SwitchMapInnerObserver<T, R> switchMapInnerObserver;
            long j10 = this.unique + 1;
            this.unique = j10;
            SwitchMapInnerObserver<T, R> switchMapInnerObserver2 = this.active.get();
            if (switchMapInnerObserver2 != null) {
                switchMapInnerObserver2.cancel();
            }
            try {
                p pVar = (p) qi.a.e(this.mapper.apply(t10), "The ObservableSource returned is null");
                SwitchMapInnerObserver switchMapInnerObserver3 = new SwitchMapInnerObserver(this, j10, this.bufferSize);
                do {
                    switchMapInnerObserver = this.active.get();
                    if (switchMapInnerObserver == CANCELLED) {
                        return;
                    }
                } while (!e.a(this.active, switchMapInnerObserver, switchMapInnerObserver3));
                pVar.subscribe(switchMapInnerObserver3);
            } catch (Throwable th2) {
                ni.a.b(th2);
                this.upstream.dispose();
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

        public SwitchMapObserver(r<? super R> rVar, o<? super T, ? extends p<? extends R>> oVar, int i10, boolean z10) {
            this.downstream = rVar;
            this.mapper = oVar;
            this.bufferSize = i10;
            this.delayErrors = z10;
        }

        /* JADX WARN: Code duplicated, block: B:101:0x000f A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:95:0x00e9 A[SYNTHETIC] */
        public void drain() {
            h<R> hVar;
            i iVarPoll;
            boolean z10;
            boolean z11;
            if (getAndIncrement() != 0) {
                return;
            }
            r<? super R> rVar = this.downstream;
            AtomicReference<SwitchMapInnerObserver<T, R>> atomicReference = this.active;
            boolean z12 = this.delayErrors;
            int iAddAndGet = 1;
            while (!this.cancelled) {
                if (this.done) {
                    if (atomicReference.get() == null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z12) {
                        if (z11) {
                            Throwable th2 = this.errors.get();
                            if (th2 != null) {
                                rVar.onError(th2);
                                return;
                            } else {
                                rVar.onComplete();
                                return;
                            }
                        }
                    } else if (this.errors.get() != null) {
                        rVar.onError(this.errors.terminate());
                        return;
                    } else if (z11) {
                        rVar.onComplete();
                        return;
                    }
                }
                SwitchMapInnerObserver<T, R> switchMapInnerObserver = atomicReference.get();
                if (switchMapInnerObserver != null && (hVar = switchMapInnerObserver.queue) != null) {
                    if (switchMapInnerObserver.done) {
                        boolean zIsEmpty = hVar.isEmpty();
                        if (z12) {
                            if (zIsEmpty) {
                                e.a(atomicReference, switchMapInnerObserver, null);
                            }
                        } else if (this.errors.get() != null) {
                            rVar.onError(this.errors.terminate());
                            return;
                        } else if (zIsEmpty) {
                            e.a(atomicReference, switchMapInnerObserver, null);
                        }
                    }
                    boolean z13 = false;
                    while (!this.cancelled) {
                        if (switchMapInnerObserver == atomicReference.get()) {
                            if (!z12 && this.errors.get() != null) {
                                rVar.onError(this.errors.terminate());
                                return;
                            }
                            boolean z14 = switchMapInnerObserver.done;
                            try {
                                iVarPoll = hVar.poll();
                            } catch (Throwable th3) {
                                ni.a.b(th3);
                                this.errors.addThrowable(th3);
                                e.a(atomicReference, switchMapInnerObserver, null);
                                if (!z12) {
                                    disposeInner();
                                    this.upstream.dispose();
                                    this.done = true;
                                } else {
                                    switchMapInnerObserver.cancel();
                                }
                                z13 = true;
                                iVarPoll = null;
                            }
                            if (iVarPoll == null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z14 && z10) {
                                e.a(atomicReference, switchMapInnerObserver, null);
                            } else if (!z10) {
                                rVar.onNext(iVarPoll);
                            }
                            if (z13) {
                                continue;
                            }
                        }
                        z13 = true;
                        if (z13) {
                            continue;
                        }
                    }
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
    }

    @Override // ii.k
    public void subscribeActual(r<? super R> rVar) {
        if (ObservableScalarXMap.b(this.f74487b, rVar, this.f61305c)) {
            return;
        }
        this.f74487b.subscribe(new SwitchMapObserver(rVar, this.f61305c, this.f61306d, this.f61307e));
    }

    public ObservableSwitchMap(p<T> pVar, o<? super T, ? extends p<? extends R>> oVar, int i10, boolean z10) {
        super(pVar);
        this.f61305c = oVar;
        this.f61306d = i10;
        this.f61307e = z10;
    }
}
