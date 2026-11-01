package io.reactivex.internal.operators.observable;

import aj.g;
import ii.p;
import ii.r;
import ii.s;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.BasicIntQueueDisposable;
import mi.b;
import ri.c;
import ri.h;

/* JADX INFO: loaded from: classes2.dex */
public final class ObservableObserveOn<T> extends xi.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f61214c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f61215d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f61216e;

    public static final class ObserveOnObserver<T> extends BasicIntQueueDisposable<T> implements r<T>, Runnable {
        private static final long serialVersionUID = 6576896619930983584L;
        public final int bufferSize;
        public final boolean delayError;
        public volatile boolean disposed;
        public volatile boolean done;
        public final r<? super T> downstream;
        public Throwable error;
        public boolean outputFused;
        public h<T> queue;
        public int sourceMode;
        public b upstream;
        public final s.c worker;

        public void drainFused() {
            int iAddAndGet = 1;
            while (!this.disposed) {
                boolean z10 = this.done;
                Throwable th2 = this.error;
                if (!this.delayError && z10 && th2 != null) {
                    this.disposed = true;
                    this.downstream.onError(this.error);
                    this.worker.dispose();
                    return;
                }
                this.downstream.onNext(null);
                if (z10) {
                    this.disposed = true;
                    Throwable th3 = this.error;
                    if (th3 != null) {
                        this.downstream.onError(th3);
                    } else {
                        this.downstream.onComplete();
                    }
                    this.worker.dispose();
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, ri.d
        public int requestFusion(int i10) {
            if ((i10 & 2) == 0) {
                return 0;
            }
            this.outputFused = true;
            return 2;
        }

        public boolean checkTerminated(boolean z10, boolean z11, r<? super T> rVar) {
            if (this.disposed) {
                this.queue.clear();
                return true;
            }
            if (!z10) {
                return false;
            }
            Throwable th2 = this.error;
            if (this.delayError) {
                if (!z11) {
                    return false;
                }
                this.disposed = true;
                if (th2 != null) {
                    rVar.onError(th2);
                } else {
                    rVar.onComplete();
                }
                this.worker.dispose();
                return true;
            }
            if (th2 != null) {
                this.disposed = true;
                this.queue.clear();
                rVar.onError(th2);
                this.worker.dispose();
                return true;
            }
            if (!z11) {
                return false;
            }
            this.disposed = true;
            rVar.onComplete();
            this.worker.dispose();
            return true;
        }

        @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, ri.h
        public void clear() {
            this.queue.clear();
        }

        @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, mi.b
        public void dispose() {
            if (this.disposed) {
                return;
            }
            this.disposed = true;
            this.upstream.dispose();
            this.worker.dispose();
            if (getAndIncrement() == 0) {
                this.queue.clear();
            }
        }

        public void drainNormal() {
            h<T> hVar = this.queue;
            r<? super T> rVar = this.downstream;
            int iAddAndGet = 1;
            while (!checkTerminated(this.done, hVar.isEmpty(), rVar)) {
                while (true) {
                    boolean z10 = this.done;
                    try {
                        T tPoll = hVar.poll();
                        boolean z11 = tPoll == null;
                        if (checkTerminated(z10, z11, rVar)) {
                            return;
                        }
                        if (z11) {
                            break;
                        } else {
                            rVar.onNext(tPoll);
                        }
                    } catch (Throwable th2) {
                        ni.a.b(th2);
                        this.disposed = true;
                        this.upstream.dispose();
                        hVar.clear();
                        rVar.onError(th2);
                        this.worker.dispose();
                        return;
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, mi.b
        public boolean isDisposed() {
            return this.disposed;
        }

        @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, ri.h
        public boolean isEmpty() {
            return this.queue.isEmpty();
        }

        @Override // ii.r
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            schedule();
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            if (this.done) {
                ej.a.s(th2);
                return;
            }
            this.error = th2;
            this.done = true;
            schedule();
        }

        @Override // ii.r
        public void onNext(T t10) {
            if (this.done) {
                return;
            }
            if (this.sourceMode != 2) {
                this.queue.offer(t10);
            }
            schedule();
        }

        @Override // ii.r
        public void onSubscribe(b bVar) {
            if (DisposableHelper.validate(this.upstream, bVar)) {
                this.upstream = bVar;
                if (bVar instanceof c) {
                    c cVar = (c) bVar;
                    int iRequestFusion = cVar.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.sourceMode = iRequestFusion;
                        this.queue = cVar;
                        this.done = true;
                        this.downstream.onSubscribe(this);
                        schedule();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.sourceMode = iRequestFusion;
                        this.queue = cVar;
                        this.downstream.onSubscribe(this);
                        return;
                    }
                }
                this.queue = new zi.a(this.bufferSize);
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, ri.h
        public T poll() throws Exception {
            return this.queue.poll();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.outputFused) {
                drainFused();
            } else {
                drainNormal();
            }
        }

        public ObserveOnObserver(r<? super T> rVar, s.c cVar, boolean z10, int i10) {
            this.downstream = rVar;
            this.worker = cVar;
            this.delayError = z10;
            this.bufferSize = i10;
        }

        public void schedule() {
            if (getAndIncrement() == 0) {
                this.worker.b(this);
            }
        }
    }

    @Override // ii.k
    public void subscribeActual(r<? super T> rVar) {
        s sVar = this.f61214c;
        if (sVar instanceof g) {
            this.f74487b.subscribe(rVar);
        } else {
            this.f74487b.subscribe(new ObserveOnObserver(rVar, sVar.a(), this.f61215d, this.f61216e));
        }
    }

    public ObservableObserveOn(p<T> pVar, s sVar, boolean z10, int i10) {
        super(pVar);
        this.f61214c = sVar;
        this.f61215d = z10;
        this.f61216e = i10;
    }
}
