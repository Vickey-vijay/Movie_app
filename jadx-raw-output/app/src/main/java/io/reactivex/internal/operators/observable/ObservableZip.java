package io.reactivex.internal.operators.observable;

import ii.k;
import ii.p;
import ii.r;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import mi.b;
import oi.o;

/* JADX INFO: loaded from: classes8.dex */
public final class ObservableZip<T, R> extends k<R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p<? extends T>[] f61362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Iterable<? extends p<? extends T>> f61363c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o<? super Object[], ? extends R> f61364d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f61365e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f61366f;

    public static final class ZipCoordinator<T, R> extends AtomicInteger implements b {
        private static final long serialVersionUID = 2983708048395377667L;
        public volatile boolean cancelled;
        public final boolean delayError;
        public final r<? super R> downstream;
        public final a<T, R>[] observers;
        public final T[] row;
        public final o<? super Object[], ? extends R> zipper;

        public void cancelSources() {
            for (a<T, R> aVar : this.observers) {
                aVar.a();
            }
        }

        public boolean checkTerminated(boolean z10, boolean z11, r<? super R> rVar, boolean z12, a<?, ?> aVar) {
            if (this.cancelled) {
                cancel();
                return true;
            }
            if (!z10) {
                return false;
            }
            if (z12) {
                if (!z11) {
                    return false;
                }
                Throwable th2 = aVar.f61370e;
                cancel();
                if (th2 != null) {
                    rVar.onError(th2);
                } else {
                    rVar.onComplete();
                }
                return true;
            }
            Throwable th3 = aVar.f61370e;
            if (th3 != null) {
                cancel();
                rVar.onError(th3);
                return true;
            }
            if (!z11) {
                return false;
            }
            cancel();
            rVar.onComplete();
            return true;
        }

        public void clear() {
            for (a<T, R> aVar : this.observers) {
                aVar.f61368c.clear();
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
                clear();
            }
        }

        public void drain() {
            Throwable th2;
            if (getAndIncrement() != 0) {
                return;
            }
            a<T, R>[] aVarArr = this.observers;
            r<? super R> rVar = this.downstream;
            T[] tArr = this.row;
            boolean z10 = this.delayError;
            int iAddAndGet = 1;
            while (true) {
                int i10 = 0;
                int i11 = 0;
                for (a<T, R> aVar : aVarArr) {
                    if (tArr[i11] == null) {
                        boolean z11 = aVar.f61369d;
                        T tPoll = aVar.f61368c.poll();
                        boolean z12 = tPoll == null;
                        if (checkTerminated(z11, z12, rVar, z10, aVar)) {
                            return;
                        }
                        if (z12) {
                            i10++;
                        } else {
                            tArr[i11] = tPoll;
                        }
                    } else if (aVar.f61369d && !z10 && (th2 = aVar.f61370e) != null) {
                        cancel();
                        rVar.onError(th2);
                        return;
                    }
                    i11++;
                }
                if (i10 != 0) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    try {
                        rVar.onNext((Object) qi.a.e(this.zipper.apply(tArr.clone()), "The zipper returned a null value"));
                        Arrays.fill(tArr, (Object) null);
                    } catch (Throwable th3) {
                        ni.a.b(th3);
                        cancel();
                        rVar.onError(th3);
                        return;
                    }
                }
            }
        }

        @Override // mi.b
        public boolean isDisposed() {
            return this.cancelled;
        }

        public void subscribe(p<? extends T>[] pVarArr, int i10) {
            a<T, R>[] aVarArr = this.observers;
            int length = aVarArr.length;
            for (int i11 = 0; i11 < length; i11++) {
                aVarArr[i11] = new a<>(this, i10);
            }
            lazySet(0);
            this.downstream.onSubscribe(this);
            for (int i12 = 0; i12 < length && !this.cancelled; i12++) {
                pVarArr[i12].subscribe(aVarArr[i12]);
            }
        }

        public ZipCoordinator(r<? super R> rVar, o<? super Object[], ? extends R> oVar, int i10, boolean z10) {
            this.downstream = rVar;
            this.zipper = oVar;
            this.observers = new a[i10];
            this.row = (T[]) new Object[i10];
            this.delayError = z10;
        }

        public void cancel() {
            clear();
            cancelSources();
        }
    }

    public static final class a<T, R> implements r<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ZipCoordinator<T, R> f61367b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final zi.a<T> f61368c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public volatile boolean f61369d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Throwable f61370e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final AtomicReference<b> f61371f = new AtomicReference<>();

        @Override // ii.r
        public void onComplete() {
            this.f61369d = true;
            this.f61367b.drain();
        }

        public void a() {
            DisposableHelper.dispose(this.f61371f);
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            this.f61370e = th2;
            this.f61369d = true;
            this.f61367b.drain();
        }

        @Override // ii.r
        public void onNext(T t10) {
            this.f61368c.offer(t10);
            this.f61367b.drain();
        }

        @Override // ii.r
        public void onSubscribe(b bVar) {
            DisposableHelper.setOnce(this.f61371f, bVar);
        }

        public a(ZipCoordinator<T, R> zipCoordinator, int i10) {
            this.f61367b = zipCoordinator;
            this.f61368c = new zi.a<>(i10);
        }
    }

    @Override // ii.k
    public void subscribeActual(r<? super R> rVar) {
        int length;
        p<? extends T>[] pVarArr = this.f61362b;
        if (pVarArr == null) {
            pVarArr = new k[8];
            length = 0;
            for (p<? extends T> pVar : this.f61363c) {
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
        if (length == 0) {
            EmptyDisposable.complete(rVar);
        } else {
            new ZipCoordinator(rVar, this.f61364d, length, this.f61366f).subscribe(pVarArr, this.f61365e);
        }
    }

    public ObservableZip(p<? extends T>[] pVarArr, Iterable<? extends p<? extends T>> iterable, o<? super Object[], ? extends R> oVar, int i10, boolean z10) {
        this.f61362b = pVarArr;
        this.f61363c = iterable;
        this.f61364d = oVar;
        this.f61365e = i10;
        this.f61366f = z10;
    }
}
