package io.reactivex.internal.operators.observable;

import androidx.lifecycle.e;
import bj.g;
import ii.k;
import ii.r;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.util.NotificationLite;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import mi.b;

/* JADX INFO: loaded from: classes7.dex */
public final class ObservableCache<T> extends xi.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a<T> f61136c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f61137d;

    public static final class ReplayDisposable<T> extends AtomicInteger implements b {
        private static final long serialVersionUID = 7058506693698832024L;
        public volatile boolean cancelled;
        public final r<? super T> child;
        public Object[] currentBuffer;
        public int currentIndexInBuffer;
        public int index;
        public final a<T> state;

        @Override // mi.b
        public void dispose() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.state.f(this);
        }

        @Override // mi.b
        public boolean isDisposed() {
            return this.cancelled;
        }

        public ReplayDisposable(r<? super T> rVar, a<T> aVar) {
            this.child = rVar;
            this.state = aVar;
        }

        public void replay() {
            if (getAndIncrement() != 0) {
                return;
            }
            r<? super T> rVar = this.child;
            int iAddAndGet = 1;
            while (!this.cancelled) {
                int iC = this.state.c();
                if (iC != 0) {
                    Object[] objArrB = this.currentBuffer;
                    if (objArrB == null) {
                        objArrB = this.state.b();
                        this.currentBuffer = objArrB;
                    }
                    int length = objArrB.length - 1;
                    int i10 = this.index;
                    int i11 = this.currentIndexInBuffer;
                    while (i10 < iC) {
                        if (this.cancelled) {
                            return;
                        }
                        if (i11 == length) {
                            objArrB = (Object[]) objArrB[length];
                            i11 = 0;
                        }
                        if (NotificationLite.accept(objArrB[i11], rVar)) {
                            return;
                        }
                        i11++;
                        i10++;
                    }
                    if (this.cancelled) {
                        return;
                    }
                    this.index = i10;
                    this.currentIndexInBuffer = i11;
                    this.currentBuffer = objArrB;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
    }

    public static final class a<T> extends g implements r<T> {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final ReplayDisposable[] f61138l = new ReplayDisposable[0];

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final ReplayDisposable[] f61139m = new ReplayDisposable[0];

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final k<? extends T> f61140g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final SequentialDisposable f61141h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final AtomicReference<ReplayDisposable<T>[]> f61142i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public volatile boolean f61143j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f61144k;

        public boolean d(ReplayDisposable<T> replayDisposable) {
            ReplayDisposable<T>[] replayDisposableArr;
            ReplayDisposable[] replayDisposableArr2;
            do {
                replayDisposableArr = this.f61142i.get();
                if (replayDisposableArr == f61139m) {
                    return false;
                }
                int length = replayDisposableArr.length;
                replayDisposableArr2 = new ReplayDisposable[length + 1];
                System.arraycopy(replayDisposableArr, 0, replayDisposableArr2, 0, length);
                replayDisposableArr2[length] = replayDisposable;
            } while (!e.a(this.f61142i, replayDisposableArr, replayDisposableArr2));
            return true;
        }

        public void e() {
            this.f61140g.subscribe(this);
            this.f61143j = true;
        }

        public void f(ReplayDisposable<T> replayDisposable) {
            ReplayDisposable<T>[] replayDisposableArr;
            ReplayDisposable[] replayDisposableArr2;
            do {
                replayDisposableArr = this.f61142i.get();
                int length = replayDisposableArr.length;
                if (length == 0) {
                    return;
                }
                int i10 = -1;
                for (int i11 = 0; i11 < length; i11++) {
                    if (replayDisposableArr[i11].equals(replayDisposable)) {
                        i10 = i11;
                        break;
                    }
                }
                if (i10 < 0) {
                    return;
                }
                if (length == 1) {
                    replayDisposableArr2 = f61138l;
                } else {
                    ReplayDisposable[] replayDisposableArr3 = new ReplayDisposable[length - 1];
                    System.arraycopy(replayDisposableArr, 0, replayDisposableArr3, 0, i10);
                    System.arraycopy(replayDisposableArr, i10 + 1, replayDisposableArr3, i10, (length - i10) - 1);
                    replayDisposableArr2 = replayDisposableArr3;
                }
            } while (!e.a(this.f61142i, replayDisposableArr, replayDisposableArr2));
        }

        @Override // ii.r
        public void onComplete() {
            if (this.f61144k) {
                return;
            }
            this.f61144k = true;
            a(NotificationLite.complete());
            this.f61141h.dispose();
            for (ReplayDisposable<T> replayDisposable : this.f61142i.getAndSet(f61139m)) {
                replayDisposable.replay();
            }
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            if (this.f61144k) {
                return;
            }
            this.f61144k = true;
            a(NotificationLite.error(th2));
            this.f61141h.dispose();
            for (ReplayDisposable<T> replayDisposable : this.f61142i.getAndSet(f61139m)) {
                replayDisposable.replay();
            }
        }

        @Override // ii.r
        public void onNext(T t10) {
            if (this.f61144k) {
                return;
            }
            a(NotificationLite.next(t10));
            for (ReplayDisposable<T> replayDisposable : this.f61142i.get()) {
                replayDisposable.replay();
            }
        }

        @Override // ii.r
        public void onSubscribe(b bVar) {
            this.f61141h.update(bVar);
        }

        public a(k<? extends T> kVar, int i10) {
            super(i10);
            this.f61140g = kVar;
            this.f61142i = new AtomicReference<>(f61138l);
            this.f61141h = new SequentialDisposable();
        }
    }

    public static <T> k<T> b(k<T> kVar) {
        return c(kVar, 16);
    }

    public static <T> k<T> c(k<T> kVar, int i10) {
        qi.a.f(i10, "capacityHint");
        return ej.a.o(new ObservableCache(kVar, new a(kVar, i10)));
    }

    @Override // ii.k
    public void subscribeActual(r<? super T> rVar) {
        ReplayDisposable<T> replayDisposable = new ReplayDisposable<>(rVar, this.f61136c);
        rVar.onSubscribe(replayDisposable);
        this.f61136c.d(replayDisposable);
        if (!this.f61137d.get() && this.f61137d.compareAndSet(false, true)) {
            this.f61136c.e();
        }
        replayDisposable.replay();
    }

    public ObservableCache(k<T> kVar, a<T> aVar) {
        super(kVar);
        this.f61136c = aVar;
        this.f61137d = new AtomicBoolean();
    }
}
