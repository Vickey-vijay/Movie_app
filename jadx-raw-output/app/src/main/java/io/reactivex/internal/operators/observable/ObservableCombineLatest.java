package io.reactivex.internal.operators.observable;

import ii.k;
import ii.p;
import ii.r;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import mi.b;
import oi.o;

/* JADX INFO: loaded from: classes4.dex */
public final class ObservableCombineLatest<T, R> extends k<R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p<? extends T>[] f61145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Iterable<? extends p<? extends T>> f61146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o<? super Object[], ? extends R> f61147d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f61148e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f61149f;

    public static final class CombinerObserver<T, R> extends AtomicReference<b> implements r<T> {
        private static final long serialVersionUID = -4823716997131257941L;
        public final int index;
        public final LatestCoordinator<T, R> parent;

        @Override // ii.r
        public void onComplete() {
            this.parent.innerComplete(this.index);
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            this.parent.innerError(this.index, th2);
        }

        @Override // ii.r
        public void onNext(T t10) {
            this.parent.innerNext(this.index, t10);
        }

        public CombinerObserver(LatestCoordinator<T, R> latestCoordinator, int i10) {
            this.parent = latestCoordinator;
            this.index = i10;
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // ii.r
        public void onSubscribe(b bVar) {
            DisposableHelper.setOnce(this, bVar);
        }
    }

    public static final class LatestCoordinator<T, R> extends AtomicInteger implements b {
        private static final long serialVersionUID = 8567835998786448817L;
        public int active;
        public volatile boolean cancelled;
        public final o<? super Object[], ? extends R> combiner;
        public int complete;
        public final boolean delayError;
        public volatile boolean done;
        public final r<? super R> downstream;
        public final AtomicThrowable errors = new AtomicThrowable();
        public Object[] latest;
        public final CombinerObserver<T, R>[] observers;
        public final zi.a<Object[]> queue;

        public void clear(zi.a<?> aVar) {
            synchronized (this) {
                this.latest = null;
            }
            aVar.clear();
        }

        /* JADX WARN: Code duplicated, block: B:14:0x0019 A[Catch: all -> 0x0025, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:7:0x0007, B:12:0x0011, B:15:0x001b, B:14:0x0019), top: B:23:0x0001 }] */
        public void innerComplete(int i10) {
            synchronized (this) {
                Object[] objArr = this.latest;
                if (objArr == null) {
                    return;
                }
                boolean z10 = objArr[i10] == null;
                if (z10) {
                    this.done = true;
                } else {
                    int i11 = this.complete + 1;
                    this.complete = i11;
                    if (i11 == objArr.length) {
                        this.done = true;
                    }
                }
                if (z10) {
                    cancelSources();
                }
                drain();
            }
        }

        public void innerNext(int i10, T t10) {
            boolean z10;
            synchronized (this) {
                Object[] objArr = this.latest;
                if (objArr == null) {
                    return;
                }
                Object obj = objArr[i10];
                int i11 = this.active;
                if (obj == null) {
                    i11++;
                    this.active = i11;
                }
                objArr[i10] = t10;
                if (i11 == objArr.length) {
                    this.queue.offer((Object[]) objArr.clone());
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    drain();
                }
            }
        }

        public void cancelSources() {
            for (CombinerObserver<T, R> combinerObserver : this.observers) {
                combinerObserver.dispose();
            }
        }

        @Override // mi.b
        public void dispose() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            cancelSources();
            if (getAndIncrement() == 0) {
                clear(this.queue);
            }
        }

        /* JADX WARN: Code duplicated, block: B:18:0x0025 A[Catch: all -> 0x002a, TryCatch #0 {, blocks: (B:7:0x000e, B:9:0x0012, B:11:0x0014, B:16:0x001d, B:19:0x0027, B:18:0x0025), top: B:29:0x000e }] */
        public void innerError(int i10, Throwable th2) {
            if (!this.errors.addThrowable(th2)) {
                ej.a.s(th2);
                return;
            }
            boolean z10 = true;
            if (this.delayError) {
                synchronized (this) {
                    Object[] objArr = this.latest;
                    if (objArr == null) {
                        return;
                    }
                    boolean z11 = objArr[i10] == null;
                    if (z11) {
                        this.done = true;
                    } else {
                        int i11 = this.complete + 1;
                        this.complete = i11;
                        if (i11 == objArr.length) {
                            this.done = true;
                        }
                    }
                    z10 = z11;
                }
            }
            if (z10) {
                cancelSources();
            }
            drain();
        }

        @Override // mi.b
        public boolean isDisposed() {
            return this.cancelled;
        }

        public void subscribe(p<? extends T>[] pVarArr) {
            CombinerObserver<T, R>[] combinerObserverArr = this.observers;
            int length = combinerObserverArr.length;
            this.downstream.onSubscribe(this);
            for (int i10 = 0; i10 < length && !this.done && !this.cancelled; i10++) {
                pVarArr[i10].subscribe(combinerObserverArr[i10]);
            }
        }

        public LatestCoordinator(r<? super R> rVar, o<? super Object[], ? extends R> oVar, int i10, int i11, boolean z10) {
            this.downstream = rVar;
            this.combiner = oVar;
            this.delayError = z10;
            this.latest = new Object[i10];
            CombinerObserver<T, R>[] combinerObserverArr = new CombinerObserver[i10];
            for (int i12 = 0; i12 < i10; i12++) {
                combinerObserverArr[i12] = new CombinerObserver<>(this, i12);
            }
            this.observers = combinerObserverArr;
            this.queue = new zi.a<>(i11);
        }

        public void drain() {
            boolean z10;
            if (getAndIncrement() != 0) {
                return;
            }
            zi.a<Object[]> aVar = this.queue;
            r<? super R> rVar = this.downstream;
            boolean z11 = this.delayError;
            int iAddAndGet = 1;
            while (!this.cancelled) {
                if (!z11 && this.errors.get() != null) {
                    cancelSources();
                    clear(aVar);
                    rVar.onError(this.errors.terminate());
                    return;
                }
                boolean z12 = this.done;
                Object[] objArrPoll = aVar.poll();
                if (objArrPoll == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z12 && z10) {
                    clear(aVar);
                    Throwable thTerminate = this.errors.terminate();
                    if (thTerminate == null) {
                        rVar.onComplete();
                        return;
                    } else {
                        rVar.onError(thTerminate);
                        return;
                    }
                }
                if (z10) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    try {
                        rVar.onNext((Object) qi.a.e(this.combiner.apply(objArrPoll), "The combiner returned a null value"));
                    } catch (Throwable th2) {
                        ni.a.b(th2);
                        this.errors.addThrowable(th2);
                        cancelSources();
                        clear(aVar);
                        rVar.onError(this.errors.terminate());
                        return;
                    }
                }
            }
            clear(aVar);
        }
    }

    @Override // ii.k
    public void subscribeActual(r<? super R> rVar) {
        int length;
        p<? extends T>[] pVarArr = this.f61145b;
        if (pVarArr == null) {
            pVarArr = new k[8];
            length = 0;
            for (p<? extends T> pVar : this.f61146c) {
                if (length == pVarArr.length) {
                    p<? extends T>[] pVarArr2 = new p[(length >> 2) + length];
                    System.arraycopy(pVarArr, 0, pVarArr2, 0, length);
                    pVarArr = pVarArr2;
                }
                pVarArr[length] = pVar;
                length++;
            }
        } else {
            length = pVarArr.length;
        }
        int i10 = length;
        if (i10 == 0) {
            EmptyDisposable.complete(rVar);
        } else {
            new LatestCoordinator(rVar, this.f61147d, i10, this.f61148e, this.f61149f).subscribe(pVarArr);
        }
    }

    public ObservableCombineLatest(p<? extends T>[] pVarArr, Iterable<? extends p<? extends T>> iterable, o<? super Object[], ? extends R> oVar, int i10, boolean z10) {
        this.f61145b = pVarArr;
        this.f61146c = iterable;
        this.f61147d = oVar;
        this.f61148e = i10;
        this.f61149f = z10;
    }
}
