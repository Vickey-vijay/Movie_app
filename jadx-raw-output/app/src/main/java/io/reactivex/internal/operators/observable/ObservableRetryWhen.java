package io.reactivex.internal.operators.observable;

import bj.f;
import hj.c;
import ii.k;
import ii.p;
import ii.r;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.subjects.PublishSubject;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import mi.b;
import oi.o;

/* JADX INFO: loaded from: classes6.dex */
public final class ObservableRetryWhen<T> extends xi.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o<? super k<Throwable>, ? extends p<?>> f61264c;

    public static final class RepeatWhenObserver<T> extends AtomicInteger implements r<T>, b {
        private static final long serialVersionUID = 802743776666017014L;
        public volatile boolean active;
        public final r<? super T> downstream;
        public final c<Throwable> signaller;
        public final p<T> source;
        public final AtomicInteger wip = new AtomicInteger();
        public final AtomicThrowable error = new AtomicThrowable();
        public final RepeatWhenObserver<T>.InnerRepeatObserver inner = new InnerRepeatObserver();
        public final AtomicReference<b> upstream = new AtomicReference<>();

        public final class InnerRepeatObserver extends AtomicReference<b> implements r<Object> {
            private static final long serialVersionUID = 3254781284376480842L;

            public InnerRepeatObserver() {
            }

            @Override // ii.r
            public void onComplete() {
                RepeatWhenObserver.this.innerComplete();
            }

            @Override // ii.r
            public void onError(Throwable th2) {
                RepeatWhenObserver.this.innerError(th2);
            }

            @Override // ii.r
            public void onNext(Object obj) {
                RepeatWhenObserver.this.innerNext();
            }

            @Override // ii.r
            public void onSubscribe(b bVar) {
                DisposableHelper.setOnce(this, bVar);
            }
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            this.active = false;
            this.signaller.onNext(th2);
        }

        @Override // mi.b
        public void dispose() {
            DisposableHelper.dispose(this.upstream);
            DisposableHelper.dispose(this.inner);
        }

        public void innerComplete() {
            DisposableHelper.dispose(this.upstream);
            f.a(this.downstream, this, this.error);
        }

        public void innerError(Throwable th2) {
            DisposableHelper.dispose(this.upstream);
            f.c(this.downstream, th2, this, this.error);
        }

        @Override // mi.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(this.upstream.get());
        }

        @Override // ii.r
        public void onComplete() {
            DisposableHelper.dispose(this.inner);
            f.a(this.downstream, this, this.error);
        }

        @Override // ii.r
        public void onNext(T t10) {
            f.e(this.downstream, t10, this, this.error);
        }

        @Override // ii.r
        public void onSubscribe(b bVar) {
            DisposableHelper.replace(this.upstream, bVar);
        }

        public void subscribeNext() {
            if (this.wip.getAndIncrement() == 0) {
                while (!isDisposed()) {
                    if (!this.active) {
                        this.active = true;
                        this.source.subscribe(this);
                    }
                    if (this.wip.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        public RepeatWhenObserver(r<? super T> rVar, c<Throwable> cVar, p<T> pVar) {
            this.downstream = rVar;
            this.signaller = cVar;
            this.source = pVar;
        }

        public void innerNext() {
            subscribeNext();
        }
    }

    public ObservableRetryWhen(p<T> pVar, o<? super k<Throwable>, ? extends p<?>> oVar) {
        super(pVar);
        this.f61264c = oVar;
    }

    @Override // ii.k
    public void subscribeActual(r<? super T> rVar) {
        c<T> cVarB = PublishSubject.d().b();
        try {
            p pVar = (p) qi.a.e(this.f61264c.apply(cVarB), "The handler returned a null ObservableSource");
            RepeatWhenObserver repeatWhenObserver = new RepeatWhenObserver(rVar, cVarB, this.f74487b);
            rVar.onSubscribe(repeatWhenObserver);
            pVar.subscribe(repeatWhenObserver.inner);
            repeatWhenObserver.subscribeNext();
        } catch (Throwable th2) {
            ni.a.b(th2);
            EmptyDisposable.error(th2, rVar);
        }
    }
}
