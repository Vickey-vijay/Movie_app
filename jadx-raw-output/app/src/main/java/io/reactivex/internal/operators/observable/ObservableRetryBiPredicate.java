package io.reactivex.internal.operators.observable;

import ii.k;
import ii.p;
import ii.r;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicInteger;
import mi.b;
import oi.d;

/* JADX INFO: loaded from: classes7.dex */
public final class ObservableRetryBiPredicate<T> extends xi.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d<? super Integer, ? super Throwable> f61261c;

    public static final class RetryBiObserver<T> extends AtomicInteger implements r<T> {
        private static final long serialVersionUID = -7098360935104053232L;
        public final r<? super T> downstream;
        public final d<? super Integer, ? super Throwable> predicate;
        public int retries;
        public final p<? extends T> source;
        public final SequentialDisposable upstream;

        @Override // ii.r
        public void onError(Throwable th2) {
            try {
                d<? super Integer, ? super Throwable> dVar = this.predicate;
                int i10 = this.retries + 1;
                this.retries = i10;
                if (dVar.test(Integer.valueOf(i10), th2)) {
                    subscribeNext();
                } else {
                    this.downstream.onError(th2);
                }
            } catch (Throwable th3) {
                ni.a.b(th3);
                this.downstream.onError(new CompositeException(th2, th3));
            }
        }

        @Override // ii.r
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // ii.r
        public void onNext(T t10) {
            this.downstream.onNext(t10);
        }

        @Override // ii.r
        public void onSubscribe(b bVar) {
            this.upstream.update(bVar);
        }

        public RetryBiObserver(r<? super T> rVar, d<? super Integer, ? super Throwable> dVar, SequentialDisposable sequentialDisposable, p<? extends T> pVar) {
            this.downstream = rVar;
            this.upstream = sequentialDisposable;
            this.source = pVar;
            this.predicate = dVar;
        }

        public void subscribeNext() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                while (!this.upstream.isDisposed()) {
                    this.source.subscribe(this);
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }
    }

    @Override // ii.k
    public void subscribeActual(r<? super T> rVar) {
        SequentialDisposable sequentialDisposable = new SequentialDisposable();
        rVar.onSubscribe(sequentialDisposable);
        new RetryBiObserver(rVar, this.f61261c, sequentialDisposable, this.f74487b).subscribeNext();
    }

    public ObservableRetryBiPredicate(k<T> kVar, d<? super Integer, ? super Throwable> dVar) {
        super(kVar);
        this.f61261c = dVar;
    }
}
