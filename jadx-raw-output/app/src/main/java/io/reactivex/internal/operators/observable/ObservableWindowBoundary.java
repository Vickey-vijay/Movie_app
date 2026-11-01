package io.reactivex.internal.operators.observable;

import dj.c;
import ii.k;
import ii.p;
import ii.r;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.subjects.UnicastSubject;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import mi.b;

/* JADX INFO: loaded from: classes9.dex */
public final class ObservableWindowBoundary<T, B> extends xi.a<T, k<T>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p<B> f61346c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f61347d;

    public static final class WindowBoundaryMainObserver<T, B> extends AtomicInteger implements r<T>, b, Runnable {
        public static final Object NEXT_WINDOW = new Object();
        private static final long serialVersionUID = 2233020065421370272L;
        public final int capacityHint;
        public volatile boolean done;
        public final r<? super k<T>> downstream;
        public UnicastSubject<T> window;
        public final a<T, B> boundaryObserver = new a<>(this);
        public final AtomicReference<b> upstream = new AtomicReference<>();
        public final AtomicInteger windows = new AtomicInteger(1);
        public final MpscLinkedQueue<Object> queue = new MpscLinkedQueue<>();
        public final AtomicThrowable errors = new AtomicThrowable();
        public final AtomicBoolean stopWindows = new AtomicBoolean();

        @Override // mi.b
        public void dispose() {
            if (this.stopWindows.compareAndSet(false, true)) {
                this.boundaryObserver.dispose();
                if (this.windows.decrementAndGet() == 0) {
                    DisposableHelper.dispose(this.upstream);
                }
            }
        }

        public void innerComplete() {
            DisposableHelper.dispose(this.upstream);
            this.done = true;
            drain();
        }

        public void innerError(Throwable th2) {
            DisposableHelper.dispose(this.upstream);
            if (!this.errors.addThrowable(th2)) {
                ej.a.s(th2);
            } else {
                this.done = true;
                drain();
            }
        }

        public void innerNext() {
            this.queue.offer(NEXT_WINDOW);
            drain();
        }

        @Override // mi.b
        public boolean isDisposed() {
            return this.stopWindows.get();
        }

        @Override // ii.r
        public void onComplete() {
            this.boundaryObserver.dispose();
            this.done = true;
            drain();
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            this.boundaryObserver.dispose();
            if (!this.errors.addThrowable(th2)) {
                ej.a.s(th2);
            } else {
                this.done = true;
                drain();
            }
        }

        @Override // ii.r
        public void onNext(T t10) {
            this.queue.offer(t10);
            drain();
        }

        @Override // ii.r
        public void onSubscribe(b bVar) {
            if (DisposableHelper.setOnce(this.upstream, bVar)) {
                innerNext();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.windows.decrementAndGet() == 0) {
                DisposableHelper.dispose(this.upstream);
            }
        }

        public WindowBoundaryMainObserver(r<? super k<T>> rVar, int i10) {
            this.downstream = rVar;
            this.capacityHint = i10;
        }

        public void drain() {
            boolean z10;
            if (getAndIncrement() != 0) {
                return;
            }
            r<? super k<T>> rVar = this.downstream;
            MpscLinkedQueue<Object> mpscLinkedQueue = this.queue;
            AtomicThrowable atomicThrowable = this.errors;
            int iAddAndGet = 1;
            while (this.windows.get() != 0) {
                UnicastSubject<T> unicastSubject = this.window;
                boolean z11 = this.done;
                if (z11 && atomicThrowable.get() != null) {
                    mpscLinkedQueue.clear();
                    Throwable thTerminate = atomicThrowable.terminate();
                    if (unicastSubject != null) {
                        this.window = null;
                        unicastSubject.onError(thTerminate);
                    }
                    rVar.onError(thTerminate);
                    return;
                }
                Object objPoll = mpscLinkedQueue.poll();
                if (objPoll == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z11 && z10) {
                    Throwable thTerminate2 = atomicThrowable.terminate();
                    if (thTerminate2 == null) {
                        if (unicastSubject != null) {
                            this.window = null;
                            unicastSubject.onComplete();
                        }
                        rVar.onComplete();
                        return;
                    }
                    if (unicastSubject != null) {
                        this.window = null;
                        unicastSubject.onError(thTerminate2);
                    }
                    rVar.onError(thTerminate2);
                    return;
                }
                if (z10) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else if (objPoll != NEXT_WINDOW) {
                    unicastSubject.onNext((T) objPoll);
                } else {
                    if (unicastSubject != null) {
                        this.window = null;
                        unicastSubject.onComplete();
                    }
                    if (!this.stopWindows.get()) {
                        UnicastSubject<T> unicastSubjectE = UnicastSubject.e(this.capacityHint, this);
                        this.window = unicastSubjectE;
                        this.windows.getAndIncrement();
                        rVar.onNext(unicastSubjectE);
                    }
                }
            }
            mpscLinkedQueue.clear();
            this.window = null;
        }
    }

    public static final class a<T, B> extends c<B> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final WindowBoundaryMainObserver<T, B> f61348c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f61349d;

        @Override // ii.r
        public void onComplete() {
            if (this.f61349d) {
                return;
            }
            this.f61349d = true;
            this.f61348c.innerComplete();
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            if (this.f61349d) {
                ej.a.s(th2);
            } else {
                this.f61349d = true;
                this.f61348c.innerError(th2);
            }
        }

        @Override // ii.r
        public void onNext(B b10) {
            if (this.f61349d) {
                return;
            }
            this.f61348c.innerNext();
        }

        public a(WindowBoundaryMainObserver<T, B> windowBoundaryMainObserver) {
            this.f61348c = windowBoundaryMainObserver;
        }
    }

    @Override // ii.k
    public void subscribeActual(r<? super k<T>> rVar) {
        WindowBoundaryMainObserver windowBoundaryMainObserver = new WindowBoundaryMainObserver(rVar, this.f61347d);
        rVar.onSubscribe(windowBoundaryMainObserver);
        this.f61346c.subscribe(windowBoundaryMainObserver.boundaryObserver);
        this.f74487b.subscribe(windowBoundaryMainObserver);
    }

    public ObservableWindowBoundary(p<T> pVar, p<B> pVar2, int i10) {
        super(pVar);
        this.f61346c = pVar2;
        this.f61347d = i10;
    }
}
