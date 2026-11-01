package io.reactivex.subjects;

import androidx.lifecycle.e;
import hj.c;
import ii.k;
import ii.r;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.observers.BasicIntQueueDisposable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import mi.b;
import ri.h;
import zi.a;

/* JADX INFO: loaded from: classes9.dex */
public final class UnicastSubject<T> extends c<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a<T> f61423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference<r<? super T>> f61424c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference<Runnable> f61425d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f61426e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f61427f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f61428g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Throwable f61429h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f61430i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final BasicIntQueueDisposable<T> f61431j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f61432k;

    public final class UnicastQueueDisposable extends BasicIntQueueDisposable<T> {
        private static final long serialVersionUID = 7926949470189395511L;

        @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, ri.d
        public int requestFusion(int i10) {
            if ((i10 & 2) == 0) {
                return 0;
            }
            UnicastSubject.this.f61432k = true;
            return 2;
        }

        public UnicastQueueDisposable() {
        }

        @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, ri.h
        public void clear() {
            UnicastSubject.this.f61423b.clear();
        }

        @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, mi.b
        public void dispose() {
            if (UnicastSubject.this.f61427f) {
                return;
            }
            UnicastSubject.this.f61427f = true;
            UnicastSubject.this.f();
            UnicastSubject.this.f61424c.lazySet(null);
            if (UnicastSubject.this.f61431j.getAndIncrement() == 0) {
                UnicastSubject.this.f61424c.lazySet(null);
                UnicastSubject.this.f61423b.clear();
            }
        }

        @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, mi.b
        public boolean isDisposed() {
            return UnicastSubject.this.f61427f;
        }

        @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, ri.h
        public boolean isEmpty() {
            return UnicastSubject.this.f61423b.isEmpty();
        }

        @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, ri.h
        public T poll() throws Exception {
            return UnicastSubject.this.f61423b.poll();
        }
    }

    public UnicastSubject(int i10, boolean z10) {
        this.f61423b = new a<>(qi.a.f(i10, "capacityHint"));
        this.f61425d = new AtomicReference<>();
        this.f61426e = z10;
        this.f61424c = new AtomicReference<>();
        this.f61430i = new AtomicBoolean();
        this.f61431j = new UnicastQueueDisposable();
    }

    public static <T> UnicastSubject<T> c() {
        return new UnicastSubject<>(k.bufferSize(), true);
    }

    public static <T> UnicastSubject<T> d(int i10) {
        return new UnicastSubject<>(i10, true);
    }

    public static <T> UnicastSubject<T> e(int i10, Runnable runnable) {
        return new UnicastSubject<>(i10, runnable, true);
    }

    public void f() {
        Runnable runnable = this.f61425d.get();
        if (runnable == null || !e.a(this.f61425d, runnable, null)) {
            return;
        }
        runnable.run();
    }

    public void g() {
        if (this.f61431j.getAndIncrement() != 0) {
            return;
        }
        r<? super T> rVar = this.f61424c.get();
        int iAddAndGet = 1;
        while (rVar == null) {
            iAddAndGet = this.f61431j.addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            } else {
                rVar = this.f61424c.get();
            }
        }
        if (this.f61432k) {
            h(rVar);
        } else {
            i(rVar);
        }
    }

    public void h(r<? super T> rVar) {
        a<T> aVar = this.f61423b;
        int iAddAndGet = 1;
        boolean z10 = !this.f61426e;
        while (!this.f61427f) {
            boolean z11 = this.f61428g;
            if (z10 && z11 && k(aVar, rVar)) {
                return;
            }
            rVar.onNext(null);
            if (z11) {
                j(rVar);
                return;
            } else {
                iAddAndGet = this.f61431j.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
        this.f61424c.lazySet(null);
        aVar.clear();
    }

    public void i(r<? super T> rVar) {
        a<T> aVar = this.f61423b;
        boolean z10 = !this.f61426e;
        boolean z11 = true;
        int iAddAndGet = 1;
        while (!this.f61427f) {
            boolean z12 = this.f61428g;
            T tPoll = this.f61423b.poll();
            boolean z13 = tPoll == null;
            if (z12) {
                if (z10 && z11) {
                    if (k(aVar, rVar)) {
                        return;
                    } else {
                        z11 = false;
                    }
                }
                if (z13) {
                    j(rVar);
                    return;
                }
            }
            if (z13) {
                iAddAndGet = this.f61431j.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                rVar.onNext(tPoll);
            }
        }
        this.f61424c.lazySet(null);
        aVar.clear();
    }

    public void j(r<? super T> rVar) {
        this.f61424c.lazySet(null);
        Throwable th2 = this.f61429h;
        if (th2 != null) {
            rVar.onError(th2);
        } else {
            rVar.onComplete();
        }
    }

    public boolean k(h<T> hVar, r<? super T> rVar) {
        Throwable th2 = this.f61429h;
        if (th2 == null) {
            return false;
        }
        this.f61424c.lazySet(null);
        hVar.clear();
        rVar.onError(th2);
        return true;
    }

    @Override // ii.r
    public void onComplete() {
        if (this.f61428g || this.f61427f) {
            return;
        }
        this.f61428g = true;
        f();
        g();
    }

    @Override // ii.r
    public void onError(Throwable th2) {
        qi.a.e(th2, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f61428g || this.f61427f) {
            ej.a.s(th2);
            return;
        }
        this.f61429h = th2;
        this.f61428g = true;
        f();
        g();
    }

    @Override // ii.r
    public void onNext(T t10) {
        qi.a.e(t10, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f61428g || this.f61427f) {
            return;
        }
        this.f61423b.offer(t10);
        g();
    }

    @Override // ii.r
    public void onSubscribe(b bVar) {
        if (this.f61428g || this.f61427f) {
            bVar.dispose();
        }
    }

    @Override // ii.k
    public void subscribeActual(r<? super T> rVar) {
        if (this.f61430i.get() || !this.f61430i.compareAndSet(false, true)) {
            EmptyDisposable.error(new IllegalStateException("Only a single observer allowed."), rVar);
            return;
        }
        rVar.onSubscribe(this.f61431j);
        this.f61424c.lazySet(rVar);
        if (this.f61427f) {
            this.f61424c.lazySet(null);
        } else {
            g();
        }
    }

    public UnicastSubject(int i10, Runnable runnable, boolean z10) {
        this.f61423b = new a<>(qi.a.f(i10, "capacityHint"));
        this.f61425d = new AtomicReference<>(qi.a.e(runnable, "onTerminate"));
        this.f61426e = z10;
        this.f61424c = new AtomicReference<>();
        this.f61430i = new AtomicBoolean();
        this.f61431j = new UnicastQueueDisposable();
    }
}
