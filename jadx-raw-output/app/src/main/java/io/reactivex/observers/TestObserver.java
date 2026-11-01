package io.reactivex.observers;

import androidx.lifecycle.e;
import dj.a;
import ii.b;
import ii.h;
import ii.r;
import ii.u;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import ri.c;

/* JADX INFO: loaded from: classes7.dex */
public class TestObserver<T> extends a<T, TestObserver<T>> implements r<T>, h<T>, u<T>, b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final r<? super T> f61404j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicReference<mi.b> f61405k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c<T> f61406l;

    public enum EmptyObserver implements r<Object> {
        INSTANCE;

        @Override // ii.r
        public void onComplete() {
        }

        @Override // ii.r
        public void onError(Throwable th2) {
        }

        @Override // ii.r
        public void onNext(Object obj) {
        }

        @Override // ii.r
        public void onSubscribe(mi.b bVar) {
        }
    }

    public TestObserver() {
        this(EmptyObserver.INSTANCE);
    }

    public TestObserver(r<? super T> rVar) {
        this.f61405k = new AtomicReference<>();
        this.f61404j = rVar;
    }

    @Override // mi.b
    public final void dispose() {
        DisposableHelper.dispose(this.f61405k);
    }

    @Override // mi.b
    public final boolean isDisposed() {
        return DisposableHelper.isDisposed(this.f61405k.get());
    }

    @Override // ii.r
    public void onComplete() {
        if (!this.f52119g) {
            this.f52119g = true;
            if (this.f61405k.get() == null) {
                this.f52116d.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        try {
            this.f52118f = Thread.currentThread();
            this.f52117e++;
            this.f61404j.onComplete();
        } finally {
            this.f52114b.countDown();
        }
    }

    @Override // ii.r
    public void onError(Throwable th2) {
        if (!this.f52119g) {
            this.f52119g = true;
            if (this.f61405k.get() == null) {
                this.f52116d.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        try {
            this.f52118f = Thread.currentThread();
            if (th2 == null) {
                this.f52116d.add(new NullPointerException("onError received a null Throwable"));
            } else {
                this.f52116d.add(th2);
            }
            this.f61404j.onError(th2);
        } finally {
            this.f52114b.countDown();
        }
    }

    @Override // ii.r
    public void onNext(T t10) {
        if (!this.f52119g) {
            this.f52119g = true;
            if (this.f61405k.get() == null) {
                this.f52116d.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        this.f52118f = Thread.currentThread();
        if (this.f52121i != 2) {
            this.f52115c.add(t10);
            if (t10 == null) {
                this.f52116d.add(new NullPointerException("onNext received a null value"));
            }
            this.f61404j.onNext(t10);
            return;
        }
        while (true) {
            try {
                T tPoll = this.f61406l.poll();
                if (tPoll == null) {
                    return;
                } else {
                    this.f52115c.add(tPoll);
                }
            } catch (Throwable th2) {
                this.f52116d.add(th2);
                this.f61406l.dispose();
                return;
            }
        }
    }

    @Override // ii.r
    public void onSubscribe(mi.b bVar) {
        this.f52118f = Thread.currentThread();
        if (bVar == null) {
            this.f52116d.add(new NullPointerException("onSubscribe received a null Subscription"));
            return;
        }
        if (!e.a(this.f61405k, null, bVar)) {
            bVar.dispose();
            if (this.f61405k.get() != DisposableHelper.DISPOSED) {
                this.f52116d.add(new IllegalStateException("onSubscribe received multiple subscriptions: " + bVar));
                return;
            }
            return;
        }
        int i10 = this.f52120h;
        if (i10 != 0 && (bVar instanceof c)) {
            c<T> cVar = (c) bVar;
            this.f61406l = cVar;
            int iRequestFusion = cVar.requestFusion(i10);
            this.f52121i = iRequestFusion;
            if (iRequestFusion == 1) {
                this.f52119g = true;
                this.f52118f = Thread.currentThread();
                while (true) {
                    try {
                        T tPoll = this.f61406l.poll();
                        if (tPoll != null) {
                            this.f52115c.add(tPoll);
                        } else {
                            this.f52117e++;
                            this.f61405k.lazySet(DisposableHelper.DISPOSED);
                            return;
                        }
                    } catch (Throwable th2) {
                        this.f52116d.add(th2);
                        return;
                    }
                }
            }
        }
        this.f61404j.onSubscribe(bVar);
    }

    @Override // ii.h
    public void onSuccess(T t10) {
        onNext(t10);
        onComplete();
    }
}
